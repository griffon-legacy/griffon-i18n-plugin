/*
 * Copyright 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import griffon.core.GriffonApplication
import griffon.plugins.i18n.DelegatingMessageSource
import griffon.plugins.i18n.ExtendedResourceBundleMessageSource
import griffon.plugins.i18n.MessageSourceHolder

/**
 * @author Andres Almiray
 * @author Alexander Klein
 */
class I18nGriffonAddon {
    private static final String DEFAULT_I18N_FILE = 'messages'
    private static final String PROVIDER_NAME = 'i18n'

    void addonInit(GriffonApplication app) {
        List<String> basenames = app.config.i18n?.basenames ?: [DEFAULT_I18N_FILE]
        if (!basenames.contains(DEFAULT_I18N_FILE)) basenames = [DEFAULT_I18N_FILE] + basenames
        org.springframework.context.MessageSource messageSource = new ExtendedResourceBundleMessageSource()
        messageSource.basenames = basenames as String[]
        MessageSourceHolder.instance.registerMessageSource(PROVIDER_NAME, new DelegatingMessageSource(messageSource))
    }
}

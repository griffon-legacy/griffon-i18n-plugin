/*
 * Copyright 2010-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class I18nGriffonPlugin {
    // the plugin version
    def version = '0.5'
    // the version or versions of Griffon the plugin is designed for
    def griffonVersion = '0.9.5-rc2 > *'
    // the other plugins this plugin depends on
    Map dependsOn = ['i18n-support': '0.1']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = []
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-i18n-plugin'

    List authors = [
            [
                    name: 'Andres Almiray',
                    email: 'aalmiray@yahoo.com'
            ],
            [
                    name: 'Alexander Klein',
                    email: 'info@aklein.org'
            ]
    ]
    def title = 'I18n support based on Spring'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    def description = '''
**i18n** provides internationalization support using Spring's MessageSource.

This plugin provides an implementation of `i18n-support`. <br/>
The used implementation can be configured with the configuration key `i18n.provider`. <br/>
The key for this provider is `i18n`.

Usage
-----
This implementation does not support ExtendedMessageSource, so args may not be a Map. <br/>
Aswell this implementation does not support GString-like replacements. <br/>
For more info's see the documentation of i18n-support.

Configuration
-------------
    i18n.basenames = ['messages']
'''
}

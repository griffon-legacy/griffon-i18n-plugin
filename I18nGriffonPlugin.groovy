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
    def version = '0.5.1'
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
Provides internationalization support using [Spring's MessageSource][1].

This plugin delivers a provider for the [i18n-support][2] plugin.

Usage
-----

The i18n provider delivered by this plugin suports the following methods

    String getMessage(String key) throws NoSuchMessageException
    String getMessage(String key, Locale locale) throws NoSuchMessageException
    String getMessage(String key, Object[] args) throws NoSuchMessageException
    String getMessage(String key, Object[] args, Locale locale) throws NoSuchMessageException
    String getMessage(String key, List<?> args) throws NoSuchMessageException
    String getMessage(String key, List<?> args, Locale locale) throws NoSuchMessageException
    String getMessage(String key, String defaultMessage)
    String getMessage(String key, String defaultMessage, Locale locale)
    String getMessage(String key, Object[] args, String defaultMessage)
    String getMessage(String key, Object[] args, String defaultMessage, Locale locale)
    String getMessage(String key, List<?> args, String defaultMessage)
    String getMessage(String key, List<?> args, String defaultMessage, Locale locale)

It however does not support additional methods exposed by `griffon.plugins.i18nExtendedMessageSource`, which means that
the `args` parameter sent to the various forms of the `getMessage()` method cannot be a Map. Additionally, GString-like
replacements, like the ones found in the base [i18n-support][2] provider, are not supported.

For more information see the documentation of [i18n-support][2] plugin.

### API Calls

From any object that has access to the application instance

    app.getMessage('some.message.code')
    app.messageSource.getMessage('some.message.code')
    app.i18n.getMessage('some.message.code')

From Java code

    import griffon.plugins.i18n.MessageSourceHolder
    MessageSourceHolder.getMessageSource().getMessage("some.message.code");

Configuration
-------------

Enabling the i18n provider delivered by this plugin requires the application to have the following settings in `Config.groovy`

    i18n.provider = 'i18n'
    i18n.basenames = ['messages']

The key for this provider is `i18n`.

You may configure additional properties files, for example assuming you have the following files

    griffon-app/conf/i18n/messages.properties
    griffon-app/conf/i18n/base.properties
    griffon-app/conf/i18n/extended.properties

You'll configure them in `Config.groovy` with this setting

    i18n.basenames = ['messages', 'base', 'extended']

The definition order is important as messages will be searched from first to last when mutiple files have been declared. The first 
file to return a non-null value for the requested message code will be the winner.

[1]: http://static.springsource.org/spring/docs/3.1.x/javadoc-api/org/springframework/context/MessageSource.html
[2]: /plugin/i18n-support
'''
}

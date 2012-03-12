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

History
-------
| Version | Comment                             |
|---------|-------------------------------------|
| 0.5     | switched to i18n-support dependency |
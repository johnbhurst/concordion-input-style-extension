[![Build Status](https://travis-ci.org/concordion/concordion-input-style-extension.svg?branch=master)](https://travis-ci.org/concordion/concordion-input-style-extension)

This [Concordion](http://www.concordion.org) extension adds CSS styling for input elements in the Concordion output. The styling is added as an 'inputstyle' class on data contained in elements with c:set="" attributes.

# Installation
The extension is available from [Maven Central](http://search.maven.org/#artifactdetails%7Corg.concordion%7Cconcordion-input-style-extension%7C0.1%7Cjar).</a>

# Usage

To add the extension with no namespace declarations, either annotate the fixture class with:

```java
    @Extensions(InputStyleExtension.class)
```

or set the system property `concordion.extensions` to `org.concordion.ext.inputstyle.InputStyleExtension`

# Further info

* [Specification](http://concordion.github.io/concordion-input-style-extension/spec/spec/concordion/ext/inputstyle/InputStyle.html)
* [API](http://concordion.github.io/concordion-input-style-extension/api/index.html)

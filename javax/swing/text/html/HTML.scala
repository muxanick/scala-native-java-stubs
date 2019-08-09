package javax.swing.text.html

import java.lang.{Object, String}
import javax.swing.text.AttributeSet

// Constants used in the HTMLDocument.  These
// are basically tag and attribute definitions.
class HTML extends Object {
}

object HTML {
    @stub
    // Typesafe enumeration representing an HTML
    // attribute.
    def HTML.Attribute: class = ???

    @stub
    // Typesafe enumeration for an HTML tag.
    def HTML.Tag: class = ???

    @stub
    // Returns the set of HTML attributes recognized.
    def getAllAttributeKeys(): Array[HTML.Attribute] = ???

    @stub
    // Returns the set of actual HTML tags that
    // are recognized by the default HTML reader.
    def getAllTags(): Array[HTML.Tag] = ???

    @stub
    // Fetches an attribute constant for a well-known attribute name
    // (i.e.
    def getAttributeKey(attName: String): HTML.Attribute = ???

    @stub
    // Fetches an integer attribute value.
    def getIntegerAttributeValue(attr: AttributeSet, key: HTML.Attribute, def: Int): Int = ???
}

package javax.swing.text.html

import java.lang.{Object, String}
import javax.swing.text.AttributeSet

/** Constants used in the HTMLDocument.  These
 *  are basically tag and attribute definitions.
 */
class HTML extends Object {
}

object HTML {
    /** Typesafe enumeration representing an HTML
     *  attribute.
     */
    @stub
    object Attribute extends HTML.Attribute

    /** Typesafe enumeration for an HTML tag. */
    @stub
    object Tag extends HTML.Tag

    /** Returns the set of HTML attributes recognized. */
    @stub
    def getAllAttributeKeys(): Array[HTML.Attribute] = ???

    /** Returns the set of actual HTML tags that
     *  are recognized by the default HTML reader.
     */
    @stub
    def getAllTags(): Array[HTML.Tag] = ???

    /** Fetches an attribute constant for a well-known attribute name
     *  (i.e.
     */
    @stub
    def getAttributeKey(attName: String): HTML.Attribute = ???

    /** Fetches an integer attribute value. */
    @stub
    def getIntegerAttributeValue(attr: AttributeSet, key: HTML.Attribute, def: Int): Int = ???
}

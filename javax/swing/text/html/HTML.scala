package javax.swing.text.html

import java.lang.{Object, String}
import javax.swing.text.AttributeSet
import scala.scalanative.annotation.stub

/** Constants used in the HTMLDocument.  These
 *  are basically tag and attribute definitions.
 */
class HTML extends Object {

    /**  */
    @stub
    def this() = ???
}

object HTML {
    /** Typesafe enumeration representing an HTML
     *  attribute.
     */
    type Attribute = HTML_Attribute

    /** Typesafe enumeration for an HTML tag. */
    type Tag = HTML_Tag

    /**  */
    type UnknownTag = HTML_UnknownTag

    /**  */
    @stub
    val NULL_ATTRIBUTE_VALUE: String = ???

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

    /** Fetches a tag constant for a well-known tag name (i.e. */
    @stub
    def getTag(tagName: String): HTML.Tag = ???
}

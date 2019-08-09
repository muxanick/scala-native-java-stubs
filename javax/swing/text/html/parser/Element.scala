package javax.swing.text.html.parser

import java.io.Serializable
import java.lang.{Object, String}
import java.util.BitSet
import scala.scalanative.annotation.stub

/** An element as described in a DTD using the ELEMENT construct.
 *  This is essential the description of a tag. It describes the
 *  type, content model, attributes, attribute types etc. It is used
 *  to correctly parse a document by the Parser.
 */
final class Element extends Object with DTDConstants with Serializable {

    /**  */
    @stub
    val atts: AttributeList = ???

    /**  */
    @stub
    val content: ContentModel = ???

    /** A field to store user data. */
    @stub
    val data: Object = ???

    /**  */
    @stub
    val exclusions: BitSet = ???

    /**  */
    @stub
    val inclusions: BitSet = ???

    /**  */
    @stub
    val index: Int = ???

    /**  */
    @stub
    val name: String = ???

    /**  */
    @stub
    val oEnd: Boolean = ???

    /**  */
    @stub
    val oStart: Boolean = ???

    /**  */
    @stub
    val type: Int = ???

    /** Get an attribute by name. */
    @stub
    def getAttribute(name: String): AttributeList = ???

    /** Get an attribute by value. */
    @stub
    def getAttributeByValue(name: String): AttributeList = ???

    /** Get the attributes. */
    @stub
    def getAttributes(): AttributeList = ???

    /** Get content model */
    @stub
    def getContent(): ContentModel = ???

    /** Get index. */
    @stub
    def getIndex(): Int = ???

    /** Get the name of the element. */
    @stub
    def getName(): String = ???

    /** Get type. */
    @stub
    def getType(): Int = ???

    /** Check if empty */
    @stub
    def isEmpty(): Boolean = ???

    /** Return true if the end tag can be omitted. */
    @stub
    def omitEnd(): Boolean = ???

    /** Return true if the start tag can be omitted. */
    @stub
    def omitStart(): Boolean = ???

    /** Convert to a string. */
    @stub
    def toString(): String = ???
}

object Element {
    /**  */
    @stub
    def name2type(nm: String): Int = ???
}

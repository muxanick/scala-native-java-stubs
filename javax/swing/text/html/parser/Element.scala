package javax.swing.text.html.parser

import java.io.Serializable
import java.lang.{Object, String}
import java.util.BitSet

// An element as described in a DTD using the ELEMENT construct.
// This is essential the description of a tag. It describes the
// type, content model, attributes, attribute types etc. It is used
// to correctly parse a document by the Parser.
final class Element extends Object with DTDConstants, with Serializable {

    @stub
    // 
    def atts: AttributeList = ???

    @stub
    // 
    def content: ContentModel = ???

    @stub
    // A field to store user data.
    def data: Object = ???

    @stub
    // 
    def exclusions: BitSet = ???

    @stub
    // 
    def inclusions: BitSet = ???

    @stub
    // 
    def index: Int = ???

    @stub
    // 
    def name: String = ???

    @stub
    // 
    def oEnd: Boolean = ???

    @stub
    // 
    def oStart: Boolean = ???

    @stub
    // Get an attribute by name.
    def getAttribute(name: String): AttributeList = ???

    @stub
    // Get an attribute by value.
    def getAttributeByValue(name: String): AttributeList = ???

    @stub
    // Get the attributes.
    def getAttributes(): AttributeList = ???

    @stub
    // Get content model
    def getContent(): ContentModel = ???

    @stub
    // Get index.
    def getIndex(): Int = ???

    @stub
    // Get the name of the element.
    def getName(): String = ???

    @stub
    // Get type.
    def getType(): Int = ???

    @stub
    // Check if empty
    def isEmpty(): Boolean = ???

    @stub
    // Return true if the end tag can be omitted.
    def omitEnd(): Boolean = ???

    @stub
    // Return true if the start tag can be omitted.
    def omitStart(): Boolean = ???
}

object Element {
    @stub
    // 
    def name2type(nm: String): Int = ???
}

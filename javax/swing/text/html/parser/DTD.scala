package javax.swing.text.html.parser

import java.io.DataInputStream
import java.lang.{Object, String}
import java.util.{BitSet, Hashtable, Vector}

// The representation of an SGML DTD.  DTD describes a document
// syntax and is used in parsing of HTML documents.  It contains
// a list of elements and their attributes as well as a list of
// entities defined in the DTD.
class DTD extends Object with DTDConstants {

    @stub
    // 
    def applet: Element = ???

    @stub
    // 
    def base: Element = ???

    @stub
    // 
    def body: Element = ???

    @stub
    // 
    def elementHash: Hashtable[String, Element] = ???

    @stub
    // 
    def elements: Vector[Element] = ???

    @stub
    // 
    def entityHash: Hashtable[Object, Entity] = ???

    @stub
    // 
    def head: Element = ???

    @stub
    // 
    def html: Element = ???

    @stub
    // 
    def isindex: Element = ???

    @stub
    // 
    def meta: Element = ???

    @stub
    // 
    def name: String = ???

    @stub
    // 
    def p: Element = ???

    @stub
    // 
    def param: Element = ???

    @stub
    // 
    def pcdata: Element = ???

    @stub
    // Creates and returns an AttributeList.
    protected def defAttributeList(name: String, type: Int, modifier: Int, value: String, values: String, atts: AttributeList): AttributeList = ???

    @stub
    // Creates and returns a new content model.
    protected def defContentModel(type: Int, obj: Object, next: ContentModel): ContentModel = ???

    @stub
    // Creates and returns an Element.
    protected def defElement(name: String, type: Int, omitStart: Boolean, omitEnd: Boolean, content: ContentModel, exclusions: Array[String], inclusions: Array[String], atts: AttributeList): Element = ???

    @stub
    // Creates and returns a character Entity.
    def defEntity(name: String, type: Int, ch: Int): Entity = ???

    @stub
    // Creates and returns an Entity.
    protected def defEntity(name: String, type: Int, str: String): Entity = ???

    @stub
    // Defines attributes for an Element.
    def defineAttributes(name: String, atts: AttributeList): Unit = ???

    @stub
    // Returns the Element which matches the
    // specified parameters.
    def defineElement(name: String, type: Int, omitStart: Boolean, omitEnd: Boolean, content: ContentModel, exclusions: BitSet, inclusions: BitSet, atts: AttributeList): Element = ???

    @stub
    // Defines an entity.
    def defineEntity(name: String, type: Int, data: Array[Char]): Entity = ???

    @stub
    // Gets an element by index.
    def getElement(index: Int): Element = ???

    @stub
    // Gets an element by name.
    def getElement(name: String): Element = ???

    @stub
    // Gets a character entity.
    def getEntity(ch: Int): Entity = ???

    @stub
    // Gets an entity by name.
    def getEntity(name: String): Entity = ???

    @stub
    // Gets the name of the DTD.
    def getName(): String = ???

    @stub
    // Recreates a DTD from an archived format.
    def read(in: DataInputStream): Unit = ???
}

object DTD {
    @stub
    // 
    def FILE_VERSION: Int = ???

    @stub
    // Returns a DTD with the specified name.
    def getDTD(name: String): DTD = ???

    @stub
    // 
    def putDTDHash(name: String, dtd: DTD): Unit = ???
}

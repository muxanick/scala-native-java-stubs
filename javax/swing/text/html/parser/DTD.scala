package javax.swing.text.html.parser

import java.io.DataInputStream
import java.lang.{Object, String}
import java.util.{BitSet, Hashtable, Vector}

/** The representation of an SGML DTD.  DTD describes a document
 *  syntax and is used in parsing of HTML documents.  It contains
 *  a list of elements and their attributes as well as a list of
 *  entities defined in the DTD.
 */
class DTD extends Object with DTDConstants {

    /**  */
    @stub
    val applet: Element = ???

    /**  */
    @stub
    val base: Element = ???

    /**  */
    @stub
    val body: Element = ???

    /**  */
    @stub
    val elementHash: Hashtable[String, Element] = ???

    /**  */
    @stub
    val elements: Vector[Element] = ???

    /**  */
    @stub
    val entityHash: Hashtable[Object, Entity] = ???

    /**  */
    @stub
    val head: Element = ???

    /**  */
    @stub
    val html: Element = ???

    /**  */
    @stub
    val isindex: Element = ???

    /**  */
    @stub
    val meta: Element = ???

    /**  */
    @stub
    val name: String = ???

    /**  */
    @stub
    val p: Element = ???

    /**  */
    @stub
    val param: Element = ???

    /**  */
    @stub
    val pcdata: Element = ???

    /** Creates and returns an AttributeList. */
    @stub
    protected def defAttributeList(name: String, type: Int, modifier: Int, value: String, values: String, atts: AttributeList): AttributeList = ???

    /** Creates and returns a new content model. */
    @stub
    protected def defContentModel(type: Int, obj: Object, next: ContentModel): ContentModel = ???

    /** Creates and returns an Element. */
    @stub
    protected def defElement(name: String, type: Int, omitStart: Boolean, omitEnd: Boolean, content: ContentModel, exclusions: Array[String], inclusions: Array[String], atts: AttributeList): Element = ???

    /** Creates and returns a character Entity. */
    @stub
    def defEntity(name: String, type: Int, ch: Int): Entity = ???

    /** Creates and returns an Entity. */
    @stub
    protected def defEntity(name: String, type: Int, str: String): Entity = ???

    /** Defines attributes for an Element. */
    @stub
    def defineAttributes(name: String, atts: AttributeList): Unit = ???

    /** Returns the Element which matches the
     *  specified parameters.
     */
    @stub
    def defineElement(name: String, type: Int, omitStart: Boolean, omitEnd: Boolean, content: ContentModel, exclusions: BitSet, inclusions: BitSet, atts: AttributeList): Element = ???

    /** Defines an entity. */
    @stub
    def defineEntity(name: String, type: Int, data: Array[Char]): Entity = ???

    /** Gets an element by index. */
    @stub
    def getElement(index: Int): Element = ???

    /** Gets an element by name. */
    @stub
    def getElement(name: String): Element = ???

    /** Gets a character entity. */
    @stub
    def getEntity(ch: Int): Entity = ???

    /** Gets an entity by name. */
    @stub
    def getEntity(name: String): Entity = ???

    /** Gets the name of the DTD. */
    @stub
    def getName(): String = ???

    /** Recreates a DTD from an archived format. */
    @stub
    def read(in: DataInputStream): Unit = ???
}

object DTD {
    /**  */
    @stub
    val FILE_VERSION: Int = ???

    /** Returns a DTD with the specified name. */
    @stub
    def getDTD(name: String): DTD = ???

    /**  */
    @stub
    def putDTDHash(name: String, dtd: DTD): Unit = ???
}

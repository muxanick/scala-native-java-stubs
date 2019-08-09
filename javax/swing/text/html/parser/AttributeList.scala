package javax.swing.text.html.parser

import java.io.Serializable
import java.lang.{Object, String}
import java.util.{Enumeration, Vector}
import scala.scalanative.annotation.stub

/** This class defines the attributes of an SGML element
 *  as described in a DTD using the ATTLIST construct.
 *  An AttributeList can be obtained from the Element
 *  class using the getAttributes() method.
 *  
 *  It is actually an element in a linked list. Use the
 *  getNext() method repeatedly to enumerate all the attributes
 *  of an element.
 */
final class AttributeList extends Object with DTDConstants with Serializable {

    /** Create an attribute list element. */
    @stub
    def this(name: String) = ???

    /** Create an attribute list element. */
    @stub
    def this(name: String, type: Int, modifier: Int, value: String, values: Vector[_], next: AttributeList) = ???

    /**  */
    @stub
    val modifier: Int = ???

    /**  */
    @stub
    val name: String = ???

    /**  */
    @stub
    val next: AttributeList = ???

    /**  */
    @stub
    val type: Int = ???

    /**  */
    @stub
    val value: String = ???

    /**  */
    @stub
    val values: Vector[_] = ???

    /**  */
    @stub
    def getModifier(): Int = ???

    /**  */
    @stub
    def getName(): String = ???

    /**  */
    @stub
    def getNext(): AttributeList = ???

    /**  */
    @stub
    def getType(): Int = ???

    /**  */
    @stub
    def getValue(): String = ???

    /**  */
    @stub
    def getValues(): Enumeration[_] = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}

object AttributeList {
    /**  */
    @stub
    def name2type(nm: String): Int = ???

    /**  */
    @stub
    def type2name(tp: Int): String = ???
}

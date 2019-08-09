package javax.swing.text.html.parser

import java.io.Serializable
import java.lang.{Object, String}
import java.util.Enumeration

// This class defines the attributes of an SGML element
// as described in a DTD using the ATTLIST construct.
// An AttributeList can be obtained from the Element
// class using the getAttributes() method.
// 
// It is actually an element in a linked list. Use the
// getNext() method repeatedly to enumerate all the attributes
// of an element.
final class AttributeList extends Object with DTDConstants, with Serializable {

    @stub
    // Create an attribute list element.
    def this(name: String) = ???

    @stub
    // 
    def modifier: Int = ???

    @stub
    // 
    def name: String = ???

    @stub
    // 
    def next: AttributeList = ???

    @stub
    // 
    def type: Int = ???

    @stub
    // 
    def value: String = ???

    @stub
    // 
    def getModifier(): Int = ???

    @stub
    // 
    def getName(): String = ???

    @stub
    // 
    def getNext(): AttributeList = ???

    @stub
    // 
    def getType(): Int = ???

    @stub
    // 
    def getValue(): String = ???

    @stub
    // 
    def getValues(): Enumeration[_] = ???

    @stub
    // Returns a string representation of the object.
    def toString(): String = ???
}

object AttributeList {
    @stub
    // 
    def name2type(nm: String): Int = ???
}

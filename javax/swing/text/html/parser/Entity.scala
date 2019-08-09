package javax.swing.text.html.parser

import java.lang.{Object, String}

// An entity is described in a DTD using the ENTITY construct.
// It defines the type and value of the the entity.
final class Entity extends Object with DTDConstants {

    @stub
    // 
    def data: Array[Char] = ???

    @stub
    // 
    def name: String = ???

    @stub
    // Returns the data.
    def getData(): Array[Char] = ???

    @stub
    // Gets the name of the entity.
    def getName(): String = ???

    @stub
    // Returns the data as a String.
    def getString(): String = ???

    @stub
    // Gets the type of the entity.
    def getType(): Int = ???

    @stub
    // Returns true if it is a general entity.
    def isGeneral(): Boolean = ???

    @stub
    // Returns true if it is a parameter entity.
    def isParameter(): Boolean = ???
}

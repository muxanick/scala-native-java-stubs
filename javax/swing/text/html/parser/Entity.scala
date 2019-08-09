package javax.swing.text.html.parser

import java.lang.{Object, String}

/** An entity is described in a DTD using the ENTITY construct.
 *  It defines the type and value of the the entity.
 */
final class Entity extends Object with DTDConstants {

    /**  */
    @stub
    val data: Array[Char] = ???

    /**  */
    @stub
    val name: String = ???

    /** Returns the data. */
    @stub
    def getData(): Array[Char] = ???

    /** Gets the name of the entity. */
    @stub
    def getName(): String = ???

    /** Returns the data as a String. */
    @stub
    def getString(): String = ???

    /** Gets the type of the entity. */
    @stub
    def getType(): Int = ???

    /** Returns true if it is a general entity. */
    @stub
    def isGeneral(): Boolean = ???

    /** Returns true if it is a parameter entity. */
    @stub
    def isParameter(): Boolean = ???
}

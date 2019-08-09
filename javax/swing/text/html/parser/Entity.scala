package javax.swing.text.html.parser

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** An entity is described in a DTD using the ENTITY construct.
 *  It defines the type and value of the the entity.
 */
final class Entity extends Object with DTDConstants {

    /** Creates an entity. */
    @stub
    def this(name: String, type: Int, data: Array[Char]) = ???

    /**  */
    @stub
    val data: Array[Char] = ???

    /**  */
    @stub
    val name: String = ???

    /**  */
    @stub
    val type: Int = ???

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

object Entity {
    /** Converts nm string to the corresponding
     *  entity type.
     */
    @stub
    def name2type(nm: String): Int = ???
}

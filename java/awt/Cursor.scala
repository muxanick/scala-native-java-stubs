package java.awt

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A class to encapsulate the bitmap representation of the mouse cursor. */
class Cursor extends Object with Serializable {

    /** Creates a new cursor object with the specified type. */
    @stub
    def this(type: Int) = ???

    /** Creates a new custom cursor object with the specified name. */
    @stub
    protected def this(name: String) = ???

    /** The user-visible name of the cursor. */
    @stub
    protected val name: String = ???

    /** Returns the name of this cursor. */
    @stub
    def getName(): String = ???

    /** Returns the type for this cursor. */
    @stub
    def getType(): Int = ???

    /** Returns a string representation of this cursor. */
    @stub
    def toString(): String = ???
}

object Cursor {
    /** The crosshair cursor type. */
    @stub
    val CROSSHAIR_CURSOR: Int = ???

    /** The type associated with all custom cursors. */
    @stub
    val CUSTOM_CURSOR: Int = ???

    /** The default cursor type (gets set if no cursor is defined). */
    @stub
    val DEFAULT_CURSOR: Int = ???

    /** The east-resize cursor type. */
    @stub
    val E_RESIZE_CURSOR: Int = ???

    /** The hand cursor type. */
    @stub
    val HAND_CURSOR: Int = ???

    /** The move cursor type. */
    @stub
    val MOVE_CURSOR: Int = ???

    /** The north-resize cursor type. */
    @stub
    val N_RESIZE_CURSOR: Int = ???

    /** The north-east-resize cursor type. */
    @stub
    val NE_RESIZE_CURSOR: Int = ???

    /** The north-west-resize cursor type. */
    @stub
    val NW_RESIZE_CURSOR: Int = ???

    /** Deprecated. 
     * As of JDK version 1.7, the getPredefinedCursor(int)
     *  method should be used instead.
     * 
     */
    @stub
    protected val predefined: Array[Cursor] = ???

    /** The south-resize cursor type. */
    @stub
    val S_RESIZE_CURSOR: Int = ???

    /** The south-east-resize cursor type. */
    @stub
    val SE_RESIZE_CURSOR: Int = ???

    /** The south-west-resize cursor type. */
    @stub
    val SW_RESIZE_CURSOR: Int = ???

    /** The text cursor type. */
    @stub
    val TEXT_CURSOR: Int = ???

    /** The west-resize cursor type. */
    @stub
    val W_RESIZE_CURSOR: Int = ???

    /** The wait cursor type. */
    @stub
    val WAIT_CURSOR: Int = ???

    /** Return the system default cursor. */
    @stub
    def getDefaultCursor(): Cursor = ???

    /** Returns a cursor object with the specified predefined type. */
    @stub
    def getPredefinedCursor(type: Int): Cursor = ???

    /** Returns a system-specific custom cursor object matching the
     *  specified name.
     */
    @stub
    def getSystemCustomCursor(name: String): Cursor = ???
}

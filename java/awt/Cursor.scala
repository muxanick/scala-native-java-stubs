package java.awt

import java.io.Serializable
import java.lang.{Object, String}

// A class to encapsulate the bitmap representation of the mouse cursor.
class Cursor extends Object with Serializable {

    @stub
    // Creates a new cursor object with the specified type.
    def this(type: Int) = ???

    @stub
    // The user-visible name of the cursor.
    protected def name: String = ???

    @stub
    // Returns the name of this cursor.
    def getName(): String = ???

    @stub
    // Returns the type for this cursor.
    def getType(): Int = ???
}

object Cursor {
    @stub
    // The crosshair cursor type.
    def CROSSHAIR_CURSOR: Int = ???

    @stub
    // The type associated with all custom cursors.
    def CUSTOM_CURSOR: Int = ???

    @stub
    // The default cursor type (gets set if no cursor is defined).
    def DEFAULT_CURSOR: Int = ???

    @stub
    // The east-resize cursor type.
    def E_RESIZE_CURSOR: Int = ???

    @stub
    // The hand cursor type.
    def HAND_CURSOR: Int = ???

    @stub
    // The move cursor type.
    def MOVE_CURSOR: Int = ???

    @stub
    // The north-resize cursor type.
    def N_RESIZE_CURSOR: Int = ???

    @stub
    // The north-east-resize cursor type.
    def NE_RESIZE_CURSOR: Int = ???

    @stub
    // The north-west-resize cursor type.
    def NW_RESIZE_CURSOR: Int = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.7, the getPredefinedCursor(int)
    // method should be used instead.
    //
    protected def predefined: Array[Cursor] = ???

    @stub
    // The south-resize cursor type.
    def S_RESIZE_CURSOR: Int = ???

    @stub
    // The south-east-resize cursor type.
    def SE_RESIZE_CURSOR: Int = ???

    @stub
    // The south-west-resize cursor type.
    def SW_RESIZE_CURSOR: Int = ???

    @stub
    // The text cursor type.
    def TEXT_CURSOR: Int = ???

    @stub
    // The west-resize cursor type.
    def W_RESIZE_CURSOR: Int = ???

    @stub
    // Return the system default cursor.
    def getDefaultCursor(): Cursor = ???

    @stub
    // Returns a cursor object with the specified predefined type.
    def getPredefinedCursor(type: Int): Cursor = ???

    @stub
    // Returns a system-specific custom cursor object matching the
    // specified name.
    def getSystemCustomCursor(name: String): Cursor = ???
}

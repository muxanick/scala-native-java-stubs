package java.awt

import java.awt.event.KeyEvent
import java.io.Serializable
import java.lang.{Character, Class, Object, String}

// An AWTKeyStroke represents a key action on the
// keyboard, or equivalent input device. AWTKeyStrokes
// can correspond to only a press or release of a
// particular key, just as KEY_PRESSED and
// KEY_RELEASED KeyEvents do;
// alternately, they can correspond to typing a specific Java character, just
// as KEY_TYPED KeyEvents do.
// In all cases, AWTKeyStrokes can specify modifiers
// (alt, shift, control, meta, altGraph, or a combination thereof) which must be present
// during the action for an exact match.
// 
// AWTKeyStrokes are immutable, and are intended
// to be unique. Client code should never create an
// AWTKeyStroke on its own, but should instead use
// a variant of getAWTKeyStroke. Client use of these factory
// methods allows the AWTKeyStroke implementation
// to cache and share instances efficiently.
class AWTKeyStroke extends Object with Serializable {

    @stub
    // Constructs an AWTKeyStroke with default values.
    protected def this() = ???

    @stub
    // Returns true if this object is identical to the specified object.
    def equals(anObject: Object): Boolean = ???

    @stub
    // Returns the character for this AWTKeyStroke.
    def getKeyChar(): Char = ???

    @stub
    // Returns the numeric key code for this AWTKeyStroke.
    def getKeyCode(): Int = ???

    @stub
    // Returns the type of KeyEvent which corresponds to
    // this AWTKeyStroke.
    def getKeyEventType(): Int = ???

    @stub
    // Returns the modifier keys for this AWTKeyStroke.
    def getModifiers(): Int = ???

    @stub
    // Returns a numeric value for this object that is likely to be unique,
    // making it a good choice as the index value in a hash table.
    def hashCode(): Int = ???

    @stub
    // Returns whether this AWTKeyStroke represents a key release.
    def isOnKeyRelease(): Boolean = ???

    @stub
    // Returns a cached instance of AWTKeyStroke (or a subclass of
    // AWTKeyStroke) which is equal to this instance.
    protected def readResolve(): Object = ???
}

object AWTKeyStroke {
    @stub
    // Returns a shared instance of an AWTKeyStroke
    // that represents a KEY_TYPED event for the
    // specified character.
    def getAWTKeyStroke(keyChar: Char): AWTKeyStroke = ???

    @stub
    // Returns a shared instance of an AWTKeyStroke
    // that represents a KEY_TYPED event for the
    // specified Character object and a set of modifiers.
    def getAWTKeyStroke(keyChar: Character, modifiers: Int): AWTKeyStroke = ???

    @stub
    // Returns a shared instance of an AWTKeyStroke,
    // given a numeric key code and a set of modifiers.
    def getAWTKeyStroke(keyCode: Int, modifiers: Int): AWTKeyStroke = ???

    @stub
    // Returns a shared instance of an AWTKeyStroke,
    // given a numeric key code and a set of modifiers, specifying
    // whether the key is activated when it is pressed or released.
    def getAWTKeyStroke(keyCode: Int, modifiers: Int, onKeyRelease: Boolean): AWTKeyStroke = ???

    @stub
    // Parses a string and returns an AWTKeyStroke.
    def getAWTKeyStroke(s: String): AWTKeyStroke = ???

    @stub
    // Returns an AWTKeyStroke which represents the
    // stroke which generated a given KeyEvent.
    def getAWTKeyStrokeForEvent(anEvent: KeyEvent): AWTKeyStroke = ???

    @stub
    // Registers a new class which the factory methods in
    // AWTKeyStroke will use when generating new
    // instances of AWTKeyStrokes.
    protected def registerSubclass(subclass: Class[_]): Unit = ???
}

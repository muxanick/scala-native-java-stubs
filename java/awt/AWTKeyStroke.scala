package java.awt

import java.awt.event.KeyEvent
import java.io.Serializable
import java.lang.{Character, Class, Object, String}
import scala.scalanative.annotation.stub

/** An AWTKeyStroke represents a key action on the
 *  keyboard, or equivalent input device. AWTKeyStrokes
 *  can correspond to only a press or release of a
 *  particular key, just as KEY_PRESSED and
 *  KEY_RELEASED KeyEvents do;
 *  alternately, they can correspond to typing a specific Java character, just
 *  as KEY_TYPED KeyEvents do.
 *  In all cases, AWTKeyStrokes can specify modifiers
 *  (alt, shift, control, meta, altGraph, or a combination thereof) which must be present
 *  during the action for an exact match.
 *  
 *  AWTKeyStrokes are immutable, and are intended
 *  to be unique. Client code should never create an
 *  AWTKeyStroke on its own, but should instead use
 *  a variant of getAWTKeyStroke. Client use of these factory
 *  methods allows the AWTKeyStroke implementation
 *  to cache and share instances efficiently.
 */
class AWTKeyStroke extends Object with Serializable {

    /** Constructs an AWTKeyStroke with default values. */
    @stub
    protected def this() = ???

    /** Constructs an AWTKeyStroke with the specified
     *  values.
     */
    @stub
    protected def this(keyChar: Char, keyCode: Int, modifiers: Int, onKeyRelease: Boolean) = ???

    /** Returns true if this object is identical to the specified object. */
    @stub
    def equals(anObject: Object): Boolean = ???

    /** Returns the character for this AWTKeyStroke. */
    @stub
    def getKeyChar(): Char = ???

    /** Returns the numeric key code for this AWTKeyStroke. */
    @stub
    def getKeyCode(): Int = ???

    /** Returns the type of KeyEvent which corresponds to
     *  this AWTKeyStroke.
     */
    @stub
    def getKeyEventType(): Int = ???

    /** Returns the modifier keys for this AWTKeyStroke. */
    @stub
    def getModifiers(): Int = ???

    /** Returns a numeric value for this object that is likely to be unique,
     *  making it a good choice as the index value in a hash table.
     */
    @stub
    def hashCode(): Int = ???

    /** Returns whether this AWTKeyStroke represents a key release. */
    @stub
    def isOnKeyRelease(): Boolean = ???

    /** Returns a cached instance of AWTKeyStroke (or a subclass of
     *  AWTKeyStroke) which is equal to this instance.
     */
    @stub
    protected def readResolve(): Object = ???

    /** Returns a string that displays and identifies this object's properties. */
    @stub
    def toString(): String = ???
}

object AWTKeyStroke {
    /** Returns a shared instance of an AWTKeyStroke
     *  that represents a KEY_TYPED event for the
     *  specified character.
     */
    @stub
    def getAWTKeyStroke(keyChar: Char): AWTKeyStroke = ???

    /** Returns a shared instance of an AWTKeyStroke
     *  that represents a KEY_TYPED event for the
     *  specified Character object and a set of modifiers.
     */
    @stub
    def getAWTKeyStroke(keyChar: Character, modifiers: Int): AWTKeyStroke = ???

    /** Returns a shared instance of an AWTKeyStroke,
     *  given a numeric key code and a set of modifiers.
     */
    @stub
    def getAWTKeyStroke(keyCode: Int, modifiers: Int): AWTKeyStroke = ???

    /** Returns a shared instance of an AWTKeyStroke,
     *  given a numeric key code and a set of modifiers, specifying
     *  whether the key is activated when it is pressed or released.
     */
    @stub
    def getAWTKeyStroke(keyCode: Int, modifiers: Int, onKeyRelease: Boolean): AWTKeyStroke = ???

    /** Parses a string and returns an AWTKeyStroke. */
    @stub
    def getAWTKeyStroke(s: String): AWTKeyStroke = ???

    /** Returns an AWTKeyStroke which represents the
     *  stroke which generated a given KeyEvent.
     */
    @stub
    def getAWTKeyStrokeForEvent(anEvent: KeyEvent): AWTKeyStroke = ???

    /** Registers a new class which the factory methods in
     *  AWTKeyStroke will use when generating new
     *  instances of AWTKeyStrokes.
     */
    @stub
    protected def registerSubclass(subclass: Class[_]): Unit = ???
}

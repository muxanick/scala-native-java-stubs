package javax.swing

import java.awt.AWTKeyStroke
import java.lang.{Character, Object, String}

// A KeyStroke represents a key action on the keyboard, or equivalent input
// device. KeyStrokes can correspond to only a press or release of a particular
// key, just as KEY_PRESSED and KEY_RELEASED KeyEvents do; alternately, they
// can correspond to typing a specific Java character, just as KEY_TYPED
// KeyEvents do. In all cases, KeyStrokes can specify modifiers (alt, shift,
// control, meta, altGraph, or a combination thereof) which must be present during the
// action for an exact match.
// 
// KeyStrokes are used to define high-level (semantic) action events. Instead
// of trapping every keystroke and throwing away the ones you are not
// interested in, those keystrokes you care about automatically initiate
// actions on the Components with which they are registered.
// 
// KeyStrokes are immutable, and are intended to be unique. Client code cannot
// create a KeyStroke; a variant of getKeyStroke must be used
// instead. These factory methods allow the KeyStroke implementation to cache
// and share instances efficiently.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class KeyStroke extends AWTKeyStroke {
}

object KeyStroke {
    @stub
    // Returns a shared instance of a KeyStroke
    // that represents a KEY_TYPED event for the
    // specified character.
    def getKeyStroke(keyChar: Char): KeyStroke = ???

    @stub
    // Returns a shared instance of a KeyStroke
    // that represents a KEY_TYPED event for the
    // specified Character object and a
    // set of modifiers.
    def getKeyStroke(keyChar: Character, modifiers: Int): KeyStroke = ???

    @stub
    // Deprecated. 
    //use getKeyStroke(char)
    //
    def getKeyStroke(keyChar: Char, onKeyRelease: Boolean): KeyStroke = ???

    @stub
    // Returns a shared instance of a KeyStroke, given a numeric key code and a
    // set of modifiers.
    def getKeyStroke(keyCode: Int, modifiers: Int): KeyStroke = ???

    @stub
    // Returns a shared instance of a KeyStroke, given a numeric key code and a
    // set of modifiers, specifying whether the key is activated when it is
    // pressed or released.
    def getKeyStroke(keyCode: Int, modifiers: Int, onKeyRelease: Boolean): KeyStroke = ???

    @stub
    // Parses a string and returns a KeyStroke.
    def getKeyStroke(s: String): KeyStroke = ???
}

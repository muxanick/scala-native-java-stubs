package java.awt.event

import java.awt.{AWTEvent, Component}
import java.lang.{Object, String}
import java.util.EventObject

// An event which indicates that a keystroke occurred in a component.
// 
// This low-level event is generated by a component object (such as a text
// field) when a key is pressed, released, or typed.
// The event is passed to every KeyListener
// or KeyAdapter object which registered to receive such
// events using the component's addKeyListener method.
// (KeyAdapter objects implement the
// KeyListener interface.)  Each such listener object
// gets this KeyEvent when the event occurs.
// 
// "Key typed" events are higher-level and generally do not depend on
// the platform or keyboard layout.  They are generated when a Unicode character
// is entered, and are the preferred way to find out about character input.
// In the simplest case, a key typed event is produced by a single key press
// (e.g., 'a').  Often, however, characters are produced by series of key
// presses (e.g., 'shift' + 'a'), and the mapping from key pressed events to
// key typed events may be many-to-one or many-to-many.  Key releases are not
// usually necessary to generate a key typed event, but there are some cases
// where the key typed event is not generated until a key is released (e.g.,
// entering ASCII sequences via the Alt-Numpad method in Windows).
// No key typed events are generated for keys that don't generate Unicode
// characters (e.g., action keys, modifier keys, etc.).
// 
// The getKeyChar method always returns a valid Unicode character or
// CHAR_UNDEFINED.  Character input is reported by KEY_TYPED events:
// KEY_PRESSED and KEY_RELEASED events are not necessarily associated
// with character input.  Therefore, the result of the getKeyChar method
// is guaranteed to be meaningful only for KEY_TYPED events.
// 
// For key pressed and key released events, the getKeyCode method returns
// the event's keyCode.  For key typed events, the getKeyCode method
// always returns VK_UNDEFINED. The getExtendedKeyCode method
// may also be used with many international keyboard layouts.
//
// 
// "Key pressed" and "key released" events are lower-level and depend
// on the platform and keyboard layout. They are generated whenever a key is
// pressed or released, and are the only way to find out about keys that don't
// generate character input (e.g., action keys, modifier keys, etc.). The key
// being pressed or released is indicated by the getKeyCode and getExtendedKeyCode
// methods, which return a virtual key code.
//
// 
// Virtual key codes are used to report which keyboard key has
// been pressed, rather than a character generated by the combination
// of one or more keystrokes (such as "A", which comes from shift and "a").
//
// 
// For example, pressing the Shift key will cause a KEY_PRESSED event
// with a VK_SHIFT keyCode, while pressing the 'a' key will result in
// a VK_A keyCode.  After the 'a' key is released, a KEY_RELEASED event
// will be fired with VK_A. Separately, a KEY_TYPED event with a keyChar
// value of 'A' is generated.
//
// 
// Pressing and releasing a key on the keyboard results in the generating
// the following key events (in order):
// 
//     KEY_PRESSED
//     KEY_TYPED (is only generated if a valid Unicode character could be generated.)
//     KEY_RELEASED
// 
//
// But in some cases (e.g. auto-repeat or input method is activated) the order
// could be different (and platform dependent).
//
// 
// Notes:
// 
// Key combinations which do not result in Unicode characters, such as action
// keys like F1 and the HELP key, do not generate KEY_TYPED events.
// Not all keyboards or systems are capable of generating all
// virtual key codes.  No attempt is made in Java to generate these keys
// artificially.
// Virtual key codes do not identify a physical key: they depend on the
// platform and keyboard layout. For example, the key that generates VK_Q
// when using a U.S. keyboard layout will generate VK_A when using a French
// keyboard layout.
// The key that generates VK_Q when using a U.S. keyboard layout also
// generates a unique code for Russian or Hebrew layout. There is no a
// VK_ constant for these and many other codes in various layouts. These codes
// may be obtained by using getExtendedKeyCode and are used whenever
// a VK_ constant is used.
// Not all characters have a keycode associated with them.  For example,
// there is no keycode for the question mark because there is no keyboard
// for which it appears on the primary layer.
// In order to support the platform-independent handling of action keys,
// the Java platform uses a few additional virtual key constants for functions
// that would otherwise have to be recognized by interpreting virtual key codes
// and modifiers. For example, for Japanese Windows keyboards, VK_ALL_CANDIDATES
// is returned instead of VK_CONVERT with the ALT modifier.
// As specified in Focus Specification
// key events are dispatched to the focus owner by default.
// 
//
// 
// WARNING: Aside from those keys that are defined by the Java language
// (VK_ENTER, VK_BACK_SPACE, and VK_TAB), do not rely on the values of the VK_
// constants.  Sun reserves the right to change these values as needed
// to accommodate a wider range of keyboards in the future.
// 
// An unspecified behavior will be caused if the id parameter
// of any particular KeyEvent instance is not
// in the range from KEY_FIRST to KEY_LAST.
class KeyEvent extends InputEvent {

    @stub
    // Deprecated. 
    //as of JDK1.1
    //
    def this(source: Component, id: Int, when: Long, modifiers: Int, keyCode: Int) = ???

    @stub
    // Constructs a KeyEvent object.
    def this(source: Component, id: Int, when: Long, modifiers: Int, keyCode: Int, keyChar: Char) = ???

    @stub
    // Returns an extended key code for the event.
    def getExtendedKeyCode(): Int = ???

    @stub
    // Returns the character associated with the key in this event.
    def getKeyChar(): Char = ???

    @stub
    // Returns the integer keyCode associated with the key in this event.
    def getKeyCode(): Int = ???

    @stub
    // Returns the location of the key that originated this key event.
    def getKeyLocation(): Int = ???

    @stub
    // Returns whether the key in this event is an "action" key.
    def isActionKey(): Boolean = ???

    @stub
    // Returns a parameter string identifying this event.
    def paramString(): String = ???

    @stub
    // Set the keyChar value to indicate a logical character.
    def setKeyChar(keyChar: Char): Unit = ???

    @stub
    // Set the keyCode value to indicate a physical key.
    def setKeyCode(keyCode: Int): Unit = ???
}

object KeyEvent {
    @stub
    // KEY_PRESSED and KEY_RELEASED events which do not map to a
    // valid Unicode character use this for the keyChar value.
    def CHAR_UNDEFINED: Char = ???

    @stub
    // The first number in the range of ids used for key events.
    def KEY_FIRST: Int = ???

    @stub
    // The last number in the range of ids used for key events.
    def KEY_LAST: Int = ???

    @stub
    // A constant indicating that the key pressed or released is in
    // the left key location (there is more than one possible location
    // for this key).
    def KEY_LOCATION_LEFT: Int = ???

    @stub
    // A constant indicating that the key event originated on the
    // numeric keypad or with a virtual key corresponding to the
    // numeric keypad.
    def KEY_LOCATION_NUMPAD: Int = ???

    @stub
    // A constant indicating that the key pressed or released is in
    // the right key location (there is more than one possible location
    // for this key).
    def KEY_LOCATION_RIGHT: Int = ???

    @stub
    // A constant indicating that the key pressed or released
    // is not distinguished as the left or right version of a key,
    // and did not originate on the numeric keypad (or did not
    // originate with a virtual key corresponding to the numeric
    // keypad).
    def KEY_LOCATION_STANDARD: Int = ???

    @stub
    // A constant indicating that the keyLocation is indeterminate
    // or not relevant.
    def KEY_LOCATION_UNKNOWN: Int = ???

    @stub
    // The "key pressed" event.
    def KEY_PRESSED: Int = ???

    @stub
    // The "key released" event.
    def KEY_RELEASED: Int = ???

    @stub
    // The "key typed" event.
    def KEY_TYPED: Int = ???

    @stub
    // VK_0 thru VK_9 are the same as ASCII '0' thru '9' (0x30 - 0x39)
    def VK_0: Int = ???

    @stub
    // 
    def VK_1: Int = ???

    @stub
    // 
    def VK_2: Int = ???

    @stub
    // 
    def VK_3: Int = ???

    @stub
    // 
    def VK_4: Int = ???

    @stub
    // 
    def VK_5: Int = ???

    @stub
    // 
    def VK_6: Int = ???

    @stub
    // 
    def VK_7: Int = ???

    @stub
    // 
    def VK_8: Int = ???

    @stub
    // 
    def VK_9: Int = ???

    @stub
    // VK_A thru VK_Z are the same as ASCII 'A' thru 'Z' (0x41 - 0x5A)
    def VK_A: Int = ???

    @stub
    // Constant for the Accept or Commit function key.
    def VK_ACCEPT: Int = ???

    @stub
    // 
    def VK_ADD: Int = ???

    @stub
    // 
    def VK_AGAIN: Int = ???

    @stub
    // Constant for the All Candidates function key.
    def VK_ALL_CANDIDATES: Int = ???

    @stub
    // Constant for the Alphanumeric function key.
    def VK_ALPHANUMERIC: Int = ???

    @stub
    // 
    def VK_ALT: Int = ???

    @stub
    // Constant for the AltGraph function key.
    def VK_ALT_GRAPH: Int = ???

    @stub
    // 
    def VK_AMPERSAND: Int = ???

    @stub
    // 
    def VK_ASTERISK: Int = ???

    @stub
    // Constant for the "@" key.
    def VK_AT: Int = ???

    @stub
    // 
    def VK_B: Int = ???

    @stub
    // 
    def VK_BACK_QUOTE: Int = ???

    @stub
    // Constant for the back slash key, "\"
    def VK_BACK_SLASH: Int = ???

    @stub
    // 
    def VK_BACK_SPACE: Int = ???

    @stub
    // Constant for the Begin key.
    def VK_BEGIN: Int = ???

    @stub
    // 
    def VK_BRACELEFT: Int = ???

    @stub
    // 
    def VK_BRACERIGHT: Int = ???

    @stub
    // 
    def VK_C: Int = ???

    @stub
    // 
    def VK_CANCEL: Int = ???

    @stub
    // 
    def VK_CAPS_LOCK: Int = ???

    @stub
    // Constant for the "^" key.
    def VK_CIRCUMFLEX: Int = ???

    @stub
    // 
    def VK_CLEAR: Int = ???

    @stub
    // Constant for the close bracket key, "]"
    def VK_CLOSE_BRACKET: Int = ???

    @stub
    // Constant for the Code Input function key.
    def VK_CODE_INPUT: Int = ???

    @stub
    // Constant for the ":" key.
    def VK_COLON: Int = ???

    @stub
    // Constant for the comma key, ","
    def VK_COMMA: Int = ???

    @stub
    // Constant for the Compose function key.
    def VK_COMPOSE: Int = ???

    @stub
    // Constant for the Microsoft Windows Context Menu key.
    def VK_CONTEXT_MENU: Int = ???

    @stub
    // 
    def VK_CONTROL: Int = ???

    @stub
    // Constant for the Convert function key.
    def VK_CONVERT: Int = ???

    @stub
    // 
    def VK_COPY: Int = ???

    @stub
    // 
    def VK_CUT: Int = ???

    @stub
    // 
    def VK_D: Int = ???

    @stub
    // 
    def VK_DEAD_ABOVEDOT: Int = ???

    @stub
    // 
    def VK_DEAD_ABOVERING: Int = ???

    @stub
    // 
    def VK_DEAD_ACUTE: Int = ???

    @stub
    // 
    def VK_DEAD_BREVE: Int = ???

    @stub
    // 
    def VK_DEAD_CARON: Int = ???

    @stub
    // 
    def VK_DEAD_CEDILLA: Int = ???

    @stub
    // 
    def VK_DEAD_CIRCUMFLEX: Int = ???

    @stub
    // 
    def VK_DEAD_DIAERESIS: Int = ???

    @stub
    // 
    def VK_DEAD_DOUBLEACUTE: Int = ???

    @stub
    // 
    def VK_DEAD_GRAVE: Int = ???

    @stub
    // 
    def VK_DEAD_IOTA: Int = ???

    @stub
    // 
    def VK_DEAD_MACRON: Int = ???

    @stub
    // 
    def VK_DEAD_OGONEK: Int = ???

    @stub
    // 
    def VK_DEAD_SEMIVOICED_SOUND: Int = ???

    @stub
    // 
    def VK_DEAD_TILDE: Int = ???

    @stub
    // 
    def VK_DEAD_VOICED_SOUND: Int = ???

    @stub
    // 
    def VK_DECIMAL: Int = ???

    @stub
    // 
    def VK_DELETE: Int = ???

    @stub
    // 
    def VK_DIVIDE: Int = ???

    @stub
    // Constant for the "$" key.
    def VK_DOLLAR: Int = ???

    @stub
    // Constant for the non-numpad down arrow key.
    def VK_DOWN: Int = ???

    @stub
    // 
    def VK_E: Int = ???

    @stub
    // 
    def VK_END: Int = ???

    @stub
    // 
    def VK_ENTER: Int = ???

    @stub
    // Constant for the equals key, "="
    def VK_EQUALS: Int = ???

    @stub
    // 
    def VK_ESCAPE: Int = ???

    @stub
    // Constant for the Euro currency sign key.
    def VK_EURO_SIGN: Int = ???

    @stub
    // Constant for the "!" key.
    def VK_EXCLAMATION_MARK: Int = ???

    @stub
    // 
    def VK_F: Int = ???

    @stub
    // Constant for the F1 function key.
    def VK_F1: Int = ???

    @stub
    // Constant for the F10 function key.
    def VK_F10: Int = ???

    @stub
    // Constant for the F11 function key.
    def VK_F11: Int = ???

    @stub
    // Constant for the F12 function key.
    def VK_F12: Int = ???

    @stub
    // Constant for the F13 function key.
    def VK_F13: Int = ???

    @stub
    // Constant for the F14 function key.
    def VK_F14: Int = ???

    @stub
    // Constant for the F15 function key.
    def VK_F15: Int = ???

    @stub
    // Constant for the F16 function key.
    def VK_F16: Int = ???

    @stub
    // Constant for the F17 function key.
    def VK_F17: Int = ???

    @stub
    // Constant for the F18 function key.
    def VK_F18: Int = ???

    @stub
    // Constant for the F19 function key.
    def VK_F19: Int = ???

    @stub
    // Constant for the F2 function key.
    def VK_F2: Int = ???

    @stub
    // Constant for the F20 function key.
    def VK_F20: Int = ???

    @stub
    // Constant for the F21 function key.
    def VK_F21: Int = ???

    @stub
    // Constant for the F22 function key.
    def VK_F22: Int = ???

    @stub
    // Constant for the F23 function key.
    def VK_F23: Int = ???

    @stub
    // Constant for the F24 function key.
    def VK_F24: Int = ???

    @stub
    // Constant for the F3 function key.
    def VK_F3: Int = ???

    @stub
    // Constant for the F4 function key.
    def VK_F4: Int = ???

    @stub
    // Constant for the F5 function key.
    def VK_F5: Int = ???

    @stub
    // Constant for the F6 function key.
    def VK_F6: Int = ???

    @stub
    // Constant for the F7 function key.
    def VK_F7: Int = ???

    @stub
    // Constant for the F8 function key.
    def VK_F8: Int = ???

    @stub
    // Constant for the F9 function key.
    def VK_F9: Int = ???

    @stub
    // 
    def VK_FINAL: Int = ???

    @stub
    // 
    def VK_FIND: Int = ???

    @stub
    // Constant for the Full-Width Characters function key.
    def VK_FULL_WIDTH: Int = ???

    @stub
    // 
    def VK_G: Int = ???

    @stub
    // 
    def VK_GREATER: Int = ???

    @stub
    // 
    def VK_H: Int = ???

    @stub
    // Constant for the Half-Width Characters function key.
    def VK_HALF_WIDTH: Int = ???

    @stub
    // 
    def VK_HELP: Int = ???

    @stub
    // Constant for the Hiragana function key.
    def VK_HIRAGANA: Int = ???

    @stub
    // 
    def VK_HOME: Int = ???

    @stub
    // 
    def VK_I: Int = ???

    @stub
    // Constant for the input method on/off key.
    def VK_INPUT_METHOD_ON_OFF: Int = ???

    @stub
    // 
    def VK_INSERT: Int = ???

    @stub
    // Constant for the inverted exclamation mark key.
    def VK_INVERTED_EXCLAMATION_MARK: Int = ???

    @stub
    // 
    def VK_J: Int = ???

    @stub
    // Constant for the Japanese-Hiragana function key.
    def VK_JAPANESE_HIRAGANA: Int = ???

    @stub
    // Constant for the Japanese-Katakana function key.
    def VK_JAPANESE_KATAKANA: Int = ???

    @stub
    // Constant for the Japanese-Roman function key.
    def VK_JAPANESE_ROMAN: Int = ???

    @stub
    // 
    def VK_K: Int = ???

    @stub
    // 
    def VK_KANA: Int = ???

    @stub
    // Constant for the locking Kana function key.
    def VK_KANA_LOCK: Int = ???

    @stub
    // 
    def VK_KANJI: Int = ???

    @stub
    // Constant for the Katakana function key.
    def VK_KATAKANA: Int = ???

    @stub
    // Constant for the numeric keypad down arrow key.
    def VK_KP_DOWN: Int = ???

    @stub
    // Constant for the numeric keypad left arrow key.
    def VK_KP_LEFT: Int = ???

    @stub
    // Constant for the numeric keypad right arrow key.
    def VK_KP_RIGHT: Int = ???

    @stub
    // Constant for the numeric keypad up arrow key.
    def VK_KP_UP: Int = ???

    @stub
    // 
    def VK_L: Int = ???

    @stub
    // Constant for the non-numpad left arrow key.
    def VK_LEFT: Int = ???

    @stub
    // Constant for the "(" key.
    def VK_LEFT_PARENTHESIS: Int = ???

    @stub
    // 
    def VK_LESS: Int = ???

    @stub
    // 
    def VK_M: Int = ???

    @stub
    // 
    def VK_META: Int = ???

    @stub
    // Constant for the minus key, "-"
    def VK_MINUS: Int = ???

    @stub
    // 
    def VK_MODECHANGE: Int = ???

    @stub
    // 
    def VK_MULTIPLY: Int = ???

    @stub
    // 
    def VK_N: Int = ???

    @stub
    // Constant for the Don't Convert function key.
    def VK_NONCONVERT: Int = ???

    @stub
    // 
    def VK_NUM_LOCK: Int = ???

    @stub
    // Constant for the "#" key.
    def VK_NUMBER_SIGN: Int = ???

    @stub
    // 
    def VK_NUMPAD0: Int = ???

    @stub
    // 
    def VK_NUMPAD1: Int = ???

    @stub
    // 
    def VK_NUMPAD2: Int = ???

    @stub
    // 
    def VK_NUMPAD3: Int = ???

    @stub
    // 
    def VK_NUMPAD4: Int = ???

    @stub
    // 
    def VK_NUMPAD5: Int = ???

    @stub
    // 
    def VK_NUMPAD6: Int = ???

    @stub
    // 
    def VK_NUMPAD7: Int = ???

    @stub
    // 
    def VK_NUMPAD8: Int = ???

    @stub
    // 
    def VK_NUMPAD9: Int = ???

    @stub
    // 
    def VK_O: Int = ???

    @stub
    // Constant for the open bracket key, "["
    def VK_OPEN_BRACKET: Int = ???

    @stub
    // 
    def VK_P: Int = ???

    @stub
    // 
    def VK_PAGE_DOWN: Int = ???

    @stub
    // 
    def VK_PAGE_UP: Int = ???

    @stub
    // 
    def VK_PASTE: Int = ???

    @stub
    // 
    def VK_PAUSE: Int = ???

    @stub
    // Constant for the period key, "."
    def VK_PERIOD: Int = ???

    @stub
    // Constant for the "+" key.
    def VK_PLUS: Int = ???

    @stub
    // Constant for the Previous Candidate function key.
    def VK_PREVIOUS_CANDIDATE: Int = ???

    @stub
    // 
    def VK_PRINTSCREEN: Int = ???

    @stub
    // 
    def VK_PROPS: Int = ???

    @stub
    // 
    def VK_Q: Int = ???

    @stub
    // 
    def VK_QUOTE: Int = ???

    @stub
    // 
    def VK_QUOTEDBL: Int = ???

    @stub
    // 
    def VK_R: Int = ???

    @stub
    // Constant for the non-numpad right arrow key.
    def VK_RIGHT: Int = ???

    @stub
    // Constant for the ")" key.
    def VK_RIGHT_PARENTHESIS: Int = ???

    @stub
    // Constant for the Roman Characters function key.
    def VK_ROMAN_CHARACTERS: Int = ???

    @stub
    // 
    def VK_S: Int = ???

    @stub
    // 
    def VK_SCROLL_LOCK: Int = ???

    @stub
    // Constant for the semicolon key, ";"
    def VK_SEMICOLON: Int = ???

    @stub
    // This constant is obsolete, and is included only for backwards
    // compatibility.
    def VK_SEPARATER: Int = ???

    @stub
    // Constant for the Numpad Separator key.
    def VK_SEPARATOR: Int = ???

    @stub
    // 
    def VK_SHIFT: Int = ???

    @stub
    // Constant for the forward slash key, "/"
    def VK_SLASH: Int = ???

    @stub
    // 
    def VK_SPACE: Int = ???

    @stub
    // 
    def VK_STOP: Int = ???

    @stub
    // 
    def VK_SUBTRACT: Int = ???

    @stub
    // 
    def VK_T: Int = ???

    @stub
    // 
    def VK_TAB: Int = ???

    @stub
    // 
    def VK_U: Int = ???

    @stub
    // This value is used to indicate that the keyCode is unknown.
    def VK_UNDEFINED: Int = ???

    @stub
    // Constant for the "_" key.
    def VK_UNDERSCORE: Int = ???

    @stub
    // 
    def VK_UNDO: Int = ???

    @stub
    // Constant for the non-numpad up arrow key.
    def VK_UP: Int = ???

    @stub
    // 
    def VK_V: Int = ???

    @stub
    // 
    def VK_W: Int = ???

    @stub
    // Constant for the Microsoft Windows "Windows" key.
    def VK_WINDOWS: Int = ???

    @stub
    // 
    def VK_X: Int = ???

    @stub
    // 
    def VK_Y: Int = ???

    @stub
    // Returns an extended key code for a unicode character.
    def getExtendedKeyCodeForChar(c: Int): Int = ???

    @stub
    // Returns a String describing the modifier key(s),
    // such as "Shift", or "Ctrl+Shift".
    def getKeyModifiersText(modifiers: Int): String = ???

    @stub
    // Returns a String describing the keyCode, such as "HOME", "F1" or "A".
    def getKeyText(keyCode: Int): String = ???
}

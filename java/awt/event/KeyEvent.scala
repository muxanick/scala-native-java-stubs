package java.awt.event

import java.awt.{AWTEvent, Component}
import java.lang.{Object, String}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** An event which indicates that a keystroke occurred in a component.
 *  
 *  This low-level event is generated by a component object (such as a text
 *  field) when a key is pressed, released, or typed.
 *  The event is passed to every KeyListener
 *  or KeyAdapter object which registered to receive such
 *  events using the component's addKeyListener method.
 *  (KeyAdapter objects implement the
 *  KeyListener interface.)  Each such listener object
 *  gets this KeyEvent when the event occurs.
 *  
 *  "Key typed" events are higher-level and generally do not depend on
 *  the platform or keyboard layout.  They are generated when a Unicode character
 *  is entered, and are the preferred way to find out about character input.
 *  In the simplest case, a key typed event is produced by a single key press
 *  (e.g., 'a').  Often, however, characters are produced by series of key
 *  presses (e.g., 'shift' + 'a'), and the mapping from key pressed events to
 *  key typed events may be many-to-one or many-to-many.  Key releases are not
 *  usually necessary to generate a key typed event, but there are some cases
 *  where the key typed event is not generated until a key is released (e.g.,
 *  entering ASCII sequences via the Alt-Numpad method in Windows).
 *  No key typed events are generated for keys that don't generate Unicode
 *  characters (e.g., action keys, modifier keys, etc.).
 *  
 *  The getKeyChar method always returns a valid Unicode character or
 *  CHAR_UNDEFINED.  Character input is reported by KEY_TYPED events:
 *  KEY_PRESSED and KEY_RELEASED events are not necessarily associated
 *  with character input.  Therefore, the result of the getKeyChar method
 *  is guaranteed to be meaningful only for KEY_TYPED events.
 *  
 *  For key pressed and key released events, the getKeyCode method returns
 *  the event's keyCode.  For key typed events, the getKeyCode method
 *  always returns VK_UNDEFINED. The getExtendedKeyCode method
 *  may also be used with many international keyboard layouts.
 * 
 *  
 *  "Key pressed" and "key released" events are lower-level and depend
 *  on the platform and keyboard layout. They are generated whenever a key is
 *  pressed or released, and are the only way to find out about keys that don't
 *  generate character input (e.g., action keys, modifier keys, etc.). The key
 *  being pressed or released is indicated by the getKeyCode and getExtendedKeyCode
 *  methods, which return a virtual key code.
 * 
 *  
 *  Virtual key codes are used to report which keyboard key has
 *  been pressed, rather than a character generated by the combination
 *  of one or more keystrokes (such as "A", which comes from shift and "a").
 * 
 *  
 *  For example, pressing the Shift key will cause a KEY_PRESSED event
 *  with a VK_SHIFT keyCode, while pressing the 'a' key will result in
 *  a VK_A keyCode.  After the 'a' key is released, a KEY_RELEASED event
 *  will be fired with VK_A. Separately, a KEY_TYPED event with a keyChar
 *  value of 'A' is generated.
 * 
 *  
 *  Pressing and releasing a key on the keyboard results in the generating
 *  the following key events (in order):
 *  
 *      KEY_PRESSED
 *      KEY_TYPED (is only generated if a valid Unicode character could be generated.)
 *      KEY_RELEASED
 *  
 * 
 *  But in some cases (e.g. auto-repeat or input method is activated) the order
 *  could be different (and platform dependent).
 * 
 *  
 *  Notes:
 *  
 *  Key combinations which do not result in Unicode characters, such as action
 *  keys like F1 and the HELP key, do not generate KEY_TYPED events.
 *  Not all keyboards or systems are capable of generating all
 *  virtual key codes.  No attempt is made in Java to generate these keys
 *  artificially.
 *  Virtual key codes do not identify a physical key: they depend on the
 *  platform and keyboard layout. For example, the key that generates VK_Q
 *  when using a U.S. keyboard layout will generate VK_A when using a French
 *  keyboard layout.
 *  The key that generates VK_Q when using a U.S. keyboard layout also
 *  generates a unique code for Russian or Hebrew layout. There is no a
 *  VK_ constant for these and many other codes in various layouts. These codes
 *  may be obtained by using getExtendedKeyCode and are used whenever
 *  a VK_ constant is used.
 *  Not all characters have a keycode associated with them.  For example,
 *  there is no keycode for the question mark because there is no keyboard
 *  for which it appears on the primary layer.
 *  In order to support the platform-independent handling of action keys,
 *  the Java platform uses a few additional virtual key constants for functions
 *  that would otherwise have to be recognized by interpreting virtual key codes
 *  and modifiers. For example, for Japanese Windows keyboards, VK_ALL_CANDIDATES
 *  is returned instead of VK_CONVERT with the ALT modifier.
 *  As specified in Focus Specification
 *  key events are dispatched to the focus owner by default.
 *  
 * 
 *  
 *  WARNING: Aside from those keys that are defined by the Java language
 *  (VK_ENTER, VK_BACK_SPACE, and VK_TAB), do not rely on the values of the VK_
 *  constants.  Sun reserves the right to change these values as needed
 *  to accommodate a wider range of keyboards in the future.
 *  
 *  An unspecified behavior will be caused if the id parameter
 *  of any particular KeyEvent instance is not
 *  in the range from KEY_FIRST to KEY_LAST.
 */
class KeyEvent extends InputEvent {

    /** Deprecated. 
     * as of JDK1.1
     * 
     */
    @stub
    def this(source: Component, id: Int, when: Long, modifiers: Int, keyCode: Int) = ???

    /** Constructs a KeyEvent object. */
    @stub
    def this(source: Component, id: Int, when: Long, modifiers: Int, keyCode: Int, keyChar: Char) = ???

    /** Constructs a KeyEvent object. */
    @stub
    def this(source: Component, id: Int, when: Long, modifiers: Int, keyCode: Int, keyChar: Char, keyLocation: Int) = ???

    /** Returns an extended key code for the event. */
    @stub
    def getExtendedKeyCode(): Int = ???

    /** Returns the character associated with the key in this event. */
    @stub
    def getKeyChar(): Char = ???

    /** Returns the integer keyCode associated with the key in this event. */
    @stub
    def getKeyCode(): Int = ???

    /** Returns the location of the key that originated this key event. */
    @stub
    def getKeyLocation(): Int = ???

    /** Returns whether the key in this event is an "action" key. */
    @stub
    def isActionKey(): Boolean = ???

    /** Returns a parameter string identifying this event. */
    @stub
    def paramString(): String = ???

    /** Set the keyChar value to indicate a logical character. */
    @stub
    def setKeyChar(keyChar: Char): Unit = ???

    /** Set the keyCode value to indicate a physical key. */
    @stub
    def setKeyCode(keyCode: Int): Unit = ???

    /** Deprecated. 
     * as of JDK1.1.4
     * 
     */
    @stub
    def setModifiers(modifiers: Int): Unit = ???
}

object KeyEvent {
    /** KEY_PRESSED and KEY_RELEASED events which do not map to a
     *  valid Unicode character use this for the keyChar value.
     */
    @stub
    val CHAR_UNDEFINED: Char = ???

    /** The first number in the range of ids used for key events. */
    @stub
    val KEY_FIRST: Int = ???

    /** The last number in the range of ids used for key events. */
    @stub
    val KEY_LAST: Int = ???

    /** A constant indicating that the key pressed or released is in
     *  the left key location (there is more than one possible location
     *  for this key).
     */
    @stub
    val KEY_LOCATION_LEFT: Int = ???

    /** A constant indicating that the key event originated on the
     *  numeric keypad or with a virtual key corresponding to the
     *  numeric keypad.
     */
    @stub
    val KEY_LOCATION_NUMPAD: Int = ???

    /** A constant indicating that the key pressed or released is in
     *  the right key location (there is more than one possible location
     *  for this key).
     */
    @stub
    val KEY_LOCATION_RIGHT: Int = ???

    /** A constant indicating that the key pressed or released
     *  is not distinguished as the left or right version of a key,
     *  and did not originate on the numeric keypad (or did not
     *  originate with a virtual key corresponding to the numeric
     *  keypad).
     */
    @stub
    val KEY_LOCATION_STANDARD: Int = ???

    /** A constant indicating that the keyLocation is indeterminate
     *  or not relevant.
     */
    @stub
    val KEY_LOCATION_UNKNOWN: Int = ???

    /** The "key pressed" event. */
    @stub
    val KEY_PRESSED: Int = ???

    /** The "key released" event. */
    @stub
    val KEY_RELEASED: Int = ???

    /** The "key typed" event. */
    @stub
    val KEY_TYPED: Int = ???

    /** VK_0 thru VK_9 are the same as ASCII '0' thru '9' (0x30 - 0x39) */
    @stub
    val VK_0: Int = ???

    /**  */
    @stub
    val VK_1: Int = ???

    /**  */
    @stub
    val VK_2: Int = ???

    /**  */
    @stub
    val VK_3: Int = ???

    /**  */
    @stub
    val VK_4: Int = ???

    /**  */
    @stub
    val VK_5: Int = ???

    /**  */
    @stub
    val VK_6: Int = ???

    /**  */
    @stub
    val VK_7: Int = ???

    /**  */
    @stub
    val VK_8: Int = ???

    /**  */
    @stub
    val VK_9: Int = ???

    /** VK_A thru VK_Z are the same as ASCII 'A' thru 'Z' (0x41 - 0x5A) */
    @stub
    val VK_A: Int = ???

    /** Constant for the Accept or Commit function key. */
    @stub
    val VK_ACCEPT: Int = ???

    /**  */
    @stub
    val VK_ADD: Int = ???

    /**  */
    @stub
    val VK_AGAIN: Int = ???

    /** Constant for the All Candidates function key. */
    @stub
    val VK_ALL_CANDIDATES: Int = ???

    /** Constant for the Alphanumeric function key. */
    @stub
    val VK_ALPHANUMERIC: Int = ???

    /**  */
    @stub
    val VK_ALT: Int = ???

    /** Constant for the AltGraph function key. */
    @stub
    val VK_ALT_GRAPH: Int = ???

    /**  */
    @stub
    val VK_AMPERSAND: Int = ???

    /**  */
    @stub
    val VK_ASTERISK: Int = ???

    /** Constant for the "@" key. */
    @stub
    val VK_AT: Int = ???

    /**  */
    @stub
    val VK_B: Int = ???

    /**  */
    @stub
    val VK_BACK_QUOTE: Int = ???

    /** Constant for the back slash key, "\" */
    @stub
    val VK_BACK_SLASH: Int = ???

    /**  */
    @stub
    val VK_BACK_SPACE: Int = ???

    /** Constant for the Begin key. */
    @stub
    val VK_BEGIN: Int = ???

    /**  */
    @stub
    val VK_BRACELEFT: Int = ???

    /**  */
    @stub
    val VK_BRACERIGHT: Int = ???

    /**  */
    @stub
    val VK_C: Int = ???

    /**  */
    @stub
    val VK_CANCEL: Int = ???

    /**  */
    @stub
    val VK_CAPS_LOCK: Int = ???

    /** Constant for the "^" key. */
    @stub
    val VK_CIRCUMFLEX: Int = ???

    /**  */
    @stub
    val VK_CLEAR: Int = ???

    /** Constant for the close bracket key, "]" */
    @stub
    val VK_CLOSE_BRACKET: Int = ???

    /** Constant for the Code Input function key. */
    @stub
    val VK_CODE_INPUT: Int = ???

    /** Constant for the ":" key. */
    @stub
    val VK_COLON: Int = ???

    /** Constant for the comma key, "," */
    @stub
    val VK_COMMA: Int = ???

    /** Constant for the Compose function key. */
    @stub
    val VK_COMPOSE: Int = ???

    /** Constant for the Microsoft Windows Context Menu key. */
    @stub
    val VK_CONTEXT_MENU: Int = ???

    /**  */
    @stub
    val VK_CONTROL: Int = ???

    /** Constant for the Convert function key. */
    @stub
    val VK_CONVERT: Int = ???

    /**  */
    @stub
    val VK_COPY: Int = ???

    /**  */
    @stub
    val VK_CUT: Int = ???

    /**  */
    @stub
    val VK_D: Int = ???

    /**  */
    @stub
    val VK_DEAD_ABOVEDOT: Int = ???

    /**  */
    @stub
    val VK_DEAD_ABOVERING: Int = ???

    /**  */
    @stub
    val VK_DEAD_ACUTE: Int = ???

    /**  */
    @stub
    val VK_DEAD_BREVE: Int = ???

    /**  */
    @stub
    val VK_DEAD_CARON: Int = ???

    /**  */
    @stub
    val VK_DEAD_CEDILLA: Int = ???

    /**  */
    @stub
    val VK_DEAD_CIRCUMFLEX: Int = ???

    /**  */
    @stub
    val VK_DEAD_DIAERESIS: Int = ???

    /**  */
    @stub
    val VK_DEAD_DOUBLEACUTE: Int = ???

    /**  */
    @stub
    val VK_DEAD_GRAVE: Int = ???

    /**  */
    @stub
    val VK_DEAD_IOTA: Int = ???

    /**  */
    @stub
    val VK_DEAD_MACRON: Int = ???

    /**  */
    @stub
    val VK_DEAD_OGONEK: Int = ???

    /**  */
    @stub
    val VK_DEAD_SEMIVOICED_SOUND: Int = ???

    /**  */
    @stub
    val VK_DEAD_TILDE: Int = ???

    /**  */
    @stub
    val VK_DEAD_VOICED_SOUND: Int = ???

    /**  */
    @stub
    val VK_DECIMAL: Int = ???

    /**  */
    @stub
    val VK_DELETE: Int = ???

    /**  */
    @stub
    val VK_DIVIDE: Int = ???

    /** Constant for the "$" key. */
    @stub
    val VK_DOLLAR: Int = ???

    /** Constant for the non-numpad down arrow key. */
    @stub
    val VK_DOWN: Int = ???

    /**  */
    @stub
    val VK_E: Int = ???

    /**  */
    @stub
    val VK_END: Int = ???

    /**  */
    @stub
    val VK_ENTER: Int = ???

    /** Constant for the equals key, "=" */
    @stub
    val VK_EQUALS: Int = ???

    /**  */
    @stub
    val VK_ESCAPE: Int = ???

    /** Constant for the Euro currency sign key. */
    @stub
    val VK_EURO_SIGN: Int = ???

    /** Constant for the "!" key. */
    @stub
    val VK_EXCLAMATION_MARK: Int = ???

    /**  */
    @stub
    val VK_F: Int = ???

    /** Constant for the F1 function key. */
    @stub
    val VK_F1: Int = ???

    /** Constant for the F10 function key. */
    @stub
    val VK_F10: Int = ???

    /** Constant for the F11 function key. */
    @stub
    val VK_F11: Int = ???

    /** Constant for the F12 function key. */
    @stub
    val VK_F12: Int = ???

    /** Constant for the F13 function key. */
    @stub
    val VK_F13: Int = ???

    /** Constant for the F14 function key. */
    @stub
    val VK_F14: Int = ???

    /** Constant for the F15 function key. */
    @stub
    val VK_F15: Int = ???

    /** Constant for the F16 function key. */
    @stub
    val VK_F16: Int = ???

    /** Constant for the F17 function key. */
    @stub
    val VK_F17: Int = ???

    /** Constant for the F18 function key. */
    @stub
    val VK_F18: Int = ???

    /** Constant for the F19 function key. */
    @stub
    val VK_F19: Int = ???

    /** Constant for the F2 function key. */
    @stub
    val VK_F2: Int = ???

    /** Constant for the F20 function key. */
    @stub
    val VK_F20: Int = ???

    /** Constant for the F21 function key. */
    @stub
    val VK_F21: Int = ???

    /** Constant for the F22 function key. */
    @stub
    val VK_F22: Int = ???

    /** Constant for the F23 function key. */
    @stub
    val VK_F23: Int = ???

    /** Constant for the F24 function key. */
    @stub
    val VK_F24: Int = ???

    /** Constant for the F3 function key. */
    @stub
    val VK_F3: Int = ???

    /** Constant for the F4 function key. */
    @stub
    val VK_F4: Int = ???

    /** Constant for the F5 function key. */
    @stub
    val VK_F5: Int = ???

    /** Constant for the F6 function key. */
    @stub
    val VK_F6: Int = ???

    /** Constant for the F7 function key. */
    @stub
    val VK_F7: Int = ???

    /** Constant for the F8 function key. */
    @stub
    val VK_F8: Int = ???

    /** Constant for the F9 function key. */
    @stub
    val VK_F9: Int = ???

    /**  */
    @stub
    val VK_FINAL: Int = ???

    /**  */
    @stub
    val VK_FIND: Int = ???

    /** Constant for the Full-Width Characters function key. */
    @stub
    val VK_FULL_WIDTH: Int = ???

    /**  */
    @stub
    val VK_G: Int = ???

    /**  */
    @stub
    val VK_GREATER: Int = ???

    /**  */
    @stub
    val VK_H: Int = ???

    /** Constant for the Half-Width Characters function key. */
    @stub
    val VK_HALF_WIDTH: Int = ???

    /**  */
    @stub
    val VK_HELP: Int = ???

    /** Constant for the Hiragana function key. */
    @stub
    val VK_HIRAGANA: Int = ???

    /**  */
    @stub
    val VK_HOME: Int = ???

    /**  */
    @stub
    val VK_I: Int = ???

    /** Constant for the input method on/off key. */
    @stub
    val VK_INPUT_METHOD_ON_OFF: Int = ???

    /**  */
    @stub
    val VK_INSERT: Int = ???

    /** Constant for the inverted exclamation mark key. */
    @stub
    val VK_INVERTED_EXCLAMATION_MARK: Int = ???

    /**  */
    @stub
    val VK_J: Int = ???

    /** Constant for the Japanese-Hiragana function key. */
    @stub
    val VK_JAPANESE_HIRAGANA: Int = ???

    /** Constant for the Japanese-Katakana function key. */
    @stub
    val VK_JAPANESE_KATAKANA: Int = ???

    /** Constant for the Japanese-Roman function key. */
    @stub
    val VK_JAPANESE_ROMAN: Int = ???

    /**  */
    @stub
    val VK_K: Int = ???

    /**  */
    @stub
    val VK_KANA: Int = ???

    /** Constant for the locking Kana function key. */
    @stub
    val VK_KANA_LOCK: Int = ???

    /**  */
    @stub
    val VK_KANJI: Int = ???

    /** Constant for the Katakana function key. */
    @stub
    val VK_KATAKANA: Int = ???

    /** Constant for the numeric keypad down arrow key. */
    @stub
    val VK_KP_DOWN: Int = ???

    /** Constant for the numeric keypad left arrow key. */
    @stub
    val VK_KP_LEFT: Int = ???

    /** Constant for the numeric keypad right arrow key. */
    @stub
    val VK_KP_RIGHT: Int = ???

    /** Constant for the numeric keypad up arrow key. */
    @stub
    val VK_KP_UP: Int = ???

    /**  */
    @stub
    val VK_L: Int = ???

    /** Constant for the non-numpad left arrow key. */
    @stub
    val VK_LEFT: Int = ???

    /** Constant for the "(" key. */
    @stub
    val VK_LEFT_PARENTHESIS: Int = ???

    /**  */
    @stub
    val VK_LESS: Int = ???

    /**  */
    @stub
    val VK_M: Int = ???

    /**  */
    @stub
    val VK_META: Int = ???

    /** Constant for the minus key, "-" */
    @stub
    val VK_MINUS: Int = ???

    /**  */
    @stub
    val VK_MODECHANGE: Int = ???

    /**  */
    @stub
    val VK_MULTIPLY: Int = ???

    /**  */
    @stub
    val VK_N: Int = ???

    /** Constant for the Don't Convert function key. */
    @stub
    val VK_NONCONVERT: Int = ???

    /**  */
    @stub
    val VK_NUM_LOCK: Int = ???

    /** Constant for the "#" key. */
    @stub
    val VK_NUMBER_SIGN: Int = ???

    /**  */
    @stub
    val VK_NUMPAD0: Int = ???

    /**  */
    @stub
    val VK_NUMPAD1: Int = ???

    /**  */
    @stub
    val VK_NUMPAD2: Int = ???

    /**  */
    @stub
    val VK_NUMPAD3: Int = ???

    /**  */
    @stub
    val VK_NUMPAD4: Int = ???

    /**  */
    @stub
    val VK_NUMPAD5: Int = ???

    /**  */
    @stub
    val VK_NUMPAD6: Int = ???

    /**  */
    @stub
    val VK_NUMPAD7: Int = ???

    /**  */
    @stub
    val VK_NUMPAD8: Int = ???

    /**  */
    @stub
    val VK_NUMPAD9: Int = ???

    /**  */
    @stub
    val VK_O: Int = ???

    /** Constant for the open bracket key, "[" */
    @stub
    val VK_OPEN_BRACKET: Int = ???

    /**  */
    @stub
    val VK_P: Int = ???

    /**  */
    @stub
    val VK_PAGE_DOWN: Int = ???

    /**  */
    @stub
    val VK_PAGE_UP: Int = ???

    /**  */
    @stub
    val VK_PASTE: Int = ???

    /**  */
    @stub
    val VK_PAUSE: Int = ???

    /** Constant for the period key, "." */
    @stub
    val VK_PERIOD: Int = ???

    /** Constant for the "+" key. */
    @stub
    val VK_PLUS: Int = ???

    /** Constant for the Previous Candidate function key. */
    @stub
    val VK_PREVIOUS_CANDIDATE: Int = ???

    /**  */
    @stub
    val VK_PRINTSCREEN: Int = ???

    /**  */
    @stub
    val VK_PROPS: Int = ???

    /**  */
    @stub
    val VK_Q: Int = ???

    /**  */
    @stub
    val VK_QUOTE: Int = ???

    /**  */
    @stub
    val VK_QUOTEDBL: Int = ???

    /**  */
    @stub
    val VK_R: Int = ???

    /** Constant for the non-numpad right arrow key. */
    @stub
    val VK_RIGHT: Int = ???

    /** Constant for the ")" key. */
    @stub
    val VK_RIGHT_PARENTHESIS: Int = ???

    /** Constant for the Roman Characters function key. */
    @stub
    val VK_ROMAN_CHARACTERS: Int = ???

    /**  */
    @stub
    val VK_S: Int = ???

    /**  */
    @stub
    val VK_SCROLL_LOCK: Int = ???

    /** Constant for the semicolon key, ";" */
    @stub
    val VK_SEMICOLON: Int = ???

    /** This constant is obsolete, and is included only for backwards
     *  compatibility.
     */
    @stub
    val VK_SEPARATER: Int = ???

    /** Constant for the Numpad Separator key. */
    @stub
    val VK_SEPARATOR: Int = ???

    /**  */
    @stub
    val VK_SHIFT: Int = ???

    /** Constant for the forward slash key, "/" */
    @stub
    val VK_SLASH: Int = ???

    /**  */
    @stub
    val VK_SPACE: Int = ???

    /**  */
    @stub
    val VK_STOP: Int = ???

    /**  */
    @stub
    val VK_SUBTRACT: Int = ???

    /**  */
    @stub
    val VK_T: Int = ???

    /**  */
    @stub
    val VK_TAB: Int = ???

    /**  */
    @stub
    val VK_U: Int = ???

    /** This value is used to indicate that the keyCode is unknown. */
    @stub
    val VK_UNDEFINED: Int = ???

    /** Constant for the "_" key. */
    @stub
    val VK_UNDERSCORE: Int = ???

    /**  */
    @stub
    val VK_UNDO: Int = ???

    /** Constant for the non-numpad up arrow key. */
    @stub
    val VK_UP: Int = ???

    /**  */
    @stub
    val VK_V: Int = ???

    /**  */
    @stub
    val VK_W: Int = ???

    /** Constant for the Microsoft Windows "Windows" key. */
    @stub
    val VK_WINDOWS: Int = ???

    /**  */
    @stub
    val VK_X: Int = ???

    /**  */
    @stub
    val VK_Y: Int = ???

    /**  */
    @stub
    val VK_Z: Int = ???

    /** Returns an extended key code for a unicode character. */
    @stub
    def getExtendedKeyCodeForChar(c: Int): Int = ???

    /** Returns a String describing the modifier key(s),
     *  such as "Shift", or "Ctrl+Shift".
     */
    @stub
    def getKeyModifiersText(modifiers: Int): String = ???

    /** Returns a String describing the keyCode, such as "HOME", "F1" or "A". */
    @stub
    def getKeyText(keyCode: Int): String = ???
}

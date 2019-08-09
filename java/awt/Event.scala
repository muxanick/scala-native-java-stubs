package java.awt

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** NOTE: The Event class is obsolete and is
 *  available only for backwards compatibility.  It has been replaced
 *  by the AWTEvent class and its subclasses.
 *  
 *  Event is a platform-independent class that
 *  encapsulates events from the platform's Graphical User
 *  Interface in the Java 1.0 event model. In Java 1.1
 *  and later versions, the Event class is maintained
 *  only for backwards compatibility. The information in this
 *  class description is provided to assist programmers in
 *  converting Java 1.0 programs to the new event model.
 *  
 *  In the Java 1.0 event model, an event contains an
 *  id field
 *  that indicates what type of event it is and which other
 *  Event variables are relevant for the event.
 *  
 *  For keyboard events, key
 *  contains a value indicating which key was activated, and
 *  modifiers contains the
 *  modifiers for that event.  For the KEY_PRESS and KEY_RELEASE
 *  event ids, the value of key is the unicode
 *  character code for the key. For KEY_ACTION and
 *  KEY_ACTION_RELEASE, the value of key is
 *  one of the defined action-key identifiers in the
 *  Event class (PGUP,
 *  PGDN, F1, F2, etc).
 */
class Event extends Object with Serializable {

    /** NOTE: The Event class is obsolete and is
     *  available only for backwards compatibility.
     */
    @stub
    def this(target: Object, id: Int, arg: Object) = ???

    /** NOTE: The Event class is obsolete and is
     *  available only for backwards compatibility.
     */
    @stub
    def this(target: Object, when: Long, id: Int, x: Int, y: Int, key: Int, modifiers: Int) = ???

    /** NOTE: The Event class is obsolete and is
     *  available only for backwards compatibility.
     */
    @stub
    def this(target: Object, when: Long, id: Int, x: Int, y: Int, key: Int, modifiers: Int, arg: Object) = ???

    /** An arbitrary argument of the event. */
    @stub
    val arg: Object = ???

    /** For MOUSE_DOWN events, this field indicates the
     *  number of consecutive clicks.
     */
    @stub
    val clickCount: Int = ???

    /** The next event. */
    @stub
    val evt: Event = ???

    /** Indicates which type of event the event is, and which
     *  other Event variables are relevant for the event.
     */
    @stub
    val id: Int = ???

    /** The key code of the key that was pressed in a keyboard event. */
    @stub
    val key: Int = ???

    /** The state of the modifier keys. */
    @stub
    val modifiers: Int = ???

    /** The target component. */
    @stub
    val target: Object = ???

    /** The time stamp. */
    @stub
    val when: Long = ???

    /** The x coordinate of the event. */
    @stub
    val x: Int = ???

    /** The y coordinate of the event. */
    @stub
    val y: Int = ???

    /** NOTE: The Event class is obsolete and is
     *  available only for backwards compatibility.
     */
    @stub
    def controlDown(): Boolean = ???

    /** NOTE: The Event class is obsolete and is
     *  available only for backwards compatibility.
     */
    @stub
    def metaDown(): Boolean = ???

    /** NOTE: The Event class is obsolete and is
     *  available only for backwards compatibility.
     */
    @stub
    protected def paramString(): String = ???

    /** NOTE: The Event class is obsolete and is
     *  available only for backwards compatibility.
     */
    @stub
    def shiftDown(): Boolean = ???

    /** NOTE: The Event class is obsolete and is
     *  available only for backwards compatibility.
     */
    @stub
    def toString(): String = ???

    /** NOTE: The Event class is obsolete and is
     *  available only for backwards compatibility.
     */
    @stub
    def translate(dx: Int, dy: Int): Unit = ???
}

object Event {
    /** This event indicates that the user wants some action to occur. */
    @stub
    val ACTION_EVENT: Int = ???

    /** This flag indicates that the Alt key was down when
     *  the event occurred.
     */
    @stub
    val ALT_MASK: Int = ???

    /** The BackSpace key. */
    @stub
    val BACK_SPACE: Int = ???

    /** The Caps Lock key, a non-ASCII action key. */
    @stub
    val CAPS_LOCK: Int = ???

    /** This flag indicates that the Control key was down when the event
     *  occurred.
     */
    @stub
    val CTRL_MASK: Int = ???

    /** The Delete key. */
    @stub
    val DELETE: Int = ???

    /** The Down Arrow key, a non-ASCII action key. */
    @stub
    val DOWN: Int = ???

    /** The End key, a non-ASCII action key. */
    @stub
    val END: Int = ???

    /** The Enter key. */
    @stub
    val ENTER: Int = ???

    /** The Escape key. */
    @stub
    val ESCAPE: Int = ???

    /** The F1 function key, a non-ASCII action key. */
    @stub
    val F1: Int = ???

    /** The F10 function key, a non-ASCII action key. */
    @stub
    val F10: Int = ???

    /** The F11 function key, a non-ASCII action key. */
    @stub
    val F11: Int = ???

    /** The F12 function key, a non-ASCII action key. */
    @stub
    val F12: Int = ???

    /** The F2 function key, a non-ASCII action key. */
    @stub
    val F2: Int = ???

    /** The F3 function key, a non-ASCII action key. */
    @stub
    val F3: Int = ???

    /** The F4 function key, a non-ASCII action key. */
    @stub
    val F4: Int = ???

    /** The F5 function key, a non-ASCII action key. */
    @stub
    val F5: Int = ???

    /** The F6 function key, a non-ASCII action key. */
    @stub
    val F6: Int = ???

    /** The F7 function key, a non-ASCII action key. */
    @stub
    val F7: Int = ???

    /** The F8 function key, a non-ASCII action key. */
    @stub
    val F8: Int = ???

    /** The F9 function key, a non-ASCII action key. */
    @stub
    val F9: Int = ???

    /** A component gained the focus. */
    @stub
    val GOT_FOCUS: Int = ???

    /** The Home key, a non-ASCII action key. */
    @stub
    val HOME: Int = ???

    /** The Insert key, a non-ASCII action key. */
    @stub
    val INSERT: Int = ???

    /** The user has pressed a non-ASCII action key. */
    @stub
    val KEY_ACTION: Int = ???

    /** The user has released a non-ASCII action key. */
    @stub
    val KEY_ACTION_RELEASE: Int = ???

    /** The user has pressed a normal key. */
    @stub
    val KEY_PRESS: Int = ???

    /** The user has released a normal key. */
    @stub
    val KEY_RELEASE: Int = ???

    /** The Left Arrow key, a non-ASCII action key. */
    @stub
    val LEFT: Int = ???

    /** An item in a list has been deselected. */
    @stub
    val LIST_DESELECT: Int = ???

    /** An item in a list has been selected. */
    @stub
    val LIST_SELECT: Int = ???

    /** A file loading event. */
    @stub
    val LOAD_FILE: Int = ???

    /** A component lost the focus. */
    @stub
    val LOST_FOCUS: Int = ???

    /** This flag indicates that the Meta key was down when the event
     *  occurred.
     */
    @stub
    val META_MASK: Int = ???

    /** The user has pressed the mouse button. */
    @stub
    val MOUSE_DOWN: Int = ???

    /** The user has moved the mouse with a button pressed. */
    @stub
    val MOUSE_DRAG: Int = ???

    /** The mouse has entered a component. */
    @stub
    val MOUSE_ENTER: Int = ???

    /** The mouse has exited a component. */
    @stub
    val MOUSE_EXIT: Int = ???

    /** The mouse has moved with no button pressed. */
    @stub
    val MOUSE_MOVE: Int = ???

    /** The user has released the mouse button. */
    @stub
    val MOUSE_UP: Int = ???

    /** The Num Lock key, a non-ASCII action key. */
    @stub
    val NUM_LOCK: Int = ???

    /** The Pause key, a non-ASCII action key. */
    @stub
    val PAUSE: Int = ???

    /** The Page Down key, a non-ASCII action key. */
    @stub
    val PGDN: Int = ???

    /** The Page Up key, a non-ASCII action key. */
    @stub
    val PGUP: Int = ???

    /** The Print Screen key, a non-ASCII action key. */
    @stub
    val PRINT_SCREEN: Int = ???

    /** The Right Arrow key, a non-ASCII action key. */
    @stub
    val RIGHT: Int = ???

    /** A file saving event. */
    @stub
    val SAVE_FILE: Int = ???

    /** The user has moved the bubble (thumb) in a scroll bar,
     *  moving to an "absolute" position, rather than to
     *  an offset from the last position.
     */
    @stub
    val SCROLL_ABSOLUTE: Int = ???

    /** The scroll begin event. */
    @stub
    val SCROLL_BEGIN: Int = ???

    /** The scroll end event. */
    @stub
    val SCROLL_END: Int = ???

    /** The user has activated the line down
     *  area of a scroll bar.
     */
    @stub
    val SCROLL_LINE_DOWN: Int = ???

    /** The user has activated the line up
     *  area of a scroll bar.
     */
    @stub
    val SCROLL_LINE_UP: Int = ???

    /** The Scroll Lock key, a non-ASCII action key. */
    @stub
    val SCROLL_LOCK: Int = ???

    /** The user has activated the page down
     *  area of a scroll bar.
     */
    @stub
    val SCROLL_PAGE_DOWN: Int = ???

    /** The user has activated the page up
     *  area of a scroll bar.
     */
    @stub
    val SCROLL_PAGE_UP: Int = ???

    /** This flag indicates that the Shift key was down when the event
     *  occurred.
     */
    @stub
    val SHIFT_MASK: Int = ???

    /** The Tab key. */
    @stub
    val TAB: Int = ???

    /** The Up Arrow key, a non-ASCII action key. */
    @stub
    val UP: Int = ???

    /** The user has asked the window manager to de-iconify the window. */
    @stub
    val WINDOW_DEICONIFY: Int = ???

    /** The user has asked the window manager to kill the window. */
    @stub
    val WINDOW_DESTROY: Int = ???

    /** The user has asked the window manager to expose the window. */
    @stub
    val WINDOW_EXPOSE: Int = ???

    /** The user has asked the window manager to iconify the window. */
    @stub
    val WINDOW_ICONIFY: Int = ???

    /** The user has asked the window manager to move the window. */
    @stub
    val WINDOW_MOVED: Int = ???
}

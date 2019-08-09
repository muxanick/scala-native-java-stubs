package java.awt

import java.io.Serializable
import java.lang.{Object, String}

// NOTE: The Event class is obsolete and is
// available only for backwards compatibility.  It has been replaced
// by the AWTEvent class and its subclasses.
// 
// Event is a platform-independent class that
// encapsulates events from the platform's Graphical User
// Interface in the Java 1.0 event model. In Java 1.1
// and later versions, the Event class is maintained
// only for backwards compatibility. The information in this
// class description is provided to assist programmers in
// converting Java 1.0 programs to the new event model.
// 
// In the Java 1.0 event model, an event contains an
// id field
// that indicates what type of event it is and which other
// Event variables are relevant for the event.
// 
// For keyboard events, key
// contains a value indicating which key was activated, and
// modifiers contains the
// modifiers for that event.  For the KEY_PRESS and KEY_RELEASE
// event ids, the value of key is the unicode
// character code for the key. For KEY_ACTION and
// KEY_ACTION_RELEASE, the value of key is
// one of the defined action-key identifiers in the
// Event class (PGUP,
// PGDN, F1, F2, etc).
class Event extends Object with Serializable {

    @stub
    // NOTE: The Event class is obsolete and is
    // available only for backwards compatibility.
    def this(target: Object, id: Int, arg: Object) = ???

    @stub
    // NOTE: The Event class is obsolete and is
    // available only for backwards compatibility.
    def this(target: Object, when: Long, id: Int, x: Int, y: Int, key: Int, modifiers: Int) = ???

    @stub
    // An arbitrary argument of the event.
    def arg: Object = ???

    @stub
    // For MOUSE_DOWN events, this field indicates the
    // number of consecutive clicks.
    def clickCount: Int = ???

    @stub
    // The next event.
    def evt: Event = ???

    @stub
    // Indicates which type of event the event is, and which
    // other Event variables are relevant for the event.
    def id: Int = ???

    @stub
    // The key code of the key that was pressed in a keyboard event.
    def key: Int = ???

    @stub
    // The state of the modifier keys.
    def modifiers: Int = ???

    @stub
    // The target component.
    def target: Object = ???

    @stub
    // The time stamp.
    def when: Long = ???

    @stub
    // The x coordinate of the event.
    def x: Int = ???

    @stub
    // NOTE: The Event class is obsolete and is
    // available only for backwards compatibility.
    def controlDown(): Boolean = ???

    @stub
    // NOTE: The Event class is obsolete and is
    // available only for backwards compatibility.
    def metaDown(): Boolean = ???

    @stub
    // NOTE: The Event class is obsolete and is
    // available only for backwards compatibility.
    protected def paramString(): String = ???

    @stub
    // NOTE: The Event class is obsolete and is
    // available only for backwards compatibility.
    def shiftDown(): Boolean = ???

    @stub
    // NOTE: The Event class is obsolete and is
    // available only for backwards compatibility.
    def toString(): String = ???
}

object Event {
    @stub
    // This event indicates that the user wants some action to occur.
    def ACTION_EVENT: Int = ???

    @stub
    // This flag indicates that the Alt key was down when
    // the event occurred.
    def ALT_MASK: Int = ???

    @stub
    // The BackSpace key.
    def BACK_SPACE: Int = ???

    @stub
    // The Caps Lock key, a non-ASCII action key.
    def CAPS_LOCK: Int = ???

    @stub
    // This flag indicates that the Control key was down when the event
    // occurred.
    def CTRL_MASK: Int = ???

    @stub
    // The Delete key.
    def DELETE: Int = ???

    @stub
    // The Down Arrow key, a non-ASCII action key.
    def DOWN: Int = ???

    @stub
    // The End key, a non-ASCII action key.
    def END: Int = ???

    @stub
    // The Enter key.
    def ENTER: Int = ???

    @stub
    // The Escape key.
    def ESCAPE: Int = ???

    @stub
    // The F1 function key, a non-ASCII action key.
    def F1: Int = ???

    @stub
    // The F10 function key, a non-ASCII action key.
    def F10: Int = ???

    @stub
    // The F11 function key, a non-ASCII action key.
    def F11: Int = ???

    @stub
    // The F12 function key, a non-ASCII action key.
    def F12: Int = ???

    @stub
    // The F2 function key, a non-ASCII action key.
    def F2: Int = ???

    @stub
    // The F3 function key, a non-ASCII action key.
    def F3: Int = ???

    @stub
    // The F4 function key, a non-ASCII action key.
    def F4: Int = ???

    @stub
    // The F5 function key, a non-ASCII action key.
    def F5: Int = ???

    @stub
    // The F6 function key, a non-ASCII action key.
    def F6: Int = ???

    @stub
    // The F7 function key, a non-ASCII action key.
    def F7: Int = ???

    @stub
    // The F8 function key, a non-ASCII action key.
    def F8: Int = ???

    @stub
    // The F9 function key, a non-ASCII action key.
    def F9: Int = ???

    @stub
    // A component gained the focus.
    def GOT_FOCUS: Int = ???

    @stub
    // The Home key, a non-ASCII action key.
    def HOME: Int = ???

    @stub
    // The Insert key, a non-ASCII action key.
    def INSERT: Int = ???

    @stub
    // The user has pressed a non-ASCII action key.
    def KEY_ACTION: Int = ???

    @stub
    // The user has released a non-ASCII action key.
    def KEY_ACTION_RELEASE: Int = ???

    @stub
    // The user has pressed a normal key.
    def KEY_PRESS: Int = ???

    @stub
    // The user has released a normal key.
    def KEY_RELEASE: Int = ???

    @stub
    // The Left Arrow key, a non-ASCII action key.
    def LEFT: Int = ???

    @stub
    // An item in a list has been deselected.
    def LIST_DESELECT: Int = ???

    @stub
    // An item in a list has been selected.
    def LIST_SELECT: Int = ???

    @stub
    // A file loading event.
    def LOAD_FILE: Int = ???

    @stub
    // A component lost the focus.
    def LOST_FOCUS: Int = ???

    @stub
    // This flag indicates that the Meta key was down when the event
    // occurred.
    def META_MASK: Int = ???

    @stub
    // The user has pressed the mouse button.
    def MOUSE_DOWN: Int = ???

    @stub
    // The user has moved the mouse with a button pressed.
    def MOUSE_DRAG: Int = ???

    @stub
    // The mouse has entered a component.
    def MOUSE_ENTER: Int = ???

    @stub
    // The mouse has exited a component.
    def MOUSE_EXIT: Int = ???

    @stub
    // The mouse has moved with no button pressed.
    def MOUSE_MOVE: Int = ???

    @stub
    // The user has released the mouse button.
    def MOUSE_UP: Int = ???

    @stub
    // The Num Lock key, a non-ASCII action key.
    def NUM_LOCK: Int = ???

    @stub
    // The Pause key, a non-ASCII action key.
    def PAUSE: Int = ???

    @stub
    // The Page Down key, a non-ASCII action key.
    def PGDN: Int = ???

    @stub
    // The Page Up key, a non-ASCII action key.
    def PGUP: Int = ???

    @stub
    // The Print Screen key, a non-ASCII action key.
    def PRINT_SCREEN: Int = ???

    @stub
    // The Right Arrow key, a non-ASCII action key.
    def RIGHT: Int = ???

    @stub
    // A file saving event.
    def SAVE_FILE: Int = ???

    @stub
    // The user has moved the bubble (thumb) in a scroll bar,
    // moving to an "absolute" position, rather than to
    // an offset from the last position.
    def SCROLL_ABSOLUTE: Int = ???

    @stub
    // The scroll begin event.
    def SCROLL_BEGIN: Int = ???

    @stub
    // The scroll end event.
    def SCROLL_END: Int = ???

    @stub
    // The user has activated the line down
    // area of a scroll bar.
    def SCROLL_LINE_DOWN: Int = ???

    @stub
    // The user has activated the line up
    // area of a scroll bar.
    def SCROLL_LINE_UP: Int = ???

    @stub
    // The Scroll Lock key, a non-ASCII action key.
    def SCROLL_LOCK: Int = ???

    @stub
    // The user has activated the page down
    // area of a scroll bar.
    def SCROLL_PAGE_DOWN: Int = ???

    @stub
    // The user has activated the page up
    // area of a scroll bar.
    def SCROLL_PAGE_UP: Int = ???

    @stub
    // This flag indicates that the Shift key was down when the event
    // occurred.
    def SHIFT_MASK: Int = ???

    @stub
    // The Tab key.
    def TAB: Int = ???

    @stub
    // The Up Arrow key, a non-ASCII action key.
    def UP: Int = ???

    @stub
    // The user has asked the window manager to de-iconify the window.
    def WINDOW_DEICONIFY: Int = ???

    @stub
    // The user has asked the window manager to kill the window.
    def WINDOW_DESTROY: Int = ???

    @stub
    // The user has asked the window manager to expose the window.
    def WINDOW_EXPOSE: Int = ???

    @stub
    // The user has asked the window manager to iconify the window.
    def WINDOW_ICONIFY: Int = ???

    @stub
    // The user has asked the window manager to move the window.
    def WINDOW_MOVED: Int = ???
}

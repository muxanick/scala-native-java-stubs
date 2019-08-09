package java.awt.event

import java.util.EventListener

// The listener interface for receiving window state events.
// 
// The class that is interested in processing a window state event
// either implements this interface (and all the methods it contains)
// or extends the abstract WindowAdapter class
// (overriding only the methods of interest).
// 
// The listener object created from that class is then registered with
// a window using the Window's
// addWindowStateListener method.  When the window's
// state changes by virtue of being iconified, maximized etc., the
// windowStateChanged method in the listener object is
// invoked, and the WindowEvent is passed to it.
trait WindowStateListener extends EventListener {
}

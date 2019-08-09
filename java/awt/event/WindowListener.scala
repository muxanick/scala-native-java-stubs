package java.awt.event

import java.util.EventListener

/** The listener interface for receiving window events.
 *  The class that is interested in processing a window event
 *  either implements this interface (and all the methods it
 *  contains) or extends the abstract WindowAdapter class
 *  (overriding only the methods of interest).
 *  The listener object created from that class is then registered with a
 *  Window using the window's addWindowListener
 *  method. When the window's status changes by virtue of being opened,
 *  closed, activated or deactivated, iconified or deiconified,
 *  the relevant method in the listener object is invoked, and the
 *  WindowEvent is passed to it.
 */
trait WindowListener extends EventListener {

    /** Invoked when the Window is set to be the active Window. */
    @stub
    def windowActivated(e: WindowEvent): Unit = ???

    /** Invoked when a window has been closed as the result
     *  of calling dispose on the window.
     */
    @stub
    def windowClosed(e: WindowEvent): Unit = ???

    /** Invoked when the user attempts to close the window
     *  from the window's system menu.
     */
    @stub
    def windowClosing(e: WindowEvent): Unit = ???

    /** Invoked when a Window is no longer the active Window. */
    @stub
    def windowDeactivated(e: WindowEvent): Unit = ???

    /** Invoked when a window is changed from a minimized
     *  to a normal state.
     */
    @stub
    def windowDeiconified(e: WindowEvent): Unit = ???

    /** Invoked when a window is changed from a normal to a
     *  minimized state.
     */
    @stub
    def windowIconified(e: WindowEvent): Unit = ???
}

package java.awt.event

import java.lang.Object
import scala.scalanative.annotation.stub

/** An abstract adapter class for receiving window events.
 *  The methods in this class are empty. This class exists as
 *  convenience for creating listener objects.
 *  
 *  Extend this class to create a WindowEvent listener
 *  and override the methods for the events of interest. (If you implement the
 *  WindowListener interface, you have to define all of
 *  the methods in it. This abstract class defines null methods for them
 *  all, so you can only have to define methods for events you care about.)
 *  
 *  Create a listener object using the extended class and then register it with
 *  a Window using the window's addWindowListener
 *  method. When the window's status changes by virtue of being opened,
 *  closed, activated or deactivated, iconified or deiconified,
 *  the relevant method in the listener
 *  object is invoked, and the WindowEvent is passed to it.
 */
abstract class WindowAdapter extends Object with WindowListener with WindowStateListener with WindowFocusListener {

    /**  */
    @stub
    def this() = ???

    /** Invoked when a window is activated. */
    def windowActivated(e: WindowEvent): Unit

    /** Invoked when a window has been closed. */
    def windowClosed(e: WindowEvent): Unit

    /** Invoked when a window is in the process of being closed. */
    def windowClosing(e: WindowEvent): Unit

    /** Invoked when a window is de-activated. */
    def windowDeactivated(e: WindowEvent): Unit

    /** Invoked when a window is de-iconified. */
    def windowDeiconified(e: WindowEvent): Unit

    /** Invoked when the Window is set to be the focused Window, which means
     *  that the Window, or one of its subcomponents, will receive keyboard
     *  events.
     */
    def windowGainedFocus(e: WindowEvent): Unit

    /** Invoked when a window is iconified. */
    def windowIconified(e: WindowEvent): Unit

    /** Invoked when the Window is no longer the focused Window, which means
     *  that keyboard events will no longer be delivered to the Window or any of
     *  its subcomponents.
     */
    def windowLostFocus(e: WindowEvent): Unit

    /** Invoked when a window has been opened. */
    def windowOpened(e: WindowEvent): Unit

    /** Invoked when a window state is changed. */
    def windowStateChanged(e: WindowEvent): Unit
}

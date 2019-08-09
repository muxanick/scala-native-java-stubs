package javax.swing

import java.awt.Rectangle
import java.io.Serializable
import java.lang.{Boolean, Object}

/** This is an implementation of the DesktopManager.
 *  It currently implements the basic behaviors for managing
 *  JInternalFrames in an arbitrary parent.
 *  JInternalFrames that are not children of a
 *  JDesktop will use this component
 *  to handle their desktop-like actions.
 *  This class provides a policy for the various JInternalFrame methods,
 *  it is not meant to be called directly rather the various JInternalFrame
 *  methods will call into the DesktopManager.
 */
class DefaultDesktopManager extends Object with DesktopManager with Serializable {

    /** This will activate f moving it to the front. */
    @stub
    def activateFrame(f: JInternalFrame): Unit = ???

    /** This method is normally called when the user has indicated that
     *  they will begin dragging a component around.
     */
    @stub
    def beginDraggingFrame(f: JComponent): Unit = ???

    /** This methods is normally called when the user has indicated that
     *  they will begin resizing the frame.
     */
    @stub
    def beginResizingFrame(f: JComponent, direction: Int): Unit = ???

    /** Removes the frame, and, if necessary, the
     *  desktopIcon, from its parent.
     */
    @stub
    def closeFrame(f: JInternalFrame): Unit = ???

    /** Generally, indicate that this frame has lost focus. */
    @stub
    def deactivateFrame(f: JInternalFrame): Unit = ???

    /** Removes the desktopIcon from its parent and adds its frame
     *  to the parent.
     */
    @stub
    def deiconifyFrame(f: JInternalFrame): Unit = ???

    /** Moves the visible location of the frame being dragged
     *  to the location specified.
     */
    @stub
    def dragFrame(f: JComponent, newX: Int, newY: Int): Unit = ???

    /** This method signals the end of the dragging session. */
    @stub
    def endDraggingFrame(f: JComponent): Unit = ???

    /** This method signals the end of the resize session. */
    @stub
    def endResizingFrame(f: JComponent): Unit = ???

    /** The iconifyFrame() code calls this to determine the proper bounds
     *  for the desktopIcon.
     */
    @stub
    protected def getBoundsForIconOf(f: JInternalFrame): Rectangle = ???

    /** Gets the normal bounds of the component prior to the component
     *  being maximized.
     */
    @stub
    protected def getPreviousBounds(f: JInternalFrame): Rectangle = ???

    /** Removes the frame from its parent and adds its
     *  desktopIcon to the parent.
     */
    @stub
    def iconifyFrame(f: JInternalFrame): Unit = ???

    /** Resizes the frame to fill its parents bounds. */
    @stub
    def maximizeFrame(f: JInternalFrame): Unit = ???

    /** Restores the frame back to its size and position prior
     *  to a maximizeFrame call.
     */
    @stub
    def minimizeFrame(f: JInternalFrame): Unit = ???

    /** Normally this method will not be called. */
    @stub
    def openFrame(f: JInternalFrame): Unit = ???

    /** Convenience method to remove the desktopIcon of f is necessary. */
    @stub
    protected def removeIconFor(f: JInternalFrame): Unit = ???

    /** Calls setBoundsForFrame with the new values. */
    @stub
    def resizeFrame(f: JComponent, newX: Int, newY: Int, newWidth: Int, newHeight: Int): Unit = ???

    /** This moves the JComponent and repaints the damaged areas. */
    @stub
    def setBoundsForFrame(f: JComponent, newX: Int, newY: Int, newWidth: Int, newHeight: Int): Unit = ???

    /** Stores the bounds of the component just before a maximize call. */
    @stub
    protected def setPreviousBounds(f: JInternalFrame, r: Rectangle): Unit = ???

    /** Sets that the component has been iconized and the bounds of the
     *  desktopIcon are valid.
     */
    @stub
    protected def setWasIcon(f: JInternalFrame, value: Boolean): Unit = ???
}

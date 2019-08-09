package javax.swing

import java.awt.Rectangle
import java.io.Serializable
import java.lang.{Boolean, Object}

// This is an implementation of the DesktopManager.
// It currently implements the basic behaviors for managing
// JInternalFrames in an arbitrary parent.
// JInternalFrames that are not children of a
// JDesktop will use this component
// to handle their desktop-like actions.
// This class provides a policy for the various JInternalFrame methods,
// it is not meant to be called directly rather the various JInternalFrame
// methods will call into the DesktopManager.
class DefaultDesktopManager extends Object with DesktopManager, with Serializable {

    @stub
    // This will activate f moving it to the front.
    def activateFrame(f: JInternalFrame): Unit = ???

    @stub
    // This method is normally called when the user has indicated that
    // they will begin dragging a component around.
    def beginDraggingFrame(f: JComponent): Unit = ???

    @stub
    // This methods is normally called when the user has indicated that
    // they will begin resizing the frame.
    def beginResizingFrame(f: JComponent, direction: Int): Unit = ???

    @stub
    // Removes the frame, and, if necessary, the
    // desktopIcon, from its parent.
    def closeFrame(f: JInternalFrame): Unit = ???

    @stub
    // Generally, indicate that this frame has lost focus.
    def deactivateFrame(f: JInternalFrame): Unit = ???

    @stub
    // Removes the desktopIcon from its parent and adds its frame
    // to the parent.
    def deiconifyFrame(f: JInternalFrame): Unit = ???

    @stub
    // Moves the visible location of the frame being dragged
    // to the location specified.
    def dragFrame(f: JComponent, newX: Int, newY: Int): Unit = ???

    @stub
    // This method signals the end of the dragging session.
    def endDraggingFrame(f: JComponent): Unit = ???

    @stub
    // This method signals the end of the resize session.
    def endResizingFrame(f: JComponent): Unit = ???

    @stub
    // The iconifyFrame() code calls this to determine the proper bounds
    // for the desktopIcon.
    protected def getBoundsForIconOf(f: JInternalFrame): Rectangle = ???

    @stub
    // Gets the normal bounds of the component prior to the component
    // being maximized.
    protected def getPreviousBounds(f: JInternalFrame): Rectangle = ???

    @stub
    // Removes the frame from its parent and adds its
    // desktopIcon to the parent.
    def iconifyFrame(f: JInternalFrame): Unit = ???

    @stub
    // Resizes the frame to fill its parents bounds.
    def maximizeFrame(f: JInternalFrame): Unit = ???

    @stub
    // Restores the frame back to its size and position prior
    // to a maximizeFrame call.
    def minimizeFrame(f: JInternalFrame): Unit = ???

    @stub
    // Normally this method will not be called.
    def openFrame(f: JInternalFrame): Unit = ???

    @stub
    // Convenience method to remove the desktopIcon of f is necessary.
    protected def removeIconFor(f: JInternalFrame): Unit = ???

    @stub
    // Calls setBoundsForFrame with the new values.
    def resizeFrame(f: JComponent, newX: Int, newY: Int, newWidth: Int, newHeight: Int): Unit = ???

    @stub
    // This moves the JComponent and repaints the damaged areas.
    def setBoundsForFrame(f: JComponent, newX: Int, newY: Int, newWidth: Int, newHeight: Int): Unit = ???

    @stub
    // Stores the bounds of the component just before a maximize call.
    protected def setPreviousBounds(f: JInternalFrame, r: Rectangle): Unit = ???

    @stub
    // Sets that the component has been iconized and the bounds of the
    // desktopIcon are valid.
    protected def setWasIcon(f: JInternalFrame, value: Boolean): Unit = ???
}

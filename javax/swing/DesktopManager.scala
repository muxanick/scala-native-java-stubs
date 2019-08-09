package javax.swing

// DesktopManager objects are owned by a JDesktopPane object. They are responsible
// for implementing L&F specific behaviors for the JDesktopPane. JInternalFrame
// implementations should delegate specific behaviors to the DesktopManager. For
// instance, if a JInternalFrame was asked to iconify, it should try:
// 
//    getDesktopPane().getDesktopManager().iconifyFrame(frame);
// 
// This delegation allows each L&F to provide custom behaviors for desktop-specific
// actions. (For example, how and where the internal frame's icon would appear.)
// This class provides a policy for the various JInternalFrame methods, it is not
// meant to be called directly rather the various JInternalFrame methods will call
// into the DesktopManager.
trait DesktopManager {

    @stub
    // Generally, indicate that this frame has focus.
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
    // Generally, this call should remove the frame from it's parent.
    def closeFrame(f: JInternalFrame): Unit = ???

    @stub
    // Generally, indicate that this frame has lost focus.
    def deactivateFrame(f: JInternalFrame): Unit = ???

    @stub
    // Generally, remove any iconic representation that is present and restore the
    // frame to it's original size and location.
    def deiconifyFrame(f: JInternalFrame): Unit = ???

    @stub
    // The user has moved the frame.
    def dragFrame(f: JComponent, newX: Int, newY: Int): Unit = ???

    @stub
    // This method signals the end of the dragging session.
    def endDraggingFrame(f: JComponent): Unit = ???

    @stub
    // This method signals the end of the resize session.
    def endResizingFrame(f: JComponent): Unit = ???

    @stub
    // Generally, remove this frame from it's parent and add an iconic representation.
    def iconifyFrame(f: JInternalFrame): Unit = ???

    @stub
    // Generally, the frame should be resized to match it's parents bounds.
    def maximizeFrame(f: JInternalFrame): Unit = ???

    @stub
    // Generally, this indicates that the frame should be restored to it's
    // size and position prior to a maximizeFrame() call.
    def minimizeFrame(f: JInternalFrame): Unit = ???

    @stub
    // If possible, display this frame in an appropriate location.
    def openFrame(f: JInternalFrame): Unit = ???

    @stub
    // The user has resized the component.
    def resizeFrame(f: JComponent, newX: Int, newY: Int, newWidth: Int, newHeight: Int): Unit = ???
}

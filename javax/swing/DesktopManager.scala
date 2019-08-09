package javax.swing

import scala.scalanative.annotation.stub

/** DesktopManager objects are owned by a JDesktopPane object. They are responsible
 *  for implementing L&F specific behaviors for the JDesktopPane. JInternalFrame
 *  implementations should delegate specific behaviors to the DesktopManager. For
 *  instance, if a JInternalFrame was asked to iconify, it should try:
 *  
 *     getDesktopPane().getDesktopManager().iconifyFrame(frame);
 *  
 *  This delegation allows each L&F to provide custom behaviors for desktop-specific
 *  actions. (For example, how and where the internal frame's icon would appear.)
 *  This class provides a policy for the various JInternalFrame methods, it is not
 *  meant to be called directly rather the various JInternalFrame methods will call
 *  into the DesktopManager.
 */
trait DesktopManager {

    /** Generally, indicate that this frame has focus. */
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

    /** Generally, this call should remove the frame from it's parent. */
    @stub
    def closeFrame(f: JInternalFrame): Unit = ???

    /** Generally, indicate that this frame has lost focus. */
    @stub
    def deactivateFrame(f: JInternalFrame): Unit = ???

    /** Generally, remove any iconic representation that is present and restore the
     *  frame to it's original size and location.
     */
    @stub
    def deiconifyFrame(f: JInternalFrame): Unit = ???

    /** The user has moved the frame. */
    @stub
    def dragFrame(f: JComponent, newX: Int, newY: Int): Unit = ???

    /** This method signals the end of the dragging session. */
    @stub
    def endDraggingFrame(f: JComponent): Unit = ???

    /** This method signals the end of the resize session. */
    @stub
    def endResizingFrame(f: JComponent): Unit = ???

    /** Generally, remove this frame from it's parent and add an iconic representation. */
    @stub
    def iconifyFrame(f: JInternalFrame): Unit = ???

    /** Generally, the frame should be resized to match it's parents bounds. */
    @stub
    def maximizeFrame(f: JInternalFrame): Unit = ???

    /** Generally, this indicates that the frame should be restored to it's
     *  size and position prior to a maximizeFrame() call.
     */
    @stub
    def minimizeFrame(f: JInternalFrame): Unit = ???

    /** If possible, display this frame in an appropriate location. */
    @stub
    def openFrame(f: JInternalFrame): Unit = ???

    /** The user has resized the component. */
    @stub
    def resizeFrame(f: JComponent, newX: Int, newY: Int, newWidth: Int, newHeight: Int): Unit = ???

    /** This is a primitive reshape method. */
    @stub
    def setBoundsForFrame(f: JComponent, newX: Int, newY: Int, newWidth: Int, newHeight: Int): Unit = ???
}

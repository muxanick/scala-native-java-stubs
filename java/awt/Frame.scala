package java.awt

import java.lang.{Object, String}
import javax.accessibility.AccessibleContext
import scala.scalanative.annotation.stub

/** A Frame is a top-level window with a title and a border.
 *  
 *  The size of the frame includes any area designated for the
 *  border.  The dimensions of the border area may be obtained
 *  using the getInsets method, however, since
 *  these dimensions are platform-dependent, a valid insets
 *  value cannot be obtained until the frame is made displayable
 *  by either calling pack or show.
 *  Since the border area is included in the overall size of the
 *  frame, the border effectively obscures a portion of the frame,
 *  constraining the area available for rendering and/or displaying
 *  subcomponents to the rectangle which has an upper-left corner
 *  location of (insets.left, insets.top), and has a size of
 *  width - (insets.left + insets.right) by
 *  height - (insets.top + insets.bottom).
 *  
 *  The default layout for a frame is BorderLayout.
 *  
 *  A frame may have its native decorations (i.e. Frame
 *  and Titlebar) turned off
 *  with setUndecorated. This can only be done while the frame
 *  is not displayable.
 *  
 *  In a multi-screen environment, you can create a Frame
 *  on a different screen device by constructing the Frame
 *  with Frame(GraphicsConfiguration) or
 *  Frame(String title, GraphicsConfiguration).  The
 *  GraphicsConfiguration object is one of the
 *  GraphicsConfiguration objects of the target screen
 *  device.
 *  
 *  In a virtual device multi-screen environment in which the desktop
 *  area could span multiple physical screen devices, the bounds of all
 *  configurations are relative to the virtual-coordinate system.  The
 *  origin of the virtual-coordinate system is at the upper left-hand
 *  corner of the primary physical screen.  Depending on the location
 *  of the primary screen in the virtual device, negative coordinates
 *  are possible, as shown in the following figure.
 *  
 *  
 *  
 *  In such an environment, when calling setLocation,
 *  you must pass a virtual coordinate to this method.  Similarly,
 *  calling getLocationOnScreen on a Frame
 *  returns virtual device coordinates.  Call the getBounds
 *  method of a GraphicsConfiguration to find its origin in
 *  the virtual coordinate system.
 *  
 *  The following code sets the
 *  location of the Frame at (10, 10) relative
 *  to the origin of the physical screen of the corresponding
 *  GraphicsConfiguration.  If the bounds of the
 *  GraphicsConfiguration is not taken into account, the
 *  Frame location would be set at (10, 10) relative to the
 *  virtual-coordinate system and would appear on the primary physical
 *  screen, which might be different from the physical screen of the
 *  specified GraphicsConfiguration.
 * 
 *  
 *       Frame f = new Frame(GraphicsConfiguration gc);
 *       Rectangle bounds = gc.getBounds();
 *       f.setLocation(10 + bounds.x, 10 + bounds.y);
 *  
 * 
 *  
 *  Frames are capable of generating the following types of
 *  WindowEvents:
 *  
 *  WINDOW_OPENED
 *  WINDOW_CLOSING:
 *      If the program doesn't
 *      explicitly hide or dispose the window while processing
 *      this event, the window close operation is canceled.
 *  WINDOW_CLOSED
 *  WINDOW_ICONIFIED
 *  WINDOW_DEICONIFIED
 *  WINDOW_ACTIVATED
 *  WINDOW_DEACTIVATED
 *  WINDOW_GAINED_FOCUS
 *  WINDOW_LOST_FOCUS
 *  WINDOW_STATE_CHANGED
 *  
 */
class Frame extends Window with MenuContainer {

    /** Constructs a new instance of Frame that is
     *  initially invisible.
     */
    @stub
    def this() = ???

    /** Constructs a new, initially invisible Frame with the
     *  specified GraphicsConfiguration.
     */
    @stub
    def this(gc: GraphicsConfiguration) = ???

    /** Constructs a new, initially invisible Frame object
     *  with the specified title.
     */
    @stub
    def this(title: String) = ???

    /** Constructs a new, initially invisible Frame object
     *  with the specified title and a
     *  GraphicsConfiguration.
     */
    @stub
    def this(title: String, gc: GraphicsConfiguration) = ???

    /** This class implements accessibility support for the
     *  Frame class.
     */
    @stub
    protected object AccessibleAWTFrame extends Frame.AccessibleAWTFrame

    /** Makes this Frame displayable by connecting it to
     *  a native screen resource.
     */
    @stub
    def addNotify(): Unit = ???

    /** Gets the AccessibleContext associated with this Frame. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Component.getCursor().
     * 
     */
    @stub
    def getCursorType(): Int = ???

    /** Gets the state of this frame. */
    @stub
    def getExtendedState(): Int = ???

    /** Returns the image to be displayed as the icon for this frame. */
    @stub
    def getIconImage(): Image = ???

    /** Gets maximized bounds for this frame. */
    @stub
    def getMaximizedBounds(): Rectangle = ???

    /** Gets the menu bar for this frame. */
    @stub
    def getMenuBar(): MenuBar = ???

    /** Gets the state of this frame (obsolete). */
    @stub
    def getState(): Int = ???

    /** Gets the title of the frame. */
    @stub
    def getTitle(): String = ???

    /** Indicates whether this frame is resizable by the user. */
    @stub
    def isResizable(): Boolean = ???

    /** Indicates whether this frame is undecorated. */
    @stub
    def isUndecorated(): Boolean = ???

    /** Returns a string representing the state of this Frame. */
    @stub
    protected def paramString(): String = ???

    /** Removes the specified menu bar from this frame. */
    @stub
    def remove(m: MenuComponent): Unit = ???

    /** Makes this Frame undisplayable by removing its connection
     *  to its native screen resource.
     */
    @stub
    def removeNotify(): Unit = ???

    /** Sets the background color of this window. */
    @stub
    def setBackground(bgColor: Color): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Component.setCursor(Cursor).
     * 
     */
    @stub
    def setCursor(cursorType: Int): Unit = ???

    /** Sets the state of this frame. */
    @stub
    def setExtendedState(state: Int): Unit = ???

    /** Sets the image to be displayed as the icon for this window. */
    @stub
    def setIconImage(image: Image): Unit = ???

    /** Sets the maximized bounds for this frame. */
    @stub
    def setMaximizedBounds(bounds: Rectangle): Unit = ???

    /** Sets the menu bar for this frame to the specified menu bar. */
    @stub
    def setMenuBar(mb: MenuBar): Unit = ???

    /** Sets the opacity of the window. */
    @stub
    def setOpacity(opacity: Float): Unit = ???

    /** Sets whether this frame is resizable by the user. */
    @stub
    def setResizable(resizable: Boolean): Unit = ???

    /** Sets the shape of the window. */
    @stub
    def setShape(shape: Shape): Unit = ???

    /** Sets the state of this frame (obsolete). */
    @stub
    def setState(state: Int): Unit = ???

    /** Sets the title for this frame to the specified string. */
    @stub
    def setTitle(title: String): Unit = ???

    /** Disables or enables decorations for this frame. */
    @stub
    def setUndecorated(undecorated: Boolean): Unit = ???
}

object Frame {
    /** Deprecated. 
     * replaced by Cursor.CROSSHAIR_CURSOR.
     * 
     */
    @stub
    val CROSSHAIR_CURSOR: Int = ???

    /** Deprecated. 
     * replaced by Cursor.DEFAULT_CURSOR.
     * 
     */
    @stub
    val DEFAULT_CURSOR: Int = ???

    /** Deprecated. 
     * replaced by Cursor.E_RESIZE_CURSOR.
     * 
     */
    @stub
    val E_RESIZE_CURSOR: Int = ???

    /** Deprecated. 
     * replaced by Cursor.HAND_CURSOR.
     * 
     */
    @stub
    val HAND_CURSOR: Int = ???

    /** This state bit indicates that frame is iconified. */
    @stub
    val ICONIFIED: Int = ???

    /** This state bit mask indicates that frame is fully maximized
     *  (that is both horizontally and vertically).
     */
    @stub
    val MAXIMIZED_BOTH: Int = ???

    /** This state bit indicates that frame is maximized in the
     *  horizontal direction.
     */
    @stub
    val MAXIMIZED_HORIZ: Int = ???

    /** This state bit indicates that frame is maximized in the
     *  vertical direction.
     */
    @stub
    val MAXIMIZED_VERT: Int = ???

    /** Deprecated. 
     * replaced by Cursor.MOVE_CURSOR.
     * 
     */
    @stub
    val MOVE_CURSOR: Int = ???

    /** Deprecated. 
     * replaced by Cursor.N_RESIZE_CURSOR.
     * 
     */
    @stub
    val N_RESIZE_CURSOR: Int = ???

    /** Deprecated. 
     * replaced by Cursor.NE_RESIZE_CURSOR.
     * 
     */
    @stub
    val NE_RESIZE_CURSOR: Int = ???

    /** Frame is in the "normal" state. */
    @stub
    val NORMAL: Int = ???

    /** Deprecated. 
     * replaced by Cursor.NW_RESIZE_CURSOR.
     * 
     */
    @stub
    val NW_RESIZE_CURSOR: Int = ???

    /** Deprecated. 
     * replaced by Cursor.S_RESIZE_CURSOR.
     * 
     */
    @stub
    val S_RESIZE_CURSOR: Int = ???

    /** Deprecated. 
     * replaced by Cursor.SE_RESIZE_CURSOR.
     * 
     */
    @stub
    val SE_RESIZE_CURSOR: Int = ???

    /** Deprecated. 
     * replaced by Cursor.SW_RESIZE_CURSOR.
     * 
     */
    @stub
    val SW_RESIZE_CURSOR: Int = ???

    /** Deprecated. 
     * replaced by Cursor.TEXT_CURSOR.
     * 
     */
    @stub
    val TEXT_CURSOR: Int = ???

    /** Deprecated. 
     * replaced by Cursor.W_RESIZE_CURSOR.
     * 
     */
    @stub
    val W_RESIZE_CURSOR: Int = ???

    /** Deprecated. 
     * replaced by Cursor.WAIT_CURSOR.
     * 
     */
    @stub
    val WAIT_CURSOR: Int = ???

    /** Returns an array of all Frames created by this application. */
    @stub
    def getFrames(): Array[Frame] = ???
}

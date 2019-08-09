package java.awt

import java.lang.{Object, String}
import javax.accessibility.AccessibleContext

// A Frame is a top-level window with a title and a border.
// 
// The size of the frame includes any area designated for the
// border.  The dimensions of the border area may be obtained
// using the getInsets method, however, since
// these dimensions are platform-dependent, a valid insets
// value cannot be obtained until the frame is made displayable
// by either calling pack or show.
// Since the border area is included in the overall size of the
// frame, the border effectively obscures a portion of the frame,
// constraining the area available for rendering and/or displaying
// subcomponents to the rectangle which has an upper-left corner
// location of (insets.left, insets.top), and has a size of
// width - (insets.left + insets.right) by
// height - (insets.top + insets.bottom).
// 
// The default layout for a frame is BorderLayout.
// 
// A frame may have its native decorations (i.e. Frame
// and Titlebar) turned off
// with setUndecorated. This can only be done while the frame
// is not displayable.
// 
// In a multi-screen environment, you can create a Frame
// on a different screen device by constructing the Frame
// with Frame(GraphicsConfiguration) or
// Frame(String title, GraphicsConfiguration).  The
// GraphicsConfiguration object is one of the
// GraphicsConfiguration objects of the target screen
// device.
// 
// In a virtual device multi-screen environment in which the desktop
// area could span multiple physical screen devices, the bounds of all
// configurations are relative to the virtual-coordinate system.  The
// origin of the virtual-coordinate system is at the upper left-hand
// corner of the primary physical screen.  Depending on the location
// of the primary screen in the virtual device, negative coordinates
// are possible, as shown in the following figure.
// 
// 
// 
// In such an environment, when calling setLocation,
// you must pass a virtual coordinate to this method.  Similarly,
// calling getLocationOnScreen on a Frame
// returns virtual device coordinates.  Call the getBounds
// method of a GraphicsConfiguration to find its origin in
// the virtual coordinate system.
// 
// The following code sets the
// location of the Frame at (10, 10) relative
// to the origin of the physical screen of the corresponding
// GraphicsConfiguration.  If the bounds of the
// GraphicsConfiguration is not taken into account, the
// Frame location would be set at (10, 10) relative to the
// virtual-coordinate system and would appear on the primary physical
// screen, which might be different from the physical screen of the
// specified GraphicsConfiguration.
//
// 
//      Frame f = new Frame(GraphicsConfiguration gc);
//      Rectangle bounds = gc.getBounds();
//      f.setLocation(10 + bounds.x, 10 + bounds.y);
// 
//
// 
// Frames are capable of generating the following types of
// WindowEvents:
// 
// WINDOW_OPENED
// WINDOW_CLOSING:
//     If the program doesn't
//     explicitly hide or dispose the window while processing
//     this event, the window close operation is canceled.
// WINDOW_CLOSED
// WINDOW_ICONIFIED
// WINDOW_DEICONIFIED
// WINDOW_ACTIVATED
// WINDOW_DEACTIVATED
// WINDOW_GAINED_FOCUS
// WINDOW_LOST_FOCUS
// WINDOW_STATE_CHANGED
// 
class Frame extends Window with MenuContainer {

    @stub
    // Constructs a new instance of Frame that is
    // initially invisible.
    def this() = ???

    @stub
    // Constructs a new, initially invisible Frame with the
    // specified GraphicsConfiguration.
    def this(gc: GraphicsConfiguration) = ???

    @stub
    // Constructs a new, initially invisible Frame object
    // with the specified title.
    def this(title: String) = ???

    @stub
    // Makes this Frame displayable by connecting it to
    // a native screen resource.
    def addNotify(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this Frame.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by Component.getCursor().
    //
    def getCursorType(): Int = ???

    @stub
    // Gets the state of this frame.
    def getExtendedState(): Int = ???

    @stub
    // Returns the image to be displayed as the icon for this frame.
    def getIconImage(): Image = ???

    @stub
    // Gets maximized bounds for this frame.
    def getMaximizedBounds(): Rectangle = ???

    @stub
    // Gets the menu bar for this frame.
    def getMenuBar(): MenuBar = ???

    @stub
    // Gets the state of this frame (obsolete).
    def getState(): Int = ???

    @stub
    // Gets the title of the frame.
    def getTitle(): String = ???

    @stub
    // Indicates whether this frame is resizable by the user.
    def isResizable(): Boolean = ???

    @stub
    // Indicates whether this frame is undecorated.
    def isUndecorated(): Boolean = ???

    @stub
    // Returns a string representing the state of this Frame.
    protected def paramString(): String = ???

    @stub
    // Removes the specified menu bar from this frame.
    def remove(m: MenuComponent): Unit = ???

    @stub
    // Makes this Frame undisplayable by removing its connection
    // to its native screen resource.
    def removeNotify(): Unit = ???

    @stub
    // Sets the background color of this window.
    def setBackground(bgColor: Color): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by Component.setCursor(Cursor).
    //
    def setCursor(cursorType: Int): Unit = ???

    @stub
    // Sets the state of this frame.
    def setExtendedState(state: Int): Unit = ???

    @stub
    // Sets the image to be displayed as the icon for this window.
    def setIconImage(image: Image): Unit = ???

    @stub
    // Sets the maximized bounds for this frame.
    def setMaximizedBounds(bounds: Rectangle): Unit = ???

    @stub
    // Sets the menu bar for this frame to the specified menu bar.
    def setMenuBar(mb: MenuBar): Unit = ???

    @stub
    // Sets the opacity of the window.
    def setOpacity(opacity: float): Unit = ???

    @stub
    // Sets whether this frame is resizable by the user.
    def setResizable(resizable: Boolean): Unit = ???

    @stub
    // Sets the shape of the window.
    def setShape(shape: Shape): Unit = ???

    @stub
    // Sets the state of this frame (obsolete).
    def setState(state: Int): Unit = ???

    @stub
    // Sets the title for this frame to the specified string.
    def setTitle(title: String): Unit = ???
}

object Frame {
    @stub
    // Deprecated. 
    //replaced by Cursor.CROSSHAIR_CURSOR.
    //
    def CROSSHAIR_CURSOR: Int = ???

    @stub
    // Deprecated. 
    //replaced by Cursor.DEFAULT_CURSOR.
    //
    def DEFAULT_CURSOR: Int = ???

    @stub
    // Deprecated. 
    //replaced by Cursor.E_RESIZE_CURSOR.
    //
    def E_RESIZE_CURSOR: Int = ???

    @stub
    // Deprecated. 
    //replaced by Cursor.HAND_CURSOR.
    //
    def HAND_CURSOR: Int = ???

    @stub
    // This state bit indicates that frame is iconified.
    def ICONIFIED: Int = ???

    @stub
    // This state bit mask indicates that frame is fully maximized
    // (that is both horizontally and vertically).
    def MAXIMIZED_BOTH: Int = ???

    @stub
    // This state bit indicates that frame is maximized in the
    // horizontal direction.
    def MAXIMIZED_HORIZ: Int = ???

    @stub
    // This state bit indicates that frame is maximized in the
    // vertical direction.
    def MAXIMIZED_VERT: Int = ???

    @stub
    // Deprecated. 
    //replaced by Cursor.MOVE_CURSOR.
    //
    def MOVE_CURSOR: Int = ???

    @stub
    // Deprecated. 
    //replaced by Cursor.N_RESIZE_CURSOR.
    //
    def N_RESIZE_CURSOR: Int = ???

    @stub
    // Deprecated. 
    //replaced by Cursor.NE_RESIZE_CURSOR.
    //
    def NE_RESIZE_CURSOR: Int = ???

    @stub
    // Frame is in the "normal" state.
    def NORMAL: Int = ???

    @stub
    // Deprecated. 
    //replaced by Cursor.NW_RESIZE_CURSOR.
    //
    def NW_RESIZE_CURSOR: Int = ???

    @stub
    // Deprecated. 
    //replaced by Cursor.S_RESIZE_CURSOR.
    //
    def S_RESIZE_CURSOR: Int = ???

    @stub
    // Deprecated. 
    //replaced by Cursor.SE_RESIZE_CURSOR.
    //
    def SE_RESIZE_CURSOR: Int = ???

    @stub
    // Deprecated. 
    //replaced by Cursor.SW_RESIZE_CURSOR.
    //
    def SW_RESIZE_CURSOR: Int = ???

    @stub
    // Deprecated. 
    //replaced by Cursor.TEXT_CURSOR.
    //
    def TEXT_CURSOR: Int = ???

    @stub
    // Deprecated. 
    //replaced by Cursor.W_RESIZE_CURSOR.
    //
    def W_RESIZE_CURSOR: Int = ???

    @stub
    // Returns an array of all Frames created by this application.
    def getFrames(): Array[Frame] = ???
}

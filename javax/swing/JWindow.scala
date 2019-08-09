package javax.swing

import java.awt.{Component, Container, Frame, Graphics, GraphicsConfiguration, LayoutManager, Window}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}

// A JWindow is a container that can be displayed anywhere on the
// user's desktop. It does not have the title bar, window-management buttons,
// or other trimmings associated with a JFrame, but it is still a
// "first-class citizen" of the user's desktop, and can exist anywhere
// on it.
// 
// The JWindow component contains a JRootPane
// as its only child.  The contentPane should be the parent
// of any children of the JWindow.
// As a convenience, the add, remove, and setLayout
// methods of this class are overridden, so that they delegate calls
// to the corresponding methods of the ContentPane.
// For example, you can add a child component to a window as follows:
// 
//       window.add(child);
// 
// And the child will be added to the contentPane.
// The contentPane will always be non-null.
// Attempting to set it to null will cause the JWindow
// to throw an exception. The default contentPane will have a
// BorderLayout manager set on it.
// Refer to RootPaneContainer
// for details on adding, removing and setting the LayoutManager
// of a JWindow.
// 
// Please see the JRootPane documentation for a complete description of
// the contentPane, glassPane, and
// layeredPane components.
// 
// In a multi-screen environment, you can create a JWindow
// on a different screen device.  See Window for more
// information.
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class JWindow extends Window with Accessible, with RootPaneContainer {

    @stub
    // Creates a window with no specified owner.
    def this() = ???

    @stub
    // Creates a window with the specified owner frame.
    def this(owner: Frame) = ???

    @stub
    // Creates a window with the specified GraphicsConfiguration
    // of a screen device.
    def this(gc: GraphicsConfiguration) = ???

    @stub
    // Creates a window with the specified owner window.
    def this(owner: Window) = ???

    @stub
    // The accessible context property.
    protected def accessibleContext: AccessibleContext = ???

    @stub
    // The JRootPane instance that manages the
    // contentPane
    // and optional menuBar for this frame, as well as the
    // glassPane.
    protected def rootPane: JRootPane = ???

    @stub
    // Adds the specified child Component.
    protected def addImpl(comp: Component, constraints: Object, index: Int): Unit = ???

    @stub
    // Called by the constructor methods to create the default
    // rootPane.
    protected def createRootPane(): JRootPane = ???

    @stub
    // Gets the AccessibleContext associated with this JWindow.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the Container which is the contentPane
    // for this window.
    def getContentPane(): Container = ???

    @stub
    // Returns the glassPane Component for this window.
    def getGlassPane(): Component = ???

    @stub
    // Creates a graphics context for this component.
    def getGraphics(): Graphics = ???

    @stub
    // Returns the layeredPane object for this window.
    def getLayeredPane(): JLayeredPane = ???

    @stub
    // Returns the rootPane object for this window.
    def getRootPane(): JRootPane = ???

    @stub
    // Gets the transferHandler property.
    def getTransferHandler(): TransferHandler = ???

    @stub
    // Returns whether calls to add and
    // setLayout are forwarded to the contentPane.
    protected def isRootPaneCheckingEnabled(): Boolean = ???

    @stub
    // Returns a string representation of this JWindow.
    protected def paramString(): String = ???

    @stub
    // Removes the specified component from the container.
    def remove(comp: Component): Unit = ???

    @stub
    // Repaints the specified rectangle of this component within
    // time milliseconds.
    def repaint(time: Long, x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Sets the contentPane property for this window.
    def setContentPane(contentPane: Container): Unit = ???

    @stub
    // Sets the glassPane property.
    def setGlassPane(glassPane: Component): Unit = ???

    @stub
    // Sets the layeredPane property.
    def setLayeredPane(layeredPane: JLayeredPane): Unit = ???

    @stub
    // Sets the LayoutManager.
    def setLayout(manager: LayoutManager): Unit = ???

    @stub
    // Sets the new rootPane object for this window.
    protected def setRootPane(root: JRootPane): Unit = ???

    @stub
    // Sets whether calls to add and
    // setLayout are forwarded to the contentPane.
    protected def setRootPaneCheckingEnabled(enabled: Boolean): Unit = ???

    @stub
    // Sets the transferHandler property, which is a mechanism to
    // support transfer of data into this component.
    def setTransferHandler(newHandler: TransferHandler): Unit = ???

    @stub
    // Calls paint(g).
    def update(g: Graphics): Unit = ???
}

package javax.swing

import java.awt.{Component, Container, Frame, Graphics, GraphicsConfiguration, Image, LayoutManager, Window}
import java.awt.event.WindowEvent
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}

// An extended version of java.awt.Frame that adds support for
// the JFC/Swing component architecture.
// You can find task-oriented documentation about using JFrame
// in The Java Tutorial, in the section
// How to Make Frames.
//
// 
// The JFrame class is slightly incompatible with Frame.
// Like all other JFC/Swing top-level containers,
// a JFrame contains a JRootPane as its only child.
// The content pane provided by the root pane should,
// as a rule, contain
// all the non-menu components displayed by the JFrame.
// This is different from the AWT Frame case.
// As a convenience, the add, remove, and setLayout
// methods of this class are overridden, so that they delegate calls
// to the corresponding methods of the ContentPane.
// For example, you can add a child component to a frame as follows:
// 
//       frame.add(child);
// 
// And the child will be added to the contentPane.
// The content pane will
// always be non-null. Attempting to set it to null will cause the JFrame
// to throw an exception. The default content pane will have a BorderLayout
// manager set on it.
// Refer to RootPaneContainer
// for details on adding, removing and setting the LayoutManager
// of a JFrame.
// 
// Unlike a Frame, a JFrame has some notion of how to
// respond when the user attempts to close the window. The default behavior
// is to simply hide the JFrame when the user closes the window. To change the
// default behavior, you invoke the method
// setDefaultCloseOperation(int).
// To make the JFrame behave the same as a Frame
// instance, use
// setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE).
// 
// For more information on content panes
// and other features that root panes provide,
// see Using Top-Level Containers in The Java Tutorial.
// 
// In a multi-screen environment, you can create a JFrame
// on a different screen device.  See Frame for more
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
class JFrame extends Frame with WindowConstants, with Accessible, with RootPaneContainer {

    @stub
    // Constructs a new frame that is initially invisible.
    def this() = ???

    @stub
    // Creates a Frame in the specified
    // GraphicsConfiguration of
    // a screen device and a blank title.
    def this(gc: GraphicsConfiguration) = ???

    @stub
    // Creates a new, initially invisible Frame with the
    // specified title.
    def this(title: String) = ???

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
    // Called by the constructors to init the JFrame properly.
    protected def frameInit(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this JFrame.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the contentPane object for this frame.
    def getContentPane(): Container = ???

    @stub
    // Returns the operation that occurs when the user
    // initiates a "close" on this frame.
    def getDefaultCloseOperation(): Int = ???

    @stub
    // Returns the glassPane object for this frame.
    def getGlassPane(): Component = ???

    @stub
    // Creates a graphics context for this component.
    def getGraphics(): Graphics = ???

    @stub
    // Returns the menubar set on this frame.
    def getJMenuBar(): JMenuBar = ???

    @stub
    // Returns the layeredPane object for this frame.
    def getLayeredPane(): JLayeredPane = ???

    @stub
    // Returns the rootPane object for this frame.
    def getRootPane(): JRootPane = ???

    @stub
    // Gets the transferHandler property.
    def getTransferHandler(): TransferHandler = ???

    @stub
    // Returns whether calls to add and
    // setLayout are forwarded to the contentPane.
    protected def isRootPaneCheckingEnabled(): Boolean = ???

    @stub
    // Returns a string representation of this JFrame.
    protected def paramString(): String = ???

    @stub
    // Processes window events occurring on this component.
    protected def processWindowEvent(e: WindowEvent): Unit = ???

    @stub
    // Removes the specified component from the container.
    def remove(comp: Component): Unit = ???

    @stub
    // Repaints the specified rectangle of this component within
    // time milliseconds.
    def repaint(time: Long, x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Sets the contentPane property.
    def setContentPane(contentPane: Container): Unit = ???

    @stub
    // Sets the operation that will happen by default when
    // the user initiates a "close" on this frame.
    def setDefaultCloseOperation(operation: Int): Unit = ???

    @stub
    // Sets the glassPane property.
    def setGlassPane(glassPane: Component): Unit = ???

    @stub
    // Sets the image to be displayed as the icon for this window.
    def setIconImage(image: Image): Unit = ???

    @stub
    // Sets the menubar for this frame.
    def setJMenuBar(menubar: JMenuBar): Unit = ???

    @stub
    // Sets the layeredPane property.
    def setLayeredPane(layeredPane: JLayeredPane): Unit = ???

    @stub
    // Sets the LayoutManager.
    def setLayout(manager: LayoutManager): Unit = ???

    @stub
    // Sets the rootPane property.
    protected def setRootPane(root: JRootPane): Unit = ???

    @stub
    // Sets whether calls to add and
    // setLayout are forwarded to the contentPane.
    protected def setRootPaneCheckingEnabled(enabled: Boolean): Unit = ???

    @stub
    // Sets the transferHandler property, which is a mechanism to
    // support transfer of data into this component.
    def setTransferHandler(newHandler: TransferHandler): Unit = ???
}

object JFrame {
    @stub
    // The exit application default window close operation.
    def EXIT_ON_CLOSE: Int = ???

    @stub
    // Returns true if newly created JFrames should have their
    // Window decorations provided by the current look and feel.
    def isDefaultLookAndFeelDecorated(): Boolean = ???

    @stub
    // Provides a hint as to whether or not newly created JFrames
    // should have their Window decorations (such as borders, widgets to
    // close the window, title...) provided by the current look
    // and feel.
    def setDefaultLookAndFeelDecorated(defaultLookAndFeelDecorated: Boolean): Unit = ???
}

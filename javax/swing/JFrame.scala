package javax.swing

import java.awt.{Component, Component.AccessibleAWTComponent, Container, Container.AccessibleAWTContainer, Frame, Frame.AccessibleAWTFrame, Graphics, GraphicsConfiguration, Image, LayoutManager, Window, Window.AccessibleAWTWindow}
import java.awt.event.WindowEvent
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** An extended version of java.awt.Frame that adds support for
 *  the JFC/Swing component architecture.
 *  You can find task-oriented documentation about using JFrame
 *  in The Java Tutorial, in the section
 *  How to Make Frames.
 * 
 *  
 *  The JFrame class is slightly incompatible with Frame.
 *  Like all other JFC/Swing top-level containers,
 *  a JFrame contains a JRootPane as its only child.
 *  The content pane provided by the root pane should,
 *  as a rule, contain
 *  all the non-menu components displayed by the JFrame.
 *  This is different from the AWT Frame case.
 *  As a convenience, the add, remove, and setLayout
 *  methods of this class are overridden, so that they delegate calls
 *  to the corresponding methods of the ContentPane.
 *  For example, you can add a child component to a frame as follows:
 *  
 *        frame.add(child);
 *  
 *  And the child will be added to the contentPane.
 *  The content pane will
 *  always be non-null. Attempting to set it to null will cause the JFrame
 *  to throw an exception. The default content pane will have a BorderLayout
 *  manager set on it.
 *  Refer to RootPaneContainer
 *  for details on adding, removing and setting the LayoutManager
 *  of a JFrame.
 *  
 *  Unlike a Frame, a JFrame has some notion of how to
 *  respond when the user attempts to close the window. The default behavior
 *  is to simply hide the JFrame when the user closes the window. To change the
 *  default behavior, you invoke the method
 *  setDefaultCloseOperation(int).
 *  To make the JFrame behave the same as a Frame
 *  instance, use
 *  setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE).
 *  
 *  For more information on content panes
 *  and other features that root panes provide,
 *  see Using Top-Level Containers in The Java Tutorial.
 *  
 *  In a multi-screen environment, you can create a JFrame
 *  on a different screen device.  See Frame for more
 *  information.
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class JFrame extends Frame with WindowConstants with Accessible with RootPaneContainer {

    /** Constructs a new frame that is initially invisible. */
    @stub
    def this() = ???

    /** Creates a Frame in the specified
     *  GraphicsConfiguration of
     *  a screen device and a blank title.
     */
    @stub
    def this(gc: GraphicsConfiguration) = ???

    /** Creates a new, initially invisible Frame with the
     *  specified title.
     */
    @stub
    def this(title: String) = ???

    /** Creates a JFrame with the specified title and the
     *  specified GraphicsConfiguration of a screen device.
     */
    @stub
    def this(title: String, gc: GraphicsConfiguration) = ???

    /** This class implements accessibility support for the
     *  JFrame class.  It provides an implementation of the
     *  Java Accessibility API appropriate to frame user-interface
     *  elements.
     */
    protected class AccessibleJFrame extends Frame.AccessibleAWTFrame {

        /**  */
        @stub
        protected def this() = ???

        /** Get the accessible name of this object. */
        @stub
        def getAccessibleName(): String = ???

        /** Get the state of this object. */
        @stub
        def getAccessibleStateSet(): AccessibleStateSet = ???
    }


    /** The accessible context property. */
    @stub
    protected val accessibleContext: AccessibleContext = ???

    /** The JRootPane instance that manages the
     *  contentPane
     *  and optional menuBar for this frame, as well as the
     *  glassPane.
     */
    @stub
    protected val rootPane: JRootPane = ???

    /** If true then calls to add and setLayout
     *  will be forwarded to the contentPane.
     */
    @stub
    protected val rootPaneCheckingEnabled: Boolean = ???

    /** Adds the specified child Component. */
    @stub
    protected def addImpl(comp: Component, constraints: Any, index: Int): Unit = ???

    /** Called by the constructor methods to create the default
     *  rootPane.
     */
    @stub
    protected def createRootPane(): JRootPane = ???

    /** Called by the constructors to init the JFrame properly. */
    @stub
    protected def frameInit(): Unit = ???

    /** Gets the AccessibleContext associated with this JFrame. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the contentPane object for this frame. */
    @stub
    def getContentPane(): Container = ???

    /** Returns the operation that occurs when the user
     *  initiates a "close" on this frame.
     */
    @stub
    def getDefaultCloseOperation(): Int = ???

    /** Returns the glassPane object for this frame. */
    @stub
    def getGlassPane(): Component = ???

    /** Creates a graphics context for this component. */
    @stub
    def getGraphics(): Graphics = ???

    /** Returns the menubar set on this frame. */
    @stub
    def getJMenuBar(): JMenuBar = ???

    /** Returns the layeredPane object for this frame. */
    @stub
    def getLayeredPane(): JLayeredPane = ???

    /** Returns the rootPane object for this frame. */
    @stub
    def getRootPane(): JRootPane = ???

    /** Gets the transferHandler property. */
    @stub
    def getTransferHandler(): TransferHandler = ???

    /** Returns whether calls to add and
     *  setLayout are forwarded to the contentPane.
     */
    @stub
    protected def isRootPaneCheckingEnabled(): Boolean = ???

    /** Returns a string representation of this JFrame. */
    @stub
    protected def paramString(): String = ???

    /** Processes window events occurring on this component. */
    @stub
    protected def processWindowEvent(e: WindowEvent): Unit = ???

    /** Removes the specified component from the container. */
    @stub
    def remove(comp: Component): Unit = ???

    /** Repaints the specified rectangle of this component within
     *  time milliseconds.
     */
    @stub
    def repaint(time: Long, x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Sets the contentPane property. */
    @stub
    def setContentPane(contentPane: Container): Unit = ???

    /** Sets the operation that will happen by default when
     *  the user initiates a "close" on this frame.
     */
    @stub
    def setDefaultCloseOperation(operation: Int): Unit = ???

    /** Sets the glassPane property. */
    @stub
    def setGlassPane(glassPane: Component): Unit = ???

    /** Sets the image to be displayed as the icon for this window. */
    @stub
    def setIconImage(image: Image): Unit = ???

    /** Sets the menubar for this frame. */
    @stub
    def setJMenuBar(menubar: JMenuBar): Unit = ???

    /** Sets the layeredPane property. */
    @stub
    def setLayeredPane(layeredPane: JLayeredPane): Unit = ???

    /** Sets the LayoutManager. */
    @stub
    def setLayout(manager: LayoutManager): Unit = ???

    /** Sets the rootPane property. */
    @stub
    protected def setRootPane(root: JRootPane): Unit = ???

    /** Sets whether calls to add and
     *  setLayout are forwarded to the contentPane.
     */
    @stub
    protected def setRootPaneCheckingEnabled(enabled: Boolean): Unit = ???

    /** Sets the transferHandler property, which is a mechanism to
     *  support transfer of data into this component.
     */
    @stub
    def setTransferHandler(newHandler: TransferHandler): Unit = ???

    /** Just calls paint(g). */
    @stub
    def update(g: Graphics): Unit = ???
}

object JFrame {
    /** The exit application default window close operation. */
    @stub
    val EXIT_ON_CLOSE: Int = ???

    /** Returns true if newly created JFrames should have their
     *  Window decorations provided by the current look and feel.
     */
    @stub
    def isDefaultLookAndFeelDecorated(): Boolean = ???

    /** Provides a hint as to whether or not newly created JFrames
     *  should have their Window decorations (such as borders, widgets to
     *  close the window, title...) provided by the current look
     *  and feel.
     */
    @stub
    def setDefaultLookAndFeelDecorated(defaultLookAndFeelDecorated: Boolean): Unit = ???
}

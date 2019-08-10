package javax.swing

import java.awt.{Component, Component.AccessibleAWTComponent, Container, Container.AccessibleAWTContainer, Frame, Graphics, GraphicsConfiguration, LayoutManager, Window, Window.AccessibleAWTWindow}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import scala.scalanative.annotation.stub

/** A JWindow is a container that can be displayed anywhere on the
 *  user's desktop. It does not have the title bar, window-management buttons,
 *  or other trimmings associated with a JFrame, but it is still a
 *  "first-class citizen" of the user's desktop, and can exist anywhere
 *  on it.
 *  
 *  The JWindow component contains a JRootPane
 *  as its only child.  The contentPane should be the parent
 *  of any children of the JWindow.
 *  As a convenience, the add, remove, and setLayout
 *  methods of this class are overridden, so that they delegate calls
 *  to the corresponding methods of the ContentPane.
 *  For example, you can add a child component to a window as follows:
 *  
 *        window.add(child);
 *  
 *  And the child will be added to the contentPane.
 *  The contentPane will always be non-null.
 *  Attempting to set it to null will cause the JWindow
 *  to throw an exception. The default contentPane will have a
 *  BorderLayout manager set on it.
 *  Refer to RootPaneContainer
 *  for details on adding, removing and setting the LayoutManager
 *  of a JWindow.
 *  
 *  Please see the JRootPane documentation for a complete description of
 *  the contentPane, glassPane, and
 *  layeredPane components.
 *  
 *  In a multi-screen environment, you can create a JWindow
 *  on a different screen device.  See Window for more
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
class JWindow extends Window with Accessible with RootPaneContainer {

    /** Creates a window with no specified owner. */
    @stub
    def this() = ???

    /** Creates a window with the specified owner frame. */
    @stub
    def this(owner: Frame) = ???

    /** Creates a window with the specified GraphicsConfiguration
     *  of a screen device.
     */
    @stub
    def this(gc: GraphicsConfiguration) = ???

    /** Creates a window with the specified owner window. */
    @stub
    def this(owner: Window) = ???

    /** Creates a window with the specified owner window and
     *  GraphicsConfiguration of a screen device.
     */
    @stub
    def this(owner: Window, gc: GraphicsConfiguration) = ???

    /** This class implements accessibility support for the
     *  JWindow class.  It provides an implementation of the
     *  Java Accessibility API appropriate to window user-interface
     *  elements.
     */
    protected class AccessibleJWindow extends Window.AccessibleAWTWindow {

        /**  */
        @stub
        protected def this() = ???
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

    /** Gets the AccessibleContext associated with this JWindow. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the Container which is the contentPane
     *  for this window.
     */
    @stub
    def getContentPane(): Container = ???

    /** Returns the glassPane Component for this window. */
    @stub
    def getGlassPane(): Component = ???

    /** Creates a graphics context for this component. */
    @stub
    def getGraphics(): Graphics = ???

    /** Returns the layeredPane object for this window. */
    @stub
    def getLayeredPane(): JLayeredPane = ???

    /** Returns the rootPane object for this window. */
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

    /** Returns a string representation of this JWindow. */
    @stub
    protected def paramString(): String = ???

    /** Removes the specified component from the container. */
    @stub
    def remove(comp: Component): Unit = ???

    /** Repaints the specified rectangle of this component within
     *  time milliseconds.
     */
    @stub
    def repaint(time: Long, x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Sets the contentPane property for this window. */
    @stub
    def setContentPane(contentPane: Container): Unit = ???

    /** Sets the glassPane property. */
    @stub
    def setGlassPane(glassPane: Component): Unit = ???

    /** Sets the layeredPane property. */
    @stub
    def setLayeredPane(layeredPane: JLayeredPane): Unit = ???

    /** Sets the LayoutManager. */
    @stub
    def setLayout(manager: LayoutManager): Unit = ???

    /** Sets the new rootPane object for this window. */
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

    /** Calls paint(g). */
    @stub
    def update(g: Graphics): Unit = ???

    /** Called by the constructors to init the JWindow properly. */
    @stub
    protected def windowInit(): Unit = ???
}

package javax.swing

import java.applet.{Applet, Applet.AccessibleApplet}
import java.awt.{Component, Component.AccessibleAWTComponent, Container, Container.AccessibleAWTContainer, Graphics, LayoutManager, Panel, Panel.AccessibleAWTPanel}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import scala.scalanative.annotation.stub

/** An extended version of java.applet.Applet that adds support for
 *  the JFC/Swing component architecture.
 *  You can find task-oriented documentation about using JApplet
 *  in The Java Tutorial,
 *  in the section
 *  How to Make Applets.
 *  
 *  The JApplet class is slightly incompatible with
 *  java.applet.Applet.  JApplet contains a
 *  JRootPane as its only child.  The contentPane
 *  should be the parent of any children of the JApplet.
 *  As a convenience, the add, remove, and setLayout
 *  methods of this class are overridden, so that they delegate calls
 *  to the corresponding methods of the ContentPane.
 *  For example, you can add a child component to an applet as follows:
 *  
 *        applet.add(child);
 *  
 * 
 *  And the child will be added to the contentPane.
 *  The contentPane will always be non-null.
 *  Attempting to set it to null will cause the
 *  JApplet to throw an exception. The default
 *  contentPane will have a BorderLayout
 *  manager set on it.
 *  Refer to RootPaneContainer
 *  for details on adding, removing and setting the LayoutManager
 *  of a JApplet.
 *  
 *  Please see the JRootPane documentation for a
 *  complete description of the contentPane, glassPane,
 *  and layeredPane properties.
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
class JApplet extends Applet with Accessible with RootPaneContainer {

    /** Creates a swing applet instance. */
    @stub
    def this() = ???

    /** This class implements accessibility support for the
     *  JApplet class.
     */
    protected class AccessibleJApplet extends Applet.AccessibleApplet {

        /**  */
        @stub
        protected def this() = ???
    }


    /**  */
    @stub
    protected val accessibleContext: AccessibleContext = ???

    /**  */
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

    /** Called by the constructor methods to create the default rootPane. */
    @stub
    protected def createRootPane(): JRootPane = ???

    /** Gets the AccessibleContext associated with this JApplet. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the contentPane object for this applet. */
    @stub
    def getContentPane(): Container = ???

    /** Returns the glassPane object for this applet. */
    @stub
    def getGlassPane(): Component = ???

    /** Creates a graphics context for this component. */
    @stub
    def getGraphics(): Graphics = ???

    /** Returns the menubar set on this applet. */
    @stub
    def getJMenuBar(): JMenuBar = ???

    /** Returns the layeredPane object for this applet. */
    @stub
    def getLayeredPane(): JLayeredPane = ???

    /** Returns the rootPane object for this applet. */
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

    /** Returns a string representation of this JApplet. */
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

    /** Sets the contentPane property. */
    @stub
    def setContentPane(contentPane: Container): Unit = ???

    /** Sets the glassPane property. */
    @stub
    def setGlassPane(glassPane: Component): Unit = ???

    /** Sets the menubar for this applet. */
    @stub
    def setJMenuBar(menuBar: JMenuBar): Unit = ???

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

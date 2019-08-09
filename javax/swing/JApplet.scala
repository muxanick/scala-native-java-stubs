package javax.swing

import java.applet.Applet
import java.awt.{Component, Container, Graphics, LayoutManager, Panel}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}

// An extended version of java.applet.Applet that adds support for
// the JFC/Swing component architecture.
// You can find task-oriented documentation about using JApplet
// in The Java Tutorial,
// in the section
// How to Make Applets.
// 
// The JApplet class is slightly incompatible with
// java.applet.Applet.  JApplet contains a
// JRootPane as its only child.  The contentPane
// should be the parent of any children of the JApplet.
// As a convenience, the add, remove, and setLayout
// methods of this class are overridden, so that they delegate calls
// to the corresponding methods of the ContentPane.
// For example, you can add a child component to an applet as follows:
// 
//       applet.add(child);
// 
//
// And the child will be added to the contentPane.
// The contentPane will always be non-null.
// Attempting to set it to null will cause the
// JApplet to throw an exception. The default
// contentPane will have a BorderLayout
// manager set on it.
// Refer to RootPaneContainer
// for details on adding, removing and setting the LayoutManager
// of a JApplet.
// 
// Please see the JRootPane documentation for a
// complete description of the contentPane, glassPane,
// and layeredPane properties.
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
class JApplet extends Applet with Accessible, with RootPaneContainer {

    @stub
    // 
    protected def accessibleContext: AccessibleContext = ???

    @stub
    // 
    protected def rootPane: JRootPane = ???

    @stub
    // Adds the specified child Component.
    protected def addImpl(comp: Component, constraints: Object, index: Int): Unit = ???

    @stub
    // Called by the constructor methods to create the default rootPane.
    protected def createRootPane(): JRootPane = ???

    @stub
    // Gets the AccessibleContext associated with this JApplet.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the contentPane object for this applet.
    def getContentPane(): Container = ???

    @stub
    // Returns the glassPane object for this applet.
    def getGlassPane(): Component = ???

    @stub
    // Creates a graphics context for this component.
    def getGraphics(): Graphics = ???

    @stub
    // Returns the menubar set on this applet.
    def getJMenuBar(): JMenuBar = ???

    @stub
    // Returns the layeredPane object for this applet.
    def getLayeredPane(): JLayeredPane = ???

    @stub
    // Returns the rootPane object for this applet.
    def getRootPane(): JRootPane = ???

    @stub
    // Gets the transferHandler property.
    def getTransferHandler(): TransferHandler = ???

    @stub
    // Returns whether calls to add and
    // setLayout are forwarded to the contentPane.
    protected def isRootPaneCheckingEnabled(): Boolean = ???

    @stub
    // Returns a string representation of this JApplet.
    protected def paramString(): String = ???

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
    // Sets the glassPane property.
    def setGlassPane(glassPane: Component): Unit = ???

    @stub
    // Sets the menubar for this applet.
    def setJMenuBar(menuBar: JMenuBar): Unit = ???

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

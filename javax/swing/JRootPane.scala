package javax.swing

import java.awt.{Component, Container, LayoutManager}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.RootPaneUI

// A lightweight container used behind the scenes by
// JFrame, JDialog, JWindow,
// JApplet, and JInternalFrame.
// For task-oriented information on functionality provided by root panes
// see How to Use Root Panes,
// a section in The Java Tutorial.
//
// 
// The following image shows the relationships between
// the classes that use root panes.
// 
// The "heavyweight" components (those that delegate to a peer, or native
// component on the host system) are shown with a darker, heavier box. The four
// heavyweight JFC/Swing containers (JFrame, JDialog,
// JWindow, and JApplet) are
// shown in relation to the AWT classes they extend.
// These four components are the
// only heavyweight containers in the Swing library. The lightweight container
// JInternalFrame is also shown.
// All five of these JFC/Swing containers implement the
// RootPaneContainer interface,
// and they all delegate their operations to a
// JRootPane (shown with a little "handle" on top).
// 
// Note: The JComponent method getRootPane
// can be used to obtain the JRootPane that contains
// a given component.
// 
// 
// 
// 
// 
// 
// 
// 
// The diagram at right shows the structure of a JRootPane.
// A JRootpane is made up of a glassPane,
// an optional menuBar, and a contentPane.
// (The JLayeredPane manages the menuBar
// and the contentPane.)
// The glassPane sits over the top of everything,
// where it is in a position to intercept mouse movements.
// Since the glassPane (like the contentPane)
// can be an arbitrary component, it is also possible to set up the
// glassPane for drawing. Lines and images on the
// glassPane can then range
// over the frames underneath without being limited by their boundaries.
// 
// Although the menuBar component is optional,
// the layeredPane, contentPane,
// and glassPane always exist.
// Attempting to set them to null generates an exception.
// 
// To add components to the JRootPane (other than the
// optional menu bar), you add the object to the contentPane
// of the JRootPane, like this:
// 
//       rootPane.getContentPane().add(child);
// 
// The same principle holds true for setting layout managers, removing
// components, listing children, etc. All these methods are invoked on
// the contentPane instead of on the JRootPane.
// 
// Note: The default layout manager for the contentPane is
//  a BorderLayout manager. However, the JRootPane
//  uses a custom LayoutManager.
//  So, when you want to change the layout manager for the components you added
//  to a JRootPane, be sure to use code like this:
// 
//    rootPane.getContentPane().setLayout(new BoxLayout());
// 
// If a JMenuBar component is set on the JRootPane,
// it is positioned along the upper edge of the frame.
// The contentPane is adjusted in location and size to
// fill the remaining area.
// (The JMenuBar and the contentPane are added to the
// layeredPane component at the
// JLayeredPane.FRAME_CONTENT_LAYER layer.)
// 
// The layeredPane is the parent of all children in the
// JRootPane -- both as the direct parent of the menu and
// the grandparent of all components added to the contentPane.
// It is an instance of JLayeredPane,
// which provides the ability to add components at several layers.
// This capability is very useful when working with menu popups,
// dialog boxes, and dragging -- situations in which you need to place
// a component on top of all other components in the pane.
// 
// The glassPane sits on top of all other components in the
// JRootPane.
// That provides a convenient place to draw above all other components,
// and makes it possible to intercept mouse events,
// which is useful both for dragging and for drawing.
// Developers can use setVisible on the glassPane
// to control when the glassPane displays over the other children.
// By default the glassPane is not visible.
// 
// The custom LayoutManager used by JRootPane
// ensures that:
// 
// The glassPane fills the entire viewable
//     area of the JRootPane (bounds - insets).
// The layeredPane fills the entire viewable area of the
//     JRootPane. (bounds - insets)
// The menuBar is positioned at the upper edge of the
//     layeredPane.
// The contentPane fills the entire viewable area,
//     minus the menuBar, if present.
// 
// Any other views in the JRootPane view hierarchy are ignored.
// 
// If you replace the LayoutManager of the JRootPane,
// you are responsible for managing all of these views.
// So ordinarily you will want to be sure that you
// change the layout manager for the contentPane rather than
// for the JRootPane itself!
// 
// The painting architecture of Swing requires an opaque
// JComponent
// to exist in the containment hierarchy above all other components. This is
// typically provided by way of the content pane. If you replace the content
// pane, it is recommended that you make the content pane opaque
// by way of setOpaque(true). Additionally, if the content pane
// overrides paintComponent, it
// will need to completely fill in the background in an opaque color in
// paintComponent.
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
class JRootPane extends JComponent with Accessible {

    @stub
    // This class implements accessibility support for the
    // JRootPane class.
    protected def JRootPane.AccessibleJRootPane: class = ???

    @stub
    // The content pane.
    protected def contentPane: Container = ???

    @stub
    // The button that gets activated when the pane has the focus and
    // a UI-specific action like pressing the Enter key occurs.
    protected def defaultButton: JButton = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def defaultPressAction: javax.swing.JRootPane.DefaultAction = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def defaultReleaseAction: javax.swing.JRootPane.DefaultAction = ???

    @stub
    // The glass pane that overlays the menu bar and content pane,
    //  so it can intercept mouse movements and such.
    protected def glassPane: Component = ???

    @stub
    // The layered pane that manages the menu bar and content pane.
    protected def layeredPane: JLayeredPane = ???

    @stub
    // The menu bar.
    protected def menuBar: JMenuBar = ???

    @stub
    // Overridden to enforce the position of the glass component as
    // the zero child.
    protected def addImpl(comp: Component, constraints: Object, index: Int): Unit = ???

    @stub
    // Notifies this component that it now has a parent component.
    def addNotify(): Unit = ???

    @stub
    // Called by the constructor methods to create the default
    // contentPane.
    protected def createContentPane(): Container = ???

    @stub
    // Called by the constructor methods to create the default
    // glassPane.
    protected def createGlassPane(): Component = ???

    @stub
    // Called by the constructor methods to create the default
    // layeredPane.
    protected def createLayeredPane(): JLayeredPane = ???

    @stub
    // Called by the constructor methods to create the default
    // layoutManager.
    protected def createRootLayout(): LayoutManager = ???

    @stub
    // Gets the AccessibleContext associated with this
    // JRootPane.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the content pane -- the container that holds the components
    // parented by the root pane.
    def getContentPane(): Container = ???

    @stub
    // Returns the value of the defaultButton property.
    def getDefaultButton(): JButton = ???

    @stub
    // Returns the current glass pane for this JRootPane.
    def getGlassPane(): Component = ???

    @stub
    // Returns the menu bar from the layered pane.
    def getJMenuBar(): JMenuBar = ???

    @stub
    // Gets the layered pane used by the root pane.
    def getLayeredPane(): JLayeredPane = ???

    @stub
    // Deprecated. 
    //As of Swing version 1.0.3
    //  replaced by getJMenuBar().
    //
    def getMenuBar(): JMenuBar = ???

    @stub
    // Returns the L&F object that renders this component.
    def getUI(): RootPaneUI = ???

    @stub
    // Returns a string that specifies the name of the L&F class
    // that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Returns a constant identifying the type of Window decorations the
    // JRootPane is providing.
    def getWindowDecorationStyle(): Int = ???

    @stub
    // The glassPane and contentPane
    // have the same bounds, which means JRootPane
    // does not tiles its children and this should return false.
    def isOptimizedDrawingEnabled(): Boolean = ???

    @stub
    // If a descendant of this JRootPane calls
    // revalidate, validate from here on down.
    def isValidateRoot(): Boolean = ???

    @stub
    // Returns a string representation of this JRootPane.
    protected def paramString(): String = ???

    @stub
    // Notifies this component that it no longer has a parent component.
    def removeNotify(): Unit = ???

    @stub
    // Sets the content pane -- the container that holds the components
    // parented by the root pane.
    def setContentPane(content: Container): Unit = ???

    @stub
    // Sets the defaultButton property,
    // which determines the current default button for this JRootPane.
    def setDefaultButton(defaultButton: JButton): Unit = ???

    @stub
    // Sets whether this component should use a buffer to paint.
    def setDoubleBuffered(aFlag: Boolean): Unit = ???

    @stub
    // Sets a specified Component to be the glass pane for this
    // root pane.
    def setGlassPane(glass: Component): Unit = ???

    @stub
    // Adds or changes the menu bar used in the layered pane.
    def setJMenuBar(menu: JMenuBar): Unit = ???

    @stub
    // Sets the layered pane for the root pane.
    def setLayeredPane(layered: JLayeredPane): Unit = ???

    @stub
    // Deprecated. 
    //As of Swing version 1.0.3
    //  replaced by setJMenuBar(JMenuBar menu).
    //
    def setMenuBar(menu: JMenuBar): Unit = ???

    @stub
    // Sets the L&F object that renders this component.
    def setUI(ui: RootPaneUI): Unit = ???

    @stub
    // Sets the type of Window decorations (such as borders, widgets for
    // closing a Window, title ...) the JRootPane should
    // provide.
    def setWindowDecorationStyle(windowDecorationStyle: Int): Unit = ???
}

object JRootPane {
    @stub
    // Constant used for the windowDecorationStyle property.
    def COLOR_CHOOSER_DIALOG: Int = ???

    @stub
    // Constant used for the windowDecorationStyle property.
    def ERROR_DIALOG: Int = ???

    @stub
    // Constant used for the windowDecorationStyle property.
    def FILE_CHOOSER_DIALOG: Int = ???

    @stub
    // Constant used for the windowDecorationStyle property.
    def FRAME: Int = ???

    @stub
    // Constant used for the windowDecorationStyle property.
    def INFORMATION_DIALOG: Int = ???

    @stub
    // Constant used for the windowDecorationStyle property.
    def NONE: Int = ???

    @stub
    // Constant used for the windowDecorationStyle property.
    def PLAIN_DIALOG: Int = ???

    @stub
    // Constant used for the windowDecorationStyle property.
    def QUESTION_DIALOG: Int = ???
}

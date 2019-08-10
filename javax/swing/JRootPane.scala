package javax.swing

import java.awt.{Component, Component.AccessibleAWTComponent, Container, Container.AccessibleAWTContainer, Dimension, LayoutManager, LayoutManager2}
import java.io.Serializable
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole}
import javax.swing.plaf.RootPaneUI
import scala.scalanative.annotation.stub

/** A lightweight container used behind the scenes by
 *  JFrame, JDialog, JWindow,
 *  JApplet, and JInternalFrame.
 *  For task-oriented information on functionality provided by root panes
 *  see How to Use Root Panes,
 *  a section in The Java Tutorial.
 * 
 *  
 *  The following image shows the relationships between
 *  the classes that use root panes.
 *  
 *  The "heavyweight" components (those that delegate to a peer, or native
 *  component on the host system) are shown with a darker, heavier box. The four
 *  heavyweight JFC/Swing containers (JFrame, JDialog,
 *  JWindow, and JApplet) are
 *  shown in relation to the AWT classes they extend.
 *  These four components are the
 *  only heavyweight containers in the Swing library. The lightweight container
 *  JInternalFrame is also shown.
 *  All five of these JFC/Swing containers implement the
 *  RootPaneContainer interface,
 *  and they all delegate their operations to a
 *  JRootPane (shown with a little "handle" on top).
 *  
 *  Note: The JComponent method getRootPane
 *  can be used to obtain the JRootPane that contains
 *  a given component.
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  The diagram at right shows the structure of a JRootPane.
 *  A JRootpane is made up of a glassPane,
 *  an optional menuBar, and a contentPane.
 *  (The JLayeredPane manages the menuBar
 *  and the contentPane.)
 *  The glassPane sits over the top of everything,
 *  where it is in a position to intercept mouse movements.
 *  Since the glassPane (like the contentPane)
 *  can be an arbitrary component, it is also possible to set up the
 *  glassPane for drawing. Lines and images on the
 *  glassPane can then range
 *  over the frames underneath without being limited by their boundaries.
 *  
 *  Although the menuBar component is optional,
 *  the layeredPane, contentPane,
 *  and glassPane always exist.
 *  Attempting to set them to null generates an exception.
 *  
 *  To add components to the JRootPane (other than the
 *  optional menu bar), you add the object to the contentPane
 *  of the JRootPane, like this:
 *  
 *        rootPane.getContentPane().add(child);
 *  
 *  The same principle holds true for setting layout managers, removing
 *  components, listing children, etc. All these methods are invoked on
 *  the contentPane instead of on the JRootPane.
 *  
 *  Note: The default layout manager for the contentPane is
 *   a BorderLayout manager. However, the JRootPane
 *   uses a custom LayoutManager.
 *   So, when you want to change the layout manager for the components you added
 *   to a JRootPane, be sure to use code like this:
 *  
 *     rootPane.getContentPane().setLayout(new BoxLayout());
 *  
 *  If a JMenuBar component is set on the JRootPane,
 *  it is positioned along the upper edge of the frame.
 *  The contentPane is adjusted in location and size to
 *  fill the remaining area.
 *  (The JMenuBar and the contentPane are added to the
 *  layeredPane component at the
 *  JLayeredPane.FRAME_CONTENT_LAYER layer.)
 *  
 *  The layeredPane is the parent of all children in the
 *  JRootPane -- both as the direct parent of the menu and
 *  the grandparent of all components added to the contentPane.
 *  It is an instance of JLayeredPane,
 *  which provides the ability to add components at several layers.
 *  This capability is very useful when working with menu popups,
 *  dialog boxes, and dragging -- situations in which you need to place
 *  a component on top of all other components in the pane.
 *  
 *  The glassPane sits on top of all other components in the
 *  JRootPane.
 *  That provides a convenient place to draw above all other components,
 *  and makes it possible to intercept mouse events,
 *  which is useful both for dragging and for drawing.
 *  Developers can use setVisible on the glassPane
 *  to control when the glassPane displays over the other children.
 *  By default the glassPane is not visible.
 *  
 *  The custom LayoutManager used by JRootPane
 *  ensures that:
 *  
 *  The glassPane fills the entire viewable
 *      area of the JRootPane (bounds - insets).
 *  The layeredPane fills the entire viewable area of the
 *      JRootPane. (bounds - insets)
 *  The menuBar is positioned at the upper edge of the
 *      layeredPane.
 *  The contentPane fills the entire viewable area,
 *      minus the menuBar, if present.
 *  
 *  Any other views in the JRootPane view hierarchy are ignored.
 *  
 *  If you replace the LayoutManager of the JRootPane,
 *  you are responsible for managing all of these views.
 *  So ordinarily you will want to be sure that you
 *  change the layout manager for the contentPane rather than
 *  for the JRootPane itself!
 *  
 *  The painting architecture of Swing requires an opaque
 *  JComponent
 *  to exist in the containment hierarchy above all other components. This is
 *  typically provided by way of the content pane. If you replace the content
 *  pane, it is recommended that you make the content pane opaque
 *  by way of setOpaque(true). Additionally, if the content pane
 *  overrides paintComponent, it
 *  will need to completely fill in the background in an opaque color in
 *  paintComponent.
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
class JRootPane extends JComponent with Accessible {

    /** Creates a JRootPane, setting up its
     *  glassPane, layeredPane,
     *  and contentPane.
     */
    @stub
    def this() = ???

    /** This class implements accessibility support for the
     *  JRootPane class.  It provides an implementation of the
     *  Java Accessibility API appropriate to root pane user-interface elements.
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
    protected class AccessibleJRootPane extends JComponent.AccessibleJComponent {

        /**  */
        @stub
        protected def this() = ???

        /** Returns the specified Accessible child of the object. */
        @stub
        def getAccessibleChild(i: Int): Accessible = ???

        /** Returns the number of accessible children of the object. */
        @stub
        def getAccessibleChildrenCount(): Int = ???

        /** Get the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???
    }


    /** A custom layout manager that is responsible for the layout of
     *  layeredPane, glassPane, and menuBar.
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
    protected class RootLayout extends Object with LayoutManager2 with Serializable {

        /**  */
        @stub
        protected def this() = ???

        /** Adds the specified component to the layout, using the specified
         *  constraint object.
         */
        @stub
        def addLayoutComponent(comp: Component, constraints: Any): Unit = ???

        /** If the layout manager uses a per-component string,
         *  adds the component comp to the layout,
         *  associating it
         *  with the string specified by name.
         */
        @stub
        def addLayoutComponent(name: String, comp: Component): Unit = ???

        /** Returns the alignment along the x axis. */
        @stub
        def getLayoutAlignmentX(target: Container): Float = ???

        /** Returns the alignment along the y axis. */
        @stub
        def getLayoutAlignmentY(target: Container): Float = ???

        /** Invalidates the layout, indicating that if the layout manager
         *  has cached information it should be discarded.
         */
        @stub
        def invalidateLayout(target: Container): Unit = ???

        /** Instructs the layout manager to perform the layout for the specified
         *  container.
         */
        @stub
        def layoutContainer(parent: Container): Unit = ???

        /** Returns the maximum amount of space the layout can use. */
        @stub
        def maximumLayoutSize(target: Container): Dimension = ???

        /** Returns the minimum amount of space the layout needs. */
        @stub
        def minimumLayoutSize(parent: Container): Dimension = ???

        /** Returns the amount of space the layout would like to have. */
        @stub
        def preferredLayoutSize(parent: Container): Dimension = ???

        /** Removes the specified component from the layout. */
        @stub
        def removeLayoutComponent(comp: Component): Unit = ???
    }


    /** The content pane. */
    @stub
    protected val contentPane: Container = ???

    /** The button that gets activated when the pane has the focus and
     *  a UI-specific action like pressing the Enter key occurs.
     */
    @stub
    protected val defaultButton: JButton = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val defaultPressAction: javax.swing.JRootPane.DefaultAction = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val defaultReleaseAction: javax.swing.JRootPane.DefaultAction = ???

    /** The glass pane that overlays the menu bar and content pane,
     *   so it can intercept mouse movements and such.
     */
    @stub
    protected val glassPane: Component = ???

    /** The layered pane that manages the menu bar and content pane. */
    @stub
    protected val layeredPane: JLayeredPane = ???

    /** The menu bar. */
    @stub
    protected val menuBar: JMenuBar = ???

    /** Overridden to enforce the position of the glass component as
     *  the zero child.
     */
    @stub
    protected def addImpl(comp: Component, constraints: Any, index: Int): Unit = ???

    /** Notifies this component that it now has a parent component. */
    @stub
    def addNotify(): Unit = ???

    /** Called by the constructor methods to create the default
     *  contentPane.
     */
    @stub
    protected def createContentPane(): Container = ???

    /** Called by the constructor methods to create the default
     *  glassPane.
     */
    @stub
    protected def createGlassPane(): Component = ???

    /** Called by the constructor methods to create the default
     *  layeredPane.
     */
    @stub
    protected def createLayeredPane(): JLayeredPane = ???

    /** Called by the constructor methods to create the default
     *  layoutManager.
     */
    @stub
    protected def createRootLayout(): LayoutManager = ???

    /** Gets the AccessibleContext associated with this
     *  JRootPane.
     */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the content pane -- the container that holds the components
     *  parented by the root pane.
     */
    @stub
    def getContentPane(): Container = ???

    /** Returns the value of the defaultButton property. */
    @stub
    def getDefaultButton(): JButton = ???

    /** Returns the current glass pane for this JRootPane. */
    @stub
    def getGlassPane(): Component = ???

    /** Returns the menu bar from the layered pane. */
    @stub
    def getJMenuBar(): JMenuBar = ???

    /** Gets the layered pane used by the root pane. */
    @stub
    def getLayeredPane(): JLayeredPane = ???

    /** Deprecated. 
     * As of Swing version 1.0.3
     *   replaced by getJMenuBar().
     * 
     */
    @stub
    def getMenuBar(): JMenuBar = ???

    /** Returns the L&F object that renders this component. */
    @stub
    def getUI(): RootPaneUI = ???

    /** Returns a string that specifies the name of the L&F class
     *  that renders this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Returns a constant identifying the type of Window decorations the
     *  JRootPane is providing.
     */
    @stub
    def getWindowDecorationStyle(): Int = ???

    /** The glassPane and contentPane
     *  have the same bounds, which means JRootPane
     *  does not tiles its children and this should return false.
     */
    @stub
    def isOptimizedDrawingEnabled(): Boolean = ???

    /** If a descendant of this JRootPane calls
     *  revalidate, validate from here on down.
     */
    @stub
    def isValidateRoot(): Boolean = ???

    /** Returns a string representation of this JRootPane. */
    @stub
    protected def paramString(): String = ???

    /** Notifies this component that it no longer has a parent component. */
    @stub
    def removeNotify(): Unit = ???

    /** Sets the content pane -- the container that holds the components
     *  parented by the root pane.
     */
    @stub
    def setContentPane(content: Container): Unit = ???

    /** Sets the defaultButton property,
     *  which determines the current default button for this JRootPane.
     */
    @stub
    def setDefaultButton(defaultButton: JButton): Unit = ???

    /** Sets whether this component should use a buffer to paint. */
    @stub
    def setDoubleBuffered(aFlag: Boolean): Unit = ???

    /** Sets a specified Component to be the glass pane for this
     *  root pane.
     */
    @stub
    def setGlassPane(glass: Component): Unit = ???

    /** Adds or changes the menu bar used in the layered pane. */
    @stub
    def setJMenuBar(menu: JMenuBar): Unit = ???

    /** Sets the layered pane for the root pane. */
    @stub
    def setLayeredPane(layered: JLayeredPane): Unit = ???

    /** Deprecated. 
     * As of Swing version 1.0.3
     *   replaced by setJMenuBar(JMenuBar menu).
     * 
     */
    @stub
    def setMenuBar(menu: JMenuBar): Unit = ???

    /** Sets the L&F object that renders this component. */
    @stub
    def setUI(ui: RootPaneUI): Unit = ???

    /** Sets the type of Window decorations (such as borders, widgets for
     *  closing a Window, title ...) the JRootPane should
     *  provide.
     */
    @stub
    def setWindowDecorationStyle(windowDecorationStyle: Int): Unit = ???

    /** Resets the UI property to a value from the current look and feel. */
    @stub
    def updateUI(): Unit = ???
}

object JRootPane {
    /** Constant used for the windowDecorationStyle property. */
    @stub
    val COLOR_CHOOSER_DIALOG: Int = ???

    /** Constant used for the windowDecorationStyle property. */
    @stub
    val ERROR_DIALOG: Int = ???

    /** Constant used for the windowDecorationStyle property. */
    @stub
    val FILE_CHOOSER_DIALOG: Int = ???

    /** Constant used for the windowDecorationStyle property. */
    @stub
    val FRAME: Int = ???

    /** Constant used for the windowDecorationStyle property. */
    @stub
    val INFORMATION_DIALOG: Int = ???

    /** Constant used for the windowDecorationStyle property. */
    @stub
    val NONE: Int = ???

    /** Constant used for the windowDecorationStyle property. */
    @stub
    val PLAIN_DIALOG: Int = ???

    /** Constant used for the windowDecorationStyle property. */
    @stub
    val QUESTION_DIALOG: Int = ???

    /** Constant used for the windowDecorationStyle property. */
    @stub
    val WARNING_DIALOG: Int = ???
}

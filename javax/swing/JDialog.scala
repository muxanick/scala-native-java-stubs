package javax.swing

import java.awt.{Component, Component.AccessibleAWTComponent, Container, Container.AccessibleAWTContainer, Dialog, Dialog.AccessibleAWTDialog, Dialog.ModalityType, Frame, Graphics, GraphicsConfiguration, LayoutManager, Window, Window.AccessibleAWTWindow}
import java.awt.event.WindowEvent
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** The main class for creating a dialog window. You can use this class
 *  to create a custom dialog, or invoke the many class methods
 *  in JOptionPane to create a variety of standard dialogs.
 *  For information about creating dialogs, see
 *  The Java Tutorial section
 *  How
 *  to Make Dialogs.
 * 
 *  
 * 
 *  The JDialog component contains a JRootPane
 *  as its only child.
 *  The contentPane should be the parent of any children of the
 *  JDialog.
 *  As a convenience, the add, remove, and setLayout
 *  methods of this class are overridden, so that they delegate calls
 *  to the corresponding methods of the ContentPane.
 *  For example, you can add a child component to a dialog as follows:
 *  
 *        dialog.add(child);
 *  
 *  And the child will be added to the contentPane.
 *  The contentPane is always non-null.
 *  Attempting to set it to null generates an exception.
 *  The default contentPane has a BorderLayout
 *  manager set on it.
 *  Refer to RootPaneContainer
 *  for details on adding, removing and setting the LayoutManager
 *  of a JDialog.
 *  
 *  Please see the JRootPane documentation for a complete
 *  description of the contentPane, glassPane,
 *  and layeredPane components.
 *  
 *  In a multi-screen environment, you can create a JDialog
 *  on a different screen device than its owner.  See Frame for
 *  more information.
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
class JDialog extends Dialog with WindowConstants with Accessible with RootPaneContainer {

    /** Creates a modeless dialog without a title and without a specified
     *  Frame owner.
     */
    @stub
    def this() = ???

    /** Creates a modeless dialog with the specified Dialog
     *  as its owner and an empty title.
     */
    @stub
    def this(owner: Dialog) = ???

    /** Creates a dialog with an empty title and the specified modality and
     *  Dialog as its owner.
     */
    @stub
    def this(owner: Dialog, modal: Boolean) = ???

    /** Creates a modeless dialog with the specified title and
     *  with the specified owner dialog.
     */
    @stub
    def this(owner: Dialog, title: String) = ???

    /** Creates a dialog with the specified title, modality
     *  and the specified owner Dialog.
     */
    @stub
    def this(owner: Dialog, title: String, modal: Boolean) = ???

    /** Creates a dialog with the specified title, owner Dialog,
     *  modality and GraphicsConfiguration.
     */
    @stub
    def this(owner: Dialog, title: String, modal: Boolean, gc: GraphicsConfiguration) = ???

    /** Creates a modeless dialog with the specified Frame
     *  as its owner and an empty title.
     */
    @stub
    def this(owner: Frame) = ???

    /** Creates a dialog with an empty title and the specified modality and
     *  Frame as its owner.
     */
    @stub
    def this(owner: Frame, modal: Boolean) = ???

    /** Creates a modeless dialog with the specified title and
     *  with the specified owner frame.
     */
    @stub
    def this(owner: Frame, title: String) = ???

    /** Creates a dialog with the specified title, owner Frame
     *  and modality.
     */
    @stub
    def this(owner: Frame, title: String, modal: Boolean) = ???

    /** Creates a dialog with the specified title,
     *  owner Frame, modality and GraphicsConfiguration.
     */
    @stub
    def this(owner: Frame, title: String, modal: Boolean, gc: GraphicsConfiguration) = ???

    /** Creates a modeless dialog with the specified Window
     *  as its owner and an empty title.
     */
    @stub
    def this(owner: Window) = ???

    /** Creates a dialog with an empty title and the specified modality and
     *  Window as its owner.
     */
    @stub
    def this(owner: Window, modalityType: Dialog.ModalityType) = ???

    /** Creates a modeless dialog with the specified title and owner
     *  Window.
     */
    @stub
    def this(owner: Window, title: String) = ???

    /** Creates a dialog with the specified title, owner Window and
     *  modality.
     */
    @stub
    def this(owner: Window, title: String, modalityType: Dialog.ModalityType) = ???

    /** Creates a dialog with the specified title, owner Window,
     *  modality and GraphicsConfiguration.
     */
    @stub
    def this(owner: Window, title: String, modalityType: Dialog.ModalityType, gc: GraphicsConfiguration) = ???

    /** This class implements accessibility support for the
     *  JDialog class.  It provides an implementation of the
     *  Java Accessibility API appropriate to dialog user-interface
     *  elements.
     */
    protected class AccessibleJDialog extends Dialog.AccessibleAWTDialog {

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

    /** Called by the constructor methods to create the default
     *  rootPane.
     */
    @stub
    protected def createRootPane(): JRootPane = ???

    /** Called by the constructors to init the JDialog properly. */
    @stub
    protected def dialogInit(): Unit = ???

    /** Gets the AccessibleContext associated with this JDialog. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the contentPane object for this dialog. */
    @stub
    def getContentPane(): Container = ???

    /** Returns the operation which occurs when the user
     *  initiates a "close" on this dialog.
     */
    @stub
    def getDefaultCloseOperation(): Int = ???

    /** Returns the glassPane object for this dialog. */
    @stub
    def getGlassPane(): Component = ???

    /** Creates a graphics context for this component. */
    @stub
    def getGraphics(): Graphics = ???

    /** Returns the menubar set on this dialog. */
    @stub
    def getJMenuBar(): JMenuBar = ???

    /** Returns the layeredPane object for this dialog. */
    @stub
    def getLayeredPane(): JLayeredPane = ???

    /** Returns the rootPane object for this dialog. */
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

    /** Returns a string representation of this JDialog. */
    @stub
    protected def paramString(): String = ???

    /** Handles window events depending on the state of the
     *  defaultCloseOperation property.
     */
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
     *  the user initiates a "close" on this dialog.
     */
    @stub
    def setDefaultCloseOperation(operation: Int): Unit = ???

    /** Sets the glassPane property. */
    @stub
    def setGlassPane(glassPane: Component): Unit = ???

    /** Sets the menubar for this dialog. */
    @stub
    def setJMenuBar(menu: JMenuBar): Unit = ???

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

    /** Calls paint(g). */
    @stub
    def update(g: Graphics): Unit = ???
}

object JDialog {
    /** Returns true if newly created JDialogs should have their
     *  Window decorations provided by the current look and feel.
     */
    @stub
    def isDefaultLookAndFeelDecorated(): Boolean = ???

    /** Provides a hint as to whether or not newly created JDialogs
     *  should have their Window decorations (such as borders, widgets to
     *  close the window, title...) provided by the current look
     *  and feel.
     */
    @stub
    def setDefaultLookAndFeelDecorated(defaultLookAndFeelDecorated: Boolean): Unit = ???
}

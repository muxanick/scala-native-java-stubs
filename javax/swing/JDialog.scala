package javax.swing

import java.awt.{Component, Container, Dialog, Dialog.ModalityType, Frame, Graphics, GraphicsConfiguration, LayoutManager, Window}
import java.awt.event.WindowEvent
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}

// The main class for creating a dialog window. You can use this class
// to create a custom dialog, or invoke the many class methods
// in JOptionPane to create a variety of standard dialogs.
// For information about creating dialogs, see
// The Java Tutorial section
// How
// to Make Dialogs.
//
// 
//
// The JDialog component contains a JRootPane
// as its only child.
// The contentPane should be the parent of any children of the
// JDialog.
// As a convenience, the add, remove, and setLayout
// methods of this class are overridden, so that they delegate calls
// to the corresponding methods of the ContentPane.
// For example, you can add a child component to a dialog as follows:
// 
//       dialog.add(child);
// 
// And the child will be added to the contentPane.
// The contentPane is always non-null.
// Attempting to set it to null generates an exception.
// The default contentPane has a BorderLayout
// manager set on it.
// Refer to RootPaneContainer
// for details on adding, removing and setting the LayoutManager
// of a JDialog.
// 
// Please see the JRootPane documentation for a complete
// description of the contentPane, glassPane,
// and layeredPane components.
// 
// In a multi-screen environment, you can create a JDialog
// on a different screen device than its owner.  See Frame for
// more information.
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
class JDialog extends Dialog with WindowConstants, with Accessible, with RootPaneContainer {

    @stub
    // Creates a modeless dialog without a title and without a specified
    // Frame owner.
    def this() = ???

    @stub
    // Creates a modeless dialog with the specified Dialog
    // as its owner and an empty title.
    def this(owner: Dialog) = ???

    @stub
    // Creates a dialog with an empty title and the specified modality and
    // Dialog as its owner.
    def this(owner: Dialog, modal: Boolean) = ???

    @stub
    // Creates a modeless dialog with the specified title and
    // with the specified owner dialog.
    def this(owner: Dialog, title: String) = ???

    @stub
    // Creates a dialog with the specified title, modality
    // and the specified owner Dialog.
    def this(owner: Dialog, title: String, modal: Boolean) = ???

    @stub
    // Creates a dialog with the specified title, owner Dialog,
    // modality and GraphicsConfiguration.
    def this(owner: Dialog, title: String, modal: Boolean, gc: GraphicsConfiguration) = ???

    @stub
    // Creates a modeless dialog with the specified Frame
    // as its owner and an empty title.
    def this(owner: Frame) = ???

    @stub
    // Creates a dialog with an empty title and the specified modality and
    // Frame as its owner.
    def this(owner: Frame, modal: Boolean) = ???

    @stub
    // Creates a modeless dialog with the specified title and
    // with the specified owner frame.
    def this(owner: Frame, title: String) = ???

    @stub
    // Creates a dialog with the specified title, owner Frame
    // and modality.
    def this(owner: Frame, title: String, modal: Boolean) = ???

    @stub
    // Creates a dialog with the specified title,
    // owner Frame, modality and GraphicsConfiguration.
    def this(owner: Frame, title: String, modal: Boolean, gc: GraphicsConfiguration) = ???

    @stub
    // Creates a modeless dialog with the specified Window
    // as its owner and an empty title.
    def this(owner: Window) = ???

    @stub
    // Creates a dialog with an empty title and the specified modality and
    // Window as its owner.
    def this(owner: Window, modalityType: Dialog.ModalityType) = ???

    @stub
    // Creates a modeless dialog with the specified title and owner
    // Window.
    def this(owner: Window, title: String) = ???

    @stub
    // Creates a dialog with the specified title, owner Window and
    // modality.
    def this(owner: Window, title: String, modalityType: Dialog.ModalityType) = ???

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
    // Called by the constructor methods to create the default
    // rootPane.
    protected def createRootPane(): JRootPane = ???

    @stub
    // Called by the constructors to init the JDialog properly.
    protected def dialogInit(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this JDialog.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the contentPane object for this dialog.
    def getContentPane(): Container = ???

    @stub
    // Returns the operation which occurs when the user
    // initiates a "close" on this dialog.
    def getDefaultCloseOperation(): Int = ???

    @stub
    // Returns the glassPane object for this dialog.
    def getGlassPane(): Component = ???

    @stub
    // Creates a graphics context for this component.
    def getGraphics(): Graphics = ???

    @stub
    // Returns the menubar set on this dialog.
    def getJMenuBar(): JMenuBar = ???

    @stub
    // Returns the layeredPane object for this dialog.
    def getLayeredPane(): JLayeredPane = ???

    @stub
    // Returns the rootPane object for this dialog.
    def getRootPane(): JRootPane = ???

    @stub
    // Gets the transferHandler property.
    def getTransferHandler(): TransferHandler = ???

    @stub
    // Returns whether calls to add and
    // setLayout are forwarded to the contentPane.
    protected def isRootPaneCheckingEnabled(): Boolean = ???

    @stub
    // Returns a string representation of this JDialog.
    protected def paramString(): String = ???

    @stub
    // Handles window events depending on the state of the
    // defaultCloseOperation property.
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
    // the user initiates a "close" on this dialog.
    def setDefaultCloseOperation(operation: Int): Unit = ???

    @stub
    // Sets the glassPane property.
    def setGlassPane(glassPane: Component): Unit = ???

    @stub
    // Sets the menubar for this dialog.
    def setJMenuBar(menu: JMenuBar): Unit = ???

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

object JDialog {
    @stub
    // Returns true if newly created JDialogs should have their
    // Window decorations provided by the current look and feel.
    def isDefaultLookAndFeelDecorated(): Boolean = ???

    @stub
    // Provides a hint as to whether or not newly created JDialogs
    // should have their Window decorations (such as borders, widgets to
    // close the window, title...) provided by the current look
    // and feel.
    def setDefaultLookAndFeelDecorated(defaultLookAndFeelDecorated: Boolean): Unit = ???
}

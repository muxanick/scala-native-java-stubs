package java.awt

import java.lang.{Object, String}
import javax.accessibility.AccessibleContext

// A Dialog is a top-level window with a title and a border
// that is typically used to take some form of input from the user.
//
// The size of the dialog includes any area designated for the
// border.  The dimensions of the border area can be obtained
// using the getInsets method, however, since
// these dimensions are platform-dependent, a valid insets
// value cannot be obtained until the dialog is made displayable
// by either calling pack or show.
// Since the border area is included in the overall size of the
// dialog, the border effectively obscures a portion of the dialog,
// constraining the area available for rendering and/or displaying
// subcomponents to the rectangle which has an upper-left corner
// location of (insets.left, insets.top), and has a size of
// width - (insets.left + insets.right) by
// height - (insets.top + insets.bottom).
// 
// The default layout for a dialog is BorderLayout.
// 
// A dialog may have its native decorations (i.e. Frame & Titlebar) turned off
// with setUndecorated.  This can only be done while the dialog
// is not displayable.
// 
// A dialog may have another window as its owner when it's constructed.  When
// the owner window of a visible dialog is minimized, the dialog will
// automatically be hidden from the user. When the owner window is subsequently
// restored, the dialog is made visible to the user again.
// 
// In a multi-screen environment, you can create a Dialog
// on a different screen device than its owner.  See Frame for
// more information.
// 
// A dialog can be either modeless (the default) or modal.  A modal
// dialog is one which blocks input to some other top-level windows
// in the application, except for any windows created with the dialog
// as their owner. See AWT Modality
// specification for details.
// 
// Dialogs are capable of generating the following
// WindowEvents:
// WindowOpened, WindowClosing,
// WindowClosed, WindowActivated,
// WindowDeactivated, WindowGainedFocus,
// WindowLostFocus.
class Dialog extends Window {

    @stub
    // Constructs an initially invisible, modeless Dialog with
    // the specified owner Dialog and an empty title.
    def this(owner: Dialog) = ???

    @stub
    // Constructs an initially invisible, modeless Dialog
    // with the specified owner Dialog and title.
    def this(owner: Dialog, title: String) = ???

    @stub
    // Constructs an initially invisible Dialog with the
    // specified owner Dialog, title, and modality.
    def this(owner: Dialog, title: String, modal: Boolean) = ???

    @stub
    // Constructs an initially invisible Dialog with the
    // specified owner Dialog, title, modality and
    // GraphicsConfiguration.
    def this(owner: Dialog, title: String, modal: Boolean, gc: GraphicsConfiguration) = ???

    @stub
    // Constructs an initially invisible, modeless Dialog with
    // the specified owner Frame and an empty title.
    def this(owner: Frame) = ???

    @stub
    // Constructs an initially invisible Dialog with the specified
    // owner Frame and modality and an empty title.
    def this(owner: Frame, modal: Boolean) = ???

    @stub
    // Constructs an initially invisible, modeless Dialog with
    // the specified owner Frame and title.
    def this(owner: Frame, title: String) = ???

    @stub
    // Constructs an initially invisible Dialog with the
    // specified owner Frame, title and modality.
    def this(owner: Frame, title: String, modal: Boolean) = ???

    @stub
    // Constructs an initially invisible Dialog with the specified owner
    // Frame, title, modality, and GraphicsConfiguration.
    def this(owner: Frame, title: String, modal: Boolean, gc: GraphicsConfiguration) = ???

    @stub
    // Constructs an initially invisible, modeless Dialog with the
    // specified owner Window and an empty title.
    def this(owner: Window) = ???

    @stub
    // Constructs an initially invisible Dialog with the
    // specified owner Window and modality and an empty title.
    def this(owner: Window, modalityType: Dialog.ModalityType) = ???

    @stub
    // Constructs an initially invisible, modeless Dialog with
    // the specified owner Window and title.
    def this(owner: Window, title: String) = ???

    @stub
    // Constructs an initially invisible Dialog with the
    // specified owner Window, title and modality.
    def this(owner: Window, title: String, modalityType: Dialog.ModalityType) = ???

    @stub
    // This class implements accessibility support for the
    // Dialog class.
    protected def Dialog.AccessibleAWTDialog: class = ???

    @stub
    // Makes this Dialog displayable by connecting it to
    // a native screen resource.
    def addNotify(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this Dialog.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the modality type of this dialog.
    def getModalityType(): Dialog.ModalityType = ???

    @stub
    // Gets the title of the dialog.
    def getTitle(): String = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.5, replaced by
    // setVisible(boolean).
    //
    def hide(): Unit = ???

    @stub
    // Indicates whether the dialog is modal.
    def isModal(): Boolean = ???

    @stub
    // Indicates whether this dialog is resizable by the user.
    def isResizable(): Boolean = ???

    @stub
    // Indicates whether this dialog is undecorated.
    def isUndecorated(): Boolean = ???

    @stub
    // Returns a string representing the state of this dialog.
    protected def paramString(): String = ???

    @stub
    // Sets the background color of this window.
    def setBackground(bgColor: Color): Unit = ???

    @stub
    // Specifies whether this dialog should be modal.
    def setModal(modal: Boolean): Unit = ???

    @stub
    // Sets the modality type for this dialog.
    def setModalityType(type: Dialog.ModalityType): Unit = ???

    @stub
    // Sets the opacity of the window.
    def setOpacity(opacity: float): Unit = ???

    @stub
    // Sets whether this dialog is resizable by the user.
    def setResizable(resizable: Boolean): Unit = ???

    @stub
    // Sets the shape of the window.
    def setShape(shape: Shape): Unit = ???

    @stub
    // Sets the title of the Dialog.
    def setTitle(title: String): Unit = ???

    @stub
    // Disables or enables decorations for this dialog.
    def setUndecorated(undecorated: Boolean): Unit = ???

    @stub
    // Shows or hides this Dialog depending on the value of parameter
    // b.
    def setVisible(b: Boolean): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.5, replaced by
    // setVisible(boolean).
    //
    def show(): Unit = ???
}

object Dialog {
    @stub
    // Any top-level window can be marked not to be blocked by modal
    // dialogs.
    def Dialog.ModalExclusionType: class = ???
}

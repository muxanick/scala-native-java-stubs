package java.awt

import java.lang.{Enum, Object, String}
import javax.accessibility.{AccessibleContext, AccessibleRole, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** A Dialog is a top-level window with a title and a border
 *  that is typically used to take some form of input from the user.
 * 
 *  The size of the dialog includes any area designated for the
 *  border.  The dimensions of the border area can be obtained
 *  using the getInsets method, however, since
 *  these dimensions are platform-dependent, a valid insets
 *  value cannot be obtained until the dialog is made displayable
 *  by either calling pack or show.
 *  Since the border area is included in the overall size of the
 *  dialog, the border effectively obscures a portion of the dialog,
 *  constraining the area available for rendering and/or displaying
 *  subcomponents to the rectangle which has an upper-left corner
 *  location of (insets.left, insets.top), and has a size of
 *  width - (insets.left + insets.right) by
 *  height - (insets.top + insets.bottom).
 *  
 *  The default layout for a dialog is BorderLayout.
 *  
 *  A dialog may have its native decorations (i.e. Frame & Titlebar) turned off
 *  with setUndecorated.  This can only be done while the dialog
 *  is not displayable.
 *  
 *  A dialog may have another window as its owner when it's constructed.  When
 *  the owner window of a visible dialog is minimized, the dialog will
 *  automatically be hidden from the user. When the owner window is subsequently
 *  restored, the dialog is made visible to the user again.
 *  
 *  In a multi-screen environment, you can create a Dialog
 *  on a different screen device than its owner.  See Frame for
 *  more information.
 *  
 *  A dialog can be either modeless (the default) or modal.  A modal
 *  dialog is one which blocks input to some other top-level windows
 *  in the application, except for any windows created with the dialog
 *  as their owner. See AWT Modality
 *  specification for details.
 *  
 *  Dialogs are capable of generating the following
 *  WindowEvents:
 *  WindowOpened, WindowClosing,
 *  WindowClosed, WindowActivated,
 *  WindowDeactivated, WindowGainedFocus,
 *  WindowLostFocus.
 */
class Dialog extends Window {

    /** Constructs an initially invisible, modeless Dialog with
     *  the specified owner Dialog and an empty title.
     */
    @stub
    def this(owner: Dialog) = ???

    /** Constructs an initially invisible, modeless Dialog
     *  with the specified owner Dialog and title.
     */
    @stub
    def this(owner: Dialog, title: String) = ???

    /** Constructs an initially invisible Dialog with the
     *  specified owner Dialog, title, and modality.
     */
    @stub
    def this(owner: Dialog, title: String, modal: Boolean) = ???

    /** Constructs an initially invisible Dialog with the
     *  specified owner Dialog, title, modality and
     *  GraphicsConfiguration.
     */
    @stub
    def this(owner: Dialog, title: String, modal: Boolean, gc: GraphicsConfiguration) = ???

    /** Constructs an initially invisible, modeless Dialog with
     *  the specified owner Frame and an empty title.
     */
    @stub
    def this(owner: Frame) = ???

    /** Constructs an initially invisible Dialog with the specified
     *  owner Frame and modality and an empty title.
     */
    @stub
    def this(owner: Frame, modal: Boolean) = ???

    /** Constructs an initially invisible, modeless Dialog with
     *  the specified owner Frame and title.
     */
    @stub
    def this(owner: Frame, title: String) = ???

    /** Constructs an initially invisible Dialog with the
     *  specified owner Frame, title and modality.
     */
    @stub
    def this(owner: Frame, title: String, modal: Boolean) = ???

    /** Constructs an initially invisible Dialog with the specified owner
     *  Frame, title, modality, and GraphicsConfiguration.
     */
    @stub
    def this(owner: Frame, title: String, modal: Boolean, gc: GraphicsConfiguration) = ???

    /** Constructs an initially invisible, modeless Dialog with the
     *  specified owner Window and an empty title.
     */
    @stub
    def this(owner: Window) = ???

    /** Constructs an initially invisible Dialog with the
     *  specified owner Window and modality and an empty title.
     */
    @stub
    def this(owner: Window, modalityType: Dialog.ModalityType) = ???

    /** Constructs an initially invisible, modeless Dialog with
     *  the specified owner Window and title.
     */
    @stub
    def this(owner: Window, title: String) = ???

    /** Constructs an initially invisible Dialog with the
     *  specified owner Window, title and modality.
     */
    @stub
    def this(owner: Window, title: String, modalityType: Dialog.ModalityType) = ???

    /** Constructs an initially invisible Dialog with the
     *  specified owner Window, title, modality and
     *  GraphicsConfiguration.
     */
    @stub
    def this(owner: Window, title: String, modalityType: Dialog.ModalityType, gc: GraphicsConfiguration) = ???

    /** This class implements accessibility support for the
     *  Dialog class.  It provides an implementation of the
     *  Java Accessibility API appropriate to dialog user-interface elements.
     */
    protected class AccessibleAWTDialog extends Window.AccessibleAWTWindow {

        /**  */
        @stub
        protected def this() = ???

        /** Get the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???

        /** Get the state of this object. */
        @stub
        def getAccessibleStateSet(): AccessibleStateSet = ???
    }


    /** Makes this Dialog displayable by connecting it to
     *  a native screen resource.
     */
    @stub
    def addNotify(): Unit = ???

    /** Gets the AccessibleContext associated with this Dialog. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the modality type of this dialog. */
    @stub
    def getModalityType(): Dialog.ModalityType = ???

    /** Gets the title of the dialog. */
    @stub
    def getTitle(): String = ???

    /** Deprecated. 
     * As of JDK version 1.5, replaced by
     *  setVisible(boolean).
     * 
     */
    @stub
    def hide(): Unit = ???

    /** Indicates whether the dialog is modal. */
    @stub
    def isModal(): Boolean = ???

    /** Indicates whether this dialog is resizable by the user. */
    @stub
    def isResizable(): Boolean = ???

    /** Indicates whether this dialog is undecorated. */
    @stub
    def isUndecorated(): Boolean = ???

    /** Returns a string representing the state of this dialog. */
    @stub
    protected def paramString(): String = ???

    /** Sets the background color of this window. */
    @stub
    def setBackground(bgColor: Color): Unit = ???

    /** Specifies whether this dialog should be modal. */
    @stub
    def setModal(modal: Boolean): Unit = ???

    /** Sets the modality type for this dialog. */
    @stub
    def setModalityType(type: Dialog.ModalityType): Unit = ???

    /** Sets the opacity of the window. */
    @stub
    def setOpacity(opacity: Float): Unit = ???

    /** Sets whether this dialog is resizable by the user. */
    @stub
    def setResizable(resizable: Boolean): Unit = ???

    /** Sets the shape of the window. */
    @stub
    def setShape(shape: Shape): Unit = ???

    /** Sets the title of the Dialog. */
    @stub
    def setTitle(title: String): Unit = ???

    /** Disables or enables decorations for this dialog. */
    @stub
    def setUndecorated(undecorated: Boolean): Unit = ???

    /** Shows or hides this Dialog depending on the value of parameter
     *  b.
     */
    @stub
    def setVisible(b: Boolean): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.5, replaced by
     *  setVisible(boolean).
     * 
     */
    @stub
    def show(): Unit = ???

    /** If this Window is visible, sends this Window to the back and may cause
     *  it to lose focus or activation if it is the focused or active Window.
     */
    @stub
    def toBack(): Unit = ???
}

object Dialog {
    /** Any top-level window can be marked not to be blocked by modal
     *  dialogs. This is called "modal exclusion". This enum specifies
     *  the possible modal exclusion types.
     */
    class ModalExclusionType private (name: String, ordinal: Int) extends Enum[ModalExclusionType](name, ordinal) {
    }

    object ModalExclusionType {
        /** APPLICATION_EXCLUDE indicates that a top-level window
         *  won't be blocked by any application-modal dialogs.
         */
        final val APPLICATION_EXCLUDE: ModalExclusionType = new ModalExclusionType("APPLICATION_EXCLUDE", 0)

        /** No modal exclusion. */
        final val NO_EXCLUDE: ModalExclusionType = new ModalExclusionType("NO_EXCLUDE", 1)

        /** TOOLKIT_EXCLUDE indicates that a top-level window
         *  won't be blocked by  application-modal or toolkit-modal dialogs.
         */
        final val TOOLKIT_EXCLUDE: ModalExclusionType = new ModalExclusionType("TOOLKIT_EXCLUDE", 2)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): ModalExclusionType = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[ModalExclusionType] = ???
    }


    /** Modal dialogs block all input to some top-level windows.
     *  Whether a particular window is blocked depends on dialog's type
     *  of modality; this is called the "scope of blocking". The
     *  ModalityType enum specifies modal types and their
     *  associated scopes.
     */
    class ModalityType private (name: String, ordinal: Int) extends Enum[ModalityType](name, ordinal) {
    }

    object ModalityType {
        /** An APPLICATION_MODAL dialog blocks all top-level windows
         *  from the same Java application except those from its own child hierarchy.
         */
        final val APPLICATION_MODAL: ModalityType = new ModalityType("APPLICATION_MODAL", 0)

        /** A DOCUMENT_MODAL dialog blocks input to all top-level windows
         *  from the same document except those from its own child hierarchy.
         */
        final val DOCUMENT_MODAL: ModalityType = new ModalityType("DOCUMENT_MODAL", 1)

        /** MODELESS dialog doesn't block any top-level windows. */
        final val MODELESS: ModalityType = new ModalityType("MODELESS", 2)

        /** A TOOLKIT_MODAL dialog blocks all top-level windows run
         *  from the same toolkit except those from its own child hierarchy.
         */
        final val TOOLKIT_MODAL: ModalityType = new ModalityType("TOOLKIT_MODAL", 3)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): ModalityType = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[ModalityType] = ???
    }


    /** Default modality type for modal dialogs. */
    @stub
    val DEFAULT_MODALITY_TYPE: Dialog.ModalityType = ???
}

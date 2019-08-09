package javax.accessibility

import java.lang.Object

// Class AccessibleState describes a component's particular state.  The actual
// state of the component is defined as an AccessibleStateSet, which is a
// composed set of AccessibleStates.
// The toDisplayString method allows you to obtain the localized string
// for a locale independent key from a predefined ResourceBundle for the
// keys defined in this class.
// The constants in this class present a strongly typed enumeration
// of common object roles.  A public constructor for this class has been
// purposely omitted and applications should use one of the constants
// from this class.  If the constants in this class are not sufficient
// to describe the role of an object, a subclass should be generated
// from this class and it should provide constants in a similar manner.
class AccessibleState extends AccessibleBundle {
}

object AccessibleState {
    @stub
    // Indicates a window is currently the active window.
    def ACTIVE: AccessibleState = ???

    @stub
    // Indicates that the object is armed.
    def ARMED: AccessibleState = ???

    @stub
    // Indicates the current object is busy.
    def BUSY: AccessibleState = ???

    @stub
    // Indicates this object is currently checked.
    def CHECKED: AccessibleState = ???

    @stub
    // Indicates this object is collapsed.
    def COLLAPSED: AccessibleState = ???

    @stub
    // Indicates the user can change the contents of this object.
    def EDITABLE: AccessibleState = ???

    @stub
    // Indicates this object is enabled.
    def ENABLED: AccessibleState = ???

    @stub
    // Indicates this object allows progressive disclosure of its children.
    def EXPANDABLE: AccessibleState = ???

    @stub
    // Indicates this object is expanded.
    def EXPANDED: AccessibleState = ???

    @stub
    // Indicates this object can accept keyboard focus, which means all
    // events resulting from typing on the keyboard will normally be
    // passed to it when it has focus.
    def FOCUSABLE: AccessibleState = ???

    @stub
    // Indicates this object currently has the keyboard focus.
    def FOCUSED: AccessibleState = ???

    @stub
    // Indicates the orientation of this object is horizontal.
    def HORIZONTAL: AccessibleState = ???

    @stub
    // Indicates this object is minimized and is represented only by an
    // icon.
    def ICONIFIED: AccessibleState = ???

    @stub
    // Indicates that the object state is indeterminate.
    def INDETERMINATE: AccessibleState = ???

    @stub
    // Indicates this object is responsible for managing its
    // subcomponents.
    def MANAGES_DESCENDANTS: AccessibleState = ???

    @stub
    // Indicates something must be done with this object before the
    // user can interact with an object in a different window.
    def MODAL: AccessibleState = ???

    @stub
    // Indicates this (text) object can contain multiple lines of text
    def MULTI_LINE: AccessibleState = ???

    @stub
    // Indicates this object allows more than one of its children to
    // be selected at the same time.
    def MULTISELECTABLE: AccessibleState = ???

    @stub
    // Indicates this object paints every pixel within its
    // rectangular region.
    def OPAQUE: AccessibleState = ???

    @stub
    // Indicates this object is currently pressed.
    def PRESSED: AccessibleState = ???

    @stub
    // Indicates the size of this object is not fixed.
    def RESIZABLE: AccessibleState = ???

    @stub
    // Indicates this object is the child of an object that allows its
    // children to be selected, and that this child is one of those
    // children that can be selected.
    def SELECTABLE: AccessibleState = ???

    @stub
    // Indicates this object is the child of an object that allows its
    // children to be selected, and that this child is one of those
    // children that has been selected.
    def SELECTED: AccessibleState = ???

    @stub
    // Indicates this object, the object's parent, the object's parent's
    // parent, and so on, are all visible.
    def SHOWING: AccessibleState = ???

    @stub
    // Indicates this (text) object can contain only a single line of text
    def SINGLE_LINE: AccessibleState = ???

    @stub
    // Indicates this object is transient.
    def TRANSIENT: AccessibleState = ???

    @stub
    // A state indicating that text is truncated by a bounding rectangle
    // and that some of the text is not displayed on the screen.
    def TRUNCATED: AccessibleState = ???

    @stub
    // Indicates the orientation of this object is vertical.
    def VERTICAL: AccessibleState = ???
}

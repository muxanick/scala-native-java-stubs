package javax.accessibility

import java.lang.Object

/** Class AccessibleState describes a component's particular state.  The actual
 *  state of the component is defined as an AccessibleStateSet, which is a
 *  composed set of AccessibleStates.
 *  The toDisplayString method allows you to obtain the localized string
 *  for a locale independent key from a predefined ResourceBundle for the
 *  keys defined in this class.
 *  The constants in this class present a strongly typed enumeration
 *  of common object roles.  A public constructor for this class has been
 *  purposely omitted and applications should use one of the constants
 *  from this class.  If the constants in this class are not sufficient
 *  to describe the role of an object, a subclass should be generated
 *  from this class and it should provide constants in a similar manner.
 */
class AccessibleState extends AccessibleBundle {
}

object AccessibleState {
    /** Indicates a window is currently the active window. */
    @stub
    val ACTIVE: AccessibleState = ???

    /** Indicates that the object is armed. */
    @stub
    val ARMED: AccessibleState = ???

    /** Indicates the current object is busy. */
    @stub
    val BUSY: AccessibleState = ???

    /** Indicates this object is currently checked. */
    @stub
    val CHECKED: AccessibleState = ???

    /** Indicates this object is collapsed. */
    @stub
    val COLLAPSED: AccessibleState = ???

    /** Indicates the user can change the contents of this object. */
    @stub
    val EDITABLE: AccessibleState = ???

    /** Indicates this object is enabled. */
    @stub
    val ENABLED: AccessibleState = ???

    /** Indicates this object allows progressive disclosure of its children. */
    @stub
    val EXPANDABLE: AccessibleState = ???

    /** Indicates this object is expanded. */
    @stub
    val EXPANDED: AccessibleState = ???

    /** Indicates this object can accept keyboard focus, which means all
     *  events resulting from typing on the keyboard will normally be
     *  passed to it when it has focus.
     */
    @stub
    val FOCUSABLE: AccessibleState = ???

    /** Indicates this object currently has the keyboard focus. */
    @stub
    val FOCUSED: AccessibleState = ???

    /** Indicates the orientation of this object is horizontal. */
    @stub
    val HORIZONTAL: AccessibleState = ???

    /** Indicates this object is minimized and is represented only by an
     *  icon.
     */
    @stub
    val ICONIFIED: AccessibleState = ???

    /** Indicates that the object state is indeterminate. */
    @stub
    val INDETERMINATE: AccessibleState = ???

    /** Indicates this object is responsible for managing its
     *  subcomponents.
     */
    @stub
    val MANAGES_DESCENDANTS: AccessibleState = ???

    /** Indicates something must be done with this object before the
     *  user can interact with an object in a different window.
     */
    @stub
    val MODAL: AccessibleState = ???

    /** Indicates this (text) object can contain multiple lines of text */
    @stub
    val MULTI_LINE: AccessibleState = ???

    /** Indicates this object allows more than one of its children to
     *  be selected at the same time.
     */
    @stub
    val MULTISELECTABLE: AccessibleState = ???

    /** Indicates this object paints every pixel within its
     *  rectangular region.
     */
    @stub
    val OPAQUE: AccessibleState = ???

    /** Indicates this object is currently pressed. */
    @stub
    val PRESSED: AccessibleState = ???

    /** Indicates the size of this object is not fixed. */
    @stub
    val RESIZABLE: AccessibleState = ???

    /** Indicates this object is the child of an object that allows its
     *  children to be selected, and that this child is one of those
     *  children that can be selected.
     */
    @stub
    val SELECTABLE: AccessibleState = ???

    /** Indicates this object is the child of an object that allows its
     *  children to be selected, and that this child is one of those
     *  children that has been selected.
     */
    @stub
    val SELECTED: AccessibleState = ???

    /** Indicates this object, the object's parent, the object's parent's
     *  parent, and so on, are all visible.
     */
    @stub
    val SHOWING: AccessibleState = ???

    /** Indicates this (text) object can contain only a single line of text */
    @stub
    val SINGLE_LINE: AccessibleState = ???

    /** Indicates this object is transient. */
    @stub
    val TRANSIENT: AccessibleState = ???

    /** A state indicating that text is truncated by a bounding rectangle
     *  and that some of the text is not displayed on the screen.
     */
    @stub
    val TRUNCATED: AccessibleState = ???

    /** Indicates the orientation of this object is vertical. */
    @stub
    val VERTICAL: AccessibleState = ???
}

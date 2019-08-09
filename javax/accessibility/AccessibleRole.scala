package javax.accessibility

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Class AccessibleRole determines the role of a component.  The role of a
 *  component describes its generic function. (E.G.,
 *  "push button," "table," or "list.")
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
class AccessibleRole extends AccessibleBundle {

    /** Creates a new AccessibleRole using the given locale independent key. */
    @stub
    protected def this(key: String) = ???
}

object AccessibleRole {
    /** Object is used to alert the user about something. */
    @stub
    val ALERT: AccessibleRole = ???

    /** An AWT component, but nothing else is known about it. */
    @stub
    val AWT_COMPONENT: AccessibleRole = ???

    /** Object that can be drawn into and is used to trap
     *  events.
     */
    @stub
    val CANVAS: AccessibleRole = ???

    /** A choice that can be checked or unchecked and provides a
     *  separate indicator for the current state.
     */
    @stub
    val CHECK_BOX: AccessibleRole = ???

    /** A specialized pane that lets the user choose a color. */
    @stub
    val COLOR_CHOOSER: AccessibleRole = ???

    /** The header for a column of data. */
    @stub
    val COLUMN_HEADER: AccessibleRole = ???

    /** A list of choices the user can select from. */
    @stub
    val COMBO_BOX: AccessibleRole = ???

    /** A DATE_EDITOR is a component that allows users to edit
     *  java.util.Date and java.util.Time objects
     */
    @stub
    val DATE_EDITOR: AccessibleRole = ???

    /** An iconified internal frame in a DESKTOP_PANE. */
    @stub
    val DESKTOP_ICON: AccessibleRole = ???

    /** A pane that supports internal frames and
     *  iconified versions of those internal frames.
     */
    @stub
    val DESKTOP_PANE: AccessibleRole = ???

    /** A top level window with title bar and a border. */
    @stub
    val DIALOG: AccessibleRole = ???

    /** A pane that allows the user to navigate through
     *  and select the contents of a directory.
     */
    @stub
    val DIRECTORY_PANE: AccessibleRole = ???

    /** A role indicating the object acts as a formula for
     *  calculating a value.
     */
    @stub
    val EDITBAR: AccessibleRole = ???

    /** A specialized dialog that displays the files in the directory
     *  and lets the user select a file, browse a different directory,
     *  or specify a filename.
     */
    @stub
    val FILE_CHOOSER: AccessibleRole = ???

    /** An object that fills up space in a user interface. */
    @stub
    val FILLER: AccessibleRole = ???

    /** A FONT_CHOOSER is a component that lets the user pick various
     *  attributes for fonts.
     */
    @stub
    val FONT_CHOOSER: AccessibleRole = ???

    /** A text footer */
    @stub
    val FOOTER: AccessibleRole = ???

    /** A top level window with a title bar, border, menu bar, etc. */
    @stub
    val FRAME: AccessibleRole = ???

    /** A pane that is guaranteed to be painted on top
     *  of all panes beneath it.
     */
    @stub
    val GLASS_PANE: AccessibleRole = ???

    /** A GROUP_BOX is a simple container that contains a border
     *  around it and contains components inside it.
     */
    @stub
    val GROUP_BOX: AccessibleRole = ???

    /** A text header */
    @stub
    val HEADER: AccessibleRole = ???

    /** An object containing a collection of Accessibles that
     *  together represents HTML content.
     */
    @stub
    val HTML_CONTAINER: AccessibleRole = ???

    /** A hypertext anchor */
    @stub
    val HYPERLINK: AccessibleRole = ???

    /** A small fixed size picture, typically used to decorate components. */
    @stub
    val ICON: AccessibleRole = ???

    /** A frame-like object that is clipped by a desktop pane. */
    @stub
    val INTERNAL_FRAME: AccessibleRole = ???

    /** An object used to present an icon or short string in an interface. */
    @stub
    val LABEL: AccessibleRole = ???

    /** A specialized pane that allows its children to be drawn in layers,
     *  providing a form of stacking order.
     */
    @stub
    val LAYERED_PANE: AccessibleRole = ???

    /** An object that presents a list of objects to the user and allows the
     *  user to select one or more of them.
     */
    @stub
    val LIST: AccessibleRole = ???

    /** An object that presents an element in a list. */
    @stub
    val LIST_ITEM: AccessibleRole = ???

    /** An object usually found inside a menu bar that contains a list
     *  of actions the user can choose from.
     */
    @stub
    val MENU: AccessibleRole = ???

    /** An object usually drawn at the top of the primary dialog box of
     *  an application that contains a list of menus the user can choose
     *  from.
     */
    @stub
    val MENU_BAR: AccessibleRole = ???

    /** An object usually contained in a menu that presents an action
     *  the user can choose.
     */
    @stub
    val MENU_ITEM: AccessibleRole = ???

    /** A specialized pane whose primary use is inside a DIALOG */
    @stub
    val OPTION_PANE: AccessibleRole = ???

    /** An object that is a child of a page tab list. */
    @stub
    val PAGE_TAB: AccessibleRole = ???

    /** An object that presents a series of panels (or page tabs), one at a
     *  time, through some mechanism provided by the object.
     */
    @stub
    val PAGE_TAB_LIST: AccessibleRole = ???

    /** A generic container that is often used to group objects. */
    @stub
    val PANEL: AccessibleRole = ???

    /** A text paragraph */
    @stub
    val PARAGRAPH: AccessibleRole = ???

    /** A text object used for passwords, or other places where the
     *  text contents is not shown visibly to the user
     */
    @stub
    val PASSWORD_TEXT: AccessibleRole = ???

    /** A temporary window that is usually used to offer the user a
     *  list of choices, and then hides when the user selects one of
     *  those choices.
     */
    @stub
    val POPUP_MENU: AccessibleRole = ???

    /** An object used to indicate how much of a task has been completed. */
    @stub
    val PROGRESS_BAR: AccessibleRole = ???

    /** A role indicating the object monitors the progress
     *  of some operation.
     */
    @stub
    val PROGRESS_MONITOR: AccessibleRole = ???

    /** An object the user can manipulate to tell the application to do
     *  something.
     */
    @stub
    val PUSH_BUTTON: AccessibleRole = ???

    /** A specialized check box that will cause other radio buttons in the
     *  same group to become unchecked when this one is checked.
     */
    @stub
    val RADIO_BUTTON: AccessibleRole = ???

    /** A specialized pane that has a glass pane and a layered pane as its
     *  children.
     */
    @stub
    val ROOT_PANE: AccessibleRole = ???

    /** The header for a row of data. */
    @stub
    val ROW_HEADER: AccessibleRole = ???

    /** A ruler is an object used to measure distance */
    @stub
    val RULER: AccessibleRole = ???

    /** An object usually used to allow a user to incrementally view a
     *  large amount of data.
     */
    @stub
    val SCROLL_BAR: AccessibleRole = ???

    /** An object that allows a user to incrementally view a large amount
     *  of information.
     */
    @stub
    val SCROLL_PANE: AccessibleRole = ???

    /** An object usually contained in a menu to provide a visual
     *  and logical separation of the contents in a menu.
     */
    @stub
    val SEPARATOR: AccessibleRole = ???

    /** An object that allows the user to select from a bounded range. */
    @stub
    val SLIDER: AccessibleRole = ???

    /** A SPIN_BOX is a simple spinner component and its main use
     *  is for simple numbers.
     */
    @stub
    val SPIN_BOX: AccessibleRole = ???

    /** A specialized panel that presents two other panels at the same time. */
    @stub
    val SPLIT_PANE: AccessibleRole = ???

    /** A STATUS_BAR is an simple component that can contain
     *  multiple labels of status information to the user.
     */
    @stub
    val STATUS_BAR: AccessibleRole = ???

    /** A Swing component, but nothing else is known about it. */
    @stub
    val SWING_COMPONENT: AccessibleRole = ???

    /** An object used to present information in terms of rows and columns. */
    @stub
    val TABLE: AccessibleRole = ???

    /** An object that presents text to the user. */
    @stub
    val TEXT: AccessibleRole = ???

    /** A specialized push button that can be checked or unchecked, but
     *  does not provide a separate indicator for the current state.
     */
    @stub
    val TOGGLE_BUTTON: AccessibleRole = ???

    /** A bar or palette usually composed of push buttons or toggle buttons. */
    @stub
    val TOOL_BAR: AccessibleRole = ???

    /** An object that provides information about another object. */
    @stub
    val TOOL_TIP: AccessibleRole = ???

    /** An object used to present hierarchical information to the user. */
    @stub
    val TREE: AccessibleRole = ???

    /** The object contains some Accessible information, but its role is
     *  not known.
     */
    @stub
    val UNKNOWN: AccessibleRole = ???

    /** An object usually used in a scroll pane. */
    @stub
    val VIEWPORT: AccessibleRole = ???

    /** A top level window with no title or border. */
    @stub
    val WINDOW: AccessibleRole = ???
}

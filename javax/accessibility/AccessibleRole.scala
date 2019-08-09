package javax.accessibility

import java.lang.Object

// Class AccessibleRole determines the role of a component.  The role of a
// component describes its generic function. (E.G.,
// "push button," "table," or "list.")
// The toDisplayString method allows you to obtain the localized string
// for a locale independent key from a predefined ResourceBundle for the
// keys defined in this class.
// The constants in this class present a strongly typed enumeration
// of common object roles.  A public constructor for this class has been
// purposely omitted and applications should use one of the constants
// from this class.  If the constants in this class are not sufficient
// to describe the role of an object, a subclass should be generated
// from this class and it should provide constants in a similar manner.
class AccessibleRole extends AccessibleBundle {
}

object AccessibleRole {
    @stub
    // Object is used to alert the user about something.
    def ALERT: AccessibleRole = ???

    @stub
    // An AWT component, but nothing else is known about it.
    def AWT_COMPONENT: AccessibleRole = ???

    @stub
    // Object that can be drawn into and is used to trap
    // events.
    def CANVAS: AccessibleRole = ???

    @stub
    // A choice that can be checked or unchecked and provides a
    // separate indicator for the current state.
    def CHECK_BOX: AccessibleRole = ???

    @stub
    // A specialized pane that lets the user choose a color.
    def COLOR_CHOOSER: AccessibleRole = ???

    @stub
    // The header for a column of data.
    def COLUMN_HEADER: AccessibleRole = ???

    @stub
    // A list of choices the user can select from.
    def COMBO_BOX: AccessibleRole = ???

    @stub
    // A DATE_EDITOR is a component that allows users to edit
    // java.util.Date and java.util.Time objects
    def DATE_EDITOR: AccessibleRole = ???

    @stub
    // An iconified internal frame in a DESKTOP_PANE.
    def DESKTOP_ICON: AccessibleRole = ???

    @stub
    // A pane that supports internal frames and
    // iconified versions of those internal frames.
    def DESKTOP_PANE: AccessibleRole = ???

    @stub
    // A top level window with title bar and a border.
    def DIALOG: AccessibleRole = ???

    @stub
    // A pane that allows the user to navigate through
    // and select the contents of a directory.
    def DIRECTORY_PANE: AccessibleRole = ???

    @stub
    // A role indicating the object acts as a formula for
    // calculating a value.
    def EDITBAR: AccessibleRole = ???

    @stub
    // A specialized dialog that displays the files in the directory
    // and lets the user select a file, browse a different directory,
    // or specify a filename.
    def FILE_CHOOSER: AccessibleRole = ???

    @stub
    // An object that fills up space in a user interface.
    def FILLER: AccessibleRole = ???

    @stub
    // A FONT_CHOOSER is a component that lets the user pick various
    // attributes for fonts.
    def FONT_CHOOSER: AccessibleRole = ???

    @stub
    // A text footer
    def FOOTER: AccessibleRole = ???

    @stub
    // A top level window with a title bar, border, menu bar, etc.
    def FRAME: AccessibleRole = ???

    @stub
    // A pane that is guaranteed to be painted on top
    // of all panes beneath it.
    def GLASS_PANE: AccessibleRole = ???

    @stub
    // A GROUP_BOX is a simple container that contains a border
    // around it and contains components inside it.
    def GROUP_BOX: AccessibleRole = ???

    @stub
    // A text header
    def HEADER: AccessibleRole = ???

    @stub
    // An object containing a collection of Accessibles that
    // together represents HTML content.
    def HTML_CONTAINER: AccessibleRole = ???

    @stub
    // A hypertext anchor
    def HYPERLINK: AccessibleRole = ???

    @stub
    // A small fixed size picture, typically used to decorate components.
    def ICON: AccessibleRole = ???

    @stub
    // A frame-like object that is clipped by a desktop pane.
    def INTERNAL_FRAME: AccessibleRole = ???

    @stub
    // An object used to present an icon or short string in an interface.
    def LABEL: AccessibleRole = ???

    @stub
    // A specialized pane that allows its children to be drawn in layers,
    // providing a form of stacking order.
    def LAYERED_PANE: AccessibleRole = ???

    @stub
    // An object that presents a list of objects to the user and allows the
    // user to select one or more of them.
    def LIST: AccessibleRole = ???

    @stub
    // An object that presents an element in a list.
    def LIST_ITEM: AccessibleRole = ???

    @stub
    // An object usually found inside a menu bar that contains a list
    // of actions the user can choose from.
    def MENU: AccessibleRole = ???

    @stub
    // An object usually drawn at the top of the primary dialog box of
    // an application that contains a list of menus the user can choose
    // from.
    def MENU_BAR: AccessibleRole = ???

    @stub
    // An object usually contained in a menu that presents an action
    // the user can choose.
    def MENU_ITEM: AccessibleRole = ???

    @stub
    // A specialized pane whose primary use is inside a DIALOG
    def OPTION_PANE: AccessibleRole = ???

    @stub
    // An object that is a child of a page tab list.
    def PAGE_TAB: AccessibleRole = ???

    @stub
    // An object that presents a series of panels (or page tabs), one at a
    // time, through some mechanism provided by the object.
    def PAGE_TAB_LIST: AccessibleRole = ???

    @stub
    // A generic container that is often used to group objects.
    def PANEL: AccessibleRole = ???

    @stub
    // A text paragraph
    def PARAGRAPH: AccessibleRole = ???

    @stub
    // A text object used for passwords, or other places where the
    // text contents is not shown visibly to the user
    def PASSWORD_TEXT: AccessibleRole = ???

    @stub
    // A temporary window that is usually used to offer the user a
    // list of choices, and then hides when the user selects one of
    // those choices.
    def POPUP_MENU: AccessibleRole = ???

    @stub
    // An object used to indicate how much of a task has been completed.
    def PROGRESS_BAR: AccessibleRole = ???

    @stub
    // A role indicating the object monitors the progress
    // of some operation.
    def PROGRESS_MONITOR: AccessibleRole = ???

    @stub
    // An object the user can manipulate to tell the application to do
    // something.
    def PUSH_BUTTON: AccessibleRole = ???

    @stub
    // A specialized check box that will cause other radio buttons in the
    // same group to become unchecked when this one is checked.
    def RADIO_BUTTON: AccessibleRole = ???

    @stub
    // A specialized pane that has a glass pane and a layered pane as its
    // children.
    def ROOT_PANE: AccessibleRole = ???

    @stub
    // The header for a row of data.
    def ROW_HEADER: AccessibleRole = ???

    @stub
    // A ruler is an object used to measure distance
    def RULER: AccessibleRole = ???

    @stub
    // An object usually used to allow a user to incrementally view a
    // large amount of data.
    def SCROLL_BAR: AccessibleRole = ???

    @stub
    // An object that allows a user to incrementally view a large amount
    // of information.
    def SCROLL_PANE: AccessibleRole = ???

    @stub
    // An object usually contained in a menu to provide a visual
    // and logical separation of the contents in a menu.
    def SEPARATOR: AccessibleRole = ???

    @stub
    // An object that allows the user to select from a bounded range.
    def SLIDER: AccessibleRole = ???

    @stub
    // A SPIN_BOX is a simple spinner component and its main use
    // is for simple numbers.
    def SPIN_BOX: AccessibleRole = ???

    @stub
    // A specialized panel that presents two other panels at the same time.
    def SPLIT_PANE: AccessibleRole = ???

    @stub
    // A STATUS_BAR is an simple component that can contain
    // multiple labels of status information to the user.
    def STATUS_BAR: AccessibleRole = ???

    @stub
    // A Swing component, but nothing else is known about it.
    def SWING_COMPONENT: AccessibleRole = ???

    @stub
    // An object used to present information in terms of rows and columns.
    def TABLE: AccessibleRole = ???

    @stub
    // An object that presents text to the user.
    def TEXT: AccessibleRole = ???

    @stub
    // A specialized push button that can be checked or unchecked, but
    // does not provide a separate indicator for the current state.
    def TOGGLE_BUTTON: AccessibleRole = ???

    @stub
    // A bar or palette usually composed of push buttons or toggle buttons.
    def TOOL_BAR: AccessibleRole = ???

    @stub
    // An object that provides information about another object.
    def TOOL_TIP: AccessibleRole = ???

    @stub
    // An object used to present hierarchical information to the user.
    def TREE: AccessibleRole = ???

    @stub
    // The object contains some Accessible information, but its role is
    // not known.
    def UNKNOWN: AccessibleRole = ???

    @stub
    // An object usually used in a scroll pane.
    def VIEWPORT: AccessibleRole = ???
}

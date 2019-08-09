package java.awt.event

import java.awt.{AWTEvent, Component}
import java.lang.Object
import java.util.EventObject

// A low-level event which indicates that a Component has gained or lost the
// input focus. This low-level event is generated by a Component (such as a
// TextField). The event is passed to every FocusListener or
// FocusAdapter object which registered to receive such events
// using the Component's addFocusListener method. (
// FocusAdapter objects implement the FocusListener
// interface.) Each such listener object gets this FocusEvent when
// the event occurs.
// 
// There are two levels of focus events: permanent and temporary. Permanent
// focus change events occur when focus is directly moved from one Component to
// another, such as through a call to requestFocus() or as the user uses the
// TAB key to traverse Components. Temporary focus change events occur when
// focus is temporarily lost for a Component as the indirect result of another
// operation, such as Window deactivation or a Scrollbar drag. In this case,
// the original focus state will automatically be restored once that operation
// is finished, or, for the case of Window deactivation, when the Window is
// reactivated. Both permanent and temporary focus events are delivered using
// the FOCUS_GAINED and FOCUS_LOST event ids; the level may be distinguished in
// the event using the isTemporary() method.
// 
// An unspecified behavior will be caused if the id parameter
// of any particular FocusEvent instance is not
// in the range from FOCUS_FIRST to FOCUS_LAST.
class FocusEvent extends ComponentEvent {

    @stub
    // Constructs a FocusEvent object and identifies it
    // as a permanent change in focus.
    def this(source: Component, id: Int) = ???

    @stub
    // Constructs a FocusEvent object and identifies
    // whether or not the change is temporary.
    def this(source: Component, id: Int, temporary: Boolean) = ???

    @stub
    // Returns the other Component involved in this focus change.
    def getOppositeComponent(): Component = ???

    @stub
    // Identifies the focus change event as temporary or permanent.
    def isTemporary(): Boolean = ???
}

object FocusEvent {
    @stub
    // The first number in the range of ids used for focus events.
    def FOCUS_FIRST: Int = ???

    @stub
    // This event indicates that the Component is now the focus owner.
    def FOCUS_GAINED: Int = ???

    @stub
    // The last number in the range of ids used for focus events.
    def FOCUS_LAST: Int = ???
}

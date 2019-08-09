package org.w3c.dom.events

// The MouseEvent interface provides specific contextual
// information associated with Mouse events.
// The detail attribute inherited from UIEvent
// indicates the number of times a mouse button has been pressed and
// released over the same screen location during a user action. The
// attribute value is 1 when the user begins this action and increments by 1
// for each full sequence of pressing and releasing. If the user moves the
// mouse between the mousedown and mouseup the value will be set to 0,
// indicating that no click is occurring.
// In the case of nested elements mouse events are always targeted at the
// most deeply nested element. Ancestors of the targeted element may use
// bubbling to obtain notification of mouse events which occur within its
// descendent elements.
// See also the Document Object Model (DOM) Level 2 Events Specification.
trait MouseEvent extends UIEvent {

    @stub
    // Used to indicate whether the 'alt' key was depressed during the firing
    // of the event.
    def getAltKey(): Boolean = ???

    @stub
    // During mouse events caused by the depression or release of a mouse
    // button, button is used to indicate which mouse button
    // changed state.
    def getButton(): Short = ???

    @stub
    // The horizontal coordinate at which the event occurred relative to the
    // DOM implementation's client area.
    def getClientX(): Int = ???

    @stub
    // The vertical coordinate at which the event occurred relative to the DOM
    // implementation's client area.
    def getClientY(): Int = ???

    @stub
    // Used to indicate whether the 'ctrl' key was depressed during the firing
    // of the event.
    def getCtrlKey(): Boolean = ???

    @stub
    // Used to indicate whether the 'meta' key was depressed during the firing
    // of the event.
    def getMetaKey(): Boolean = ???

    @stub
    // Used to identify a secondary EventTarget related to a UI
    // event.
    def getRelatedTarget(): EventTarget = ???

    @stub
    // The horizontal coordinate at which the event occurred relative to the
    // origin of the screen coordinate system.
    def getScreenX(): Int = ???

    @stub
    // The vertical coordinate at which the event occurred relative to the
    // origin of the screen coordinate system.
    def getScreenY(): Int = ???

    @stub
    // Used to indicate whether the 'shift' key was depressed during the
    // firing of the event.
    def getShiftKey(): Boolean = ???
}

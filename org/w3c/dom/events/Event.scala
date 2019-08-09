package org.w3c.dom.events

import java.lang.String

// The Event interface is used to provide contextual information
// about an event to the handler processing the event. An object which
// implements the Event interface is generally passed as the
// first parameter to an event handler. More specific context information is
// passed to event handlers by deriving additional interfaces from
// Event which contain information directly relating to the
// type of event they accompany. These derived interfaces are also
// implemented by the object passed to the event listener.
// See also the Document Object Model (DOM) Level 2 Events Specification.
trait Event {

    @stub
    // Used to indicate whether or not an event is a bubbling event.
    def getBubbles(): Boolean = ???

    @stub
    // Used to indicate whether or not an event can have its default action
    // prevented.
    def getCancelable(): Boolean = ???

    @stub
    // Used to indicate the EventTarget whose
    // EventListeners are currently being processed.
    def getCurrentTarget(): EventTarget = ???

    @stub
    // Used to indicate which phase of event flow is currently being
    // evaluated.
    def getEventPhase(): Short = ???

    @stub
    // Used to indicate the EventTarget to which the event was
    // originally dispatched.
    def getTarget(): EventTarget = ???

    @stub
    // Used to specify the time (in milliseconds relative to the epoch) at
    // which the event was created.
    def getTimeStamp(): Long = ???

    @stub
    // The name of the event (case-insensitive).
    def getType(): String = ???

    @stub
    // The initEvent method is used to initialize the value of an
    // Event created through the DocumentEvent
    // interface.
    def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = ???

    @stub
    // If an event is cancelable, the preventDefault method is
    // used to signify that the event is to be canceled, meaning any default
    // action normally taken by the implementation as a result of the event
    // will not occur.
    def preventDefault(): Unit = ???
}

object Event {
    @stub
    // The event is currently being evaluated at the target
    // EventTarget.
    def AT_TARGET: Short = ???

    @stub
    // The current event phase is the bubbling phase.
    def BUBBLING_PHASE: Short = ???
}

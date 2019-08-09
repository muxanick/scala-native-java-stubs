package org.w3c.dom.events

import java.lang.String

// The EventTarget interface is implemented by all
// Nodes in an implementation which supports the DOM Event
// Model. Therefore, this interface can be obtained by using
// binding-specific casting methods on an instance of the Node
// interface. The interface allows registration and removal of
// EventListeners on an EventTarget and dispatch
// of events to that EventTarget.
// See also the Document Object Model (DOM) Level 2 Events Specification.
trait EventTarget {

    @stub
    // This method allows the registration of event listeners on the event
    // target.
    def addEventListener(type: String, listener: EventListener, useCapture: Boolean): Unit = ???

    @stub
    // This method allows the dispatch of events into the implementations
    // event model.
    def dispatchEvent(evt: Event): Boolean = ???
}

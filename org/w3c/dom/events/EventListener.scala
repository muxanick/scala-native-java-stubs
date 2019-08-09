package org.w3c.dom.events

// The EventListener interface is the primary method for
// handling events. Users implement the EventListener interface
// and register their listener on an EventTarget using the
// AddEventListener method. The users should also remove their
// EventListener from its EventTarget after they
// have completed using the listener.
//  When a Node is copied using the cloneNode
// method the EventListeners attached to the source
// Node are not attached to the copied Node. If
// the user wishes the same EventListeners to be added to the
// newly created copy the user must add them manually.
// See also the Document Object Model (DOM) Level 2 Events Specification.
trait EventListener {
}

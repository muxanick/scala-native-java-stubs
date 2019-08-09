package org.w3c.dom.events

import org.w3c.dom.views.AbstractView

// The UIEvent interface provides specific contextual information
// associated with User Interface events.
// See also the Document Object Model (DOM) Level 2 Events Specification.
trait UIEvent extends Event {

    @stub
    // Specifies some detail information about the Event,
    // depending on the type of event.
    def getDetail(): Int = ???

    @stub
    // The view attribute identifies the AbstractView
    //  from which the event was generated.
    def getView(): AbstractView = ???
}

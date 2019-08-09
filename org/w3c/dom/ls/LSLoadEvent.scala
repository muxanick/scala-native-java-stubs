package org.w3c.dom.ls

import org.w3c.dom.events.Event

// This interface represents a load event object that signals the completion
// of a document load.
// See also the Document Object Model (DOM) Level 3 Load
//and Save Specification.
trait LSLoadEvent extends Event {

    @stub
    // The input source that was parsed.
    def getInput(): LSInput = ???
}

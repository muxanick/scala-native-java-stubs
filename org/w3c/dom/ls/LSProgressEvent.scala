package org.w3c.dom.ls

import org.w3c.dom.events.Event

// This interface represents a progress event object that notifies the
// application about progress as a document is parsed. It extends the
// Event interface defined in [DOM Level 3 Events]
// .
//  The units used for the attributes position and
// totalSize are not specified and can be implementation and
// input dependent.
// See also the Document Object Model (DOM) Level 3 Load
//and Save Specification.
trait LSProgressEvent extends Event {

    @stub
    // The input source that is being parsed.
    def getInput(): LSInput = ???

    @stub
    // The current position in the input source, including all external
    // entities and other resources that have been read.
    def getPosition(): Int = ???
}

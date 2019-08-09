package java.awt.event

import java.awt.AWTEvent
import java.lang.Object
import java.util.EventObject

// A semantic event which indicates that an object's text changed.
// This high-level event is generated by an object (such as a TextComponent)
// when its text changes. The event is passed to
// every TextListener object which registered to receive such
// events using the component's addTextListener method.
// 
// The object that implements the TextListener interface gets
// this TextEvent when the event occurs. The listener is
// spared the details of processing individual mouse movements and key strokes
// Instead, it can process a "meaningful" (semantic) event like "text changed".
// 
// An unspecified behavior will be caused if the id parameter
// of any particular TextEvent instance is not
// in the range from TEXT_FIRST to TEXT_LAST.
class TextEvent extends AWTEvent {
}

object TextEvent {
    @stub
    // The first number in the range of ids used for text events.
    def TEXT_FIRST: Int = ???

    @stub
    // The last number in the range of ids used for text events.
    def TEXT_LAST: Int = ???
}

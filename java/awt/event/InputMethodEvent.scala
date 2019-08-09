package java.awt.event

import java.awt.{AWTEvent, Component}
import java.awt.font.TextHitInfo
import java.lang.Object
import java.text.AttributedCharacterIterator
import java.util.EventObject

// Input method events contain information about text that is being
// composed using an input method. Whenever the text changes, the
// input method sends an event. If the text component that's currently
// using the input method is an active client, the event is dispatched
// to that component. Otherwise, it is dispatched to a separate
// composition window.
//
// 
// The text included with the input method event consists of two parts:
// committed text and composed text. Either part may be empty. The two
// parts together replace any uncommitted composed text sent in previous events,
// or the currently selected committed text.
// Committed text should be integrated into the text component's persistent
// data, it will not be sent again. Composed text may be sent repeatedly,
// with changes to reflect the user's editing operations. Committed text
// always precedes composed text.
class InputMethodEvent extends AWTEvent {

    @stub
    // Constructs an InputMethodEvent with the specified
    // source component, type, text, caret, and visiblePosition.
    def this(source: Component, id: Int, text: AttributedCharacterIterator, committedCharacterCount: Int, caret: TextHitInfo, visiblePosition: TextHitInfo) = ???

    @stub
    // Constructs an InputMethodEvent with the specified
    // source component, type, time, text, caret, and visiblePosition.
    def this(source: Component, id: Int, when: Long, text: AttributedCharacterIterator, committedCharacterCount: Int, caret: TextHitInfo, visiblePosition: TextHitInfo) = ???

    @stub
    // Consumes this event so that it will not be processed
    // in the default manner by the source which originated it.
    def consume(): Unit = ???

    @stub
    // Gets the caret.
    def getCaret(): TextHitInfo = ???

    @stub
    // Gets the number of committed characters in the text.
    def getCommittedCharacterCount(): Int = ???

    @stub
    // Gets the combined committed and composed text.
    def getText(): AttributedCharacterIterator = ???

    @stub
    // Gets the position that's most important to be visible.
    def getVisiblePosition(): TextHitInfo = ???

    @stub
    // Returns the time stamp of when this event occurred.
    def getWhen(): Long = ???

    @stub
    // Returns whether or not this event has been consumed.
    def isConsumed(): Boolean = ???
}

object InputMethodEvent {
    @stub
    // The event type indicating a changed insertion point in input method text.
    def CARET_POSITION_CHANGED: Int = ???

    @stub
    // Marks the first integer id for the range of input method event ids.
    def INPUT_METHOD_FIRST: Int = ???

    @stub
    // Marks the last integer id for the range of input method event ids.
    def INPUT_METHOD_LAST: Int = ???
}

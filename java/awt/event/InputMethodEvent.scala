package java.awt.event

import java.awt.{AWTEvent, Component}
import java.awt.font.TextHitInfo
import java.lang.{Object, String}
import java.text.AttributedCharacterIterator
import java.util.EventObject
import scala.scalanative.annotation.stub

/** Input method events contain information about text that is being
 *  composed using an input method. Whenever the text changes, the
 *  input method sends an event. If the text component that's currently
 *  using the input method is an active client, the event is dispatched
 *  to that component. Otherwise, it is dispatched to a separate
 *  composition window.
 * 
 *  
 *  The text included with the input method event consists of two parts:
 *  committed text and composed text. Either part may be empty. The two
 *  parts together replace any uncommitted composed text sent in previous events,
 *  or the currently selected committed text.
 *  Committed text should be integrated into the text component's persistent
 *  data, it will not be sent again. Composed text may be sent repeatedly,
 *  with changes to reflect the user's editing operations. Committed text
 *  always precedes composed text.
 */
class InputMethodEvent extends AWTEvent {

    /** Constructs an InputMethodEvent with the specified
     *  source component, type, text, caret, and visiblePosition.
     */
    @stub
    def this(source: Component, id: Int, text: AttributedCharacterIterator, committedCharacterCount: Int, caret: TextHitInfo, visiblePosition: TextHitInfo) = ???

    /** Constructs an InputMethodEvent with the specified
     *  source component, type, time, text, caret, and visiblePosition.
     */
    @stub
    def this(source: Component, id: Int, when: Long, text: AttributedCharacterIterator, committedCharacterCount: Int, caret: TextHitInfo, visiblePosition: TextHitInfo) = ???

    /** Constructs an InputMethodEvent with the
     *  specified source component, type, caret, and visiblePosition.
     */
    @stub
    def this(source: Component, id: Int, caret: TextHitInfo, visiblePosition: TextHitInfo) = ???

    /** Consumes this event so that it will not be processed
     *  in the default manner by the source which originated it.
     */
    @stub
    def consume(): Unit = ???

    /** Gets the caret. */
    @stub
    def getCaret(): TextHitInfo = ???

    /** Gets the number of committed characters in the text. */
    @stub
    def getCommittedCharacterCount(): Int = ???

    /** Gets the combined committed and composed text. */
    @stub
    def getText(): AttributedCharacterIterator = ???

    /** Gets the position that's most important to be visible. */
    @stub
    def getVisiblePosition(): TextHitInfo = ???

    /** Returns the time stamp of when this event occurred. */
    @stub
    def getWhen(): Long = ???

    /** Returns whether or not this event has been consumed. */
    @stub
    def isConsumed(): Boolean = ???

    /** Returns a parameter string identifying this event. */
    @stub
    def paramString(): String = ???
}

object InputMethodEvent {
    /** The event type indicating a changed insertion point in input method text. */
    @stub
    val CARET_POSITION_CHANGED: Int = ???

    /** Marks the first integer id for the range of input method event ids. */
    @stub
    val INPUT_METHOD_FIRST: Int = ???

    /** Marks the last integer id for the range of input method event ids. */
    @stub
    val INPUT_METHOD_LAST: Int = ???

    /** The event type indicating changed input method text. */
    @stub
    val INPUT_METHOD_TEXT_CHANGED: Int = ???
}

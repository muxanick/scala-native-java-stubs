package javax.swing.text.html

import java.lang.{Object, String}
import java.util.EventObject
import javax.swing.event.HyperlinkEvent

/** FormSubmitEvent is used to notify interested
 *  parties that a form was submitted.
 */
class FormSubmitEvent extends HTMLFrameHyperlinkEvent {

    /** Gets the form submission data. */
    @stub
    def getData(): String = ???
}

package javax.swing.text.html

import java.lang.{Object, String}
import java.util.EventObject
import javax.swing.event.HyperlinkEvent
import scala.scalanative.annotation.stub

/** FormSubmitEvent is used to notify interested
 *  parties that a form was submitted.
 */
class FormSubmitEvent extends HTMLFrameHyperlinkEvent {

    /** Gets the form submission data. */
    @stub
    def getData(): String = ???

    /** Gets the form method type. */
    @stub
    def getMethod(): FormSubmitEvent.MethodType = ???
}

object FormSubmitEvent {
    /** Represents an HTML form method type. */
    @stub
    object MethodType extends FormSubmitEvent.MethodType
}

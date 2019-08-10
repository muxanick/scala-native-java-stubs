package javax.swing.text.html

import java.lang.{Enum, Object, String}
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
    /** Represents an HTML form method type.
     *  
     *  GET corresponds to the GET form method
     *  POST corresponds to the POST from method
     *  
     */
    class MethodType private (name: String, ordinal: Int) extends Enum[MethodType](name, ordinal) {
    }

    object MethodType {
        /**  */
        final val GET: MethodType = new MethodType("GET", 0)

        /**  */
        final val POST: MethodType = new MethodType("POST", 1)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): MethodType = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[MethodType] = ???
    }

}

package javax.swing.text.html

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Represents an HTML form method type.
 *  
 *  GET corresponds to the GET form method
 *  POST corresponds to the POST from method
 *  
 */
class FormSubmitEvent_MethodType private (name: String, ordinal: Int) extends Enum[FormSubmitEvent.MethodType](name, ordinal) {
}

object FormSubmitEvent_MethodType {
    /**  */
    final val GET = new FormSubmitEvent.MethodType(GET, 0)

    /**  */
    final val POST = new FormSubmitEvent.MethodType(POST, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): FormSubmitEvent.MethodType = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[FormSubmitEvent.MethodType] = ???
}

package javax.swing.text.html

import java.lang.{Enum, Object, String}

/** Represents an HTML form method type.
 *  
 *  GET corresponds to the GET form method
 *  POST corresponds to the POST from method
 *  
 */
class FormSubmitEvent.MethodType private (name: String, ordinal: Int) extends Enum[FormSubmitEvent.MethodType](name, ordinal) {
}

object FormSubmitEvent.MethodType {
    /**  */
    final val GET = new FormSubmitEvent.MethodType(GET, 0)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): FormSubmitEvent.MethodType = ???
}

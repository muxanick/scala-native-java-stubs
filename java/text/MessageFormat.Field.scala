package java.text

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Defines constants that are used as attribute keys in the
 *  AttributedCharacterIterator returned
 *  from MessageFormat.formatToCharacterIterator.
 */
object MessageFormat_Field extends Format.Field {

    /** Creates a Field with the specified name. */
    @stub
    protected def Field(name: String) = ???

    /** Constant identifying a portion of a message that was generated
     *  from an argument passed into formatToCharacterIterator.
     */
    @stub
    val ARGUMENT: MessageFormat.Field = ???

    /** Resolves instances being deserialized to the predefined constants. */
    @stub
    protected def readResolve(): Any = ???
}

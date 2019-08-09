package javax.lang.model.type

import java.lang.{Exception, Object, RuntimeException, Throwable}
import javax.lang.model.UnknownEntityException

/** Indicates that an unknown kind of type was encountered.  This can
 *  occur if the language evolves and new kinds of types are added to
 *  the TypeMirror hierarchy.  May be thrown by a type visitor to indicate that the visitor was created
 *  for a prior version of the language.
 */
class UnknownTypeException extends UnknownEntityException {

    /** Returns the additional argument. */
    @stub
    def getArgument(): Object = ???
}

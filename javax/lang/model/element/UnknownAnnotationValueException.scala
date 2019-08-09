package javax.lang.model.element

import java.lang.{Exception, Object, RuntimeException, Throwable}
import javax.lang.model.UnknownEntityException

/** Indicates that an unknown kind of annotation value was encountered.
 *  This can occur if the language evolves and new kinds of annotation
 *  values can be stored in an annotation.  May be thrown by an
 *  annotation value visitor to
 *  indicate that the visitor was created for a prior version of the
 *  language.
 */
class UnknownAnnotationValueException extends UnknownEntityException {

    /** Returns the additional argument. */
    @stub
    def getArgument(): Object = ???
}

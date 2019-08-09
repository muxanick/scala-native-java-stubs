package javax.lang.model.element

import java.lang.{Exception, Object, RuntimeException, Throwable}
import javax.lang.model.UnknownEntityException
import scala.scalanative.annotation.stub

/** Indicates that an unknown kind of annotation value was encountered.
 *  This can occur if the language evolves and new kinds of annotation
 *  values can be stored in an annotation.  May be thrown by an
 *  annotation value visitor to
 *  indicate that the visitor was created for a prior version of the
 *  language.
 */
class UnknownAnnotationValueException extends UnknownEntityException {

    /** Creates a new UnknownAnnotationValueException. */
    @stub
    def this(av: AnnotationValue, p: Object) = ???

    /** Returns the additional argument. */
    @stub
    def getArgument(): Object = ???

    /** Returns the unknown annotation value. */
    @stub
    def getUnknownAnnotationValue(): AnnotationValue = ???
}

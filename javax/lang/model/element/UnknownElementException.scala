package javax.lang.model.element

import java.lang.{Exception, Object, RuntimeException, Throwable}
import javax.lang.model.UnknownEntityException
import scala.scalanative.annotation.stub

/** Indicates that an unknown kind of element was encountered.  This
 *  can occur if the language evolves and new kinds of elements are
 *  added to the Element hierarchy.  May be thrown by an
 *  element visitor to indicate that the
 *  visitor was created for a prior version of the language.
 */
class UnknownElementException extends UnknownEntityException {

    /** Creates a new UnknownElementException. */
    @stub
    def this(e: Element, p: Object) = ???

    /** Returns the additional argument. */
    @stub
    def getArgument(): Object = ???

    /** Returns the unknown element. */
    @stub
    def getUnknownElement(): Element = ???
}

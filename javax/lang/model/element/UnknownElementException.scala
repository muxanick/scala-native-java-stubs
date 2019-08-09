package javax.lang.model.element

import java.lang.{Exception, Object, RuntimeException, Throwable}
import javax.lang.model.UnknownEntityException

// Indicates that an unknown kind of element was encountered.  This
// can occur if the language evolves and new kinds of elements are
// added to the Element hierarchy.  May be thrown by an
// element visitor to indicate that the
// visitor was created for a prior version of the language.
class UnknownElementException extends UnknownEntityException {

    @stub
    // Returns the additional argument.
    def getArgument(): Object = ???
}

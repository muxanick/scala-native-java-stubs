package javax.naming.spi

import java.lang.Object
import javax.naming.directory.Attributes

// An object/attributes pair for returning the result of
// DirStateFactory.getStateToBind().
object DirStateFactory.Result extends Object {

    @stub
    // Retrieves the attributes to be bound.
    def getAttributes(): Attributes = ???
}

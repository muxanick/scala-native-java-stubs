package javax.naming.spi

import java.lang.Object
import javax.naming.directory.Attributes

/** An object/attributes pair for returning the result of
 *  DirStateFactory.getStateToBind().
 */
object DirStateFactory.Result extends Object {

    /** Retrieves the attributes to be bound. */
    @stub
    def getAttributes(): Attributes = ???
}

package javax.naming.spi

import java.lang.Object
import javax.naming.directory.Attributes
import scala.scalanative.annotation.stub

/** An object/attributes pair for returning the result of
 *  DirStateFactory.getStateToBind().
 */
object DirStateFactory.Result extends Object {

    /** Constructs an instance of Result. */
    @stub
    def Result(obj: Object, outAttrs: Attributes) = ???

    /** Retrieves the attributes to be bound. */
    @stub
    def getAttributes(): Attributes = ???

    /** Retrieves the object to be bound. */
    @stub
    def getObject(): Object = ???
}

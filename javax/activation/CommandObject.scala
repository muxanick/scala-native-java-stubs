package javax.activation

import java.lang.String
import scala.scalanative.annotation.stub

/** JavaBeans components that are Activation Framework aware implement
 *  this interface to find out which command verb they're being asked
 *  to perform, and to obtain the DataHandler representing the
 *  data they should operate on.  JavaBeans that don't implement
 *  this interface may be used as well.  Such commands may obtain
 *  the data using the Externalizable interface, or using an
 *  application-specific method.
 */
trait CommandObject {

    /** Initialize the Command with the verb it is requested to handle
     *  and the DataHandler that describes the data it will
     *  operate on.
     */
    @stub
    def setCommandContext(verb: String, dh: DataHandler): Unit = ???
}

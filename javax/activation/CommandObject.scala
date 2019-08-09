package javax.activation

/** JavaBeans components that are Activation Framework aware implement
 *  this interface to find out which command verb they're being asked
 *  to perform, and to obtain the DataHandler representing the
 *  data they should operate on.  JavaBeans that don't implement
 *  this interface may be used as well.  Such commands may obtain
 *  the data using the Externalizable interface, or using an
 *  application-specific method.
 */
trait CommandObject {
}

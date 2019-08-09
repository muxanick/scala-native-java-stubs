package javax.naming.directory

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class represents a modification item.
 *  It consists of a modification code and an attribute on which to operate.
 * 
 *  A ModificationItem instance is not synchronized against concurrent
 *  multithreaded access. Multiple threads trying to access and modify
 *  a single ModificationItem instance should lock the object.
 */
class ModificationItem extends Object with Serializable {

    /** Creates a new instance of ModificationItem. */
    @stub
    def this(mod_op: Int, attr: Attribute) = ???

    /** Retrieves the attribute associated with this modification item. */
    @stub
    def getAttribute(): Attribute = ???

    /** Retrieves the modification code of this modification item. */
    @stub
    def getModificationOp(): Int = ???

    /** Generates the string representation of this modification item,
     *  which consists of the modification operation and its related attribute.
     */
    @stub
    def toString(): String = ???
}

package javax.management

import java.io.Serializable
import scala.scalanative.annotation.stub

/** Represents relational constraints similar to database query "where
 *  clauses". Instances of QueryExp are returned by the static methods of the
 *  Query class.
 * 
 *  It is possible, but not
 *  recommended, to create custom queries by implementing this
 *  interface.  In that case, it is better to extend the QueryEval class than to implement the interface directly, so that
 *  the setMBeanServer(javax.management.MBeanServer) method works correctly.
 */
trait QueryExp extends Serializable {

    /** Applies the QueryExp on an MBean. */
    @stub
    def apply(name: ObjectName): Boolean = ???

    /** Sets the MBean server on which the query is to be performed. */
    @stub
    def setMBeanServer(s: MBeanServer): Unit = ???
}

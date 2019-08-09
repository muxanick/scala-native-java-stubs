package javax.management

import java.io.Serializable

// Represents relational constraints similar to database query "where
// clauses". Instances of QueryExp are returned by the static methods of the
// Query class.
//
// It is possible, but not
// recommended, to create custom queries by implementing this
// interface.  In that case, it is better to extend the QueryEval class than to implement the interface directly, so that
// the setMBeanServer(javax.management.MBeanServer) method works correctly.
trait QueryExp extends Serializable {

    @stub
    // Applies the QueryExp on an MBean.
    def apply(name: ObjectName): Boolean = ???
}
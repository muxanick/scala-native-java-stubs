package javax.management

import java.io.Serializable
import java.lang.Object

/** Allows a query to be performed in the context of a specific MBean server. */
abstract class QueryEval extends Object with Serializable {
}

object QueryEval {
    /** Return the MBean server that was most recently given to the
     *  setMBeanServer method by this thread.
     */
    @stub
    def getMBeanServer(): MBeanServer = ???
}

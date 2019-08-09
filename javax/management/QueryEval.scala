package javax.management

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** Allows a query to be performed in the context of a specific MBean server. */
abstract class QueryEval extends Object with Serializable {

    /**  */
    @stub
    def this() = ???

    /** Sets the MBean server on which the query is to be performed. */
    def setMBeanServer(s: MBeanServer): Unit
}

object QueryEval {
    /** Return the MBean server that was most recently given to the
     *  setMBeanServer method by this thread.
     */
    @stub
    def getMBeanServer(): MBeanServer = ???
}

package javax.management

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Exception which occurs when trying to register an  object in the MBean server that is not a JMX compliant MBean. */
class NotCompliantMBeanException extends OperationsException {

    /** Default constructor. */
    @stub
    def this() = ???

    /** Constructor that allows a specific error message to be specified. */
    @stub
    def this(message: String) = ???
}

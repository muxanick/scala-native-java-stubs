package javax.management

import java.lang.{Exception, Object, Throwable}

// Exception which occurs when trying to register an  object in the MBean server that is not a JMX compliant MBean.
class NotCompliantMBeanException extends OperationsException {

    @stub
    // Default constructor.
    def this() = ???
}

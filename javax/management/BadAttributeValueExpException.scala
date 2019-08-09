package javax.management

import java.lang.{Exception, Object, Throwable}

// Thrown when an invalid MBean attribute is passed to a query
// constructing method.  This exception is used internally by JMX
// during the evaluation of a query.  User code does not usually
// see it.
class BadAttributeValueExpException extends Exception {
}

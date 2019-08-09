package javax.management

import java.lang.{Exception, Object, Throwable}

// Thrown when an invalid expression is passed to a method for
// constructing a query.  This exception is used internally by JMX
// during the evaluation of a query.  User code does not usually see
// it.
class BadBinaryOpValueExpException extends Exception {

    @stub
    // Returns the ValueExp that originated the exception.
    def getExp(): ValueExp = ???
}

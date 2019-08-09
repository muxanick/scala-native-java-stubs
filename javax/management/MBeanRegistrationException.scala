package javax.management

import java.lang.{Exception, Object, Throwable}

// Wraps exceptions thrown by the preRegister(), preDeregister() methods
// of the MBeanRegistration interface.
class MBeanRegistrationException extends MBeanException {

    @stub
    // Creates an MBeanRegistrationException that wraps
    // the actual java.lang.Exception.
    def this(e: Exception) = ???
}

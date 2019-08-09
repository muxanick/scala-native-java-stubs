package javax.management

import java.lang.{Exception, Object, Throwable}

/** Wraps exceptions thrown by the preRegister(), preDeregister() methods
 *  of the MBeanRegistration interface.
 */
class MBeanRegistrationException extends MBeanException {

    /** Creates an MBeanRegistrationException that wraps
     *  the actual java.lang.Exception.
     */
    @stub
    def this(e: Exception) = ???
}

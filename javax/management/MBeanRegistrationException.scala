package javax.management

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Wraps exceptions thrown by the preRegister(), preDeregister() methods
 *  of the MBeanRegistration interface.
 */
class MBeanRegistrationException extends MBeanException {

    /** Creates an MBeanRegistrationException that wraps
     *  the actual java.lang.Exception.
     */
    @stub
    def this(e: Exception) = ???

    /** Creates an MBeanRegistrationException that wraps
     *  the actual java.lang.Exception with a detailed
     *  message.
     */
    @stub
    def this(e: Exception, message: String) = ???
}

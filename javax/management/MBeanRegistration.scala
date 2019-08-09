package javax.management

import java.lang.Boolean

/** Can be implemented by an MBean in order to
 *  carry out operations before and after being registered or unregistered from
 *  the MBean Server.  An MBean can also implement this interface in order
 *  to get a reference to the MBean Server and/or its name within that
 *  MBean Server.
 */
trait MBeanRegistration {

    /** Allows the MBean to perform any operations needed after having been
     *  unregistered in the MBean server.
     */
    @stub
    def postDeregister(): Unit = ???

    /** Allows the MBean to perform any operations needed after having been
     *  registered in the MBean server or after the registration has failed.
     */
    @stub
    def postRegister(registrationDone: Boolean): Unit = ???

    /** Allows the MBean to perform any operations it needs before
     *  being unregistered by the MBean server.
     */
    @stub
    def preDeregister(): Unit = ???
}

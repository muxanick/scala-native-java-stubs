package javax.naming.ldap

import java.lang.{Exception, Object, String, Throwable}
import java.util.Hashtable
import javax.naming.{Context, NamingException, ReferralException}
import scala.scalanative.annotation.stub

/** This abstract class is used to represent an LDAP referral exception.
 *  It extends the base ReferralException by providing a
 *  getReferralContext() method that accepts request controls.
 *  LdapReferralException is an abstract class. Concrete implementations of it
 *  determine its synchronization and serialization properties.
 * 
 *  A Control[] array passed as a parameter to
 *  the getReferralContext() method is owned by the caller.
 *  The service provider will not modify the array or keep a reference to it,
 *  although it may keep references to the individual Control objects
 *  in the array.
 */
abstract class LdapReferralException extends ReferralException {

    /** Constructs a new instance of LdapReferralException. */
    @stub
    protected def this() = ???

    /** Constructs a new instance of LdapReferralException using the
     *  explanation supplied.
     */
    @stub
    protected def this(explanation: String) = ???

    /** Retrieves the context at which to continue the method using the
     *  context's environment and no controls.
     */
    def getReferralContext(): Context

    /** Retrieves the context at which to continue the method using
     *  environment properties and no controls.
     */
    def getReferralContext(env: Hashtable[_, _]): Context

    /** Retrieves the context at which to continue the method using
     *  request controls and environment properties.
     */
    def getReferralContext(env: Hashtable[_, _], reqCtls: Array[Control]): Context
}

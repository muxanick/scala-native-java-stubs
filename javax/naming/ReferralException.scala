package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import java.util.Hashtable
import scala.scalanative.annotation.stub

/** This abstract class is used to represent a referral exception,
 *  which is generated in response to a referral
 *  such as that returned by LDAP v3 servers.
 *  
 *  A service provider provides
 *  a subclass of ReferralException by providing implementations
 *  for getReferralInfo() and getReferralContext() (and appropriate
 *  constructors and/or corresponding "set" methods).
 *  
 *  The following code sample shows how ReferralException can be used.
 *  while (true) {
 *           try {
 *               bindings = ctx.listBindings(name);
 *               while (bindings.hasMore()) {
 *                   b = bindings.next();
 *                   ...
 *               }
 *               break;
 *           } catch (ReferralException e) {
 *               ctx = e.getReferralContext();
 *           }
 *       }
 *  
 * 
 *  ReferralException is an abstract class. Concrete implementations
 *  determine its synchronization and serialization properties.
 * 
 *  An environment parameter passed to the getReferralContext()
 *  method is owned by the caller.
 *  The service provider will not modify the object or keep a reference to it,
 *  but may keep a reference to a clone of it.
 */
abstract class ReferralException extends NamingException {

    /** Constructs a new instance of ReferralException. */
    @stub
    protected def this() = ???

    /** Constructs a new instance of ReferralException using the
     *  explanation supplied.
     */
    @stub
    protected def this(explanation: String) = ???

    /** Retrieves the context at which to continue the method. */
    def getReferralContext(): Context

    /** Retrieves the context at which to continue the method using
     *  environment properties.
     */
    def getReferralContext(env: Hashtable[_, _]): Context

    /** Retrieves information (such as URLs) related to this referral. */
    def getReferralInfo(): Object

    /** Retries the referral currently being processed. */
    def retryReferral(): Unit

    /** Discards the referral about to be processed. */
    def skipReferral(): Boolean
}

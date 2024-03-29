package javax.naming.ldap

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Requests that referral and other special LDAP objects be manipulated
 *  as normal LDAP objects. It enables the requestor to interrogate or
 *  update such objects.
 * 
 *  This class implements the LDAPv3 Request Control for ManageDsaIT
 *  as defined in
 *  RFC 3296.
 * 
 *  The control has no control value.
 */
final class ManageReferralControl extends BasicControl {

    /** Constructs a critical ManageReferral control. */
    @stub
    def this() = ???

    /** Constructs a ManageReferral control. */
    @stub
    def this(criticality: Boolean) = ???
}

object ManageReferralControl {
    /** The ManageReferral control's assigned object identifier
     *  is 2.16.840.1.113730.3.4.2.
     */
    @stub
    val OID: String = ???
}

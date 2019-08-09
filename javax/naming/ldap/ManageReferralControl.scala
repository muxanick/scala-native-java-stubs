package javax.naming.ldap

import java.lang.Object

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
}

package javax.naming.ldap

import java.lang.String
import javax.naming.NamingException
import scala.scalanative.annotation.stub

/** This interface represents an unsolicited notification as defined in
 *  RFC 2251.
 *  An unsolicited notification is sent by the LDAP server to the LDAP
 *  client without any provocation from the client.
 *  Its format is that of an extended response (ExtendedResponse).
 */
trait UnsolicitedNotification extends ExtendedResponse with HasControls {

    /** Retrieves the exception as constructed using information
     *  sent by the server.
     */
    @stub
    def getException(): NamingException = ???

    /** Retrieves the referral(s) sent by the server. */
    @stub
    def getReferrals(): Array[String] = ???
}

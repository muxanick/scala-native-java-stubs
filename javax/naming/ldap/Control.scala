package javax.naming.ldap

import java.io.Serializable
import java.lang.String

/** This interface represents an LDAPv3 control as defined in
 *  RFC 2251.
 * 
 *  The LDAPv3 protocol uses controls to send and receive additional data
 *  to affect the behavior of predefined operations.
 *  Controls can be sent along with any LDAP operation to the server.
 *  These are referred to as request controls. For example, a
 *  "sort" control can be sent with an LDAP search operation to
 *  request that the results be returned in a particular order.
 *  Solicited and unsolicited controls can also be returned with
 *  responses from the server. Such controls are referred to as
 *  response controls. For example, an LDAP server might
 *  define a special control to return change notifications.
 * 
 *  This interface is used to represent both request and response controls.
 */
trait Control extends Serializable {

    /** Retrieves the ASN.1 BER encoded value of the LDAP control. */
    @stub
    def getEncodedValue(): Array[Byte] = ???

    /** Retrieves the object identifier assigned for the LDAP control. */
    @stub
    def getID(): String = ???
}

object Control {
    /** Indicates a critical control. */
    @stub
    val CRITICAL: Boolean = ???
}

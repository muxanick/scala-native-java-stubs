package javax.naming.ldap

import javax.naming.NamingException

// This interface represents an unsolicited notification as defined in
// RFC 2251.
// An unsolicited notification is sent by the LDAP server to the LDAP
// client without any provocation from the client.
// Its format is that of an extended response (ExtendedResponse).
trait UnsolicitedNotification extends ExtendedResponse , HasControls {

    @stub
    // Retrieves the exception as constructed using information
    // sent by the server.
    def getException(): NamingException = ???
}

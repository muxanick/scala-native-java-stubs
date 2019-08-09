package javax.net.ssl

import java.lang.Object

// Instances of this class represent a server name in a Server Name
// Indication (SNI) extension.
// 
// The SNI extension is a feature that extends the SSL/TLS protocols to
// indicate what server name the client is attempting to connect to during
// handshaking.  See section 3, "Server Name Indication", of TLS Extensions (RFC 6066).
// 
// SNIServerName objects are immutable.  Subclasses should not provide
// methods that can change the state of an instance once it has been created.
abstract class SNIServerName extends Object {

    // Indicates whether some other object is "equal to" this server name.
    def equals(other: Object): Boolean

    // Returns a copy of the encoded server name value of this server name.
    def getEncoded(): Array[Byte]

    // Returns the name type of this server name.
    def getType(): Int

    // Returns a hash code value for this server name.
    def hashCode(): Int
}

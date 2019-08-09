package javax.net.ssl

import java.lang.{Object, String}

// Instances of this class represent a server name of type
// host_name in a Server Name
// Indication (SNI) extension.
// 
// As described in section 3, "Server Name Indication", of
// TLS Extensions (RFC 6066),
// "HostName" contains the fully qualified DNS hostname of the server, as
// understood by the client.  The encoded server name value of a hostname is
// represented as a byte string using ASCII encoding without a trailing dot.
// This allows the support of Internationalized Domain Names (IDN) through
// the use of A-labels (the ASCII-Compatible Encoding (ACE) form of a valid
// string of Internationalized Domain Names for Applications (IDNA)) defined
// in RFC 5890.
// 
// Note that SNIHostName objects are immutable.
final class SNIHostName extends SNIServerName {

    @stub
    // Creates an SNIHostName using the specified encoded value.
    def this(encoded: Array[Byte]) = ???

    @stub
    // Compares this server name to the specified object.
    def equals(other: Object): Boolean = ???

    @stub
    // Returns the StandardCharsets.US_ASCII-compliant hostname of
    // this SNIHostName object.
    def getAsciiName(): String = ???

    @stub
    // Returns a hash code value for this SNIHostName.
    def hashCode(): Int = ???
}

object SNIHostName {
    @stub
    // Creates an SNIMatcher object for SNIHostNames.
    def createSNIMatcher(regex: String): SNIMatcher = ???
}

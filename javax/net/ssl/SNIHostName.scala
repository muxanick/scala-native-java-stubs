package javax.net.ssl

import java.lang.{Object, String}

/** Instances of this class represent a server name of type
 *  host_name in a Server Name
 *  Indication (SNI) extension.
 *  
 *  As described in section 3, "Server Name Indication", of
 *  TLS Extensions (RFC 6066),
 *  "HostName" contains the fully qualified DNS hostname of the server, as
 *  understood by the client.  The encoded server name value of a hostname is
 *  represented as a byte string using ASCII encoding without a trailing dot.
 *  This allows the support of Internationalized Domain Names (IDN) through
 *  the use of A-labels (the ASCII-Compatible Encoding (ACE) form of a valid
 *  string of Internationalized Domain Names for Applications (IDNA)) defined
 *  in RFC 5890.
 *  
 *  Note that SNIHostName objects are immutable.
 */
final class SNIHostName extends SNIServerName {

    /** Creates an SNIHostName using the specified encoded value. */
    @stub
    def this(encoded: Array[Byte]) = ???

    /** Compares this server name to the specified object. */
    @stub
    def equals(other: Object): Boolean = ???

    /** Returns the StandardCharsets.US_ASCII-compliant hostname of
     *  this SNIHostName object.
     */
    @stub
    def getAsciiName(): String = ???

    /** Returns a hash code value for this SNIHostName. */
    @stub
    def hashCode(): Int = ???
}

object SNIHostName {
    /** Creates an SNIMatcher object for SNIHostNames. */
    @stub
    def createSNIMatcher(regex: String): SNIMatcher = ???
}

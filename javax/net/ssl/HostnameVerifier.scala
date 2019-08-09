package javax.net.ssl

/** This class is the base interface for hostname verification.
 *  
 *  During handshaking, if the URL's hostname and
 *  the server's identification hostname mismatch, the
 *  verification mechanism can call back to implementers of this
 *  interface to determine if this connection should be allowed.
 *  
 *  The policies can be certificate-based
 *  or may depend on other authentication schemes.
 *  
 *  These callbacks are used when the default rules for URL hostname
 *  verification fail.
 */
trait HostnameVerifier {
}

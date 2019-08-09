package java.security.cert

/** Performs one or more checks on each Certificate of a
 *  CertPath.
 * 
 *  A CertPathChecker implementation is typically created to extend
 *  a certification path validation algorithm. For example, an implementation
 *  may check for and process a critical private extension of each certificate
 *  in a certification path.
 */
trait CertPathChecker {

    /** Performs the check(s) on the specified certificate using its internal
     *  state.
     */
    @stub
    def check(cert: Certificate): Unit = ???

    /** Initializes the internal state of this CertPathChecker. */
    @stub
    def init(forward: Boolean): Unit = ???
}

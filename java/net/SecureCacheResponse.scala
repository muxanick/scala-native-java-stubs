package java.net

import java.lang.{Object, String}
import java.security.Principal
import java.security.cert.Certificate
import java.util.List
import scala.scalanative.annotation.stub

/** Represents a cache response originally retrieved through secure
 *  means, such as TLS.
 */
abstract class SecureCacheResponse extends CacheResponse {

    /**  */
    @stub
    def this() = ???

    /** Returns the cipher suite in use on the original connection that
     *  retrieved the network resource.
     */
    def getCipherSuite(): String

    /** Returns the certificate chain that were sent to the server during
     *  handshaking of the original connection that retrieved the
     *  network resource.
     */
    def getLocalCertificateChain(): List[Certificate]

    /** Returns the principal that was sent to the server during
     *  handshaking in the original connection that retrieved the
     *  network resource.
     */
    def getLocalPrincipal(): Principal

    /** Returns the server's principal which was established as part of
     *  defining the session during the original connection that
     *  retrieved the network resource.
     */
    def getPeerPrincipal(): Principal

    /** Returns the server's certificate chain, which was established as
     *  part of defining the session in the original connection that
     *  retrieved the network resource, from cache.
     */
    def getServerCertificateChain(): List[Certificate]
}

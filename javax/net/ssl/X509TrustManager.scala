package javax.net.ssl

import java.lang.String
import java.security.cert.X509Certificate
import scala.scalanative.annotation.stub

/** Instance of this interface manage which X509 certificates
 *  may be used to authenticate the remote side of a secure
 *  socket. Decisions may be based on trusted certificate
 *  authorities, certificate revocation lists, online
 *  status checking or other means.
 */
trait X509TrustManager extends TrustManager {

    /** Given the partial or complete certificate chain provided by the
     *  peer, build a certificate path to a trusted root and return if
     *  it can be validated and is trusted for client SSL
     *  authentication based on the authentication type.
     */
    @stub
    def checkClientTrusted(chain: Array[X509Certificate], authType: String): Unit = ???

    /** Given the partial or complete certificate chain provided by the
     *  peer, build a certificate path to a trusted root and return if
     *  it can be validated and is trusted for server SSL
     *  authentication based on the authentication type.
     */
    @stub
    def checkServerTrusted(chain: Array[X509Certificate], authType: String): Unit = ???

    /** Return an array of certificate authority certificates
     *  which are trusted for authenticating peers.
     */
    @stub
    def getAcceptedIssuers(): Array[X509Certificate] = ???
}

package javax.net.ssl

import java.lang.{Object, String}
import java.net.Socket
import java.security.cert.X509Certificate

/** Extensions to the X509TrustManager interface to support
 *  SSL/TLS connection sensitive trust management.
 *  
 *  To prevent man-in-the-middle attacks, hostname checks can be done
 *  to verify that the hostname in an end-entity certificate matches the
 *  targeted hostname.  TLS does not require such checks, but some protocols
 *  over TLS (such as HTTPS) do.  In earlier versions of the JDK, the
 *  certificate chain checks were done at the SSL/TLS layer, and the hostname
 *  verification checks were done at the layer over TLS.  This class allows
 *  for the checking to be done during a single call to this class.
 *  
 *  RFC 2830 defines the server identification specification for the "LDAPS"
 *  algorithm. RFC 2818 defines both the server identification and the
 *  client identification specification for the "HTTPS" algorithm.
 */
abstract class X509ExtendedTrustManager extends Object with X509TrustManager {

    /** Given the partial or complete certificate chain provided by the
     *  peer, build and validate the certificate path based on the
     *  authentication type and ssl parameters.
     */
    def checkClientTrusted(chain: Array[X509Certificate], authType: String, socket: Socket): Unit

    /** Given the partial or complete certificate chain provided by the
     *  peer, build and validate the certificate path based on the
     *  authentication type and ssl parameters.
     */
    def checkClientTrusted(chain: Array[X509Certificate], authType: String, engine: SSLEngine): Unit

    /** Given the partial or complete certificate chain provided by the
     *  peer, build and validate the certificate path based on the
     *  authentication type and ssl parameters.
     */
    def checkServerTrusted(chain: Array[X509Certificate], authType: String, socket: Socket): Unit
}

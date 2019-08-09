package javax.net.ssl

import java.lang.String
import java.security.cert.X509Certificate

// Instance of this interface manage which X509 certificates
// may be used to authenticate the remote side of a secure
// socket. Decisions may be based on trusted certificate
// authorities, certificate revocation lists, online
// status checking or other means.
trait X509TrustManager extends TrustManager {

    @stub
    // Given the partial or complete certificate chain provided by the
    // peer, build a certificate path to a trusted root and return if
    // it can be validated and is trusted for client SSL
    // authentication based on the authentication type.
    def checkClientTrusted(chain: Array[X509Certificate], authType: String): Unit = ???

    @stub
    // Given the partial or complete certificate chain provided by the
    // peer, build a certificate path to a trusted root and return if
    // it can be validated and is trusted for server SSL
    // authentication based on the authentication type.
    def checkServerTrusted(chain: Array[X509Certificate], authType: String): Unit = ???
}

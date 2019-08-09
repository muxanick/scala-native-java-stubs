package javax.net.ssl

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

// Indicates that the peer's identity has not been verified.
// 
// When the peer was not able to
// identify itself (for example; no certificate, the particular
// cipher suite being used does not support authentication, or no
// peer authentication was established during SSL handshaking) this
// exception is thrown.
class SSLPeerUnverifiedException extends SSLException {
}

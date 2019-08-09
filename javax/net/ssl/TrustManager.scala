package javax.net.ssl

import scala.scalanative.annotation.stub

/** This is the base interface for JSSE trust managers.
 *  
 *  TrustManagers are responsible for managing the trust material
 *  that is used when making trust decisions, and for deciding whether
 *  credentials presented by a peer should be accepted.
 *  
 *  TrustManagers are created by either
 *  using a TrustManagerFactory,
 *  or by implementing one of the TrustManager subclasses.
 */
trait TrustManager {
}

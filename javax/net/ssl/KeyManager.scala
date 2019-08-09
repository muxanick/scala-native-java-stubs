package javax.net.ssl

import scala.scalanative.annotation.stub

/** This is the base interface for JSSE key managers.
 *  
 *  KeyManagers are responsible for managing the
 *  key material which is used to authenticate the local SSLSocket
 *  to its peer.  If no key material is available, the socket will
 *  be unable to present authentication credentials.
 *  
 *  KeyManagers are created by either
 *  using a KeyManagerFactory,
 *  or by implementing one of the KeyManager subclasses.
 */
trait KeyManager {
}

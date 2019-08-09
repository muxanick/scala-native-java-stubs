package javax.net.ssl

import java.lang.{Object, String}
import java.security.Principal
import scala.scalanative.annotation.stub

/** Abstract class that provides for extension of the X509KeyManager
 *  interface.
 *  
 *  Methods in this class should be overriden to provide actual
 *  implementations.
 */
abstract class X509ExtendedKeyManager extends Object with X509KeyManager {

    /** Constructor used by subclasses only. */
    @stub
    protected def this() = ???

    /** Choose an alias to authenticate the client side of an
     *  SSLEngine connection given the public key type
     *  and the list of certificate issuer authorities recognized by
     *  the peer (if any).
     */
    def chooseEngineClientAlias(keyType: Array[String], issuers: Array[Principal], engine: SSLEngine): String

    /** Choose an alias to authenticate the server side of an
     *  SSLEngine connection given the public key type
     *  and the list of certificate issuer authorities recognized by
     *  the peer (if any).
     */
    def chooseEngineServerAlias(keyType: String, issuers: Array[Principal], engine: SSLEngine): String
}

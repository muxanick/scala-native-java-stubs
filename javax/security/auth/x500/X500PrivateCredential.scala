package javax.security.auth.x500

import java.lang.{Object, String}
import java.security.PrivateKey
import java.security.cert.X509Certificate
import javax.security.auth.Destroyable

/**  This class represents an X500PrivateCredential.
 *  It associates an X.509 certificate, corresponding private key and the
 *  KeyStore alias used to reference that exact key pair in the KeyStore.
 *  This enables looking up the private credentials for an X.500 principal
 *  in a subject.
 */
final class X500PrivateCredential extends Object with Destroyable {

    /** Creates an X500PrivateCredential that associates an X.509 certificate,
     *  a private key and the KeyStore alias.
     */
    @stub
    def this(cert: X509Certificate, key: PrivateKey) = ???

    /** Clears the references to the X.509 certificate, private key and the
     *  KeyStore alias in this object.
     */
    @stub
    def destroy(): Unit = ???

    /** Returns the KeyStore alias. */
    @stub
    def getAlias(): String = ???

    /** Returns the X.509 certificate. */
    @stub
    def getCertificate(): X509Certificate = ???

    /** Returns the PrivateKey. */
    @stub
    def getPrivateKey(): PrivateKey = ???
}

package javax.security.auth.kerberos

import java.lang.{Object, String}
import javax.crypto.SecretKey
import javax.security.auth.Destroyable

/** This class encapsulates a long term secret key for a Kerberos
 *  principal.
 * 
 *  All Kerberos JAAS login modules that obtain a principal's password and
 *  generate the secret key from it should use this class.
 *  Sometimes, such as when authenticating a server in
 *  the absence of user-to-user authentication, the login module will store
 *  an instance of this class in the private credential set of a
 *  Subject during the commit phase of the
 *  authentication process.
 * 
 *  A Kerberos service using a keytab to read secret keys should use
 *  the KeyTab class, where latest keys can be read when needed.
 * 
 *  It might be necessary for the application to be granted a
 *  PrivateCredentialPermission if it needs to access the KerberosKey
 *  instance from a Subject. This permission is not needed when the
 *  application depends on the default JGSS Kerberos mechanism to access the
 *  KerberosKey. In that case, however, the application will need an
 *  appropriate
 *  ServicePermission.
 */
class KerberosKey extends Object with SecretKey with Destroyable {

    /** Constructs a KerberosKey from the given bytes when the key type and
     *  key version number are known.
     */
    @stub
    def this(principal: KerberosPrincipal, keyBytes: Array[Byte], keyType: Int, versionNum: Int) = ???

    /** Destroys this key. */
    @stub
    def destroy(): Unit = ???

    /** Compares the specified Object with this KerberosKey for equality. */
    @stub
    def equals(other: Object): Boolean = ???

    /** Returns the standard algorithm name for this key. */
    @stub
    def getAlgorithm(): String = ???

    /** Returns the key material of this secret key. */
    @stub
    def getEncoded(): Array[Byte] = ???

    /** Returns the name of the encoding format for this secret key. */
    @stub
    def getFormat(): String = ???

    /** Returns the key type for this long-term key. */
    @stub
    def getKeyType(): Int = ???

    /** Returns the principal that this key belongs to. */
    @stub
    def getPrincipal(): KerberosPrincipal = ???

    /** Returns the key version number. */
    @stub
    def getVersionNumber(): Int = ???

    /** Returns a hashcode for this KerberosKey. */
    @stub
    def hashCode(): Int = ???

    /** Determines if this key has been destroyed. */
    @stub
    def isDestroyed(): Boolean = ???
}

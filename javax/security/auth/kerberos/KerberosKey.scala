package javax.security.auth.kerberos

import java.lang.{Object, String}
import javax.crypto.SecretKey
import javax.security.auth.Destroyable

// This class encapsulates a long term secret key for a Kerberos
// principal.
//
// All Kerberos JAAS login modules that obtain a principal's password and
// generate the secret key from it should use this class.
// Sometimes, such as when authenticating a server in
// the absence of user-to-user authentication, the login module will store
// an instance of this class in the private credential set of a
// Subject during the commit phase of the
// authentication process.
//
// A Kerberos service using a keytab to read secret keys should use
// the KeyTab class, where latest keys can be read when needed.
//
// It might be necessary for the application to be granted a
// PrivateCredentialPermission if it needs to access the KerberosKey
// instance from a Subject. This permission is not needed when the
// application depends on the default JGSS Kerberos mechanism to access the
// KerberosKey. In that case, however, the application will need an
// appropriate
// ServicePermission.
class KerberosKey extends Object with SecretKey, with Destroyable {

    @stub
    // Constructs a KerberosKey from the given bytes when the key type and
    // key version number are known.
    def this(principal: KerberosPrincipal, keyBytes: Array[Byte], keyType: Int, versionNum: Int) = ???

    @stub
    // Destroys this key.
    def destroy(): Unit = ???

    @stub
    // Compares the specified Object with this KerberosKey for equality.
    def equals(other: Object): Boolean = ???

    @stub
    // Returns the standard algorithm name for this key.
    def getAlgorithm(): String = ???

    @stub
    // Returns the key material of this secret key.
    def getEncoded(): Array[Byte] = ???

    @stub
    // Returns the name of the encoding format for this secret key.
    def getFormat(): String = ???

    @stub
    // Returns the key type for this long-term key.
    def getKeyType(): Int = ???

    @stub
    // Returns the principal that this key belongs to.
    def getPrincipal(): KerberosPrincipal = ???

    @stub
    // Returns the key version number.
    def getVersionNumber(): Int = ???

    @stub
    // Returns a hashcode for this KerberosKey.
    def hashCode(): Int = ???

    @stub
    // Determines if this key has been destroyed.
    def isDestroyed(): Boolean = ???
}

package java.security

import java.io.{File, InputStream, OutputStream}
import java.lang.{Class, Object, String}
import java.security.cert.Certificate
import java.security.spec.AlgorithmParameterSpec
import java.util.{Date, Enumeration, Set}
import javax.crypto.SecretKey
import javax.security.auth.Destroyable
import javax.security.auth.callback.CallbackHandler
import scala.scalanative.annotation.stub

/** This class represents a storage facility for cryptographic
 *  keys and certificates.
 * 
 *   A KeyStore manages different types of entries.
 *  Each type of entry implements the KeyStore.Entry interface.
 *  Three basic KeyStore.Entry implementations are provided:
 * 
 *  
 *  KeyStore.PrivateKeyEntry
 *   This type of entry holds a cryptographic PrivateKey,
 *  which is optionally stored in a protected format to prevent
 *  unauthorized access.  It is also accompanied by a certificate chain
 *  for the corresponding public key.
 * 
 *   Private keys and certificate chains are used by a given entity for
 *  self-authentication. Applications for this authentication include software
 *  distribution organizations which sign JAR files as part of releasing
 *  and/or licensing software.
 * 
 *  KeyStore.SecretKeyEntry
 *   This type of entry holds a cryptographic SecretKey,
 *  which is optionally stored in a protected format to prevent
 *  unauthorized access.
 * 
 *  KeyStore.TrustedCertificateEntry
 *   This type of entry contains a single public key Certificate
 *  belonging to another party. It is called a trusted certificate
 *  because the keystore owner trusts that the public key in the certificate
 *  indeed belongs to the identity identified by the subject (owner)
 *  of the certificate.
 * 
 *  This type of entry can be used to authenticate other parties.
 *  
 * 
 *   Each entry in a keystore is identified by an "alias" string. In the
 *  case of private keys and their associated certificate chains, these strings
 *  distinguish among the different ways in which the entity may authenticate
 *  itself. For example, the entity may authenticate itself using different
 *  certificate authorities, or using different public key algorithms.
 * 
 *   Whether aliases are case sensitive is implementation dependent. In order
 *  to avoid problems, it is recommended not to use aliases in a KeyStore that
 *  only differ in case.
 * 
 *   Whether keystores are persistent, and the mechanisms used by the
 *  keystore if it is persistent, are not specified here. This allows
 *  use of a variety of techniques for protecting sensitive (e.g., private or
 *  secret) keys. Smart cards or other integrated cryptographic engines
 *  (SafeKeyper) are one option, and simpler mechanisms such as files may also
 *  be used (in a variety of formats).
 * 
 *   Typical ways to request a KeyStore object include
 *  relying on the default type and providing a specific keystore type.
 * 
 *  
 *  To rely on the default type:
 *  
 *     KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
 *  
 *  The system will return a keystore implementation for the default type.
 * 
 *  To provide a specific keystore type:
 *  
 *       KeyStore ks = KeyStore.getInstance("JKS");
 *  
 *  The system will return the most preferred implementation of the
 *  specified keystore type available in the environment. 
 *  
 * 
 *   Before a keystore can be accessed, it must be
 *  loaded.
 *  
 *     KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
 * 
 *     // get user password and file input stream
 *     char[] password = getPassword();
 * 
 *     try (FileInputStream fis = new FileInputStream("keyStoreName")) {
 *         ks.load(fis, password);
 *     }
 *  
 * 
 *  To create an empty keystore using the above load method,
 *  pass null as the InputStream argument.
 * 
 *   Once the keystore has been loaded, it is possible
 *  to read existing entries from the keystore, or to write new entries
 *  into the keystore:
 *  
 *     KeyStore.ProtectionParameter protParam =
 *         new KeyStore.PasswordProtection(password);
 * 
 *     // get my private key
 *     KeyStore.PrivateKeyEntry pkEntry = (KeyStore.PrivateKeyEntry)
 *         ks.getEntry("privateKeyAlias", protParam);
 *     PrivateKey myPrivateKey = pkEntry.getPrivateKey();
 * 
 *     // save my secret key
 *     javax.crypto.SecretKey mySecretKey;
 *     KeyStore.SecretKeyEntry skEntry =
 *         new KeyStore.SecretKeyEntry(mySecretKey);
 *     ks.setEntry("secretKeyAlias", skEntry, protParam);
 * 
 *     // store away the keystore
 *     try (FileOutputStream fos = new FileOutputStream("newKeyStoreName")) {
 *         ks.store(fos, password);
 *     }
 *  
 * 
 *  Note that although the same password may be used to
 *  load the keystore, to protect the private key entry,
 *  to protect the secret key entry, and to store the keystore
 *  (as is shown in the sample code above),
 *  different passwords or other protection parameters
 *  may also be used.
 * 
 *   Every implementation of the Java platform is required to support
 *  the following standard KeyStore type:
 *  
 *  PKCS12
 *  
 *  This type is described in the 
 *  KeyStore section of the
 *  Java Cryptography Architecture Standard Algorithm Name Documentation.
 *  Consult the release documentation for your implementation to see if any
 *  other types are supported.
 */
class KeyStore extends Object {

    /** Creates a KeyStore object of the given type, and encapsulates the given
     *  provider implementation (SPI object) in it.
     */
    @stub
    protected def this(keyStoreSpi: KeyStoreSpi, provider: Provider, type: String) = ???

    /** Lists all the alias names of this keystore. */
    @stub
    def aliases(): Enumeration[String] = ???

    /** Checks if the given alias exists in this keystore. */
    @stub
    def containsAlias(alias: String): Boolean = ???

    /** Deletes the entry identified by the given alias from this keystore. */
    @stub
    def deleteEntry(alias: String): Unit = ???

    /** Determines if the keystore Entry for the specified
     *  alias is an instance or subclass of the specified
     *  entryClass.
     */
    @stub
    def entryInstanceOf(alias: String, entryClass: Class[_ <: KeyStore.Entry]): Boolean = ???

    /** Returns the certificate associated with the given alias. */
    @stub
    def getCertificate(alias: String): Certificate = ???

    /** Returns the (alias) name of the first keystore entry whose certificate
     *  matches the given certificate.
     */
    @stub
    def getCertificateAlias(cert: Certificate): String = ???

    /** Returns the certificate chain associated with the given alias. */
    @stub
    def getCertificateChain(alias: String): Array[Certificate] = ???

    /** Returns the creation date of the entry identified by the given alias. */
    @stub
    def getCreationDate(alias: String): Date = ???

    /** Gets a keystore Entry for the specified alias
     *  with the specified protection parameter.
     */
    @stub
    def getEntry(alias: String, protParam: KeyStore.ProtectionParameter): KeyStore.Entry = ???

    /** Returns the key associated with the given alias, using the given
     *  password to recover it.
     */
    @stub
    def getKey(alias: String, password: Array[Char]): Key = ???

    /** Returns the provider of this keystore. */
    @stub
    def getProvider(): Provider = ???

    /** Returns the type of this keystore. */
    @stub
    def getType(): String = ???

    /** Returns true if the entry identified by the given alias
     *  was created by a call to setCertificateEntry,
     *  or created by a call to setEntry with a
     *  TrustedCertificateEntry.
     */
    @stub
    def isCertificateEntry(alias: String): Boolean = ???

    /** Returns true if the entry identified by the given alias
     *  was created by a call to setKeyEntry,
     *  or created by a call to setEntry with a
     *  PrivateKeyEntry or a SecretKeyEntry.
     */
    @stub
    def isKeyEntry(alias: String): Boolean = ???

    /** Loads this KeyStore from the given input stream. */
    @stub
    def load(stream: InputStream, password: Array[Char]): Unit = ???

    /** Loads this keystore using the given LoadStoreParameter. */
    @stub
    def load(param: KeyStore.LoadStoreParameter): Unit = ???

    /** Assigns the given trusted certificate to the given alias. */
    @stub
    def setCertificateEntry(alias: String, cert: Certificate): Unit = ???

    /** Saves a keystore Entry under the specified alias. */
    @stub
    def setEntry(alias: String, entry: KeyStore.Entry, protParam: KeyStore.ProtectionParameter): Unit = ???

    /** Assigns the given key (that has already been protected) to the given
     *  alias.
     */
    @stub
    def setKeyEntry(alias: String, key: Array[Byte], chain: Array[Certificate]): Unit = ???

    /** Assigns the given key to the given alias, protecting it with the given
     *  password.
     */
    @stub
    def setKeyEntry(alias: String, key: Key, password: Array[Char], chain: Array[Certificate]): Unit = ???

    /** Retrieves the number of entries in this keystore. */
    @stub
    def size(): Int = ???

    /** Stores this keystore using the given LoadStoreParameter. */
    @stub
    def store(param: KeyStore.LoadStoreParameter): Unit = ???

    /** Stores this keystore to the given output stream, and protects its
     *  integrity with the given password.
     */
    @stub
    def store(stream: OutputStream, password: Array[Char]): Unit = ???
}

object KeyStore {
    /** A description of a to-be-instantiated KeyStore object.
     * 
     *  An instance of this class encapsulates the information needed to
     *  instantiate and initialize a KeyStore object. That process is
     *  triggered when the getKeyStore() method is called.
     * 
     *  This makes it possible to decouple configuration from KeyStore
     *  object creation and e.g. delay a password prompt until it is
     *  needed.
     */
    abstract object Builder extends Object {

        /** Construct a new Builder. */
        @stub
        protected def apply() = ???

        /** Returns the KeyStore described by this object. */
        def getKeyStore(): KeyStore

        /** Returns the ProtectionParameters that should be used to obtain
         *  the Entry with the given alias.
         */
        def getProtectionParameter(alias: String): KeyStore.ProtectionParameter

        /** Returns a new Builder that encapsulates the given KeyStore. */
        @stub
        def newInstance(keyStore: KeyStore, protectionParameter: KeyStore.ProtectionParameter): Builder = ???

        /** Returns a new Builder object. */
        @stub
        def newInstance(type: String, provider: Provider, file: File, protection: KeyStore.ProtectionParameter): Builder = ???

        /** Returns a new Builder object. */
        @stub
        def newInstance(type: String, provider: Provider, protection: KeyStore.ProtectionParameter): Builder = ???
    }


    /** A ProtectionParameter encapsulating a CallbackHandler. */
    object CallbackHandlerProtection extends Object with KeyStore.ProtectionParameter {

        /** Constructs a new CallbackHandlerProtection from a
         *  CallbackHandler.
         */
        @stub
        def apply(handler: CallbackHandler) = ???

        /** Returns the CallbackHandler. */
        @stub
        def getCallbackHandler(): CallbackHandler = ???
    }


    /** A marker interface for KeyStore entry types. */
    trait Entry {

        /** An attribute associated with a keystore entry.
         *  It comprises a name and one or more values.
         */
        trait Attribute {

            /** Returns the attribute's name. */
            @stub
            def getName(): String = ???

            /** Returns the attribute's value. */
            @stub
            def getValue(): String = ???
        }


        /** Retrieves the attributes associated with an entry. */
        @stub
        def getAttributes(): Set[Entry.Attribute] = ???
    }


    /** A marker interface for KeyStore
     *  load
     *  and
     *  store
     *  parameters.
     */
    trait LoadStoreParameter {

        /** Gets the parameter used to protect keystore data. */
        @stub
        def getProtectionParameter(): KeyStore.ProtectionParameter = ???
    }


    /** A password-based implementation of ProtectionParameter. */
    object PasswordProtection extends Object with KeyStore.ProtectionParameter with Destroyable {

        /** Creates a password parameter. */
        @stub
        def apply(password: Array[Char]) = ???

        /** Creates a password parameter and specifies the protection algorithm
         *  and associated parameters to use when encrypting a keystore entry.
         */
        @stub
        def apply(password: Array[Char], protectionAlgorithm: String, protectionParameters: AlgorithmParameterSpec) = ???

        /** Clears the password. */
        @stub
        def destroy(): Unit = ???

        /** Gets the password. */
        @stub
        def getPassword(): Array[Char] = ???

        /** Gets the name of the protection algorithm. */
        @stub
        def getProtectionAlgorithm(): String = ???

        /** Gets the parameters supplied for the protection algorithm. */
        @stub
        def getProtectionParameters(): AlgorithmParameterSpec = ???

        /** Determines if password has been cleared. */
        @stub
        def isDestroyed(): Boolean = ???
    }


    /** A KeyStore entry that holds a PrivateKey
     *  and corresponding certificate chain.
     */
    final object PrivateKeyEntry extends Object with KeyStore.Entry {

        /** Constructs a PrivateKeyEntry with a
         *  PrivateKey and corresponding certificate chain.
         */
        @stub
        def apply(privateKey: PrivateKey, chain: Array[Certificate]) = ???

        /** Constructs a PrivateKeyEntry with a PrivateKey and
         *  corresponding certificate chain and associated entry attributes.
         */
        @stub
        def apply(privateKey: PrivateKey, chain: Array[Certificate], attributes: Set[KeyStore.Entry.Attribute]) = ???

        /** Retrieves the attributes associated with an entry. */
        @stub
        def getAttributes(): Set[KeyStore.Entry.Attribute] = ???

        /** Gets the end entity Certificate
         *  from the certificate chain in this entry.
         */
        @stub
        def getCertificate(): Certificate = ???

        /** Gets the Certificate chain from this entry. */
        @stub
        def getCertificateChain(): Array[Certificate] = ???

        /** Gets the PrivateKey from this entry. */
        @stub
        def getPrivateKey(): PrivateKey = ???

        /** Returns a string representation of this PrivateKeyEntry. */
        @stub
        def toString(): String = ???
    }


    /** A marker interface for keystore protection parameters.
     * 
     *   The information stored in a ProtectionParameter
     *  object protects the contents of a keystore.
     *  For example, protection parameters may be used to check
     *  the integrity of keystore data, or to protect the
     *  confidentiality of sensitive keystore data
     *  (such as a PrivateKey).
     */
    trait ProtectionParameter {


    /** A KeyStore entry that holds a SecretKey. */
    final object SecretKeyEntry extends Object with KeyStore.Entry {

        /** Constructs a SecretKeyEntry with a
         *  SecretKey.
         */
        @stub
        def apply(secretKey: SecretKey) = ???

        /** Constructs a SecretKeyEntry with a SecretKey and
         *  associated entry attributes.
         */
        @stub
        def apply(secretKey: SecretKey, attributes: Set[KeyStore.Entry.Attribute]) = ???

        /** Retrieves the attributes associated with an entry. */
        @stub
        def getAttributes(): Set[KeyStore.Entry.Attribute] = ???

        /** Gets the SecretKey from this entry. */
        @stub
        def getSecretKey(): SecretKey = ???

        /** Returns a string representation of this SecretKeyEntry. */
        @stub
        def toString(): String = ???
    }


    /** A KeyStore entry that holds a trusted
     *  Certificate.
     */
    final object TrustedCertificateEntry extends Object with KeyStore.Entry {

        /** Constructs a TrustedCertificateEntry with a
         *  trusted Certificate.
         */
        @stub
        def apply(trustedCert: Certificate) = ???

        /** Constructs a TrustedCertificateEntry with a
         *  trusted Certificate and associated entry attributes.
         */
        @stub
        def apply(trustedCert: Certificate, attributes: Set[KeyStore.Entry.Attribute]) = ???

        /** Retrieves the attributes associated with an entry. */
        @stub
        def getAttributes(): Set[KeyStore.Entry.Attribute] = ???

        /** Gets the trusted Certficate from this entry. */
        @stub
        def getTrustedCertificate(): Certificate = ???

        /** Returns a string representation of this TrustedCertificateEntry. */
        @stub
        def toString(): String = ???
    }


    /** Returns the default keystore type as specified by the
     *  keystore.type security property, or the string
     *  "jks" (acronym for "Java keystore")
     *  if no such property exists.
     */
    @stub
    def getDefaultType(): String = ???

    /** Returns a keystore object of the specified type. */
    @stub
    def getInstance(type: String): KeyStore = ???

    /** Returns a keystore object of the specified type. */
    @stub
    def getInstance(type: String, provider: Provider): KeyStore = ???

    /** Returns a keystore object of the specified type. */
    @stub
    def getInstance(type: String, provider: String): KeyStore = ???
}

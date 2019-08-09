package java.security

import java.io.InputStream
import java.lang.{Class, Object, String}
import java.security.cert.Certificate
import java.util.{Date, Enumeration}

/** This class defines the Service Provider Interface (SPI)
 *  for the KeyStore class.
 *  All the abstract methods in this class must be implemented by each
 *  cryptographic service provider who wishes to supply the implementation
 *  of a keystore for a particular keystore type.
 */
abstract class KeyStoreSpi extends Object {

    /** Lists all the alias names of this keystore. */
    def engineAliases(): Enumeration[String]

    /** Checks if the given alias exists in this keystore. */
    def engineContainsAlias(alias: String): Boolean

    /** Deletes the entry identified by the given alias from this keystore. */
    def engineDeleteEntry(alias: String): Unit

    /** Determines if the keystore Entry for the specified
     *  alias is an instance or subclass of the specified
     *  entryClass.
     */
    def engineEntryInstanceOf(alias: String, entryClass: Class[_ <: KeyStore.Entry]): Boolean

    /** Returns the certificate associated with the given alias. */
    def engineGetCertificate(alias: String): Certificate

    /** Returns the (alias) name of the first keystore entry whose certificate
     *  matches the given certificate.
     */
    def engineGetCertificateAlias(cert: Certificate): String

    /** Returns the certificate chain associated with the given alias. */
    def engineGetCertificateChain(alias: String): Array[Certificate]

    /** Returns the creation date of the entry identified by the given alias. */
    def engineGetCreationDate(alias: String): Date

    /** Gets a KeyStore.Entry for the specified alias
     *  with the specified protection parameter.
     */
    def engineGetEntry(alias: String, protParam: KeyStore.ProtectionParameter): KeyStore.Entry

    /** Returns the key associated with the given alias, using the given
     *  password to recover it.
     */
    def engineGetKey(alias: String, password: Array[Char]): Key

    /** Returns true if the entry identified by the given alias
     *  was created by a call to setCertificateEntry,
     *  or created by a call to setEntry with a
     *  TrustedCertificateEntry.
     */
    def engineIsCertificateEntry(alias: String): Boolean

    /** Returns true if the entry identified by the given alias
     *  was created by a call to setKeyEntry,
     *  or created by a call to setEntry with a
     *  PrivateKeyEntry or a SecretKeyEntry.
     */
    def engineIsKeyEntry(alias: String): Boolean

    /** Loads the keystore from the given input stream. */
    def engineLoad(stream: InputStream, password: Array[Char]): Unit

    /** Loads the keystore using the given
     *  KeyStore.LoadStoreParameter.
     */
    def engineLoad(param: KeyStore.LoadStoreParameter): Unit

    /** Assigns the given certificate to the given alias. */
    def engineSetCertificateEntry(alias: String, cert: Certificate): Unit

    /** Saves a KeyStore.Entry under the specified alias. */
    def engineSetEntry(alias: String, entry: KeyStore.Entry, protParam: KeyStore.ProtectionParameter): Unit

    /** Assigns the given key (that has already been protected) to the given
     *  alias.
     */
    def engineSetKeyEntry(alias: String, key: Array[Byte], chain: Array[Certificate]): Unit

    /** Assigns the given key to the given alias, protecting it with the given
     *  password.
     */
    def engineSetKeyEntry(alias: String, key: Key, password: Array[Char], chain: Array[Certificate]): Unit

    /** Retrieves the number of entries in this keystore. */
    def engineSize(): Int

    /** Stores this keystore using the given
     *  KeyStore.LoadStoreParmeter.
     */
    def engineStore(param: KeyStore.LoadStoreParameter): Unit
}

package javax.crypto

import java.io.Serializable
import java.lang.{Object, String}
import java.security.Key
import scala.scalanative.annotation.stub

/** This class enables a programmer to create an object and protect its
 *  confidentiality with a cryptographic algorithm.
 * 
 *   Given any Serializable object, one can create a SealedObject
 *  that encapsulates the original object, in serialized
 *  format (i.e., a "deep copy"), and seals (encrypts) its serialized contents,
 *  using a cryptographic algorithm such as AES, to protect its
 *  confidentiality.  The encrypted content can later be decrypted (with
 *  the corresponding algorithm using the correct decryption key) and
 *  de-serialized, yielding the original object.
 * 
 *   Note that the Cipher object must be fully initialized with the
 *  correct algorithm, key, padding scheme, etc., before being applied
 *  to a SealedObject.
 * 
 *   The original object that was sealed can be recovered in two different
 *  ways:
 * 
 *  
 * 
 *  by using the getObject
 *  method that takes a Cipher object.
 * 
 *   This method requires a fully initialized Cipher object,
 *  initialized with the
 *  exact same algorithm, key, padding scheme, etc., that were used to seal the
 *  object.
 * 
 *   This approach has the advantage that the party who unseals the
 *  sealed object does not require knowledge of the decryption key. For example,
 *  after one party has initialized the cipher object with the required
 *  decryption key, it could hand over the cipher object to
 *  another party who then unseals the sealed object.
 * 
 *  by using one of the
 *  getObject methods
 *  that take a Key object.
 * 
 *   In this approach, the getObject method creates a cipher
 *  object for the appropriate decryption algorithm and initializes it with the
 *  given decryption key and the algorithm parameters (if any) that were stored
 *  in the sealed object.
 * 
 *   This approach has the advantage that the party who
 *  unseals the object does not need to keep track of the parameters (e.g., an
 *  IV) that were used to seal the object.
 * 
 *  
 */
class SealedObject extends Object with Serializable {

    /** Constructs a SealedObject object from the passed-in SealedObject. */
    @stub
    protected def this(so: SealedObject) = ???

    /** Constructs a SealedObject from any Serializable object. */
    @stub
    def this(object: Serializable, c: Cipher) = ???

    /** The cryptographic parameters used by the sealing Cipher,
     *  encoded in the default format.
     */
    @stub
    protected val encodedParams: Array[Byte] = ???

    /** Returns the algorithm that was used to seal this object. */
    @stub
    def getAlgorithm(): String = ???

    /** Retrieves the original (encapsulated) object. */
    @stub
    def getObject(c: Cipher): Object = ???

    /** Retrieves the original (encapsulated) object. */
    @stub
    def getObject(key: Key): Object = ???

    /** Retrieves the original (encapsulated) object. */
    @stub
    def getObject(key: Key, provider: String): Object = ???
}

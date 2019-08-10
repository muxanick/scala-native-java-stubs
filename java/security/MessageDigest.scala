package java.security

import java.lang.{Object, String}
import java.nio.ByteBuffer
import scala.scalanative.annotation.stub

/** This MessageDigest class provides applications the functionality of a
 *  message digest algorithm, such as SHA-1 or SHA-256.
 *  Message digests are secure one-way hash functions that take arbitrary-sized
 *  data and output a fixed-length hash value.
 * 
 *  A MessageDigest object starts out initialized. The data is
 *  processed through it using the update
 *  methods. At any point reset can be called
 *  to reset the digest. Once all the data to be updated has been
 *  updated, one of the digest methods should
 *  be called to complete the hash computation.
 * 
 *  The digest method can be called once for a given number
 *  of updates. After digest has been called, the MessageDigest
 *  object is reset to its initialized state.
 * 
 *  Implementations are free to implement the Cloneable interface.
 *  Client applications can test cloneability by attempting cloning
 *  and catching the CloneNotSupportedException:
 * 
 *  
 *  MessageDigest md = MessageDigest.getInstance("SHA-256");
 * 
 *  try {
 *      md.update(toChapter1);
 *      MessageDigest tc1 = md.clone();
 *      byte[] toChapter1Digest = tc1.digest();
 *      md.update(toChapter2);
 *      ...etc.
 *  } catch (CloneNotSupportedException cnse) {
 *      throw new DigestException("couldn't make digest of partial content");
 *  }
 *  
 * 
 *  Note that if a given implementation is not cloneable, it is
 *  still possible to compute intermediate digests by instantiating
 *  several instances, if the number of digests is known in advance.
 * 
 *  Note that this class is abstract and extends from
 *  MessageDigestSpi for historical reasons.
 *  Application developers should only take notice of the methods defined in
 *  this MessageDigest class; all the methods in
 *  the superclass are intended for cryptographic service providers who wish to
 *  supply their own implementations of message digest algorithms.
 * 
 *   Every implementation of the Java platform is required to support
 *  the following standard MessageDigest algorithms:
 *  
 *  MD5
 *  SHA-1
 *  SHA-256
 *  
 *  These algorithms are described in the 
 *  MessageDigest section of the
 *  Java Cryptography Architecture Standard Algorithm Name Documentation.
 *  Consult the release documentation for your implementation to see if any
 *  other algorithms are supported.
 */
abstract class MessageDigest extends MessageDigestSpi {

    /** Creates a message digest with the specified algorithm name. */
    @stub
    protected def this(algorithm: String) = ???

    /** Returns a clone if the implementation is cloneable. */
    def clone(): Any

    /** Completes the hash computation by performing final operations
     *  such as padding.
     */
    def digest(): Array[Byte]

    /** Performs a final update on the digest using the specified array
     *  of bytes, then completes the digest computation.
     */
    def digest(input: Array[Byte]): Array[Byte]

    /** Completes the hash computation by performing final operations
     *  such as padding.
     */
    def digest(buf: Array[Byte], offset: Int, len: Int): Int

    /** Returns a string that identifies the algorithm, independent of
     *  implementation details.
     */
    def getAlgorithm(): String

    /** Returns the length of the digest in bytes, or 0 if this operation is
     *  not supported by the provider and the implementation is not cloneable.
     */
    def getDigestLength(): Int

    /** Returns the provider of this message digest object. */
    def getProvider(): Provider

    /** Resets the digest for further use. */
    def reset(): Unit

    /** Returns a string representation of this message digest object. */
    def toString(): String

    /** Updates the digest using the specified byte. */
    def update(input: Byte): Unit

    /** Updates the digest using the specified array of bytes. */
    def update(input: Array[Byte]): Unit

    /** Updates the digest using the specified array of bytes, starting
     *  at the specified offset.
     */
    def update(input: Array[Byte], offset: Int, len: Int): Unit

    /** Update the digest using the specified ByteBuffer. */
    def update(input: ByteBuffer): Unit
}

object MessageDigest {
    /** Returns a MessageDigest object that implements the specified digest
     *  algorithm.
     */
    @stub
    def getInstance(algorithm: String): MessageDigest = ???

    /** Returns a MessageDigest object that implements the specified digest
     *  algorithm.
     */
    @stub
    def getInstance(algorithm: String, provider: Provider): MessageDigest = ???

    /** Returns a MessageDigest object that implements the specified digest
     *  algorithm.
     */
    @stub
    def getInstance(algorithm: String, provider: String): MessageDigest = ???

    /** Compares two digests for equality. */
    @stub
    def isEqual(digesta: Array[Byte], digestb: Array[Byte]): Boolean = ???
}

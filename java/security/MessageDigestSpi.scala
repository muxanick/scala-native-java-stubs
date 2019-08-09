package java.security

import java.lang.Object

/** This class defines the Service Provider Interface (SPI)
 *  for the MessageDigest class, which provides the functionality
 *  of a message digest algorithm, such as MD5 or SHA. Message digests are
 *  secure one-way hash functions that take arbitrary-sized data and output a
 *  fixed-length hash value.
 * 
 *   All the abstract methods in this class must be implemented by a
 *  cryptographic service provider who wishes to supply the implementation
 *  of a particular message digest algorithm.
 * 
 *   Implementations are free to implement the Cloneable interface.
 */
abstract class MessageDigestSpi extends Object {

    /** Returns a clone if the implementation is cloneable. */
    def clone(): Object

    /** Completes the hash computation by performing final
     *  operations such as padding.
     */
    protected def engineDigest(): Array[Byte]

    /** Completes the hash computation by performing final
     *  operations such as padding.
     */
    protected def engineDigest(buf: Array[Byte], offset: Int, len: Int): Int

    /** Returns the digest length in bytes. */
    protected def engineGetDigestLength(): Int

    /** Resets the digest for further use. */
    protected def engineReset(): Unit

    /** Updates the digest using the specified byte. */
    protected def engineUpdate(input: Byte): Unit

    /** Updates the digest using the specified array of bytes,
     *  starting at the specified offset.
     */
    protected def engineUpdate(input: Array[Byte], offset: Int, len: Int): Unit
}

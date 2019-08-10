package javax.crypto

import java.lang.Object
import java.nio.ByteBuffer
import java.security.Key
import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** This class defines the Service Provider Interface (SPI)
 *  for the Mac class.
 *  All the abstract methods in this class must be implemented by each
 *  cryptographic service provider who wishes to supply the implementation
 *  of a particular MAC algorithm.
 * 
 *   Implementations are free to implement the Cloneable interface.
 */
abstract class MacSpi extends Object {

    /**  */
    @stub
    def this() = ???

    /** Returns a clone if the implementation is cloneable. */
    def clone(): Any

    /** Completes the MAC computation and resets the MAC for further use,
     *  maintaining the secret key that the MAC was initialized with.
     */
    protected def engineDoFinal(): Array[Byte]

    /** Returns the length of the MAC in bytes. */
    protected def engineGetMacLength(): Int

    /** Initializes the MAC with the given (secret) key and algorithm
     *  parameters.
     */
    protected def engineInit(key: Key, params: AlgorithmParameterSpec): Unit

    /** Resets the MAC for further use, maintaining the secret key that the
     *  MAC was initialized with.
     */
    protected def engineReset(): Unit

    /** Processes the given byte. */
    protected def engineUpdate(input: Byte): Unit

    /** Processes the first len bytes in input,
     *  starting at offset inclusive.
     */
    protected def engineUpdate(input: Array[Byte], offset: Int, len: Int): Unit

    /** Processes input.remaining() bytes in the ByteBuffer
     *  input, starting at input.position().
     */
    protected def engineUpdate(input: ByteBuffer): Unit
}

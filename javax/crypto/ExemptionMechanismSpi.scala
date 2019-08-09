package javax.crypto

import java.lang.Object
import java.security.{AlgorithmParameters, Key}

/** This class defines the Service Provider Interface (SPI)
 *  for the ExemptionMechanism class.
 *  All the abstract methods in this class must be implemented by each
 *  cryptographic service provider who wishes to supply the implementation
 *  of a particular exemption mechanism.
 */
abstract class ExemptionMechanismSpi extends Object {

    /** Generates the exemption mechanism key blob. */
    protected def engineGenExemptionBlob(): Array[Byte]

    /** Generates the exemption mechanism key blob, and stores the result in
     *  the output buffer, starting at outputOffset
     *  inclusive.
     */
    protected def engineGenExemptionBlob(output: Array[Byte], outputOffset: Int): Int

    /** Returns the length in bytes that an output buffer would need to be in
     *  order to hold the result of the next
     *  engineGenExemptionBlob
     *  operation, given the input length inputLen (in bytes).
     */
    protected def engineGetOutputSize(inputLen: Int): Int

    /** Initializes this exemption mechanism with a key. */
    protected def engineInit(key: Key): Unit

    /** Initializes this exemption mechanism with a key and a set of algorithm
     *  parameters.
     */
    protected def engineInit(key: Key, params: AlgorithmParameters): Unit
}

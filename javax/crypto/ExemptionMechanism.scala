package javax.crypto

import java.lang.{Object, String}
import java.security.{AlgorithmParameters, Key, Provider}
import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** This class provides the functionality of an exemption mechanism, examples
 *  of which are key recovery, key weakening, and
 *  key escrow.
 * 
 *  Applications or applets that use an exemption mechanism may be granted
 *  stronger encryption capabilities than those which don't.
 */
class ExemptionMechanism extends Object {

    /** Creates a ExemptionMechanism object. */
    @stub
    protected def this(exmechSpi: ExemptionMechanismSpi, provider: Provider, mechanism: String) = ???

    /** Ensures that the key stored away by this ExemptionMechanism
     *  object will be wiped out when there are no more references to it.
     */
    @stub
    protected def finalize(): Unit = ???

    /** Generates the exemption mechanism key blob. */
    @stub
    def genExemptionBlob(): Array[Byte] = ???

    /** Generates the exemption mechanism key blob, and stores the result in
     *  the output buffer.
     */
    @stub
    def genExemptionBlob(output: Array[Byte]): Int = ???

    /** Generates the exemption mechanism key blob, and stores the result in
     *  the output buffer, starting at outputOffset
     *  inclusive.
     */
    @stub
    def genExemptionBlob(output: Array[Byte], outputOffset: Int): Int = ???

    /** Returns the exemption mechanism name of this
     *  ExemptionMechanism object.
     */
    @stub
    def getName(): String = ???

    /** Returns the length in bytes that an output buffer would need to be in
     *  order to hold the result of the next
     *  genExemptionBlob
     *  operation, given the input length inputLen (in bytes).
     */
    @stub
    def getOutputSize(inputLen: Int): Int = ???

    /** Returns the provider of this ExemptionMechanism object. */
    @stub
    def getProvider(): Provider = ???

    /** Initializes this exemption mechanism with a key. */
    @stub
    def init(key: Key): Unit = ???

    /** Initializes this exemption mechanism with a key and a set of algorithm
     *  parameters.
     */
    @stub
    def init(key: Key, params: AlgorithmParameters): Unit = ???

    /** Initializes this exemption mechanism with a key and a set of algorithm
     *  parameters.
     */
    @stub
    def init(key: Key, params: AlgorithmParameterSpec): Unit = ???

    /** Returns whether the result blob has been generated successfully by this
     *  exemption mechanism.
     */
    @stub
    def isCryptoAllowed(key: Key): Boolean = ???
}

object ExemptionMechanism {
    /** Returns an ExemptionMechanism object that implements the
     *  specified exemption mechanism algorithm.
     */
    @stub
    def getInstance(algorithm: String): ExemptionMechanism = ???

    /** Returns an ExemptionMechanism object that implements the
     *  specified exemption mechanism algorithm.
     */
    @stub
    def getInstance(algorithm: String, provider: Provider): ExemptionMechanism = ???

    /** Returns an ExemptionMechanism object that implements the
     *  specified exemption mechanism algorithm.
     */
    @stub
    def getInstance(algorithm: String, provider: String): ExemptionMechanism = ???
}

package javax.crypto

import java.lang.{Object, String}
import java.security.{AlgorithmParameters, Key, Provider}
import java.security.spec.AlgorithmParameterSpec

// This class provides the functionality of an exemption mechanism, examples
// of which are key recovery, key weakening, and
// key escrow.
//
// Applications or applets that use an exemption mechanism may be granted
// stronger encryption capabilities than those which don't.
class ExemptionMechanism extends Object {

    @stub
    // Ensures that the key stored away by this ExemptionMechanism
    // object will be wiped out when there are no more references to it.
    protected def finalize(): Unit = ???

    @stub
    // Generates the exemption mechanism key blob.
    def genExemptionBlob(): Array[Byte] = ???

    @stub
    // Generates the exemption mechanism key blob, and stores the result in
    // the output buffer.
    def genExemptionBlob(output: Array[Byte]): Int = ???

    @stub
    // Generates the exemption mechanism key blob, and stores the result in
    // the output buffer, starting at outputOffset
    // inclusive.
    def genExemptionBlob(output: Array[Byte], outputOffset: Int): Int = ???

    @stub
    // Returns the exemption mechanism name of this
    // ExemptionMechanism object.
    def getName(): String = ???

    @stub
    // Returns the length in bytes that an output buffer would need to be in
    // order to hold the result of the next
    // genExemptionBlob
    // operation, given the input length inputLen (in bytes).
    def getOutputSize(inputLen: Int): Int = ???

    @stub
    // Returns the provider of this ExemptionMechanism object.
    def getProvider(): Provider = ???

    @stub
    // Initializes this exemption mechanism with a key.
    def init(key: Key): Unit = ???

    @stub
    // Initializes this exemption mechanism with a key and a set of algorithm
    // parameters.
    def init(key: Key, params: AlgorithmParameters): Unit = ???

    @stub
    // Initializes this exemption mechanism with a key and a set of algorithm
    // parameters.
    def init(key: Key, params: AlgorithmParameterSpec): Unit = ???
}

object ExemptionMechanism {
    @stub
    // Returns an ExemptionMechanism object that implements the
    // specified exemption mechanism algorithm.
    def getInstance(algorithm: String): ExemptionMechanism = ???

    @stub
    // Returns an ExemptionMechanism object that implements the
    // specified exemption mechanism algorithm.
    def getInstance(algorithm: String, provider: Provider): ExemptionMechanism = ???

    @stub
    // Returns an ExemptionMechanism object that implements the
    // specified exemption mechanism algorithm.
    def getInstance(algorithm: String, provider: String): ExemptionMechanism = ???
}

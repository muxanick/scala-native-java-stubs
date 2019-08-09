package java.security.spec

import java.lang.Object
import java.math.BigInteger
import scala.scalanative.annotation.stub

/** This immutable class specifies an elliptic curve private key with
 *  its associated parameters.
 */
class ECPrivateKeySpec extends Object with KeySpec {

    /** Creates a new ECPrivateKeySpec with the specified
     *  parameter values.
     */
    @stub
    def this(s: BigInteger, params: ECParameterSpec) = ???

    /** Returns the associated elliptic curve domain
     *  parameters.
     */
    @stub
    def getParams(): ECParameterSpec = ???

    /** Returns the private value S. */
    @stub
    def getS(): BigInteger = ???
}

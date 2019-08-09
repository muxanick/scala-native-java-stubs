package java.security.spec

import java.lang.Object
import scala.scalanative.annotation.stub

/** This immutable class specifies an elliptic curve public key with
 *  its associated parameters.
 */
class ECPublicKeySpec extends Object with KeySpec {

    /** Creates a new ECPublicKeySpec with the specified
     *  parameter values.
     */
    @stub
    def this(w: ECPoint, params: ECParameterSpec) = ???

    /** Returns the associated elliptic curve domain
     *  parameters.
     */
    @stub
    def getParams(): ECParameterSpec = ???

    /** Returns the public point W. */
    @stub
    def getW(): ECPoint = ???
}

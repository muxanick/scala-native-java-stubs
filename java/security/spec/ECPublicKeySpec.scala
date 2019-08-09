package java.security.spec

import java.lang.Object

/** This immutable class specifies an elliptic curve public key with
 *  its associated parameters.
 */
class ECPublicKeySpec extends Object with KeySpec {

    /** Returns the associated elliptic curve domain
     *  parameters.
     */
    @stub
    def getParams(): ECParameterSpec = ???
}

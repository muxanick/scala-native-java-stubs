package java.security.spec

import java.lang.Object

// This immutable class specifies an elliptic curve public key with
// its associated parameters.
class ECPublicKeySpec extends Object with KeySpec {

    @stub
    // Returns the associated elliptic curve domain
    // parameters.
    def getParams(): ECParameterSpec = ???
}

package java.security.spec

import java.lang.Object

// This immutable class specifies an elliptic curve private key with
// its associated parameters.
class ECPrivateKeySpec extends Object with KeySpec {

    @stub
    // Returns the associated elliptic curve domain
    // parameters.
    def getParams(): ECParameterSpec = ???
}

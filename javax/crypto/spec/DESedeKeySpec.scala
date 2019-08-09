package javax.crypto.spec

import java.lang.Object
import java.security.spec.KeySpec

// This class specifies a DES-EDE ("triple-DES") key.
class DESedeKeySpec extends Object with KeySpec {

    @stub
    // Creates a DESedeKeySpec object using the first 24 bytes in
    // key as the key material for the DES-EDE key.
    def this(key: Array[Byte]) = ???

    @stub
    // Returns the DES-EDE key.
    def getKey(): Array[Byte] = ???
}

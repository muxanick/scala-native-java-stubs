package javax.xml.crypto

import java.lang.Object

// The purpose of the key that is to be selected.
object KeySelector.Purpose extends Object {

    @stub
    // A key for decrypting.
    def DECRYPT: KeySelector.Purpose = ???

    @stub
    // A key for encrypting.
    def ENCRYPT: KeySelector.Purpose = ???

    @stub
    // A key for signing.
    def SIGN: KeySelector.Purpose = ???
}

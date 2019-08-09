package javax.crypto.interfaces

import javax.crypto.SecretKey

// The interface to a PBE key.
trait PBEKey extends SecretKey {

    @stub
    // Returns the iteration count or 0 if not specified.
    def getIterationCount(): Int = ???

    @stub
    // Returns the password.
    def getPassword(): Array[Char] = ???
}

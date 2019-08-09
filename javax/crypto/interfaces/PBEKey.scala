package javax.crypto.interfaces

import javax.crypto.SecretKey

/** The interface to a PBE key. */
trait PBEKey extends SecretKey {

    /** Returns the iteration count or 0 if not specified. */
    @stub
    def getIterationCount(): Int = ???

    /** Returns the password. */
    @stub
    def getPassword(): Array[Char] = ???
}

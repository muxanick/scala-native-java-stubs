package javax.crypto.interfaces

import javax.crypto.SecretKey
import scala.scalanative.annotation.stub

/** The interface to a PBE key. */
trait PBEKey extends SecretKey {

    /** Returns the iteration count or 0 if not specified. */
    @stub
    def getIterationCount(): Int = ???

    /** Returns the password. */
    @stub
    def getPassword(): Array[Char] = ???

    /** Returns the salt or null if not specified. */
    @stub
    def getSalt(): Array[Byte] = ???
}

object PBEKey {
    /** The class fingerprint that is set to indicate serialization
     *  compatibility since J2SE 1.4.
     */
    @stub
    val serialVersionUID: Long = ???
}

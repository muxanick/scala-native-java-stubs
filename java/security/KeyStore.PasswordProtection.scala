package java.security

import java.lang.{Object, String}
import java.security.spec.AlgorithmParameterSpec
import javax.security.auth.Destroyable
import scala.scalanative.annotation.stub

/** A password-based implementation of ProtectionParameter. */
object KeyStore_PasswordProtection extends Object with KeyStore.ProtectionParameter with Destroyable {

    /** Creates a password parameter. */
    @stub
    def PasswordProtection(password: Array[Char]) = ???

    /** Creates a password parameter and specifies the protection algorithm
     *  and associated parameters to use when encrypting a keystore entry.
     */
    @stub
    def PasswordProtection(password: Array[Char], protectionAlgorithm: String, protectionParameters: AlgorithmParameterSpec) = ???

    /** Clears the password. */
    @stub
    def destroy(): Unit = ???

    /** Gets the password. */
    @stub
    def getPassword(): Array[Char] = ???

    /** Gets the name of the protection algorithm. */
    @stub
    def getProtectionAlgorithm(): String = ???

    /** Gets the parameters supplied for the protection algorithm. */
    @stub
    def getProtectionParameters(): AlgorithmParameterSpec = ???

    /** Determines if password has been cleared. */
    @stub
    def isDestroyed(): Boolean = ???
}

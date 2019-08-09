package java.security

import java.lang.{Object, String}
import java.security.spec.AlgorithmParameterSpec
import javax.security.auth.Destroyable

/** A password-based implementation of ProtectionParameter. */
object KeyStore.PasswordProtection extends Object with KeyStore.ProtectionParameter with Destroyable {

    /** Creates a password parameter. */
    @stub
    def PasswordProtection(password: Array[Char]) = ???

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
}

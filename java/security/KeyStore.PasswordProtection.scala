package java.security

import java.lang.{Object, String}
import java.security.spec.AlgorithmParameterSpec
import javax.security.auth.Destroyable

// A password-based implementation of ProtectionParameter.
object KeyStore.PasswordProtection extends Object with KeyStore.ProtectionParameter, with Destroyable {

    @stub
    // Creates a password parameter.
    def PasswordProtection(password: Array[Char]) = ???

    @stub
    // Clears the password.
    def destroy(): Unit = ???

    @stub
    // Gets the password.
    def getPassword(): Array[Char] = ???

    @stub
    // Gets the name of the protection algorithm.
    def getProtectionAlgorithm(): String = ???

    @stub
    // Gets the parameters supplied for the protection algorithm.
    def getProtectionParameters(): AlgorithmParameterSpec = ???
}

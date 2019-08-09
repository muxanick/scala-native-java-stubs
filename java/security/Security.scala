package java.security

import java.lang.{Object, String}
import java.util.{Map, Set}

// This class centralizes all security properties and common security
// methods. One of its primary uses is to manage providers.
//
// The default values of security properties are read from an
// implementation-specific location, which is typically the properties file
// lib/security/java.security in the Java installation directory.
final class Security extends Object {
}

object Security {
    @stub
    // Adds a provider to the next position available.
    def addProvider(provider: Provider): Int = ???

    @stub
    // Deprecated. 
    //This method used to return the value of a proprietary
    // property in the master file of the "SUN" Cryptographic Service
    // Provider in order to determine how to parse algorithm-specific
    // parameters. Use the new provider-based and algorithm-independent
    // AlgorithmParameters and KeyFactory engine
    // classes (introduced in the J2SE version 1.2 platform) instead.
    //
    def getAlgorithmProperty(algName: String, propName: String): String = ???

    @stub
    // Returns a Set of Strings containing the names of all available
    // algorithms or types for the specified Java cryptographic service
    // (e.g., Signature, MessageDigest, Cipher, Mac, KeyStore).
    def getAlgorithms(serviceName: String): Set[String] = ???

    @stub
    // Gets a security property value.
    def getProperty(key: String): String = ???

    @stub
    // Returns the provider installed with the specified name, if
    // any.
    def getProvider(name: String): Provider = ???

    @stub
    // Returns an array containing all the installed providers.
    def getProviders(): Array[Provider] = ???

    @stub
    // Returns an array containing all installed providers that satisfy the
    // specified* selection criteria, or null if no such providers have been
    // installed.
    def getProviders(filter: Map[String, String]): Array[Provider] = ???

    @stub
    // Returns an array containing all installed providers that satisfy the
    // specified selection criterion, or null if no such providers have been
    // installed.
    def getProviders(filter: String): Array[Provider] = ???

    @stub
    // Adds a new provider, at a specified position.
    def insertProviderAt(provider: Provider, position: Int): Int = ???

    @stub
    // Removes the provider with the specified name.
    def removeProvider(name: String): Unit = ???
}

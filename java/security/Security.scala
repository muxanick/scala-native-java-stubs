package java.security

import java.lang.{Object, String}
import java.util.{Map, Set}
import scala.scalanative.annotation.stub

/** This class centralizes all security properties and common security
 *  methods. One of its primary uses is to manage providers.
 * 
 *  The default values of security properties are read from an
 *  implementation-specific location, which is typically the properties file
 *  lib/security/java.security in the Java installation directory.
 */
final class Security extends Object {
}

object Security {
    /** Adds a provider to the next position available. */
    @stub
    def addProvider(provider: Provider): Int = ???

    /** Deprecated. 
     * This method used to return the value of a proprietary
     *  property in the master file of the "SUN" Cryptographic Service
     *  Provider in order to determine how to parse algorithm-specific
     *  parameters. Use the new provider-based and algorithm-independent
     *  AlgorithmParameters and KeyFactory engine
     *  classes (introduced in the J2SE version 1.2 platform) instead.
     * 
     */
    @stub
    def getAlgorithmProperty(algName: String, propName: String): String = ???

    /** Returns a Set of Strings containing the names of all available
     *  algorithms or types for the specified Java cryptographic service
     *  (e.g., Signature, MessageDigest, Cipher, Mac, KeyStore).
     */
    @stub
    def getAlgorithms(serviceName: String): Set[String] = ???

    /** Gets a security property value. */
    @stub
    def getProperty(key: String): String = ???

    /** Returns the provider installed with the specified name, if
     *  any.
     */
    @stub
    def getProvider(name: String): Provider = ???

    /** Returns an array containing all the installed providers. */
    @stub
    def getProviders(): Array[Provider] = ???

    /** Returns an array containing all installed providers that satisfy the
     *  specified* selection criteria, or null if no such providers have been
     *  installed.
     */
    @stub
    def getProviders(filter: Map[String, String]): Array[Provider] = ???

    /** Returns an array containing all installed providers that satisfy the
     *  specified selection criterion, or null if no such providers have been
     *  installed.
     */
    @stub
    def getProviders(filter: String): Array[Provider] = ???

    /** Adds a new provider, at a specified position. */
    @stub
    def insertProviderAt(provider: Provider, position: Int): Int = ???

    /** Removes the provider with the specified name. */
    @stub
    def removeProvider(name: String): Unit = ???

    /** Sets a security property value. */
    @stub
    def setProperty(key: String, datum: String): Unit = ???
}

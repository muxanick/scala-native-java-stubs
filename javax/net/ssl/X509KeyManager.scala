package javax.net.ssl

import java.lang.String
import java.net.Socket
import java.security.{Principal, PrivateKey}
import java.security.cert.X509Certificate

// Instances of this interface manage which X509 certificate-based
// key pairs are used to authenticate the local side of a secure
// socket.
// 
// During secure socket negotiations, implentations
// call methods in this interface to:
// 
//  determine the set of aliases that are available for negotiations
//      based on the criteria presented,
//  select the  best alias based on
//      the criteria presented, and
//  obtain the corresponding key material for given aliases.
// 
// 
// Note: the X509ExtendedKeyManager should be used in favor of this
// class.
trait X509KeyManager extends KeyManager {

    @stub
    // Choose an alias to authenticate the client side of a secure
    // socket given the public key type and the list of
    // certificate issuer authorities recognized by the peer (if any).
    def chooseClientAlias(keyType: Array[String], issuers: Array[Principal], socket: Socket): String = ???

    @stub
    // Choose an alias to authenticate the server side of a secure
    // socket given the public key type and the list of
    // certificate issuer authorities recognized by the peer (if any).
    def chooseServerAlias(keyType: String, issuers: Array[Principal], socket: Socket): String = ???

    @stub
    // Returns the certificate chain associated with the given alias.
    def getCertificateChain(alias: String): Array[X509Certificate] = ???

    @stub
    // Get the matching aliases for authenticating the client side of a secure
    // socket given the public key type and the list of
    // certificate issuer authorities recognized by the peer (if any).
    def getClientAliases(keyType: String, issuers: Array[Principal]): Array[String] = ???

    @stub
    // Returns the key associated with the given alias.
    def getPrivateKey(alias: String): PrivateKey = ???
}
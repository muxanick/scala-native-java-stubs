package org.ietf.jgss

import java.lang.{Object, String}
import java.security.Provider

// This class serves as a factory for other important
// GSS-API classes and also provides information about the mechanisms that
// are supported. It can create instances of classes
// implementing the following three GSS-API interfaces: GSSName, GSSCredential, and GSSContext. It also has methods to query for the list
// of available mechanisms and the nametypes that each mechanism
// supports.
//
// An instance of the default GSSManager subclass
// may be obtained through the static method getInstance, but applications are free to instantiate other subclasses
// of GSSManager. The default GSSManager instance
// will support the Kerberos v5 GSS-API mechanism in addition to any
// others. This mechanism is identified by the Oid "1.2.840.113554.1.2.2"
// and is defined in RFC 1964.
//
// A subclass extending the GSSManager abstract class may be
// implemented  as a modular provider based layer that utilizes some well
// known  service provider specification. The GSSManager API
// allows the application to set provider preferences on
// such an implementation. These methods also allow the implementation to
// throw a well-defined exception in case provider based configuration is
// not supported. Applications that expect to be portable should be aware
// of this and recover cleanly by catching the exception.
//
// It is envisioned that there will be three most common ways in which
// providers will be used:
// 
//  The application does not care about what provider is used (the
// default case).
//  The application wants a particular provider to be used
// preferentially, either for a particular mechanism or all the
// time, irrespective of mechanism.
//  The application wants to use the locally configured providers
// as far as possible but if support is missing for one or more
// mechanisms then it wants to fall back on its own provider.
//
//
// The GSSManager class has two methods that enable these modes of
// usage:  addProviderAtFront and
// addProviderAtEnd. These methods
// have the effect of creating an ordered list of <provider,
// oid> pairs  where each pair indicates a preference of provider
// for a given oid.
//
// It is important to note that there are certain interactions
// between the different GSS-API objects that are created by a
// GSSManager, where the provider that is used for a particular mechanism
// might need to be consistent across all objects. For instance, if a
// GSSCredential contains elements from a provider p for a mechanism
// m, it should generally be passed in to a GSSContext that will use
// provider p for the mechanism m. A simple rule of thumb
// that will maximize portability is that objects created from different
// GSSManager's should not be mixed, and if possible, a different
// GSSManager instance should be created if the application wants to invoke
// the addProviderAtFront method on a GSSManager that has
// already created an object.
//
//  Here is some sample code showing how the GSSManager might be used: 
// 
//     GSSManager manager = GSSManager.getInstance();
//
//     Oid krb5Mechanism = new Oid("1.2.840.113554.1.2.2");
//     Oid krb5PrincipalNameType = new Oid("1.2.840.113554.1.2.2.1");
//
//     // Identify who the client wishes to be
//     GSSName userName = manager.createName("duke", GSSName.NT_USER_NAME);
//
//     // Identify the name of the server. This uses a Kerberos specific
//     // name format.
//     GSSName serverName = manager.createName("nfs/foo.sun.com",
//                                             krb5PrincipalNameType);
//
//     // Acquire credentials for the user
//     GSSCredential userCreds = manager.createCredential(userName,
//                                             GSSCredential.DEFAULT_LIFETIME,
//                                             krb5Mechanism,
//                                             GSSCredential.INITIATE_ONLY);
//
//     // Instantiate and initialize a security context that will be
//     // established with the server
//     GSSContext context = manager.createContext(serverName,
//                                                krb5Mechanism,
//                                                userCreds,
//                                                GSSContext.DEFAULT_LIFETIME);
// 
//
// The server side might use the following variation of this source:
//
// 
//     // Acquire credentials for the server
//     GSSCredential serverCreds = manager.createCredential(serverName,
//                                             GSSCredential.DEFAULT_LIFETIME,
//                                             krb5Mechanism,
//                                             GSSCredential.ACCEPT_ONLY);
//
//     // Instantiate and initialize a security context that will
//     // wait for an establishment request token from the client
//     GSSContext context = manager.createContext(serverCreds);
// 
abstract class GSSManager extends Object {

    // This method is used to indicate to the GSSManager that the
    // application would like a particular provider to be used if no other
    // provider can be found that supports the given mechanism.
    def addProviderAtEnd(p: Provider, mech: Oid): Unit

    // This method is used to indicate to the GSSManager that the
    // application would like a particular provider to be used ahead of all
    // others when support is desired for the given mechanism.
    def addProviderAtFront(p: Provider, mech: Oid): Unit

    // Factory method for creating a previously exported context.
    def createContext(interProcessToken: Array[Byte]): GSSContext

    // Factory method for creating a context on the acceptor' side.
    def createContext(myCred: GSSCredential): GSSContext

    // Factory method for creating a context on the initiator's
    // side.
    def createContext(peer: GSSName, mech: Oid, myCred: GSSCredential, lifetime: Int): GSSContext

    // Factory method for acquiring credentials over a set of
    // mechanisms.
    def createCredential(name: GSSName, lifetime: Int, mechs: Array[Oid], usage: Int): GSSCredential

    // Factory method for acquiring a single mechanism credential.
    def createCredential(name: GSSName, lifetime: Int, mech: Oid, usage: Int): GSSCredential

    // Factory method for acquiring default credentials.
    def createCredential(usage: Int): GSSCredential

    // Factory method to convert a byte array containing a
    // name from the specified namespace to a GSSName object.
    def createName(name: Array[Byte], nameType: Oid): GSSName

    // Factory method to convert a byte array containing a
    // name from the specified namespace to a GSSName object and canonicalize
    // it at the same time for a mechanism.
    def createName(name: Array[Byte], nameType: Oid, mech: Oid): GSSName

    // Factory method to convert a string name from the
    // specified namespace to a GSSName object.
    def createName(nameStr: String, nameType: Oid): GSSName

    // Factory method to convert a string name from the
    // specified namespace to a GSSName object and canonicalize it at the
    // same time for a mechanism.
    def createName(nameStr: String, nameType: Oid, mech: Oid): GSSName

    // Returns a list of mechanisms that are available to GSS-API callers
    // through this GSSManager.
    def getMechs(): Array[Oid]

    // Returns a list of mechanisms that support the indicated name type.
    def getMechsForName(nameType: Oid): Array[Oid]
}

object GSSManager {
    @stub
    // Returns the default GSSManager implementation.
    def getInstance(): GSSManager = ???
}

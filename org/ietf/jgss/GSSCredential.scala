package org.ietf.jgss

import java.lang.{Cloneable, Object}

// This interface encapsulates the GSS-API credentials for an entity.  A
// credential contains all the necessary cryptographic information to
// enable the creation of a context on behalf of the entity that it
// represents.  It may contain multiple, distinct, mechanism specific
// credential elements, each containing information for a specific
// security mechanism, but all referring to the same entity. A credential
// may be used to perform context initiation, acceptance, or both.
//
// Credentials are instantiated using one of the
// createCredential methods in the GSSManager class. GSS-API credential creation is not
// intended to provide a "login to the network" function, as such a
// function would involve the creation of new credentials rather than
// merely acquiring a handle to existing credentials. The
// section on credential
// acquisition in the package level description describes
// how existing credentials are acquired in the Java platform. GSS-API
// implementations must impose a local access-control policy on callers to
// prevent unauthorized callers from acquiring credentials to which they
// are not entitled. 
//
// Applications will create a credential object passing the desired
// parameters.  The application can then use the query methods to obtain
// specific information about the instantiated credential object.
// When the credential is no longer needed, the application should call
// the dispose method to release any resources held by
// the credential object and to destroy any cryptographically sensitive
// information.
//
// This example code demonstrates the creation of a GSSCredential
// implementation for a specific entity, querying of its fields, and its
// release when it is no longer needed:
// 
//    GSSManager manager = GSSManager.getInstance();
//
//    // start by creating a name object for the entity
//    GSSName name = manager.createName("myusername", GSSName.NT_USER_NAME);
//
//    // now acquire credentials for the entity
//    GSSCredential cred = manager.createCredential(name,
//                    GSSCredential.ACCEPT_ONLY);
//
//    // display credential information - name, remaining lifetime,
//    // and the mechanisms it has been acquired over
//    System.out.println(cred.getName().toString());
//    System.out.println(cred.getRemainingLifetime());
//
//    Oid [] mechs = cred.getMechs();
//    if (mechs != null) {
//            for (int i = 0; i < mechs.length; i++)
//                    System.out.println(mechs[i].toString());
//    }
//
//    // release system resources held by the credential
//    cred.dispose();
// 
trait GSSCredential extends Cloneable {

    @stub
    // Adds a mechanism specific credential-element to an existing
    // credential.
    def add(name: GSSName, initLifetime: Int, acceptLifetime: Int, mech: Oid, usage: Int): Unit = ???

    @stub
    // Releases any sensitive information that the GSSCredential object may
    // be containing.
    def dispose(): Unit = ???

    @stub
    // Tests if this GSSCredential asserts the same entity as the supplied
    // object.
    def equals(another: Object): Boolean = ???

    @stub
    // Returns a list of mechanisms supported by this credential.
    def getMechs(): Array[Oid] = ???

    @stub
    // Retrieves the name of the entity that the credential asserts.
    def getName(): GSSName = ???

    @stub
    // Retrieves a Mechanism Name of the entity that the credential
    // asserts.
    def getName(mech: Oid): GSSName = ???

    @stub
    // Returns the lifetime in seconds for the credential to remain capable
    // of accepting security contexts using the specified mechanism.
    def getRemainingAcceptLifetime(mech: Oid): Int = ???

    @stub
    // Returns the lifetime in seconds for the credential to remain capable
    // of initiating security contexts using the specified mechanism.
    def getRemainingInitLifetime(mech: Oid): Int = ???

    @stub
    // Returns the remaining lifetime in seconds for a credential.
    def getRemainingLifetime(): Int = ???

    @stub
    // Returns the credential usage mode.
    def getUsage(): Int = ???

    @stub
    // Returns the credential usage mode for a specific mechanism.
    def getUsage(mech: Oid): Int = ???
}

object GSSCredential {
    @stub
    // Credential usage flag requesting that it be usable
    // for context acceptance only.
    def ACCEPT_ONLY: Int = ???

    @stub
    // A lifetime constant representing the default credential lifetime.
    def DEFAULT_LIFETIME: Int = ???

    @stub
    // A lifetime constant representing indefinite credential lifetime.
    def INDEFINITE_LIFETIME: Int = ???

    @stub
    // Credential usage flag requesting that it be usable
    // for both context initiation and acceptance.
    def INITIATE_AND_ACCEPT: Int = ???
}

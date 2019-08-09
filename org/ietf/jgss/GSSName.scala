package org.ietf.jgss

import java.lang.Object

// This interface encapsulates a single GSS-API principal entity. The
// application obtains an implementation of this interface
// through one of the createName methods that exist in the GSSManager class. Conceptually a GSSName contains many
// representations of the entity or many primitive name elements, one for
// each supported underlying mechanism. In GSS terminology, a GSSName that
// contains an element from just one mechanism is called a Mechanism Name
// (MN)
//
// Since different authentication mechanisms may employ different
// namespaces for identifying their principals, GSS-API's naming support is
// necessarily complex in multi-mechanism environments (or even in some
// single-mechanism environments where the underlying mechanism supports
// multiple namespaces). Different name formats and their definitions are
// identified with Oid's and some standard types
// are defined in this interface. The format of the names can be derived
// based on the unique Oid of its name type.
//
// Included below are code examples utilizing the GSSName interface.
// The code below creates a GSSName, converts it to an MN, performs a
// comparison, obtains a printable representation of the name, exports it
// to a byte array and then re-imports to obtain a
// new GSSName.
// 
//      GSSManager manager = GSSManager.getInstance();
//
//      // create a host based service name
//      GSSName name = manager.createName("service@host",
//                   GSSName.NT_HOSTBASED_SERVICE);
//
//      Oid krb5 = new Oid("1.2.840.113554.1.2.2");
//
//      GSSName mechName = name.canonicalize(krb5);
//
//      // the above two steps are equivalent to the following
//      GSSName mechName = manager.createName("service@host",
//                      GSSName.NT_HOSTBASED_SERVICE, krb5);
//
//      // perform name comparison
//      if (name.equals(mechName))
//              print("Names are equals.");
//
//      // obtain textual representation of name and its printable
//      // name type
//      print(mechName.toString() +
//                      mechName.getStringNameType().toString());
//
//      // export and re-import the name
//      byte [] exportName = mechName.export();
//
//      // create a new name object from the exported buffer
//      GSSName newName = manager.createName(exportName,
//                      GSSName.NT_EXPORT_NAME);
//
// 
trait GSSName {

    @stub
    // Creates a name that is canonicalized for some
    // mechanism.
    def canonicalize(mech: Oid): GSSName = ???

    @stub
    // Compares two GSSName objects to determine if they refer to the
    // same entity.
    def equals(another: GSSName): Boolean = ???

    @stub
    // Compares this GSSName object to another Object that might be a
    // GSSName.
    def equals(another: Object): Boolean = ???

    @stub
    // Returns a canonical contiguous byte representation of a mechanism name
    // (MN), suitable for direct, byte by byte comparison by authorization
    // functions.
    def export(): Array[Byte] = ???

    @stub
    // Returns the name type of the printable
    // representation of this name that can be obtained from the 
    // toString method.
    def getStringNameType(): Oid = ???

    @stub
    // Returns a hashcode value for this GSSName.
    def hashCode(): Int = ???

    @stub
    // Tests if this name object represents an anonymous entity.
    def isAnonymous(): Boolean = ???

    @stub
    // Tests if this name object represents a Mechanism Name (MN).
    def isMN(): Boolean = ???
}

object GSSName {
    @stub
    // Name type for representing an anonymous entity.
    def NT_ANONYMOUS: Oid = ???

    @stub
    // Name type used to indicate an exported name produced by the export
    // method.
    def NT_EXPORT_NAME: Oid = ???

    @stub
    // Oid indicating a host-based service name form.
    def NT_HOSTBASED_SERVICE: Oid = ???

    @stub
    // Name type to indicate a numeric user identifier corresponding to a
    // user on a local system.
    def NT_MACHINE_UID_NAME: Oid = ???

    @stub
    // Name type to indicate a string of digits representing the numeric
    // user identifier of a user on a local system.
    def NT_STRING_UID_NAME: Oid = ???
}

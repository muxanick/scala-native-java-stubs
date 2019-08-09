package java.rmi.server

import java.io.{ObjectInput, Serializable}
import java.lang.{Object, String}

// An ObjID is used to identify a remote object exported
// to an RMI runtime.  When a remote object is exported, it is assigned
// an object identifier either implicitly or explicitly, depending on
// the API used to export.
//
// The ObjID() constructor can be used to generate a unique
// object identifier.  Such an ObjID is unique over time
// with respect to the host it is generated on.
//
// The ObjID(int) constructor can be used to create a
// "well-known" object identifier.  The scope of a well-known
// ObjID depends on the RMI runtime it is exported to.
//
// An ObjID instance contains an object number (of type
// long) and an address space identifier (of type
// UID).  In a unique ObjID, the address space
// identifier is unique with respect to a given host over time.  In a
// well-known ObjID, the address space identifier is
// equivalent to one returned by invoking the UID.UID(short)
// constructor with the value zero.
//
// If the system property java.rmi.server.randomIDs
// is defined to equal the string "true" (case insensitive),
// then the ObjID() constructor will use a cryptographically
// strong random number generator to choose the object number of the
// returned ObjID.
final class ObjID extends Object with Serializable {

    @stub
    // Generates a unique object identifier.
    def this() = ???

    @stub
    // Compares the specified object with this ObjID for
    // equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the hash code value for this object identifier, the
    // object number.
    def hashCode(): Int = ???

    @stub
    // Returns a string representation of this object identifier.
    def toString(): String = ???
}

object ObjID {
    @stub
    // Object number for well-known ObjID of the activator.
    def ACTIVATOR_ID: Int = ???

    @stub
    // Object number for well-known ObjID of
    // the distributed garbage collector.
    def DGC_ID: Int = ???

    @stub
    // Constructs and returns a new ObjID instance by
    // unmarshalling a binary representation from an
    // ObjectInput instance.
    def read(in: ObjectInput): ObjID = ???
}
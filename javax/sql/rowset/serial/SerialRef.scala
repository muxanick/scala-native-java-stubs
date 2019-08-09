package javax.sql.rowset.serial

import java.io.Serializable
import java.lang.{Class, Cloneable, Object, String}
import java.sql.Ref
import java.util.Map

// A serialized mapping of a Ref object, which is the mapping in the
// Java programming language of an SQL REF value.
// 
// The SerialRef class provides a constructor  for
// creating a SerialRef instance from a Ref
// object and provides methods for getting and setting the Ref object.
//
//  Thread safety 
//
// A SerialRef is not safe for use by multiple concurrent threads.  If a
// SerialRef is to be used by more than one thread then access to the SerialRef
// should be controlled by appropriate synchronization.
class SerialRef extends Object with Ref, with Serializable, with Cloneable {

    @stub
    // Returns a clone of this SerialRef.
    def clone(): Object = ???

    @stub
    // Compares this SerialRef to the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns a string describing the base type name of the Ref.
    def getBaseTypeName(): String = ???

    @stub
    // Returns an Object representing the SQL structured type
    // to which this SerialRef object refers.
    def getObject(): Object = ???

    @stub
    // Returns an Object representing the SQL structured type
    // to which this SerialRef object refers.
    def getObject(map: Map[String, Class[_]]): Object = ???

    @stub
    // Returns a hash code for this SerialRef.
    def hashCode(): Int = ???
}

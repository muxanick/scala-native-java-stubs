package javax.sql.rowset.serial

import java.io.Serializable
import java.lang.{Cloneable, Object}
import java.lang.reflect.Field

// A serializable mapping in the Java programming language of an SQL
// JAVA_OBJECT value. Assuming the Java object
// implements the Serializable interface, this class simply wraps the
// serialization process.
// 
// If however, the serialization is not possible because
// the Java object is not immediately serializable, this class will
// attempt to serialize all non-static members to permit the object
// state to be serialized.
// Static or transient fields cannot be serialized; an attempt to serialize
// them will result in a SerialException object being thrown.
//
//  Thread safety 
//
// A SerialJavaObject is not safe for use by multiple concurrent threads.  If a
// SerialJavaObject is to be used by more than one thread then access to the
// SerialJavaObject should be controlled by appropriate synchronization.
class SerialJavaObject extends Object with Serializable, with Cloneable {

    @stub
    // Returns a clone of this SerialJavaObject.
    def clone(): Object = ???

    @stub
    // Compares this SerialJavaObject to the specified object.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns an array of Field objects that contains each
    // field of the object that this helper class is serializing.
    def getFields(): Array[Field] = ???

    @stub
    // Returns an Object that is a copy of this SerialJavaObject
    // object.
    def getObject(): Object = ???
}

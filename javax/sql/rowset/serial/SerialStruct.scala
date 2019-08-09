package javax.sql.rowset.serial

import java.io.Serializable
import java.lang.{Class, Cloneable, Object, String}
import java.sql.{SQLData, Struct}
import java.util.Map

// A serialized mapping in the Java programming language of an SQL
// structured type. Each attribute that is not already serialized
// is mapped to a serialized form, and if an attribute is itself
// a structured type, each of its attributes that is not already
// serialized is mapped to a serialized form.
// 
// In addition, the structured type is custom mapped to a class in the
// Java programming language if there is such a mapping, as are
// its attributes, if appropriate.
// 
// The SerialStruct class provides a constructor for creating
// an instance from a Struct object, a method for retrieving
// the SQL type name of the SQL structured type in the database, and methods
// for retrieving its attribute values.
//
//  Thread safety 
//
// A SerialStruct is not safe for use by multiple concurrent threads.  If a
// SerialStruct is to be used by more than one thread then access to the
// SerialStruct should be controlled by appropriate synchronization.
class SerialStruct extends Object with Struct, with Serializable, with Cloneable {

    @stub
    // Constructs a SerialStruct object from the
    // given SQLData object, using the given type
    // map to custom map it to a class in the Java programming
    // language.
    def this(in: SQLData, map: Map[String, Class[_]]) = ???

    @stub
    // Returns a clone of this SerialStruct.
    def clone(): Object = ???

    @stub
    // Compares this SerialStruct to the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Retrieves an array of Object values containing the
    // attributes of the SQL structured type that this
    // SerialStruct object represents.
    def getAttributes(): Array[Object] = ???

    @stub
    // Retrieves the attributes for the SQL structured type that
    // this SerialStruct represents as an array of
    // Object values, using the given type map for
    // custom mapping if appropriate.
    def getAttributes(map: Map[String, Class[_]]): Array[Object] = ???

    @stub
    // Retrieves the SQL type name for this SerialStruct
    // object.
    def getSQLTypeName(): String = ???
}

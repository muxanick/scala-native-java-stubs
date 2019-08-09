package javax.sql.rowset.serial

import java.io.Serializable
import java.lang.{Class, Cloneable, Object, String}
import java.sql.{Array, ResultSet}
import java.util.Map

// A serialized version of an Array
// object, which is the mapping in the Java programming language of an SQL
// ARRAY value.
// 
// The SerialArray class provides a constructor for creating
// a SerialArray instance from an Array object,
// methods for getting the base type and the SQL name for the base type, and
// methods for copying all or part of a SerialArray object.
// 
//
// Note: In order for this class to function correctly, a connection to the
// data source
// must be available in order for the SQL Array object to be
// materialized (have all of its elements brought to the client server)
// if necessary. At this time, logical pointers to the data in the data source,
// such as locators, are not currently supported.
//
//  Thread safety 
//
// A SerialArray is not safe for use by multiple concurrent threads.  If a
// SerialArray is to be used by more than one thread then access to the
// SerialArray should be controlled by appropriate synchronization.
class SerialArray extends Object with Array, with Serializable, with Cloneable {

    @stub
    // Constructs a new SerialArray object from the given
    // Array object.
    def this(array: Array) = ???

    @stub
    // Returns a clone of this SerialArray.
    def clone(): Object = ???

    @stub
    // Compares this SerialArray to the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // This method frees the SeriableArray object and releases the
    // resources that it holds.
    def free(): Unit = ???

    @stub
    // Returns a new array that is a copy of this SerialArray
    // object.
    def getArray(): Object = ???

    @stub
    // Returns a new array that is a copy of a slice
    // of this SerialArray object, starting with the
    // element at the given index and containing the given number
    // of consecutive elements.
    def getArray(index: Long, count: Int): Object = ???

    @stub
    // Returns a new array that is a copy of a slice
    // of this SerialArray object, starting with the
    // element at the given index and containing the given number
    // of consecutive elements.
    def getArray(index: Long, count: Int, map: Map[String, Class[_]]): Object = ???

    @stub
    // Returns a new array that is a copy of this SerialArray
    // object, using the given type map for the custom
    // mapping of each element when the elements are SQL UDTs.
    def getArray(map: Map[String, Class[_]]): Object = ???

    @stub
    // Retrieves the SQL type of the elements in this SerialArray
    // object.
    def getBaseType(): Int = ???

    @stub
    // Retrieves the DBMS-specific type name for the elements in this
    // SerialArray object.
    def getBaseTypeName(): String = ???

    @stub
    // Retrieves a ResultSet object that contains all of
    // the elements in the ARRAY value that this
    // SerialArray object represents.
    def getResultSet(): ResultSet = ???

    @stub
    // Retrieves a ResultSet object holding the elements of
    // the subarray that starts at
    // index index and contains up to count successive elements.
    def getResultSet(index: Long, count: Int): ResultSet = ???

    @stub
    // Retrieves a result set holding the elements of the subarray that starts at
    // Retrieves a ResultSet object that contains a subarray of the
    // elements in this SerialArray object, starting at
    // index index and containing up to count successive
    // elements.
    def getResultSet(index: Long, count: Int, map: Map[String, Class[_]]): ResultSet = ???

    @stub
    // Retrieves a ResultSet object that contains all of
    // the elements of the SQL ARRAY
    // value represented by this SerialArray object.
    def getResultSet(map: Map[String, Class[_]]): ResultSet = ???
}

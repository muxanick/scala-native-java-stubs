package java.sql

import java.lang.{Class, Object, String}
import java.util.Map

// The mapping in the Java programming language for the SQL type
// ARRAY.
// By default, an Array value is a transaction-duration
// reference to an SQL ARRAY value.  By default, an Array
// object is implemented using an SQL LOCATOR(array) internally, which
// means that an Array object contains a logical pointer
// to the data in the SQL ARRAY value rather
// than containing the ARRAY value's data.
// 
// The Array interface provides methods for bringing an SQL
// ARRAY value's data to the client as either an array or a
// ResultSet object.
// If the elements of the SQL ARRAY
// are a UDT, they may be custom mapped.  To create a custom mapping,
// a programmer must do two things:
// 
// create a class that implements the SQLData
// interface for the UDT to be custom mapped.
// make an entry in a type map that contains
//   
//   the fully-qualified SQL type name of the UDT
//   the Class object for the class implementing
//       SQLData
//   
// 
// 
// When a type map with an entry for
// the base type is supplied to the methods getArray
// and getResultSet, the mapping
// it contains will be used to map the elements of the ARRAY value.
// If no type map is supplied, which would typically be the case,
// the connection's type map is used by default.
// If the connection's type map or a type map supplied to a method has no entry
// for the base type, the elements are mapped according to the standard mapping.
// 
// All methods on the Array interface must be fully implemented if the
// JDBC driver supports the data type.
trait Array {

    @stub
    // This method frees the Array object and releases the resources that
    // it holds.
    def free(): Unit = ???

    @stub
    // Retrieves the contents of the SQL ARRAY value designated
    // by this
    // Array object in the form of an array in the Java
    // programming language.
    def getArray(): Object = ???

    @stub
    // Retrieves a slice of the SQL ARRAY
    // value designated by this Array object, beginning with the
    // specified index and containing up to count
    // successive elements of the SQL array.
    def getArray(index: Long, count: Int): Object = ???

    @stub
    // Retreives a slice of the SQL ARRAY value
    // designated by this Array object, beginning with the specified
    // index and containing up to count
    // successive elements of the SQL array.
    def getArray(index: Long, count: Int, map: Map[String, Class[_]]): Object = ???

    @stub
    // Retrieves the contents of the SQL ARRAY value designated by this
    // Array object.
    def getArray(map: Map[String, Class[_]]): Object = ???

    @stub
    // Retrieves the JDBC type of the elements in the array designated
    // by this Array object.
    def getBaseType(): Int = ???

    @stub
    // Retrieves the SQL type name of the elements in
    // the array designated by this Array object.
    def getBaseTypeName(): String = ???

    @stub
    // Retrieves a result set that contains the elements of the SQL
    // ARRAY value
    // designated by this Array object.
    def getResultSet(): ResultSet = ???

    @stub
    // Retrieves a result set holding the elements of the subarray that
    // starts at index index and contains up to
    // count successive elements.
    def getResultSet(index: Long, count: Int): ResultSet = ???

    @stub
    // Retrieves a result set holding the elements of the subarray that
    // starts at index index and contains up to
    // count successive elements.
    def getResultSet(index: Long, count: Int, map: Map[String, Class[_]]): ResultSet = ???
}

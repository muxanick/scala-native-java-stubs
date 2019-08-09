package javax.sql.rowset.serial

import java.io.Serializable
import java.lang.{Class, Cloneable, Object, String}
import java.sql.{Array, ResultSet}
import java.util.Map
import scala.scalanative.annotation.stub

/** A serialized version of an Array
 *  object, which is the mapping in the Java programming language of an SQL
 *  ARRAY value.
 *  
 *  The SerialArray class provides a constructor for creating
 *  a SerialArray instance from an Array object,
 *  methods for getting the base type and the SQL name for the base type, and
 *  methods for copying all or part of a SerialArray object.
 *  
 * 
 *  Note: In order for this class to function correctly, a connection to the
 *  data source
 *  must be available in order for the SQL Array object to be
 *  materialized (have all of its elements brought to the client server)
 *  if necessary. At this time, logical pointers to the data in the data source,
 *  such as locators, are not currently supported.
 * 
 *   Thread safety 
 * 
 *  A SerialArray is not safe for use by multiple concurrent threads.  If a
 *  SerialArray is to be used by more than one thread then access to the
 *  SerialArray should be controlled by appropriate synchronization.
 */
class SerialArray extends Object with Array with Serializable with Cloneable {

    /** Constructs a new SerialArray object from the given
     *  Array object.
     */
    @stub
    def this(array: Array) = ???

    /** Constructs a new SerialArray object from the given
     *  Array object, using the given type map for the custom
     *  mapping of each element when the elements are SQL UDTs.
     */
    @stub
    def this(array: Array, map: Map[String, Class[_]]) = ???

    /** Returns a clone of this SerialArray. */
    @stub
    def clone(): Object = ???

    /** Compares this SerialArray to the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** This method frees the SeriableArray object and releases the
     *  resources that it holds.
     */
    @stub
    def free(): Unit = ???

    /** Returns a new array that is a copy of this SerialArray
     *  object.
     */
    @stub
    def getArray(): Object = ???

    /** Returns a new array that is a copy of a slice
     *  of this SerialArray object, starting with the
     *  element at the given index and containing the given number
     *  of consecutive elements.
     */
    @stub
    def getArray(index: Long, count: Int): Object = ???

    /** Returns a new array that is a copy of a slice
     *  of this SerialArray object, starting with the
     *  element at the given index and containing the given number
     *  of consecutive elements.
     */
    @stub
    def getArray(index: Long, count: Int, map: Map[String, Class[_]]): Object = ???

    /** Returns a new array that is a copy of this SerialArray
     *  object, using the given type map for the custom
     *  mapping of each element when the elements are SQL UDTs.
     */
    @stub
    def getArray(map: Map[String, Class[_]]): Object = ???

    /** Retrieves the SQL type of the elements in this SerialArray
     *  object.
     */
    @stub
    def getBaseType(): Int = ???

    /** Retrieves the DBMS-specific type name for the elements in this
     *  SerialArray object.
     */
    @stub
    def getBaseTypeName(): String = ???

    /** Retrieves a ResultSet object that contains all of
     *  the elements in the ARRAY value that this
     *  SerialArray object represents.
     */
    @stub
    def getResultSet(): ResultSet = ???

    /** Retrieves a ResultSet object holding the elements of
     *  the subarray that starts at
     *  index index and contains up to count successive elements.
     */
    @stub
    def getResultSet(index: Long, count: Int): ResultSet = ???

    /** Retrieves a result set holding the elements of the subarray that starts at
     *  Retrieves a ResultSet object that contains a subarray of the
     *  elements in this SerialArray object, starting at
     *  index index and containing up to count successive
     *  elements.
     */
    @stub
    def getResultSet(index: Long, count: Int, map: Map[String, Class[_]]): ResultSet = ???

    /** Retrieves a ResultSet object that contains all of
     *  the elements of the SQL ARRAY
     *  value represented by this SerialArray object.
     */
    @stub
    def getResultSet(map: Map[String, Class[_]]): ResultSet = ???

    /** Returns a hash code for this SerialArray. */
    @stub
    def hashCode(): Int = ???
}

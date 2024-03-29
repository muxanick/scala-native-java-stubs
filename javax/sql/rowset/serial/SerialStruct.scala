package javax.sql.rowset.serial

import java.io.Serializable
import java.lang.{Class, Cloneable, Object, String}
import java.sql.{SQLData, Struct}
import java.util.Map
import scala.scalanative.annotation.stub

/** A serialized mapping in the Java programming language of an SQL
 *  structured type. Each attribute that is not already serialized
 *  is mapped to a serialized form, and if an attribute is itself
 *  a structured type, each of its attributes that is not already
 *  serialized is mapped to a serialized form.
 *  
 *  In addition, the structured type is custom mapped to a class in the
 *  Java programming language if there is such a mapping, as are
 *  its attributes, if appropriate.
 *  
 *  The SerialStruct class provides a constructor for creating
 *  an instance from a Struct object, a method for retrieving
 *  the SQL type name of the SQL structured type in the database, and methods
 *  for retrieving its attribute values.
 * 
 *   Thread safety 
 * 
 *  A SerialStruct is not safe for use by multiple concurrent threads.  If a
 *  SerialStruct is to be used by more than one thread then access to the
 *  SerialStruct should be controlled by appropriate synchronization.
 */
class SerialStruct extends Object with Struct with Serializable with Cloneable {

    /** Constructs a SerialStruct object from the
     *  given SQLData object, using the given type
     *  map to custom map it to a class in the Java programming
     *  language.
     */
    @stub
    def this(in: SQLData, map: Map[String, Class[_]]) = ???

    /** Constructs a SerialStruct object from the given
     *  Struct object, using the given java.util.Map
     *  object for custom mapping the SQL structured type or any of its
     *  attributes that are SQL structured types.
     */
    @stub
    def this(in: Struct, map: Map[String, Class[_]]) = ???

    /** Returns a clone of this SerialStruct. */
    @stub
    def clone(): Any = ???

    /** Compares this SerialStruct to the specified object. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Retrieves an array of Object values containing the
     *  attributes of the SQL structured type that this
     *  SerialStruct object represents.
     */
    @stub
    def getAttributes(): Array[Object] = ???

    /** Retrieves the attributes for the SQL structured type that
     *  this SerialStruct represents as an array of
     *  Object values, using the given type map for
     *  custom mapping if appropriate.
     */
    @stub
    def getAttributes(map: Map[String, Class[_]]): Array[Object] = ???

    /** Retrieves the SQL type name for this SerialStruct
     *  object.
     */
    @stub
    def getSQLTypeName(): String = ???

    /** Returns a hash code for this SerialStruct. */
    @stub
    def hashCode(): Int = ???
}

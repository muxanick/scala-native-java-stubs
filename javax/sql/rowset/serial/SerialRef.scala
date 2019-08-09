package javax.sql.rowset.serial

import java.io.Serializable
import java.lang.{Class, Cloneable, Object, String}
import java.sql.Ref
import java.util.Map

/** A serialized mapping of a Ref object, which is the mapping in the
 *  Java programming language of an SQL REF value.
 *  
 *  The SerialRef class provides a constructor  for
 *  creating a SerialRef instance from a Ref
 *  object and provides methods for getting and setting the Ref object.
 * 
 *   Thread safety 
 * 
 *  A SerialRef is not safe for use by multiple concurrent threads.  If a
 *  SerialRef is to be used by more than one thread then access to the SerialRef
 *  should be controlled by appropriate synchronization.
 */
class SerialRef extends Object with Ref with Serializable with Cloneable {

    /** Returns a clone of this SerialRef. */
    @stub
    def clone(): Object = ???

    /** Compares this SerialRef to the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns a string describing the base type name of the Ref. */
    @stub
    def getBaseTypeName(): String = ???

    /** Returns an Object representing the SQL structured type
     *  to which this SerialRef object refers.
     */
    @stub
    def getObject(): Object = ???

    /** Returns an Object representing the SQL structured type
     *  to which this SerialRef object refers.
     */
    @stub
    def getObject(map: Map[String, Class[_]]): Object = ???

    /** Returns a hash code for this SerialRef. */
    @stub
    def hashCode(): Int = ???
}

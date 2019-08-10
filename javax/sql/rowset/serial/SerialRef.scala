package javax.sql.rowset.serial

import java.io.Serializable
import java.lang.{Class, Cloneable, Object, String}
import java.sql.Ref
import java.util.Map
import scala.scalanative.annotation.stub

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

    /** Constructs a SerialRef object from the given Ref
     *  object.
     */
    @stub
    def this(ref: Ref) = ???

    /** Returns a clone of this SerialRef. */
    @stub
    def clone(): Any = ???

    /** Compares this SerialRef to the specified object. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns a string describing the base type name of the Ref. */
    @stub
    def getBaseTypeName(): String = ???

    /** Returns an Object representing the SQL structured type
     *  to which this SerialRef object refers.
     */
    @stub
    def getObject(): Any = ???

    /** Returns an Object representing the SQL structured type
     *  to which this SerialRef object refers.
     */
    @stub
    def getObject(map: Map[String, Class[_]]): Any = ???

    /** Returns a hash code for this SerialRef. */
    @stub
    def hashCode(): Int = ???

    /** Sets the SQL structured type that this SerialRef object
     *  references to the given Object object.
     */
    @stub
    def setObject(obj: Any): Unit = ???
}

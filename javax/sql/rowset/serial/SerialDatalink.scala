package javax.sql.rowset.serial

import java.io.Serializable
import java.lang.{Cloneable, Object}
import java.net.URL
import scala.scalanative.annotation.stub

/** A serialized mapping in the Java programming language of an SQL
 *  DATALINK value. A DATALINK value
 *  references a file outside of the underlying data source that the
 *  data source manages.
 *  
 *  RowSet implementations can use the method RowSet.getURL
 *  to retrieve a java.net.URL object, which can be used
 *  to manipulate the external data.
 *  
 *       java.net.URL url = rowset.getURL(1);
 *  
 * 
 *   Thread safety 
 * 
 *  A SerialDatalink is not safe for use by multiple concurrent threads.  If a
 *  SerialDatalink is to be used by more than one thread then access to the
 *  SerialDatalink should be controlled by appropriate synchronization.
 */
class SerialDatalink extends Object with Serializable with Cloneable {

    /** Constructs a new SerialDatalink object from the given
     *  java.net.URL object.
     */
    @stub
    def this(url: URL) = ???

    /** Returns a clone of this SerialDatalink. */
    @stub
    def clone(): Any = ???

    /** Compares this SerialDatalink to the specified object. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns a new URL that is a copy of this SerialDatalink
     *  object.
     */
    @stub
    def getDatalink(): URL = ???

    /** Returns a hash code for this SerialDatalink. */
    @stub
    def hashCode(): Int = ???
}

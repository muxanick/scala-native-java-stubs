package javax.sql.rowset.serial

import java.io.Serializable
import java.lang.{Cloneable, Object}
import java.net.URL

// A serialized mapping in the Java programming language of an SQL
// DATALINK value. A DATALINK value
// references a file outside of the underlying data source that the
// data source manages.
// 
// RowSet implementations can use the method RowSet.getURL
// to retrieve a java.net.URL object, which can be used
// to manipulate the external data.
// 
//      java.net.URL url = rowset.getURL(1);
// 
//
//  Thread safety 
//
// A SerialDatalink is not safe for use by multiple concurrent threads.  If a
// SerialDatalink is to be used by more than one thread then access to the
// SerialDatalink should be controlled by appropriate synchronization.
class SerialDatalink extends Object with Serializable, with Cloneable {

    @stub
    // Returns a clone of this SerialDatalink.
    def clone(): Object = ???

    @stub
    // Compares this SerialDatalink to the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns a new URL that is a copy of this SerialDatalink
    // object.
    def getDatalink(): URL = ???
}
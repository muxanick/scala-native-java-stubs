package javax.sql.rowset.serial

import java.lang.{Exception, Object, String, Throwable}
import java.sql.SQLException
import scala.scalanative.annotation.stub

/** Indicates and an error with the serialization or de-serialization of
 *  SQL types such as BLOB, CLOB, STRUCT or ARRAY in
 *  addition to SQL types such as DATALINK and JAVAOBJECT
 */
class SerialException extends SQLException {

    /** Creates a new SerialException without a
     *  message.
     */
    @stub
    def this() = ???

    /** Creates a new SerialException with the
     *  specified message.
     */
    @stub
    def this(msg: String) = ???
}

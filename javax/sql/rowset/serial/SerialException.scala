package javax.sql.rowset.serial

import java.lang.{Exception, Object, Throwable}
import java.sql.SQLException

// Indicates and an error with the serialization or de-serialization of
// SQL types such as BLOB, CLOB, STRUCT or ARRAY in
// addition to SQL types such as DATALINK and JAVAOBJECT
class SerialException extends SQLException {

    @stub
    // Creates a new SerialException without a
    // message.
    def this() = ???
}

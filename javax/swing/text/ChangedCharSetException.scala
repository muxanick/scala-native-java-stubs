package javax.swing.text

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

// ChangedCharSetException as the name indicates is an exception
// thrown when the charset is changed.
class ChangedCharSetException extends IOException {

    @stub
    // 
    def getCharSetSpec(): String = ???
}

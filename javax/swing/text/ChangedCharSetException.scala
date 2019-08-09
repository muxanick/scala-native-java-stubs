package javax.swing.text

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** ChangedCharSetException as the name indicates is an exception
 *  thrown when the charset is changed.
 */
class ChangedCharSetException extends IOException {

    /**  */
    @stub
    def this(charSetSpec: String, charSetKey: Boolean) = ???

    /**  */
    @stub
    def getCharSetSpec(): String = ???

    /**  */
    @stub
    def keyEqualsCharSet(): Boolean = ???
}

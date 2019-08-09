package java.net

import java.lang.String
import scala.scalanative.annotation.stub

/** A simple interface which provides a mechanism to map
 *  between a file name and a MIME type string.
 */
trait FileNameMap {

    /** Gets the MIME type for the specified file name. */
    @stub
    def getContentTypeFor(fileName: String): String = ???
}

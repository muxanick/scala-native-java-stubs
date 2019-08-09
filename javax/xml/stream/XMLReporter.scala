package javax.xml.stream

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This interface is used to report non-fatal errors.
 *  Only warnings should be echoed through this interface.
 */
trait XMLReporter {

    /** Report the desired message in an application specific format. */
    @stub
    def report(message: String, errorType: String, relatedInformation: Object, location: Location): Unit = ???
}

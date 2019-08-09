package javax.xml.transform

import java.lang.String
import scala.scalanative.annotation.stub

/** An object that implements this interface contains the information
 *  needed to build a transformation result tree.
 */
trait Result {

    /** Get the system identifier that was set with setSystemId. */
    @stub
    def getSystemId(): String = ???

    /** Set the system identifier for this Result. */
    @stub
    def setSystemId(systemId: String): Unit = ???
}

object Result {
    /** The name of the processing instruction that is sent if the
     *  result tree disables output escaping.
     */
    @stub
    val PI_DISABLE_OUTPUT_ESCAPING: String = ???

    /** The name of the processing instruction that is sent
     *  if the result tree enables output escaping at some point after having
     *  received a PI_DISABLE_OUTPUT_ESCAPING processing instruction.
     */
    @stub
    val PI_ENABLE_OUTPUT_ESCAPING: String = ???
}

package javax.xml.transform

import java.lang.String

/** An object that implements this interface contains the information
 *  needed to build a transformation result tree.
 */
trait Result {

    /** Get the system identifier that was set with setSystemId. */
    @stub
    def getSystemId(): String = ???
}

object Result {
    /** The name of the processing instruction that is sent if the
     *  result tree disables output escaping.
     */
    @stub
    val PI_DISABLE_OUTPUT_ESCAPING: String = ???
}

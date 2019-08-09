package javax.xml.transform

import java.lang.String

// An object that implements this interface contains the information
// needed to build a transformation result tree.
trait Result {

    @stub
    // Get the system identifier that was set with setSystemId.
    def getSystemId(): String = ???
}

object Result {
    @stub
    // The name of the processing instruction that is sent if the
    // result tree disables output escaping.
    def PI_DISABLE_OUTPUT_ESCAPING: String = ???
}

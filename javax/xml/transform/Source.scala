package javax.xml.transform

import java.lang.String
import scala.scalanative.annotation.stub

/** An object that implements this interface contains the information
 *  needed to act as source input (XML source or transformation instructions).
 */
trait Source {

    /** Get the system identifier that was set with setSystemId. */
    @stub
    def getSystemId(): String = ???

    /** Set the system identifier for this Source. */
    @stub
    def setSystemId(systemId: String): Unit = ???
}

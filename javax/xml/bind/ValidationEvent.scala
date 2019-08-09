package javax.xml.bind

import java.lang.{String, Throwable}

/** This event indicates that a problem was encountered while validating the
 *  incoming XML data during an unmarshal operation, while performing
 *  on-demand validation of the Java content tree, or while marshalling the
 *  Java content tree back to XML data.
 */
trait ValidationEvent {

    /** Retrieve the linked exception for this warning/error. */
    @stub
    def getLinkedException(): Throwable = ???

    /** Retrieve the locator for this warning/error. */
    @stub
    def getLocator(): ValidationEventLocator = ???

    /** Retrieve the text message for this warning/error. */
    @stub
    def getMessage(): String = ???
}

object ValidationEvent {
    /** Conditions that correspond to the definition of "error" in section
     *  1.2 of the W3C XML 1.0 Recommendation
     */
    @stub
    val ERROR: Int = ???

    /** Conditions that correspond to the definition of "fatal error" in section
     *  1.2 of the W3C XML 1.0 Recommendation
     */
    @stub
    val FATAL_ERROR: Int = ???
}

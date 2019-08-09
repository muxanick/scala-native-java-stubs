package javax.xml.bind

import java.lang.{String, Throwable}

// This event indicates that a problem was encountered while validating the
// incoming XML data during an unmarshal operation, while performing
// on-demand validation of the Java content tree, or while marshalling the
// Java content tree back to XML data.
trait ValidationEvent {

    @stub
    // Retrieve the linked exception for this warning/error.
    def getLinkedException(): Throwable = ???

    @stub
    // Retrieve the locator for this warning/error.
    def getLocator(): ValidationEventLocator = ???

    @stub
    // Retrieve the text message for this warning/error.
    def getMessage(): String = ???
}

object ValidationEvent {
    @stub
    // Conditions that correspond to the definition of "error" in section
    // 1.2 of the W3C XML 1.0 Recommendation
    def ERROR: Int = ???

    @stub
    // Conditions that correspond to the definition of "fatal error" in section
    // 1.2 of the W3C XML 1.0 Recommendation
    def FATAL_ERROR: Int = ???
}

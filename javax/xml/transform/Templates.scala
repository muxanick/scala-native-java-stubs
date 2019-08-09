package javax.xml.transform

import java.util.Properties

// An object that implements this interface is the runtime representation of processed
// transformation instructions.
//
// Templates must be threadsafe for a given instance
// over multiple threads running concurrently, and may
// be used multiple times in a given session.
trait Templates {

    @stub
    // Get the properties corresponding to the effective xsl:output element.
    def getOutputProperties(): Properties = ???
}

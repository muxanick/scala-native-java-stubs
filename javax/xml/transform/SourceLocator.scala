package javax.xml.transform

import java.lang.String

// This interface is primarily for the purposes of reporting where
// an error occurred in the XML source or transformation instructions.
trait SourceLocator {

    @stub
    // Return the character position where the current document event ends.
    def getColumnNumber(): Int = ???

    @stub
    // Return the line number where the current document event ends.
    def getLineNumber(): Int = ???

    @stub
    // Return the public identifier for the current document event.
    def getPublicId(): String = ???
}

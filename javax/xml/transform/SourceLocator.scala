package javax.xml.transform

import java.lang.String

/** This interface is primarily for the purposes of reporting where
 *  an error occurred in the XML source or transformation instructions.
 */
trait SourceLocator {

    /** Return the character position where the current document event ends. */
    @stub
    def getColumnNumber(): Int = ???

    /** Return the line number where the current document event ends. */
    @stub
    def getLineNumber(): Int = ???

    /** Return the public identifier for the current document event. */
    @stub
    def getPublicId(): String = ???
}

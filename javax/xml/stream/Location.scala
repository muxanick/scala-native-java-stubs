package javax.xml.stream

import java.lang.String
import scala.scalanative.annotation.stub

/** Provides information on the location of an event.
 * 
 *  All the information provided by a Location is optional.  For example
 *  an application may only report line numbers.
 */
trait Location {

    /** Return the byte or character offset into the input source this location
     *  is pointing to.
     */
    @stub
    def getCharacterOffset(): Int = ???

    /** Return the column number where the current event ends,
     *  returns -1 if none is available.
     */
    @stub
    def getColumnNumber(): Int = ???

    /** Return the line number where the current event ends,
     *  returns -1 if none is available.
     */
    @stub
    def getLineNumber(): Int = ???

    /** Returns the public ID of the XML */
    @stub
    def getPublicId(): String = ???

    /** Returns the system ID of the XML */
    @stub
    def getSystemId(): String = ???
}

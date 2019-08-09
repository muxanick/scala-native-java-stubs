package javax.xml.stream.events

import java.lang.String
import scala.scalanative.annotation.stub

/** This describes the interface to Characters events.
 *  All text events get reported as Characters events.
 *  Content, CData and whitespace are all reported as
 *  Characters events.  IgnorableWhitespace, in most cases,
 *  will be set to false unless an element declaration of element
 *  content is present for the current element.
 */
trait Characters extends XMLEvent {

    /** Get the character data of this event */
    @stub
    def getData(): String = ???

    /** Returns true if this is a CData section. */
    @stub
    def isCData(): Boolean = ???

    /** Return true if this is ignorableWhiteSpace. */
    @stub
    def isIgnorableWhiteSpace(): Boolean = ???

    /** Returns true if this set of Characters
     *  is all whitespace.
     */
    @stub
    def isWhiteSpace(): Boolean = ???
}

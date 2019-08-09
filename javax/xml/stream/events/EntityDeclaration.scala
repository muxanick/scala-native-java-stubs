package javax.xml.stream.events

import java.lang.String
import scala.scalanative.annotation.stub

/** An interface for handling Entity Declarations
 * 
 *  This interface is used to record and report unparsed entity declarations.
 */
trait EntityDeclaration extends XMLEvent {

    /** Get the base URI for this reference
     *  or null if this information is not available
     */
    @stub
    def getBaseURI(): String = ???

    /** The entity's name */
    @stub
    def getName(): String = ???

    /** The name of the associated notation. */
    @stub
    def getNotationName(): String = ???

    /** The entity's public identifier, or null if none was given */
    @stub
    def getPublicId(): String = ???

    /** The replacement text of the entity. */
    @stub
    def getReplacementText(): String = ???

    /** The entity's system identifier. */
    @stub
    def getSystemId(): String = ???
}

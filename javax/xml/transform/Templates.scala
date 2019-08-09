package javax.xml.transform

import java.util.Properties
import scala.scalanative.annotation.stub

/** An object that implements this interface is the runtime representation of processed
 *  transformation instructions.
 * 
 *  Templates must be threadsafe for a given instance
 *  over multiple threads running concurrently, and may
 *  be used multiple times in a given session.
 */
trait Templates {

    /** Get the properties corresponding to the effective xsl:output element. */
    @stub
    def getOutputProperties(): Properties = ???

    /** Create a new transformation context for this Templates object. */
    @stub
    def newTransformer(): Transformer = ???
}

package javax.swing.text

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is to report bad locations within a document model
 *  (that is, attempts to reference a location that doesn't exist).
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class BadLocationException extends Exception {

    /** Creates a new BadLocationException object. */
    @stub
    def this(s: String, offs: Int) = ???

    /** Returns the offset into the document that was not legal. */
    @stub
    def offsetRequested(): Int = ???
}

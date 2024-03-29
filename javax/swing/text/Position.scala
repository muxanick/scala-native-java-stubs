package javax.swing.text

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Represents a location within a document.  It is intended to abstract away
 *  implementation details of the document and enable specification of
 *  positions within the document that are capable of tracking of change as
 *  the document is edited.
 *  
 *  A Position object points at a location between two characters.
 *  As the surrounding content is altered, the Position object
 *  adjusts its offset automatically to reflect the changes. If content is
 *  inserted or removed before the Position object's location, then the
 *  Position increments or decrements its offset, respectively,
 *  so as to point to the same location. If a portion of the document is removed
 *  that contains a Position's offset, then the Position's
 *  offset becomes that of the beginning of the removed region. For example, if
 *  a Position has an offset of 5 and the region 2-10 is removed, then
 *  the Position's offset becomes 2.
 *  
 *  Position with an offset of 0 is a special case. It never changes its
 *  offset while document content is altered.
 */
trait Position {

    /** Fetches the current offset within the document. */
    @stub
    def getOffset(): Int = ???
}

object Position {
    /** A typesafe enumeration to indicate bias to a position
     *  in the model.  A position indicates a location between
     *  two characters.  The bias can be used to indicate an
     *  interest toward one of the two sides of the position
     *  in boundary conditions where a simple offset is
     *  ambiguous.
     */
    final object Bias extends Object {

        /** Indicates a bias toward the previous character
         *  in the model.
         */
        @stub
        val Backward: Bias = ???

        /** Indicates to bias toward the next character
         *  in the model.
         */
        @stub
        val Forward: Bias = ???

        /** string representation */
        @stub
        def toString(): String = ???
    }

}

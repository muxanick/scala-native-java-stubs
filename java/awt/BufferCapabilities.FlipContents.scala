package java.awt

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A type-safe enumeration of the possible back buffer contents after
 *  page-flipping
 */
final object BufferCapabilities_FlipContents extends Object {

    /** When flip contents are BACKGROUND, the
     *  contents of the back buffer are cleared with the background color after
     *  flipping.
     */
    @stub
    val BACKGROUND: BufferCapabilities.FlipContents = ???

    /** When flip contents are COPIED, the
     *  contents of the back buffer are copied to the front buffer when
     *  flipping.
     */
    @stub
    val COPIED: BufferCapabilities.FlipContents = ???

    /** When flip contents are PRIOR, the
     *  contents of the back buffer are the prior contents of the front buffer
     *  (a true page flip).
     */
    @stub
    val PRIOR: BufferCapabilities.FlipContents = ???

    /** When flip contents are UNDEFINED, the
     *  contents of the back buffer are undefined after flipping.
     */
    @stub
    val UNDEFINED: BufferCapabilities.FlipContents = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}

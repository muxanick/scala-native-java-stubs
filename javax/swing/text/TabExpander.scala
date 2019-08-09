package javax.swing.text

import scala.scalanative.annotation.stub

/** Simple interface to allow for different types of
 *  implementations of tab expansion.
 */
trait TabExpander {

    /** Returns the next tab stop position given a reference
     *  position.
     */
    @stub
    def nextTabStop(x: Float, tabOffset: Int): Float = ???
}

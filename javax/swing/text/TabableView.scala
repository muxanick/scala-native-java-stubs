package javax.swing.text

import scala.scalanative.annotation.stub

/** Interface for Views that have size dependent upon tabs. */
trait TabableView {

    /** Determines the span along the same axis as tab
     *  expansion for a portion of the view.
     */
    @stub
    def getPartialSpan(p0: Int, p1: Int): Float = ???

    /** Determines the desired span when using the given
     *  tab expansion implementation.
     */
    @stub
    def getTabbedSpan(x: Float, e: TabExpander): Float = ???
}

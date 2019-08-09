package javax.swing.text

/** Interface for Views that have size dependent upon tabs. */
trait TabableView {

    /** Determines the span along the same axis as tab
     *  expansion for a portion of the view.
     */
    @stub
    def getPartialSpan(p0: Int, p1: Int): Float = ???
}

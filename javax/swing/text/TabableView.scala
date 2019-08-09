package javax.swing.text

// Interface for Views that have size dependent upon tabs.
trait TabableView {

    @stub
    // Determines the span along the same axis as tab
    // expansion for a portion of the view.
    def getPartialSpan(p0: Int, p1: Int): float = ???
}

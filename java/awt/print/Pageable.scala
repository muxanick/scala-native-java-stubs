package java.awt.print

// The Pageable implementation represents a set of
// pages to be printed. The Pageable object returns
// the total number of pages in the set as well as the
// PageFormat and Printable for a specified page.
trait Pageable {

    @stub
    // Returns the number of pages in the set.
    def getNumberOfPages(): Int = ???

    @stub
    // Returns the PageFormat of the page specified by
    // pageIndex.
    def getPageFormat(pageIndex: Int): PageFormat = ???
}

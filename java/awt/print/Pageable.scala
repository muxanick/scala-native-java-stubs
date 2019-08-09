package java.awt.print

/** The Pageable implementation represents a set of
 *  pages to be printed. The Pageable object returns
 *  the total number of pages in the set as well as the
 *  PageFormat and Printable for a specified page.
 */
trait Pageable {

    /** Returns the number of pages in the set. */
    @stub
    def getNumberOfPages(): Int = ???

    /** Returns the PageFormat of the page specified by
     *  pageIndex.
     */
    @stub
    def getPageFormat(pageIndex: Int): PageFormat = ???
}

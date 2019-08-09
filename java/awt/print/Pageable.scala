package java.awt.print

import scala.scalanative.annotation.stub

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

    /** Returns the Printable instance responsible for
     *  rendering the page specified by pageIndex.
     */
    @stub
    def getPrintable(pageIndex: Int): Printable = ???
}

object Pageable {
    /** This constant is returned from the
     *  getNumberOfPages
     *  method if a Pageable implementation does not know
     *  the number of pages in its set.
     */
    @stub
    val UNKNOWN_NUMBER_OF_PAGES: Int = ???
}

package java.awt.print

import java.lang.Object
import scala.scalanative.annotation.stub

/** The Book class provides a representation of a document in
 *  which pages may have different page formats and page painters. This
 *  class uses the Pageable interface to interact with a
 *  PrinterJob.
 */
class Book extends Object with Pageable {

    /** Creates a new, empty Book. */
    @stub
    def this() = ???

    /** Appends a single page to the end of this Book. */
    @stub
    def append(painter: Printable, page: PageFormat): Unit = ???

    /** Appends numPages pages to the end of this
     *  Book.
     */
    @stub
    def append(painter: Printable, page: PageFormat, numPages: Int): Unit = ???

    /** Returns the number of pages in this Book. */
    @stub
    def getNumberOfPages(): Int = ???

    /** Returns the PageFormat of the page specified by
     *  pageIndex.
     */
    @stub
    def getPageFormat(pageIndex: Int): PageFormat = ???

    /** Returns the Printable instance responsible for rendering
     *  the page specified by pageIndex.
     */
    @stub
    def getPrintable(pageIndex: Int): Printable = ???

    /** Sets the PageFormat and the Painter for a
     *  specified page number.
     */
    @stub
    def setPage(pageIndex: Int, painter: Printable, page: PageFormat): Unit = ???
}

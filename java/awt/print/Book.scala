package java.awt.print

import java.lang.Object

// The Book class provides a representation of a document in
// which pages may have different page formats and page painters. This
// class uses the Pageable interface to interact with a
// PrinterJob.
class Book extends Object with Pageable {

    @stub
    // Appends a single page to the end of this Book.
    def append(painter: Printable, page: PageFormat): Unit = ???

    @stub
    // Appends numPages pages to the end of this
    // Book.
    def append(painter: Printable, page: PageFormat, numPages: Int): Unit = ???

    @stub
    // Returns the number of pages in this Book.
    def getNumberOfPages(): Int = ???

    @stub
    // Returns the PageFormat of the page specified by
    // pageIndex.
    def getPageFormat(pageIndex: Int): PageFormat = ???

    @stub
    // Returns the Printable instance responsible for rendering
    // the page specified by pageIndex.
    def getPrintable(pageIndex: Int): Printable = ???
}

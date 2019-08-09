package java.awt

import scala.scalanative.annotation.stub

/** An abstract class which provides a print graphics context for a page. */
trait PrintGraphics {

    /** Returns the PrintJob object from which this PrintGraphics
     *  object originated.
     */
    @stub
    def getPrintJob(): PrintJob = ???
}

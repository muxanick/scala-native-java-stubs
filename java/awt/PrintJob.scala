package java.awt

import java.lang.Object
import scala.scalanative.annotation.stub

/** An abstract class which initiates and executes a print job.
 *  It provides access to a print graphics object which renders
 *  to an appropriate print device.
 */
abstract class PrintJob extends Object {

    /**  */
    @stub
    def this() = ???

    /** Ends the print job and does any necessary cleanup. */
    def end(): Unit

    /** Ends this print job once it is no longer referenced. */
    def finalize(): Unit

    /** Gets a Graphics object that will draw to the next page. */
    def getGraphics(): Graphics

    /** Returns the dimensions of the page in pixels. */
    def getPageDimension(): Dimension

    /** Returns the resolution of the page in pixels per inch. */
    def getPageResolution(): Int

    /** Returns true if the last page will be printed first. */
    def lastPageFirst(): Boolean
}

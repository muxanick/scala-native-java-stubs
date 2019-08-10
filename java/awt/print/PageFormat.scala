package java.awt.print

import java.lang.{Cloneable, Object}
import scala.scalanative.annotation.stub

/** The PageFormat class describes the size and
 *  orientation of a page to be printed.
 */
class PageFormat extends Object with Cloneable {

    /** Creates a default, portrait-oriented
     *  PageFormat.
     */
    @stub
    def this() = ???

    /** Makes a copy of this PageFormat with the same
     *  contents as this PageFormat.
     */
    @stub
    def clone(): Any = ???

    /** Returns the height, in 1/72nds of an inch, of the page. */
    @stub
    def getHeight(): Double = ???

    /** Return the height, in 1/72nds of an inch, of the imageable
     *  area of the page.
     */
    @stub
    def getImageableHeight(): Double = ???

    /** Returns the width, in 1/72nds of an inch, of the imageable
     *  area of the page.
     */
    @stub
    def getImageableWidth(): Double = ???

    /** Returns the x coordinate of the upper left point of the
     *  imageable area of the Paper object
     *  associated with this PageFormat.
     */
    @stub
    def getImageableX(): Double = ???

    /** Returns the y coordinate of the upper left point of the
     *  imageable area of the Paper object
     *  associated with this PageFormat.
     */
    @stub
    def getImageableY(): Double = ???

    /** Returns a transformation matrix that translates user
     *  space rendering to the requested orientation
     *  of the page.
     */
    @stub
    def getMatrix(): Array[Double] = ???

    /** Returns the orientation of this PageFormat. */
    @stub
    def getOrientation(): Int = ???

    /** Returns a copy of the Paper object associated
     *  with this PageFormat.
     */
    @stub
    def getPaper(): Paper = ???

    /** Returns the width, in 1/72nds of an inch, of the page. */
    @stub
    def getWidth(): Double = ???

    /** Sets the page orientation. */
    @stub
    def setOrientation(orientation: Int): Unit = ???

    /** Sets the Paper object for this
     *  PageFormat.
     */
    @stub
    def setPaper(paper: Paper): Unit = ???
}

object PageFormat {
    /** The origin is at the bottom left of the paper with
     *   x running bottom to top and y running left to right.
     */
    @stub
    val LANDSCAPE: Int = ???

    /** The origin is at the top left of the paper with
     *   x running to the right and y running down the
     *   paper.
     */
    @stub
    val PORTRAIT: Int = ???

    /** The origin is at the top right of the paper with x
     *   running top to bottom and y running right to left.
     */
    @stub
    val REVERSE_LANDSCAPE: Int = ???
}

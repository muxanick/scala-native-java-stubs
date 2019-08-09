package java.awt.print

import java.lang.{Cloneable, Object}

/** The Paper class describes the physical characteristics of
 *  a piece of paper.
 *  
 *  When creating a Paper object, it is the application's
 *  responsibility to ensure that the paper size and the imageable area
 *  are compatible.  For example, if the paper size is changed from
 *  11 x 17 to 8.5 x 11, the application might need to reduce the
 *  imageable area so that whatever is printed fits on the page.
 *  
 */
class Paper extends Object with Cloneable {

    /** Creates a copy of this Paper with the same contents
     *  as this Paper.
     */
    @stub
    def clone(): Object = ???

    /** Returns the height of the page in 1/72nds of an inch. */
    @stub
    def getHeight(): Double = ???

    /** Returns the height of this Paper object's imageable
     *  area.
     */
    @stub
    def getImageableHeight(): Double = ???

    /** Returns the width of this Paper object's imageable
     *  area.
     */
    @stub
    def getImageableWidth(): Double = ???

    /** Returns the x coordinate of the upper-left corner of this
     *  Paper object's imageable area.
     */
    @stub
    def getImageableX(): Double = ???

    /** Returns the y coordinate of the upper-left corner of this
     *  Paper object's imageable area.
     */
    @stub
    def getImageableY(): Double = ???

    /** Returns the width of the page in 1/72nds
     *  of an inch.
     */
    @stub
    def getWidth(): Double = ???

    /** Sets the imageable area of this Paper. */
    @stub
    def setImageableArea(x: Double, y: Double, width: Double, height: Double): Unit = ???
}

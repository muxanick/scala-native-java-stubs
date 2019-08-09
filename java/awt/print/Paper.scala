package java.awt.print

import java.lang.{Cloneable, Object}

// The Paper class describes the physical characteristics of
// a piece of paper.
// 
// When creating a Paper object, it is the application's
// responsibility to ensure that the paper size and the imageable area
// are compatible.  For example, if the paper size is changed from
// 11 x 17 to 8.5 x 11, the application might need to reduce the
// imageable area so that whatever is printed fits on the page.
// 
class Paper extends Object with Cloneable {

    @stub
    // Creates a copy of this Paper with the same contents
    // as this Paper.
    def clone(): Object = ???

    @stub
    // Returns the height of the page in 1/72nds of an inch.
    def getHeight(): double = ???

    @stub
    // Returns the height of this Paper object's imageable
    // area.
    def getImageableHeight(): double = ???

    @stub
    // Returns the width of this Paper object's imageable
    // area.
    def getImageableWidth(): double = ???

    @stub
    // Returns the x coordinate of the upper-left corner of this
    // Paper object's imageable area.
    def getImageableX(): double = ???

    @stub
    // Returns the y coordinate of the upper-left corner of this
    // Paper object's imageable area.
    def getImageableY(): double = ???

    @stub
    // Returns the width of the page in 1/72nds
    // of an inch.
    def getWidth(): double = ???

    @stub
    // Sets the imageable area of this Paper.
    def setImageableArea(x: double, y: double, width: double, height: double): Unit = ???
}

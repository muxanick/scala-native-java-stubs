package java.awt.print

import java.lang.{Cloneable, Object}

// The PageFormat class describes the size and
// orientation of a page to be printed.
class PageFormat extends Object with Cloneable {

    @stub
    // Makes a copy of this PageFormat with the same
    // contents as this PageFormat.
    def clone(): Object = ???

    @stub
    // Returns the height, in 1/72nds of an inch, of the page.
    def getHeight(): double = ???

    @stub
    // Return the height, in 1/72nds of an inch, of the imageable
    // area of the page.
    def getImageableHeight(): double = ???

    @stub
    // Returns the width, in 1/72nds of an inch, of the imageable
    // area of the page.
    def getImageableWidth(): double = ???

    @stub
    // Returns the x coordinate of the upper left point of the
    // imageable area of the Paper object
    // associated with this PageFormat.
    def getImageableX(): double = ???

    @stub
    // Returns the y coordinate of the upper left point of the
    // imageable area of the Paper object
    // associated with this PageFormat.
    def getImageableY(): double = ???

    @stub
    // Returns a transformation matrix that translates user
    // space rendering to the requested orientation
    // of the page.
    def getMatrix(): Array[double] = ???

    @stub
    // Returns the orientation of this PageFormat.
    def getOrientation(): Int = ???

    @stub
    // Returns a copy of the Paper object associated
    // with this PageFormat.
    def getPaper(): Paper = ???

    @stub
    // Returns the width, in 1/72nds of an inch, of the page.
    def getWidth(): double = ???

    @stub
    // Sets the page orientation.
    def setOrientation(orientation: Int): Unit = ???
}

object PageFormat {
    @stub
    // The origin is at the bottom left of the paper with
    //  x running bottom to top and y running left to right.
    def LANDSCAPE: Int = ???

    @stub
    // The origin is at the top left of the paper with
    //  x running to the right and y running down the
    //  paper.
    def PORTRAIT: Int = ???
}

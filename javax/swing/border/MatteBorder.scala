package javax.swing.border

import java.awt.{Color, Component, Insets}
import java.lang.Object
import javax.swing.Icon

// A class which provides a matte-like border of either a solid color
// or a tiled icon.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class MatteBorder extends EmptyBorder {

    @stub
    // Creates a matte border with the specified tile icon.
    def this(tileIcon: Icon) = ???

    @stub
    // Creates a matte border with the specified insets and color.
    def this(borderInsets: Insets, matteColor: Color) = ???

    @stub
    // Creates a matte border with the specified insets and tile icon.
    def this(borderInsets: Insets, tileIcon: Icon) = ???

    @stub
    // Creates a matte border with the specified insets and color.
    def this(top: Int, left: Int, bottom: Int, right: Int, matteColor: Color) = ???

    @stub
    // 
    protected def color: Color = ???

    @stub
    // Returns the insets of the border.
    def getBorderInsets(): Insets = ???

    @stub
    // Reinitialize the insets parameter with this Border's current Insets.
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    @stub
    // Returns the color used for tiling the border or null
    // if a tile icon is being used.
    def getMatteColor(): Color = ???

    @stub
    // Returns the icon used for tiling the border or null
    // if a solid color is being used.
    def getTileIcon(): Icon = ???

    @stub
    // Returns whether or not the border is opaque.
    def isBorderOpaque(): Boolean = ???
}

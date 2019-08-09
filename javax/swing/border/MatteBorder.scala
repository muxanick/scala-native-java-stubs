package javax.swing.border

import java.awt.{Color, Component, Insets}
import java.lang.Object
import javax.swing.Icon

/** A class which provides a matte-like border of either a solid color
 *  or a tiled icon.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class MatteBorder extends EmptyBorder {

    /** Creates a matte border with the specified tile icon. */
    @stub
    def this(tileIcon: Icon) = ???

    /** Creates a matte border with the specified insets and color. */
    @stub
    def this(borderInsets: Insets, matteColor: Color) = ???

    /** Creates a matte border with the specified insets and tile icon. */
    @stub
    def this(borderInsets: Insets, tileIcon: Icon) = ???

    /** Creates a matte border with the specified insets and color. */
    @stub
    def this(top: Int, left: Int, bottom: Int, right: Int, matteColor: Color) = ???

    /**  */
    @stub
    protected val color: Color = ???

    /** Returns the insets of the border. */
    @stub
    def getBorderInsets(): Insets = ???

    /** Reinitialize the insets parameter with this Border's current Insets. */
    @stub
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    /** Returns the color used for tiling the border or null
     *  if a tile icon is being used.
     */
    @stub
    def getMatteColor(): Color = ???

    /** Returns the icon used for tiling the border or null
     *  if a solid color is being used.
     */
    @stub
    def getTileIcon(): Icon = ???

    /** Returns whether or not the border is opaque. */
    @stub
    def isBorderOpaque(): Boolean = ???
}

package javax.swing.plaf

import java.awt.{Component, Graphics, Insets}
import java.io.Serializable
import java.lang.Object
import javax.swing.border.Border
import scala.scalanative.annotation.stub

/**  */
class BorderUIResource extends Object with Border with UIResource with Serializable {

    /** Creates a UIResource border object which wraps
     *  an existing Border instance.
     */
    @stub
    def this(delegate: Border) = ???

    /** Returns the insets of the border. */
    @stub
    def getBorderInsets(c: Component): Insets = ???

    /** Returns whether or not the border is opaque. */
    @stub
    def isBorderOpaque(): Boolean = ???

    /** Paints the border for the specified component with the specified
     *  position and size.
     */
    @stub
    def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???
}

object BorderUIResource {
    /**  */
    @stub
    object BevelBorderUIResource extends BorderUIResource.BevelBorderUIResource

    /**  */
    @stub
    object CompoundBorderUIResource extends BorderUIResource.CompoundBorderUIResource

    /**  */
    @stub
    object EmptyBorderUIResource extends BorderUIResource.EmptyBorderUIResource

    /**  */
    @stub
    object EtchedBorderUIResource extends BorderUIResource.EtchedBorderUIResource

    /**  */
    @stub
    object LineBorderUIResource extends BorderUIResource.LineBorderUIResource

    /**  */
    @stub
    object MatteBorderUIResource extends BorderUIResource.MatteBorderUIResource

    /**  */
    @stub
    object TitledBorderUIResource extends BorderUIResource.TitledBorderUIResource

    /**  */
    @stub
    def getBlackLineBorderUIResource(): Border = ???

    /**  */
    @stub
    def getEtchedBorderUIResource(): Border = ???

    /**  */
    @stub
    def getLoweredBevelBorderUIResource(): Border = ???

    /**  */
    @stub
    def getRaisedBevelBorderUIResource(): Border = ???
}

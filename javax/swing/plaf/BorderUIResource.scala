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
    type BevelBorderUIResource = BorderUIResource_BevelBorderUIResource

    /**  */
    type CompoundBorderUIResource = BorderUIResource_CompoundBorderUIResource

    /**  */
    type EmptyBorderUIResource = BorderUIResource_EmptyBorderUIResource

    /**  */
    type EtchedBorderUIResource = BorderUIResource_EtchedBorderUIResource

    /**  */
    type LineBorderUIResource = BorderUIResource_LineBorderUIResource

    /**  */
    type MatteBorderUIResource = BorderUIResource_MatteBorderUIResource

    /**  */
    type TitledBorderUIResource = BorderUIResource_TitledBorderUIResource

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

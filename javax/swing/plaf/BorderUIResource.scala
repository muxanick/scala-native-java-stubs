package javax.swing.plaf

import java.awt.{Component, Insets}
import java.io.Serializable
import java.lang.Object
import javax.swing.border.Border

/**  */
class BorderUIResource extends Object with Border with UIResource with Serializable {

    /** Returns the insets of the border. */
    @stub
    def getBorderInsets(c: Component): Insets = ???

    /** Returns whether or not the border is opaque. */
    @stub
    def isBorderOpaque(): Boolean = ???
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

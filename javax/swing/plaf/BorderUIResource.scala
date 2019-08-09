package javax.swing.plaf

import java.awt.{Component, Insets}
import java.io.Serializable
import java.lang.Object
import javax.swing.border.Border

// 
class BorderUIResource extends Object with Border, with UIResource, with Serializable {

    @stub
    // Returns the insets of the border.
    def getBorderInsets(c: Component): Insets = ???

    @stub
    // Returns whether or not the border is opaque.
    def isBorderOpaque(): Boolean = ???
}

object BorderUIResource {
    @stub
    // 
    def BorderUIResource.BevelBorderUIResource: class = ???

    @stub
    // 
    def BorderUIResource.CompoundBorderUIResource: class = ???

    @stub
    // 
    def BorderUIResource.EmptyBorderUIResource: class = ???

    @stub
    // 
    def BorderUIResource.EtchedBorderUIResource: class = ???

    @stub
    // 
    def BorderUIResource.LineBorderUIResource: class = ???

    @stub
    // 
    def BorderUIResource.MatteBorderUIResource: class = ???

    @stub
    // 
    def getBlackLineBorderUIResource(): Border = ???

    @stub
    // 
    def getEtchedBorderUIResource(): Border = ???

    @stub
    // 
    def getLoweredBevelBorderUIResource(): Border = ???

    @stub
    // 
    def getRaisedBevelBorderUIResource(): Border = ???
}

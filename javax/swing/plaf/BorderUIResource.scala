package javax.swing.plaf

import java.awt.{Color, Component, Font, Graphics, Insets}
import java.io.Serializable
import java.lang.{Object, String}
import javax.swing.Icon
import javax.swing.border.{AbstractBorder, BevelBorder, Border, CompoundBorder, EmptyBorder, EtchedBorder, LineBorder, MatteBorder, TitledBorder}
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
    object BevelBorderUIResource extends BevelBorder with UIResource {

        /**  */
        @stub
        def apply(bevelType: Int) = ???

        /**  */
        @stub
        def apply(bevelType: Int, highlight: Color, shadow: Color) = ???

        /**  */
        @stub
        def apply(bevelType: Int, highlightOuter: Color, highlightInner: Color, shadowOuter: Color, shadowInner: Color) = ???


    /**  */
    object CompoundBorderUIResource extends CompoundBorder with UIResource {

        /**  */
        @stub
        def apply(outsideBorder: Border, insideBorder: Border) = ???


    /**  */
    object EmptyBorderUIResource extends EmptyBorder with UIResource {

        /**  */
        @stub
        def apply(insets: Insets) = ???

        /**  */
        @stub
        def apply(top: Int, left: Int, bottom: Int, right: Int) = ???


    /**  */
    object EtchedBorderUIResource extends EtchedBorder with UIResource {

        /**  */
        @stub
        def apply() = ???

        /**  */
        @stub
        def apply(highlight: Color, shadow: Color) = ???

        /**  */
        @stub
        def apply(etchType: Int) = ???

        /**  */
        @stub
        def apply(etchType: Int, highlight: Color, shadow: Color) = ???


    /**  */
    object LineBorderUIResource extends LineBorder with UIResource {

        /**  */
        @stub
        def apply(color: Color) = ???

        /**  */
        @stub
        def apply(color: Color, thickness: Int) = ???


    /**  */
    object MatteBorderUIResource extends MatteBorder with UIResource {

        /**  */
        @stub
        def apply(tileIcon: Icon) = ???

        /**  */
        @stub
        def apply(top: Int, left: Int, bottom: Int, right: Int, color: Color) = ???

        /**  */
        @stub
        def apply(top: Int, left: Int, bottom: Int, right: Int, tileIcon: Icon) = ???


    /**  */
    object TitledBorderUIResource extends TitledBorder with UIResource {

        /**  */
        @stub
        def apply(border: Border) = ???

        /**  */
        @stub
        def apply(border: Border, title: String) = ???

        /**  */
        @stub
        def apply(border: Border, title: String, titleJustification: Int, titlePosition: Int) = ???

        /**  */
        @stub
        def apply(border: Border, title: String, titleJustification: Int, titlePosition: Int, titleFont: Font) = ???

        /**  */
        @stub
        def apply(border: Border, title: String, titleJustification: Int, titlePosition: Int, titleFont: Font, titleColor: Color) = ???

        /**  */
        @stub
        def apply(title: String) = ???


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

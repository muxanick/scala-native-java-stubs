package javax.swing.plaf.basic

import java.awt.{Color, Component, Graphics, Insets}
import java.lang.Object
import javax.swing.border.{AbstractBorder, Border}
import javax.swing.plaf.UIResource
import scala.scalanative.annotation.stub

/** Factory object that can vend Borders appropriate for the basic L & F. */
class BasicBorders extends Object {

    /**  */
    @stub
    def this() = ???
}

object BasicBorders {
    /**  */
    object ButtonBorder extends AbstractBorder with UIResource {

        /**  */
        @stub
        def apply(shadow: Color, darkShadow: Color, highlight: Color, lightHighlight: Color) = ???

        /**  */
        @stub
        protected val darkShadow: Color = ???

        /**  */
        @stub
        protected val highlight: Color = ???

        /**  */
        @stub
        protected val lightHighlight: Color = ???

        /**  */
        @stub
        protected val shadow: Color = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, insets: Insets): Insets = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???
    }


    /**  */
    object FieldBorder extends AbstractBorder with UIResource {

        /**  */
        @stub
        def apply(shadow: Color, darkShadow: Color, highlight: Color, lightHighlight: Color) = ???

        /**  */
        @stub
        protected val darkShadow: Color = ???

        /**  */
        @stub
        protected val highlight: Color = ???

        /**  */
        @stub
        protected val lightHighlight: Color = ???

        /**  */
        @stub
        protected val shadow: Color = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, insets: Insets): Insets = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???
    }


    /**  */
    object MarginBorder extends AbstractBorder with UIResource {

        /**  */
        @stub
        def apply() = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, insets: Insets): Insets = ???
    }


    /**  */
    object MenuBarBorder extends AbstractBorder with UIResource {

        /**  */
        @stub
        def apply(shadow: Color, highlight: Color) = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, insets: Insets): Insets = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???
    }


    /**  */
    object RadioButtonBorder extends BasicBorders.ButtonBorder {

        /**  */
        @stub
        def apply(shadow: Color, darkShadow: Color, highlight: Color, lightHighlight: Color) = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, insets: Insets): Insets = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???
    }


    /** Special thin border for rollover toolbar buttons. */
    object RolloverButtonBorder extends BasicBorders.ButtonBorder {

        /**  */
        @stub
        def apply(shadow: Color, darkShadow: Color, highlight: Color, lightHighlight: Color) = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
    }


    /** Draws the border around the splitpane. To work correctly you should
     *  also install a border on the divider (property SplitPaneDivider.border).
     */
    object SplitPaneBorder extends Object with Border with UIResource {

        /**  */
        @stub
        def apply(highlight: Color, shadow: Color) = ???

        /**  */
        @stub
        protected val highlight: Color = ???

        /**  */
        @stub
        protected val shadow: Color = ???

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


    /**  */
    object ToggleButtonBorder extends BasicBorders.ButtonBorder {

        /**  */
        @stub
        def apply(shadow: Color, darkShadow: Color, highlight: Color, lightHighlight: Color) = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, insets: Insets): Insets = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???
    }


    /**  */
    @stub
    def getButtonBorder(): Border = ???

    /**  */
    @stub
    def getInternalFrameBorder(): Border = ???

    /**  */
    @stub
    def getMenuBarBorder(): Border = ???

    /**  */
    @stub
    def getProgressBarBorder(): Border = ???

    /**  */
    @stub
    def getRadioButtonBorder(): Border = ???

    /**  */
    @stub
    def getSplitPaneBorder(): Border = ???

    /** Returns a border instance for a JSplitPane divider */
    @stub
    def getSplitPaneDividerBorder(): Border = ???

    /**  */
    @stub
    def getTextFieldBorder(): Border = ???

    /**  */
    @stub
    def getToggleButtonBorder(): Border = ???
}

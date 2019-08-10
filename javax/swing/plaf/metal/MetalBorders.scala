package javax.swing.plaf.metal

import java.awt.{Component, Graphics, Insets}
import java.lang.Object
import javax.swing.SwingConstants
import javax.swing.border.{AbstractBorder, Border}
import javax.swing.plaf.UIResource
import scala.scalanative.annotation.stub

/** Factory object that can vend Borders appropriate for the metal L & F. */
class MetalBorders extends Object {

    /**  */
    @stub
    def this() = ???
}

object MetalBorders {
    /**  */
    object ButtonBorder extends AbstractBorder with UIResource {

        /**  */
        @stub
        def apply() = ???

        /**  */
        @stub
        protected val borderInsets: Insets = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, newInsets: Insets): Insets = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
    }


    /**  */
    object Flush3DBorder extends AbstractBorder with UIResource {

        /**  */
        @stub
        def apply() = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, newInsets: Insets): Insets = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
    }


    /**  */
    object InternalFrameBorder extends AbstractBorder with UIResource {

        /**  */
        @stub
        def apply() = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, newInsets: Insets): Insets = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
    }


    /**  */
    object MenuBarBorder extends AbstractBorder with UIResource {

        /**  */
        @stub
        def apply() = ???

        /**  */
        @stub
        protected val borderInsets: Insets = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, newInsets: Insets): Insets = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
    }


    /**  */
    object MenuItemBorder extends AbstractBorder with UIResource {

        /**  */
        @stub
        def apply() = ???

        /**  */
        @stub
        protected val borderInsets: Insets = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, newInsets: Insets): Insets = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
    }


    /**  */
    object OptionDialogBorder extends AbstractBorder with UIResource {

        /**  */
        @stub
        def apply() = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, newInsets: Insets): Insets = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
    }


    /** Border for a Palette. */
    object PaletteBorder extends AbstractBorder with UIResource {

        /**  */
        @stub
        def apply() = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, newInsets: Insets): Insets = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
    }


    /**  */
    object PopupMenuBorder extends AbstractBorder with UIResource {

        /**  */
        @stub
        def apply() = ???

        /**  */
        @stub
        protected val borderInsets: Insets = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, newInsets: Insets): Insets = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
    }


    /**  */
    object RolloverButtonBorder extends MetalBorders.ButtonBorder {

        /**  */
        @stub
        def apply() = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
    }


    /**  */
    object ScrollPaneBorder extends AbstractBorder with UIResource {

        /**  */
        @stub
        def apply() = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, insets: Insets): Insets = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
    }


    /** Border for a Table Header */
    object TableHeaderBorder extends AbstractBorder {

        /**  */
        @stub
        def apply() = ???

        /**  */
        @stub
        protected val editorBorderInsets: Insets = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, insets: Insets): Insets = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
    }


    /**  */
    object TextFieldBorder extends MetalBorders.Flush3DBorder {

        /**  */
        @stub
        def apply() = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
    }


    /** 
     * Since:
     * 1.3
     * 
     */
    object ToggleButtonBorder extends MetalBorders.ButtonBorder {

        /**  */
        @stub
        def apply() = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
    }


    /**  */
    object ToolBarBorder extends AbstractBorder with UIResource with SwingConstants {

        /**  */
        @stub
        def apply() = ???

        /**  */
        @stub
        protected val bumps: javax.swing.plaf.metal.MetalBumps = ???

        /** Reinitializes the insets parameter with this Border's current Insets. */
        @stub
        def getBorderInsets(c: Component, newInsets: Insets): Insets = ???

        /** This default implementation does no painting. */
        @stub
        def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
    }


    /** Returns a border instance for a JButton */
    @stub
    def getButtonBorder(): Border = ???

    /** Returns a border instance for a Desktop Icon */
    @stub
    def getDesktopIconBorder(): Border = ???

    /** Returns a border instance for a text component */
    @stub
    def getTextBorder(): Border = ???

    /** Returns a border instance for a JTextField */
    @stub
    def getTextFieldBorder(): Border = ???

    /** Returns a border instance for a JToggleButton */
    @stub
    def getToggleButtonBorder(): Border = ???
}

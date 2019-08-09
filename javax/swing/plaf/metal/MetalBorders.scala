package javax.swing.plaf.metal

import java.lang.Object
import javax.swing.border.Border
import scala.scalanative.annotation.stub

/** Factory object that can vend Borders appropriate for the metal L & F. */
class MetalBorders extends Object {

    /**  */
    @stub
    def this() = ???
}

object MetalBorders {
    /**  */
    @stub
    object ButtonBorder extends MetalBorders.ButtonBorder

    /**  */
    @stub
    object Flush3DBorder extends MetalBorders.Flush3DBorder

    /**  */
    @stub
    object InternalFrameBorder extends MetalBorders.InternalFrameBorder

    /**  */
    @stub
    object MenuBarBorder extends MetalBorders.MenuBarBorder

    /**  */
    @stub
    object MenuItemBorder extends MetalBorders.MenuItemBorder

    /**  */
    @stub
    object OptionDialogBorder extends MetalBorders.OptionDialogBorder

    /** Border for a Palette. */
    @stub
    object PaletteBorder extends MetalBorders.PaletteBorder

    /**  */
    @stub
    object PopupMenuBorder extends MetalBorders.PopupMenuBorder

    /**  */
    @stub
    object RolloverButtonBorder extends MetalBorders.RolloverButtonBorder

    /**  */
    @stub
    object ScrollPaneBorder extends MetalBorders.ScrollPaneBorder

    /** Border for a Table Header */
    @stub
    object TableHeaderBorder extends MetalBorders.TableHeaderBorder

    /**  */
    @stub
    object TextFieldBorder extends MetalBorders.TextFieldBorder

    /**  */
    @stub
    object ToggleButtonBorder extends MetalBorders.ToggleButtonBorder

    /**  */
    @stub
    object ToolBarBorder extends MetalBorders.ToolBarBorder

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

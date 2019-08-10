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
    type ButtonBorder = MetalBorders_ButtonBorder

    /**  */
    type Flush3DBorder = MetalBorders_Flush3DBorder

    /**  */
    type InternalFrameBorder = MetalBorders_InternalFrameBorder

    /**  */
    type MenuBarBorder = MetalBorders_MenuBarBorder

    /**  */
    type MenuItemBorder = MetalBorders_MenuItemBorder

    /**  */
    type OptionDialogBorder = MetalBorders_OptionDialogBorder

    /** Border for a Palette. */
    type PaletteBorder = MetalBorders_PaletteBorder

    /**  */
    type PopupMenuBorder = MetalBorders_PopupMenuBorder

    /**  */
    type RolloverButtonBorder = MetalBorders_RolloverButtonBorder

    /**  */
    type ScrollPaneBorder = MetalBorders_ScrollPaneBorder

    /** Border for a Table Header */
    type TableHeaderBorder = MetalBorders_TableHeaderBorder

    /**  */
    type TextFieldBorder = MetalBorders_TextFieldBorder

    /**  */
    type ToggleButtonBorder = MetalBorders_ToggleButtonBorder

    /**  */
    type ToolBarBorder = MetalBorders_ToolBarBorder

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

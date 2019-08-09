package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.border.Border

/** Factory object that can vend Borders appropriate for the basic L & F. */
class BasicBorders extends Object {
}

object BasicBorders {
    /**  */
    @stub
    object ButtonBorder extends BasicBorders.ButtonBorder

    /**  */
    @stub
    object FieldBorder extends BasicBorders.FieldBorder

    /**  */
    @stub
    object MarginBorder extends BasicBorders.MarginBorder

    /**  */
    @stub
    object MenuBarBorder extends BasicBorders.MenuBarBorder

    /**  */
    @stub
    object RadioButtonBorder extends BasicBorders.RadioButtonBorder

    /** Special thin border for rollover toolbar buttons. */
    @stub
    object RolloverButtonBorder extends BasicBorders.RolloverButtonBorder

    /** Draws the border around the splitpane. */
    @stub
    object SplitPaneBorder extends BasicBorders.SplitPaneBorder

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
}

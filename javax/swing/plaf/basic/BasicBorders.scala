package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.border.Border
import scala.scalanative.annotation.stub

/** Factory object that can vend Borders appropriate for the basic L & F. */
class BasicBorders extends Object {

    /**  */
    @stub
    def this() = ???
}

object BasicBorders {
    /**  */
    type ButtonBorder = BasicBorders_ButtonBorder

    /**  */
    type FieldBorder = BasicBorders_FieldBorder

    /**  */
    type MarginBorder = BasicBorders_MarginBorder

    /**  */
    type MenuBarBorder = BasicBorders_MenuBarBorder

    /**  */
    type RadioButtonBorder = BasicBorders_RadioButtonBorder

    /** Special thin border for rollover toolbar buttons. */
    type RolloverButtonBorder = BasicBorders_RolloverButtonBorder

    /** Draws the border around the splitpane. */
    type SplitPaneBorder = BasicBorders_SplitPaneBorder

    /**  */
    type ToggleButtonBorder = BasicBorders_ToggleButtonBorder

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

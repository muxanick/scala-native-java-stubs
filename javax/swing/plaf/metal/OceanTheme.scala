package javax.swing.plaf.metal

import java.lang.{Object, String}
import javax.swing.UIDefaults
import javax.swing.plaf.ColorUIResource

// The default theme for the MetalLookAndFeel.
// 
// The designers
// of the Metal Look and Feel strive to keep the default look up to
// date, possibly through the use of new themes in the future.
// Therefore, developers should only use this class directly when they
// wish to customize the "Ocean" look, or force it to be the current
// theme, regardless of future updates.
//
// 
// All colors returned by OceanTheme are completely
// opaque.
class OceanTheme extends DefaultMetalTheme {

    @stub
    // Add this theme's custom entries to the defaults table.
    def addCustomEntriesToTable(table: UIDefaults): Unit = ???

    @stub
    // Returns the black color.
    protected def getBlack(): ColorUIResource = ???

    @stub
    // Returns the control text color.
    def getControlTextColor(): ColorUIResource = ???

    @stub
    // Returns the desktop color.
    def getDesktopColor(): ColorUIResource = ???

    @stub
    // Returns the inactive control text color.
    def getInactiveControlTextColor(): ColorUIResource = ???

    @stub
    // Returns the menu disabled foreground color.
    def getMenuDisabledForeground(): ColorUIResource = ???

    @stub
    // Return the name of this theme, "Ocean".
    def getName(): String = ???

    @stub
    // Returns the primary 1 color.
    protected def getPrimary1(): ColorUIResource = ???

    @stub
    // Returns the primary 2 color.
    protected def getPrimary2(): ColorUIResource = ???

    @stub
    // Returns the primary 3 color.
    protected def getPrimary3(): ColorUIResource = ???

    @stub
    // Returns the secondary 1 color.
    protected def getSecondary1(): ColorUIResource = ???

    @stub
    // Returns the secondary 2 color.
    protected def getSecondary2(): ColorUIResource = ???
}

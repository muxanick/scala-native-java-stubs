package javax.swing.plaf.metal

import java.lang.{Object, String}
import javax.swing.UIDefaults
import javax.swing.plaf.ColorUIResource
import scala.scalanative.annotation.stub

/** The default theme for the MetalLookAndFeel.
 *  
 *  The designers
 *  of the Metal Look and Feel strive to keep the default look up to
 *  date, possibly through the use of new themes in the future.
 *  Therefore, developers should only use this class directly when they
 *  wish to customize the "Ocean" look, or force it to be the current
 *  theme, regardless of future updates.
 * 
 *  
 *  All colors returned by OceanTheme are completely
 *  opaque.
 */
class OceanTheme extends DefaultMetalTheme {

    /** Creates an instance of OceanTheme */
    @stub
    def this() = ???

    /** Add this theme's custom entries to the defaults table. */
    @stub
    def addCustomEntriesToTable(table: UIDefaults): Unit = ???

    /** Returns the black color. */
    @stub
    protected def getBlack(): ColorUIResource = ???

    /** Returns the control text color. */
    @stub
    def getControlTextColor(): ColorUIResource = ???

    /** Returns the desktop color. */
    @stub
    def getDesktopColor(): ColorUIResource = ???

    /** Returns the inactive control text color. */
    @stub
    def getInactiveControlTextColor(): ColorUIResource = ???

    /** Returns the menu disabled foreground color. */
    @stub
    def getMenuDisabledForeground(): ColorUIResource = ???

    /** Return the name of this theme, "Ocean". */
    @stub
    def getName(): String = ???

    /** Returns the primary 1 color. */
    @stub
    protected def getPrimary1(): ColorUIResource = ???

    /** Returns the primary 2 color. */
    @stub
    protected def getPrimary2(): ColorUIResource = ???

    /** Returns the primary 3 color. */
    @stub
    protected def getPrimary3(): ColorUIResource = ???

    /** Returns the secondary 1 color. */
    @stub
    protected def getSecondary1(): ColorUIResource = ???

    /** Returns the secondary 2 color. */
    @stub
    protected def getSecondary2(): ColorUIResource = ???

    /** Returns the secondary 3 color. */
    @stub
    protected def getSecondary3(): ColorUIResource = ???
}

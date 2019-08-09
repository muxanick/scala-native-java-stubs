package javax.swing.plaf.metal

import java.lang.{Object, String}
import javax.swing.UIDefaults
import javax.swing.plaf.{ColorUIResource, FontUIResource}
import scala.scalanative.annotation.stub

/** MetalTheme provides the color palette and fonts used by
 *  the Java Look and Feel.
 *  
 *  MetalTheme is abstract, see DefaultMetalTheme and
 *  OceanTheme for concrete implementations.
 *  
 *  MetalLookAndFeel maintains the current theme that the
 *  the ComponentUI implementations for metal use. Refer to
 *  MetalLookAndFeel.setCurrentTheme(MetalTheme) for details on changing
 *  the current theme.
 *  
 *  MetalTheme provides a number of public methods for getting
 *  colors. These methods are implemented in terms of a
 *  handful of protected abstract methods. A subclass need only override
 *  the protected abstract methods (getPrimary1,
 *  getPrimary2, getPrimary3, getSecondary1,
 *  getSecondary2, and getSecondary3); although a subclass
 *  may override the other public methods for more control over the set of
 *  colors that are used.
 *  
 *  Concrete implementations of MetalTheme must return non-null
 *  values from all methods. While the behavior of returning null is
 *  not specified, returning null will result in incorrect behavior.
 *  
 *  It is strongly recommended that subclasses return completely opaque colors.
 *  To do otherwise may result in rendering problems, such as visual garbage.
 */
abstract class MetalTheme extends Object {

    /**  */
    @stub
    def this() = ???

    /** Adds values specific to this theme to the defaults table. */
    def addCustomEntriesToTable(table: UIDefaults): Unit

    /** Returns the accelerator foreground color. */
    def getAcceleratorForeground(): ColorUIResource

    /** Returns the accelerator selected foreground color. */
    def getAcceleratorSelectedForeground(): ColorUIResource

    /** Returns the black color. */
    protected def getBlack(): ColorUIResource

    /** Returns the control color. */
    def getControl(): ColorUIResource

    /** Returns the control dark shadow color. */
    def getControlDarkShadow(): ColorUIResource

    /** Returns the control disabled color. */
    def getControlDisabled(): ColorUIResource

    /** Returns the control highlight color. */
    def getControlHighlight(): ColorUIResource

    /** Returns the control info color. */
    def getControlInfo(): ColorUIResource

    /** Returns the control shadow color. */
    def getControlShadow(): ColorUIResource

    /** Returns the control text color. */
    def getControlTextColor(): ColorUIResource

    /** Returns the control text font. */
    def getControlTextFont(): FontUIResource

    /** Returns the desktop color. */
    def getDesktopColor(): ColorUIResource

    /** Returns the focus color. */
    def getFocusColor(): ColorUIResource

    /** Returns the highlighted text color. */
    def getHighlightedTextColor(): ColorUIResource

    /** Returns the inactive control text color. */
    def getInactiveControlTextColor(): ColorUIResource

    /** Returns the inactive system text color. */
    def getInactiveSystemTextColor(): ColorUIResource

    /** Returns the menu background color. */
    def getMenuBackground(): ColorUIResource

    /** Returns the menu disabled foreground color. */
    def getMenuDisabledForeground(): ColorUIResource

    /** Returns the menu foreground color. */
    def getMenuForeground(): ColorUIResource

    /** Returns the menu selected background color. */
    def getMenuSelectedBackground(): ColorUIResource

    /** Returns the menu selected foreground color. */
    def getMenuSelectedForeground(): ColorUIResource

    /** Returns the menu text font. */
    def getMenuTextFont(): FontUIResource

    /** Returns the name of this theme. */
    def getName(): String

    /** Returns the primary 1 color. */
    protected def getPrimary1(): ColorUIResource

    /** Returns the primary 2 color. */
    protected def getPrimary2(): ColorUIResource

    /** Returns the primary 3 color. */
    protected def getPrimary3(): ColorUIResource

    /** Returns the primary control color. */
    def getPrimaryControl(): ColorUIResource

    /** Returns the primary control dark shadow color. */
    def getPrimaryControlDarkShadow(): ColorUIResource

    /** Returns the primary control highlight color. */
    def getPrimaryControlHighlight(): ColorUIResource

    /** Returns the primary control info color. */
    def getPrimaryControlInfo(): ColorUIResource

    /** Returns the primary control shadow color. */
    def getPrimaryControlShadow(): ColorUIResource

    /** Returns the secondary 1 color. */
    protected def getSecondary1(): ColorUIResource

    /** Returns the secondary 2 color. */
    protected def getSecondary2(): ColorUIResource

    /** Returns the secondary 3 color. */
    protected def getSecondary3(): ColorUIResource

    /** Returns the separator background color. */
    def getSeparatorBackground(): ColorUIResource

    /** Returns the separator foreground color. */
    def getSeparatorForeground(): ColorUIResource

    /** Returns the sub-text font. */
    def getSubTextFont(): FontUIResource

    /** Returns the system text color. */
    def getSystemTextColor(): ColorUIResource

    /** Returns the system text font. */
    def getSystemTextFont(): FontUIResource

    /** Returns the text highlight color. */
    def getTextHighlightColor(): ColorUIResource

    /** Returns the user text color. */
    def getUserTextColor(): ColorUIResource

    /** Returns the user text font. */
    def getUserTextFont(): FontUIResource

    /** Returns the white color. */
    protected def getWhite(): ColorUIResource

    /** Returns the window background color. */
    def getWindowBackground(): ColorUIResource

    /** Returns the window title background color. */
    def getWindowTitleBackground(): ColorUIResource

    /** Returns the window title font. */
    def getWindowTitleFont(): FontUIResource

    /** Returns the window title foreground color. */
    def getWindowTitleForeground(): ColorUIResource

    /** Returns the window title inactive background color. */
    def getWindowTitleInactiveBackground(): ColorUIResource

    /** Returns the window title inactive foreground color. */
    def getWindowTitleInactiveForeground(): ColorUIResource
}

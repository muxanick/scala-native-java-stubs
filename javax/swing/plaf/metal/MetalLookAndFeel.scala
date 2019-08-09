package javax.swing.plaf.metal

import java.awt.Component
import java.lang.{Object, String}
import javax.swing.{Icon, JComponent, LayoutStyle, LookAndFeel, UIDefaults}
import javax.swing.plaf.{ColorUIResource, FontUIResource}
import javax.swing.plaf.basic.BasicLookAndFeel
import scala.scalanative.annotation.stub

/** The Java Look and Feel, otherwise known as Metal.
 *  
 *  Each of the ComponentUIs provided by MetalLookAndFeel derives its behavior from the defaults
 *  table. Unless otherwise noted each of the ComponentUI
 *  implementations in this package document the set of defaults they
 *  use. Unless otherwise noted the defaults are installed at the time
 *  installUI is invoked, and follow the recommendations
 *  outlined in LookAndFeel for installing defaults.
 *  
 *  MetalLookAndFeel derives it's color palette and fonts from
 *  MetalTheme. The default theme is OceanTheme. The theme
 *  can be changed using the setCurrentTheme method, refer to it
 *  for details on changing the theme. Prior to 1.5 the default
 *  theme was DefaultMetalTheme. The system property
 *  "swing.metalTheme" can be set to "steel" to indicate
 *  the default should be DefaultMetalTheme.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class MetalLookAndFeel extends BasicLookAndFeel {

    /**  */
    @stub
    def this() = ???

    /** Ensures the current MetalTheme is non-null. */
    @stub
    protected def createDefaultTheme(): Unit = ???

    /** Returns the look and feel defaults. */
    @stub
    def getDefaults(): UIDefaults = ???

    /** Returns a short description of this look and feel. */
    @stub
    def getDescription(): String = ???

    /** Returns an Icon with a disabled appearance. */
    @stub
    def getDisabledIcon(component: JComponent, icon: Icon): Icon = ???

    /** Returns an Icon for use by disabled
     *  components that are also selected.
     */
    @stub
    def getDisabledSelectedIcon(component: JComponent, icon: Icon): Icon = ???

    /** Returns an identifier for this look and feel. */
    @stub
    def getID(): String = ???

    /** Returns a LayoutStyle implementing the Java look and feel
     *  design guidelines as specified at
     *  http://www.oracle.com/technetwork/java/hig-136467.html.
     */
    @stub
    def getLayoutStyle(): LayoutStyle = ???

    /** Returns the name of this look and feel. */
    @stub
    def getName(): String = ???

    /** Returns true; metal can provide Window
     *  decorations.
     */
    @stub
    def getSupportsWindowDecorations(): Boolean = ???

    /** Populates table with mappings from uiClassID to
     *  the fully qualified name of the ui class.
     */
    @stub
    protected def initClassDefaults(table: UIDefaults): Unit = ???

    /** Populates table with the defaults for metal. */
    @stub
    protected def initComponentDefaults(table: UIDefaults): Unit = ???

    /** Populates table with system colors. */
    @stub
    protected def initSystemColorDefaults(table: UIDefaults): Unit = ???

    /** Returns false; MetalLookAndFeel is not a native
     *  look and feel.
     */
    @stub
    def isNativeLookAndFeel(): Boolean = ???

    /** Returns true; MetalLookAndFeel can be run on
     *  any platform.
     */
    @stub
    def isSupportedLookAndFeel(): Boolean = ???

    /** Invoked when the user attempts an invalid operation,
     *  such as pasting into an uneditable JTextField
     *  that has focus.
     */
    @stub
    def provideErrorFeedback(component: Component): Unit = ???
}

object MetalLookAndFeel {
    /** Returns the accelerator foreground color of the current theme. */
    @stub
    def getAcceleratorForeground(): ColorUIResource = ???

    /** Returns the accelerator selected foreground color of the
     *  current theme.
     */
    @stub
    def getAcceleratorSelectedForeground(): ColorUIResource = ???

    /** Returns the black color of the current theme. */
    @stub
    def getBlack(): ColorUIResource = ???

    /** Returns the control color of the current theme. */
    @stub
    def getControl(): ColorUIResource = ???

    /** Returns the control dark shadow color of the current theme. */
    @stub
    def getControlDarkShadow(): ColorUIResource = ???

    /** Returns the control disabled color of the current theme. */
    @stub
    def getControlDisabled(): ColorUIResource = ???

    /** Returns the control highlight color of the current theme. */
    @stub
    def getControlHighlight(): ColorUIResource = ???

    /** Returns the control info color of the current theme. */
    @stub
    def getControlInfo(): ColorUIResource = ???

    /** Returns the control shadow color of the current theme. */
    @stub
    def getControlShadow(): ColorUIResource = ???

    /** Returns the control text color of the current theme. */
    @stub
    def getControlTextColor(): ColorUIResource = ???

    /** Returns the control text font of the current theme. */
    @stub
    def getControlTextFont(): FontUIResource = ???

    /** Return the theme currently being used by MetalLookAndFeel. */
    @stub
    def getCurrentTheme(): MetalTheme = ???

    /** Returns the desktop color of the current theme. */
    @stub
    def getDesktopColor(): ColorUIResource = ???

    /** Returns the focus color of the current theme. */
    @stub
    def getFocusColor(): ColorUIResource = ???

    /** Returns the highlighted text color of the current theme. */
    @stub
    def getHighlightedTextColor(): ColorUIResource = ???

    /** Returns the inactive control text color of the current theme. */
    @stub
    def getInactiveControlTextColor(): ColorUIResource = ???

    /** Returns the inactive system text color of the current theme. */
    @stub
    def getInactiveSystemTextColor(): ColorUIResource = ???

    /** Returns the menu background color of the current theme. */
    @stub
    def getMenuBackground(): ColorUIResource = ???

    /** Returns the menu disabled foreground color of the current theme. */
    @stub
    def getMenuDisabledForeground(): ColorUIResource = ???

    /** Returns the menu foreground color of the current theme. */
    @stub
    def getMenuForeground(): ColorUIResource = ???

    /** Returns the menu selected background color of the current theme. */
    @stub
    def getMenuSelectedBackground(): ColorUIResource = ???

    /** Returns the menu selected foreground color of the current theme. */
    @stub
    def getMenuSelectedForeground(): ColorUIResource = ???

    /** Returns the menu text font of the current theme. */
    @stub
    def getMenuTextFont(): FontUIResource = ???

    /** Returns the primary control color of the current theme. */
    @stub
    def getPrimaryControl(): ColorUIResource = ???

    /** Returns the primary control dark shadow color of the current
     *  theme.
     */
    @stub
    def getPrimaryControlDarkShadow(): ColorUIResource = ???

    /** Returns the primary control highlight color of the current
     *  theme.
     */
    @stub
    def getPrimaryControlHighlight(): ColorUIResource = ???

    /** Returns the primary control info color of the current theme. */
    @stub
    def getPrimaryControlInfo(): ColorUIResource = ???

    /** Returns the primary control shadow color of the current theme. */
    @stub
    def getPrimaryControlShadow(): ColorUIResource = ???

    /** Returns the separator background color of the current theme. */
    @stub
    def getSeparatorBackground(): ColorUIResource = ???

    /** Returns the separator foreground color of the current theme. */
    @stub
    def getSeparatorForeground(): ColorUIResource = ???

    /** Returns the sub-text font of the current theme. */
    @stub
    def getSubTextFont(): FontUIResource = ???

    /** Returns the system text color of the current theme. */
    @stub
    def getSystemTextColor(): ColorUIResource = ???

    /** Returns the system text font of the current theme. */
    @stub
    def getSystemTextFont(): FontUIResource = ???

    /** Returns the text highlight color of the current theme. */
    @stub
    def getTextHighlightColor(): ColorUIResource = ???

    /** Returns the user text color of the current theme. */
    @stub
    def getUserTextColor(): ColorUIResource = ???

    /** Returns the user text font of the current theme. */
    @stub
    def getUserTextFont(): FontUIResource = ???

    /** Returns the white color of the current theme. */
    @stub
    def getWhite(): ColorUIResource = ???

    /** Returns the window background color of the current theme. */
    @stub
    def getWindowBackground(): ColorUIResource = ???

    /** Returns the window title background color of the current
     *  theme.
     */
    @stub
    def getWindowTitleBackground(): ColorUIResource = ???

    /** Returns the window title font of the current theme. */
    @stub
    def getWindowTitleFont(): FontUIResource = ???

    /** Returns the window title foreground color of the current
     *  theme.
     */
    @stub
    def getWindowTitleForeground(): ColorUIResource = ???

    /** Returns the window title inactive background color of the current
     *  theme.
     */
    @stub
    def getWindowTitleInactiveBackground(): ColorUIResource = ???

    /** Returns the window title inactive foreground color of the current
     *  theme.
     */
    @stub
    def getWindowTitleInactiveForeground(): ColorUIResource = ???

    /** Set the theme used by MetalLookAndFeel. */
    @stub
    def setCurrentTheme(theme: MetalTheme): Unit = ???
}

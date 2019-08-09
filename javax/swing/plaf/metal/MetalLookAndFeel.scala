package javax.swing.plaf.metal

import java.awt.Component
import java.lang.{Object, String}
import javax.swing.{Icon, JComponent, LayoutStyle, LookAndFeel, UIDefaults}
import javax.swing.plaf.{ColorUIResource, FontUIResource}
import javax.swing.plaf.basic.BasicLookAndFeel

// The Java Look and Feel, otherwise known as Metal.
// 
// Each of the ComponentUIs provided by MetalLookAndFeel derives its behavior from the defaults
// table. Unless otherwise noted each of the ComponentUI
// implementations in this package document the set of defaults they
// use. Unless otherwise noted the defaults are installed at the time
// installUI is invoked, and follow the recommendations
// outlined in LookAndFeel for installing defaults.
// 
// MetalLookAndFeel derives it's color palette and fonts from
// MetalTheme. The default theme is OceanTheme. The theme
// can be changed using the setCurrentTheme method, refer to it
// for details on changing the theme. Prior to 1.5 the default
// theme was DefaultMetalTheme. The system property
// "swing.metalTheme" can be set to "steel" to indicate
// the default should be DefaultMetalTheme.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class MetalLookAndFeel extends BasicLookAndFeel {

    @stub
    // Ensures the current MetalTheme is non-null.
    protected def createDefaultTheme(): Unit = ???

    @stub
    // Returns the look and feel defaults.
    def getDefaults(): UIDefaults = ???

    @stub
    // Returns a short description of this look and feel.
    def getDescription(): String = ???

    @stub
    // Returns an Icon with a disabled appearance.
    def getDisabledIcon(component: JComponent, icon: Icon): Icon = ???

    @stub
    // Returns an Icon for use by disabled
    // components that are also selected.
    def getDisabledSelectedIcon(component: JComponent, icon: Icon): Icon = ???

    @stub
    // Returns an identifier for this look and feel.
    def getID(): String = ???

    @stub
    // Returns a LayoutStyle implementing the Java look and feel
    // design guidelines as specified at
    // http://www.oracle.com/technetwork/java/hig-136467.html.
    def getLayoutStyle(): LayoutStyle = ???

    @stub
    // Returns the name of this look and feel.
    def getName(): String = ???

    @stub
    // Returns true; metal can provide Window
    // decorations.
    def getSupportsWindowDecorations(): Boolean = ???

    @stub
    // Populates table with mappings from uiClassID to
    // the fully qualified name of the ui class.
    protected def initClassDefaults(table: UIDefaults): Unit = ???

    @stub
    // Populates table with the defaults for metal.
    protected def initComponentDefaults(table: UIDefaults): Unit = ???

    @stub
    // Populates table with system colors.
    protected def initSystemColorDefaults(table: UIDefaults): Unit = ???

    @stub
    // Returns false; MetalLookAndFeel is not a native
    // look and feel.
    def isNativeLookAndFeel(): Boolean = ???

    @stub
    // Returns true; MetalLookAndFeel can be run on
    // any platform.
    def isSupportedLookAndFeel(): Boolean = ???

    @stub
    // Invoked when the user attempts an invalid operation,
    // such as pasting into an uneditable JTextField
    // that has focus.
    def provideErrorFeedback(component: Component): Unit = ???
}

object MetalLookAndFeel {
    @stub
    // Returns the accelerator foreground color of the current theme.
    def getAcceleratorForeground(): ColorUIResource = ???

    @stub
    // Returns the accelerator selected foreground color of the
    // current theme.
    def getAcceleratorSelectedForeground(): ColorUIResource = ???

    @stub
    // Returns the black color of the current theme.
    def getBlack(): ColorUIResource = ???

    @stub
    // Returns the control color of the current theme.
    def getControl(): ColorUIResource = ???

    @stub
    // Returns the control dark shadow color of the current theme.
    def getControlDarkShadow(): ColorUIResource = ???

    @stub
    // Returns the control disabled color of the current theme.
    def getControlDisabled(): ColorUIResource = ???

    @stub
    // Returns the control highlight color of the current theme.
    def getControlHighlight(): ColorUIResource = ???

    @stub
    // Returns the control info color of the current theme.
    def getControlInfo(): ColorUIResource = ???

    @stub
    // Returns the control shadow color of the current theme.
    def getControlShadow(): ColorUIResource = ???

    @stub
    // Returns the control text color of the current theme.
    def getControlTextColor(): ColorUIResource = ???

    @stub
    // Returns the control text font of the current theme.
    def getControlTextFont(): FontUIResource = ???

    @stub
    // Return the theme currently being used by MetalLookAndFeel.
    def getCurrentTheme(): MetalTheme = ???

    @stub
    // Returns the desktop color of the current theme.
    def getDesktopColor(): ColorUIResource = ???

    @stub
    // Returns the focus color of the current theme.
    def getFocusColor(): ColorUIResource = ???

    @stub
    // Returns the highlighted text color of the current theme.
    def getHighlightedTextColor(): ColorUIResource = ???

    @stub
    // Returns the inactive control text color of the current theme.
    def getInactiveControlTextColor(): ColorUIResource = ???

    @stub
    // Returns the inactive system text color of the current theme.
    def getInactiveSystemTextColor(): ColorUIResource = ???

    @stub
    // Returns the menu background color of the current theme.
    def getMenuBackground(): ColorUIResource = ???

    @stub
    // Returns the menu disabled foreground color of the current theme.
    def getMenuDisabledForeground(): ColorUIResource = ???

    @stub
    // Returns the menu foreground color of the current theme.
    def getMenuForeground(): ColorUIResource = ???

    @stub
    // Returns the menu selected background color of the current theme.
    def getMenuSelectedBackground(): ColorUIResource = ???

    @stub
    // Returns the menu selected foreground color of the current theme.
    def getMenuSelectedForeground(): ColorUIResource = ???

    @stub
    // Returns the menu text font of the current theme.
    def getMenuTextFont(): FontUIResource = ???

    @stub
    // Returns the primary control color of the current theme.
    def getPrimaryControl(): ColorUIResource = ???

    @stub
    // Returns the primary control dark shadow color of the current
    // theme.
    def getPrimaryControlDarkShadow(): ColorUIResource = ???

    @stub
    // Returns the primary control highlight color of the current
    // theme.
    def getPrimaryControlHighlight(): ColorUIResource = ???

    @stub
    // Returns the primary control info color of the current theme.
    def getPrimaryControlInfo(): ColorUIResource = ???

    @stub
    // Returns the primary control shadow color of the current theme.
    def getPrimaryControlShadow(): ColorUIResource = ???

    @stub
    // Returns the separator background color of the current theme.
    def getSeparatorBackground(): ColorUIResource = ???

    @stub
    // Returns the separator foreground color of the current theme.
    def getSeparatorForeground(): ColorUIResource = ???

    @stub
    // Returns the sub-text font of the current theme.
    def getSubTextFont(): FontUIResource = ???

    @stub
    // Returns the system text color of the current theme.
    def getSystemTextColor(): ColorUIResource = ???

    @stub
    // Returns the system text font of the current theme.
    def getSystemTextFont(): FontUIResource = ???

    @stub
    // Returns the text highlight color of the current theme.
    def getTextHighlightColor(): ColorUIResource = ???

    @stub
    // Returns the user text color of the current theme.
    def getUserTextColor(): ColorUIResource = ???

    @stub
    // Returns the user text font of the current theme.
    def getUserTextFont(): FontUIResource = ???

    @stub
    // Returns the white color of the current theme.
    def getWhite(): ColorUIResource = ???

    @stub
    // Returns the window background color of the current theme.
    def getWindowBackground(): ColorUIResource = ???

    @stub
    // Returns the window title background color of the current
    // theme.
    def getWindowTitleBackground(): ColorUIResource = ???

    @stub
    // Returns the window title font of the current theme.
    def getWindowTitleFont(): FontUIResource = ???

    @stub
    // Returns the window title foreground color of the current
    // theme.
    def getWindowTitleForeground(): ColorUIResource = ???

    @stub
    // Returns the window title inactive background color of the current
    // theme.
    def getWindowTitleInactiveBackground(): ColorUIResource = ???

    @stub
    // Returns the window title inactive foreground color of the current
    // theme.
    def getWindowTitleInactiveForeground(): ColorUIResource = ???
}

package javax.swing.plaf.metal

import java.lang.{Object, String}
import javax.swing.plaf.{ColorUIResource, FontUIResource}

/** A concrete implementation of MetalTheme providing
 *  the original look of the Java Look and Feel, code-named "Steel". Refer
 *  to MetalLookAndFeel.setCurrentTheme(javax.swing.plaf.metal.MetalTheme) for details on changing
 *  the default theme.
 *  
 *  All colors returned by DefaultMetalTheme are completely
 *  opaque.
 * 
 *  Font Style
 * 
 *  DefaultMetalTheme uses bold fonts for many controls.  To make all
 *  controls (with the exception of the internal frame title bars and
 *  client decorated frame title bars) use plain fonts you can do either of
 *  the following:
 *  
 *  Set the system property swing.boldMetal to
 *      false.  For example,
 *      java -Dswing.boldMetal=false MyApp.
 *  Set the defaults property swing.boldMetal to
 *      Boolean.FALSE.  For example:
 *      UIManager.put("swing.boldMetal", Boolean.FALSE);
 *  
 *  The defaults property swing.boldMetal, if set,
 *  takes precedence over the system property of the same name. After
 *  setting this defaults property you need to re-install
 *  MetalLookAndFeel, as well as update the UI
 *  of any previously created widgets. Otherwise the results are undefined.
 *  The following illustrates how to do this:
 *  
 *    // turn off bold fonts
 *    UIManager.put("swing.boldMetal", Boolean.FALSE);
 * 
 *    // re-install the Metal Look and Feel
 *    UIManager.setLookAndFeel(new MetalLookAndFeel());
 * 
 *    // Update the ComponentUIs for all Components. This
 *    // needs to be invoked for all windows.
 *    SwingUtilities.updateComponentTreeUI(rootComponent);
 *  
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
class DefaultMetalTheme extends MetalTheme {

    /** Returns the control text font. */
    @stub
    def getControlTextFont(): FontUIResource = ???

    /** Returns the menu text font. */
    @stub
    def getMenuTextFont(): FontUIResource = ???

    /** Returns the name of this theme. */
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

    /** Returns the sub-text font. */
    @stub
    def getSubTextFont(): FontUIResource = ???

    /** Returns the system text font. */
    @stub
    def getSystemTextFont(): FontUIResource = ???

    /** Returns the user text font. */
    @stub
    def getUserTextFont(): FontUIResource = ???
}

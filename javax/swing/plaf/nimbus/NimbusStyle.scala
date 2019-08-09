package javax.swing.plaf.nimbus

import java.awt.{Color, Font, Insets}
import java.lang.{Object, String}
import javax.swing.Painter
import javax.swing.plaf.synth.{ColorType, SynthContext, SynthPainter, SynthStyle}
import scala.scalanative.annotation.stub

/** A SynthStyle implementation used by Nimbus. Each Region that has been
 *  registered with the NimbusLookAndFeel will have an associated NimbusStyle.
 *  Third party components that are registered with the NimbusLookAndFeel will
 *  therefore be handed a NimbusStyle from the look and feel from the
 *  #getStyle(JComponent, Region) method.
 * 
 *  This class properly reads and retrieves values placed in the UIDefaults
 *  according to the standard Nimbus naming conventions. It will create and
 *  retrieve painters, fonts, colors, and other data stored there.
 * 
 *  NimbusStyle also supports the ability to override settings on a per
 *  component basis. NimbusStyle checks the component's client property map for
 *  "Nimbus.Overrides". If the value associated with this key is an instance of
 *  UIDefaults, then the values in that defaults table will override the standard
 *  Nimbus defaults in UIManager, but for that component instance only.
 * 
 *  Optionally, you may specify the client property
 *  "Nimbus.Overrides.InheritDefaults". If true, this client property indicates
 *  that the defaults located in UIManager should first be read, and then
 *  replaced with defaults located in the component client properties. If false,
 *  then only the defaults located in the component client property map will
 *  be used. If not specified, it is assumed to be true.
 * 
 *  You must specify "Nimbus.Overrides" for "Nimbus.Overrides.InheritDefaults"
 *  to have any effect. "Nimbus.Overrides" indicates whether there are any
 *  overrides, while "Nimbus.Overrides.InheritDefaults" indicates whether those
 *  overrides should first be initialized with the defaults from UIManager.
 * 
 *  The NimbusStyle is reloaded whenever a property change event is fired
 *  for a component for "Nimbus.Overrides" or "Nimbus.Overrides.InheritDefaults".
 *  So for example, setting a new UIDefaults on a component would cause the
 *  style to be reloaded.
 * 
 *  The values are only read out of UIManager once, and then cached. If
 *  you need to read the values again (for example, if the UI is being reloaded),
 *  then discard this NimbusStyle and read a new one from NimbusLookAndFeel
 *  using NimbusLookAndFeel.getStyle.
 * 
 *  The primary API of interest in this class for 3rd party component authors
 *  are the three methods which retrieve painters: #getBackgroundPainter,
 *  #getForegroundPainter, and #getBorderPainter.
 * 
 *  NimbusStyle allows you to specify custom states, or modify the order of
 *  states. Synth (and thus Nimbus) has the concept of a "state". For example,
 *  a JButton might be in the "MOUSE_OVER" state, or the "ENABLED" state, or the
 *  "DISABLED" state. These are all "standard" states which are defined in synth,
 *  and which apply to all synth Regions.
 * 
 *  Sometimes, however, you need to have a custom state. For example, you
 *  want JButton to render differently if it's parent is a JToolbar. In Nimbus,
 *  you specify these custom states by including a special key in UIDefaults.
 *  The following UIDefaults entries define three states for this button:
 * 
 *  
 *      JButton.States = Enabled, Disabled, Toolbar
 *      JButton[Enabled].backgroundPainter = somePainter
 *      JButton[Disabled].background = BLUE
 *      JButton[Toolbar].backgroundPainter = someOtherPaint
 *  
 * 
 *  As you can see, the JButton.States entry lists the states
 *  that the JButton style will support. You then specify the settings for
 *  each state. If you do not specify the JButton.States entry,
 *  then the standard Synth states will be assumed. If you specify the entry
 *  but the list of states is empty or null, then the standard synth states
 *  will be assumed.
 */
final class NimbusStyle extends SynthStyle {

    /** Getter for a region specific style property. */
    @stub
    def get(ctx: SynthContext, key: Object): Object = ???

    /** Gets the appropriate background Painter, if there is one, for the state
     *  specified in the given SynthContext.
     */
    @stub
    def getBackgroundPainter(ctx: SynthContext): Painter = ???

    /** Gets the appropriate border Painter, if there is one, for the state
     *  specified in the given SynthContext.
     */
    @stub
    def getBorderPainter(ctx: SynthContext): Painter = ???

    /** Returns the color for the specified state. */
    @stub
    protected def getColorForState(ctx: SynthContext, type: ColorType): Color = ???

    /** Returns the font for the specified state. */
    @stub
    protected def getFontForState(ctx: SynthContext): Font = ???

    /** Gets the appropriate foreground Painter, if there is one, for the state
     *  specified in the given SynthContext.
     */
    @stub
    def getForegroundPainter(ctx: SynthContext): Painter = ???

    /** Returns the Insets that are used to calculate sizing information. */
    @stub
    def getInsets(ctx: SynthContext, in: Insets): Insets = ???

    /** Returns the SynthPainter that will be used for painting. */
    @stub
    def getPainter(ctx: SynthContext): SynthPainter = ???

    /** Installs the necessary state from this Style on the
     *  JComponent from context.
     */
    @stub
    def installDefaults(ctx: SynthContext): Unit = ???

    /** Returns true if the region is opaque. */
    @stub
    def isOpaque(ctx: SynthContext): Boolean = ???
}

object NimbusStyle {
    /**  */
    @stub
    val LARGE_KEY: String = ???

    /**  */
    @stub
    val LARGE_SCALE: Double = ???

    /**  */
    @stub
    val MINI_KEY: String = ???

    /**  */
    @stub
    val MINI_SCALE: Double = ???

    /**  */
    @stub
    val SMALL_KEY: String = ???

    /**  */
    @stub
    val SMALL_SCALE: Double = ???
}

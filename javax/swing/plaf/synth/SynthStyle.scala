package javax.swing.plaf.synth

import java.awt.{Color, Font, Insets}
import java.lang.{Object, String}
import javax.swing.Icon

// SynthStyle is a set of style properties.
// Each SynthUI references at least one
// SynthStyle that is obtained using a
// SynthStyleFactory. You typically don't need to interact with
// this class directly, rather you will load a
// Synth File Format file into
// SynthLookAndFeel that will create a set of SynthStyles.
abstract class SynthStyle extends Object {

    // Getter for a region specific style property.
    def get(context: SynthContext, key: Object): Object

    // Convenience method to get a specific style property whose value is
    // an Boolean.
    def getBoolean(context: SynthContext, key: Object, defaultValue: Boolean): Boolean

    // Returns the color for the specified state.
    def getColor(context: SynthContext, type: ColorType): Color

    // Returns the color for the specified state.
    protected def getColorForState(context: SynthContext, type: ColorType): Color

    // Returns the Font for the specified state.
    def getFont(context: SynthContext): Font

    // Returns the font for the specified state.
    protected def getFontForState(context: SynthContext): Font

    // Returns the SynthGraphicUtils for the specified context.
    def getGraphicsUtils(context: SynthContext): SynthGraphicsUtils

    // Convenience method to get a specific style property whose value is
    // an Icon.
    def getIcon(context: SynthContext, key: Object): Icon

    // Returns the Insets that are used to calculate sizing information.
    def getInsets(context: SynthContext, insets: Insets): Insets

    // Convenience method to get a specific style property whose value is
    // a Number.
    def getInt(context: SynthContext, key: Object, defaultValue: Int): Int

    // Returns the SynthPainter that will be used for painting.
    def getPainter(context: SynthContext): SynthPainter

    // Convenience method to get a specific style property whose value is
    // a String.
    def getString(context: SynthContext, key: Object, defaultValue: String): String

    // Installs the necessary state from this Style on the
    // JComponent from context.
    def installDefaults(context: SynthContext): Unit

    // Returns true if the region is opaque.
    def isOpaque(context: SynthContext): Boolean
}

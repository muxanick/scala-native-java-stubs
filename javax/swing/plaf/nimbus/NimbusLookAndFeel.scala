package javax.swing.plaf.nimbus

import java.awt.Color
import java.beans.PropertyChangeEvent
import java.lang.{Object, String}
import javax.swing.{Icon, JComponent, LookAndFeel, UIDefaults}
import javax.swing.plaf.basic.BasicLookAndFeel
import javax.swing.plaf.synth.{Region, SynthLookAndFeel}

// The NimbusLookAndFeel class.
class NimbusLookAndFeel extends SynthLookAndFeel {

    @stub
    // Returns the defaults for this SynthLookAndFeel.
    def getDefaults(): UIDefaults = ???

    @stub
    // Decodes and returns a color, which is derived from a offset between two
    // other colors.
    protected def getDerivedColor(color1: Color, color2: Color, midPoint: float): Color = ???

    @stub
    // Decodes and returns a color, which is derived from an offset between two
    // other colors.
    protected def getDerivedColor(color1: Color, color2: Color, midPoint: float, uiResource: Boolean): Color = ???

    @stub
    // Get a derived color, derived colors are shared instances and is color
    // value will change when its parent UIDefault color changes.
    def getDerivedColor(uiDefaultParentName: String, hOffset: float, sOffset: float, bOffset: float, aOffset: Int, uiResource: Boolean): Color = ???

    @stub
    // Returns a textual description of this look and feel.
    def getDescription(): String = ???

    @stub
    // Returns an Icon with a disabled appearance.
    def getDisabledIcon(component: JComponent, icon: Icon): Icon = ???

    @stub
    // Return a string that identifies this look and feel.
    def getID(): String = ???

    @stub
    // Return a short string that identifies this look and feel.
    def getName(): String = ???

    @stub
    // Called by UIManager when this look and feel is installed.
    def initialize(): Unit = ???

    @stub
    // Registers a third party component with the NimbusLookAndFeel.
    def register(region: Region, prefix: String): Unit = ???

    @stub
    // Returns whether or not the UIs should update their
    // SynthStyles from the SynthStyleFactory
    // when the ancestor of the JComponent changes.
    def shouldUpdateStyleOnAncestorChanged(): Boolean = ???

    @stub
    // Returns whether or not the UIs should update their styles when a
    // particular event occurs.
    protected def shouldUpdateStyleOnEvent(ev: PropertyChangeEvent): Boolean = ???
}

object NimbusLookAndFeel {
    @stub
    // Gets the style associated with the given component and region.
    def getStyle(c: JComponent, r: Region): NimbusStyle = ???
}

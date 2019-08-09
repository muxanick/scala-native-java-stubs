package javax.swing.plaf.nimbus

import java.awt.Color
import java.beans.PropertyChangeEvent
import java.lang.{Object, String}
import javax.swing.{Icon, JComponent, LookAndFeel, UIDefaults}
import javax.swing.plaf.basic.BasicLookAndFeel
import javax.swing.plaf.synth.{Region, SynthLookAndFeel}
import scala.scalanative.annotation.stub

/** The NimbusLookAndFeel class. */
class NimbusLookAndFeel extends SynthLookAndFeel {

    /** Create a new NimbusLookAndFeel. */
    @stub
    def this() = ???

    /** Returns the defaults for this SynthLookAndFeel. */
    @stub
    def getDefaults(): UIDefaults = ???

    /** Decodes and returns a color, which is derived from a offset between two
     *  other colors.
     */
    @stub
    protected def getDerivedColor(color1: Color, color2: Color, midPoint: Float): Color = ???

    /** Decodes and returns a color, which is derived from an offset between two
     *  other colors.
     */
    @stub
    protected def getDerivedColor(color1: Color, color2: Color, midPoint: Float, uiResource: Boolean): Color = ???

    /** Get a derived color, derived colors are shared instances and is color
     *  value will change when its parent UIDefault color changes.
     */
    @stub
    def getDerivedColor(uiDefaultParentName: String, hOffset: Float, sOffset: Float, bOffset: Float, aOffset: Int, uiResource: Boolean): Color = ???

    /** Returns a textual description of this look and feel. */
    @stub
    def getDescription(): String = ???

    /** Returns an Icon with a disabled appearance. */
    @stub
    def getDisabledIcon(component: JComponent, icon: Icon): Icon = ???

    /** Return a string that identifies this look and feel. */
    @stub
    def getID(): String = ???

    /** Return a short string that identifies this look and feel. */
    @stub
    def getName(): String = ???

    /** Called by UIManager when this look and feel is installed. */
    @stub
    def initialize(): Unit = ???

    /** Registers a third party component with the NimbusLookAndFeel. */
    @stub
    def register(region: Region, prefix: String): Unit = ???

    /** Returns whether or not the UIs should update their
     *  SynthStyles from the SynthStyleFactory
     *  when the ancestor of the JComponent changes.
     */
    @stub
    def shouldUpdateStyleOnAncestorChanged(): Boolean = ???

    /** Returns whether or not the UIs should update their styles when a
     *  particular event occurs.
     */
    @stub
    protected def shouldUpdateStyleOnEvent(ev: PropertyChangeEvent): Boolean = ???

    /** Called by UIManager when this look and feel is uninstalled. */
    @stub
    def uninitialize(): Unit = ???
}

object NimbusLookAndFeel {
    /** Gets the style associated with the given component and region. */
    @stub
    def getStyle(c: JComponent, r: Region): NimbusStyle = ???
}

package javax.swing.plaf.synth

import java.beans.PropertyChangeEvent
import java.io.InputStream
import java.lang.{Class, Object, String}
import java.net.URL
import javax.swing.{JComponent, LookAndFeel, UIDefaults}
import javax.swing.plaf.ComponentUI
import javax.swing.plaf.basic.BasicLookAndFeel

/** SynthLookAndFeel provides the basis for creating a customized look and
 *  feel. SynthLookAndFeel does not directly provide a look, all painting is
 *  delegated.
 *  You need to either provide a configuration file, by way of the
 *  load(java.io.InputStream, java.lang.Class<?>) method, or provide your own SynthStyleFactory
 *  to setStyleFactory(javax.swing.plaf.synth.SynthStyleFactory). Refer to the
 *  package summary for an example of
 *  loading a file, and SynthStyleFactory for
 *  an example of providing your own SynthStyleFactory to
 *  setStyleFactory.
 *  
 *  Warning:
 *  This class implements Serializable as a side effect of it
 *  extending BasicLookAndFeel. It is not intended to be serialized.
 *  An attempt to serialize it will
 *  result in NotSerializableException.
 */
class SynthLookAndFeel extends BasicLookAndFeel {

    /** Returns the defaults for this SynthLookAndFeel. */
    @stub
    def getDefaults(): UIDefaults = ???

    /** Returns a textual description of SynthLookAndFeel. */
    @stub
    def getDescription(): String = ???

    /** Return a string that identifies this look and feel. */
    @stub
    def getID(): String = ???

    /** Return a short string that identifies this look and feel. */
    @stub
    def getName(): String = ???

    /** Called by UIManager when this look and feel is installed. */
    @stub
    def initialize(): Unit = ???

    /** Returns false, SynthLookAndFeel is not a native look and feel. */
    @stub
    def isNativeLookAndFeel(): Boolean = ???

    /** Returns true, SynthLookAndFeel is always supported. */
    @stub
    def isSupportedLookAndFeel(): Boolean = ???

    /** Loads the set of SynthStyles that will be used by
     *  this SynthLookAndFeel.
     */
    @stub
    def load(input: InputStream, resourceBase: Class[_]): Unit = ???

    /** Loads the set of SynthStyles that will be used by
     *  this SynthLookAndFeel.
     */
    @stub
    def load(url: URL): Unit = ???

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

object SynthLookAndFeel {
    /** Creates the Synth look and feel ComponentUI for
     *  the passed in JComponent.
     */
    @stub
    def createUI(c: JComponent): ComponentUI = ???

    /** Returns the Region for the JComponent c. */
    @stub
    def getRegion(c: JComponent): Region = ???

    /** Gets a SynthStyle for the specified region of the specified component. */
    @stub
    def getStyle(c: JComponent, region: Region): SynthStyle = ???

    /** Returns the current SynthStyleFactory. */
    @stub
    def getStyleFactory(): SynthStyleFactory = ???

    /** Sets the SynthStyleFactory that the UI classes provided by
     *  synth will use to obtain a SynthStyle.
     */
    @stub
    def setStyleFactory(cache: SynthStyleFactory): Unit = ???
}

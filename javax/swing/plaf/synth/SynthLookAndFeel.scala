package javax.swing.plaf.synth

import java.beans.PropertyChangeEvent
import java.io.InputStream
import java.lang.{Class, Object, String}
import java.net.URL
import javax.swing.{JComponent, LookAndFeel, UIDefaults}
import javax.swing.plaf.ComponentUI
import javax.swing.plaf.basic.BasicLookAndFeel

// SynthLookAndFeel provides the basis for creating a customized look and
// feel. SynthLookAndFeel does not directly provide a look, all painting is
// delegated.
// You need to either provide a configuration file, by way of the
// load(java.io.InputStream, java.lang.Class<?>) method, or provide your own SynthStyleFactory
// to setStyleFactory(javax.swing.plaf.synth.SynthStyleFactory). Refer to the
// package summary for an example of
// loading a file, and SynthStyleFactory for
// an example of providing your own SynthStyleFactory to
// setStyleFactory.
// 
// Warning:
// This class implements Serializable as a side effect of it
// extending BasicLookAndFeel. It is not intended to be serialized.
// An attempt to serialize it will
// result in NotSerializableException.
class SynthLookAndFeel extends BasicLookAndFeel {

    @stub
    // Returns the defaults for this SynthLookAndFeel.
    def getDefaults(): UIDefaults = ???

    @stub
    // Returns a textual description of SynthLookAndFeel.
    def getDescription(): String = ???

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
    // Returns false, SynthLookAndFeel is not a native look and feel.
    def isNativeLookAndFeel(): Boolean = ???

    @stub
    // Returns true, SynthLookAndFeel is always supported.
    def isSupportedLookAndFeel(): Boolean = ???

    @stub
    // Loads the set of SynthStyles that will be used by
    // this SynthLookAndFeel.
    def load(input: InputStream, resourceBase: Class[_]): Unit = ???

    @stub
    // Loads the set of SynthStyles that will be used by
    // this SynthLookAndFeel.
    def load(url: URL): Unit = ???

    @stub
    // Returns whether or not the UIs should update their
    // SynthStyles from the SynthStyleFactory
    // when the ancestor of the JComponent changes.
    def shouldUpdateStyleOnAncestorChanged(): Boolean = ???

    @stub
    // Returns whether or not the UIs should update their styles when a
    // particular event occurs.
    protected def shouldUpdateStyleOnEvent(ev: PropertyChangeEvent): Boolean = ???

    @stub
    // Called by UIManager when this look and feel is uninstalled.
    def uninitialize(): Unit = ???
}

object SynthLookAndFeel {
    @stub
    // Creates the Synth look and feel ComponentUI for
    // the passed in JComponent.
    def createUI(c: JComponent): ComponentUI = ???

    @stub
    // Returns the Region for the JComponent c.
    def getRegion(c: JComponent): Region = ???

    @stub
    // Gets a SynthStyle for the specified region of the specified component.
    def getStyle(c: JComponent, region: Region): SynthStyle = ???

    @stub
    // Returns the current SynthStyleFactory.
    def getStyleFactory(): SynthStyleFactory = ???

    @stub
    // Sets the SynthStyleFactory that the UI classes provided by
    // synth will use to obtain a SynthStyle.
    def setStyleFactory(cache: SynthStyleFactory): Unit = ???
}

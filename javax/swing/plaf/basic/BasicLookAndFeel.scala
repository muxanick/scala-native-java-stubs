package javax.swing.plaf.basic

import java.io.Serializable
import java.lang.{Object, String}
import javax.swing.{Action, ActionMap, LookAndFeel, UIDefaults}

// A base class to use in creating a look and feel for Swing.
// 
// Each of the ComponentUIs provided by BasicLookAndFeel derives its behavior from the defaults
// table. Unless otherwise noted each of the ComponentUI
// implementations in this package document the set of defaults they
// use. Unless otherwise noted the defaults are installed at the time
// installUI is invoked, and follow the recommendations
// outlined in LookAndFeel for installing defaults.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
abstract class BasicLookAndFeel extends LookAndFeel with Serializable {

    // Creates and returns an Action used to play a sound.
    protected def createAudioAction(key: Object): Action

    // Returns an ActionMap containing the audio actions
    // for this look and feel.
    protected def getAudioActionMap(): ActionMap

    // Returns the look and feel defaults.
    def getDefaults(): UIDefaults

    // Populates table with mappings from uiClassID to the
    // fully qualified name of the ui class.
    protected def initClassDefaults(table: UIDefaults): Unit

    // Populates table with the defaults for the basic look and
    // feel.
    protected def initComponentDefaults(table: UIDefaults): Unit

    // Initializes the look and feel.
    def initialize(): Unit

    // Populates table with system colors.
    protected def initSystemColorDefaults(table: UIDefaults): Unit

    // Populates table with the name-color pairs in
    // systemColors.
    protected def loadSystemColors(table: UIDefaults, systemColors: Array[String], useNative: Boolean): Unit

    // If necessary, invokes actionPerformed on
    // audioAction to play a sound.
    protected def playSound(audioAction: Action): Unit
}

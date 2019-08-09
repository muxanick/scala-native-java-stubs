package javax.swing

import java.awt.{Color, Dimension, Font, Insets}
import java.beans.PropertyChangeListener
import java.io.Serializable
import java.lang.{Object, String}
import java.util.Locale
import javax.swing.border.Border
import javax.swing.plaf.ComponentUI

// UIManager manages the current look and feel, the set of
// available look and feels, PropertyChangeListeners that
// are notified when the look and feel changes, look and feel defaults, and
// convenience methods for obtaining various default values.
//
// Specifying the look and feel
//
// The look and feel can be specified in two distinct ways: by
// specifying the fully qualified name of the class for the look and
// feel, or by creating an instance of LookAndFeel and passing
// it to setLookAndFeel. The following example illustrates
// setting the look and feel to the system look and feel:
// 
//   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
// 
// The following example illustrates setting the look and feel based on
// class name:
// 
//   UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
// 
// Once the look and feel has been changed it is imperative to invoke
// updateUI on all JComponents. The method SwingUtilities.updateComponentTreeUI(java.awt.Component) makes it easy to apply updateUI to a containment hierarchy. Refer to it for
// details. The exact behavior of not invoking updateUI after changing the look and feel is
// unspecified. It is very possible to receive unexpected exceptions,
// painting problems, or worse.
//
// Default look and feel
//
// The class used for the default look and feel is chosen in the following
// manner:
// 
//   If the system property swing.defaultlaf is
//       non-null, use its value as the default look and feel class
//       name.
//   If the Properties file swing.properties
//       exists and contains the key swing.defaultlaf,
//       use its value as the default look and feel class name. The location
//       that is checked for swing.properties may vary depending
//       upon the implementation of the Java platform. Typically the
//       swing.properties file is located in the lib
//       subdirectory of the Java installation directory.
//       Refer to the release notes of the implementation being used for
//       further details.
//   Otherwise use the cross platform look and feel.
// 
//
// Defaults
//
// UIManager manages three sets of UIDefaults. In order, they
// are:
// 
//   Developer defaults. With few exceptions Swing does not
//       alter the developer defaults; these are intended to be modified
//       and used by the developer.
//   Look and feel defaults. The look and feel defaults are
//       supplied by the look and feel at the time it is installed as the
//       current look and feel (setLookAndFeel() is invoked). The
//       look and feel defaults can be obtained using the getLookAndFeelDefaults() method.
//   System defaults. The system defaults are provided by Swing.
// 
// Invoking any of the various get methods
// results in checking each of the defaults, in order, returning
// the first non-null value. For example, invoking
// UIManager.getString("Table.foreground") results in first
// checking developer defaults. If the developer defaults contain
// a value for "Table.foreground" it is returned, otherwise
// the look and feel defaults are checked, followed by the system defaults.
// 
// It's important to note that getDefaults returns a custom
// instance of UIDefaults with this resolution logic built into it.
// For example, UIManager.getDefaults().getString("Table.foreground")
// is equivalent to UIManager.getString("Table.foreground"). Both
// resolve using the algorithm just described. In many places the
// documentation uses the word defaults to refer to the custom instance
// of UIDefaults with the resolution logic as previously described.
// 
// When the look and feel is changed, UIManager alters only the
// look and feel defaults; the developer and system defaults are not
// altered by the UIManager in any way.
// 
// The set of defaults a particular look and feel supports is defined
// and documented by that look and feel. In addition, each look and
// feel, or ComponentUI provided by a look and feel, may
// access the defaults at different times in their life cycle. Some
// look and feels may aggressively look up defaults, so that changing a
// default may not have an effect after installing the look and feel.
// Other look and feels may lazily access defaults so that a change to
// the defaults may effect an existing look and feel. Finally, other look
// and feels might not configure themselves from the defaults table in
// any way. None-the-less it is usually the case that a look and feel
// expects certain defaults, so that in general
// a ComponentUI provided by one look and feel will not
// work with another look and feel.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class UIManager extends Object with Serializable {
}

object UIManager {
    @stub
    // Adds a LookAndFeel to the list of auxiliary look and feels.
    def addAuxiliaryLookAndFeel(laf: LookAndFeel): Unit = ???

    @stub
    // Adds a PropertyChangeListener to the listener list.
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // Returns an object from the defaults.
    def get(key: Object): Object = ???

    @stub
    // Returns an object from the defaults that is appropriate for
    // the given locale.
    def get(key: Object, l: Locale): Object = ???

    @stub
    // Returns the list of auxiliary look and feels (can be null).
    def getAuxiliaryLookAndFeels(): Array[LookAndFeel] = ???

    @stub
    // Returns a boolean from the defaults which is associated with
    // the key value.
    def getBoolean(key: Object): Boolean = ???

    @stub
    // Returns a boolean from the defaults which is associated with
    // the key value and the given Locale.
    def getBoolean(key: Object, l: Locale): Boolean = ???

    @stub
    // Returns a border from the defaults.
    def getBorder(key: Object): Border = ???

    @stub
    // Returns a border from the defaults that is appropriate
    // for the given locale.
    def getBorder(key: Object, l: Locale): Border = ???

    @stub
    // Returns a color from the defaults.
    def getColor(key: Object): Color = ???

    @stub
    // Returns a color from the defaults that is appropriate
    // for the given locale.
    def getColor(key: Object, l: Locale): Color = ???

    @stub
    // Returns the name of the LookAndFeel class that implements
    // the default cross platform look and feel -- the Java
    // Look and Feel (JLF).
    def getCrossPlatformLookAndFeelClassName(): String = ???

    @stub
    // Returns the defaults.
    def getDefaults(): UIDefaults = ???

    @stub
    // Returns a dimension from the defaults.
    def getDimension(key: Object): Dimension = ???

    @stub
    // Returns a dimension from the defaults that is appropriate
    // for the given locale.
    def getDimension(key: Object, l: Locale): Dimension = ???

    @stub
    // Returns a font from the defaults.
    def getFont(key: Object): Font = ???

    @stub
    // Returns a font from the defaults that is appropriate
    // for the given locale.
    def getFont(key: Object, l: Locale): Font = ???

    @stub
    // Returns an Icon from the defaults.
    def getIcon(key: Object): Icon = ???

    @stub
    // Returns an Icon from the defaults that is appropriate
    // for the given locale.
    def getIcon(key: Object, l: Locale): Icon = ???

    @stub
    // Returns an Insets object from the defaults.
    def getInsets(key: Object): Insets = ???

    @stub
    // Returns an Insets object from the defaults that is
    // appropriate for the given locale.
    def getInsets(key: Object, l: Locale): Insets = ???

    @stub
    // Returns an array of LookAndFeelInfos representing the
    // LookAndFeel implementations currently available.
    def getInstalledLookAndFeels(): Array[UIManager.LookAndFeelInfo] = ???

    @stub
    // Returns an integer from the defaults.
    def getInt(key: Object): Int = ???

    @stub
    // Returns an integer from the defaults that is appropriate
    // for the given locale.
    def getInt(key: Object, l: Locale): Int = ???

    @stub
    // Returns the current look and feel or null.
    def getLookAndFeel(): LookAndFeel = ???

    @stub
    // Returns the UIDefaults from the current look and feel,
    // that were obtained at the time the look and feel was installed.
    def getLookAndFeelDefaults(): UIDefaults = ???

    @stub
    // Returns an array of all the PropertyChangeListeners added
    // to this UIManager with addPropertyChangeListener().
    def getPropertyChangeListeners(): Array[PropertyChangeListener] = ???

    @stub
    // Returns a string from the defaults.
    def getString(key: Object): String = ???

    @stub
    // Returns a string from the defaults that is appropriate for the
    // given locale.
    def getString(key: Object, l: Locale): String = ???

    @stub
    // Returns the name of the LookAndFeel class that implements
    // the native system look and feel if there is one, otherwise
    // the name of the default cross platform LookAndFeel
    // class.
    def getSystemLookAndFeelClassName(): String = ???

    @stub
    // Returns the appropriate ComponentUI implementation for
    // target.
    def getUI(target: JComponent): ComponentUI = ???

    @stub
    // Adds the specified look and feel to the set of available look
    // and feels.
    def installLookAndFeel(name: String, className: String): Unit = ???

    @stub
    // Adds the specified look and feel to the set of available look
    // and feels.
    def installLookAndFeel(info: UIManager.LookAndFeelInfo): Unit = ???

    @stub
    // Stores an object in the developer defaults.
    def put(key: Object, value: Object): Object = ???

    @stub
    // Removes a LookAndFeel from the list of auxiliary look and feels.
    def removeAuxiliaryLookAndFeel(laf: LookAndFeel): Boolean = ???

    @stub
    // Removes a PropertyChangeListener from the listener list.
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // Sets the set of available look and feels.
    def setInstalledLookAndFeels(infos: Array[UIManager.LookAndFeelInfo]): Unit = ???

    @stub
    // Sets the current look and feel to newLookAndFeel.
    def setLookAndFeel(newLookAndFeel: LookAndFeel): Unit = ???
}

package javax.swing

import java.awt.{Color, Dimension, Font, Insets}
import java.beans.PropertyChangeListener
import java.lang.{Class, ClassLoader, Object, String}
import java.util.{Dictionary, Hashtable, Locale}
import javax.swing.border.Border
import javax.swing.plaf.ComponentUI

// A table of defaults for Swing components.  Applications can set/get
// default values via the UIManager.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class UIDefaults extends Hashtable[Object, Object] {

    @stub
    // Creates an empty defaults table.
    def this() = ???

    @stub
    // Creates an empty defaults table with the specified initial capacity and
    // load factor.
    def this(initialCapacity: Int, loadFactor: float) = ???

    @stub
    // Adds a PropertyChangeListener to the listener list.
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // Adds a resource bundle to the list of resource bundles that are
    // searched for localized values.
    def addResourceBundle(bundleName: String): Unit = ???

    @stub
    // Support for reporting bound property changes.
    protected def firePropertyChange(propertyName: String, oldValue: Object, newValue: Object): Unit = ???

    @stub
    // Returns the value for key.
    def get(key: Object): Object = ???

    @stub
    // Returns the value for key associated with the given locale.
    def get(key: Object, l: Locale): Object = ???

    @stub
    // If the value of key is boolean, return the
    // boolean value, otherwise return false.
    def getBoolean(key: Object): Boolean = ???

    @stub
    // If the value of key for the given Locale
    // is boolean, return the boolean value, otherwise return false.
    def getBoolean(key: Object, l: Locale): Boolean = ???

    @stub
    // If the value of key is a Border return it,
    // otherwise return null.
    def getBorder(key: Object): Border = ???

    @stub
    // If the value of key for the given Locale
    // is a Border return it, otherwise return null.
    def getBorder(key: Object, l: Locale): Border = ???

    @stub
    // If the value of key is a Color return it,
    // otherwise return null.
    def getColor(key: Object): Color = ???

    @stub
    // If the value of key for the given Locale
    // is a Color return it, otherwise return null.
    def getColor(key: Object, l: Locale): Color = ???

    @stub
    // Returns the default locale.
    def getDefaultLocale(): Locale = ???

    @stub
    // If the value of key is a Dimension return it,
    // otherwise return null.
    def getDimension(key: Object): Dimension = ???

    @stub
    // If the value of key for the given Locale
    // is a Dimension return it, otherwise return null.
    def getDimension(key: Object, l: Locale): Dimension = ???

    @stub
    // If the value of key is a Font return it,
    // otherwise return null.
    def getFont(key: Object): Font = ???

    @stub
    // If the value of key for the given Locale
    // is a Font return it, otherwise return null.
    def getFont(key: Object, l: Locale): Font = ???

    @stub
    // If the value of key is an Icon return it,
    // otherwise return null.
    def getIcon(key: Object): Icon = ???

    @stub
    // If the value of key for the given Locale
    // is an Icon return it, otherwise return null.
    def getIcon(key: Object, l: Locale): Icon = ???

    @stub
    // If the value of key is an Insets return it,
    // otherwise return null.
    def getInsets(key: Object): Insets = ???

    @stub
    // If the value of key for the given Locale
    // is an Insets return it, otherwise return null.
    def getInsets(key: Object, l: Locale): Insets = ???

    @stub
    // If the value of key is an Integer return its
    // integer value, otherwise return 0.
    def getInt(key: Object): Int = ???

    @stub
    // If the value of key for the given Locale
    // is an Integer return its integer value, otherwise return 0.
    def getInt(key: Object, l: Locale): Int = ???

    @stub
    // Returns an array of all the PropertyChangeListeners added
    // to this UIDefaults with addPropertyChangeListener().
    def getPropertyChangeListeners(): Array[PropertyChangeListener] = ???

    @stub
    // If the value of key is a String return it,
    // otherwise return null.
    def getString(key: Object): String = ???

    @stub
    // If the value of key for the given Locale
    // is a String return it, otherwise return null.
    def getString(key: Object, l: Locale): String = ???

    @stub
    // Creates an ComponentUI implementation for the
    // specified component.
    def getUI(target: JComponent): ComponentUI = ???

    @stub
    // Returns the L&F class that renders this component.
    def getUIClass(uiClassID: String): Class[_ <: ComponentUI] = ???

    @stub
    // The value of get(uidClassID) must be the
    // String name of a
    // class that implements the corresponding ComponentUI
    // class.
    def getUIClass(uiClassID: String, uiClassLoader: ClassLoader): Class[_ <: ComponentUI] = ???

    @stub
    // If getUI() fails for any reason,
    // it calls this method before returning null.
    protected def getUIError(msg: String): Unit = ???

    @stub
    // Sets the value of key to value for all locales.
    def put(key: Object, value: Object): Object = ???

    @stub
    // Puts all of the key/value pairs in the database and
    // unconditionally generates one PropertyChangeEvent.
    def putDefaults(keyValueList: Array[Object]): Unit = ???

    @stub
    // Removes a PropertyChangeListener from the listener list.
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // Removes a resource bundle from the list of resource bundles that are
    // searched for localized defaults.
    def removeResourceBundle(bundleName: String): Unit = ???
}

object UIDefaults {
    @stub
    // This class enables one to store an entry in the defaults
    // table that's constructed each time it's looked up with one of
    // the getXXX(key) methods.
    def UIDefaults.ActiveValue: trait = ???

    @stub
    // LazyInputMap will create a InputMap
    // in its createValue
    // method.
    def UIDefaults.LazyInputMap: class = ???

    @stub
    // This class enables one to store an entry in the defaults
    // table that isn't constructed until the first time it's
    // looked up with one of the getXXX(key) methods.
    def UIDefaults.LazyValue: trait = ???
}

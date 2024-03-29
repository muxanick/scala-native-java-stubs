package javax.swing

import java.awt.{Color, Dimension, Font, Insets}
import java.beans.PropertyChangeListener
import java.lang.{Class, ClassLoader, Object, String}
import java.util.{Dictionary, Hashtable, Locale}
import javax.swing.border.Border
import javax.swing.plaf.ComponentUI
import scala.scalanative.annotation.stub

/** A table of defaults for Swing components.  Applications can set/get
 *  default values via the UIManager.
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
class UIDefaults extends Hashtable[Object, Object] {

    /** Creates an empty defaults table. */
    @stub
    def this() = ???

    /** Creates an empty defaults table with the specified initial capacity and
     *  load factor.
     */
    @stub
    def this(initialCapacity: Int, loadFactor: Float) = ???

    /** Creates a defaults table initialized with the specified
     *  key/value pairs.
     */
    @stub
    def this(keyValueList: Array[Object]) = ???

    /** Adds a PropertyChangeListener to the listener list. */
    @stub
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** Adds a resource bundle to the list of resource bundles that are
     *  searched for localized values.
     */
    @stub
    def addResourceBundle(bundleName: String): Unit = ???

    /** Support for reporting bound property changes. */
    @stub
    protected def firePropertyChange(propertyName: String, oldValue: Any, newValue: Any): Unit = ???

    /** Returns the value for key. */
    @stub
    def get(key: Any): Any = ???

    /** Returns the value for key associated with the given locale. */
    @stub
    def get(key: Any, l: Locale): Any = ???

    /** If the value of key is boolean, return the
     *  boolean value, otherwise return false.
     */
    @stub
    def getBoolean(key: Any): Boolean = ???

    /** If the value of key for the given Locale
     *  is boolean, return the boolean value, otherwise return false.
     */
    @stub
    def getBoolean(key: Any, l: Locale): Boolean = ???

    /** If the value of key is a Border return it,
     *  otherwise return null.
     */
    @stub
    def getBorder(key: Any): Border = ???

    /** If the value of key for the given Locale
     *  is a Border return it, otherwise return null.
     */
    @stub
    def getBorder(key: Any, l: Locale): Border = ???

    /** If the value of key is a Color return it,
     *  otherwise return null.
     */
    @stub
    def getColor(key: Any): Color = ???

    /** If the value of key for the given Locale
     *  is a Color return it, otherwise return null.
     */
    @stub
    def getColor(key: Any, l: Locale): Color = ???

    /** Returns the default locale. */
    @stub
    def getDefaultLocale(): Locale = ???

    /** If the value of key is a Dimension return it,
     *  otherwise return null.
     */
    @stub
    def getDimension(key: Any): Dimension = ???

    /** If the value of key for the given Locale
     *  is a Dimension return it, otherwise return null.
     */
    @stub
    def getDimension(key: Any, l: Locale): Dimension = ???

    /** If the value of key is a Font return it,
     *  otherwise return null.
     */
    @stub
    def getFont(key: Any): Font = ???

    /** If the value of key for the given Locale
     *  is a Font return it, otherwise return null.
     */
    @stub
    def getFont(key: Any, l: Locale): Font = ???

    /** If the value of key is an Icon return it,
     *  otherwise return null.
     */
    @stub
    def getIcon(key: Any): Icon = ???

    /** If the value of key for the given Locale
     *  is an Icon return it, otherwise return null.
     */
    @stub
    def getIcon(key: Any, l: Locale): Icon = ???

    /** If the value of key is an Insets return it,
     *  otherwise return null.
     */
    @stub
    def getInsets(key: Any): Insets = ???

    /** If the value of key for the given Locale
     *  is an Insets return it, otherwise return null.
     */
    @stub
    def getInsets(key: Any, l: Locale): Insets = ???

    /** If the value of key is an Integer return its
     *  integer value, otherwise return 0.
     */
    @stub
    def getInt(key: Any): Int = ???

    /** If the value of key for the given Locale
     *  is an Integer return its integer value, otherwise return 0.
     */
    @stub
    def getInt(key: Any, l: Locale): Int = ???

    /** Returns an array of all the PropertyChangeListeners added
     *  to this UIDefaults with addPropertyChangeListener().
     */
    @stub
    def getPropertyChangeListeners(): Array[PropertyChangeListener] = ???

    /** If the value of key is a String return it,
     *  otherwise return null.
     */
    @stub
    def getString(key: Any): String = ???

    /** If the value of key for the given Locale
     *  is a String return it, otherwise return null.
     */
    @stub
    def getString(key: Any, l: Locale): String = ???

    /** Creates an ComponentUI implementation for the
     *  specified component.
     */
    @stub
    def getUI(target: JComponent): ComponentUI = ???

    /** Returns the L&F class that renders this component. */
    @stub
    def getUIClass(uiClassID: String): Class[_ <: ComponentUI] = ???

    /** The value of get(uidClassID) must be the
     *  String name of a
     *  class that implements the corresponding ComponentUI
     *  class.
     */
    @stub
    def getUIClass(uiClassID: String, uiClassLoader: ClassLoader): Class[_ <: ComponentUI] = ???

    /** If getUI() fails for any reason,
     *  it calls this method before returning null.
     */
    @stub
    protected def getUIError(msg: String): Unit = ???

    /** Sets the value of key to value for all locales. */
    @stub
    def put(key: Any, value: Any): Any = ???

    /** Puts all of the key/value pairs in the database and
     *  unconditionally generates one PropertyChangeEvent.
     */
    @stub
    def putDefaults(keyValueList: Array[Object]): Unit = ???

    /** Removes a PropertyChangeListener from the listener list. */
    @stub
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** Removes a resource bundle from the list of resource bundles that are
     *  searched for localized defaults.
     */
    @stub
    def removeResourceBundle(bundleName: String): Unit = ???

    /** Sets the default locale. */
    @stub
    def setDefaultLocale(l: Locale): Unit = ???
}

object UIDefaults {
    /** This class enables one to store an entry in the defaults
     *  table that's constructed each time it's looked up with one of
     *  the getXXX(key) methods. Here's an example of
     *  an ActiveValue that constructs a
     *  DefaultListCellRenderer:
     *  
     *   Object cellRendererActiveValue = new UIDefaults.ActiveValue() {
     *       public Object createValue(UIDefaults table) {
     *           return new DefaultListCellRenderer();
     *       }
     *   };
     * 
     *   uiDefaultsTable.put("MyRenderer", cellRendererActiveValue);
     *  
     */
    trait ActiveValue {

        /** Creates the value retrieved from the UIDefaults table. */
        @stub
        def createValue(table: UIDefaults): Any = ???
    }


    /** LazyInputMap will create a InputMap
     *  in its createValue
     *  method. The bindings are passed in in the constructor.
     *  The bindings are an array with
     *  the even number entries being string KeyStrokes
     *  (eg "alt SPACE") and
     *  the odd number entries being the value to use in the
     *  InputMap (and the key in the ActionMap).
     */
    object LazyInputMap extends Object with UIDefaults.LazyValue {

        /**  */
        @stub
        def apply(bindings: Array[Object]) = ???

        /** Creates an InputMap with the bindings that are
         *  passed in.
         */
        @stub
        def createValue(table: UIDefaults): Any = ???
    }


    /** This class enables one to store an entry in the defaults
     *  table that isn't constructed until the first time it's
     *  looked up with one of the getXXX(key) methods.
     *  Lazy values are useful for defaults that are expensive
     *  to construct or are seldom retrieved.  The first time
     *  a LazyValue is retrieved its "real value" is computed
     *  by calling LazyValue.createValue() and the real
     *  value is used to replace the LazyValue in the
     *  UIDefaults
     *  table.  Subsequent lookups for the same key return
     *  the real value.  Here's an example of a LazyValue
     *  that constructs a Border:
     *  
     *   Object borderLazyValue = new UIDefaults.LazyValue() {
     *       public Object createValue(UIDefaults table) {
     *           return new BorderFactory.createLoweredBevelBorder();
     *       }
     *   };
     * 
     *   uiDefaultsTable.put("MyBorder", borderLazyValue);
     *  
     */
    trait LazyValue {

        /** Creates the actual value retrieved from the UIDefaults
         *  table.
         */
        @stub
        def createValue(table: UIDefaults): Any = ???
    }


    /** This class provides an implementation of LazyValue
     *  which can be
     *  used to delay loading of the Class for the instance to be created.
     *  It also avoids creation of an anonymous inner class for the
     *  LazyValue
     *  subclass.  Both of these improve performance at the time that a
     *  a Look and Feel is loaded, at the cost of a slight performance
     *  reduction the first time createValue is called
     *  (since Reflection APIs are used).
     */
    object ProxyLazyValue extends Object with UIDefaults.LazyValue {

        /** Creates a LazyValue which will construct an instance
         *  when asked.
         */
        @stub
        def apply(c: String) = ???

        /** Creates a LazyValue which will construct an instance
         *  when asked.
         */
        @stub
        def apply(c: String, o: Array[Object]) = ???

        /** Creates a LazyValue which will construct an instance
         *  when asked.
         */
        @stub
        def apply(c: String, m: String) = ???

        /** Creates a LazyValue which will construct an instance
         *  when asked.
         */
        @stub
        def apply(c: String, m: String, o: Array[Object]) = ???

        /** Creates the value retrieved from the UIDefaults table. */
        @stub
        def createValue(table: UIDefaults): Any = ???
    }

}

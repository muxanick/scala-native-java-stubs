package java.util

import java.lang.{ClassLoader, Object, String}
import scala.scalanative.annotation.stub

/** Resource bundles contain locale-specific objects.  When your program needs a
 *  locale-specific resource, a String for example, your program can
 *  load it from the resource bundle that is appropriate for the current user's
 *  locale. In this way, you can write program code that is largely independent
 *  of the user's locale isolating most, if not all, of the locale-specific
 *  information in resource bundles.
 * 
 *  
 *  This allows you to write programs that can:
 *  
 *   be easily localized, or translated, into different languages
 *   handle multiple locales at once
 *   be easily modified later to support even more locales
 *  
 * 
 *  
 *  Resource bundles belong to families whose members share a common base
 *  name, but whose names also have additional components that identify
 *  their locales. For example, the base name of a family of resource
 *  bundles might be "MyResources". The family should have a default
 *  resource bundle which simply has the same name as its family -
 *  "MyResources" - and will be used as the bundle of last resort if a
 *  specific locale is not supported. The family can then provide as
 *  many locale-specific members as needed, for example a German one
 *  named "MyResources_de".
 * 
 *  
 *  Each resource bundle in a family contains the same items, but the items have
 *  been translated for the locale represented by that resource bundle.
 *  For example, both "MyResources" and "MyResources_de" may have a
 *  String that's used on a button for canceling operations.
 *  In "MyResources" the String may contain "Cancel" and in
 *  "MyResources_de" it may contain "Abbrechen".
 * 
 *  
 *  If there are different resources for different countries, you
 *  can make specializations: for example, "MyResources_de_CH" contains objects for
 *  the German language (de) in Switzerland (CH). If you want to only
 *  modify some of the resources
 *  in the specialization, you can do so.
 * 
 *  
 *  When your program needs a locale-specific object, it loads
 *  the ResourceBundle class using the
 *  getBundle
 *  method:
 *  
 *  
 *  ResourceBundle myResources =
 *       ResourceBundle.getBundle("MyResources", currentLocale);
 *  
 *  
 * 
 *  
 *  Resource bundles contain key/value pairs. The keys uniquely
 *  identify a locale-specific object in the bundle. Here's an
 *  example of a ListResourceBundle that contains
 *  two key/value pairs:
 *  
 *  
 *  public class MyResources extends ListResourceBundle {
 *      protected Object[][] getContents() {
 *          return new Object[][] {
 *              // LOCALIZE THE SECOND STRING OF EACH ARRAY (e.g., "OK")
 *              {"OkKey", "OK"},
 *              {"CancelKey", "Cancel"},
 *              // END OF MATERIAL TO LOCALIZE
 *         };
 *      }
 *  }
 *  
 *  
 *  Keys are always Strings.
 *  In this example, the keys are "OkKey" and "CancelKey".
 *  In the above example, the values
 *  are also Strings--"OK" and "Cancel"--but
 *  they don't have to be. The values can be any type of object.
 * 
 *  
 *  You retrieve an object from resource bundle using the appropriate
 *  getter method. Because "OkKey" and "CancelKey"
 *  are both strings, you would use getString to retrieve them:
 *  
 *  
 *  button1 = new Button(myResources.getString("OkKey"));
 *  button2 = new Button(myResources.getString("CancelKey"));
 *  
 *  
 *  The getter methods all require the key as an argument and return
 *  the object if found. If the object is not found, the getter method
 *  throws a MissingResourceException.
 * 
 *  
 *  Besides getString, ResourceBundle also provides
 *  a method for getting string arrays, getStringArray,
 *  as well as a generic getObject method for any other
 *  type of object. When using getObject, you'll
 *  have to cast the result to the appropriate type. For example:
 *  
 *  
 *  int[] myIntegers = (int[]) myResources.getObject("intList");
 *  
 *  
 * 
 *  
 *  The Java Platform provides two subclasses of ResourceBundle,
 *  ListResourceBundle and PropertyResourceBundle,
 *  that provide a fairly simple way to create resources.
 *  As you saw briefly in a previous example, ListResourceBundle
 *  manages its resource as a list of key/value pairs.
 *  PropertyResourceBundle uses a properties file to manage
 *  its resources.
 * 
 *  
 *  If ListResourceBundle or PropertyResourceBundle
 *  do not suit your needs, you can write your own ResourceBundle
 *  subclass.  Your subclasses must override two methods: handleGetObject
 *  and getKeys().
 * 
 *  
 *  The implementation of a ResourceBundle subclass must be thread-safe
 *  if it's simultaneously used by multiple threads. The default implementations
 *  of the non-abstract methods in this class, and the methods in the direct
 *  known concrete subclasses ListResourceBundle and
 *  PropertyResourceBundle are thread-safe.
 * 
 *  ResourceBundle.Control
 * 
 *  The ResourceBundle.Control class provides information necessary
 *  to perform the bundle loading process by the getBundle
 *  factory methods that take a ResourceBundle.Control
 *  instance. You can implement your own subclass in order to enable
 *  non-standard resource bundle formats, change the search strategy, or
 *  define caching parameters. Refer to the descriptions of the class and the
 *  getBundle
 *  factory method for details.
 * 
 *  For the getBundle factory
 *  methods that take no ResourceBundle.Control instance, their  default behavior of resource bundle loading
 *  can be modified with installed ResourceBundleControlProvider implementations. Any installed providers are
 *  detected at the ResourceBundle class loading time. If any of the
 *  providers provides a ResourceBundle.Control for the given base name, that ResourceBundle.Control will be used instead of the default ResourceBundle.Control. If there is
 *  more than one service provider installed for supporting the same base name,
 *  the first one returned from ServiceLoader will be used.
 * 
 *  Cache Management
 * 
 *  Resource bundle instances created by the getBundle factory
 *  methods are cached by default, and the factory methods return the same
 *  resource bundle instance multiple times if it has been
 *  cached. getBundle clients may clear the cache, manage the
 *  lifetime of cached resource bundle instances using time-to-live values,
 *  or specify not to cache resource bundle instances. Refer to the
 *  descriptions of the getBundle factory method, clearCache, ResourceBundle.Control.getTimeToLive, and ResourceBundle.Control.needsReload for details.
 * 
 *  Example
 * 
 *  The following is a very simple example of a ResourceBundle
 *  subclass, MyResources, that manages two resources (for a larger number of
 *  resources you would probably use a Map).
 *  Notice that you don't need to supply a value if
 *  a "parent-level" ResourceBundle handles the same
 *  key with the same value (as for the okKey below).
 *  
 *  
 *  // default (English language, United States)
 *  public class MyResources extends ResourceBundle {
 *      public Object handleGetObject(String key) {
 *          if (key.equals("okKey")) return "Ok";
 *          if (key.equals("cancelKey")) return "Cancel";
 *          return null;
 *      }
 * 
 *      public Enumeration<String> getKeys() {
 *          return Collections.enumeration(keySet());
 *      }
 * 
 *      // Overrides handleKeySet() so that the getKeys() implementation
 *      // can rely on the keySet() value.
 *      protected Set<String> handleKeySet() {
 *          return new HashSet<String>(Arrays.asList("okKey", "cancelKey"));
 *      }
 *  }
 * 
 *  // German language
 *  public class MyResources_de extends MyResources {
 *      public Object handleGetObject(String key) {
 *          // don't need okKey, since parent level handles it.
 *          if (key.equals("cancelKey")) return "Abbrechen";
 *          return null;
 *      }
 * 
 *      protected Set<String> handleKeySet() {
 *          return new HashSet<String>(Arrays.asList("cancelKey"));
 *      }
 *  }
 *  
 *  
 *  You do not have to restrict yourself to using a single family of
 *  ResourceBundles. For example, you could have a set of bundles for
 *  exception messages, ExceptionResources
 *  (ExceptionResources_fr, ExceptionResources_de, ...),
 *  and one for widgets, WidgetResource (WidgetResources_fr,
 *  WidgetResources_de, ...); breaking up the resources however you like.
 */
abstract class ResourceBundle extends Object {

    /** Sole constructor. */
    @stub
    def this() = ???

    /** The parent bundle of this bundle. */
    protected val parent: ResourceBundle

    /** Determines whether the given key is contained in
     *  this ResourceBundle or its parent bundles.
     */
    def containsKey(key: String): Boolean

    /** Returns the base name of this bundle, if known, or null if unknown. */
    def getBaseBundleName(): String

    /** Returns an enumeration of the keys. */
    def getKeys(): Enumeration[String]

    /** Returns the locale of this resource bundle. */
    def getLocale(): Locale

    /** Gets an object for the given key from this resource bundle or one of its parents. */
    def getObject(key: String): Any

    /** Gets a string for the given key from this resource bundle or one of its parents. */
    def getString(key: String): String

    /** Gets a string array for the given key from this resource bundle or one of its parents. */
    def getStringArray(key: String): Array[String]

    /** Gets an object for the given key from this resource bundle. */
    protected def handleGetObject(key: String): Any

    /** Returns a Set of the keys contained only
     *  in this ResourceBundle.
     */
    protected def handleKeySet(): Set[String]

    /** Returns a Set of all keys contained in this
     *  ResourceBundle and its parent bundles.
     */
    def keySet(): Set[String]

    /** Sets the parent bundle of this bundle. */
    protected def setParent(parent: ResourceBundle): Unit
}

object ResourceBundle {
    /** ResourceBundle.Control defines a set of callback methods
     *  that are invoked by the ResourceBundle.getBundle factory
     *  methods during the bundle loading process.
     */
    type Control = ResourceBundle_Control

    /** Removes all resource bundles from the cache that have been loaded
     *  using the caller's class loader.
     */
    @stub
    def clearCache(): Unit = ???

    /** Removes all resource bundles from the cache that have been loaded
     *  using the given class loader.
     */
    @stub
    def clearCache(loader: ClassLoader): Unit = ???

    /** Gets a resource bundle using the specified base name, the default locale,
     *  and the caller's class loader.
     */
    @stub
    def getBundle(baseName: String): ResourceBundle = ???

    /** Gets a resource bundle using the specified base name and locale,
     *  and the caller's class loader.
     */
    @stub
    def getBundle(baseName: String, locale: Locale): ResourceBundle = ???

    /** Gets a resource bundle using the specified base name, locale, and class
     *  loader.
     */
    @stub
    def getBundle(baseName: String, locale: Locale, loader: ClassLoader): ResourceBundle = ???

    /** Returns a resource bundle using the specified base name, target
     *  locale, class loader and control.
     */
    @stub
    def getBundle(baseName: String, targetLocale: Locale, loader: ClassLoader, control: ResourceBundle.Control): ResourceBundle = ???

    /** Returns a resource bundle using the specified base name, target
     *  locale and control, and the caller's class loader.
     */
    @stub
    def getBundle(baseName: String, targetLocale: Locale, control: ResourceBundle.Control): ResourceBundle = ???

    /** Returns a resource bundle using the specified base name, the
     *  default locale and the specified control.
     */
    @stub
    def getBundle(baseName: String, control: ResourceBundle.Control): ResourceBundle = ???
}

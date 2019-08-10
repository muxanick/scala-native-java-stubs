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
     *  methods during the bundle loading process. In other words, a
     *  ResourceBundle.Control collaborates with the factory
     *  methods for loading resource bundles. The default implementation of
     *  the callback methods provides the information necessary for the
     *  factory methods to perform the default behavior.
     * 
     *  In addition to the callback methods, the toBundleName and toResourceName methods are defined
     *  primarily for convenience in implementing the callback
     *  methods. However, the toBundleName method could be
     *  overridden to provide different conventions in the organization and
     *  packaging of localized resources.  The toResourceName
     *  method is final to avoid use of wrong resource and class
     *  name separators.
     * 
     *  Two factory methods, getControl(List) and getNoFallbackControl(List), provide
     *  ResourceBundle.Control instances that implement common
     *  variations of the default bundle loading process.
     * 
     *  The formats returned by the getFormats method and candidate locales returned by the getCandidateLocales method must be consistent in all
     *  ResourceBundle.getBundle invocations for the same base
     *  bundle. Otherwise, the ResourceBundle.getBundle methods
     *  may return unintended bundles. For example, if only
     *  "java.class" is returned by the getFormats
     *  method for the first call to ResourceBundle.getBundle
     *  and only "java.properties" for the second call, then the
     *  second call will return the class-based one that has been cached
     *  during the first call.
     * 
     *  A ResourceBundle.Control instance must be thread-safe
     *  if it's simultaneously used by multiple threads.
     *  ResourceBundle.getBundle does not synchronize to call
     *  the ResourceBundle.Control methods. The default
     *  implementations of the methods are thread-safe.
     * 
     *  Applications can specify ResourceBundle.Control
     *  instances returned by the getControl factory methods or
     *  created from a subclass of ResourceBundle.Control to
     *  customize the bundle loading process. The following are examples of
     *  changing the default bundle loading process.
     * 
     *  Example 1
     * 
     *  The following code lets ResourceBundle.getBundle look
     *  up only properties-based resources.
     * 
     *  
     *  import java.util.*;
     *  import static java.util.ResourceBundle.Control.*;
     *  ...
     *  ResourceBundle bundle =
     *    ResourceBundle.getBundle("MyResources", new Locale("fr", "CH"),
     *                             ResourceBundle.Control.getControl(FORMAT_PROPERTIES));
     *  
     * 
     *  Given the resource bundles in the example in
     *  the ResourceBundle.getBundle description, this
     *  ResourceBundle.getBundle call loads
     *  MyResources_fr_CH.properties whose parent is
     *  MyResources_fr.properties whose parent is
     *  MyResources.properties. (MyResources_fr_CH.properties
     *  is not hidden, but MyResources_fr_CH.class is.)
     * 
     *  Example 2
     * 
     *  The following is an example of loading XML-based bundles
     *  using Properties.loadFromXML.
     * 
     *  
     *  ResourceBundle rb = ResourceBundle.getBundle("Messages",
     *      new ResourceBundle.Control() {
     *          public List<String> getFormats(String baseName) {
     *              if (baseName == null)
     *                  throw new NullPointerException();
     *              return Arrays.asList("xml");
     *          }
     *          public ResourceBundle newBundle(String baseName,
     *                                          Locale locale,
     *                                          String format,
     *                                          ClassLoader loader,
     *                                          boolean reload)
     *                           throws IllegalAccessException,
     *                                  InstantiationException,
     *                                  IOException {
     *              if (baseName == null || locale == null
     *                    || format == null || loader == null)
     *                  throw new NullPointerException();
     *              ResourceBundle bundle = null;
     *              if (format.equals("xml")) {
     *                  String bundleName = toBundleName(baseName, locale);
     *                  String resourceName = toResourceName(bundleName, format);
     *                  InputStream stream = null;
     *                  if (reload) {
     *                      URL url = loader.getResource(resourceName);
     *                      if (url != null) {
     *                          URLConnection connection = url.openConnection();
     *                          if (connection != null) {
     *                              // Disable caches to get fresh data for
     *                              // reloading.
     *                              connection.setUseCaches(false);
     *                              stream = connection.getInputStream();
     *                          }
     *                      }
     *                  } else {
     *                      stream = loader.getResourceAsStream(resourceName);
     *                  }
     *                  if (stream != null) {
     *                      BufferedInputStream bis = new BufferedInputStream(stream);
     *                      bundle = new XMLResourceBundle(bis);
     *                      bis.close();
     *                  }
     *              }
     *              return bundle;
     *          }
     *      });
     * 
     *  ...
     * 
     *  private static class XMLResourceBundle extends ResourceBundle {
     *      private Properties props;
     *      XMLResourceBundle(InputStream stream) throws IOException {
     *          props = new Properties();
     *          props.loadFromXML(stream);
     *      }
     *      protected Object handleGetObject(String key) {
     *          return props.getProperty(key);
     *      }
     *      public Enumeration<String> getKeys() {
     *          ...
     *      }
     *  }
     *  
     */
    object Control extends Object {

        /** Sole constructor. */
        @stub
        protected def apply() = ???

        /** The class-only format List containing
         *  "java.class".
         */
        @stub
        val FORMAT_CLASS: List[String] = ???

        /** The default format List, which contains the strings
         *  "java.class" and "java.properties", in
         *  this order.
         */
        @stub
        val FORMAT_DEFAULT: List[String] = ???

        /** The properties-only format List containing
         *  "java.properties".
         */
        @stub
        val FORMAT_PROPERTIES: List[String] = ???

        /** The time-to-live constant for not caching loaded resource bundle
         *  instances.
         */
        @stub
        val TTL_DONT_CACHE: Long = ???

        /** The time-to-live constant for disabling the expiration control
         *  for loaded resource bundle instances in the cache.
         */
        @stub
        val TTL_NO_EXPIRATION_CONTROL: Long = ???

        /** Returns a List of Locales as candidate
         *  locales for baseName and locale.
         */
        @stub
        def getCandidateLocales(baseName: String, locale: Locale): List[Locale] = ???

        /** Returns a ResourceBundle.Control in which the getFormats method returns the specified
         *  formats.
         */
        @stub
        def getControl(formats: List[String]): Control = ???

        /** Returns a Locale to be used as a fallback locale for
         *  further resource bundle searches by the
         *  ResourceBundle.getBundle factory method.
         */
        @stub
        def getFallbackLocale(baseName: String, locale: Locale): Locale = ???

        /** Returns a List of Strings containing
         *  formats to be used to load resource bundles for the given
         *  baseName.
         */
        @stub
        def getFormats(baseName: String): List[String] = ???

        /** Returns a ResourceBundle.Control in which the getFormats method returns the specified
         *  formats and the getFallbackLocale
         *  method returns null.
         */
        @stub
        def getNoFallbackControl(formats: List[String]): Control = ???

        /** Returns the time-to-live (TTL) value for resource bundles that
         *  are loaded under this
         *  ResourceBundle.Control.
         */
        @stub
        def getTimeToLive(baseName: String, locale: Locale): Long = ???

        /** Determines if the expired bundle in the cache needs
         *  to be reloaded based on the loading time given by
         *  loadTime or some other criteria.
         */
        @stub
        def needsReload(baseName: String, locale: Locale, format: String, loader: ClassLoader, bundle: ResourceBundle, loadTime: Long): Boolean = ???

        /** Instantiates a resource bundle for the given bundle name of the
         *  given format and locale, using the given class loader if
         *  necessary.
         */
        @stub
        def newBundle(baseName: String, locale: Locale, format: String, loader: ClassLoader, reload: Boolean): ResourceBundle = ???

        /** Converts the given baseName and locale
         *  to the bundle name.
         */
        @stub
        def toBundleName(baseName: String, locale: Locale): String = ???

        /** Converts the given bundleName to the form required
         *  by the ClassLoader.getResource
         *  method by replacing all occurrences of '.' in
         *  bundleName with '/' and appending a
         *  '.' and the given file suffix.
         */
        @stub
        def toResourceName(bundleName: String, suffix: String): String = ???
    }


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

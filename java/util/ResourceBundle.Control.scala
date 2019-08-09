package java.util

import java.lang.{ClassLoader, Object, String}

// ResourceBundle.Control defines a set of callback methods
// that are invoked by the ResourceBundle.getBundle factory
// methods during the bundle loading process. In other words, a
// ResourceBundle.Control collaborates with the factory
// methods for loading resource bundles. The default implementation of
// the callback methods provides the information necessary for the
// factory methods to perform the default behavior.
//
// In addition to the callback methods, the toBundleName and toResourceName methods are defined
// primarily for convenience in implementing the callback
// methods. However, the toBundleName method could be
// overridden to provide different conventions in the organization and
// packaging of localized resources.  The toResourceName
// method is final to avoid use of wrong resource and class
// name separators.
//
// Two factory methods, getControl(List) and getNoFallbackControl(List), provide
// ResourceBundle.Control instances that implement common
// variations of the default bundle loading process.
//
// The formats returned by the getFormats method and candidate locales returned by the getCandidateLocales method must be consistent in all
// ResourceBundle.getBundle invocations for the same base
// bundle. Otherwise, the ResourceBundle.getBundle methods
// may return unintended bundles. For example, if only
// "java.class" is returned by the getFormats
// method for the first call to ResourceBundle.getBundle
// and only "java.properties" for the second call, then the
// second call will return the class-based one that has been cached
// during the first call.
//
// A ResourceBundle.Control instance must be thread-safe
// if it's simultaneously used by multiple threads.
// ResourceBundle.getBundle does not synchronize to call
// the ResourceBundle.Control methods. The default
// implementations of the methods are thread-safe.
//
// Applications can specify ResourceBundle.Control
// instances returned by the getControl factory methods or
// created from a subclass of ResourceBundle.Control to
// customize the bundle loading process. The following are examples of
// changing the default bundle loading process.
//
// Example 1
//
// The following code lets ResourceBundle.getBundle look
// up only properties-based resources.
//
// 
// import java.util.*;
// import static java.util.ResourceBundle.Control.*;
// ...
// ResourceBundle bundle =
//   ResourceBundle.getBundle("MyResources", new Locale("fr", "CH"),
//                            ResourceBundle.Control.getControl(FORMAT_PROPERTIES));
// 
//
// Given the resource bundles in the example in
// the ResourceBundle.getBundle description, this
// ResourceBundle.getBundle call loads
// MyResources_fr_CH.properties whose parent is
// MyResources_fr.properties whose parent is
// MyResources.properties. (MyResources_fr_CH.properties
// is not hidden, but MyResources_fr_CH.class is.)
//
// Example 2
//
// The following is an example of loading XML-based bundles
// using Properties.loadFromXML.
//
// 
// ResourceBundle rb = ResourceBundle.getBundle("Messages",
//     new ResourceBundle.Control() {
//         public List<String> getFormats(String baseName) {
//             if (baseName == null)
//                 throw new NullPointerException();
//             return Arrays.asList("xml");
//         }
//         public ResourceBundle newBundle(String baseName,
//                                         Locale locale,
//                                         String format,
//                                         ClassLoader loader,
//                                         boolean reload)
//                          throws IllegalAccessException,
//                                 InstantiationException,
//                                 IOException {
//             if (baseName == null || locale == null
//                   || format == null || loader == null)
//                 throw new NullPointerException();
//             ResourceBundle bundle = null;
//             if (format.equals("xml")) {
//                 String bundleName = toBundleName(baseName, locale);
//                 String resourceName = toResourceName(bundleName, format);
//                 InputStream stream = null;
//                 if (reload) {
//                     URL url = loader.getResource(resourceName);
//                     if (url != null) {
//                         URLConnection connection = url.openConnection();
//                         if (connection != null) {
//                             // Disable caches to get fresh data for
//                             // reloading.
//                             connection.setUseCaches(false);
//                             stream = connection.getInputStream();
//                         }
//                     }
//                 } else {
//                     stream = loader.getResourceAsStream(resourceName);
//                 }
//                 if (stream != null) {
//                     BufferedInputStream bis = new BufferedInputStream(stream);
//                     bundle = new XMLResourceBundle(bis);
//                     bis.close();
//                 }
//             }
//             return bundle;
//         }
//     });
//
// ...
//
// private static class XMLResourceBundle extends ResourceBundle {
//     private Properties props;
//     XMLResourceBundle(InputStream stream) throws IOException {
//         props = new Properties();
//         props.loadFromXML(stream);
//     }
//     protected Object handleGetObject(String key) {
//         return props.getProperty(key);
//     }
//     public Enumeration<String> getKeys() {
//         ...
//     }
// }
// 
object ResourceBundle.Control extends Object {

    @stub
    // The class-only format List containing
    // "java.class".
    def FORMAT_CLASS: List[String] = ???

    @stub
    // The default format List, which contains the strings
    // "java.class" and "java.properties", in
    // this order.
    def FORMAT_DEFAULT: List[String] = ???

    @stub
    // The properties-only format List containing
    // "java.properties".
    def FORMAT_PROPERTIES: List[String] = ???

    @stub
    // The time-to-live constant for not caching loaded resource bundle
    // instances.
    def TTL_DONT_CACHE: Long = ???

    @stub
    // Returns a List of Locales as candidate
    // locales for baseName and locale.
    def getCandidateLocales(baseName: String, locale: Locale): List[Locale] = ???

    @stub
    // Returns a ResourceBundle.Control in which the getFormats method returns the specified
    // formats.
    def getControl(formats: List[String]): ResourceBundle.Control = ???

    @stub
    // Returns a Locale to be used as a fallback locale for
    // further resource bundle searches by the
    // ResourceBundle.getBundle factory method.
    def getFallbackLocale(baseName: String, locale: Locale): Locale = ???

    @stub
    // Returns a List of Strings containing
    // formats to be used to load resource bundles for the given
    // baseName.
    def getFormats(baseName: String): List[String] = ???

    @stub
    // Returns a ResourceBundle.Control in which the getFormats method returns the specified
    // formats and the getFallbackLocale
    // method returns null.
    def getNoFallbackControl(formats: List[String]): ResourceBundle.Control = ???

    @stub
    // Returns the time-to-live (TTL) value for resource bundles that
    // are loaded under this
    // ResourceBundle.Control.
    def getTimeToLive(baseName: String, locale: Locale): Long = ???

    @stub
    // Determines if the expired bundle in the cache needs
    // to be reloaded based on the loading time given by
    // loadTime or some other criteria.
    def needsReload(baseName: String, locale: Locale, format: String, loader: ClassLoader, bundle: ResourceBundle, loadTime: Long): Boolean = ???

    @stub
    // Instantiates a resource bundle for the given bundle name of the
    // given format and locale, using the given class loader if
    // necessary.
    def newBundle(baseName: String, locale: Locale, format: String, loader: ClassLoader, reload: Boolean): ResourceBundle = ???

    @stub
    // Converts the given baseName and locale
    // to the bundle name.
    def toBundleName(baseName: String, locale: Locale): String = ???
}

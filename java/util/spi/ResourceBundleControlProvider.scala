package java.util.spi

// An interface for service providers that provide implementations of ResourceBundle.Control. The default resource bundle loading
// behavior of the ResourceBundle.getBundle factory methods that take
// no ResourceBundle.Control instance can be modified with ResourceBundleControlProvider implementations.
//
// Provider implementations must be packaged using the Java Extension
// Mechanism as installed extensions. Refer to ServiceLoader
// for the extension packaging. Any installed ResourceBundleControlProvider implementations are loaded using ServiceLoader at the ResourceBundle class loading time.
trait ResourceBundleControlProvider {
}

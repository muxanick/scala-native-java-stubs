package javax.imageio.spi

import java.lang.{Class, ClassLoader, Object}
import java.util.Iterator

// A registry for service provider instances.
//
//  A service is a well-known set of interfaces and (usually
// abstract) classes.  A service provider is a specific
// implementation of a service.  The classes in a provider typically
// implement the interface or subclass the class defined by the
// service itself.
//
//  Service providers are stored in one or more categories,
// each of which is defined by a class of interface (described by a
// Class object) that all of its members must implement.
// The set of categories may be changed dynamically.
//
//  Only a single instance of a given leaf class (that is, the
// actual class returned by getClass(), as opposed to any
// inherited classes or interfaces) may be registered.  That is,
// suppose that the
// com.mycompany.mypkg.GreenServiceProvider class
// implements the com.mycompany.mypkg.MyService
// interface.  If a GreenServiceProvider instance is
// registered, it will be stored in the category defined by the
// MyService class.  If a new instance of
// GreenServiceProvider is registered, it will replace
// the previous instance.  In practice, service provider objects are
// usually singletons so this behavior is appropriate.
//
//  To declare a service provider, a services
// subdirectory is placed within the META-INF directory
// that is present in every JAR file.  This directory contains a file
// for each service provider interface that has one or more
// implementation classes present in the JAR file.  For example, if
// the JAR file contained a class named
// com.mycompany.mypkg.MyServiceImpl which implements the
// javax.someapi.SomeService interface, the JAR file
// would contain a file named: 
// META-INF/services/javax.someapi.SomeService 
//
// containing the line:
//
// 
// com.mycompany.mypkg.MyService
// 
//
//  The service provider classes should be to be lightweight and
// quick to load.  Implementations of these interfaces should avoid
// complex dependencies on other classes and on native code. The usual
// pattern for more complex services is to register a lightweight
// proxy for the heavyweight service.
//
//  An application may customize the contents of a registry as it
// sees fit, so long as it has the appropriate runtime permission.
//
//  For more details on declaring service providers, and the JAR
// format in general, see the 
// JAR File Specification.
class ServiceRegistry extends Object {

    @stub
    // Returns true if provider is currently
    // registered.
    def contains(provider: Object): Boolean = ???

    @stub
    // Deregisters all currently registered service providers from all
    // categories.
    def deregisterAll(): Unit = ???

    @stub
    // Deregisters all service provider object currently registered
    // under the given category.
    def deregisterAll(category: Class[_]): Unit = ???

    @stub
    // Removes a service provider object from all categories that
    // contain it.
    def deregisterServiceProvider(provider: Object): Unit = ???

    @stub
    // Removes a service provider object from the given category.
    def Boolean: [T] = ???

    @stub
    // Finalizes this object prior to garbage collection.
    def finalize(): Unit = ???

    @stub
    // Returns an Iterator of Class objects
    // indicating the current set of categories.
    def getCategories(): Iterator[Class[_]] = ???

    @stub
    // Returns the currently registered service provider object that
    // is of the given class type.
    def T: [T] = ???

    @stub
    // Returns an Iterator containing all registered
    // service providers in the given category.
    def Iterator[T]: [T] = ???

    @stub
    // Returns an Iterator containing service provider
    // objects within a given category that satisfy a criterion
    // imposed by the supplied ServiceRegistry.Filter
    // object's filter method.
    def Iterator[T]: [T] = ???

    @stub
    // Adds a service provider object to the registry.
    def registerServiceProvider(provider: Object): Unit = ???

    @stub
    // Adds a service provider object to the registry.
    def Boolean: [T] = ???

    @stub
    // Adds a set of service provider objects, taken from an
    // Iterator to the registry.
    def registerServiceProviders(providers: Iterator[_]): Unit = ???

    @stub
    // Sets a pairwise ordering between two service provider objects
    // within a given category.
    def Boolean: [T] = ???
}

object ServiceRegistry {
    @stub
    // Locates and incrementally instantiates the available providers
    // of a given service using the context class loader.
    def Iterator[T]: [T] = ???

    @stub
    // Searches for implementations of a particular service class
    // using the given class loader.
    def Iterator[T]: [T] = ???
}
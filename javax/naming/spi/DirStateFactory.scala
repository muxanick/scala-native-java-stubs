package javax.naming.spi

// This interface represents a factory for obtaining the state of an
// object and corresponding attributes for binding.
//
// The JNDI framework allows for object implementations to
// be loaded in dynamically via object factories.
// 
// A DirStateFactory extends StateFactory
// by allowing an Attributes instance
// to be supplied to and be returned by the getStateToBind() method.
// DirStateFactory implementations are intended to be used by
// DirContext service providers.
// When a caller binds an object using DirContext.bind(),
// he might also specify a set of attributes to be bound with the object.
// The object and attributes to be bound are passed to
// the getStateToBind() method of a factory.
// If the factory processes the object and attributes, it returns
// a corresponding pair of object and attributes to be bound.
// If the factory does not process the object, it must return null.
//
// For example, a caller might bind a printer object with some printer-related
// attributes.
//
// ctx.rebind("inky", printer, printerAttrs);
//
// An LDAP service provider for ctx uses a DirStateFactory
// (indirectly via DirectoryManager.getStateToBind())
// and gives it printer and printerAttrs. A factory for
// an LDAP directory might turn printer into a set of attributes
// and merge that with printerAttrs. The service provider then
// uses the resulting attributes to create an LDAP entry and updates
// the directory.
//
//  Since DirStateFactory extends StateFactory, it
// has two getStateToBind() methods, where one
// differs from the other by the attributes
// argument. DirectoryManager.getStateToBind() will only use
// the form that accepts the attributes argument, while
// NamingManager.getStateToBind() will only use the form that
// does not accept the attributes argument.
//
//  Either form of the getStateToBind() method of a
// DirStateFactory may be invoked multiple times, possibly using different
// parameters.  The implementation is thread-safe.
trait DirStateFactory extends StateFactory {
}

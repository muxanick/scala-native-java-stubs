package javax.naming.spi

/** This interface represents a factory that creates an initial context.
 * 
 *  The JNDI framework allows for different initial context implementations
 *  to be specified at runtime.  The initial context is created using
 *  an initial context factory.
 *  An initial context factory must implement the InitialContextFactory
 *  interface, which provides a method for creating instances of initial
 *  context that implement the Context interface.
 *  In addition, the factory class must be public and must have a public
 *  constructor that accepts no arguments.
 */
trait InitialContextFactory {
}

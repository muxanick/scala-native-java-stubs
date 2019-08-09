package javax.naming.spi

/** This interface represents a builder that creates initial context factories.
 * 
 *  The JNDI framework allows for different initial context implementations
 *  to be specified at runtime.  An initial context is created using
 *  an initial context factory. A program can install its own builder
 *  that creates initial context factories, thereby overriding the
 *  default policies used by the framework, by calling
 *  NamingManager.setInitialContextFactoryBuilder().
 *  The InitialContextFactoryBuilder interface must be implemented by
 *  such a builder.
 */
trait InitialContextFactoryBuilder {
}

package javax.naming.spi

import java.util.Hashtable
import scala.scalanative.annotation.stub

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

    /** Creates an initial context factory using the specified
     *  environment.
     */
    @stub
    def createInitialContextFactory(environment: Hashtable[_, _]): InitialContextFactory = ???
}

package java.util

import java.lang.{Error, Object, String, Throwable}

/** Error thrown when something goes wrong while loading a service provider.
 * 
 *   This error will be thrown in the following situations:
 * 
 *  
 * 
 *     The format of a provider-configuration file violates the specification; 
 * 
 *     An IOException occurs while reading a
 *    provider-configuration file; 
 * 
 *     A concrete provider class named in a provider-configuration file
 *    cannot be found; 
 * 
 *     A concrete provider class is not a subclass of the service class;
 *    
 * 
 *     A concrete provider class cannot be instantiated; or
 * 
 *     Some other kind of error occurs. 
 * 
 *  
 */
class ServiceConfigurationError extends Error {

    /** Constructs a new instance with the specified message. */
    @stub
    def this(msg: String) = ???
}

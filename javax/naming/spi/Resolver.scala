package javax.naming.spi

import java.lang.{Class, String}
import javax.naming.{Context, Name}
import scala.scalanative.annotation.stub

/** This interface represents an "intermediate context" for name resolution.
 * 
 *  The Resolver interface contains methods that are implemented by contexts
 *  that do not support subtypes of Context, but which can act as
 *  intermediate contexts for resolution purposes.
 * 
 *  A Name parameter passed to any method is owned
 *  by the caller.  The service provider will not modify the object
 *  or keep a reference to it.
 *  A ResolveResult object returned by any
 *  method is owned by the caller.  The caller may subsequently modify it;
 *  the service provider may not.
 */
trait Resolver {

    /** Partially resolves a name. */
    @stub
    def resolveToClass(name: Name, contextType: Class[_ <: Context]): ResolveResult = ???

    /** Partially resolves a name. */
    @stub
    def resolveToClass(name: String, contextType: Class[_ <: Context]): ResolveResult = ???
}

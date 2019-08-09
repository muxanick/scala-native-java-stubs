package javax.naming.spi

import java.lang.Class
import javax.naming.{Context, Name}

// This interface represents an "intermediate context" for name resolution.
//
// The Resolver interface contains methods that are implemented by contexts
// that do not support subtypes of Context, but which can act as
// intermediate contexts for resolution purposes.
//
// A Name parameter passed to any method is owned
// by the caller.  The service provider will not modify the object
// or keep a reference to it.
// A ResolveResult object returned by any
// method is owned by the caller.  The caller may subsequently modify it;
// the service provider may not.
trait Resolver {

    @stub
    // Partially resolves a name.
    def resolveToClass(name: Name, contextType: Class[_ <: Context]): ResolveResult = ???
}

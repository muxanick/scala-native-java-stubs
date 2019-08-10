package javax.naming

import java.lang.{Object, String}
import java.util.Hashtable
import scala.scalanative.annotation.stub

/** This class is the starting context for performing naming operations.
 * 
 *  All naming operations are relative to a context.
 *  The initial context implements the Context interface and
 *  provides the starting point for resolution of names.
 * 
 *  
 *  When the initial context is constructed, its environment
 *  is initialized with properties defined in the environment parameter
 *  passed to the constructor, and in any
 *  application resource files.
 *  In addition, a small number of standard JNDI properties may
 *  be specified as system properties or as applet parameters
 *  (through the use of Context.APPLET).
 *  These special properties are listed in the field detail sections of the
 *  Context and
 *  LdapContext
 *  interface documentation.
 * 
 *  JNDI determines each property's value by merging
 *  the values from the following two sources, in order:
 *  
 *  
 *  The first occurrence of the property from the constructor's
 *  environment parameter and (for appropriate properties) the applet
 *  parameters and system properties.
 *  
 *  The application resource files (jndi.properties).
 *  
 *  For each property found in both of these two sources, or in
 *  more than one application resource file, the property's value
 *  is determined as follows.  If the property is
 *  one of the standard JNDI properties that specify a list of JNDI
 *  factories (see Context),
 *  all of the values are
 *  concatenated into a single colon-separated list.  For other
 *  properties, only the first value found is used.
 * 
 * 
 *  The initial context implementation is determined at runtime.
 *  The default policy uses the environment property
 *  "java.naming.factory.initial",
 *  which contains the class name of the initial context factory.
 *  An exception to this policy is made when resolving URL strings, as described
 *  below.
 * 
 *  When a URL string (a String of the form
 *  scheme_id:rest_of_name) is passed as a name parameter to
 *  any method, a URL context factory for handling that scheme is
 *  located and used to resolve the URL.  If no such factory is found,
 *  the initial context specified by
 *  "java.naming.factory.initial" is used.  Similarly, when a
 *  CompositeName object whose first component is a URL string is
 *  passed as a name parameter to any method, a URL context factory is
 *  located and used to resolve the first name component.
 *  See NamingManager.getURLContext() for a description of how URL
 *  context factories are located.
 * 
 *  This default policy of locating the initial context and URL context
 *  factories may be overridden
 *  by calling
 *  NamingManager.setInitialContextFactoryBuilder().
 * 
 *  NoInitialContextException is thrown when an initial context cannot
 *  be instantiated. This exception can be thrown during any interaction
 *  with the InitialContext, not only when the InitialContext is constructed.
 *  For example, the implementation of the initial context might lazily
 *  retrieve the context only when actual methods are invoked on it.
 *  The application should not have any dependency on when the existence
 *  of an initial context is determined.
 * 
 *  When the environment property "java.naming.factory.initial" is
 *  non-null, the InitialContext constructor will attempt to create the
 *  initial context specified therein. At that time, the initial context factory
 *  involved might throw an exception if a problem is encountered. However,
 *  it is provider implementation-dependent when it verifies and indicates
 *  to the users of the initial context any environment property- or
 *  connection- related problems. It can do so lazily--delaying until
 *  an operation is performed on the context, or eagerly, at the time
 *  the context is constructed.
 * 
 *  An InitialContext instance is not synchronized against concurrent
 *  access by multiple threads. Multiple threads each manipulating a
 *  different InitialContext instance need not synchronize.
 *  Threads that need to access a single InitialContext instance
 *  concurrently should synchronize amongst themselves and provide the
 *  necessary locking.
 */
class InitialContext extends Object with Context {

    /** Constructs an initial context. */
    @stub
    def this() = ???

    /** Constructs an initial context with the option of not
     *  initializing it.
     */
    @stub
    protected def this(lazy: Boolean) = ???

    /** Constructs an initial context using the supplied environment. */
    @stub
    def this(environment: Hashtable[_, _]) = ???

    /** Field holding the result of calling NamingManager.getInitialContext(). */
    @stub
    protected val defaultInitCtx: Context = ???

    /** Field indicating whether the initial context has been obtained
     *  by calling NamingManager.getInitialContext().
     */
    @stub
    protected val gotDefault: Boolean = ???

    /** The environment associated with this InitialContext. */
    @stub
    protected val myProps: Hashtable[Object, Object] = ???

    /** Adds a new environment property to the environment of this
     *  context.
     */
    @stub
    def addToEnvironment(propName: String, propVal: Any): Any = ???

    /** Binds a name to an object. */
    @stub
    def bind(name: Name, obj: Any): Unit = ???

    /** Binds a name to an object. */
    @stub
    def bind(name: String, obj: Any): Unit = ???

    /** Closes this context. */
    @stub
    def close(): Unit = ???

    /** Composes the name of this context with a name relative to
     *  this context.
     */
    @stub
    def composeName(name: Name, prefix: Name): Name = ???

    /** Composes the name of this context with a name relative to
     *  this context.
     */
    @stub
    def composeName(name: String, prefix: String): String = ???

    /** Creates and binds a new context. */
    @stub
    def createSubcontext(name: Name): Context = ???

    /** Creates and binds a new context. */
    @stub
    def createSubcontext(name: String): Context = ???

    /** Destroys the named context and removes it from the namespace. */
    @stub
    def destroySubcontext(name: Name): Unit = ???

    /** Destroys the named context and removes it from the namespace. */
    @stub
    def destroySubcontext(name: String): Unit = ???

    /** Retrieves the initial context by calling
     *  NamingManager.getInitialContext()
     *  and cache it in defaultInitCtx.
     */
    @stub
    protected def getDefaultInitCtx(): Context = ???

    /** Retrieves the environment in effect for this context. */
    @stub
    def getEnvironment(): Hashtable[_, _] = ???

    /** Retrieves the full name of this context within its own namespace. */
    @stub
    def getNameInNamespace(): String = ???

    /** Retrieves the parser associated with the named context. */
    @stub
    def getNameParser(name: Name): NameParser = ???

    /** Retrieves the parser associated with the named context. */
    @stub
    def getNameParser(name: String): NameParser = ???

    /** Retrieves a context for resolving name. */
    @stub
    protected def getURLOrDefaultInitCtx(name: Name): Context = ???

    /** Retrieves a context for resolving the string name name. */
    @stub
    protected def getURLOrDefaultInitCtx(name: String): Context = ???

    /** Initializes the initial context using the supplied environment. */
    @stub
    protected def init(environment: Hashtable[_, _]): Unit = ???

    /** Enumerates the names bound in the named context, along with the
     *  class names of objects bound to them.
     */
    @stub
    def list(name: Name): NamingEnumeration[NameClassPair] = ???

    /** Enumerates the names bound in the named context, along with the
     *  class names of objects bound to them.
     */
    @stub
    def list(name: String): NamingEnumeration[NameClassPair] = ???

    /** Enumerates the names bound in the named context, along with the
     *  objects bound to them.
     */
    @stub
    def listBindings(name: Name): NamingEnumeration[Binding] = ???

    /** Enumerates the names bound in the named context, along with the
     *  objects bound to them.
     */
    @stub
    def listBindings(name: String): NamingEnumeration[Binding] = ???

    /** Retrieves the named object. */
    @stub
    def lookup(name: Name): Any = ???

    /** Retrieves the named object. */
    @stub
    def lookup(name: String): Any = ???

    /** Retrieves the named object, following links except
     *  for the terminal atomic component of the name.
     */
    @stub
    def lookupLink(name: Name): Any = ???

    /** Retrieves the named object, following links except
     *  for the terminal atomic component of the name.
     */
    @stub
    def lookupLink(name: String): Any = ???

    /** Binds a name to an object, overwriting any existing binding. */
    @stub
    def rebind(name: Name, obj: Any): Unit = ???

    /** Binds a name to an object, overwriting any existing binding. */
    @stub
    def rebind(name: String, obj: Any): Unit = ???

    /** Removes an environment property from the environment of this
     *  context.
     */
    @stub
    def removeFromEnvironment(propName: String): Any = ???

    /** Binds a new name to the object bound to an old name, and unbinds
     *  the old name.
     */
    @stub
    def rename(oldName: Name, newName: Name): Unit = ???

    /** Binds a new name to the object bound to an old name, and unbinds
     *  the old name.
     */
    @stub
    def rename(oldName: String, newName: String): Unit = ???

    /** Unbinds the named object. */
    @stub
    def unbind(name: Name): Unit = ???

    /** Unbinds the named object. */
    @stub
    def unbind(name: String): Unit = ???
}

object InitialContext {
    /** A static method to retrieve the named object. */
    @stub
    def doLookup[T](name: Name): T = ???

    /** A static method to retrieve the named object. */
    @stub
    def doLookup[T](name: String): T = ???
}

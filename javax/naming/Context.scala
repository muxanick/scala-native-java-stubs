package javax.naming

import java.lang.{Object, String}
import java.util.Hashtable
import scala.scalanative.annotation.stub

/** This interface represents a naming context, which
 *  consists of a set of name-to-object bindings.
 *  It contains methods for examining and updating these bindings.
 * 
 *  Names
 *  Each name passed as an argument to a Context method is relative
 *  to that context.  The empty name is used to name the context itself.
 *  A name parameter may never be null.
 *  
 *  Most of the methods have overloaded versions with one taking a
 *  Name parameter and one taking a String.
 *  These overloaded versions are equivalent in that if
 *  the Name and String parameters are just
 *  different representations of the same name, then the overloaded
 *  versions of the same methods behave the same.
 *  In the method descriptions below, only one version is fully documented.
 *  The second version instead has a link to the first:  the same
 *  documentation applies to both.
 *  
 *  For systems that support federation, String name arguments to
 *  Context methods are composite names. Name arguments that are
 *  instances of CompositeName are treated as composite names,
 *  while Name arguments that are not instances of
 *  CompositeName are treated as compound names (which might be
 *  instances of CompoundName or other implementations of compound
 *  names). This allows the results of NameParser.parse() to be used as
 *  arguments to the Context methods.
 *  Prior to JNDI 1.2, all name arguments were treated as composite names.
 * 
 *  Furthermore, for systems that support federation, all names returned
 *  in a NamingEnumeration
 *  from list() and listBindings() are composite names
 *  represented as strings.
 *  See CompositeName for the string syntax of names.
 * 
 *  For systems that do not support federation, the name arguments (in
 *  either Name or String forms) and the names returned in
 *  NamingEnumeration may be names in their own namespace rather than
 *  names in a composite namespace, at the discretion of the service
 *  provider.
 * 
 * Exceptions
 *  All the methods in this interface can throw a NamingException or
 *  any of its subclasses. See NamingException and their subclasses
 *  for details on each exception.
 * 
 * Concurrent Access
 *  A Context instance is not guaranteed to be synchronized against
 *  concurrent access by multiple threads.  Threads that need to access
 *  a single Context instance concurrently should synchronize amongst
 *  themselves and provide the necessary locking.  Multiple threads
 *  each manipulating a different Context instance need not
 *  synchronize.  Note that the lookup
 *  method, when passed an empty name, will return a new Context instance
 *  representing the same naming context.
 * 
 *  For purposes of concurrency control,
 *  a Context operation that returns a NamingEnumeration is
 *  not considered to have completed while the enumeration is still in
 *  use, or while any referrals generated by that operation are still
 *  being followed.
 * 
 * 
 * Parameters
 *  A Name parameter passed to any method of the
 *  Context interface or one of its subinterfaces
 *  will not be modified by the service provider.
 *  The service provider may keep a reference to it
 *  for the duration of the operation, including any enumeration of the
 *  method's results and the processing of any referrals generated.
 *  The caller should not modify the object during this time.
 *  A Name returned by any such method is owned by the caller.
 *  The caller may subsequently modify it; the service provider may not.
 * 
 * 
 * Environment Properties
 * 
 *  JNDI applications need a way to communicate various preferences
 *  and properties that define the environment in which naming and
 *  directory services are accessed. For example, a context might
 *  require specification of security credentials in order to access
 *  the service. Another context might require that server configuration
 *  information be supplied. These are referred to as the environment
 *  of a context. The Context interface provides methods for
 *  retrieving and updating this environment.
 * 
 *  The environment is inherited from the parent context as
 *  context methods proceed from one context to the next. Changes to
 *  the environment of one context do not directly affect those
 *  of other contexts.
 * 
 *  It is implementation-dependent when environment properties are used
 *  and/or verified for validity.  For example, some of the
 *  security-related properties are used by service providers to "log in"
 *  to the directory.  This login process might occur at the time the
 *  context is created, or the first time a method is invoked on the
 *  context.  When, and whether this occurs at all, is
 *  implementation-dependent.  When environment properties are added or
 *  removed from the context, verifying the validity of the changes is again
 *  implementation-dependent. For example, verification of some properties
 *  might occur at the time the change is made, or at the time the next
 *  operation is performed on the context, or not at all.
 * 
 *  Any object with a reference to a context may examine that context's
 *  environment.  Sensitive information such as clear-text
 *  passwords should not be stored there unless the implementation is
 *  known to protect it.
 * 
 * 
 * 
 * Resource Files
 * 
 *  To simplify the task of setting up the environment
 *  required by a JNDI application,
 *  application components and service providers may be distributed
 *  along with resource files.
 *  A JNDI resource file is a file in the properties file format (see
 *  java.util.Properties),
 *  containing a list of key/value pairs.
 *  The key is the name of the property (e.g. "java.naming.factory.object")
 *  and the value is a string in the format defined
 *  for that property.  Here is an example of a JNDI resource file:
 * 
 *  java.naming.factory.object=com.sun.jndi.ldap.AttrsToCorba:com.wiz.from.Person
 *  java.naming.factory.state=com.sun.jndi.ldap.CorbaToAttrs:com.wiz.from.Person
 *  java.naming.factory.control=com.sun.jndi.ldap.ResponseControlFactory
 *  
 * 
 *  The JNDI class library reads the resource files and makes the property
 *  values freely available.  Thus JNDI resource files should be considered
 *  to be "world readable", and sensitive information such as clear-text
 *  passwords should not be stored there.
 * 
 *  There are two kinds of JNDI resource files:
 *  provider and application.
 * 
 *  Provider Resource Files
 * 
 *  Each service provider has an optional resource that lists properties
 *  specific to that provider.  The name of this resource is:
 *  
 *  [prefix/]jndiprovider.properties
 *  
 *  where prefix is
 *  the package name of the provider's context implementation(s),
 *  with each period (".") converted to a slash ("/").
 * 
 *  For example, suppose a service provider defines a context
 *  implementation with class name com.sun.jndi.ldap.LdapCtx.
 *  The provider resource for this provider is named
 *  com/sun/jndi/ldap/jndiprovider.properties.  If the class is
 *  not in a package, the resource's name is simply
 *  jndiprovider.properties.
 * 
 *  
 *  
 *  Certain methods in the JNDI class library make use of the standard
 *  JNDI properties that specify lists of JNDI factories:
 *  
 *  java.naming.factory.object
 *  java.naming.factory.state
 *  java.naming.factory.control
 *  java.naming.factory.url.pkgs
 *  
 *  The JNDI library will consult the provider resource file
 *  when determining the values of these properties.
 *  Properties other than these may be set in the provider
 *  resource file at the discretion of the service provider.
 *  The service provider's documentation should clearly state which
 *  properties are allowed; other properties in the file will be ignored.
 * 
 *  Application Resource Files
 * 
 *  When an application is deployed, it will generally have several
 *  codebase directories and JARs in its classpath.  Similarly, when an
 *  applet is deployed, it will have a codebase and archives specifying
 *  where to find the applet's classes.  JNDI locates (using
 *  ClassLoader.getResources())
 *  all application resource files named jndi.properties
 *  in the classpath.
 *  In addition, if the file java.home/lib/jndi.properties
 *  exists and is readable,
 *  JNDI treats it as an additional application resource file.
 *  (java.home indicates the
 *  directory named by the java.home system property.)
 *  All of the properties contained in these files are placed
 *  into the environment of the initial context.  This environment
 *  is then inherited by other contexts.
 * 
 *  
 *  For each property found in more than one application resource file,
 *  JNDI uses the first value found or, in a few cases where it makes
 *  sense to do so, it concatenates all of the values (details are given
 *  below).
 *  For example, if the "java.naming.factory.object" property is found in
 *  three jndi.properties resource files, the
 *  list of object factories is a concatenation of the property
 *  values from all three files.
 *  Using this scheme, each deployable component is responsible for
 *  listing the factories that it exports.  JNDI automatically
 *  collects and uses all of these export lists when searching for factory
 *  classes.
 * 
 *  Search Algorithm for Properties
 * 
 *  When JNDI constructs an initial context, the context's environment
 *  is initialized with properties defined in the environment parameter
 *  passed to the constructor, the system properties, the applet parameters,
 *  and the application resource files.  See
 *  InitialContext
 *  for details.
 *  This initial environment is then inherited by other context instances.
 * 
 *  
 *  When the JNDI class library needs to determine
 *  the value of a property, it does so by merging
 *  the values from the following two sources, in order:
 *  
 *  The environment of the context being operated on.
 *  The provider resource file (jndiprovider.properties)
 *  for the context being operated on.
 *  
 *  For each property found in both of these two sources,
 *  JNDI determines the property's value as follows.  If the property is
 *  one of the standard JNDI properties that specify a list of JNDI
 *  factories (listed above), the values are
 *  concatenated into a single colon-separated list.  For other
 *  properties, only the first value found is used.
 * 
 *  
 *  When a service provider needs to determine the value of a property,
 *  it will generally take that value directly from the environment.
 *  A service provider may define provider-specific properties
 *  to be placed in its own provider resource file.  In that
 *  case it should merge values as described in the previous paragraph.
 * 
 *  
 *  In this way, each service provider developer can specify a list of
 *  factories to use with that service provider. These can be modified by
 *  the application resources specified by the deployer of the application
 *  or applet, which in turn can be modified by the user.
 */
trait Context {

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

object Context {
    /** Constant that holds the name of the environment property for
     *  specifying an applet for the initial context constructor to use
     *  when searching for other properties.
     */
    @stub
    val APPLET: String = ???

    /** Constant that holds the name of the environment property for
     *  specifying the authoritativeness of the service requested.
     */
    @stub
    val AUTHORITATIVE: String = ???

    /** Constant that holds the name of the environment property for
     *  specifying the batch size to use when returning data via the
     *  service's protocol.
     */
    @stub
    val BATCHSIZE: String = ???

    /** Constant that holds the name of the environment property
     *  for specifying the DNS host and domain names to use for the
     *  JNDI URL context (for example, "dns://somehost/wiz.com").
     */
    @stub
    val DNS_URL: String = ???

    /** Constant that holds the name of the environment property
     *  for specifying the initial context factory to use.
     */
    @stub
    val INITIAL_CONTEXT_FACTORY: String = ???

    /** Constant that holds the name of the environment property for
     *  specifying the preferred language to use with the service.
     */
    @stub
    val LANGUAGE: String = ???

    /** Constant that holds the name of the environment property
     *  for specifying the list of object factories to use.
     */
    @stub
    val OBJECT_FACTORIES: String = ???

    /** Constant that holds the name of the environment property
     *  for specifying configuration information for the service provider
     *  to use.
     */
    @stub
    val PROVIDER_URL: String = ???

    /** Constant that holds the name of the environment property for
     *  specifying how referrals encountered by the service provider
     *  are to be processed.
     */
    @stub
    val REFERRAL: String = ???

    /** Constant that holds the name of the environment property for
     *  specifying the security level to use.
     */
    @stub
    val SECURITY_AUTHENTICATION: String = ???

    /** Constant that holds the name of the environment property for
     *  specifying the credentials of the principal for authenticating
     *  the caller to the service.
     */
    @stub
    val SECURITY_CREDENTIALS: String = ???

    /** Constant that holds the name of the environment property for
     *  specifying the identity of the principal for authenticating
     *  the caller to the service.
     */
    @stub
    val SECURITY_PRINCIPAL: String = ???

    /** Constant that holds the name of the environment property for
     *  specifying the security protocol to use.
     */
    @stub
    val SECURITY_PROTOCOL: String = ???

    /** Constant that holds the name of the environment property
     *  for specifying the list of state factories to use.
     */
    @stub
    val STATE_FACTORIES: String = ???

    /** Constant that holds the name of the environment property
     *  for specifying the list of package prefixes to use when
     *  loading in URL context factories.
     */
    @stub
    val URL_PKG_PREFIXES: String = ???
}

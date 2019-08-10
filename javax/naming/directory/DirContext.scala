package javax.naming.directory

import java.lang.{Object, String}
import javax.naming.{Context, Name, NamingEnumeration}
import scala.scalanative.annotation.stub

/** The directory service interface, containing
 *  methods for examining and updating attributes
 *  associated with objects, and for searching the directory.
 * 
 *  Names
 *  Each name passed as an argument to a DirContext method is relative
 *  to that context.  The empty name is used to name the context itself.
 *  The name parameter may never be null.
 *  
 *  Most of the methods have overloaded versions with one taking a
 *  Name parameter and one taking a String.
 *  These overloaded versions are equivalent in that if
 *  the Name and String parameters are just
 *  different representations of the same name, then the overloaded
 *  versions of the same methods behave the same.
 *  In the method descriptions below, only one version is documented.
 *  The second version instead has a link to the first:  the same
 *  documentation applies to both.
 *  
 *  See Context for a discussion on the interpretation of the
 *  name argument to the Context methods. These same rules
 *  apply to the name argument to the DirContext methods.
 * 
 *  Attribute Models
 *  There are two basic models of what attributes should be
 *  associated with.  First, attributes may be directly associated with a
 *  DirContext object.
 *  In this model, an attribute operation on the named object is
 *  roughly equivalent
 *  to a lookup on the name (which returns the DirContext object),
 *  followed by the attribute operation invoked on the DirContext object
 *  in which the caller supplies an empty name. The attributes can be viewed
 *  as being stored along with the object (note that this does not imply that
 *  the implementation must do so).
 *  
 *  The second model is that attributes are associated with a
 *  name (typically an atomic name) in a DirContext.
 *  In this model, an attribute operation on the named object is
 *  roughly equivalent to a lookup on the name of the parent DirContext of the
 *  named object, followed by the attribute operation invoked on the parent
 *  in which the caller supplies the terminal atomic name.
 *  The attributes can be viewed as being stored in the parent DirContext
 *  (again, this does not imply that the implementation must do so).
 *  Objects that are not DirContexts can have attributes, as long as
 *  their parents are DirContexts.
 *  
 *  JNDI support both of these models.
 *  It is up to the individual service providers to decide where to
 *  "store" attributes.
 *  JNDI clients are safest when they do not make assumptions about
 *  whether an object's attributes are stored as part of the object, or stored
 *  within the parent object and associated with the object's name.
 * 
 *  Attribute Type Names
 *  In the getAttributes() and search() methods,
 *  you can supply the attributes to return by supplying a list of
 *  attribute names (strings).
 *  The attributes that you get back might not have the same names as the
 *  attribute names you have specified. This is because some directories
 *  support features that cause them to return other attributes.  Such
 *  features include attribute subclassing, attribute name synonyms, and
 *  attribute language codes.
 *  
 *  In attribute subclassing, attributes are defined in a class hierarchy.
 *  In some directories, for example, the "name" attribute might be the
 *  superclass of all name-related attributes, including "commonName" and
 *  "surName".  Asking for the "name" attribute might return both the
 *  "commonName" and "surName" attributes.
 *  
 *  With attribute type synonyms, a directory can assign multiple names to
 *  the same attribute. For example, "cn" and "commonName" might both
 *  refer to the same attribute. Asking for "cn" might return the
 *  "commonName" attribute.
 *  
 *  Some directories support the language codes for attributes.
 *  Asking such a directory for the "description" attribute, for example,
 *  might return all of the following attributes:
 *  
 *  description
 *  description;lang-en
 *  description;lang-de
 *  description;lang-fr
 *  
 * 
 * 
 * Operational Attributes
 * 
 *  Some directories have the notion of "operational attributes" which are
 *  attributes associated with a directory object for administrative
 *  purposes. An example of operational attributes is the access control
 *  list for an object.
 *  
 *  In the getAttributes() and search() methods,
 *  you can specify that all attributes associated with the requested objects
 *  be returned by supply null as the list of attributes to return.
 *  The attributes returned do not include operational attributes.
 *  In order to retrieve operational attributes, you must name them explicitly.
 * 
 * 
 *  Named Context
 *  
 *  There are certain methods in which the name must resolve to a context
 *  (for example, when searching a single level context). The documentation
 *  of such methods
 *  use the term named context to describe their name parameter.
 *  For these methods, if the named object is not a DirContext,
 *  NotContextException is thrown.
 *  Aside from these methods, there is no requirement that the
 *  named object be a DirContext.
 * 
 * Parameters
 * 
 *  An Attributes, SearchControls, or array object
 *  passed as a parameter to any method will not be modified by the
 *  service provider.  The service provider may keep a reference to it
 *  for the duration of the operation, including any enumeration of the
 *  method's results and the processing of any referrals generated.
 *  The caller should not modify the object during this time.
 *  An Attributes object returned by any method is owned by
 *  the caller.  The caller may subsequently modify it; the service
 *  provider will not.
 * 
 * Exceptions
 * 
 *  All the methods in this interface can throw a NamingException or
 *  any of its subclasses. See NamingException and their subclasses
 *  for details on each exception.
 */
trait DirContext extends Context {

    /** Binds a name to an object, along with associated attributes. */
    @stub
    def bind(name: Name, obj: Any, attrs: Attributes): Unit = ???

    /** Binds a name to an object, along with associated attributes. */
    @stub
    def bind(name: String, obj: Any, attrs: Attributes): Unit = ???

    /** Creates and binds a new context, along with associated attributes. */
    @stub
    def createSubcontext(name: Name, attrs: Attributes): DirContext = ???

    /** Creates and binds a new context, along with associated attributes. */
    @stub
    def createSubcontext(name: String, attrs: Attributes): DirContext = ???

    /** Retrieves all of the attributes associated with a named object. */
    @stub
    def getAttributes(name: Name): Attributes = ???

    /** Retrieves selected attributes associated with a named object. */
    @stub
    def getAttributes(name: Name, attrIds: Array[String]): Attributes = ???

    /** Retrieves all of the attributes associated with a named object. */
    @stub
    def getAttributes(name: String): Attributes = ???

    /** Retrieves selected attributes associated with a named object. */
    @stub
    def getAttributes(name: String, attrIds: Array[String]): Attributes = ???

    /** Retrieves the schema associated with the named object. */
    @stub
    def getSchema(name: Name): DirContext = ???

    /** Retrieves the schema associated with the named object. */
    @stub
    def getSchema(name: String): DirContext = ???

    /** Retrieves a context containing the schema objects of the
     *  named object's class definitions.
     */
    @stub
    def getSchemaClassDefinition(name: Name): DirContext = ???

    /** Retrieves a context containing the schema objects of the
     *  named object's class definitions.
     */
    @stub
    def getSchemaClassDefinition(name: String): DirContext = ???

    /** Modifies the attributes associated with a named object. */
    @stub
    def modifyAttributes(name: Name, mod_op: Int, attrs: Attributes): Unit = ???

    /** Modifies the attributes associated with a named object using
     *  an ordered list of modifications.
     */
    @stub
    def modifyAttributes(name: Name, mods: Array[ModificationItem]): Unit = ???

    /** Modifies the attributes associated with a named object. */
    @stub
    def modifyAttributes(name: String, mod_op: Int, attrs: Attributes): Unit = ???

    /** Modifies the attributes associated with a named object using
     *  an ordered list of modifications.
     */
    @stub
    def modifyAttributes(name: String, mods: Array[ModificationItem]): Unit = ???

    /** Binds a name to an object, along with associated attributes,
     *  overwriting any existing binding.
     */
    @stub
    def rebind(name: Name, obj: Any, attrs: Attributes): Unit = ???

    /** Binds a name to an object, along with associated attributes,
     *  overwriting any existing binding.
     */
    @stub
    def rebind(name: String, obj: Any, attrs: Attributes): Unit = ???

    /** Searches in a single context for objects that contain a
     *  specified set of attributes.
     */
    @stub
    def search(name: Name, matchingAttributes: Attributes): NamingEnumeration[SearchResult] = ???

    /** Searches in a single context for objects that contain a
     *  specified set of attributes, and retrieves selected attributes.
     */
    @stub
    def search(name: Name, matchingAttributes: Attributes, attributesToReturn: Array[String]): NamingEnumeration[SearchResult] = ???

    /** Searches in the named context or object for entries that satisfy the
     *  given search filter.
     */
    @stub
    def search(name: Name, filterExpr: String, filterArgs: Array[Object], cons: SearchControls): NamingEnumeration[SearchResult] = ???

    /** Searches in the named context or object for entries that satisfy the
     *  given search filter.
     */
    @stub
    def search(name: Name, filter: String, cons: SearchControls): NamingEnumeration[SearchResult] = ???

    /** Searches in a single context for objects that contain a
     *  specified set of attributes.
     */
    @stub
    def search(name: String, matchingAttributes: Attributes): NamingEnumeration[SearchResult] = ???

    /** Searches in a single context for objects that contain a
     *  specified set of attributes, and retrieves selected attributes.
     */
    @stub
    def search(name: String, matchingAttributes: Attributes, attributesToReturn: Array[String]): NamingEnumeration[SearchResult] = ???

    /** Searches in the named context or object for entries that satisfy the
     *  given search filter.
     */
    @stub
    def search(name: String, filterExpr: String, filterArgs: Array[Object], cons: SearchControls): NamingEnumeration[SearchResult] = ???

    /** Searches in the named context or object for entries that satisfy the
     *  given search filter.
     */
    @stub
    def search(name: String, filter: String, cons: SearchControls): NamingEnumeration[SearchResult] = ???
}

object DirContext {
    /** This constant specifies to add an attribute with the specified values. */
    @stub
    val ADD_ATTRIBUTE: Int = ???

    /** This constant specifies to delete
     *  the specified attribute values from the attribute.
     */
    @stub
    val REMOVE_ATTRIBUTE: Int = ???

    /** This constant specifies to replace an attribute with specified values. */
    @stub
    val REPLACE_ATTRIBUTE: Int = ???
}

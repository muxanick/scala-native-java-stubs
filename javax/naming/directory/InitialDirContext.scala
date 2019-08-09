package javax.naming.directory

import java.lang.{Object, String}
import javax.naming.{InitialContext, Name, NamingEnumeration}

/** This class is the starting context for performing
 *  directory operations. The documentation in the class description
 *  of InitialContext (including those for synchronization) apply here.
 */
class InitialDirContext extends InitialContext with DirContext {

    /** Constructs an initial DirContext. */
    @stub
    def this() = ???

    /** Constructs an initial DirContext with the option of not
     *  initializing it.
     */
    @stub
    protected def this(lazy: Boolean) = ???

    /** Binds a name to an object, along with associated attributes. */
    @stub
    def bind(name: Name, obj: Object, attrs: Attributes): Unit = ???

    /** Binds a name to an object, along with associated attributes. */
    @stub
    def bind(name: String, obj: Object, attrs: Attributes): Unit = ???

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
    def rebind(name: Name, obj: Object, attrs: Attributes): Unit = ???

    /** Binds a name to an object, along with associated attributes,
     *  overwriting any existing binding.
     */
    @stub
    def rebind(name: String, obj: Object, attrs: Attributes): Unit = ???

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
}

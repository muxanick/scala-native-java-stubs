package javax.naming.directory

import java.lang.{Object, String}
import javax.naming.{InitialContext, Name, NamingEnumeration}

// This class is the starting context for performing
// directory operations. The documentation in the class description
// of InitialContext (including those for synchronization) apply here.
class InitialDirContext extends InitialContext with DirContext {

    @stub
    // Constructs an initial DirContext.
    def this() = ???

    @stub
    // Constructs an initial DirContext with the option of not
    // initializing it.
    protected def this(lazy: Boolean) = ???

    @stub
    // Binds a name to an object, along with associated attributes.
    def bind(name: Name, obj: Object, attrs: Attributes): Unit = ???

    @stub
    // Binds a name to an object, along with associated attributes.
    def bind(name: String, obj: Object, attrs: Attributes): Unit = ???

    @stub
    // Creates and binds a new context, along with associated attributes.
    def createSubcontext(name: Name, attrs: Attributes): DirContext = ???

    @stub
    // Creates and binds a new context, along with associated attributes.
    def createSubcontext(name: String, attrs: Attributes): DirContext = ???

    @stub
    // Retrieves all of the attributes associated with a named object.
    def getAttributes(name: Name): Attributes = ???

    @stub
    // Retrieves selected attributes associated with a named object.
    def getAttributes(name: Name, attrIds: Array[String]): Attributes = ???

    @stub
    // Retrieves all of the attributes associated with a named object.
    def getAttributes(name: String): Attributes = ???

    @stub
    // Retrieves selected attributes associated with a named object.
    def getAttributes(name: String, attrIds: Array[String]): Attributes = ???

    @stub
    // Retrieves the schema associated with the named object.
    def getSchema(name: Name): DirContext = ???

    @stub
    // Retrieves the schema associated with the named object.
    def getSchema(name: String): DirContext = ???

    @stub
    // Retrieves a context containing the schema objects of the
    // named object's class definitions.
    def getSchemaClassDefinition(name: Name): DirContext = ???

    @stub
    // Retrieves a context containing the schema objects of the
    // named object's class definitions.
    def getSchemaClassDefinition(name: String): DirContext = ???

    @stub
    // Modifies the attributes associated with a named object.
    def modifyAttributes(name: Name, mod_op: Int, attrs: Attributes): Unit = ???

    @stub
    // Modifies the attributes associated with a named object using
    // an ordered list of modifications.
    def modifyAttributes(name: Name, mods: Array[ModificationItem]): Unit = ???

    @stub
    // Modifies the attributes associated with a named object.
    def modifyAttributes(name: String, mod_op: Int, attrs: Attributes): Unit = ???

    @stub
    // Modifies the attributes associated with a named object using
    // an ordered list of modifications.
    def modifyAttributes(name: String, mods: Array[ModificationItem]): Unit = ???

    @stub
    // Binds a name to an object, along with associated attributes,
    // overwriting any existing binding.
    def rebind(name: Name, obj: Object, attrs: Attributes): Unit = ???

    @stub
    // Binds a name to an object, along with associated attributes,
    // overwriting any existing binding.
    def rebind(name: String, obj: Object, attrs: Attributes): Unit = ???

    @stub
    // Searches in a single context for objects that contain a
    // specified set of attributes.
    def search(name: Name, matchingAttributes: Attributes): NamingEnumeration[SearchResult] = ???

    @stub
    // Searches in a single context for objects that contain a
    // specified set of attributes, and retrieves selected attributes.
    def search(name: Name, matchingAttributes: Attributes, attributesToReturn: Array[String]): NamingEnumeration[SearchResult] = ???

    @stub
    // Searches in the named context or object for entries that satisfy the
    // given search filter.
    def search(name: Name, filterExpr: String, filterArgs: Array[Object], cons: SearchControls): NamingEnumeration[SearchResult] = ???

    @stub
    // Searches in the named context or object for entries that satisfy the
    // given search filter.
    def search(name: Name, filter: String, cons: SearchControls): NamingEnumeration[SearchResult] = ???

    @stub
    // Searches in a single context for objects that contain a
    // specified set of attributes.
    def search(name: String, matchingAttributes: Attributes): NamingEnumeration[SearchResult] = ???

    @stub
    // Searches in a single context for objects that contain a
    // specified set of attributes, and retrieves selected attributes.
    def search(name: String, matchingAttributes: Attributes, attributesToReturn: Array[String]): NamingEnumeration[SearchResult] = ???

    @stub
    // Searches in the named context or object for entries that satisfy the
    // given search filter.
    def search(name: String, filterExpr: String, filterArgs: Array[Object], cons: SearchControls): NamingEnumeration[SearchResult] = ???
}

package javax.naming.directory

import java.io.Serializable
import java.lang.{Object, String}

// This class encapsulates
// factors that determine scope of search and what gets returned
// as a result of the search.
//
// A SearchControls instance is not synchronized against concurrent
// multithreaded access. Multiple threads trying to access and modify
// a single SearchControls instance should lock the object.
class SearchControls extends Object with Serializable {

    @stub
    // Constructs a search constraints using defaults.
    def this() = ???

    @stub
    // Retrieves the maximum number of entries that will be returned
    // as a result of the search.
    def getCountLimit(): Long = ???

    @stub
    // Determines whether links will be dereferenced during the search.
    def getDerefLinkFlag(): Boolean = ???

    @stub
    // Retrieves the attributes that will be returned as part of the search.
    def getReturningAttributes(): Array[String] = ???

    @stub
    // Determines whether objects will be returned as part of the result.
    def getReturningObjFlag(): Boolean = ???

    @stub
    // Retrieves the search scope of these SearchControls.
    def getSearchScope(): Int = ???

    @stub
    // Retrieves the time limit of these SearchControls in milliseconds.
    def getTimeLimit(): Int = ???

    @stub
    // Sets the maximum number of entries to be returned
    // as a result of the search.
    def setCountLimit(limit: Long): Unit = ???

    @stub
    // Enables/disables link dereferencing during the search.
    def setDerefLinkFlag(on: Boolean): Unit = ???

    @stub
    // Specifies the attributes that will be returned as part of the search.
    def setReturningAttributes(attrs: Array[String]): Unit = ???

    @stub
    // Enables/disables returning objects returned as part of the result.
    def setReturningObjFlag(on: Boolean): Unit = ???

    @stub
    // Sets the search scope to one of:
    // OBJECT_SCOPE, ONELEVEL_SCOPE, SUBTREE_SCOPE.
    def setSearchScope(scope: Int): Unit = ???
}

object SearchControls {
    @stub
    // Search the named object.
    def OBJECT_SCOPE: Int = ???

    @stub
    // Search one level of the named context.
    def ONELEVEL_SCOPE: Int = ???
}

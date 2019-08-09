package javax.naming.directory

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class encapsulates
 *  factors that determine scope of search and what gets returned
 *  as a result of the search.
 * 
 *  A SearchControls instance is not synchronized against concurrent
 *  multithreaded access. Multiple threads trying to access and modify
 *  a single SearchControls instance should lock the object.
 */
class SearchControls extends Object with Serializable {

    /** Constructs a search constraints using defaults. */
    @stub
    def this() = ???

    /** Constructs a search constraints using arguments. */
    @stub
    def this(scope: Int, countlim: Long, timelim: Int, attrs: Array[String], retobj: Boolean, deref: Boolean) = ???

    /** Retrieves the maximum number of entries that will be returned
     *  as a result of the search.
     */
    @stub
    def getCountLimit(): Long = ???

    /** Determines whether links will be dereferenced during the search. */
    @stub
    def getDerefLinkFlag(): Boolean = ???

    /** Retrieves the attributes that will be returned as part of the search. */
    @stub
    def getReturningAttributes(): Array[String] = ???

    /** Determines whether objects will be returned as part of the result. */
    @stub
    def getReturningObjFlag(): Boolean = ???

    /** Retrieves the search scope of these SearchControls. */
    @stub
    def getSearchScope(): Int = ???

    /** Retrieves the time limit of these SearchControls in milliseconds. */
    @stub
    def getTimeLimit(): Int = ???

    /** Sets the maximum number of entries to be returned
     *  as a result of the search.
     */
    @stub
    def setCountLimit(limit: Long): Unit = ???

    /** Enables/disables link dereferencing during the search. */
    @stub
    def setDerefLinkFlag(on: Boolean): Unit = ???

    /** Specifies the attributes that will be returned as part of the search. */
    @stub
    def setReturningAttributes(attrs: Array[String]): Unit = ???

    /** Enables/disables returning objects returned as part of the result. */
    @stub
    def setReturningObjFlag(on: Boolean): Unit = ???

    /** Sets the search scope to one of:
     *  OBJECT_SCOPE, ONELEVEL_SCOPE, SUBTREE_SCOPE.
     */
    @stub
    def setSearchScope(scope: Int): Unit = ???

    /** Sets the time limit of these SearchControls in milliseconds. */
    @stub
    def setTimeLimit(ms: Int): Unit = ???
}

object SearchControls {
    /** Search the named object. */
    @stub
    val OBJECT_SCOPE: Int = ???

    /** Search one level of the named context. */
    @stub
    val ONELEVEL_SCOPE: Int = ???

    /** Search the entire subtree rooted at the named object. */
    @stub
    val SUBTREE_SCOPE: Int = ???
}

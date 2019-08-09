package javax.naming

import java.util.Enumeration
import scala.scalanative.annotation.stub

/** This interface is for enumerating lists returned by
 *  methods in the javax.naming and javax.naming.directory packages.
 *  It extends Enumeration to allow as exceptions to be thrown during
 *  the enumeration.
 * 
 *  When a method such as list(), listBindings(), or search() returns
 *  a NamingEnumeration, any exceptions encountered are reserved until
 *  all results have been returned. At the end of the enumeration, the
 *  exception is thrown (by hasMore());
 *  
 *  For example, if the list() is
 *  returning only a partial answer, the corresponding exception would
 *  be PartialResultException. list() would first return a NamingEnumeration.
 *  When the last of the results has been returned by the NamingEnumeration's
 *  next(), invoking hasMore() would result in PartialResultException being thrown.
 * 
 *  In another example, if a search() method was invoked with a specified
 *  size limit of 'n'. If the answer consists of more than 'n' results,
 *  search() would first return a NamingEnumeration.
 *  When the n'th result has been returned by invoking next() on the
 *  NamingEnumeration, a SizeLimitExceedException would then thrown when
 *  hasMore() is invoked.
 * 
 *  Note that if the program uses hasMoreElements() and nextElement() instead
 *  to iterate through the NamingEnumeration, because these methods
 *  cannot throw exceptions, no exception will be thrown. Instead,
 *  in the previous example, after the n'th result has been returned by
 *  nextElement(), invoking hasMoreElements() would return false.
 * 
 *  Note also that NoSuchElementException is thrown if the program invokes
 *  next() or nextElement() when there are no elements left in the enumeration.
 *  The program can always avoid this exception by using hasMore() and
 *  hasMoreElements() to check whether the end of the enumeration has been reached.
 * 
 *  If an exception is thrown during an enumeration,
 *  the enumeration becomes invalid.
 *  Subsequent invocation of any method on that enumeration
 *  will yield undefined results.
 */
trait NamingEnumeration[T] extends Enumeration[T] {

    /** Closes this enumeration. */
    @stub
    def close(): Unit = ???

    /** Determines whether there are any more elements in the enumeration. */
    @stub
    def hasMore(): Boolean = ???

    /** Retrieves the next element in the enumeration. */
    @stub
    def next(): T = ???
}

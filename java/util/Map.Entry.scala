package java.util

import java.lang.{Comparable, Object}
import scala.scalanative.annotation.stub

/** A map entry (key-value pair).  The Map.entrySet method returns
 *  a collection-view of the map, whose elements are of this class.  The
 *  only way to obtain a reference to a map entry is from the
 *  iterator of this collection-view.  These Map.Entry objects are
 *  valid only for the duration of the iteration; more formally,
 *  the behavior of a map entry is undefined if the backing map has been
 *  modified after the entry was returned by the iterator, except through
 *  the setValue operation on the map entry.
 */
trait Map_Entry[K, V] {

    /** Compares the specified object with this entry for equality. */
    @stub
    def equals(o: Any): Boolean = ???

    /** Returns the key corresponding to this entry. */
    @stub
    def getKey(): K = ???

    /** Returns the value corresponding to this entry. */
    @stub
    def getValue(): V = ???

    /** Returns the hash code value for this map entry. */
    @stub
    def hashCode(): Int = ???

    /** Replaces the value corresponding to this entry with the specified
     *  value (optional operation).
     */
    @stub
    def setValue(value: V): V = ???
}

object Map_Entry {
    /** Returns a comparator that compares Map.Entry in natural order on key. */
    @stub
    def comparingByKey[K <: Comparable[_ >: K], V](): Comparator[Map.Entry[K, V]] = ???

    /** Returns a comparator that compares Map.Entry by key using the given
     *  Comparator.
     */
    @stub
    def comparingByKey[K, V](cmp: Comparator[_ >: K]): Comparator[Map.Entry[K, V]] = ???

    /** Returns a comparator that compares Map.Entry in natural order on value. */
    @stub
    def comparingByValue[K, V <: Comparable[_ >: V]](): Comparator[Map.Entry[K, V]] = ???

    /** Returns a comparator that compares Map.Entry by value using the given
     *  Comparator.
     */
    @stub
    def comparingByValue[K, V](cmp: Comparator[_ >: V]): Comparator[Map.Entry[K, V]] = ???
}

package java.util

import java.lang.{Comparable, Object}

// A map entry (key-value pair).  The Map.entrySet method returns
// a collection-view of the map, whose elements are of this class.  The
// only way to obtain a reference to a map entry is from the
// iterator of this collection-view.  These Map.Entry objects are
// valid only for the duration of the iteration; more formally,
// the behavior of a map entry is undefined if the backing map has been
// modified after the entry was returned by the iterator, except through
// the setValue operation on the map entry.
object trait Map.Entry[K, V] {

    @stub
    // Returns a comparator that compares Map.Entry in natural order on key.
    def Comparator[Map.Entry[K, V]]: [K <: Comparable[_ >: K], V] = ???

    @stub
    // Returns a comparator that compares Map.Entry by key using the given
    // Comparator.
    def Comparator[Map.Entry[K, V]]: [K, V] = ???

    @stub
    // Returns a comparator that compares Map.Entry in natural order on value.
    def Comparator[Map.Entry[K, V]]: [K, V <: Comparable[_ >: V]] = ???

    @stub
    // Returns a comparator that compares Map.Entry by value using the given
    // Comparator.
    def Comparator[Map.Entry[K, V]]: [K, V] = ???

    @stub
    // Compares the specified object with this entry for equality.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the key corresponding to this entry.
    def getKey(): K = ???

    @stub
    // Returns the value corresponding to this entry.
    def getValue(): V = ???

    @stub
    // Returns the hash code value for this map entry.
    def hashCode(): Int = ???
}

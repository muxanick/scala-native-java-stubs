package java.util

import java.lang.Object

/** The Dictionary class is the abstract parent of any
 *  class, such as Hashtable, which maps keys to values.
 *  Every key and every value is an object. In any one Dictionary
 *  object, every key is associated with at most one value. Given a
 *  Dictionary and a key, the associated element can be looked up.
 *  Any non-null object can be used as a key and as a value.
 *  
 *  As a rule, the equals method should be used by
 *  implementations of this class to decide if two keys are the same.
 *  
 *  NOTE: This class is obsolete.  New implementations should
 *  implement the Map interface, rather than extending this class.
 */
abstract class Dictionary[K, V] extends Object {

    /** Returns an enumeration of the values in this dictionary. */
    def elements(): Enumeration[V]

    /** Returns the value to which the key is mapped in this dictionary. */
    def get(key: Object): V

    /** Tests if this dictionary maps no keys to value. */
    def isEmpty(): Boolean

    /** Returns an enumeration of the keys in this dictionary. */
    def keys(): Enumeration[K]

    /** Maps the specified key to the specified
     *  value in this dictionary.
     */
    def put(key: K, value: V): V

    /** Removes the key (and its corresponding
     *  value) from this dictionary.
     */
    def remove(key: Object): V
}

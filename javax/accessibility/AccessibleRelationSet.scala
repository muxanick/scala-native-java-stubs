package javax.accessibility

import java.lang.{Object, String}

/** Class AccessibleRelationSet determines a component's relation set.  The
 *  relation set of a component is a set of AccessibleRelation objects that
 *  describe the component's relationships with other components.
 */
class AccessibleRelationSet extends Object {

    /** Creates a new empty relation set. */
    @stub
    def this() = ???

    /** Adds a new relation to the current relation set. */
    @stub
    def add(relation: AccessibleRelation): Boolean = ???

    /** Adds all of the relations to the existing relation set. */
    @stub
    def addAll(relations: Array[AccessibleRelation]): Unit = ???

    /** Removes all the relations from the current relation set. */
    @stub
    def clear(): Unit = ???

    /** Returns whether the relation set contains a relation
     *  that matches the specified key.
     */
    @stub
    def contains(key: String): Boolean = ???

    /** Returns the relation that matches the specified key. */
    @stub
    def get(key: String): AccessibleRelation = ???

    /** Removes a relation from the current relation set. */
    @stub
    def remove(relation: AccessibleRelation): Boolean = ???

    /** Returns the number of relations in the relation set. */
    @stub
    def size(): Int = ???

    /** Returns the current relation set as an array of AccessibleRelation */
    @stub
    def toArray(): Array[AccessibleRelation] = ???
}

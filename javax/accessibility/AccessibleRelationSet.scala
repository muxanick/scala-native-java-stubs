package javax.accessibility

import java.lang.{Object, String}

// Class AccessibleRelationSet determines a component's relation set.  The
// relation set of a component is a set of AccessibleRelation objects that
// describe the component's relationships with other components.
class AccessibleRelationSet extends Object {

    @stub
    // Creates a new empty relation set.
    def this() = ???

    @stub
    // Adds a new relation to the current relation set.
    def add(relation: AccessibleRelation): Boolean = ???

    @stub
    // Adds all of the relations to the existing relation set.
    def addAll(relations: Array[AccessibleRelation]): Unit = ???

    @stub
    // Removes all the relations from the current relation set.
    def clear(): Unit = ???

    @stub
    // Returns whether the relation set contains a relation
    // that matches the specified key.
    def contains(key: String): Boolean = ???

    @stub
    // Returns the relation that matches the specified key.
    def get(key: String): AccessibleRelation = ???

    @stub
    // Removes a relation from the current relation set.
    def remove(relation: AccessibleRelation): Boolean = ???

    @stub
    // Returns the number of relations in the relation set.
    def size(): Int = ???

    @stub
    // Returns the current relation set as an array of AccessibleRelation
    def toArray(): Array[AccessibleRelation] = ???
}

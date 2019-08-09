package javax.accessibility

import java.lang.{Object, String}

// Class AccessibleRelation describes a relation between the
// object that implements the AccessibleRelation and one or more other
// objects.  The actual relations that an object has with other
// objects are defined as an AccessibleRelationSet, which is a composed
// set of AccessibleRelations.
// The toDisplayString method allows you to obtain the localized string
// for a locale independent key from a predefined ResourceBundle for the
// keys defined in this class.
// The constants in this class present a strongly typed enumeration
// of common object roles. If the constants in this class are not sufficient
// to describe the role of an object, a subclass should be generated
// from this class and it should provide constants in a similar manner.
class AccessibleRelation extends AccessibleBundle {

    @stub
    // Create a new AccessibleRelation using the given locale independent key.
    def this(key: String) = ???

    @stub
    // Creates a new AccessibleRelation using the given locale independent key.
    def this(key: String, target: Object) = ???

    @stub
    // Returns the key for this relation
    def getKey(): String = ???

    @stub
    // Returns the target objects for this relation
    def getTarget(): Array[Object] = ???

    @stub
    // Sets the target object for this relation
    def setTarget(target: Object): Unit = ???
}

object AccessibleRelation {
    @stub
    // Indicates that an object is a child node of one
    // or more objects.
    def CHILD_NODE_OF: String = ???

    @stub
    // Indicates the CHILD_NODE_OF relation between two or more objects
    // has changed.
    def CHILD_NODE_OF_PROPERTY: String = ???

    @stub
    // Indicates an object is controlled by one or more target
    // objects.
    def CONTROLLED_BY: String = ???

    @stub
    // Identifies that the target object that is doing the controlling has
    // changed
    def CONTROLLED_BY_PROPERTY: String = ???

    @stub
    // Indicates an object is a controller for one or more target
    // objects.
    def CONTROLLER_FOR: String = ???

    @stub
    // Identifies that the controller for the target object has changed
    def CONTROLLER_FOR_PROPERTY: String = ???

    @stub
    // Indicates that an object is embedded in one or more
    // objects.
    def EMBEDDED_BY: String = ???

    @stub
    // Indicates the EMBEDDED_BY relation between two or more objects
    // has changed.
    def EMBEDDED_BY_PROPERTY: String = ???

    @stub
    // Indicates that an object has one or more objects
    // embedded in it.
    def EMBEDS: String = ???

    @stub
    // Indicates the EMBEDS relation between two or more objects
    // has changed.
    def EMBEDS_PROPERTY: String = ???

    @stub
    // Indicates an object is logically contiguous with a second
    // object where the second object occurs before the object.
    def FLOWS_FROM: String = ???

    @stub
    // Indicates the FLOWS_FROM relation between two objects
    // has changed.
    def FLOWS_FROM_PROPERTY: String = ???

    @stub
    // Indicates an object is logically contiguous with a second
    // object where the second object occurs after the object.
    def FLOWS_TO: String = ???

    @stub
    // Indicates the FLOWS_TO relation between two objects
    // has changed.
    def FLOWS_TO_PROPERTY: String = ???

    @stub
    // Indicates an object is a label for one or more target objects.
    def LABEL_FOR: String = ???

    @stub
    // Identifies that the target group for a label has changed
    def LABEL_FOR_PROPERTY: String = ???

    @stub
    // Indicates an object is labeled by one or more target objects.
    def LABELED_BY: String = ???

    @stub
    // Identifies that the objects that are doing the labeling have changed
    def LABELED_BY_PROPERTY: String = ???

    @stub
    // Indicates an object is a member of a group of one or more
    // target objects.
    def MEMBER_OF: String = ???

    @stub
    // Identifies that group membership has changed.
    def MEMBER_OF_PROPERTY: String = ???

    @stub
    // Indicates that an object is a parent window of one or more
    // objects.
    def PARENT_WINDOW_OF: String = ???

    @stub
    // Indicates the PARENT_WINDOW_OF relation between two or more objects
    // has changed.
    def PARENT_WINDOW_OF_PROPERTY: String = ???

    @stub
    // Indicates that an object is a subwindow of one or more
    // objects.
    def SUBWINDOW_OF: String = ???
}

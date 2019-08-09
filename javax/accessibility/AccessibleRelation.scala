package javax.accessibility

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Class AccessibleRelation describes a relation between the
 *  object that implements the AccessibleRelation and one or more other
 *  objects.  The actual relations that an object has with other
 *  objects are defined as an AccessibleRelationSet, which is a composed
 *  set of AccessibleRelations.
 *  The toDisplayString method allows you to obtain the localized string
 *  for a locale independent key from a predefined ResourceBundle for the
 *  keys defined in this class.
 *  The constants in this class present a strongly typed enumeration
 *  of common object roles. If the constants in this class are not sufficient
 *  to describe the role of an object, a subclass should be generated
 *  from this class and it should provide constants in a similar manner.
 */
class AccessibleRelation extends AccessibleBundle {

    /** Create a new AccessibleRelation using the given locale independent key. */
    @stub
    def this(key: String) = ???

    /** Creates a new AccessibleRelation using the given locale independent key. */
    @stub
    def this(key: String, target: Object) = ???

    /** Creates a new AccessibleRelation using the given locale independent key. */
    @stub
    def this(key: String, target: Array[Object]) = ???

    /** Returns the key for this relation */
    @stub
    def getKey(): String = ???

    /** Returns the target objects for this relation */
    @stub
    def getTarget(): Array[Object] = ???

    /** Sets the target object for this relation */
    @stub
    def setTarget(target: Object): Unit = ???

    /** Sets the target objects for this relation */
    @stub
    def setTarget(target: Array[Object]): Unit = ???
}

object AccessibleRelation {
    /** Indicates that an object is a child node of one
     *  or more objects.
     */
    @stub
    val CHILD_NODE_OF: String = ???

    /** Indicates the CHILD_NODE_OF relation between two or more objects
     *  has changed.
     */
    @stub
    val CHILD_NODE_OF_PROPERTY: String = ???

    /** Indicates an object is controlled by one or more target
     *  objects.
     */
    @stub
    val CONTROLLED_BY: String = ???

    /** Identifies that the target object that is doing the controlling has
     *  changed
     */
    @stub
    val CONTROLLED_BY_PROPERTY: String = ???

    /** Indicates an object is a controller for one or more target
     *  objects.
     */
    @stub
    val CONTROLLER_FOR: String = ???

    /** Identifies that the controller for the target object has changed */
    @stub
    val CONTROLLER_FOR_PROPERTY: String = ???

    /** Indicates that an object is embedded in one or more
     *  objects.
     */
    @stub
    val EMBEDDED_BY: String = ???

    /** Indicates the EMBEDDED_BY relation between two or more objects
     *  has changed.
     */
    @stub
    val EMBEDDED_BY_PROPERTY: String = ???

    /** Indicates that an object has one or more objects
     *  embedded in it.
     */
    @stub
    val EMBEDS: String = ???

    /** Indicates the EMBEDS relation between two or more objects
     *  has changed.
     */
    @stub
    val EMBEDS_PROPERTY: String = ???

    /** Indicates an object is logically contiguous with a second
     *  object where the second object occurs before the object.
     */
    @stub
    val FLOWS_FROM: String = ???

    /** Indicates the FLOWS_FROM relation between two objects
     *  has changed.
     */
    @stub
    val FLOWS_FROM_PROPERTY: String = ???

    /** Indicates an object is logically contiguous with a second
     *  object where the second object occurs after the object.
     */
    @stub
    val FLOWS_TO: String = ???

    /** Indicates the FLOWS_TO relation between two objects
     *  has changed.
     */
    @stub
    val FLOWS_TO_PROPERTY: String = ???

    /** Indicates an object is a label for one or more target objects. */
    @stub
    val LABEL_FOR: String = ???

    /** Identifies that the target group for a label has changed */
    @stub
    val LABEL_FOR_PROPERTY: String = ???

    /** Indicates an object is labeled by one or more target objects. */
    @stub
    val LABELED_BY: String = ???

    /** Identifies that the objects that are doing the labeling have changed */
    @stub
    val LABELED_BY_PROPERTY: String = ???

    /** Indicates an object is a member of a group of one or more
     *  target objects.
     */
    @stub
    val MEMBER_OF: String = ???

    /** Identifies that group membership has changed. */
    @stub
    val MEMBER_OF_PROPERTY: String = ???

    /** Indicates that an object is a parent window of one or more
     *  objects.
     */
    @stub
    val PARENT_WINDOW_OF: String = ???

    /** Indicates the PARENT_WINDOW_OF relation between two or more objects
     *  has changed.
     */
    @stub
    val PARENT_WINDOW_OF_PROPERTY: String = ???

    /** Indicates that an object is a subwindow of one or more
     *  objects.
     */
    @stub
    val SUBWINDOW_OF: String = ???

    /** Indicates the SUBWINDOW_OF relation between two or more objects
     *  has changed.
     */
    @stub
    val SUBWINDOW_OF_PROPERTY: String = ???
}

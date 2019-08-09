package javax.accessibility

import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import java.util.Locale

/** AccessibleContext represents the minimum information all accessible objects
 *  return.  This information includes the accessible name, description, role,
 *  and state of the object, as well as information about its parent and
 *  children.  AccessibleContext also contains methods for
 *  obtaining more specific accessibility information about a component.
 *  If the component supports them, these methods will return an object that
 *  implements one or more of the following interfaces:
 *  
 *  AccessibleAction - the object can perform one or more actions.
 *  This interface provides the standard mechanism for an assistive
 *  technology to determine what those actions are and tell the object
 *  to perform them.  Any object that can be manipulated should
 *  support this interface.
 *  AccessibleComponent - the object has a graphical representation.
 *  This interface provides the standard mechanism for an assistive
 *  technology to determine and set the graphical representation of the
 *  object.  Any object that is rendered on the screen should support
 *  this interface.
 *  AccessibleSelection - the object allows its children to be
 *  selected.  This interface provides the standard mechanism for an
 *  assistive technology to determine the currently selected children of the object
 *  as well as modify its selection set.  Any object that has children
 *  that can be selected should support this interface.
 *  AccessibleText - the object presents editable textual information
 *  on the display.  This interface provides the standard mechanism for
 *  an assistive technology to access that text via its content, attributes,
 *  and spatial location.  Any object that contains editable text should
 *  support this interface.
 *  AccessibleValue - the object supports a numerical value.  This
 *  interface provides the standard mechanism for an assistive technology
 *  to determine and set the current value of the object, as well as obtain its
 *  minimum and maximum values.  Any object that supports a numerical value
 *  should support this interface.
 */
abstract class AccessibleContext extends Object {

    /** A localized String containing the description of the object. */
    protected val accessibleDescription: String

    /** A localized String containing the name of the object. */
    protected val accessibleName: String

    /** Adds a PropertyChangeListener to the listener list. */
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit

    /** Support for reporting bound property changes. */
    def firePropertyChange(propertyName: String, oldValue: Object, newValue: Object): Unit

    /** Gets the AccessibleAction associated with this object that supports
     *  one or more actions.
     */
    def getAccessibleAction(): AccessibleAction

    /** Returns the specified Accessible child of the object. */
    def getAccessibleChild(i: Int): Accessible

    /** Returns the number of accessible children of the object. */
    def getAccessibleChildrenCount(): Int

    /** Gets the AccessibleComponent associated with this object that has a
     *  graphical representation.
     */
    def getAccessibleComponent(): AccessibleComponent

    /** Gets the accessibleDescription property of this object. */
    def getAccessibleDescription(): String

    /** Gets the AccessibleEditableText associated with this object
     *  presenting editable text on the display.
     */
    def getAccessibleEditableText(): AccessibleEditableText

    /** Gets the AccessibleIcons associated with an object that has
     *  one or more associated icons
     */
    def getAccessibleIcon(): Array[AccessibleIcon]

    /** Gets the 0-based index of this object in its accessible parent. */
    def getAccessibleIndexInParent(): Int

    /** Gets the accessibleName property of this object. */
    def getAccessibleName(): String

    /** Gets the Accessible parent of this object. */
    def getAccessibleParent(): Accessible

    /** Gets the AccessibleRelationSet associated with an object */
    def getAccessibleRelationSet(): AccessibleRelationSet

    /** Gets the role of this object. */
    def getAccessibleRole(): AccessibleRole

    /** Gets the AccessibleSelection associated with this object which allows its
     *  Accessible children to be selected.
     */
    def getAccessibleSelection(): AccessibleSelection

    /** Gets the state set of this object. */
    def getAccessibleStateSet(): AccessibleStateSet

    /** Gets the AccessibleTable associated with an object */
    def getAccessibleTable(): AccessibleTable

    /** Gets the AccessibleText associated with this object presenting
     *  text on the display.
     */
    def getAccessibleText(): AccessibleText

    /** Gets the AccessibleValue associated with this object that supports a
     *  Numerical value.
     */
    def getAccessibleValue(): AccessibleValue

    /** Gets the locale of the component. */
    def getLocale(): Locale

    /** Removes a PropertyChangeListener from the listener list. */
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit

    /** Sets the accessible description of this object. */
    def setAccessibleDescription(s: String): Unit

    /** Sets the localized accessible name of this object. */
    def setAccessibleName(s: String): Unit
}

object AccessibleContext {
    /** Constant used to indicate that the supported set of actions
     *  has changed.
     */
    @stub
    val ACCESSIBLE_ACTION_PROPERTY: String = ???

    /** Constant used to determine when the active descendant of a component
     *  has changed.
     */
    @stub
    val ACCESSIBLE_ACTIVE_DESCENDANT_PROPERTY: String = ???

    /** Constant used to determine when the accessibleText caret has changed. */
    @stub
    val ACCESSIBLE_CARET_PROPERTY: String = ???

    /** Constant used to determine when Accessible children are added/removed
     *  from the object.
     */
    @stub
    val ACCESSIBLE_CHILD_PROPERTY: String = ???

    /** PropertyChangeEvent which indicates that a change has occurred
     *  in a component's bounds.
     */
    @stub
    val ACCESSIBLE_COMPONENT_BOUNDS_CHANGED: String = ???

    /** Constant used to determine when the accessibleDescription property has
     *  changed.
     */
    @stub
    val ACCESSIBLE_DESCRIPTION_PROPERTY: String = ???

    /** Constant used to indicate that a hypertext element has received focus. */
    @stub
    val ACCESSIBLE_HYPERTEXT_OFFSET: String = ???

    /** PropertyChangeEvent which indicates that a significant change
     *  has occurred to the children of a component like a tree or text.
     */
    @stub
    val ACCESSIBLE_INVALIDATE_CHILDREN: String = ???

    /** Constant used to determine when the accessibleName property has
     *  changed.
     */
    @stub
    val ACCESSIBLE_NAME_PROPERTY: String = ???

    /** Constant used to determine when the accessibleSelection has changed. */
    @stub
    val ACCESSIBLE_SELECTION_PROPERTY: String = ???

    /** Constant used to determine when the accessibleStateSet property has
     *  changed.
     */
    @stub
    val ACCESSIBLE_STATE_PROPERTY: String = ???

    /** Constant used to indicate that the table caption has changed
     *  The old value in the PropertyChangeEvent will be an Accessible
     *  representing the previous table caption and the new value will
     *  be an Accessible representing the new table caption.
     */
    @stub
    val ACCESSIBLE_TABLE_CAPTION_CHANGED: String = ???

    /** Constant used to indicate that the column description has changed
     *  The old value in the PropertyChangeEvent will be null and the
     *  new value will be an Integer representing the column index.
     */
    @stub
    val ACCESSIBLE_TABLE_COLUMN_DESCRIPTION_CHANGED: String = ???

    /** Constant used to indicate that the column header has changed
     *  The old value in the PropertyChangeEvent will be null and the
     *  new value will be an AccessibleTableModelChange representing
     *  the header change.
     */
    @stub
    val ACCESSIBLE_TABLE_COLUMN_HEADER_CHANGED: String = ???

    /** Constant used to indicate that table data has changed. */
    @stub
    val ACCESSIBLE_TABLE_MODEL_CHANGED: String = ???

    /** Constant used to indicate that the row description has changed
     *  The old value in the PropertyChangeEvent will be null and the
     *  new value will be an Integer representing the row index.
     */
    @stub
    val ACCESSIBLE_TABLE_ROW_DESCRIPTION_CHANGED: String = ???

    /** Constant used to indicate that the row header has changed
     *  The old value in the PropertyChangeEvent will be null and the
     *  new value will be an AccessibleTableModelChange representing
     *  the header change.
     */
    @stub
    val ACCESSIBLE_TABLE_ROW_HEADER_CHANGED: String = ???

    /** Constant used to indicate that the table summary has changed
     *  The old value in the PropertyChangeEvent will be an Accessible
     *  representing the previous table summary and the new value will
     *  be an Accessible representing the new table summary.
     */
    @stub
    val ACCESSIBLE_TABLE_SUMMARY_CHANGED: String = ???

    /** PropertyChangeEvent which indicates that text attributes have changed. */
    @stub
    val ACCESSIBLE_TEXT_ATTRIBUTES_CHANGED: String = ???

    /** PropertyChangeEvent which indicates that text has changed. */
    @stub
    val ACCESSIBLE_TEXT_PROPERTY: String = ???

    /** Constant used to determine when the accessibleValue property has
     *  changed.
     */
    @stub
    val ACCESSIBLE_VALUE_PROPERTY: String = ???

    /** Constant used to determine when the visual appearance of the object
     *  has changed.
     */
    @stub
    val ACCESSIBLE_VISIBLE_DATA_PROPERTY: String = ???
}

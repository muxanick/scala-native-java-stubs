package java.awt

import java.awt.event.FocusListener
import java.io.Serializable
import java.lang.{Object, String}
import java.util.Locale
import javax.accessibility.{Accessible, AccessibleComponent, AccessibleContext, AccessibleRole, AccessibleSelection, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** Inner class of MenuComponent used to provide
 *  default support for accessibility.  This class is not meant
 *  to be used directly by application developers, but is instead
 *  meant only to be subclassed by menu component developers.
 *  
 *  The class used to obtain the accessible role for this object.
 */
protected abstract class MenuComponent_AccessibleAWTMenuComponent extends AccessibleContext with Serializable with AccessibleComponent with AccessibleSelection {

    /** Although the class is abstract, this should be called by
     *  all sub-classes.
     */
    @stub
    protected def AccessibleAWTMenuComponent() = ???

    /** Adds the specified Accessible child of the object
     *  to the object's selection.
     */
    def addAccessibleSelection(i: Int): Unit

    /** Adds the specified focus listener to receive focus events from this
     *  component.
     */
    def addFocusListener(l: FocusListener): Unit

    /** Clears the selection in the object, so that no children in the
     *  object are selected.
     */
    def clearAccessibleSelection(): Unit

    /** Checks whether the specified point is within this object's bounds,
     *  where the point's x and y coordinates are defined to be relative to
     *  the coordinate system of the object.
     */
    def contains(p: Point): Boolean

    /** Returns the Accessible child, if one exists,
     *  contained at the local coordinate Point.
     */
    def getAccessibleAt(p: Point): Accessible

    /** Returns the nth Accessible child of the object. */
    def getAccessibleChild(i: Int): Accessible

    /** Returns the number of accessible children in the object. */
    def getAccessibleChildrenCount(): Int

    /** Gets the AccessibleComponent associated with
     *  this object if one exists.
     */
    def getAccessibleComponent(): AccessibleComponent

    /** Gets the accessible description of this object. */
    def getAccessibleDescription(): String

    /** Gets the index of this object in its accessible parent. */
    def getAccessibleIndexInParent(): Int

    /** Gets the accessible name of this object. */
    def getAccessibleName(): String

    /** Gets the Accessible parent of this object. */
    def getAccessibleParent(): Accessible

    /** Gets the role of this object. */
    def getAccessibleRole(): AccessibleRole

    /** Gets the AccessibleSelection associated with this
     *  object which allows its Accessible children to be selected.
     */
    def getAccessibleSelection(): AccessibleSelection

    /** Returns an Accessible representing the specified
     *  selected child in the object.
     */
    def getAccessibleSelection(i: Int): Accessible

    /** Returns the number of Accessible children currently selected. */
    def getAccessibleSelectionCount(): Int

    /** Gets the state of this object. */
    def getAccessibleStateSet(): AccessibleStateSet

    /** Gets the background color of this object. */
    def getBackground(): Color

    /** Gets the bounds of this object in the form of a
     *  Rectangle object.
     */
    def getBounds(): Rectangle

    /** Gets the Cursor of this object. */
    def getCursor(): Cursor

    /** Gets the Font of this object. */
    def getFont(): Font

    /** Gets the FontMetrics of this object. */
    def getFontMetrics(f: Font): FontMetrics

    /** Gets the foreground color of this object. */
    def getForeground(): Color

    /** Returns the locale of this object. */
    def getLocale(): Locale

    /** Gets the location of the object relative to the parent in the form
     *  of a point specifying the object's top-left corner in the screen's
     *  coordinate space.
     */
    def getLocation(): Point

    /** Returns the location of the object on the screen. */
    def getLocationOnScreen(): Point

    /** Returns the size of this object in the form of a
     *  Dimension object.
     */
    def getSize(): Dimension

    /** Determines if the current child of this object is selected. */
    def isAccessibleChildSelected(i: Int): Boolean

    /** Determines if the object is enabled. */
    def isEnabled(): Boolean

    /** Returns whether this object can accept focus or not. */
    def isFocusTraversable(): Boolean

    /** Determines if the object is showing. */
    def isShowing(): Boolean

    /** Determines if the object is visible. */
    def isVisible(): Boolean

    /** Removes the specified child of the object from the object's
     *  selection.
     */
    def removeAccessibleSelection(i: Int): Unit

    /** Removes the specified focus listener so it no longer receives focus
     *  events from this component.
     */
    def removeFocusListener(l: FocusListener): Unit

    /** Requests focus for this object. */
    def requestFocus(): Unit

    /** Causes every child of the object to be selected
     *  if the object supports multiple selections.
     */
    def selectAllAccessibleSelection(): Unit

    /** Sets the background color of this object. */
    def setBackground(c: Color): Unit

    /** Sets the bounds of this object in the form of a
     *  Rectangle object.
     */
    def setBounds(r: Rectangle): Unit

    /** Sets the Cursor of this object. */
    def setCursor(cursor: Cursor): Unit

    /** Sets the enabled state of the object. */
    def setEnabled(b: Boolean): Unit

    /** Sets the Font of this object. */
    def setFont(f: Font): Unit

    /** Sets the foreground color of this object. */
    def setForeground(c: Color): Unit

    /** Sets the location of the object relative to the parent. */
    def setLocation(p: Point): Unit

    /** Resizes this object. */
    def setSize(d: Dimension): Unit

    /** Sets the visible state of the object. */
    def setVisible(b: Boolean): Unit
}

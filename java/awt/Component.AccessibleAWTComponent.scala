package java.awt

import java.awt.event.{ComponentListener, FocusListener}
import java.beans.PropertyChangeListener
import java.io.Serializable
import java.lang.{Object, String}
import java.util.Locale
import javax.accessibility.{Accessible, AccessibleComponent, AccessibleContext, AccessibleRole, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** Inner class of Component used to provide default support for
 *  accessibility.  This class is not meant to be used directly by
 *  application developers, but is instead meant only to be
 *  subclassed by component developers.
 *  
 *  The class used to obtain the accessible role for this object.
 */
protected abstract class Component_AccessibleAWTComponent extends AccessibleContext with Serializable with AccessibleComponent {

    /** Though the class is abstract, this should be called by
     *  all sub-classes.
     */
    @stub
    protected def AccessibleAWTComponent() = ???

    /** Fire PropertyChange listener, if one is registered,
     *  when shown/hidden..
     */
    protected type AccessibleAWTComponentHandler = Component_AccessibleAWTComponent_AccessibleAWTComponentHandler

    /** Fire PropertyChange listener, if one is registered,
     *  when focus events happen
     */
    protected type AccessibleAWTFocusHandler = Component_AccessibleAWTComponent_AccessibleAWTFocusHandler

    /**  */
    protected val accessibleAWTComponentHandler: ComponentListener

    /**  */
    protected val accessibleAWTFocusHandler: FocusListener

    /** Adds the specified focus listener to receive focus events from this
     *  component.
     */
    def addFocusListener(l: FocusListener): Unit

    /** Adds a PropertyChangeListener to the listener list. */
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit

    /** Checks whether the specified point is within this object's bounds,
     *  where the point's x and y coordinates are defined to be relative to
     *  the coordinate system of the object.
     */
    def contains(p: Point): Boolean

    /** Returns the Accessible child,
     *  if one exists, contained at the local
     *  coordinate Point.
     */
    def getAccessibleAt(p: Point): Accessible

    /** Returns the nth Accessible child of the object. */
    def getAccessibleChild(i: Int): Accessible

    /** Returns the number of accessible children in the object. */
    def getAccessibleChildrenCount(): Int

    /** Gets the AccessibleComponent associated
     *  with this object if one exists.
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

    /** Gets the state of this object. */
    def getAccessibleStateSet(): AccessibleStateSet

    /** Gets the background color of this object. */
    def getBackground(): Color

    /** Gets the bounds of this object in the form of a Rectangle object. */
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

    /** Determines if the object is enabled. */
    def isEnabled(): Boolean

    /** Returns whether this object can accept focus or not. */
    def isFocusTraversable(): Boolean

    /** Determines if the object is showing. */
    def isShowing(): Boolean

    /** Determines if the object is visible. */
    def isVisible(): Boolean

    /** Removes the specified focus listener so it no longer receives focus
     *  events from this component.
     */
    def removeFocusListener(l: FocusListener): Unit

    /** Remove a PropertyChangeListener from the listener list. */
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit

    /** Requests focus for this object. */
    def requestFocus(): Unit

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

    /** Resizes this object so that it has width and height. */
    def setSize(d: Dimension): Unit

    /** Sets the visible state of the object. */
    def setVisible(b: Boolean): Unit
}

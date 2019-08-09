package javax.swing

import java.awt.{Color, Component, Cursor, Dimension, Font, FontMetrics, Point, Rectangle}
import java.awt.event.FocusListener
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import java.util.Locale
import javax.accessibility.{Accessible, AccessibleAction, AccessibleComponent, AccessibleContext, AccessibleRole, AccessibleSelection, AccessibleStateSet, AccessibleText, AccessibleValue}

/** The class provides an implementation of the Java Accessibility
 *  API appropriate to table cells.
 */
protected class JTable.AccessibleJTable.AccessibleJTableCell extends AccessibleContext with Accessible with AccessibleComponent {

    /** Adds the specified focus listener to receive focus events from this
     *  component.
     */
    @stub
    def addFocusListener(l: FocusListener): Unit = ???

    /** Adds a PropertyChangeListener to the listener list. */
    @stub
    def addPropertyChangeListener(l: PropertyChangeListener): Unit = ???

    /** Checks whether the specified point is within this
     *  object's bounds, where the point's x and y coordinates
     *  are defined to be relative to the coordinate system of
     *  the object.
     */
    @stub
    def contains(p: Point): Boolean = ???

    /** Gets the AccessibleAction associated with this
     *  object if one exists.
     */
    @stub
    def getAccessibleAction(): AccessibleAction = ???

    /** Returns the Accessible child, if one exists, contained at the local
     *  coordinate Point.
     */
    @stub
    def getAccessibleAt(p: Point): Accessible = ???

    /** Returns the specified Accessible child of the
     *  object.
     */
    @stub
    def getAccessibleChild(i: Int): Accessible = ???

    /** Returns the number of accessible children in the object. */
    @stub
    def getAccessibleChildrenCount(): Int = ???

    /** Gets the AccessibleComponent associated with
     *  this object if one exists.
     */
    @stub
    def getAccessibleComponent(): AccessibleComponent = ???

    /** Gets the AccessibleContext associated with this
     *  component.
     */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Gets the accessible description of this object. */
    @stub
    def getAccessibleDescription(): String = ???

    /** Gets the index of this object in its accessible parent. */
    @stub
    def getAccessibleIndexInParent(): Int = ???

    /** Gets the accessible name of this object. */
    @stub
    def getAccessibleName(): String = ???

    /** Gets the Accessible parent of this object. */
    @stub
    def getAccessibleParent(): Accessible = ???

    /** Gets the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Gets the AccessibleSelection associated with
     *  this object if one exists.
     */
    @stub
    def getAccessibleSelection(): AccessibleSelection = ???

    /** Gets the state set of this object. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???

    /** Gets the AccessibleText associated with this
     *  object if one exists.
     */
    @stub
    def getAccessibleText(): AccessibleText = ???

    /** Gets the AccessibleValue associated with
     *  this object if one exists.
     */
    @stub
    def getAccessibleValue(): AccessibleValue = ???

    /** Gets the background color of this object. */
    @stub
    def getBackground(): Color = ???

    /** Gets the bounds of this object in the form of a Rectangle object. */
    @stub
    def getBounds(): Rectangle = ???

    /** Gets the AccessibleContext for the table cell renderer. */
    @stub
    protected def getCurrentAccessibleContext(): AccessibleContext = ???

    /** Gets the table cell renderer component. */
    @stub
    protected def getCurrentComponent(): Component = ???

    /** Gets the Cursor of this object. */
    @stub
    def getCursor(): Cursor = ???

    /** Gets the Font of this object. */
    @stub
    def getFont(): Font = ???

    /** Gets the FontMetrics of this object. */
    @stub
    def getFontMetrics(f: Font): FontMetrics = ???

    /** Gets the foreground color of this object. */
    @stub
    def getForeground(): Color = ???

    /** Gets the locale of the component. */
    @stub
    def getLocale(): Locale = ???

    /** Gets the location of the object relative to the parent
     *  in the form of a point specifying the object's
     *  top-left corner in the screen's coordinate space.
     */
    @stub
    def getLocation(): Point = ???

    /** Returns the location of the object on the screen. */
    @stub
    def getLocationOnScreen(): Point = ???

    /** Returns the size of this object in the form of a Dimension object. */
    @stub
    def getSize(): Dimension = ???

    /** Determines if the object is enabled. */
    @stub
    def isEnabled(): Boolean = ???

    /** Returns whether this object can accept focus or not. */
    @stub
    def isFocusTraversable(): Boolean = ???

    /** Determines if the object is showing. */
    @stub
    def isShowing(): Boolean = ???

    /** Determines if this object is visible. */
    @stub
    def isVisible(): Boolean = ???

    /** Removes the specified focus listener so it no longer receives focus
     *  events from this component.
     */
    @stub
    def removeFocusListener(l: FocusListener): Unit = ???

    /** Removes a PropertyChangeListener from the
     *  listener list.
     */
    @stub
    def removePropertyChangeListener(l: PropertyChangeListener): Unit = ???

    /** Requests focus for this object. */
    @stub
    def requestFocus(): Unit = ???

    /** Sets the accessible description of this object. */
    @stub
    def setAccessibleDescription(s: String): Unit = ???

    /** Sets the localized accessible name of this object. */
    @stub
    def setAccessibleName(s: String): Unit = ???

    /** Sets the background color of this object. */
    @stub
    def setBackground(c: Color): Unit = ???

    /** Sets the bounds of this object in the form of a Rectangle object. */
    @stub
    def setBounds(r: Rectangle): Unit = ???

    /** Sets the Cursor of this object. */
    @stub
    def setCursor(c: Cursor): Unit = ???

    /** Sets the enabled state of the object. */
    @stub
    def setEnabled(b: Boolean): Unit = ???

    /** Sets the Font of this object. */
    @stub
    def setFont(f: Font): Unit = ???

    /** Sets the foreground color of this object. */
    @stub
    def setForeground(c: Color): Unit = ???

    /** Sets the location of the object relative to the parent. */
    @stub
    def setLocation(p: Point): Unit = ???

    /** Resizes this object so that it has width and height. */
    @stub
    def setSize(d: Dimension): Unit = ???
}

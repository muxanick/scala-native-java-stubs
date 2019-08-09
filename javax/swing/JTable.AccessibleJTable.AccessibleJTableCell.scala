package javax.swing

import java.awt.{Color, Component, Cursor, Dimension, Font, FontMetrics, Point, Rectangle}
import java.awt.event.FocusListener
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import java.util.Locale
import javax.accessibility.{Accessible, AccessibleAction, AccessibleComponent, AccessibleContext, AccessibleRole, AccessibleSelection, AccessibleStateSet, AccessibleText, AccessibleValue}

// The class provides an implementation of the Java Accessibility
// API appropriate to table cells.
protected class JTable.AccessibleJTable.AccessibleJTableCell extends AccessibleContext with Accessible, with AccessibleComponent {

    @stub
    // Adds the specified focus listener to receive focus events from this
    // component.
    def addFocusListener(l: FocusListener): Unit = ???

    @stub
    // Adds a PropertyChangeListener to the listener list.
    def addPropertyChangeListener(l: PropertyChangeListener): Unit = ???

    @stub
    // Checks whether the specified point is within this
    // object's bounds, where the point's x and y coordinates
    // are defined to be relative to the coordinate system of
    // the object.
    def contains(p: Point): Boolean = ???

    @stub
    // Gets the AccessibleAction associated with this
    // object if one exists.
    def getAccessibleAction(): AccessibleAction = ???

    @stub
    // Returns the Accessible child, if one exists, contained at the local
    // coordinate Point.
    def getAccessibleAt(p: Point): Accessible = ???

    @stub
    // Returns the specified Accessible child of the
    // object.
    def getAccessibleChild(i: Int): Accessible = ???

    @stub
    // Returns the number of accessible children in the object.
    def getAccessibleChildrenCount(): Int = ???

    @stub
    // Gets the AccessibleComponent associated with
    // this object if one exists.
    def getAccessibleComponent(): AccessibleComponent = ???

    @stub
    // Gets the AccessibleContext associated with this
    // component.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Gets the accessible description of this object.
    def getAccessibleDescription(): String = ???

    @stub
    // Gets the index of this object in its accessible parent.
    def getAccessibleIndexInParent(): Int = ???

    @stub
    // Gets the accessible name of this object.
    def getAccessibleName(): String = ???

    @stub
    // Gets the Accessible parent of this object.
    def getAccessibleParent(): Accessible = ???

    @stub
    // Gets the role of this object.
    def getAccessibleRole(): AccessibleRole = ???

    @stub
    // Gets the AccessibleSelection associated with
    // this object if one exists.
    def getAccessibleSelection(): AccessibleSelection = ???

    @stub
    // Gets the state set of this object.
    def getAccessibleStateSet(): AccessibleStateSet = ???

    @stub
    // Gets the AccessibleText associated with this
    // object if one exists.
    def getAccessibleText(): AccessibleText = ???

    @stub
    // Gets the AccessibleValue associated with
    // this object if one exists.
    def getAccessibleValue(): AccessibleValue = ???

    @stub
    // Gets the background color of this object.
    def getBackground(): Color = ???

    @stub
    // Gets the bounds of this object in the form of a Rectangle object.
    def getBounds(): Rectangle = ???

    @stub
    // Gets the AccessibleContext for the table cell renderer.
    protected def getCurrentAccessibleContext(): AccessibleContext = ???

    @stub
    // Gets the table cell renderer component.
    protected def getCurrentComponent(): Component = ???

    @stub
    // Gets the Cursor of this object.
    def getCursor(): Cursor = ???

    @stub
    // Gets the Font of this object.
    def getFont(): Font = ???

    @stub
    // Gets the FontMetrics of this object.
    def getFontMetrics(f: Font): FontMetrics = ???

    @stub
    // Gets the foreground color of this object.
    def getForeground(): Color = ???

    @stub
    // Gets the locale of the component.
    def getLocale(): Locale = ???

    @stub
    // Gets the location of the object relative to the parent
    // in the form of a point specifying the object's
    // top-left corner in the screen's coordinate space.
    def getLocation(): Point = ???

    @stub
    // Returns the location of the object on the screen.
    def getLocationOnScreen(): Point = ???

    @stub
    // Returns the size of this object in the form of a Dimension object.
    def getSize(): Dimension = ???

    @stub
    // Determines if the object is enabled.
    def isEnabled(): Boolean = ???

    @stub
    // Returns whether this object can accept focus or not.
    def isFocusTraversable(): Boolean = ???

    @stub
    // Determines if the object is showing.
    def isShowing(): Boolean = ???

    @stub
    // Determines if this object is visible.
    def isVisible(): Boolean = ???

    @stub
    // Removes the specified focus listener so it no longer receives focus
    // events from this component.
    def removeFocusListener(l: FocusListener): Unit = ???

    @stub
    // Removes a PropertyChangeListener from the
    // listener list.
    def removePropertyChangeListener(l: PropertyChangeListener): Unit = ???

    @stub
    // Requests focus for this object.
    def requestFocus(): Unit = ???

    @stub
    // Sets the accessible description of this object.
    def setAccessibleDescription(s: String): Unit = ???

    @stub
    // Sets the localized accessible name of this object.
    def setAccessibleName(s: String): Unit = ???

    @stub
    // Sets the background color of this object.
    def setBackground(c: Color): Unit = ???

    @stub
    // Sets the bounds of this object in the form of a Rectangle object.
    def setBounds(r: Rectangle): Unit = ???

    @stub
    // Sets the Cursor of this object.
    def setCursor(c: Cursor): Unit = ???

    @stub
    // Sets the enabled state of the object.
    def setEnabled(b: Boolean): Unit = ???

    @stub
    // Sets the Font of this object.
    def setFont(f: Font): Unit = ???

    @stub
    // Sets the foreground color of this object.
    def setForeground(c: Color): Unit = ???

    @stub
    // Sets the location of the object relative to the parent.
    def setLocation(p: Point): Unit = ???

    @stub
    // Resizes this object so that it has width and height.
    def setSize(d: Dimension): Unit = ???
}

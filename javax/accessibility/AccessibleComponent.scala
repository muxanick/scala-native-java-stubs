package javax.accessibility

import java.awt.{Color, Cursor, Dimension, Font, FontMetrics, Point, Rectangle}
import java.awt.event.FocusListener

// The AccessibleComponent interface should be supported by any object
// that is rendered on the screen.  This interface provides the standard
// mechanism for an assistive technology to determine and set the
// graphical representation of an object.  Applications can determine
// if an object supports the AccessibleComponent interface by first
// obtaining its AccessibleContext
// and then calling the
// AccessibleContext.getAccessibleComponent() method.
// If the return value is not null, the object supports this interface.
trait AccessibleComponent {

    @stub
    // Adds the specified focus listener to receive focus events from this
    // component.
    def addFocusListener(l: FocusListener): Unit = ???

    @stub
    // Checks whether the specified point is within this object's bounds,
    // where the point's x and y coordinates are defined to be relative to the
    // coordinate system of the object.
    def contains(p: Point): Boolean = ???

    @stub
    // Returns the Accessible child, if one exists, contained at the local
    // coordinate Point.
    def getAccessibleAt(p: Point): Accessible = ???

    @stub
    // Gets the background color of this object.
    def getBackground(): Color = ???

    @stub
    // Gets the bounds of this object in the form of a Rectangle object.
    def getBounds(): Rectangle = ???

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
    // Gets the location of the object relative to the parent in the form
    // of a point specifying the object's top-left corner in the screen's
    // coordinate space.
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
    // Determines if the object is visible.
    def isVisible(): Boolean = ???

    @stub
    // Removes the specified focus listener so it no longer receives focus
    // events from this component.
    def removeFocusListener(l: FocusListener): Unit = ???

    @stub
    // Requests focus for this object.
    def requestFocus(): Unit = ???

    @stub
    // Sets the background color of this object.
    def setBackground(c: Color): Unit = ???

    @stub
    // Sets the bounds of this object in the form of a Rectangle object.
    def setBounds(r: Rectangle): Unit = ???

    @stub
    // Sets the Cursor of this object.
    def setCursor(cursor: Cursor): Unit = ???

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

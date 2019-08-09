package javax.accessibility

import java.awt.{Color, Cursor, Dimension, Font, FontMetrics, Point, Rectangle}
import java.awt.event.FocusListener

/** The AccessibleComponent interface should be supported by any object
 *  that is rendered on the screen.  This interface provides the standard
 *  mechanism for an assistive technology to determine and set the
 *  graphical representation of an object.  Applications can determine
 *  if an object supports the AccessibleComponent interface by first
 *  obtaining its AccessibleContext
 *  and then calling the
 *  AccessibleContext.getAccessibleComponent() method.
 *  If the return value is not null, the object supports this interface.
 */
trait AccessibleComponent {

    /** Adds the specified focus listener to receive focus events from this
     *  component.
     */
    @stub
    def addFocusListener(l: FocusListener): Unit = ???

    /** Checks whether the specified point is within this object's bounds,
     *  where the point's x and y coordinates are defined to be relative to the
     *  coordinate system of the object.
     */
    @stub
    def contains(p: Point): Boolean = ???

    /** Returns the Accessible child, if one exists, contained at the local
     *  coordinate Point.
     */
    @stub
    def getAccessibleAt(p: Point): Accessible = ???

    /** Gets the background color of this object. */
    @stub
    def getBackground(): Color = ???

    /** Gets the bounds of this object in the form of a Rectangle object. */
    @stub
    def getBounds(): Rectangle = ???

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

    /** Gets the location of the object relative to the parent in the form
     *  of a point specifying the object's top-left corner in the screen's
     *  coordinate space.
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

    /** Determines if the object is visible. */
    @stub
    def isVisible(): Boolean = ???

    /** Removes the specified focus listener so it no longer receives focus
     *  events from this component.
     */
    @stub
    def removeFocusListener(l: FocusListener): Unit = ???

    /** Requests focus for this object. */
    @stub
    def requestFocus(): Unit = ???

    /** Sets the background color of this object. */
    @stub
    def setBackground(c: Color): Unit = ???

    /** Sets the bounds of this object in the form of a Rectangle object. */
    @stub
    def setBounds(r: Rectangle): Unit = ???

    /** Sets the Cursor of this object. */
    @stub
    def setCursor(cursor: Cursor): Unit = ???

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

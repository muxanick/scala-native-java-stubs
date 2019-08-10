package java.awt

import java.awt.event.FocusListener
import java.lang.Object
import java.util.Locale
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for
 *  List children.  It provides an implementation of the
 *  Java Accessibility API appropriate to list children
 *  user-interface elements.
 */
protected class List_AccessibleAWTList_AccessibleAWTListChild extends Component.AccessibleAWTComponent with Accessible {

    /**  */
    @stub
    def AccessibleAWTListChild(parent: List, indexInParent: Int) = ???

    /** Adds the specified focus listener to receive focus events from
     *  this component.
     */
    @stub
    def addFocusListener(l: FocusListener): Unit = ???

    /** Checks whether the specified point is within this object's
     *  bounds, where the point's x and y coordinates are defined to
     *  be relative to the coordinate system of the object.
     */
    @stub
    def contains(p: Point): Boolean = ???

    /** Returns the Accessible child, if one exists,
     *  contained at the local coordinate Point.
     */
    @stub
    def getAccessibleAt(p: Point): Accessible = ???

    /** Return the specified Accessible child of the object. */
    @stub
    def getAccessibleChild(i: Int): Accessible = ???

    /** Returns the number of accessible children of the object. */
    @stub
    def getAccessibleChildrenCount(): Int = ???

    /** Gets the AccessibleContext for this object. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Get the 0-based index of this object in its accessible parent. */
    @stub
    def getAccessibleIndexInParent(): Int = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Get the state set of this object. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???

    /** Get the background color of this object. */
    @stub
    def getBackground(): Color = ???

    /** Gets the bounds of this object in the form of a Rectangle object. */
    @stub
    def getBounds(): Rectangle = ???

    /** Get the Cursor of this object. */
    @stub
    def getCursor(): Cursor = ???

    /** Get the Font of this object. */
    @stub
    def getFont(): Font = ???

    /** Get the FontMetrics of this object. */
    @stub
    def getFontMetrics(f: Font): FontMetrics = ???

    /** Get the foreground color of this object. */
    @stub
    def getForeground(): Color = ???

    /** Gets the locale of the component. */
    @stub
    def getLocale(): Locale = ???

    /** Gets the location of the object relative to the parent in the
     *  form of a point specifying the object's top-left corner in the
     *  screen's coordinate space.
     */
    @stub
    def getLocation(): Point = ???

    /** Returns the location of the object on the screen. */
    @stub
    def getLocationOnScreen(): Point = ???

    /** Returns the size of this object in the form of a Dimension
     *  object.
     */
    @stub
    def getSize(): Dimension = ???

    /** Determine if the object is enabled. */
    @stub
    def isEnabled(): Boolean = ???

    /** Returns whether this object can accept focus or not. */
    @stub
    def isFocusTraversable(): Boolean = ???

    /** Determine if the object is showing. */
    @stub
    def isShowing(): Boolean = ???

    /** Determine if the object is visible. */
    @stub
    def isVisible(): Boolean = ???

    /** Removes the specified focus listener so it no longer receives
     *  focus events from this component.
     */
    @stub
    def removeFocusListener(l: FocusListener): Unit = ???

    /** Requests focus for this object. */
    @stub
    def requestFocus(): Unit = ???

    /** Set the background color of this object. */
    @stub
    def setBackground(c: Color): Unit = ???

    /** Sets the bounds of this object in the form of a Rectangle
     *  object.
     */
    @stub
    def setBounds(r: Rectangle): Unit = ???

    /** Set the Cursor of this object. */
    @stub
    def setCursor(cursor: Cursor): Unit = ???

    /** Set the enabled state of the object. */
    @stub
    def setEnabled(b: Boolean): Unit = ???

    /** Set the Font of this object. */
    @stub
    def setFont(f: Font): Unit = ???

    /** Set the foreground color of this object. */
    @stub
    def setForeground(c: Color): Unit = ???

    /** Sets the location of the object relative to the parent. */
    @stub
    def setLocation(p: Point): Unit = ???

    /** Resizes this object so that it has width and height. */
    @stub
    def setSize(d: Dimension): Unit = ???

    /** Set the visible state of the object. */
    @stub
    def setVisible(b: Boolean): Unit = ???
}

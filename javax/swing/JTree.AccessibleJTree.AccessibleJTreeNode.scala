package javax.swing

import java.awt.{Color, Cursor, Dimension, Font, FontMetrics, Point, Rectangle}
import java.awt.event.FocusListener
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import java.util.Locale
import javax.accessibility.{Accessible, AccessibleAction, AccessibleComponent, AccessibleContext, AccessibleRole, AccessibleSelection, AccessibleStateSet, AccessibleText, AccessibleValue}
import javax.swing.tree.TreePath
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  JTree child.  It provides an implementation of the
 *  Java Accessibility API appropriate to tree nodes.
 */
protected class JTree_AccessibleJTree_AccessibleJTreeNode extends AccessibleContext with Accessible with AccessibleComponent with AccessibleSelection with AccessibleAction {

    /** Constructs an AccessibleJTreeNode */
    @stub
    def AccessibleJTreeNode(t: JTree, p: TreePath, ap: Accessible) = ???

    /** Adds the specified selected item in the object to the object's
     *  selection.
     */
    @stub
    def addAccessibleSelection(i: Int): Unit = ???

    /** Adds the specified focus listener to receive focus events from this
     *  component.
     */
    @stub
    def addFocusListener(l: FocusListener): Unit = ???

    /** Add a PropertyChangeListener to the listener list. */
    @stub
    def addPropertyChangeListener(l: PropertyChangeListener): Unit = ???

    /** Clears the selection in the object, so that nothing in the
     *  object is selected.
     */
    @stub
    def clearAccessibleSelection(): Unit = ???

    /** Checks whether the specified point is within this object's bounds,
     *  where the point's x and y coordinates are defined to be relative to the
     *  coordinate system of the object.
     */
    @stub
    def contains(p: Point): Boolean = ???

    /** Perform the specified Action on the tree node. */
    @stub
    def doAccessibleAction(i: Int): Boolean = ???

    /** Get the AccessibleAction associated with this object. */
    @stub
    def getAccessibleAction(): AccessibleAction = ???

    /** Returns the number of accessible actions available in this
     *  tree node.
     */
    @stub
    def getAccessibleActionCount(): Int = ???

    /** Return a description of the specified action of the tree node. */
    @stub
    def getAccessibleActionDescription(i: Int): String = ???

    /** Returns the Accessible child, if one exists,
     *  contained at the local coordinate Point.
     */
    @stub
    def getAccessibleAt(p: Point): Accessible = ???

    /** Return the specified Accessible child of the object. */
    @stub
    def getAccessibleChild(i: Int): Accessible = ???

    /** Returns the number of accessible children in the object. */
    @stub
    def getAccessibleChildrenCount(): Int = ???

    /** Get the AccessibleComponent associated with this object. */
    @stub
    def getAccessibleComponent(): AccessibleComponent = ???

    /** Get the AccessibleContext associated with this tree node. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Get the accessible description of this object. */
    @stub
    def getAccessibleDescription(): String = ???

    /** Get the index of this object in its accessible parent. */
    @stub
    def getAccessibleIndexInParent(): Int = ???

    /** Get the accessible name of this object. */
    @stub
    def getAccessibleName(): String = ???

    /** Get the Accessible parent of this object. */
    @stub
    def getAccessibleParent(): Accessible = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Get the AccessibleSelection associated with this object if one
     *  exists.
     */
    @stub
    def getAccessibleSelection(): AccessibleSelection = ???

    /** Returns an Accessible representing the specified selected item
     *  in the object.
     */
    @stub
    def getAccessibleSelection(i: Int): Accessible = ???

    /** Returns the number of items currently selected. */
    @stub
    def getAccessibleSelectionCount(): Int = ???

    /** Get the state set of this object. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???

    /** Get the AccessibleText associated with this object if one
     *  exists.
     */
    @stub
    def getAccessibleText(): AccessibleText = ???

    /** Get the AccessibleValue associated with this object if one
     *  exists.
     */
    @stub
    def getAccessibleValue(): AccessibleValue = ???

    /** Get the background color of this object. */
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

    /** Get the foreground color of this object. */
    @stub
    def getForeground(): Color = ???

    /** Gets the locale of the component. */
    @stub
    def getLocale(): Locale = ???

    /** Gets the location of the object relative to the parent in the form
     *  of a point specifying the object's top-left corner in the screen's
     *  coordinate space.
     */
    @stub
    def getLocation(): Point = ???

    /**  */
    @stub
    protected def getLocationInJTree(): Point = ???

    /** Returns the location of the object on the screen. */
    @stub
    def getLocationOnScreen(): Point = ???

    /** Returns the size of this object in the form of a Dimension object. */
    @stub
    def getSize(): Dimension = ???

    /** Returns true if the current child of this object is selected. */
    @stub
    def isAccessibleChildSelected(i: Int): Boolean = ???

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

    /** Removes the specified selected item in the object from the
     *  object's
     *  selection.
     */
    @stub
    def removeAccessibleSelection(i: Int): Unit = ???

    /** Removes the specified focus listener so it no longer receives focus
     *  events from this component.
     */
    @stub
    def removeFocusListener(l: FocusListener): Unit = ???

    /** Remove a PropertyChangeListener from the listener list. */
    @stub
    def removePropertyChangeListener(l: PropertyChangeListener): Unit = ???

    /** Requests focus for this object. */
    @stub
    def requestFocus(): Unit = ???

    /** Causes every selected item in the object to be selected
     *  if the object supports multiple selections.
     */
    @stub
    def selectAllAccessibleSelection(): Unit = ???

    /** Set the accessible description of this object. */
    @stub
    def setAccessibleDescription(s: String): Unit = ???

    /** Set the localized accessible name of this object. */
    @stub
    def setAccessibleName(s: String): Unit = ???

    /** Set the background color of this object. */
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

    /** Sets the visible state of the object. */
    @stub
    def setVisible(b: Boolean): Unit = ???
}

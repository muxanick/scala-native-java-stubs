package javax.swing

import java.awt.{Component, Container, FontMetrics, Graphics, Point, Rectangle, Window}
import java.awt.event.{KeyEvent, MouseEvent}
import java.lang.{Class, Object, Runnable, String}
import javax.accessibility.{Accessible, AccessibleStateSet}

/** A collection of utility methods for Swing. */
class SwingUtilities extends Object with SwingConstants {
}

object SwingUtilities {
    /** Stores the position and size of
     *  the inner painting area of the specified component
     *  in r and returns r.
     */
    @stub
    def calculateInnerArea(c: JComponent, r: Rectangle): Rectangle = ???

    /** Convenience returning an array of rect representing the regions within
     *  rectA that do not overlap with rectB.
     */
    @stub
    def computeDifference(rectA: Rectangle, rectB: Rectangle): Array[Rectangle] = ???

    /** Convenience to calculate the intersection of two rectangles
     *  without allocating a new rectangle.
     */
    @stub
    def computeIntersection(x: Int, y: Int, width: Int, height: Int, dest: Rectangle): Rectangle = ???

    /** Compute the width of the string using a font with the specified
     *  "metrics" (sizes).
     */
    @stub
    def computeStringWidth(fm: FontMetrics, str: String): Int = ???

    /** Convenience method that calculates the union of two rectangles
     *  without allocating a new rectangle.
     */
    @stub
    def computeUnion(x: Int, y: Int, width: Int, height: Int, dest: Rectangle): Rectangle = ???

    /** Returns a MouseEvent similar to sourceEvent except that its x
     *  and y members have been converted to destination's coordinate
     *  system.
     */
    @stub
    def convertMouseEvent(source: Component, sourceEvent: MouseEvent, destination: Component): MouseEvent = ???

    /** Convert the point (x,y) in source coordinate system to
     *  destination coordinate system.
     */
    @stub
    def convertPoint(source: Component, x: Int, y: Int, destination: Component): Point = ???

    /** Convert a aPoint in source coordinate system to
     *  destination coordinate system.
     */
    @stub
    def convertPoint(source: Component, aPoint: Point, destination: Component): Point = ???

    /** Convert a point from a screen coordinates to a component's
     *  coordinate system
     */
    @stub
    def convertPointFromScreen(p: Point, c: Component): Unit = ???

    /** Convert a point from a component's coordinate system to
     *  screen coordinates.
     */
    @stub
    def convertPointToScreen(p: Point, c: Component): Unit = ???

    /** Convert the rectangle aRectangle in source coordinate system to
     *  destination coordinate system.
     */
    @stub
    def convertRectangle(source: Component, aRectangle: Rectangle, destination: Component): Rectangle = ???

    /** Deprecated. 
     * As of 1.4, replaced by
     *    KeyboardFocusManager.getFocusOwner().
     * 
     */
    @stub
    def findFocusOwner(c: Component): Component = ???

    /** Returns the Accessible child contained at the
     *  local coordinate Point, if one exists.
     */
    @stub
    def getAccessibleAt(c: Component, p: Point): Accessible = ???

    /** Return the nth Accessible child of the object. */
    @stub
    def getAccessibleChild(c: Component, i: Int): Accessible = ???

    /** Returns the number of accessible children in the object. */
    @stub
    def getAccessibleChildrenCount(c: Component): Int = ???

    /** Get the index of this object in its accessible parent. */
    @stub
    def getAccessibleIndexInParent(c: Component): Int = ???

    /** Get the state of this object. */
    @stub
    def getAccessibleStateSet(c: Component): AccessibleStateSet = ???

    /** Convenience method for searching above comp in the
     *  component hierarchy and returns the first object of name it
     *  finds.
     */
    @stub
    def getAncestorNamed(name: String, comp: Component): Container = ???

    /** Convenience method for searching above comp in the
     *  component hierarchy and returns the first object of class c it
     *  finds.
     */
    @stub
    def getAncestorOfClass(c: Class[_], comp: Component): Container = ???

    /** Returns the deepest visible descendent Component of parent
     *  that contains the location x, y.
     */
    @stub
    def getDeepestComponentAt(parent: Component, x: Int, y: Int): Component = ???

    /** Return the rectangle (0,0,bounds.width,bounds.height) for the component aComponent */
    @stub
    def getLocalBounds(aComponent: Component): Rectangle = ???

    /** Returns the root component for the current component tree. */
    @stub
    def getRoot(c: Component): Component = ???

    /** If c is a JRootPane descendant return its JRootPane ancestor. */
    @stub
    def getRootPane(c: Component): JRootPane = ???

    /** Returns the ActionMap provided by the UI
     *  in component component.
     */
    @stub
    def getUIActionMap(component: JComponent): ActionMap = ???

    /** Returns the InputMap provided by the UI for condition
     *  condition in component component.
     */
    @stub
    def getUIInputMap(component: JComponent, condition: Int): InputMap = ???

    /** Returns the first ancestor of the component
     *  which is not an instance of JLayer.
     */
    @stub
    def getUnwrappedParent(component: Component): Container = ???

    /** Returns the first JViewport's descendant
     *  which is not an instance of JLayer.
     */
    @stub
    def getUnwrappedView(viewport: JViewport): Component = ???

    /** Returns the first Window  ancestor of c, or
     *  null if c is not contained inside a Window.
     */
    @stub
    def getWindowAncestor(c: Component): Window = ???

    /** Causes doRun.run() to be executed synchronously on the
     *  AWT event dispatching thread.
     */
    @stub
    def invokeAndWait(doRun: Runnable): Unit = ???

    /** Causes doRun.run() to be executed asynchronously on the
     *  AWT event dispatching thread.
     */
    @stub
    def invokeLater(doRun: Runnable): Unit = ???

    /** Return true if a component a descends from a component b */
    @stub
    def isDescendingFrom(a: Component, b: Component): Boolean = ???

    /** Returns true if the current thread is an AWT event dispatching thread. */
    @stub
    def isEventDispatchThread(): Boolean = ???

    /** Returns true if the mouse event specifies the left mouse button. */
    @stub
    def isLeftMouseButton(anEvent: MouseEvent): Boolean = ???

    /** Returns true if the mouse event specifies the middle mouse button. */
    @stub
    def isMiddleMouseButton(anEvent: MouseEvent): Boolean = ???

    /** Return true if a contains b */
    @stub
    def isRectangleContainingRectangle(a: Rectangle, b: Rectangle): Boolean = ???

    /** Returns true if the mouse event specifies the right mouse button. */
    @stub
    def isRightMouseButton(anEvent: MouseEvent): Boolean = ???

    /** Compute and return the location of the icons origin, the
     *  location of origin of the text baseline, and a possibly clipped
     *  version of the compound labels string.
     */
    @stub
    def layoutCompoundLabel(fm: FontMetrics, text: String, icon: Icon, verticalAlignment: Int, horizontalAlignment: Int, verticalTextPosition: Int, horizontalTextPosition: Int, viewR: Rectangle, iconR: Rectangle, textR: Rectangle, textIconGap: Int): String = ???

    /** Compute and return the location of the icons origin, the
     *  location of origin of the text baseline, and a possibly clipped
     *  version of the compound labels string.
     */
    @stub
    def layoutCompoundLabel(c: JComponent, fm: FontMetrics, text: String, icon: Icon, verticalAlignment: Int, horizontalAlignment: Int, verticalTextPosition: Int, horizontalTextPosition: Int, viewR: Rectangle, iconR: Rectangle, textR: Rectangle, textIconGap: Int): String = ???

    /** Invokes actionPerformed on action if
     *  action is enabled (and non-null).
     */
    @stub
    def notifyAction(action: Action, ks: KeyStroke, event: KeyEvent, sender: Object, modifiers: Int): Boolean = ???

    /** Paints a component to the specified Graphics. */
    @stub
    def paintComponent(g: Graphics, c: Component, p: Container, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** Paints a component to the specified Graphics. */
    @stub
    def paintComponent(g: Graphics, c: Component, p: Container, r: Rectangle): Unit = ???

    /** Process the key bindings for the Component associated with
     *  event.
     */
    @stub
    def processKeyBindings(event: KeyEvent): Boolean = ???

    /** Convenience method to change the UI ActionMap for component
     *  to uiActionMap.
     */
    @stub
    def replaceUIActionMap(component: JComponent, uiActionMap: ActionMap): Unit = ???

    /** Convenience method to change the UI InputMap for component
     *  to uiInputMap.
     */
    @stub
    def replaceUIInputMap(component: JComponent, type: Int, uiInputMap: InputMap): Unit = ???

    /** A simple minded look and feel change: ask each node in the tree
     *  to updateUI() -- that is, to initialize its UI property
     *  with the current look and feel.
     */
    @stub
    def updateComponentTreeUI(c: Component): Unit = ???
}

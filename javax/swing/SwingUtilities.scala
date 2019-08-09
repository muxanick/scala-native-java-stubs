package javax.swing

import java.awt.{Component, Container, FontMetrics, Graphics, Point, Rectangle, Window}
import java.awt.event.{KeyEvent, MouseEvent}
import java.lang.{Class, Object, Runnable, String}
import javax.accessibility.{Accessible, AccessibleStateSet}

// A collection of utility methods for Swing.
class SwingUtilities extends Object with SwingConstants {
}

object SwingUtilities {
    @stub
    // Stores the position and size of
    // the inner painting area of the specified component
    // in r and returns r.
    def calculateInnerArea(c: JComponent, r: Rectangle): Rectangle = ???

    @stub
    // Convenience returning an array of rect representing the regions within
    // rectA that do not overlap with rectB.
    def computeDifference(rectA: Rectangle, rectB: Rectangle): Array[Rectangle] = ???

    @stub
    // Convenience to calculate the intersection of two rectangles
    // without allocating a new rectangle.
    def computeIntersection(x: Int, y: Int, width: Int, height: Int, dest: Rectangle): Rectangle = ???

    @stub
    // Compute the width of the string using a font with the specified
    // "metrics" (sizes).
    def computeStringWidth(fm: FontMetrics, str: String): Int = ???

    @stub
    // Convenience method that calculates the union of two rectangles
    // without allocating a new rectangle.
    def computeUnion(x: Int, y: Int, width: Int, height: Int, dest: Rectangle): Rectangle = ???

    @stub
    // Returns a MouseEvent similar to sourceEvent except that its x
    // and y members have been converted to destination's coordinate
    // system.
    def convertMouseEvent(source: Component, sourceEvent: MouseEvent, destination: Component): MouseEvent = ???

    @stub
    // Convert the point (x,y) in source coordinate system to
    // destination coordinate system.
    def convertPoint(source: Component, x: Int, y: Int, destination: Component): Point = ???

    @stub
    // Convert a aPoint in source coordinate system to
    // destination coordinate system.
    def convertPoint(source: Component, aPoint: Point, destination: Component): Point = ???

    @stub
    // Convert a point from a screen coordinates to a component's
    // coordinate system
    def convertPointFromScreen(p: Point, c: Component): Unit = ???

    @stub
    // Convert a point from a component's coordinate system to
    // screen coordinates.
    def convertPointToScreen(p: Point, c: Component): Unit = ???

    @stub
    // Convert the rectangle aRectangle in source coordinate system to
    // destination coordinate system.
    def convertRectangle(source: Component, aRectangle: Rectangle, destination: Component): Rectangle = ???

    @stub
    // Deprecated. 
    //As of 1.4, replaced by
    //   KeyboardFocusManager.getFocusOwner().
    //
    def findFocusOwner(c: Component): Component = ???

    @stub
    // Returns the Accessible child contained at the
    // local coordinate Point, if one exists.
    def getAccessibleAt(c: Component, p: Point): Accessible = ???

    @stub
    // Return the nth Accessible child of the object.
    def getAccessibleChild(c: Component, i: Int): Accessible = ???

    @stub
    // Returns the number of accessible children in the object.
    def getAccessibleChildrenCount(c: Component): Int = ???

    @stub
    // Get the index of this object in its accessible parent.
    def getAccessibleIndexInParent(c: Component): Int = ???

    @stub
    // Get the state of this object.
    def getAccessibleStateSet(c: Component): AccessibleStateSet = ???

    @stub
    // Convenience method for searching above comp in the
    // component hierarchy and returns the first object of name it
    // finds.
    def getAncestorNamed(name: String, comp: Component): Container = ???

    @stub
    // Convenience method for searching above comp in the
    // component hierarchy and returns the first object of class c it
    // finds.
    def getAncestorOfClass(c: Class[_], comp: Component): Container = ???

    @stub
    // Returns the deepest visible descendent Component of parent
    // that contains the location x, y.
    def getDeepestComponentAt(parent: Component, x: Int, y: Int): Component = ???

    @stub
    // Return the rectangle (0,0,bounds.width,bounds.height) for the component aComponent
    def getLocalBounds(aComponent: Component): Rectangle = ???

    @stub
    // Returns the root component for the current component tree.
    def getRoot(c: Component): Component = ???

    @stub
    // If c is a JRootPane descendant return its JRootPane ancestor.
    def getRootPane(c: Component): JRootPane = ???

    @stub
    // Returns the ActionMap provided by the UI
    // in component component.
    def getUIActionMap(component: JComponent): ActionMap = ???

    @stub
    // Returns the InputMap provided by the UI for condition
    // condition in component component.
    def getUIInputMap(component: JComponent, condition: Int): InputMap = ???

    @stub
    // Returns the first ancestor of the component
    // which is not an instance of JLayer.
    def getUnwrappedParent(component: Component): Container = ???

    @stub
    // Returns the first JViewport's descendant
    // which is not an instance of JLayer.
    def getUnwrappedView(viewport: JViewport): Component = ???

    @stub
    // Returns the first Window  ancestor of c, or
    // null if c is not contained inside a Window.
    def getWindowAncestor(c: Component): Window = ???

    @stub
    // Causes doRun.run() to be executed synchronously on the
    // AWT event dispatching thread.
    def invokeAndWait(doRun: Runnable): Unit = ???

    @stub
    // Causes doRun.run() to be executed asynchronously on the
    // AWT event dispatching thread.
    def invokeLater(doRun: Runnable): Unit = ???

    @stub
    // Return true if a component a descends from a component b
    def isDescendingFrom(a: Component, b: Component): Boolean = ???

    @stub
    // Returns true if the current thread is an AWT event dispatching thread.
    def isEventDispatchThread(): Boolean = ???

    @stub
    // Returns true if the mouse event specifies the left mouse button.
    def isLeftMouseButton(anEvent: MouseEvent): Boolean = ???

    @stub
    // Returns true if the mouse event specifies the middle mouse button.
    def isMiddleMouseButton(anEvent: MouseEvent): Boolean = ???

    @stub
    // Return true if a contains b
    def isRectangleContainingRectangle(a: Rectangle, b: Rectangle): Boolean = ???

    @stub
    // Returns true if the mouse event specifies the right mouse button.
    def isRightMouseButton(anEvent: MouseEvent): Boolean = ???

    @stub
    // Compute and return the location of the icons origin, the
    // location of origin of the text baseline, and a possibly clipped
    // version of the compound labels string.
    def layoutCompoundLabel(fm: FontMetrics, text: String, icon: Icon, verticalAlignment: Int, horizontalAlignment: Int, verticalTextPosition: Int, horizontalTextPosition: Int, viewR: Rectangle, iconR: Rectangle, textR: Rectangle, textIconGap: Int): String = ???

    @stub
    // Compute and return the location of the icons origin, the
    // location of origin of the text baseline, and a possibly clipped
    // version of the compound labels string.
    def layoutCompoundLabel(c: JComponent, fm: FontMetrics, text: String, icon: Icon, verticalAlignment: Int, horizontalAlignment: Int, verticalTextPosition: Int, horizontalTextPosition: Int, viewR: Rectangle, iconR: Rectangle, textR: Rectangle, textIconGap: Int): String = ???

    @stub
    // Invokes actionPerformed on action if
    // action is enabled (and non-null).
    def notifyAction(action: Action, ks: KeyStroke, event: KeyEvent, sender: Object, modifiers: Int): Boolean = ???

    @stub
    // Paints a component to the specified Graphics.
    def paintComponent(g: Graphics, c: Component, p: Container, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // Paints a component to the specified Graphics.
    def paintComponent(g: Graphics, c: Component, p: Container, r: Rectangle): Unit = ???

    @stub
    // Process the key bindings for the Component associated with
    // event.
    def processKeyBindings(event: KeyEvent): Boolean = ???

    @stub
    // Convenience method to change the UI ActionMap for component
    // to uiActionMap.
    def replaceUIActionMap(component: JComponent, uiActionMap: ActionMap): Unit = ???

    @stub
    // Convenience method to change the UI InputMap for component
    // to uiInputMap.
    def replaceUIInputMap(component: JComponent, type: Int, uiInputMap: InputMap): Unit = ???

    @stub
    // A simple minded look and feel change: ask each node in the tree
    // to updateUI() -- that is, to initialize its UI property
    // with the current look and feel.
    def updateComponentTreeUI(c: Component): Unit = ???
}

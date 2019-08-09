package javax.swing

import java.applet.Applet
import java.awt.{Component, Dimension, Image, Rectangle, Window}
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class manages repaint requests, allowing the number
 *  of repaints to be minimized, for example by collapsing multiple
 *  requests into a single repaint for members of a component tree.
 *  
 *  As of 1.6 RepaintManager handles repaint requests
 *  for Swing's top level components (JApplet,
 *  JWindow, JFrame and JDialog).
 *  Any calls to repaint on one of these will call into the
 *  appropriate addDirtyRegion method.
 */
class RepaintManager extends Object {

    /** Create a new RepaintManager instance. */
    @stub
    def this() = ???

    /** Adds applet to the list of Components that
     *  need to be repainted.
     */
    @stub
    def addDirtyRegion(applet: Applet, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** Add a component in the list of components that should be refreshed. */
    @stub
    def addDirtyRegion(c: JComponent, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** Adds window to the list of Components that
     *  need to be repainted.
     */
    @stub
    def addDirtyRegion(window: Window, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** Mark the component as in need of layout and queue a runnable
     *  for the event dispatching thread that will validate the components
     *  first isValidateRoot() ancestor.
     */
    @stub
    def addInvalidComponent(invalidComponent: JComponent): Unit = ???

    /** Return the current dirty region for a component. */
    @stub
    def getDirtyRegion(aComponent: JComponent): Rectangle = ???

    /** Returns the maximum double buffer size. */
    @stub
    def getDoubleBufferMaximumSize(): Dimension = ???

    /** Return the offscreen buffer that should be used as a double buffer with
     *  the component c.
     */
    @stub
    def getOffscreenBuffer(c: Component, proposedWidth: Int, proposedHeight: Int): Image = ???

    /** Return a volatile offscreen buffer that should be used as a
     *  double buffer with the specified component c.
     */
    @stub
    def getVolatileOffscreenBuffer(c: Component, proposedWidth: Int, proposedHeight: Int): Image = ???

    /** Convenience method that returns true if aComponent will be completely
     *  painted during the next paintDirtyRegions().
     */
    @stub
    def isCompletelyDirty(aComponent: JComponent): Boolean = ???

    /** Returns true if this RepaintManager is double buffered. */
    @stub
    def isDoubleBufferingEnabled(): Boolean = ???

    /** Mark a component completely clean. */
    @stub
    def markCompletelyClean(aComponent: JComponent): Unit = ???

    /** Mark a component completely dirty. */
    @stub
    def markCompletelyDirty(aComponent: JComponent): Unit = ???

    /** Paint all of the components that have been marked dirty. */
    @stub
    def paintDirtyRegions(): Unit = ???

    /** Remove a component from the list of invalid components. */
    @stub
    def removeInvalidComponent(component: JComponent): Unit = ???

    /** Enables or disables double buffering in this RepaintManager. */
    @stub
    def setDoubleBufferingEnabled(aFlag: Boolean): Unit = ???

    /** Set the maximum double buffer size. */
    @stub
    def setDoubleBufferMaximumSize(d: Dimension): Unit = ???

    /** Returns a string that displays and identifies this
     *  object's properties.
     */
    @stub
    def toString(): String = ???

    /** Validate all of the components that have been marked invalid. */
    @stub
    def validateInvalidComponents(): Unit = ???
}

object RepaintManager {
    /** Return the RepaintManager for the calling thread given a Component. */
    @stub
    def currentManager(c: Component): RepaintManager = ???

    /** Return the RepaintManager for the calling thread given a JComponent. */
    @stub
    def currentManager(c: JComponent): RepaintManager = ???

    /** Set the RepaintManager that should be used for the calling
     *  thread.
     */
    @stub
    def setCurrentManager(aRepaintManager: RepaintManager): Unit = ???
}

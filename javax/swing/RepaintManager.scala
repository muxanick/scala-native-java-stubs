package javax.swing

import java.applet.Applet
import java.awt.{Component, Dimension, Image, Rectangle, Window}
import java.lang.{Object, String}

// This class manages repaint requests, allowing the number
// of repaints to be minimized, for example by collapsing multiple
// requests into a single repaint for members of a component tree.
// 
// As of 1.6 RepaintManager handles repaint requests
// for Swing's top level components (JApplet,
// JWindow, JFrame and JDialog).
// Any calls to repaint on one of these will call into the
// appropriate addDirtyRegion method.
class RepaintManager extends Object {

    @stub
    // Adds applet to the list of Components that
    // need to be repainted.
    def addDirtyRegion(applet: Applet, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // Add a component in the list of components that should be refreshed.
    def addDirtyRegion(c: JComponent, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // Adds window to the list of Components that
    // need to be repainted.
    def addDirtyRegion(window: Window, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // Mark the component as in need of layout and queue a runnable
    // for the event dispatching thread that will validate the components
    // first isValidateRoot() ancestor.
    def addInvalidComponent(invalidComponent: JComponent): Unit = ???

    @stub
    // Return the current dirty region for a component.
    def getDirtyRegion(aComponent: JComponent): Rectangle = ???

    @stub
    // Returns the maximum double buffer size.
    def getDoubleBufferMaximumSize(): Dimension = ???

    @stub
    // Return the offscreen buffer that should be used as a double buffer with
    // the component c.
    def getOffscreenBuffer(c: Component, proposedWidth: Int, proposedHeight: Int): Image = ???

    @stub
    // Return a volatile offscreen buffer that should be used as a
    // double buffer with the specified component c.
    def getVolatileOffscreenBuffer(c: Component, proposedWidth: Int, proposedHeight: Int): Image = ???

    @stub
    // Convenience method that returns true if aComponent will be completely
    // painted during the next paintDirtyRegions().
    def isCompletelyDirty(aComponent: JComponent): Boolean = ???

    @stub
    // Returns true if this RepaintManager is double buffered.
    def isDoubleBufferingEnabled(): Boolean = ???

    @stub
    // Mark a component completely clean.
    def markCompletelyClean(aComponent: JComponent): Unit = ???

    @stub
    // Mark a component completely dirty.
    def markCompletelyDirty(aComponent: JComponent): Unit = ???

    @stub
    // Paint all of the components that have been marked dirty.
    def paintDirtyRegions(): Unit = ???

    @stub
    // Remove a component from the list of invalid components.
    def removeInvalidComponent(component: JComponent): Unit = ???

    @stub
    // Enables or disables double buffering in this RepaintManager.
    def setDoubleBufferingEnabled(aFlag: Boolean): Unit = ???

    @stub
    // Set the maximum double buffer size.
    def setDoubleBufferMaximumSize(d: Dimension): Unit = ???

    @stub
    // Returns a string that displays and identifies this
    // object's properties.
    def toString(): String = ???
}

object RepaintManager {
    @stub
    // Return the RepaintManager for the calling thread given a Component.
    def currentManager(c: Component): RepaintManager = ???

    @stub
    // Return the RepaintManager for the calling thread given a JComponent.
    def currentManager(c: JComponent): RepaintManager = ???

    @stub
    // Set the RepaintManager that should be used for the calling
    // thread.
    def setCurrentManager(aRepaintManager: RepaintManager): Unit = ???
}

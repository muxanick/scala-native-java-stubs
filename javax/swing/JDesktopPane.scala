package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.DesktopPaneUI

// A container used to create a multiple-document interface or a virtual desktop.
// You create JInternalFrame objects and add them to the
// JDesktopPane. JDesktopPane extends
// JLayeredPane to manage the potentially overlapping internal
// frames. It also maintains a reference to an instance of
// DesktopManager that is set by the UI
// class for the current look and feel (L&F).  Note that JDesktopPane
// does not support borders.
// 
// This class is normally used as the parent of JInternalFrames
// to provide a pluggable DesktopManager object to the
// JInternalFrames. The installUI of the
// L&F specific implementation is responsible for setting the
// desktopManager variable appropriately.
// When the parent of a JInternalFrame is a JDesktopPane,
// it should delegate most of its behavior to the desktopManager
// (closing, resizing, etc).
// 
// For further documentation and examples see
// How to Use Internal Frames,
// a section in The Java Tutorial.
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class JDesktopPane extends JLayeredPane with Accessible {

    @stub
    // Adds the specified component to this container at the specified
    // index.
    protected def addImpl(comp: Component, constraints: Object, index: Int): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this
    // JDesktopPane.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns all JInternalFrames currently displayed in the
    // desktop.
    def getAllFrames(): Array[JInternalFrame] = ???

    @stub
    // Returns all JInternalFrames currently displayed in the
    // specified layer of the desktop.
    def getAllFramesInLayer(layer: Int): Array[JInternalFrame] = ???

    @stub
    // Returns the DesktopManger that handles
    // desktop-specific UI actions.
    def getDesktopManager(): DesktopManager = ???

    @stub
    // Gets the current "dragging style" used by the desktop pane.
    def getDragMode(): Int = ???

    @stub
    // Returns the currently active JInternalFrame
    // in this JDesktopPane, or null
    // if no JInternalFrame is currently active.
    def getSelectedFrame(): JInternalFrame = ???

    @stub
    // Returns the L&F object that renders this component.
    def getUI(): DesktopPaneUI = ???

    @stub
    // Returns the name of the L&F class that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Returns a string representation of this JDesktopPane.
    protected def paramString(): String = ???

    @stub
    // Removes the specified component from this container.
    def remove(comp: Component): Unit = ???

    @stub
    // Remove the indexed component from this pane.
    def remove(index: Int): Unit = ???

    @stub
    // Removes all the components from this container.
    def removeAll(): Unit = ???

    @stub
    // Selects the next JInternalFrame in this desktop pane.
    def selectFrame(forward: Boolean): JInternalFrame = ???

    @stub
    // Moves the specified component to the specified z-order index in
    // the container.
    def setComponentZOrder(comp: Component, index: Int): Unit = ???

    @stub
    // Sets the DesktopManger that will handle
    // desktop-specific UI actions.
    def setDesktopManager(d: DesktopManager): Unit = ???

    @stub
    // Sets the "dragging style" used by the desktop pane.
    def setDragMode(dragMode: Int): Unit = ???

    @stub
    // Sets the currently active JInternalFrame
    //  in this JDesktopPane.
    def setSelectedFrame(f: JInternalFrame): Unit = ???

    @stub
    // Sets the L&F object that renders this component.
    def setUI(ui: DesktopPaneUI): Unit = ???
}

object JDesktopPane {
    @stub
    // Indicates that the entire contents of the item being dragged
    // should appear inside the desktop pane.
    def LIVE_DRAG_MODE: Int = ???
}

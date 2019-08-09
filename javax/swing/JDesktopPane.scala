package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.DesktopPaneUI

/** A container used to create a multiple-document interface or a virtual desktop.
 *  You create JInternalFrame objects and add them to the
 *  JDesktopPane. JDesktopPane extends
 *  JLayeredPane to manage the potentially overlapping internal
 *  frames. It also maintains a reference to an instance of
 *  DesktopManager that is set by the UI
 *  class for the current look and feel (L&F).  Note that JDesktopPane
 *  does not support borders.
 *  
 *  This class is normally used as the parent of JInternalFrames
 *  to provide a pluggable DesktopManager object to the
 *  JInternalFrames. The installUI of the
 *  L&F specific implementation is responsible for setting the
 *  desktopManager variable appropriately.
 *  When the parent of a JInternalFrame is a JDesktopPane,
 *  it should delegate most of its behavior to the desktopManager
 *  (closing, resizing, etc).
 *  
 *  For further documentation and examples see
 *  How to Use Internal Frames,
 *  a section in The Java Tutorial.
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class JDesktopPane extends JLayeredPane with Accessible {

    /** Adds the specified component to this container at the specified
     *  index.
     */
    @stub
    protected def addImpl(comp: Component, constraints: Object, index: Int): Unit = ???

    /** Gets the AccessibleContext associated with this
     *  JDesktopPane.
     */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns all JInternalFrames currently displayed in the
     *  desktop.
     */
    @stub
    def getAllFrames(): Array[JInternalFrame] = ???

    /** Returns all JInternalFrames currently displayed in the
     *  specified layer of the desktop.
     */
    @stub
    def getAllFramesInLayer(layer: Int): Array[JInternalFrame] = ???

    /** Returns the DesktopManger that handles
     *  desktop-specific UI actions.
     */
    @stub
    def getDesktopManager(): DesktopManager = ???

    /** Gets the current "dragging style" used by the desktop pane. */
    @stub
    def getDragMode(): Int = ???

    /** Returns the currently active JInternalFrame
     *  in this JDesktopPane, or null
     *  if no JInternalFrame is currently active.
     */
    @stub
    def getSelectedFrame(): JInternalFrame = ???

    /** Returns the L&F object that renders this component. */
    @stub
    def getUI(): DesktopPaneUI = ???

    /** Returns the name of the L&F class that renders this component. */
    @stub
    def getUIClassID(): String = ???

    /** Returns a string representation of this JDesktopPane. */
    @stub
    protected def paramString(): String = ???

    /** Removes the specified component from this container. */
    @stub
    def remove(comp: Component): Unit = ???

    /** Remove the indexed component from this pane. */
    @stub
    def remove(index: Int): Unit = ???

    /** Removes all the components from this container. */
    @stub
    def removeAll(): Unit = ???

    /** Selects the next JInternalFrame in this desktop pane. */
    @stub
    def selectFrame(forward: Boolean): JInternalFrame = ???

    /** Moves the specified component to the specified z-order index in
     *  the container.
     */
    @stub
    def setComponentZOrder(comp: Component, index: Int): Unit = ???

    /** Sets the DesktopManger that will handle
     *  desktop-specific UI actions.
     */
    @stub
    def setDesktopManager(d: DesktopManager): Unit = ???

    /** Sets the "dragging style" used by the desktop pane. */
    @stub
    def setDragMode(dragMode: Int): Unit = ???

    /** Sets the currently active JInternalFrame
     *   in this JDesktopPane.
     */
    @stub
    def setSelectedFrame(f: JInternalFrame): Unit = ???

    /** Sets the L&F object that renders this component. */
    @stub
    def setUI(ui: DesktopPaneUI): Unit = ???
}

object JDesktopPane {
    /** Indicates that the entire contents of the item being dragged
     *  should appear inside the desktop pane.
     */
    @stub
    val LIVE_DRAG_MODE: Int = ???
}

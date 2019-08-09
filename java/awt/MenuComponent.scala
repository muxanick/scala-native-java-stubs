package java.awt

import java.io.Serializable
import java.lang.{Object, String}
import javax.accessibility.AccessibleContext

// The abstract class MenuComponent is the superclass
// of all menu-related components. In this respect, the class
// MenuComponent is analogous to the abstract superclass
// Component for AWT components.
// 
// Menu components receive and process AWT events, just as components do,
// through the method processEvent.
abstract class MenuComponent extends Object with Serializable {

    // Delivers an event to this component or one of its sub components.
    def dispatchEvent(e: AWTEvent): Unit

    // Gets the AccessibleContext associated with
    // this MenuComponent.
    def getAccessibleContext(): AccessibleContext

    // Gets the font used for this menu component.
    def getFont(): Font

    // Gets the name of the menu component.
    def getName(): String

    // Returns the parent container for this menu component.
    def getParent(): MenuContainer

    // Deprecated. 
    //As of JDK version 1.1,
    // programs should not directly manipulate peers.
    //
    def getPeer(): java.awt.peer.MenuComponentPeer

    // Gets this component's locking object (the object that owns the thread
    // synchronization monitor) for AWT component-tree and layout
    // operations.
    protected def getTreeLock(): Object

    // Returns a string representing the state of this
    // MenuComponent.
    protected def paramString(): String

    // Deprecated. 
    //As of JDK version 1.1, replaced by dispatchEvent.
    //
    def postEvent(evt: Event): Boolean

    // Processes events occurring on this menu component.
    protected def processEvent(e: AWTEvent): Unit

    // Removes the menu component's peer.
    def removeNotify(): Unit

    // Sets the font to be used for this menu component to the specified
    // font.
    def setFont(f: Font): Unit

    // Sets the name of the component to the specified string.
    def setName(name: String): Unit
}

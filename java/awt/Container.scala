package java.awt

import java.awt.event.{ContainerEvent, ContainerListener}
import java.beans.PropertyChangeListener
import java.io.{PrintStream, PrintWriter}
import java.lang.{Class, Object, String}
import java.util.{EventListener, Set}

// A generic Abstract Window Toolkit(AWT) container object is a component
// that can contain other AWT components.
// 
// Components added to a container are tracked in a list.  The order
// of the list will define the components' front-to-back stacking order
// within the container.  If no index is specified when adding a
// component to a container, it will be added to the end of the list
// (and hence to the bottom of the stacking order).
// 
// Note: For details on the focus subsystem, see
// 
// How to Use the Focus Subsystem,
// a section in The Java Tutorial, and the
// Focus Specification
// for more information.
class Container extends Component {

    @stub
    // Appends the specified component to the end of this container.
    def add(comp: Component): Component = ???

    @stub
    // Adds the specified component to this container at the given
    // position.
    def add(comp: Component, index: Int): Component = ???

    @stub
    // Adds the specified component to the end of this container.
    def add(comp: Component, constraints: Object): Unit = ???

    @stub
    // Adds the specified component to this container with the specified
    // constraints at the specified index.
    def add(comp: Component, constraints: Object, index: Int): Unit = ???

    @stub
    // Adds the specified component to this container.
    def add(name: String, comp: Component): Component = ???

    @stub
    // Adds the specified container listener to receive container events
    // from this container.
    def addContainerListener(l: ContainerListener): Unit = ???

    @stub
    // Adds the specified component to this container at the specified
    // index.
    protected def addImpl(comp: Component, constraints: Object, index: Int): Unit = ???

    @stub
    // Makes this Container displayable by connecting it to
    // a native screen resource.
    def addNotify(): Unit = ???

    @stub
    // Adds a PropertyChangeListener to the listener list.
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // Adds a PropertyChangeListener to the listener list for a specific
    // property.
    def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit = ???

    @stub
    // Sets the ComponentOrientation property of this container
    // and all components contained within it.
    def applyComponentOrientation(o: ComponentOrientation): Unit = ???

    @stub
    // Returns whether the Set of focus traversal keys for the given focus
    // traversal operation has been explicitly defined for this Container.
    def areFocusTraversalKeysSet(id: Int): Boolean = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getComponentCount().
    //
    def countComponents(): Int = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by dispatchEvent(AWTEvent e)
    //
    def deliverEvent(e: Event): Unit = ???

    @stub
    // Causes this container to lay out its components.
    def doLayout(): Unit = ???

    @stub
    // Locates the visible child component that contains the specified
    // position.
    def findComponentAt(x: Int, y: Int): Component = ???

    @stub
    // Locates the visible child component that contains the specified
    // point.
    def findComponentAt(p: Point): Component = ???

    @stub
    // Returns the alignment along the x axis.
    def getAlignmentX(): float = ???

    @stub
    // Returns the alignment along the y axis.
    def getAlignmentY(): float = ???

    @stub
    // Gets the nth component in this container.
    def getComponent(n: Int): Component = ???

    @stub
    // Locates the component that contains the x,y position.
    def getComponentAt(x: Int, y: Int): Component = ???

    @stub
    // Gets the component that contains the specified point.
    def getComponentAt(p: Point): Component = ???

    @stub
    // Gets the number of components in this panel.
    def getComponentCount(): Int = ???

    @stub
    // Gets all the components in this container.
    def getComponents(): Array[Component] = ???

    @stub
    // Returns the z-order index of the component inside the container.
    def getComponentZOrder(comp: Component): Int = ???

    @stub
    // Returns an array of all the container listeners
    // registered on this container.
    def getContainerListeners(): Array[ContainerListener] = ???

    @stub
    // Returns the Set of focus traversal keys for a given traversal operation
    // for this Container.
    def getFocusTraversalKeys(id: Int): Set[AWTKeyStroke] = ???

    @stub
    // Returns the focus traversal policy that will manage keyboard traversal
    // of this Container's children, or null if this Container is not a focus
    // cycle root.
    def getFocusTraversalPolicy(): FocusTraversalPolicy = ???

    @stub
    // Determines the insets of this container, which indicate the size
    // of the container's border.
    def getInsets(): Insets = ???

    @stub
    // Gets the layout manager for this container.
    def getLayout(): LayoutManager = ???

    @stub
    // Returns an array of all the objects currently registered
    // as FooListeners
    // upon this Container.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Returns the maximum size of this container.
    def getMaximumSize(): Dimension = ???

    @stub
    // Returns the minimum size of this container.
    def getMinimumSize(): Dimension = ???

    @stub
    // Returns the position of the mouse pointer in this Container's
    // coordinate space if the Container is under the mouse pointer,
    // otherwise returns null.
    def getMousePosition(allowChildren: Boolean): Point = ???

    @stub
    // Returns the preferred size of this container.
    def getPreferredSize(): Dimension = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getInsets().
    //
    def insets(): Insets = ???

    @stub
    // Invalidates the container.
    def invalidate(): Unit = ???

    @stub
    // Checks if the component is contained in the component hierarchy of
    // this container.
    def isAncestorOf(c: Component): Boolean = ???

    @stub
    // Returns whether this Container is the root of a focus traversal cycle.
    def isFocusCycleRoot(): Boolean = ???

    @stub
    // Returns whether the specified Container is the focus cycle root of this
    // Container's focus traversal cycle.
    def isFocusCycleRoot(container: Container): Boolean = ???

    @stub
    // Returns whether this container provides focus traversal
    // policy.
    def isFocusTraversalPolicyProvider(): Boolean = ???

    @stub
    // Returns whether the focus traversal policy has been explicitly set for
    // this Container.
    def isFocusTraversalPolicySet(): Boolean = ???

    @stub
    // Indicates if this container is a validate root.
    def isValidateRoot(): Boolean = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by doLayout().
    //
    def layout(): Unit = ???

    @stub
    // Prints a listing of this container to the specified output
    // stream.
    def list(out: PrintStream, indent: Int): Unit = ???

    @stub
    // Prints out a list, starting at the specified indentation,
    // to the specified print writer.
    def list(out: PrintWriter, indent: Int): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getComponentAt(int, int).
    //
    def locate(x: Int, y: Int): Component = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getMinimumSize().
    //
    def minimumSize(): Dimension = ???

    @stub
    // Paints the container.
    def paint(g: Graphics): Unit = ???

    @stub
    // Paints each of the components in this container.
    def paintComponents(g: Graphics): Unit = ???

    @stub
    // Returns a string representing the state of this Container.
    protected def paramString(): String = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getPreferredSize().
    //
    def preferredSize(): Dimension = ???

    @stub
    // Prints the container.
    def print(g: Graphics): Unit = ???

    @stub
    // Prints each of the components in this container.
    def printComponents(g: Graphics): Unit = ???

    @stub
    // Processes container events occurring on this container by
    // dispatching them to any registered ContainerListener objects.
    protected def processContainerEvent(e: ContainerEvent): Unit = ???

    @stub
    // Processes events on this container.
    protected def processEvent(e: AWTEvent): Unit = ???

    @stub
    // Removes the specified component from this container.
    def remove(comp: Component): Unit = ???

    @stub
    // Removes the component, specified by index,
    // from this container.
    def remove(index: Int): Unit = ???

    @stub
    // Removes all the components from this container.
    def removeAll(): Unit = ???

    @stub
    // Removes the specified container listener so it no longer receives
    // container events from this container.
    def removeContainerListener(l: ContainerListener): Unit = ???

    @stub
    // Makes this Container undisplayable by removing its connection
    // to its native screen resource.
    def removeNotify(): Unit = ???

    @stub
    // Moves the specified component to the specified z-order index in
    // the container.
    def setComponentZOrder(comp: Component, index: Int): Unit = ???

    @stub
    // Sets whether this Container is the root of a focus traversal cycle.
    def setFocusCycleRoot(focusCycleRoot: Boolean): Unit = ???

    @stub
    // Sets the focus traversal keys for a given traversal operation for this
    // Container.
    def setFocusTraversalKeys(id: Int, keystrokes: Set[_ <: AWTKeyStroke]): Unit = ???

    @stub
    // Sets the focus traversal policy that will manage keyboard traversal of
    // this Container's children, if this Container is a focus cycle root.
    def setFocusTraversalPolicy(policy: FocusTraversalPolicy): Unit = ???

    @stub
    // Sets whether this container will be used to provide focus
    // traversal policy.
    def setFocusTraversalPolicyProvider(provider: Boolean): Unit = ???

    @stub
    // Sets the font of this container.
    def setFont(f: Font): Unit = ???

    @stub
    // Sets the layout manager for this container.
    def setLayout(mgr: LayoutManager): Unit = ???

    @stub
    // Transfers the focus down one focus traversal cycle.
    def transferFocusDownCycle(): Unit = ???

    @stub
    // Updates the container.
    def update(g: Graphics): Unit = ???

    @stub
    // Validates this container and all of its subcomponents.
    def validate(): Unit = ???
}

package java.awt

import java.awt.event.{ContainerEvent, ContainerListener}
import java.beans.PropertyChangeListener
import java.io.{PrintStream, PrintWriter}
import java.lang.{Class, Object, String}
import java.util.{EventListener, Set}
import javax.accessibility.{Accessible, AccessibleContext}
import scala.scalanative.annotation.stub

/** A generic Abstract Window Toolkit(AWT) container object is a component
 *  that can contain other AWT components.
 *  
 *  Components added to a container are tracked in a list.  The order
 *  of the list will define the components' front-to-back stacking order
 *  within the container.  If no index is specified when adding a
 *  component to a container, it will be added to the end of the list
 *  (and hence to the bottom of the stacking order).
 *  
 *  Note: For details on the focus subsystem, see
 *  
 *  How to Use the Focus Subsystem,
 *  a section in The Java Tutorial, and the
 *  Focus Specification
 *  for more information.
 */
class Container extends Component {

    /** Constructs a new Container. */
    @stub
    def this() = ???

    /** Inner class of Container used to provide default support for
     *  accessibility.  This class is not meant to be used directly by
     *  application developers, but is instead meant only to be
     *  subclassed by container developers.
     *  
     *  The class used to obtain the accessible role for this object,
     *  as well as implementing many of the methods in the
     *  AccessibleContainer interface.
     */
    protected class AccessibleAWTContainer extends Component.AccessibleAWTComponent {

        /**  */
        @stub
        protected def this() = ???

        /** Fire PropertyChange listener, if one is registered,
         *  when children are added or removed.
         */
        protected class AccessibleContainerHandler extends Object with ContainerListener {

            /**  */
            @stub
            protected def this() = ???

            /** Invoked when a component has been added to the container. */
            @stub
            def componentAdded(e: ContainerEvent): Unit = ???

            /** Invoked when a component has been removed from the container. */
            @stub
            def componentRemoved(e: ContainerEvent): Unit = ???
        }


        /**  */
        @stub
        protected val accessibleContainerHandler: ContainerListener = ???

        /** Adds a PropertyChangeListener to the listener list. */
        @stub
        def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

        /** Returns the Accessible child, if one exists,
         *  contained at the local coordinate Point.
         */
        @stub
        def getAccessibleAt(p: Point): Accessible = ???

        /** Returns the nth Accessible child of the object. */
        @stub
        def getAccessibleChild(i: Int): Accessible = ???

        /** Returns the number of accessible children in the object. */
        @stub
        def getAccessibleChildrenCount(): Int = ???

        /** Remove a PropertyChangeListener from the listener list. */
        @stub
        def removePropertyChangeListener(listener: PropertyChangeListener): Unit = ???
    }


    /** Appends the specified component to the end of this container. */
    @stub
    def add(comp: Component): Component = ???

    /** Adds the specified component to this container at the given
     *  position.
     */
    @stub
    def add(comp: Component, index: Int): Component = ???

    /** Adds the specified component to the end of this container. */
    @stub
    def add(comp: Component, constraints: Any): Unit = ???

    /** Adds the specified component to this container with the specified
     *  constraints at the specified index.
     */
    @stub
    def add(comp: Component, constraints: Any, index: Int): Unit = ???

    /** Adds the specified component to this container. */
    @stub
    def add(name: String, comp: Component): Component = ???

    /** Adds the specified container listener to receive container events
     *  from this container.
     */
    @stub
    def addContainerListener(l: ContainerListener): Unit = ???

    /** Adds the specified component to this container at the specified
     *  index.
     */
    @stub
    protected def addImpl(comp: Component, constraints: Any, index: Int): Unit = ???

    /** Makes this Container displayable by connecting it to
     *  a native screen resource.
     */
    @stub
    def addNotify(): Unit = ???

    /** Adds a PropertyChangeListener to the listener list. */
    @stub
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** Adds a PropertyChangeListener to the listener list for a specific
     *  property.
     */
    @stub
    def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit = ???

    /** Sets the ComponentOrientation property of this container
     *  and all components contained within it.
     */
    @stub
    def applyComponentOrientation(o: ComponentOrientation): Unit = ???

    /** Returns whether the Set of focus traversal keys for the given focus
     *  traversal operation has been explicitly defined for this Container.
     */
    @stub
    def areFocusTraversalKeysSet(id: Int): Boolean = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getComponentCount().
     * 
     */
    @stub
    def countComponents(): Int = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by dispatchEvent(AWTEvent e)
     * 
     */
    @stub
    def deliverEvent(e: Event): Unit = ???

    /** Causes this container to lay out its components. */
    @stub
    def doLayout(): Unit = ???

    /** Locates the visible child component that contains the specified
     *  position.
     */
    @stub
    def findComponentAt(x: Int, y: Int): Component = ???

    /** Locates the visible child component that contains the specified
     *  point.
     */
    @stub
    def findComponentAt(p: Point): Component = ???

    /** Returns the alignment along the x axis. */
    @stub
    def getAlignmentX(): Float = ???

    /** Returns the alignment along the y axis. */
    @stub
    def getAlignmentY(): Float = ???

    /** Gets the nth component in this container. */
    @stub
    def getComponent(n: Int): Component = ???

    /** Locates the component that contains the x,y position. */
    @stub
    def getComponentAt(x: Int, y: Int): Component = ???

    /** Gets the component that contains the specified point. */
    @stub
    def getComponentAt(p: Point): Component = ???

    /** Gets the number of components in this panel. */
    @stub
    def getComponentCount(): Int = ???

    /** Gets all the components in this container. */
    @stub
    def getComponents(): Array[Component] = ???

    /** Returns the z-order index of the component inside the container. */
    @stub
    def getComponentZOrder(comp: Component): Int = ???

    /** Returns an array of all the container listeners
     *  registered on this container.
     */
    @stub
    def getContainerListeners(): Array[ContainerListener] = ???

    /** Returns the Set of focus traversal keys for a given traversal operation
     *  for this Container.
     */
    @stub
    def getFocusTraversalKeys(id: Int): Set[AWTKeyStroke] = ???

    /** Returns the focus traversal policy that will manage keyboard traversal
     *  of this Container's children, or null if this Container is not a focus
     *  cycle root.
     */
    @stub
    def getFocusTraversalPolicy(): FocusTraversalPolicy = ???

    /** Determines the insets of this container, which indicate the size
     *  of the container's border.
     */
    @stub
    def getInsets(): Insets = ???

    /** Gets the layout manager for this container. */
    @stub
    def getLayout(): LayoutManager = ???

    /** Returns an array of all the objects currently registered
     *  as FooListeners
     *  upon this Container.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Returns the maximum size of this container. */
    @stub
    def getMaximumSize(): Dimension = ???

    /** Returns the minimum size of this container. */
    @stub
    def getMinimumSize(): Dimension = ???

    /** Returns the position of the mouse pointer in this Container's
     *  coordinate space if the Container is under the mouse pointer,
     *  otherwise returns null.
     */
    @stub
    def getMousePosition(allowChildren: Boolean): Point = ???

    /** Returns the preferred size of this container. */
    @stub
    def getPreferredSize(): Dimension = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getInsets().
     * 
     */
    @stub
    def insets(): Insets = ???

    /** Invalidates the container. */
    @stub
    def invalidate(): Unit = ???

    /** Checks if the component is contained in the component hierarchy of
     *  this container.
     */
    @stub
    def isAncestorOf(c: Component): Boolean = ???

    /** Returns whether this Container is the root of a focus traversal cycle. */
    @stub
    def isFocusCycleRoot(): Boolean = ???

    /** Returns whether the specified Container is the focus cycle root of this
     *  Container's focus traversal cycle.
     */
    @stub
    def isFocusCycleRoot(container: Container): Boolean = ???

    /** Returns whether this container provides focus traversal
     *  policy.
     */
    @stub
    def isFocusTraversalPolicyProvider(): Boolean = ???

    /** Returns whether the focus traversal policy has been explicitly set for
     *  this Container.
     */
    @stub
    def isFocusTraversalPolicySet(): Boolean = ???

    /** Indicates if this container is a validate root. */
    @stub
    def isValidateRoot(): Boolean = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by doLayout().
     * 
     */
    @stub
    def layout(): Unit = ???

    /** Prints a listing of this container to the specified output
     *  stream.
     */
    @stub
    def list(out: PrintStream, indent: Int): Unit = ???

    /** Prints out a list, starting at the specified indentation,
     *  to the specified print writer.
     */
    @stub
    def list(out: PrintWriter, indent: Int): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getComponentAt(int, int).
     * 
     */
    @stub
    def locate(x: Int, y: Int): Component = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getMinimumSize().
     * 
     */
    @stub
    def minimumSize(): Dimension = ???

    /** Paints the container. */
    @stub
    def paint(g: Graphics): Unit = ???

    /** Paints each of the components in this container. */
    @stub
    def paintComponents(g: Graphics): Unit = ???

    /** Returns a string representing the state of this Container. */
    @stub
    protected def paramString(): String = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getPreferredSize().
     * 
     */
    @stub
    def preferredSize(): Dimension = ???

    /** Prints the container. */
    @stub
    def print(g: Graphics): Unit = ???

    /** Prints each of the components in this container. */
    @stub
    def printComponents(g: Graphics): Unit = ???

    /** Processes container events occurring on this container by
     *  dispatching them to any registered ContainerListener objects.
     */
    @stub
    protected def processContainerEvent(e: ContainerEvent): Unit = ???

    /** Processes events on this container. */
    @stub
    protected def processEvent(e: AWTEvent): Unit = ???

    /** Removes the specified component from this container. */
    @stub
    def remove(comp: Component): Unit = ???

    /** Removes the component, specified by index,
     *  from this container.
     */
    @stub
    def remove(index: Int): Unit = ???

    /** Removes all the components from this container. */
    @stub
    def removeAll(): Unit = ???

    /** Removes the specified container listener so it no longer receives
     *  container events from this container.
     */
    @stub
    def removeContainerListener(l: ContainerListener): Unit = ???

    /** Makes this Container undisplayable by removing its connection
     *  to its native screen resource.
     */
    @stub
    def removeNotify(): Unit = ???

    /** Moves the specified component to the specified z-order index in
     *  the container.
     */
    @stub
    def setComponentZOrder(comp: Component, index: Int): Unit = ???

    /** Sets whether this Container is the root of a focus traversal cycle. */
    @stub
    def setFocusCycleRoot(focusCycleRoot: Boolean): Unit = ???

    /** Sets the focus traversal keys for a given traversal operation for this
     *  Container.
     */
    @stub
    def setFocusTraversalKeys(id: Int, keystrokes: Set[_ <: AWTKeyStroke]): Unit = ???

    /** Sets the focus traversal policy that will manage keyboard traversal of
     *  this Container's children, if this Container is a focus cycle root.
     */
    @stub
    def setFocusTraversalPolicy(policy: FocusTraversalPolicy): Unit = ???

    /** Sets whether this container will be used to provide focus
     *  traversal policy.
     */
    @stub
    def setFocusTraversalPolicyProvider(provider: Boolean): Unit = ???

    /** Sets the font of this container. */
    @stub
    def setFont(f: Font): Unit = ???

    /** Sets the layout manager for this container. */
    @stub
    def setLayout(mgr: LayoutManager): Unit = ???

    /** Transfers the focus down one focus traversal cycle. */
    @stub
    def transferFocusDownCycle(): Unit = ???

    /** Updates the container. */
    @stub
    def update(g: Graphics): Unit = ???

    /** Validates this container and all of its subcomponents. */
    @stub
    def validate(): Unit = ???

    /** Recursively descends the container tree and recomputes the
     *  layout for any subtrees marked as needing it (those marked as
     *  invalid).
     */
    @stub
    protected def validateTree(): Unit = ???
}

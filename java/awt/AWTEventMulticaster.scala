package java.awt

import java.awt.event.{ActionEvent, ActionListener, AdjustmentEvent, AdjustmentListener, ComponentEvent, ComponentListener, ContainerEvent, ContainerListener, FocusEvent, FocusListener, HierarchyBoundsListener, HierarchyEvent, HierarchyListener, InputMethodEvent, InputMethodListener, ItemEvent, ItemListener, KeyEvent, KeyListener, MouseEvent, MouseListener, MouseMotionListener, MouseWheelEvent, MouseWheelListener, TextEvent, TextListener, WindowEvent, WindowFocusListener, WindowListener, WindowStateListener}
import java.io.ObjectOutputStream
import java.lang.{Class, Object, String}
import java.util.EventListener

/** AWTEventMulticaster implements efficient and thread-safe multi-cast
 *  event dispatching for the AWT events defined in the java.awt.event
 *  package.
 *  
 *  The following example illustrates how to use this class:
 * 
 *  
 *  public myComponent extends Component {
 *      ActionListener actionListener = null;
 * 
 *      public synchronized void addActionListener(ActionListener l) {
 *          actionListener = AWTEventMulticaster.add(actionListener, l);
 *      }
 *      public synchronized void removeActionListener(ActionListener l) {
 *          actionListener = AWTEventMulticaster.remove(actionListener, l);
 *      }
 *      public void processEvent(AWTEvent e) {
 *          // when event occurs which causes "action" semantic
 *          ActionListener listener = actionListener;
 *          if (listener != null) {
 *              listener.actionPerformed(new ActionEvent());
 *          }
 *      }
 *  }
 *  
 *  The important point to note is the first argument to the add and remove methods is the field maintaining the
 *  listeners. In addition you must assign the result of the add
 *  and remove methods to the field maintaining the listeners.
 *  
 *  AWTEventMulticaster is implemented as a pair of EventListeners that are set at construction time. AWTEventMulticaster is immutable. The add and remove methods do not alter AWTEventMulticaster in
 *  anyway. If necessary, a new AWTEventMulticaster is
 *  created. In this way it is safe to add and remove listeners during
 *  the process of an event dispatching.  However, event listeners
 *  added during the process of an event dispatch operation are not
 *  notified of the event currently being dispatched.
 *  
 *  All of the add methods allow null arguments. If the
 *  first argument is null, the second argument is returned. If
 *  the first argument is not null and the second argument is
 *  null, the first argument is returned. If both arguments are
 *  non-null, a new AWTEventMulticaster is created using
 *  the two arguments and returned.
 *  
 *  For the remove methods that take two arguments, the following is
 *  returned:
 *  
 *    null, if the first argument is null, or
 *        the arguments are equal, by way of ==.
 *    the first argument, if the first argument is not an instance of
 *        AWTEventMulticaster.
 *    result of invoking remove(EventListener) on the
 *        first argument, supplying the second argument to the
 *        remove(EventListener) method.
 *  
 *  Swing makes use of
 *  EventListenerList for
 *  similar logic. Refer to it for details.
 */
class AWTEventMulticaster extends Object with ComponentListener with ContainerListener with FocusListener with KeyListener with MouseListener with MouseMotionListener with WindowListener with WindowFocusListener with WindowStateListener with ActionListener with ItemListener with AdjustmentListener with TextListener with InputMethodListener with HierarchyListener with HierarchyBoundsListener with MouseWheelListener {

    /**  */
    @stub
    protected val a: EventListener = ???

    /** Handles the actionPerformed event by invoking the
     *  actionPerformed methods on listener-a and listener-b.
     */
    @stub
    def actionPerformed(e: ActionEvent): Unit = ???

    /** Handles the adjustmentValueChanged event by invoking the
     *  adjustmentValueChanged methods on listener-a and listener-b.
     */
    @stub
    def adjustmentValueChanged(e: AdjustmentEvent): Unit = ???

    /** Handles the ancestorMoved event by invoking the
     *  ancestorMoved methods on listener-a and listener-b.
     */
    @stub
    def ancestorMoved(e: HierarchyEvent): Unit = ???

    /** Handles the ancestorResized event by invoking the
     *  ancestorResized methods on listener-a and listener-b.
     */
    @stub
    def ancestorResized(e: HierarchyEvent): Unit = ???

    /** Handles the caretPositionChanged event by invoking the
     *  caretPositionChanged methods on listener-a and listener-b.
     */
    @stub
    def caretPositionChanged(e: InputMethodEvent): Unit = ???

    /** Handles the componentAdded container event by invoking the
     *  componentAdded methods on listener-a and listener-b.
     */
    @stub
    def componentAdded(e: ContainerEvent): Unit = ???

    /** Handles the componentHidden event by invoking the
     *  componentHidden methods on listener-a and listener-b.
     */
    @stub
    def componentHidden(e: ComponentEvent): Unit = ???

    /** Handles the componentMoved event by invoking the
     *  componentMoved methods on listener-a and listener-b.
     */
    @stub
    def componentMoved(e: ComponentEvent): Unit = ???

    /** Handles the componentRemoved container event by invoking the
     *  componentRemoved methods on listener-a and listener-b.
     */
    @stub
    def componentRemoved(e: ContainerEvent): Unit = ???

    /** Handles the componentResized event by invoking the
     *  componentResized methods on listener-a and listener-b.
     */
    @stub
    def componentResized(e: ComponentEvent): Unit = ???

    /** Handles the componentShown event by invoking the
     *  componentShown methods on listener-a and listener-b.
     */
    @stub
    def componentShown(e: ComponentEvent): Unit = ???

    /** Handles the focusGained event by invoking the
     *  focusGained methods on listener-a and listener-b.
     */
    @stub
    def focusGained(e: FocusEvent): Unit = ???

    /** Handles the focusLost event by invoking the
     *  focusLost methods on listener-a and listener-b.
     */
    @stub
    def focusLost(e: FocusEvent): Unit = ???

    /** Handles the hierarchyChanged event by invoking the
     *  hierarchyChanged methods on listener-a and listener-b.
     */
    @stub
    def hierarchyChanged(e: HierarchyEvent): Unit = ???

    /** Handles the inputMethodTextChanged event by invoking the
     *  inputMethodTextChanged methods on listener-a and listener-b.
     */
    @stub
    def inputMethodTextChanged(e: InputMethodEvent): Unit = ???

    /** Handles the itemStateChanged event by invoking the
     *  itemStateChanged methods on listener-a and listener-b.
     */
    @stub
    def itemStateChanged(e: ItemEvent): Unit = ???

    /** Handles the keyPressed event by invoking the
     *  keyPressed methods on listener-a and listener-b.
     */
    @stub
    def keyPressed(e: KeyEvent): Unit = ???

    /** Handles the keyReleased event by invoking the
     *  keyReleased methods on listener-a and listener-b.
     */
    @stub
    def keyReleased(e: KeyEvent): Unit = ???

    /** Handles the keyTyped event by invoking the
     *  keyTyped methods on listener-a and listener-b.
     */
    @stub
    def keyTyped(e: KeyEvent): Unit = ???

    /** Handles the mouseClicked event by invoking the
     *  mouseClicked methods on listener-a and listener-b.
     */
    @stub
    def mouseClicked(e: MouseEvent): Unit = ???

    /** Handles the mouseDragged event by invoking the
     *  mouseDragged methods on listener-a and listener-b.
     */
    @stub
    def mouseDragged(e: MouseEvent): Unit = ???

    /** Handles the mouseEntered event by invoking the
     *  mouseEntered methods on listener-a and listener-b.
     */
    @stub
    def mouseEntered(e: MouseEvent): Unit = ???

    /** Handles the mouseExited event by invoking the
     *  mouseExited methods on listener-a and listener-b.
     */
    @stub
    def mouseExited(e: MouseEvent): Unit = ???

    /** Handles the mouseMoved event by invoking the
     *  mouseMoved methods on listener-a and listener-b.
     */
    @stub
    def mouseMoved(e: MouseEvent): Unit = ???

    /** Handles the mousePressed event by invoking the
     *  mousePressed methods on listener-a and listener-b.
     */
    @stub
    def mousePressed(e: MouseEvent): Unit = ???

    /** Handles the mouseReleased event by invoking the
     *  mouseReleased methods on listener-a and listener-b.
     */
    @stub
    def mouseReleased(e: MouseEvent): Unit = ???

    /** Handles the mouseWheelMoved event by invoking the
     *  mouseWheelMoved methods on listener-a and listener-b.
     */
    @stub
    def mouseWheelMoved(e: MouseWheelEvent): Unit = ???

    /** Removes a listener from this multicaster. */
    @stub
    protected def remove(oldl: EventListener): EventListener = ???

    /**  */
    @stub
    protected def saveInternal(s: ObjectOutputStream, k: String): Unit = ???

    /** Invoked when the value of the text has changed. */
    @stub
    def textValueChanged(e: TextEvent): Unit = ???

    /** Handles the windowActivated event by invoking the
     *  windowActivated methods on listener-a and listener-b.
     */
    @stub
    def windowActivated(e: WindowEvent): Unit = ???

    /** Handles the windowClosed event by invoking the
     *  windowClosed methods on listener-a and listener-b.
     */
    @stub
    def windowClosed(e: WindowEvent): Unit = ???

    /** Handles the windowClosing event by invoking the
     *  windowClosing methods on listener-a and listener-b.
     */
    @stub
    def windowClosing(e: WindowEvent): Unit = ???

    /** Handles the windowDeactivated event by invoking the
     *  windowDeactivated methods on listener-a and listener-b.
     */
    @stub
    def windowDeactivated(e: WindowEvent): Unit = ???

    /** Handles the windowDeiconfied event by invoking the
     *  windowDeiconified methods on listener-a and listener-b.
     */
    @stub
    def windowDeiconified(e: WindowEvent): Unit = ???

    /** Handles the windowGainedFocus event by invoking the windowGainedFocus
     *  methods on listener-a and listener-b.
     */
    @stub
    def windowGainedFocus(e: WindowEvent): Unit = ???

    /** Handles the windowIconified event by invoking the
     *  windowIconified methods on listener-a and listener-b.
     */
    @stub
    def windowIconified(e: WindowEvent): Unit = ???

    /** Handles the windowLostFocus event by invoking the windowLostFocus
     *  methods on listener-a and listener-b.
     */
    @stub
    def windowLostFocus(e: WindowEvent): Unit = ???

    /** Handles the windowOpened event by invoking the
     *  windowOpened methods on listener-a and listener-b.
     */
    @stub
    def windowOpened(e: WindowEvent): Unit = ???
}

object AWTEventMulticaster {
    /** Adds action-listener-a with action-listener-b and
     *  returns the resulting multicast listener.
     */
    @stub
    def add(a: ActionListener, b: ActionListener): ActionListener = ???

    /** Adds adjustment-listener-a with adjustment-listener-b and
     *  returns the resulting multicast listener.
     */
    @stub
    def add(a: AdjustmentListener, b: AdjustmentListener): AdjustmentListener = ???

    /** Adds component-listener-a with component-listener-b and
     *  returns the resulting multicast listener.
     */
    @stub
    def add(a: ComponentListener, b: ComponentListener): ComponentListener = ???

    /** Adds container-listener-a with container-listener-b and
     *  returns the resulting multicast listener.
     */
    @stub
    def add(a: ContainerListener, b: ContainerListener): ContainerListener = ???

    /** Adds focus-listener-a with focus-listener-b and
     *  returns the resulting multicast listener.
     */
    @stub
    def add(a: FocusListener, b: FocusListener): FocusListener = ???

    /** Adds hierarchy-bounds-listener-a with hierarchy-bounds-listener-b and
     *  returns the resulting multicast listener.
     */
    @stub
    def add(a: HierarchyBoundsListener, b: HierarchyBoundsListener): HierarchyBoundsListener = ???

    /** Adds hierarchy-listener-a with hierarchy-listener-b and
     *  returns the resulting multicast listener.
     */
    @stub
    def add(a: HierarchyListener, b: HierarchyListener): HierarchyListener = ???

    /** Adds input-method-listener-a with input-method-listener-b and
     *  returns the resulting multicast listener.
     */
    @stub
    def add(a: InputMethodListener, b: InputMethodListener): InputMethodListener = ???

    /** Adds item-listener-a with item-listener-b and
     *  returns the resulting multicast listener.
     */
    @stub
    def add(a: ItemListener, b: ItemListener): ItemListener = ???

    /** Adds key-listener-a with key-listener-b and
     *  returns the resulting multicast listener.
     */
    @stub
    def add(a: KeyListener, b: KeyListener): KeyListener = ???

    /** Adds mouse-listener-a with mouse-listener-b and
     *  returns the resulting multicast listener.
     */
    @stub
    def add(a: MouseListener, b: MouseListener): MouseListener = ???

    /** Adds mouse-motion-listener-a with mouse-motion-listener-b and
     *  returns the resulting multicast listener.
     */
    @stub
    def add(a: MouseMotionListener, b: MouseMotionListener): MouseMotionListener = ???

    /** Adds mouse-wheel-listener-a with mouse-wheel-listener-b and
     *  returns the resulting multicast listener.
     */
    @stub
    def add(a: MouseWheelListener, b: MouseWheelListener): MouseWheelListener = ???

    /**  */
    @stub
    def add(a: TextListener, b: TextListener): TextListener = ???

    /** Adds window-focus-listener-a with window-focus-listener-b
     *  and returns the resulting multicast listener.
     */
    @stub
    def add(a: WindowFocusListener, b: WindowFocusListener): WindowFocusListener = ???

    /** Adds window-listener-a with window-listener-b and
     *  returns the resulting multicast listener.
     */
    @stub
    def add(a: WindowListener, b: WindowListener): WindowListener = ???

    /** Adds window-state-listener-a with window-state-listener-b
     *  and returns the resulting multicast listener.
     */
    @stub
    def add(a: WindowStateListener, b: WindowStateListener): WindowStateListener = ???

    /** Returns the resulting multicast listener from adding listener-a
     *  and listener-b together.
     */
    @stub
    protected def addInternal(a: EventListener, b: EventListener): EventListener = ???

    /** Returns an array of all the objects chained as
     *  FooListeners by the specified
     *  java.util.EventListener.
     */
    @stub
    def getListeners[T <: EventListener](l: EventListener, listenerType: Class[T]): Array[T] = ???

    /** Removes the old action-listener from action-listener-l and
     *  returns the resulting multicast listener.
     */
    @stub
    def remove(l: ActionListener, oldl: ActionListener): ActionListener = ???

    /** Removes the old adjustment-listener from adjustment-listener-l and
     *  returns the resulting multicast listener.
     */
    @stub
    def remove(l: AdjustmentListener, oldl: AdjustmentListener): AdjustmentListener = ???

    /** Removes the old component-listener from component-listener-l and
     *  returns the resulting multicast listener.
     */
    @stub
    def remove(l: ComponentListener, oldl: ComponentListener): ComponentListener = ???

    /** Removes the old container-listener from container-listener-l and
     *  returns the resulting multicast listener.
     */
    @stub
    def remove(l: ContainerListener, oldl: ContainerListener): ContainerListener = ???

    /** Removes the old focus-listener from focus-listener-l and
     *  returns the resulting multicast listener.
     */
    @stub
    def remove(l: FocusListener, oldl: FocusListener): FocusListener = ???

    /** Removes the old hierarchy-bounds-listener from
     *  hierarchy-bounds-listener-l and returns the resulting multicast
     *  listener.
     */
    @stub
    def remove(l: HierarchyBoundsListener, oldl: HierarchyBoundsListener): HierarchyBoundsListener = ???

    /** Removes the old hierarchy-listener from hierarchy-listener-l and
     *  returns the resulting multicast listener.
     */
    @stub
    def remove(l: HierarchyListener, oldl: HierarchyListener): HierarchyListener = ???

    /** Removes the old input-method-listener from input-method-listener-l and
     *  returns the resulting multicast listener.
     */
    @stub
    def remove(l: InputMethodListener, oldl: InputMethodListener): InputMethodListener = ???

    /** Removes the old item-listener from item-listener-l and
     *  returns the resulting multicast listener.
     */
    @stub
    def remove(l: ItemListener, oldl: ItemListener): ItemListener = ???

    /** Removes the old key-listener from key-listener-l and
     *  returns the resulting multicast listener.
     */
    @stub
    def remove(l: KeyListener, oldl: KeyListener): KeyListener = ???

    /** Removes the old mouse-listener from mouse-listener-l and
     *  returns the resulting multicast listener.
     */
    @stub
    def remove(l: MouseListener, oldl: MouseListener): MouseListener = ???

    /** Removes the old mouse-motion-listener from mouse-motion-listener-l
     *  and returns the resulting multicast listener.
     */
    @stub
    def remove(l: MouseMotionListener, oldl: MouseMotionListener): MouseMotionListener = ???

    /** Removes the old mouse-wheel-listener from mouse-wheel-listener-l
     *  and returns the resulting multicast listener.
     */
    @stub
    def remove(l: MouseWheelListener, oldl: MouseWheelListener): MouseWheelListener = ???

    /**  */
    @stub
    def remove(l: TextListener, oldl: TextListener): TextListener = ???

    /** Removes the old window-focus-listener from window-focus-listener-l
     *  and returns the resulting multicast listener.
     */
    @stub
    def remove(l: WindowFocusListener, oldl: WindowFocusListener): WindowFocusListener = ???

    /** Removes the old window-listener from window-listener-l and
     *  returns the resulting multicast listener.
     */
    @stub
    def remove(l: WindowListener, oldl: WindowListener): WindowListener = ???

    /** Removes the old window-state-listener from window-state-listener-l
     *  and returns the resulting multicast listener.
     */
    @stub
    def remove(l: WindowStateListener, oldl: WindowStateListener): WindowStateListener = ???

    /** Returns the resulting multicast listener after removing the
     *  old listener from listener-l.
     */
    @stub
    protected def removeInternal(l: EventListener, oldl: EventListener): EventListener = ???

    /**  */
    @stub
    protected def save(s: ObjectOutputStream, k: String, l: EventListener): Unit = ???
}

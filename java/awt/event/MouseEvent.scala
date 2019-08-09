package java.awt.event

import java.awt.{AWTEvent, Component, Point}
import java.lang.{Object, String}
import java.util.EventObject

// An event which indicates that a mouse action occurred in a component.
// A mouse action is considered to occur in a particular component if and only
// if the mouse cursor is over the unobscured part of the component's bounds
// when the action happens.
// For lightweight components, such as Swing's components, mouse events
// are only dispatched to the component if the mouse event type has been
// enabled on the component. A mouse event type is enabled by adding the
// appropriate mouse-based EventListener to the component
// (MouseListener or MouseMotionListener), or by invoking
// Component.enableEvents(long) with the appropriate mask parameter
// (AWTEvent.MOUSE_EVENT_MASK or AWTEvent.MOUSE_MOTION_EVENT_MASK).
// If the mouse event type has not been enabled on the component, the
// corresponding mouse events are dispatched to the first ancestor that
// has enabled the mouse event type.
//
// For example, if a MouseListener has been added to a component, or
// enableEvents(AWTEvent.MOUSE_EVENT_MASK) has been invoked, then all
// the events defined by MouseListener are dispatched to the component.
// On the other hand, if a MouseMotionListener has not been added and
// enableEvents has not been invoked with
// AWTEvent.MOUSE_MOTION_EVENT_MASK, then mouse motion events are not
// dispatched to the component. Instead the mouse motion events are
// dispatched to the first ancestors that has enabled mouse motion
// events.
// 
// This low-level event is generated by a component object for:
// 
// Mouse Events
//     
//     a mouse button is pressed
//     a mouse button is released
//     a mouse button is clicked (pressed and released)
//     the mouse cursor enters the unobscured part of component's geometry
//     the mouse cursor exits the unobscured part of component's geometry
//     
//  Mouse Motion Events
//     
//     the mouse is moved
//     the mouse is dragged
//     
// 
// 
// A MouseEvent object is passed to every
// MouseListener
// or MouseAdapter object which is registered to receive
// the "interesting" mouse events using the component's
// addMouseListener method.
// (MouseAdapter objects implement the
// MouseListener interface.) Each such listener object
// gets a MouseEvent containing the mouse event.
// 
// A MouseEvent object is also passed to every
// MouseMotionListener or
// MouseMotionAdapter object which is registered to receive
// mouse motion events using the component's
// addMouseMotionListener
// method. (MouseMotionAdapter objects implement the
// MouseMotionListener interface.) Each such listener object
// gets a MouseEvent containing the mouse motion event.
// 
// When a mouse button is clicked, events are generated and sent to the
// registered MouseListeners.
// The state of modal keys can be retrieved using InputEvent.getModifiers()
// and InputEvent.getModifiersEx().
// The button mask returned by InputEvent.getModifiers() reflects
// only the button that changed state, not the current state of all buttons.
// (Note: Due to overlap in the values of ALT_MASK/BUTTON2_MASK and
// META_MASK/BUTTON3_MASK, this is not always true for mouse events involving
// modifier keys).
// To get the state of all buttons and modifier keys, use
// InputEvent.getModifiersEx().
// The button which has changed state is returned by getButton()
// 
// For example, if the first mouse button is pressed, events are sent in the
// following order:
// 
//    id              modifiers    button 
//    MOUSE_PRESSED:  BUTTON1_MASK BUTTON1
//    MOUSE_RELEASED: BUTTON1_MASK BUTTON1
//    MOUSE_CLICKED:  BUTTON1_MASK BUTTON1
// 
// When multiple mouse buttons are pressed, each press, release, and click
// results in a separate event.
// 
// For example, if the user presses button 1 followed by
// button 2, and then releases them in the same order,
// the following sequence of events is generated:
// 
//    id              modifiers    button 
//    MOUSE_PRESSED:  BUTTON1_MASK BUTTON1
//    MOUSE_PRESSED:  BUTTON2_MASK BUTTON2
//    MOUSE_RELEASED: BUTTON1_MASK BUTTON1
//    MOUSE_CLICKED:  BUTTON1_MASK BUTTON1
//    MOUSE_RELEASED: BUTTON2_MASK BUTTON2
//    MOUSE_CLICKED:  BUTTON2_MASK BUTTON2
// 
// If button 2 is released first, the
// MOUSE_RELEASED/MOUSE_CLICKED pair
// for BUTTON2_MASK arrives first,
// followed by the pair for BUTTON1_MASK.
// 
// Some extra mouse buttons are added to extend the standard set of buttons
// represented by the following constants:BUTTON1, BUTTON2, and BUTTON3.
// Extra buttons have no assigned BUTTONx
// constants as well as their button masks have no assigned BUTTONx_DOWN_MASK
// constants. Nevertheless, ordinal numbers starting from 4 may be
// used as button numbers (button ids). Values obtained by the
// getMaskForButton(button) method may be used
// as button masks.
// 
// MOUSE_DRAGGED events are delivered to the Component
// in which the mouse button was pressed until the mouse button is released
// (regardless of whether the mouse position is within the bounds of the
// Component).  Due to platform-dependent Drag&Drop implementations,
// MOUSE_DRAGGED events may not be delivered during a native
// Drag&Drop operation.
//
// In a multi-screen environment mouse drag events are delivered to the
// Component even if the mouse position is outside the bounds of the
// GraphicsConfiguration associated with that
// Component. However, the reported position for mouse drag events
// in this case may differ from the actual mouse position:
// 
// In a multi-screen environment without a virtual device:
// 
// The reported coordinates for mouse drag events are clipped to fit within the
// bounds of the GraphicsConfiguration associated with
// the Component.
// In a multi-screen environment with a virtual device:
// 
// The reported coordinates for mouse drag events are clipped to fit within the
// bounds of the virtual device associated with the Component.
// 
// 
// An unspecified behavior will be caused if the id parameter
// of any particular MouseEvent instance is not
// in the range from MOUSE_FIRST to MOUSE_LAST-1
// (MOUSE_WHEEL is not acceptable).
class MouseEvent extends InputEvent {

    @stub
    // Constructs a MouseEvent object with the
    // specified source component,
    // type, modifiers, coordinates, click count, and popupTrigger flag.
    def this(source: Component, id: Int, when: Long, modifiers: Int, x: Int, y: Int, clickCount: Int, popupTrigger: Boolean) = ???

    @stub
    // Constructs a MouseEvent object with the
    // specified source component,
    // type, time, modifiers, coordinates, click count, popupTrigger flag,
    // and button number.
    def this(source: Component, id: Int, when: Long, modifiers: Int, x: Int, y: Int, clickCount: Int, popupTrigger: Boolean, button: Int) = ???

    @stub
    // Returns which, if any, of the mouse buttons has changed state.
    def getButton(): Int = ???

    @stub
    // Returns the number of mouse clicks associated with this event.
    def getClickCount(): Int = ???

    @stub
    // Returns the absolute x, y position of the event.
    def getLocationOnScreen(): Point = ???

    @stub
    // Returns the extended modifier mask for this event.
    def getModifiersEx(): Int = ???

    @stub
    // Returns the x,y position of the event relative to the source component.
    def getPoint(): Point = ???

    @stub
    // Returns the horizontal x position of the event relative to the
    // source component.
    def getX(): Int = ???

    @stub
    // Returns the absolute horizontal x position of the event.
    def getXOnScreen(): Int = ???

    @stub
    // Returns the vertical y position of the event relative to the
    // source component.
    def getY(): Int = ???

    @stub
    // Returns the absolute vertical y position of the event.
    def getYOnScreen(): Int = ???

    @stub
    // Returns whether or not this mouse event is the popup menu
    // trigger event for the platform.
    def isPopupTrigger(): Boolean = ???

    @stub
    // Returns a parameter string identifying this event.
    def paramString(): String = ???
}

object MouseEvent {
    @stub
    // Indicates mouse button #1; used by getButton().
    def BUTTON1: Int = ???

    @stub
    // Indicates mouse button #2; used by getButton().
    def BUTTON2: Int = ???

    @stub
    // Indicates mouse button #3; used by getButton().
    def BUTTON3: Int = ???

    @stub
    // The "mouse clicked" event.
    def MOUSE_CLICKED: Int = ???

    @stub
    // The "mouse dragged" event.
    def MOUSE_DRAGGED: Int = ???

    @stub
    // The "mouse entered" event.
    def MOUSE_ENTERED: Int = ???

    @stub
    // The "mouse exited" event.
    def MOUSE_EXITED: Int = ???

    @stub
    // The first number in the range of ids used for mouse events.
    def MOUSE_FIRST: Int = ???

    @stub
    // The last number in the range of ids used for mouse events.
    def MOUSE_LAST: Int = ???

    @stub
    // The "mouse moved" event.
    def MOUSE_MOVED: Int = ???

    @stub
    // The "mouse pressed" event.
    def MOUSE_PRESSED: Int = ???

    @stub
    // The "mouse released" event.
    def MOUSE_RELEASED: Int = ???

    @stub
    // The "mouse wheel" event.
    def MOUSE_WHEEL: Int = ???

    @stub
    // Returns a String instance describing the modifier keys and
    // mouse buttons that were down during the event, such as "Shift",
    // or "Ctrl+Shift".
    def getMouseModifiersText(modifiers: Int): String = ???
}

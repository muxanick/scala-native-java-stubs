package javax.swing

import java.awt.event.{ActionEvent, ActionListener}
import java.io.Serializable
import java.lang.{Class, Object, String}
import java.util.EventListener

// Fires one or more ActionEvents at specified
// intervals. An example use is an animation object that uses a
// Timer as the trigger for drawing its frames.
//
// Setting up a timer
// involves creating a Timer object,
// registering one or more action listeners on it,
// and starting the timer using
// the start method.
// For example,
// the following code creates and starts a timer
// that fires an action event once per second
// (as specified by the first argument to the Timer constructor).
// The second argument to the Timer constructor
// specifies a listener to receive the timer's action events.
//
//
//  int delay = 1000; //milliseconds
//  ActionListener taskPerformer = new ActionListener() {
//      public void actionPerformed(ActionEvent evt) {
//          //...Perform a task...
//      }
//  };
//  new Timer(delay, taskPerformer).start();
//
// 
// Timers are constructed by specifying both a delay parameter
// and an ActionListener. The delay parameter is used
// to set both the initial delay and the delay between event
// firing, in milliseconds. Once the timer has been started,
// it waits for the initial delay before firing its
// first ActionEvent to registered listeners.
// After this first event, it continues to fire events
// every time the between-event delay has elapsed, until it
// is stopped.
// 
// After construction, the initial delay and the between-event
// delay can be changed independently, and additional
// ActionListeners may be added.
// 
// If you want the timer to fire only the first time and then stop,
// invoke setRepeats(false) on the timer.
// 
// Although all Timers perform their waiting
// using a single, shared thread
// (created by the first Timer object that executes),
// the action event handlers for Timers
// execute on another thread -- the event-dispatching thread.
// This means that the action handlers for Timers
// can safely perform operations on Swing components.
// However, it also means that the handlers must execute quickly
// to keep the GUI responsive.
//
// 
// In v 1.3, another Timer class was added
// to the Java platform: java.util.Timer.
// Both it and javax.swing.Timer
// provide the same basic functionality,
// but java.util.Timer
// is more general and has more features.
// The javax.swing.Timer has two features
// that can make it a little easier to use with GUIs.
// First, its event handling metaphor is familiar to GUI programmers
// and can make dealing with the event-dispatching thread
// a bit simpler.
// Second, its
// automatic thread sharing means that you don't have to
// take special steps to avoid spawning
// too many threads.
// Instead, your timer uses the same thread
// used to make cursors blink,
// tool tips appear,
// and so on.
//
// 
// You can find further documentation
// and several examples of using timers by visiting
// How to Use Timers,
// a section in The Java Tutorial.
// For more examples and help in choosing between
// this Timer class and
// java.util.Timer,
// see
// Using Timers in Swing Applications,
// an article in The Swing Connection.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class Timer extends Object with Serializable {

    @stub
    // Adds an action listener to the Timer.
    def addActionListener(listener: ActionListener): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireActionPerformed(e: ActionEvent): Unit = ???

    @stub
    // Returns the string that will be delivered as the action command
    // in ActionEvents fired by this timer.
    def getActionCommand(): String = ???

    @stub
    // Returns an array of all the action listeners registered
    // on this timer.
    def getActionListeners(): Array[ActionListener] = ???

    @stub
    // Returns the delay, in milliseconds,
    // between firings of action events.
    def getDelay(): Int = ???

    @stub
    // Returns the Timer's initial delay.
    def getInitialDelay(): Int = ???

    @stub
    // Returns an array of all the objects currently registered as
    // FooListeners
    // upon this Timer.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Returns true if the Timer coalesces
    // multiple pending action events.
    def isCoalesce(): Boolean = ???

    @stub
    // Returns true (the default)
    // if the Timer will send
    // an action event
    // to its listeners multiple times.
    def isRepeats(): Boolean = ???

    @stub
    // Returns true if the Timer is running.
    def isRunning(): Boolean = ???

    @stub
    // Removes the specified action listener from the Timer.
    def removeActionListener(listener: ActionListener): Unit = ???

    @stub
    // Restarts the Timer,
    // canceling any pending firings and causing
    // it to fire with its initial delay.
    def restart(): Unit = ???

    @stub
    // Sets the string that will be delivered as the action command
    // in ActionEvents fired by this timer.
    def setActionCommand(command: String): Unit = ???

    @stub
    // Sets whether the Timer coalesces multiple pending
    // ActionEvent firings.
    def setCoalesce(flag: Boolean): Unit = ???

    @stub
    // Sets the Timer's between-event delay, the number of milliseconds
    // between successive action events.
    def setDelay(delay: Int): Unit = ???

    @stub
    // Sets the Timer's initial delay, the time
    // in milliseconds to wait after the timer is started
    // before firing the first event.
    def setInitialDelay(initialDelay: Int): Unit = ???

    @stub
    // If flag is false,
    // instructs the Timer to send only one
    // action event to its listeners.
    def setRepeats(flag: Boolean): Unit = ???

    @stub
    // Starts the Timer,
    // causing it to start sending action events
    // to its listeners.
    def start(): Unit = ???
}

object Timer {
    @stub
    // Returns true if logging is enabled.
    def getLogTimers(): Boolean = ???

    @stub
    // Enables or disables the timer log.
    def setLogTimers(flag: Boolean): Unit = ???
}

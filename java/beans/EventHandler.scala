package java.beans

import java.lang.{Class, Object, String}
import java.lang.reflect.InvocationHandler

// The EventHandler class provides
// support for dynamically generating event listeners whose methods
// execute a simple statement involving an incoming event object
// and a target object.
// 
// The EventHandler class is intended to be used by interactive tools, such as
// application builders, that allow developers to make connections between
// beans. Typically connections are made from a user interface bean
// (the event source)
// to an application logic bean (the target). The most effective
// connections of this kind isolate the application logic from the user
// interface.  For example, the EventHandler for a
// connection from a JCheckBox to a method
// that accepts a boolean value can deal with extracting the state
// of the check box and passing it directly to the method so that
// the method is isolated from the user interface layer.
// 
// Inner classes are another, more general way to handle events from
// user interfaces.  The EventHandler class
// handles only a subset of what is possible using inner
// classes. However, EventHandler works better
// with the long-term persistence scheme than inner classes.
// Also, using EventHandler in large applications in
// which the same interface is implemented many times can
// reduce the disk and memory footprint of the application.
// 
// The reason that listeners created with EventHandler
// have such a small
// footprint is that the Proxy class, on which
// the EventHandler relies, shares implementations
// of identical
// interfaces. For example, if you use
// the EventHandler create methods to make
// all the ActionListeners in an application,
// all the action listeners will be instances of a single class
// (one created by the Proxy class).
// In general, listeners based on
// the Proxy class require one listener class
// to be created per listener type (interface),
// whereas the inner class
// approach requires one class to be created per listener
// (object that implements the interface).
//
// 
// You don't generally deal directly with EventHandler
// instances.
// Instead, you use one of the EventHandler
// create methods to create
// an object that implements a given listener interface.
// This listener object uses an EventHandler object
// behind the scenes to encapsulate information about the
// event, the object to be sent a message when the event occurs,
// the message (method) to be sent, and any argument
// to the method.
// The following section gives examples of how to create listener
// objects using the create methods.
//
// Examples of Using EventHandler
//
// The simplest use of EventHandler is to install
// a listener that calls a method on the target object with no arguments.
// In the following example we create an ActionListener
// that invokes the toFront method on an instance
// of javax.swing.JFrame.
//
// 
//
//myButton.addActionListener(
//    (ActionListener)EventHandler.create(ActionListener.class, frame, "toFront"));
//
// 
//
// When myButton is pressed, the statement
// frame.toFront() will be executed.  One could get
// the same effect, with some additional compile-time type safety,
// by defining a new implementation of the ActionListener
// interface and adding an instance of it to the button:
//
// 
//
////Equivalent code using an inner class instead of EventHandler.
//myButton.addActionListener(new ActionListener() {
//    public void actionPerformed(ActionEvent e) {
//        frame.toFront();
//    }
//});
//
// 
//
// The next simplest use of EventHandler is
// to extract a property value from the first argument
// of the method in the listener interface (typically an event object)
// and use it to set the value of a property in the target object.
// In the following example we create an ActionListener that
// sets the nextFocusableComponent property of the target
// (myButton) object to the value of the "source" property of the event.
//
// 
//
//EventHandler.create(ActionListener.class, myButton, "nextFocusableComponent", "source")
//
// 
//
// This would correspond to the following inner class implementation:
//
// 
//
////Equivalent code using an inner class instead of EventHandler.
//new ActionListener() {
//    public void actionPerformed(ActionEvent e) {
//        myButton.setNextFocusableComponent((Component)e.getSource());
//    }
//}
//
// 
//
// It's also possible to create an EventHandler that
// just passes the incoming event object to the target's action.
// If the fourth EventHandler.create argument is
// an empty string, then the event is just passed along:
//
// 
//
//EventHandler.create(ActionListener.class, target, "doActionEvent", "")
//
// 
//
// This would correspond to the following inner class implementation:
//
// 
//
////Equivalent code using an inner class instead of EventHandler.
//new ActionListener() {
//    public void actionPerformed(ActionEvent e) {
//        target.doActionEvent(e);
//    }
//}
//
// 
//
// Probably the most common use of EventHandler
// is to extract a property value from the
// source of the event object and set this value as
// the value of a property of the target object.
// In the following example we create an ActionListener that
// sets the "label" property of the target
// object to the value of the "text" property of the
// source (the value of the "source" property) of the event.
//
// 
//
//EventHandler.create(ActionListener.class, myButton, "label", "source.text")
//
// 
//
// This would correspond to the following inner class implementation:
//
// 
//
////Equivalent code using an inner class instead of EventHandler.
//new ActionListener {
//    public void actionPerformed(ActionEvent e) {
//        myButton.setLabel(((JTextField)e.getSource()).getText());
//    }
//}
//
// 
//
// The event property may be "qualified" with an arbitrary number
// of property prefixes delimited with the "." character. The "qualifying"
// names that appear before the "." characters are taken as the names of
// properties that should be applied, left-most first, to
// the event object.
// 
// For example, the following action listener
//
// 
//
//EventHandler.create(ActionListener.class, target, "a", "b.c.d")
//
// 
//
// might be written as the following inner class
// (assuming all the properties had canonical getter methods and
// returned the appropriate types):
//
// 
//
////Equivalent code using an inner class instead of EventHandler.
//new ActionListener {
//    public void actionPerformed(ActionEvent e) {
//        target.setA(e.getB().getC().isD());
//    }
//}
//
// 
// The target property may also be "qualified" with an arbitrary number
// of property prefixs delimited with the "." character.  For example, the
// following action listener:
// 
//   EventHandler.create(ActionListener.class, target, "a.b", "c.d")
// 
// might be written as the following inner class
// (assuming all the properties had canonical getter methods and
// returned the appropriate types):
// 
//   //Equivalent code using an inner class instead of EventHandler.
//   new ActionListener {
//     public void actionPerformed(ActionEvent e) {
//         target.getA().setB(e.getC().isD());
//    }
//}
//
// 
// As EventHandler ultimately relies on reflection to invoke
// a method we recommend against targeting an overloaded method.  For example,
// if the target is an instance of the class MyTarget which is
// defined as:
// 
//   public class MyTarget {
//     public void doIt(String);
//     public void doIt(Object);
//   }
// 
// Then the method doIt is overloaded.  EventHandler will invoke
// the method that is appropriate based on the source.  If the source is
// null, then either method is appropriate and the one that is invoked is
// undefined.  For that reason we recommend against targeting overloaded
// methods.
class EventHandler extends Object with InvocationHandler {

    @stub
    // Returns the name of the target's writable property
    // that this event handler will set,
    // or the name of the method that this event handler
    // will invoke on the target.
    def getAction(): String = ???

    @stub
    // Returns the property of the event that should be
    // used in the action applied to the target.
    def getEventPropertyName(): String = ???

    @stub
    // Returns the name of the method that will trigger the action.
    def getListenerMethodName(): String = ???

    @stub
    // Returns the object to which this event handler will send a message.
    def getTarget(): Object = ???
}

object EventHandler {
    @stub
    // Creates an implementation of listenerInterface in which
    // all of the methods in the listener interface apply
    // the handler's action to the target.
    def T: [T] = ???

    @stub
    // /**
    // Creates an implementation of listenerInterface in which
    // all of the methods pass the value of the event
    // expression, eventPropertyName, to the final method in the
    // statement, action, which is applied to the target.
    def T: [T] = ???

    @stub
    // Creates an implementation of listenerInterface in which
    // the method named listenerMethodName
    // passes the value of the event expression, eventPropertyName,
    // to the final method in the statement, action, which
    // is applied to the target.
    def T: [T] = ???
}

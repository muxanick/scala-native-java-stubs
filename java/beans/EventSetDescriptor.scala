package java.beans

import java.lang.{Class, Object, String}
import java.lang.reflect.Method

// An EventSetDescriptor describes a group of events that a given Java
// bean fires.
// 
// The given group of events are all delivered as method calls on a single
// event listener interface, and an event listener object can be registered
// via a call on a registration method supplied by the event source.
class EventSetDescriptor extends FeatureDescriptor {

    @stub
    // Creates an EventSetDescriptor assuming that you are
    // following the most simple standard design pattern where a named
    // event "fred" is (1) delivered as a call on the single method of
    // interface FredListener, (2) has a single argument of type FredEvent,
    // and (3) where the FredListener may be registered with a call on an
    // addFredListener method of the source component and removed with a
    // call on a removeFredListener method.
    def this(sourceClass: Class[_], eventSetName: String, listenerType: Class[_], listenerMethodName: String) = ???

    @stub
    // Creates an EventSetDescriptor from scratch using
    // string names.
    def this(sourceClass: Class[_], eventSetName: String, listenerType: Class[_], listenerMethodNames: Array[String], addListenerMethodName: String, removeListenerMethodName: String) = ???

    @stub
    // This constructor creates an EventSetDescriptor from scratch using
    // string names.
    def this(sourceClass: Class[_], eventSetName: String, listenerType: Class[_], listenerMethodNames: Array[String], addListenerMethodName: String, removeListenerMethodName: String, getListenerMethodName: String) = ???

    @stub
    // Creates an EventSetDescriptor from scratch using
    // java.lang.reflect.Method and java.lang.Class objects.
    def this(eventSetName: String, listenerType: Class[_], listenerMethods: Array[Method], addListenerMethod: Method, removeListenerMethod: Method) = ???

    @stub
    // This constructor creates an EventSetDescriptor from scratch using
    // java.lang.reflect.Method and java.lang.Class objects.
    def this(eventSetName: String, listenerType: Class[_], listenerMethods: Array[Method], addListenerMethod: Method, removeListenerMethod: Method, getListenerMethod: Method) = ???

    @stub
    // Gets the method used to add event listeners.
    def getAddListenerMethod(): Method = ???

    @stub
    // Gets the method used to access the registered event listeners.
    def getGetListenerMethod(): Method = ???

    @stub
    // Gets the MethodDescriptors of the target listener interface.
    def getListenerMethodDescriptors(): Array[MethodDescriptor] = ???

    @stub
    // Gets the methods of the target listener interface.
    def getListenerMethods(): Array[Method] = ???

    @stub
    // Gets the Class object for the target interface.
    def getListenerType(): Class[_] = ???

    @stub
    // Gets the method used to remove event listeners.
    def getRemoveListenerMethod(): Method = ???

    @stub
    // Reports if an event set is in the "default" set.
    def isInDefaultEventSet(): Boolean = ???

    @stub
    // Normally event sources are multicast.
    def isUnicast(): Boolean = ???

    @stub
    // Marks an event set as being in the "default" set (or not).
    def setInDefaultEventSet(inDefaultEventSet: Boolean): Unit = ???
}

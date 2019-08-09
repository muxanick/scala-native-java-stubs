package java.beans

import java.lang.{Class, Object, String}
import java.lang.reflect.Method
import scala.scalanative.annotation.stub

/** An EventSetDescriptor describes a group of events that a given Java
 *  bean fires.
 *  
 *  The given group of events are all delivered as method calls on a single
 *  event listener interface, and an event listener object can be registered
 *  via a call on a registration method supplied by the event source.
 */
class EventSetDescriptor extends FeatureDescriptor {

    /** Creates an EventSetDescriptor assuming that you are
     *  following the most simple standard design pattern where a named
     *  event "fred" is (1) delivered as a call on the single method of
     *  interface FredListener, (2) has a single argument of type FredEvent,
     *  and (3) where the FredListener may be registered with a call on an
     *  addFredListener method of the source component and removed with a
     *  call on a removeFredListener method.
     */
    @stub
    def this(sourceClass: Class[_], eventSetName: String, listenerType: Class[_], listenerMethodName: String) = ???

    /** Creates an EventSetDescriptor from scratch using
     *  string names.
     */
    @stub
    def this(sourceClass: Class[_], eventSetName: String, listenerType: Class[_], listenerMethodNames: Array[String], addListenerMethodName: String, removeListenerMethodName: String) = ???

    /** This constructor creates an EventSetDescriptor from scratch using
     *  string names.
     */
    @stub
    def this(sourceClass: Class[_], eventSetName: String, listenerType: Class[_], listenerMethodNames: Array[String], addListenerMethodName: String, removeListenerMethodName: String, getListenerMethodName: String) = ???

    /** Creates an EventSetDescriptor from scratch using
     *  java.lang.reflect.Method and java.lang.Class objects.
     */
    @stub
    def this(eventSetName: String, listenerType: Class[_], listenerMethods: Array[Method], addListenerMethod: Method, removeListenerMethod: Method) = ???

    /** This constructor creates an EventSetDescriptor from scratch using
     *  java.lang.reflect.Method and java.lang.Class objects.
     */
    @stub
    def this(eventSetName: String, listenerType: Class[_], listenerMethods: Array[Method], addListenerMethod: Method, removeListenerMethod: Method, getListenerMethod: Method) = ???

    /** Creates an EventSetDescriptor from scratch using
     *  java.lang.reflect.MethodDescriptor and java.lang.Class
     *   objects.
     */
    @stub
    def this(eventSetName: String, listenerType: Class[_], listenerMethodDescriptors: Array[MethodDescriptor], addListenerMethod: Method, removeListenerMethod: Method) = ???

    /** Gets the method used to add event listeners. */
    @stub
    def getAddListenerMethod(): Method = ???

    /** Gets the method used to access the registered event listeners. */
    @stub
    def getGetListenerMethod(): Method = ???

    /** Gets the MethodDescriptors of the target listener interface. */
    @stub
    def getListenerMethodDescriptors(): Array[MethodDescriptor] = ???

    /** Gets the methods of the target listener interface. */
    @stub
    def getListenerMethods(): Array[Method] = ???

    /** Gets the Class object for the target interface. */
    @stub
    def getListenerType(): Class[_] = ???

    /** Gets the method used to remove event listeners. */
    @stub
    def getRemoveListenerMethod(): Method = ???

    /** Reports if an event set is in the "default" set. */
    @stub
    def isInDefaultEventSet(): Boolean = ???

    /** Normally event sources are multicast. */
    @stub
    def isUnicast(): Boolean = ???

    /** Marks an event set as being in the "default" set (or not). */
    @stub
    def setInDefaultEventSet(inDefaultEventSet: Boolean): Unit = ???

    /** Mark an event set as unicast (or not). */
    @stub
    def setUnicast(unicast: Boolean): Unit = ???
}

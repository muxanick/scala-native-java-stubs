package java.lang

import scala.scalanative.annotation.stub

/** Class Object is the root of the class hierarchy.
 *  Every class has Object as a superclass. All objects,
 *  including arrays, implement the methods of this class.
 */
class Object {

    /**  */
    @stub
    def this() = ???

    /** Creates and returns a copy of this object. */
    @stub
    protected def clone(): Any = ???

    /** Indicates whether some other object is "equal to" this one. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Called by the garbage collector on an object when garbage collection
     *  determines that there are no more references to the object.
     */
    @stub
    protected def finalize(): Unit = ???

    /** Returns the runtime class of this Object. */
    @stub
    def getClass(): Class[_] = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???

    /** Wakes up a single thread that is waiting on this object's
     *  monitor.
     */
    @stub
    def notify(): Unit = ???

    /** Wakes up all threads that are waiting on this object's monitor. */
    @stub
    def notifyAll(): Unit = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???

    /** Causes the current thread to wait until another thread invokes the
     *  notify() method or the
     *  notifyAll() method for this object.
     */
    @stub
    def wait(): Unit = ???

    /** Causes the current thread to wait until either another thread invokes the
     *  notify() method or the
     *  notifyAll() method for this object, or a
     *  specified amount of time has elapsed.
     */
    @stub
    def wait(timeout: Long): Unit = ???

    /** Causes the current thread to wait until another thread invokes the
     *  notify() method or the
     *  notifyAll() method for this object, or
     *  some other thread interrupts the current thread, or a certain
     *  amount of real time has elapsed.
     */
    @stub
    def wait(timeout: Long, nanos: Int): Unit = ???
}

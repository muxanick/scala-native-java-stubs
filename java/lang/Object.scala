package java.lang

// Class Object is the root of the class hierarchy.
// Every class has Object as a superclass. All objects,
// including arrays, implement the methods of this class.
class Object {

    @stub
    // Creates and returns a copy of this object.
    protected def clone(): Object = ???

    @stub
    // Indicates whether some other object is "equal to" this one.
    def equals(obj: Object): Boolean = ???

    @stub
    // Called by the garbage collector on an object when garbage collection
    // determines that there are no more references to the object.
    protected def finalize(): Unit = ???

    @stub
    // Returns the runtime class of this Object.
    def getClass(): Class[_] = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???

    @stub
    // Wakes up a single thread that is waiting on this object's
    // monitor.
    def notify(): Unit = ???

    @stub
    // Wakes up all threads that are waiting on this object's monitor.
    def notifyAll(): Unit = ???

    @stub
    // Returns a string representation of the object.
    def toString(): String = ???

    @stub
    // Causes the current thread to wait until another thread invokes the
    // notify() method or the
    // notifyAll() method for this object.
    def wait(): Unit = ???

    @stub
    // Causes the current thread to wait until either another thread invokes the
    // notify() method or the
    // notifyAll() method for this object, or a
    // specified amount of time has elapsed.
    def wait(timeout: Long): Unit = ???
}

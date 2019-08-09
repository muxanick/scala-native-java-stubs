package java.lang

// Thrown to indicate that the clone method in class
// Object has been called to clone an object, but that
// the object's class does not implement the Cloneable
// interface.
// 
// Applications that override the clone method can also
// throw this exception to indicate that an object could not or
// should not be cloned.
class CloneNotSupportedException extends Exception {

    @stub
    // Constructs a CloneNotSupportedException with no
    // detail message.
    def this() = ???
}
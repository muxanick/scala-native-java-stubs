package java.lang

// Thrown if the Java Virtual Machine or a ClassLoader instance
// tries to load in the definition of a class (as part of a normal method call
// or as part of creating a new instance using the new expression)
// and no definition of the class could be found.
// 
// The searched-for class definition existed when the currently
// executing class was compiled, but the definition can no longer be
// found.
class NoClassDefFoundError extends LinkageError {

    @stub
    // Constructs a NoClassDefFoundError with no detail message.
    def this() = ???
}

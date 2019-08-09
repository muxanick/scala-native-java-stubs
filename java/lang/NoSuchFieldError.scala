package java.lang

/** Thrown if an application tries to access or modify a specified
 *  field of an object, and that object no longer has that field.
 *  
 *  Normally, this error is caught by the compiler; this error can
 *  only occur at run time if the definition of a class has
 *  incompatibly changed.
 */
class NoSuchFieldError extends IncompatibleClassChangeError {

    /** Constructs a NoSuchFieldError with no detail message. */
    @stub
    def this() = ???
}

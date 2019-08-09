package java.lang

/** Thrown to indicate that the code has attempted to cast an object
 *  to a subclass of which it is not an instance. For example, the
 *  following code generates a ClassCastException:
 *  
 *      Object x = new Integer(0);
 *      System.out.println((String)x);
 *  
 */
class ClassCastException extends RuntimeException {

    /** Constructs a ClassCastException with no detail message. */
    @stub
    def this() = ???
}

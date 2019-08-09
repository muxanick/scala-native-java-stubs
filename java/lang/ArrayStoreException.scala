package java.lang

// Thrown to indicate that an attempt has been made to store the
// wrong type of object into an array of objects. For example, the
// following code generates an ArrayStoreException:
// 
//     Object x[] = new String[3];
//     x[0] = new Integer(0);
// 
class ArrayStoreException extends RuntimeException {

    @stub
    // Constructs an ArrayStoreException with no detail message.
    def this() = ???
}

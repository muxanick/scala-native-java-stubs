package java.lang

import scala.scalanative.annotation.stub

/** Thrown when an application tries to access a type using a string
 *  representing the type's name, but no definition for the type with
 *  the specified name can be found.   This exception differs from
 *  ClassNotFoundException in that ClassNotFoundException is a
 *  checked exception, whereas this exception is unchecked.
 * 
 *  Note that this exception may be used when undefined type variables
 *  are accessed as well as when types (e.g., classes, interfaces or
 *  annotation types) are loaded.
 *  In particular, this exception can be thrown by the API used to read annotations
 *  reflectively.
 */
class TypeNotPresentException extends RuntimeException {

    /** Constructs a TypeNotPresentException for the named type
     *  with the specified cause.
     */
    @stub
    def this(typeName: String, cause: Throwable) = ???

    /** Returns the fully qualified name of the unavailable type. */
    @stub
    def typeName(): String = ???
}

package java.beans

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown when an exception happens during Introspection.
 *  
 *  Typical causes include not being able to map a string class name
 *  to a Class object, not being able to resolve a string method name,
 *  or specifying a method name that has the wrong type signature for
 *  its intended use.
 */
class IntrospectionException extends Exception {

    /** Constructs an IntrospectionException with a
     *  detailed message.
     */
    @stub
    def this(mess: String) = ???
}

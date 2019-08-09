package java.beans

import java.lang.{Exception, Object, Throwable}

/** Thrown when an exception happens during Introspection.
 *  
 *  Typical causes include not being able to map a string class name
 *  to a Class object, not being able to resolve a string method name,
 *  or specifying a method name that has the wrong type signature for
 *  its intended use.
 */
class IntrospectionException extends Exception {
}

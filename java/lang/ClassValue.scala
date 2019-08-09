package java.lang

/** Lazily associate a computed value with (potentially) every type.
 *  For example, if a dynamic language needs to construct a message dispatch
 *  table for each class encountered at a message send call site,
 *  it can use a ClassValue to cache information needed to
 *  perform the message send quickly, for each class encountered.
 */
abstract class ClassValue[T] extends Object {

    /** Computes the given class's derived value for this ClassValue. */
    protected def computeValue(type: Class[_]): T

    /** Returns the value for the given class. */
    def get(type: Class[_]): T
}

package java.security

// A computation to be performed with privileges enabled, that throws one or
// more checked exceptions.  The computation is performed by invoking
// AccessController.doPrivileged on the
// PrivilegedExceptionAction object.  This interface is
// used only for computations that throw checked exceptions;
// computations that do not throw
// checked exceptions should use PrivilegedAction instead.
trait PrivilegedExceptionAction[T] {
}

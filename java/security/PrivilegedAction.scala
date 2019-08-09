package java.security

// A computation to be performed with privileges enabled.  The computation is
// performed by invoking AccessController.doPrivileged on the
// PrivilegedAction object.  This interface is used only for
// computations that do not throw checked exceptions; computations that
// throw checked exceptions must use PrivilegedExceptionAction
// instead.
trait PrivilegedAction[T] {
}

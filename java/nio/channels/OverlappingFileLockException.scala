package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

// Unchecked exception thrown when an attempt is made to acquire a lock on a
// region of a file that overlaps a region already locked by the same Java
// virtual machine, or when another thread is already waiting to lock an
// overlapping region of the same file.
class OverlappingFileLockException extends IllegalStateException {
}

package java.io

import java.lang.AutoCloseable

/** A Closeable is a source or destination of data that can be closed.
 *  The close method is invoked to release resources that the object is
 *  holding (such as open files).
 */
trait Closeable extends AutoCloseable {
}

package java.io

import java.lang.AutoCloseable
import scala.scalanative.annotation.stub

/** A Closeable is a source or destination of data that can be closed.
 *  The close method is invoked to release resources that the object is
 *  holding (such as open files).
 */
trait Closeable extends AutoCloseable {

    /** Closes this stream and releases any system resources associated
     *  with it.
     */
    @stub
    def close(): Unit = ???
}

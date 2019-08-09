package java.io

import scala.scalanative.annotation.stub

/** A Flushable is a destination of data that can be flushed.  The
 *  flush method is invoked to write any buffered output to the underlying
 *  stream.
 */
trait Flushable {

    /** Flushes this stream by writing any buffered output to the underlying
     *  stream.
     */
    @stub
    def flush(): Unit = ???
}

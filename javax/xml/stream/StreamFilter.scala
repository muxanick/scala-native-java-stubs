package javax.xml.stream

import scala.scalanative.annotation.stub

/** This interface declares a simple filter interface that one can
 *  create to filter XMLStreamReaders
 */
trait StreamFilter {

    /** Tests whether the current state is part of this stream. */
    @stub
    def accept(reader: XMLStreamReader): Boolean = ???
}

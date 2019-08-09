package javax.sql.rowset.spi

import java.io.Writer
import javax.sql.RowSetWriter
import javax.sql.rowset.WebRowSet
import scala.scalanative.annotation.stub

/** A specialized interface that facilitates an extension of the
 *  SyncProvider abstract class for XML orientated
 *  synchronization providers.
 *  
 *  SyncProvider  implementations that supply XML data writer
 *  capabilities such as output XML stream capabilities can implement this
 *  interface to provide standard XmlWriter objects to
 *  WebRowSet implementations.
 *  
 *  Writing a WebRowSet object includes printing the
 *  rowset's data, metadata, and properties, all with the
 *  appropriate XML tags.
 */
trait XmlWriter extends RowSetWriter {

    /** Writes the given WebRowSet object to the specified
     *  java.io.Writer output stream as an XML document.
     */
    @stub
    def writeXML(caller: WebRowSet, writer: Writer): Unit = ???
}

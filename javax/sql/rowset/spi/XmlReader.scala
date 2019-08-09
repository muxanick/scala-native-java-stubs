package javax.sql.rowset.spi

import java.io.Reader
import javax.sql.RowSetReader
import javax.sql.rowset.WebRowSet
import scala.scalanative.annotation.stub

/** A specialized interface that facilitates an extension of the
 *  SyncProvider abstract class for XML orientated
 *  synchronization providers.
 *  
 *  SyncProvider  implementations that supply XML data reader
 *  capabilities such as output XML stream capabilities can implement this
 *  interface to provide standard XmlReader objects to
 *  WebRowSet implementations.
 *  
 *  An XmlReader object is registered as the
 *  XML reader for a WebRowSet by being assigned to the
 *  rowset's xmlReader field. When the WebRowSet
 *  object's readXml method is invoked, it in turn invokes
 *  its XML reader's readXML method.
 */
trait XmlReader extends RowSetReader {

    /** Reads and parses the given WebRowSet object from the given
     *  input stream in XML format.
     */
    @stub
    def readXML(caller: WebRowSet, reader: Reader): Unit = ???
}

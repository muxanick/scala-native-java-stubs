package javax.sql.rowset.spi

import javax.sql.RowSetWriter

// A specialized interface that facilitates an extension of the
// SyncProvider abstract class for XML orientated
// synchronization providers.
// 
// SyncProvider  implementations that supply XML data writer
// capabilities such as output XML stream capabilities can implement this
// interface to provide standard XmlWriter objects to
// WebRowSet implementations.
// 
// Writing a WebRowSet object includes printing the
// rowset's data, metadata, and properties, all with the
// appropriate XML tags.
trait XmlWriter extends RowSetWriter {
}

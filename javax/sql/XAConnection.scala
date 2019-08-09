package javax.sql

// An object that provides support for distributed
// transactions.  An XAConnection object  may be enlisted
// in a distributed transaction by means of an XAResource object.
// A transaction manager, usually part of a middle tier server, manages an
// XAConnection object through the XAResource object.
// 
// An application programmer does not use this interface directly; rather,
// it is used by a transaction manager working in the middle tier server.
trait XAConnection extends PooledConnection {
}

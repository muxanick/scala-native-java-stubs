package java.security.cert

import java.lang.Cloneable

// A specification of CertStore parameters.
// 
// The purpose of this interface is to group (and provide type safety for)
// all CertStore parameter specifications. All
// CertStore parameter specifications must implement this
// interface.
// 
// Typically, a CertStoreParameters object is passed as a parameter
// to one of the CertStore.getInstance methods.
// The getInstance method returns a CertStore that
// is used for retrieving Certificates and CRLs. The
// CertStore that is returned is initialized with the specified
// parameters. The type of parameters needed may vary between different types
// of CertStores.
trait CertStoreParameters extends Cloneable {
}

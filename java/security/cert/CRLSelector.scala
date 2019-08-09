package java.security.cert

import java.lang.{Cloneable, Object}

// A selector that defines a set of criteria for selecting CRLs.
// Classes that implement this interface are often used to specify
// which CRLs should be retrieved from a CertStore.
// 
// Concurrent Access
// 
// Unless otherwise specified, the methods defined in this interface are not
// thread-safe. Multiple threads that need to access a single
// object concurrently should synchronize amongst themselves and
// provide the necessary locking. Multiple threads each manipulating
// separate objects need not synchronize.
trait CRLSelector extends Cloneable {

    @stub
    // Makes a copy of this CRLSelector.
    def clone(): Object = ???
}

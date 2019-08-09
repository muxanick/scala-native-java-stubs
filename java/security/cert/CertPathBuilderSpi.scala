package java.security.cert

import java.lang.Object

// The Service Provider Interface (SPI)
// for the CertPathBuilder class. All
// CertPathBuilder implementations must include a class (the
// SPI class) that extends this class (CertPathBuilderSpi) and
// implements all of its methods. In general, instances of this class should
// only be accessed through the CertPathBuilder class. For
// details, see the Java Cryptography Architecture.
// 
// Concurrent Access
// 
// Instances of this class need not be protected against concurrent
// access from multiple threads. Threads that need to access a single
// CertPathBuilderSpi instance concurrently should synchronize
// amongst themselves and provide the necessary locking before calling the
// wrapping CertPathBuilder object.
// 
// However, implementations of CertPathBuilderSpi may still
// encounter concurrency issues, since multiple threads each
// manipulating a different CertPathBuilderSpi instance need not
// synchronize.
abstract class CertPathBuilderSpi extends Object {

    // Attempts to build a certification path using the specified
    // algorithm parameter set.
    def engineBuild(params: CertPathParameters): CertPathBuilderResult
}

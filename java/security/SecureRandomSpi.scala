package java.security

import java.io.Serializable
import java.lang.Object

// This class defines the Service Provider Interface (SPI)
// for the SecureRandom class.
// All the abstract methods in this class must be implemented by each
// service provider who wishes to supply the implementation
// of a cryptographically strong pseudo-random number generator.
abstract class SecureRandomSpi extends Object with Serializable {

    // Returns the given number of seed bytes.
    protected def engineGenerateSeed(numBytes: Int): Array[Byte]

    // Generates a user-specified number of random bytes.
    protected def engineNextBytes(bytes: Array[Byte]): Unit
}

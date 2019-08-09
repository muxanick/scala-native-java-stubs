package javax.crypto

import java.lang.{Class, Object}
import java.security.spec.KeySpec

// This class defines the Service Provider Interface (SPI)
// for the SecretKeyFactory class.
// All the abstract methods in this class must be implemented by each
// cryptographic service provider who wishes to supply the implementation
// of a secret-key factory for a particular algorithm.
//
//  A provider should document all the key specifications supported by its
// secret key factory.
// For example, the DES secret-key factory supplied by the "SunJCE" provider
// supports DESKeySpec as a transparent representation of DES
// keys, and that provider's secret-key factory for Triple DES keys supports
// DESedeKeySpec as a transparent representation of Triple DES
// keys.
abstract class SecretKeyFactorySpi extends Object {

    // Generates a SecretKey object from the
    // provided key specification (key material).
    protected def engineGenerateSecret(keySpec: KeySpec): SecretKey

    // Returns a specification (key material) of the given key
    // object in the requested format.
    protected def engineGetKeySpec(key: SecretKey, keySpec: Class[_]): KeySpec
}

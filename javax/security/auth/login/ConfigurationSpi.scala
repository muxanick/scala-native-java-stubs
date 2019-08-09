package javax.security.auth.login

import java.lang.{Object, String}

// This class defines the Service Provider Interface (SPI)
// for the Configuration class.
// All the abstract methods in this class must be implemented by each
// service provider who wishes to supply a Configuration implementation.
//
//  Subclass implementations of this abstract class must provide
// a public constructor that takes a Configuration.Parameters
// object as an input parameter.  This constructor also must throw
// an IllegalArgumentException if it does not understand the
// Configuration.Parameters input.
abstract class ConfigurationSpi extends Object {

    // Retrieve the AppConfigurationEntries for the specified name.
    protected def engineGetAppConfigurationEntry(name: String): Array[AppConfigurationEntry]
}

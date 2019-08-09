package java.sql

import java.lang.{Object, String}

// Driver properties for making a connection. The
// DriverPropertyInfo class is of interest only to advanced programmers
// who need to interact with a Driver via the method
// getDriverProperties to discover
// and supply properties for connections.
class DriverPropertyInfo extends Object {

    @stub
    // An array of possible values if the value for the field
    // DriverPropertyInfo.value may be selected
    // from a particular set of values; otherwise null.
    def choices: Array[String] = ???

    @stub
    // A brief description of the property, which may be null.
    def description: String = ???

    @stub
    // The name of the property.
    def name: String = ???

    @stub
    // The required field is true if a value must be
    // supplied for this property
    // during Driver.connect and false otherwise.
    def required: Boolean = ???
}

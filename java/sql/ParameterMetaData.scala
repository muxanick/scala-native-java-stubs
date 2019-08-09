package java.sql

import java.lang.String

// An object that can be used to get information about the types
// and properties for each parameter marker in a
// PreparedStatement object. For some queries and driver
// implementations, the data that would be returned by a ParameterMetaData
// object may not be available until the PreparedStatement has
// been executed.
//
//Some driver implementations may not be able to provide information about the
//types and properties for each parameter marker in a CallableStatement
//object.
trait ParameterMetaData extends Wrapper {

    @stub
    // Retrieves the fully-qualified name of the Java class whose instances
    // should be passed to the method PreparedStatement.setObject.
    def getParameterClassName(param: Int): String = ???

    @stub
    // Retrieves the number of parameters in the PreparedStatement
    // object for which this ParameterMetaData object contains
    // information.
    def getParameterCount(): Int = ???

    @stub
    // Retrieves the designated parameter's mode.
    def getParameterMode(param: Int): Int = ???

    @stub
    // Retrieves the designated parameter's SQL type.
    def getParameterType(param: Int): Int = ???

    @stub
    // Retrieves the designated parameter's database-specific type name.
    def getParameterTypeName(param: Int): String = ???

    @stub
    // Retrieves the designated parameter's specified column size.
    def getPrecision(param: Int): Int = ???

    @stub
    // Retrieves the designated parameter's number of digits to right of the decimal point.
    def getScale(param: Int): Int = ???

    @stub
    // Retrieves whether null values are allowed in the designated parameter.
    def isNullable(param: Int): Int = ???
}

object ParameterMetaData {
    @stub
    // The constant indicating that the parameter's mode is IN.
    def parameterModeIn: Int = ???

    @stub
    // The constant indicating that the parameter's mode is INOUT.
    def parameterModeInOut: Int = ???

    @stub
    // The constant indicating that the parameter's mode is  OUT.
    def parameterModeOut: Int = ???

    @stub
    // The constant indicating that the mode of the parameter is unknown.
    def parameterModeUnknown: Int = ???

    @stub
    // The constant indicating that a
    // parameter will not allow NULL values.
    def parameterNoNulls: Int = ???

    @stub
    // The constant indicating that a
    // parameter will allow NULL values.
    def parameterNullable: Int = ???
}

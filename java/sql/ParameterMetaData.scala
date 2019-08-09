package java.sql

import java.lang.String

/** An object that can be used to get information about the types
 *  and properties for each parameter marker in a
 *  PreparedStatement object. For some queries and driver
 *  implementations, the data that would be returned by a ParameterMetaData
 *  object may not be available until the PreparedStatement has
 *  been executed.
 * 
 * Some driver implementations may not be able to provide information about the
 * types and properties for each parameter marker in a CallableStatement
 * object.
 */
trait ParameterMetaData extends Wrapper {

    /** Retrieves the fully-qualified name of the Java class whose instances
     *  should be passed to the method PreparedStatement.setObject.
     */
    @stub
    def getParameterClassName(param: Int): String = ???

    /** Retrieves the number of parameters in the PreparedStatement
     *  object for which this ParameterMetaData object contains
     *  information.
     */
    @stub
    def getParameterCount(): Int = ???

    /** Retrieves the designated parameter's mode. */
    @stub
    def getParameterMode(param: Int): Int = ???

    /** Retrieves the designated parameter's SQL type. */
    @stub
    def getParameterType(param: Int): Int = ???

    /** Retrieves the designated parameter's database-specific type name. */
    @stub
    def getParameterTypeName(param: Int): String = ???

    /** Retrieves the designated parameter's specified column size. */
    @stub
    def getPrecision(param: Int): Int = ???

    /** Retrieves the designated parameter's number of digits to right of the decimal point. */
    @stub
    def getScale(param: Int): Int = ???

    /** Retrieves whether null values are allowed in the designated parameter. */
    @stub
    def isNullable(param: Int): Int = ???
}

object ParameterMetaData {
    /** The constant indicating that the parameter's mode is IN. */
    @stub
    val parameterModeIn: Int = ???

    /** The constant indicating that the parameter's mode is INOUT. */
    @stub
    val parameterModeInOut: Int = ???

    /** The constant indicating that the parameter's mode is  OUT. */
    @stub
    val parameterModeOut: Int = ???

    /** The constant indicating that the mode of the parameter is unknown. */
    @stub
    val parameterModeUnknown: Int = ???

    /** The constant indicating that a
     *  parameter will not allow NULL values.
     */
    @stub
    val parameterNoNulls: Int = ???

    /** The constant indicating that a
     *  parameter will allow NULL values.
     */
    @stub
    val parameterNullable: Int = ???
}

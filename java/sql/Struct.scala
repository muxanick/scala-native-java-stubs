package java.sql

import java.lang.{Class, Object, String}
import java.util.Map

// The standard mapping in the Java programming language for an SQL
// structured type. A Struct object contains a
// value for each attribute of the SQL structured type that
// it represents.
// By default, an instance ofStruct is valid as long as the
// application has a reference to it.
// 
// All methods on the Struct interface must be fully implemented if the
// JDBC driver supports the data type.
trait Struct {

    @stub
    // Produces the ordered values of the attributes of the SQL
    // structured type that this Struct object represents.
    def getAttributes(): Array[Object] = ???

    @stub
    // Produces the ordered values of the attributes of the SQL
    // structured type that this Struct object represents.
    def getAttributes(map: Map[String, Class[_]]): Array[Object] = ???
}
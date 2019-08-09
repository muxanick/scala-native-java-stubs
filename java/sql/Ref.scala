package java.sql

import java.lang.{Class, Object, String}
import java.util.Map

// The mapping in the Java programming language of an SQL REF
// value, which is a reference to an SQL structured type value in the database.
// 
// SQL REF values are stored in a table that contains
// instances of a referenceable SQL structured type, and each REF
// value is a unique identifier for one instance in that table.
// An SQL REF value may be used in place of the
// SQL structured type it references, either as a column value in a
// table or an attribute value in a structured type.
// 
// Because an SQL REF value is a logical pointer to an
// SQL structured type, a Ref object is by default also a logical
// pointer. Thus, retrieving an SQL REF value as
// a Ref object does not materialize
// the attributes of the structured type on the client.
// 
// A Ref object can be stored in the database using the
// PreparedStatement.setRef method.
// 
// All methods on the Ref interface must be fully implemented if the
// JDBC driver supports the data type.
trait Ref {

    @stub
    // Retrieves the fully-qualified SQL name of the SQL structured type that
    // this Ref object references.
    def getBaseTypeName(): String = ???

    @stub
    // Retrieves the SQL structured type instance referenced by
    // this Ref object.
    def getObject(): Object = ???

    @stub
    // Retrieves the referenced object and maps it to a Java type
    // using the given type map.
    def getObject(map: Map[String, Class[_]]): Object = ???
}
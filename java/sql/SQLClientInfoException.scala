package java.sql

import java.lang.{Exception, Object, String, Throwable}
import java.util.Map

// The subclass of SQLException is thrown when one or more client info properties
// could not be set on a Connection.  In addition to the information provided
// by SQLException, a SQLClientInfoException provides a list of client info
// properties that were not set.
//
// Some databases do not allow multiple client info properties to be set
// atomically.  For those databases, it is possible that some of the client
// info properties had been set even though the Connection.setClientInfo
// method threw an exception.  An application can use the getFailedProperties 
// method to retrieve a list of client info properties that were not set.  The
// properties are identified by passing a
// Map<String,ClientInfoStatus> to
// the appropriate SQLClientInfoException constructor.
// 
class SQLClientInfoException extends SQLException {

    @stub
    // Constructs a SQLClientInfoException  Object.
    def this() = ???

    @stub
    // Constructs a SQLClientInfoException object initialized with a
    // given failedProperties.
    def this(failedProperties: Map[String, ClientInfoStatus]) = ???

    @stub
    // Constructs a SQLClientInfoException object initialized with
    // a given cause and failedProperties.
    def this(failedProperties: Map[String, ClientInfoStatus], cause: Throwable) = ???

    @stub
    // Constructs a SQLClientInfoException object initialized with a
    // given reason and failedProperties.
    def this(reason: String, failedProperties: Map[String, ClientInfoStatus]) = ???

    @stub
    // Constructs a SQLClientInfoException object initialized with a
    // given reason, cause and
    // failedProperties.
    def this(reason: String, failedProperties: Map[String, ClientInfoStatus], cause: Throwable) = ???

    @stub
    // Constructs a SQLClientInfoException object initialized with a
    // given  reason, SQLState,
    // vendorCode  and failedProperties.
    def this(reason: String, SQLState: String, vendorCode: Int, failedProperties: Map[String, ClientInfoStatus]) = ???

    @stub
    // Constructs a SQLClientInfoException object initialized with a
    // given  reason, SQLState,
    // cause, vendorCode and
    // failedProperties.
    def this(reason: String, SQLState: String, vendorCode: Int, failedProperties: Map[String, ClientInfoStatus], cause: Throwable) = ???

    @stub
    // Constructs a SQLClientInfoException object initialized with a
    // given  reason, SQLState  and
    // failedProperties.
    def this(reason: String, SQLState: String, failedProperties: Map[String, ClientInfoStatus]) = ???
}
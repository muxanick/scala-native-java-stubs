package javax.naming

import java.lang.{Exception, Object, Throwable}

/** This exception is thrown when a method
 *  terminates abnormally due to a user or system specified limit.
 *  This is different from a InsufficientResourceException in that
 *  LimitExceededException is due to a user/system specified limit.
 *  For example, running out of memory to complete the request would
 *  be an insufficient resource. The client asking for 10 answers and
 *  getting back 11 is a size limit exception.
 * 
 *  Examples of these limits include client and server configuration
 *  limits such as size, time, number of hops, etc.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class LimitExceededException extends NamingException {

    /** Constructs a new instance of LimitExceededException with
     *  all name resolution fields and explanation initialized to null.
     */
    @stub
    def this() = ???
}

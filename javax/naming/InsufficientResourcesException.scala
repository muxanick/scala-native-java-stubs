package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown when resources are not available to complete
 *  the requested operation. This might due to a lack of resources on
 *  the server or on the client. There are no restrictions to resource types,
 *  as different services might make use of different resources. Such
 *  restrictions might be due to physical limits and/or administrative quotas.
 *  Examples of limited resources are internal buffers, memory, network bandwidth.
 * 
 *  InsufficientResourcesException is different from LimitExceededException in that
 *  the latter is due to user/system specified limits. See LimitExceededException
 *  for details.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class InsufficientResourcesException extends NamingException {

    /** Constructs a new instance of InsufficientResourcesException with
     *  all name resolution fields and explanation initialized to null.
     */
    @stub
    def this() = ???

    /** Constructs a new instance of InsufficientResourcesException using an
     *  explanation.
     */
    @stub
    def this(explanation: String) = ???
}

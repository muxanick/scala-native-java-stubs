package javax.xml.stream

import java.lang.{Error, Exception, Object, String, Throwable}

/** An error class for reporting factory configuration errors. */
class FactoryConfigurationError extends Error {

    /** Default constructor */
    @stub
    def this() = ???

    /** Construct an exception with a nested inner exception */
    @stub
    def this(e: Exception) = ???

    /** Construct an exception with a nested inner exception
     *  and a message
     */
    @stub
    def this(e: Exception, msg: String) = ???

    /** Construct an exception with associated message */
    @stub
    def this(msg: String) = ???

    /** use the exception chaining mechanism of JDK1.4 */
    @stub
    def getCause(): Throwable = ???

    /** Return the nested exception (if any) */
    @stub
    def getException(): Exception = ???
}

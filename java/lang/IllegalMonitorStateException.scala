package java.lang

/** Thrown to indicate that a thread has attempted to wait on an
 *  object's monitor or to notify other threads waiting on an object's
 *  monitor without owning the specified monitor.
 */
class IllegalMonitorStateException extends RuntimeException {

    /** Constructs an IllegalMonitorStateException with no
     *  detail message.
     */
    @stub
    def this() = ???
}

package javax.xml.ws.handler

/** The Handler interface
 *   is the base interface for JAX-WS handlers.
 */
trait Handler[C <: MessageContext] {

    /** Called at the conclusion of a message exchange pattern just prior to
     *  the JAX-WS runtime dispatching a message, fault or exception.
     */
    @stub
    def close(context: MessageContext): Unit = ???

    /** The handleFault method is invoked for fault message
     *   processing.
     */
    @stub
    def handleFault(context: C): Boolean = ???
}

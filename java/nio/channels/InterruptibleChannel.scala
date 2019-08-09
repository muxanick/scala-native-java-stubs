package java.nio.channels

/** A channel that can be asynchronously closed and interrupted.
 * 
 *   A channel that implements this interface is asynchronously
 *  closeable: If a thread is blocked in an I/O operation on an
 *  interruptible channel then another thread may invoke the channel's close method.  This will cause the blocked thread to receive an
 *  AsynchronousCloseException.
 * 
 *   A channel that implements this interface is also interruptible:
 *  If a thread is blocked in an I/O operation on an interruptible channel then
 *  another thread may invoke the blocked thread's interrupt method.  This will cause the channel to be closed, the blocked
 *  thread to receive a ClosedByInterruptException, and the blocked
 *  thread's interrupt status to be set.
 * 
 *   If a thread's interrupt status is already set and it invokes a blocking
 *  I/O operation upon a channel then the channel will be closed and the thread
 *  will immediately receive a ClosedByInterruptException; its interrupt
 *  status will remain set.
 * 
 *   A channel supports asynchronous closing and interruption if, and only
 *  if, it implements this interface.  This can be tested at runtime, if
 *  necessary, via the instanceof operator.
 */
trait InterruptibleChannel extends Channel {
}

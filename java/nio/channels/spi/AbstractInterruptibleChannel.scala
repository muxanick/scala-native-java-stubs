package java.nio.channels.spi

import java.lang.Object
import java.nio.channels.{Channel, InterruptibleChannel}

// Base implementation class for interruptible channels.
//
//  This class encapsulates the low-level machinery required to implement
// the asynchronous closing and interruption of channels.  A concrete channel
// class must invoke the begin and end methods
// before and after, respectively, invoking an I/O operation that might block
// indefinitely.  In order to ensure that the end method is always
// invoked, these methods should be used within a
// try ... finally block:
//
// 
// boolean completed = false;
// try {
//     begin();
//     completed = ...;    // Perform blocking I/O operation
//     return ...;         // Return result
// } finally {
//     end(completed);
// }
//
//  The completed argument to the end method tells
// whether or not the I/O operation actually completed, that is, whether it had
// any effect that would be visible to the invoker.  In the case of an
// operation that reads bytes, for example, this argument should be
// true if, and only if, some bytes were actually transferred into the
// invoker's target buffer.
//
//  A concrete channel class must also implement the implCloseChannel method in such a way that if it is
// invoked while another thread is blocked in a native I/O operation upon the
// channel then that operation will immediately return, either by throwing an
// exception or by returning normally.  If a thread is interrupted or the
// channel upon which it is blocked is asynchronously closed then the channel's
// end method will throw the appropriate exception.
//
//  This class performs the synchronization required to implement the Channel specification.  Implementations of the implCloseChannel method need not synchronize against
// other threads that might be attempting to close the channel.  
abstract class AbstractInterruptibleChannel extends Object with Channel, with InterruptibleChannel {

    // Marks the beginning of an I/O operation that might block indefinitely.
    protected def begin(): Unit

    // Closes this channel.
    def close(): Unit

    // Marks the end of an I/O operation that might block indefinitely.
    protected def end(completed: Boolean): Unit

    // Closes this channel.
    protected def implCloseChannel(): Unit
}

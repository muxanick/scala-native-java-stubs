package java.nio.channels

import java.lang.Object
import java.nio.channels.spi.AsynchronousChannelProvider
import java.util.concurrent.{ExecutorService, ThreadFactory, TimeUnit}

// A grouping of asynchronous channels for the purpose of resource sharing.
//
//  An asynchronous channel group encapsulates the mechanics required to
// handle the completion of I/O operations initiated by asynchronous channels that are bound to the group. A group has an associated
// thread pool to which tasks are submitted to handle I/O events and dispatch to
// completion-handlers that consume the result of
// asynchronous operations performed on channels in the group. In addition to
// handling I/O events, the pooled threads may also execute other tasks required
// to support the execution of asynchronous I/O operations.
//
//  An asynchronous channel group is created by invoking the withFixedThreadPool or withCachedThreadPool methods defined here. Channels are bound to a group by
// specifying the group when constructing the channel. The associated thread
// pool is owned by the group; termination of the group results in the
// shutdown of the associated thread pool.
//
//  In addition to groups created explicitly, the Java virtual machine
// maintains a system-wide default group that is constructed
// automatically. Asynchronous channels that do not specify a group at
// construction time are bound to the default group. The default group has an
// associated thread pool that creates new threads as needed. The default group
// may be configured by means of system properties defined in the table below.
// Where the ThreadFactory for the
// default group is not configured then the pooled threads of the default group
// are daemon threads.
//
// 
//   
//     System property
//     Description
//   
//   
//      java.nio.channels.DefaultThreadPool.threadFactory 
//      The value of this property is taken to be the fully-qualified name
//     of a concrete ThreadFactory
//     class. The class is loaded using the system class loader and instantiated.
//     The factory's newThread method is invoked to create each thread for the default
//     group's thread pool. If the process to load and instantiate the value
//     of the property fails then an unspecified error is thrown during the
//     construction of the default group. 
//   
//   
//      java.nio.channels.DefaultThreadPool.initialSize 
//      The value of the initialSize parameter for the default
//     group (see withCachedThreadPool).
//     The value of the property is taken to be the String
//     representation of an Integer that is the initial size parameter.
//     If the value cannot be parsed as an Integer it causes an
//     unspecified error to be thrown during the construction of the default
//     group. 
//   
// 
//
// Threading
//
//  The completion handler for an I/O operation initiated on a channel bound
// to a group is guaranteed to be invoked by one of the pooled threads in the
// group. This ensures that the completion handler is run by a thread with the
// expected identity.
//
//  Where an I/O operation completes immediately, and the initiating thread
// is one of the pooled threads in the group then the completion handler may
// be invoked directly by the initiating thread. To avoid stack overflow, an
// implementation may impose a limit as to the number of activations on the
// thread stack. Some I/O operations may prohibit invoking the completion
// handler directly by the initiating thread (see accept).
//
// Shutdown and Termination
//
//  The shutdown method is used to initiate an orderly
// shutdown of a group. An orderly shutdown marks the group as shutdown;
// further attempts to construct a channel that binds to the group will throw
// ShutdownChannelGroupException. Whether or not a group is shutdown can
// be tested using the isShutdown method. Once shutdown,
// the group terminates when all asynchronous channels that are bound to
// the group are closed, all actively executing completion handlers have run to
// completion, and resources used by the group are released. No attempt is made
// to stop or interrupt threads that are executing completion handlers. The
// isTerminated method is used to test if the group has
// terminated, and the awaitTermination method can be
// used to block until the group has terminated.
//
//  The shutdownNow method can be used to initiate a
// forceful shutdown of the group. In addition to the actions performed
// by an orderly shutdown, the shutdownNow method closes all open channels
// in the group as if by invoking the close
// method.
abstract class AsynchronousChannelGroup extends Object {

    // Awaits termination of the group.
    def awaitTermination(timeout: Long, unit: TimeUnit): Boolean

    // Tells whether or not this asynchronous channel group is shutdown.
    def isShutdown(): Boolean

    // Tells whether or not this group has terminated.
    def isTerminated(): Boolean

    // Returns the provider that created this channel group.
    def provider(): AsynchronousChannelProvider

    // Initiates an orderly shutdown of the group.
    def shutdown(): Unit

    // Shuts down the group and closes all open channels in the group.
    def shutdownNow(): Unit
}

object AsynchronousChannelGroup {
    @stub
    // Creates an asynchronous channel group with a given thread pool that
    // creates new threads as needed.
    def withCachedThreadPool(executor: ExecutorService, initialSize: Int): AsynchronousChannelGroup = ???

    @stub
    // Creates an asynchronous channel group with a fixed thread pool.
    def withFixedThreadPool(nThreads: Int, threadFactory: ThreadFactory): AsynchronousChannelGroup = ???
}

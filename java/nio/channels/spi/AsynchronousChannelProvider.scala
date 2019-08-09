package java.nio.channels.spi

import java.lang.Object
import java.nio.channels.{AsynchronousChannelGroup, AsynchronousServerSocketChannel, AsynchronousSocketChannel}
import java.util.concurrent.{ExecutorService, ThreadFactory}
import scala.scalanative.annotation.stub

/** Service-provider class for asynchronous channels.
 * 
 *   An asynchronous channel provider is a concrete subclass of this class that
 *  has a zero-argument constructor and implements the abstract methods specified
 *  below.  A given invocation of the Java virtual machine maintains a single
 *  system-wide default provider instance, which is returned by the provider method.  The first invocation of that method will locate
 *  the default provider as specified below.
 * 
 *   All of the methods in this class are safe for use by multiple concurrent
 *  threads.  
 */
abstract class AsynchronousChannelProvider extends Object {

    /** Initializes a new instance of this class. */
    @stub
    protected def this() = ???

    /** Constructs a new asynchronous channel group with the given thread pool. */
    def openAsynchronousChannelGroup(executor: ExecutorService, initialSize: Int): AsynchronousChannelGroup

    /** Constructs a new asynchronous channel group with a fixed thread pool. */
    def openAsynchronousChannelGroup(nThreads: Int, threadFactory: ThreadFactory): AsynchronousChannelGroup

    /** Opens an asynchronous server-socket channel. */
    def openAsynchronousServerSocketChannel(group: AsynchronousChannelGroup): AsynchronousServerSocketChannel

    /** Opens an asynchronous socket channel. */
    def openAsynchronousSocketChannel(group: AsynchronousChannelGroup): AsynchronousSocketChannel
}

object AsynchronousChannelProvider {
    /** Returns the system-wide default asynchronous channel provider for this
     *  invocation of the Java virtual machine.
     */
    @stub
    def provider(): AsynchronousChannelProvider = ???
}

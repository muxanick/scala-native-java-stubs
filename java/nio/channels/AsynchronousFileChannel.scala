package java.nio.channels

import java.lang.{Integer, Object}
import java.nio.ByteBuffer
import java.nio.file.{OpenOption, Path}
import java.nio.file.attribute.FileAttribute
import java.util.Set
import java.util.concurrent.{ExecutorService, Future}

// An asynchronous channel for reading, writing, and manipulating a file.
//
//  An asynchronous file channel is created when a file is opened by invoking
// one of the open methods defined by this class. The file contains
// a variable-length sequence of bytes that can be read and written and whose
// current size can be queried. The size of the file increases
// when bytes are written beyond its  current size; the size of the file decreases
// when it is truncated.
//
//  An asynchronous file channel does not have a current position
// within the file. Instead, the file position is specified to each read and
// write method that initiates asynchronous operations. A CompletionHandler
// is specified as a parameter and is invoked to consume the result of the I/O
// operation. This class also defines read and write methods that initiate
// asynchronous operations, returning a Future to represent the pending
// result of the operation. The Future may be used to check if the
// operation has completed, wait for its completion, and retrieve the result.
//
//  In addition to read and write operations, this class defines the
// following operations: 
//
// 
//
//    Updates made to a file may be forced
//   out to the underlying storage device, ensuring that data are not
//   lost in the event of a system crash.  
//
//    A region of a file may be locked against
//   access by other programs.  
//
// 
//
//  An AsynchronousFileChannel is associated with a thread pool to
// which tasks are submitted to handle I/O events and dispatch to completion
// handlers that consume the results of I/O operations on the channel. The
// completion handler for an I/O operation initiated on a channel is guaranteed
// to be invoked by one of the threads in the thread pool (This ensures that the
// completion handler is run by a thread with the expected identity).
// Where an I/O operation completes immediately, and the initiating thread is
// itself a thread in the thread pool, then the completion handler may be invoked
// directly by the initiating thread. When an AsynchronousFileChannel is
// created without specifying a thread pool then the channel is associated with
// a system-dependent default thread pool that may be shared with other
// channels. The default thread pool is configured by the system properties
// defined by the AsynchronousChannelGroup class.
//
//  Channels of this type are safe for use by multiple concurrent threads. The
// close method may be invoked at any time, as specified
// by the Channel interface. This causes all outstanding asynchronous
// operations on the channel to complete with the exception AsynchronousCloseException. Multiple read and write operations may be
// outstanding at the same time. When multiple read and write operations are
// outstanding then the ordering of the I/O operations, and the order that the
// completion handlers are invoked, is not specified; they are not, in particular,
// guaranteed to execute in the order that the operations were initiated. The
// ByteBuffers used when reading or writing are not
// safe for use by multiple concurrent I/O operations. Furthermore, after an I/O
// operation is initiated then care should be taken to ensure that the buffer is
// not accessed until after the operation has completed.
//
//  As with FileChannel, the view of a file provided by an instance of
// this class is guaranteed to be consistent with other views of the same file
// provided by other instances in the same program.  The view provided by an
// instance of this class may or may not, however, be consistent with the views
// seen by other concurrently-running programs due to caching performed by the
// underlying operating system and delays induced by network-filesystem protocols.
// This is true regardless of the language in which these other programs are
// written, and whether they are running on the same machine or on some other
// machine.  The exact nature of any such inconsistencies are system-dependent
// and are therefore unspecified.
abstract class AsynchronousFileChannel extends Object with AsynchronousChannel {

    // Forces any updates to this channel's file to be written to the storage
    // device that contains it.
    def force(metaData: Boolean): Unit

    // Acquires an exclusive lock on this channel's file.
    def lock(): Future[FileLock]

    // Acquires an exclusive lock on this channel's file.
    def Unit: [A]

    // Acquires a lock on the given region of this channel's file.
    def lock(position: Long, size: Long, shared: Boolean): Future[FileLock]

    // Acquires a lock on the given region of this channel's file.
    def Unit: abstract[A]

    // Reads a sequence of bytes from this channel into the given buffer,
    // starting at the given file position.
    def read(dst: ByteBuffer, position: Long): Future[Integer]

    // Reads a sequence of bytes from this channel into the given buffer,
    // starting at the given file position.
    def Unit: abstract[A]

    // Returns the current size of this channel's file.
    def size(): Long

    // Truncates this channel's file to the given size.
    def truncate(size: Long): AsynchronousFileChannel

    // Attempts to acquire an exclusive lock on this channel's file.
    def tryLock(): FileLock

    // Attempts to acquire a lock on the given region of this channel's file.
    def tryLock(position: Long, size: Long, shared: Boolean): FileLock

    // Writes a sequence of bytes to this channel from the given buffer, starting
    // at the given file position.
    def write(src: ByteBuffer, position: Long): Future[Integer]
}

object AsynchronousFileChannel {
    @stub
    // Opens or creates a file for reading and/or writing, returning an
    // asynchronous file channel to access the file.
    def open(file: Path, options: OpenOption*): AsynchronousFileChannel = ???

    @stub
    // Opens or creates a file for reading and/or writing, returning an
    // asynchronous file channel to access the file.
    def open(file: Path, options: Set[_ <: OpenOption], executor: ExecutorService, attrs: FileAttribute[_]*): AsynchronousFileChannel = ???
}

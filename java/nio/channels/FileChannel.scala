package java.nio.channels

import java.lang.Object
import java.nio.{ByteBuffer, MappedByteBuffer}
import java.nio.channels.spi.AbstractInterruptibleChannel
import java.nio.file.{OpenOption, Path}
import java.nio.file.attribute.FileAttribute
import java.util.Set

// A channel for reading, writing, mapping, and manipulating a file.
//
//  A file channel is a SeekableByteChannel that is connected to
// a file. It has a current position within its file which can
// be both queried and modified.  The file itself contains a variable-length sequence
// of bytes that can be read and written and whose current size can be queried.  The size of the file increases
// when bytes are written beyond its current size; the size of the file
// decreases when it is truncated.  The
// file may also have some associated metadata such as access
// permissions, content type, and last-modification time; this class does not
// define methods for metadata access.
//
//  In addition to the familiar read, write, and close operations of byte
// channels, this class defines the following file-specific operations: 
//
// 
//
//    Bytes may be read or
//   written at an absolute
//   position in a file in a way that does not affect the channel's current
//   position.  
//
//    A region of a file may be mapped
//   directly into memory; for large files this is often much more efficient
//   than invoking the usual read or write methods.
//   
//
//    Updates made to a file may be forced
//   out to the underlying storage device, ensuring that data are not
//   lost in the event of a system crash.  
//
//    Bytes can be transferred from a file to
//   some other channel, and vice
//   versa, in a way that can be optimized by many operating systems
//   into a very fast transfer directly to or from the filesystem cache.
//   
//
//    A region of a file may be locked
//   against access by other programs.  
//
// 
//
//  File channels are safe for use by multiple concurrent threads.  The
// close method may be invoked at any time, as specified
// by the Channel interface.  Only one operation that involves the
// channel's position or can change its file's size may be in progress at any
// given time; attempts to initiate a second such operation while the first is
// still in progress will block until the first operation completes.  Other
// operations, in particular those that take an explicit position, may proceed
// concurrently; whether they in fact do so is dependent upon the underlying
// implementation and is therefore unspecified.
//
//  The view of a file provided by an instance of this class is guaranteed
// to be consistent with other views of the same file provided by other
// instances in the same program.  The view provided by an instance of this
// class may or may not, however, be consistent with the views seen by other
// concurrently-running programs due to caching performed by the underlying
// operating system and delays induced by network-filesystem protocols.  This
// is true regardless of the language in which these other programs are
// written, and whether they are running on the same machine or on some other
// machine.  The exact nature of any such inconsistencies are system-dependent
// and are therefore unspecified.
//
//  A file channel is created by invoking one of the open
// methods defined by this class. A file channel can also be obtained from an
// existing FileInputStream, FileOutputStream, or RandomAccessFile object by invoking
// that object's getChannel method, which returns a file channel that
// is connected to the same underlying file. Where the file channel is obtained
// from an existing stream or random access file then the state of the file
// channel is intimately connected to that of the object whose getChannel
// method returned the channel.  Changing the channel's position, whether
// explicitly or by reading or writing bytes, will change the file position of
// the originating object, and vice versa. Changing the file's length via the
// file channel will change the length seen via the originating object, and vice
// versa.  Changing the file's content by writing bytes will change the content
// seen by the originating object, and vice versa.
//
//   At various points this class specifies that an
// instance that is "open for reading," "open for writing," or "open for
// reading and writing" is required.  A channel obtained via the getChannel method of a FileInputStream instance will be open for reading.  A channel
// obtained via the getChannel
// method of a FileOutputStream instance will be open for
// writing.  Finally, a channel obtained via the getChannel method of a RandomAccessFile instance will be open for reading if the instance
// was created with mode "r" and will be open for reading and writing
// if the instance was created with mode "rw".
//
//  A file channel that is open for writing may be in
// append mode, for example if it was obtained from a file-output stream
// that was created by invoking the FileOutputStream(File,boolean) constructor and passing true for
// the second parameter.  In this mode each invocation of a relative write
// operation first advances the position to the end of the file and then writes
// the requested data.  Whether the advancement of the position and the writing
// of the data are done in a single atomic operation is system-dependent and
// therefore unspecified.
abstract class FileChannel extends AbstractInterruptibleChannel with SeekableByteChannel, with GatheringByteChannel, with ScatteringByteChannel {

    // Forces any updates to this channel's file to be written to the storage
    // device that contains it.
    def force(metaData: Boolean): Unit

    // Acquires an exclusive lock on this channel's file.
    def lock(): FileLock

    // Acquires a lock on the given region of this channel's file.
    def lock(position: Long, size: Long, shared: Boolean): FileLock

    // Maps a region of this channel's file directly into memory.
    def map(mode: FileChannel.MapMode, position: Long, size: Long): MappedByteBuffer

    // Returns this channel's file position.
    def position(): Long

    // Sets this channel's file position.
    def position(newPosition: Long): FileChannel

    // Reads a sequence of bytes from this channel into the given buffer.
    def read(dst: ByteBuffer): Int

    // Reads a sequence of bytes from this channel into the given buffers.
    def read(dsts: Array[ByteBuffer]): Long

    // Reads a sequence of bytes from this channel into a subsequence of the
    // given buffers.
    def read(dsts: Array[ByteBuffer], offset: Int, length: Int): Long

    // Reads a sequence of bytes from this channel into the given buffer,
    // starting at the given file position.
    def read(dst: ByteBuffer, position: Long): Int

    // Returns the current size of this channel's file.
    def size(): Long

    // Transfers bytes into this channel's file from the given readable byte
    // channel.
    def transferFrom(src: ReadableByteChannel, position: Long, count: Long): Long

    // Transfers bytes from this channel's file to the given writable byte
    // channel.
    def transferTo(position: Long, count: Long, target: WritableByteChannel): Long

    // Truncates this channel's file to the given size.
    def truncate(size: Long): FileChannel

    // Attempts to acquire an exclusive lock on this channel's file.
    def tryLock(): FileLock

    // Attempts to acquire a lock on the given region of this channel's file.
    def tryLock(position: Long, size: Long, shared: Boolean): FileLock

    // Writes a sequence of bytes to this channel from the given buffer.
    def write(src: ByteBuffer): Int

    // Writes a sequence of bytes to this channel from the given buffers.
    def write(srcs: Array[ByteBuffer]): Long

    // Writes a sequence of bytes to this channel from a subsequence of the
    // given buffers.
    def write(srcs: Array[ByteBuffer], offset: Int, length: Int): Long
}

object FileChannel {
    @stub
    // Opens or creates a file, returning a file channel to access the file.
    def open(path: Path, options: OpenOption*): FileChannel = ???

    @stub
    // Opens or creates a file, returning a file channel to access the file.
    def open(path: Path, options: Set[_ <: OpenOption], attrs: FileAttribute[_]*): FileChannel = ???
}

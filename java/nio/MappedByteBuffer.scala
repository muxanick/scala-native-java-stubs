package java.nio

import java.lang.Object

// A direct byte buffer whose content is a memory-mapped region of a file.
//
//  Mapped byte buffers are created via the FileChannel.map method.  This class
// extends the ByteBuffer class with operations that are specific to
// memory-mapped file regions.
//
//  A mapped byte buffer and the file mapping that it represents remain
// valid until the buffer itself is garbage-collected.
//
//  The content of a mapped byte buffer can change at any time, for example
// if the content of the corresponding region of the mapped file is changed by
// this program or another.  Whether or not such changes occur, and when they
// occur, is operating-system dependent and therefore unspecified.
//
//  All or part of a mapped byte buffer may become
// inaccessible at any time, for example if the mapped file is truncated.  An
// attempt to access an inaccessible region of a mapped byte buffer will not
// change the buffer's content and will cause an unspecified exception to be
// thrown either at the time of the access or at some later time.  It is
// therefore strongly recommended that appropriate precautions be taken to
// avoid the manipulation of a mapped file by this program, or by a
// concurrently running program, except to read or write the file's content.
//
//  Mapped byte buffers otherwise behave no differently than ordinary direct
// byte buffers. 
abstract class MappedByteBuffer extends ByteBuffer {

    // Forces any changes made to this buffer's content to be written to the
    // storage device containing the mapped file.
    def force(): MappedByteBuffer

    // Tells whether or not this buffer's content is resident in physical
    // memory.
    def isLoaded(): Boolean
}

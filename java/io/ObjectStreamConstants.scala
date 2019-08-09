package java.io

// Constants written into the Object Serialization Stream.
trait ObjectStreamConstants {
}

object ObjectStreamConstants {
    @stub
    // First wire handle to be assigned.
    def baseWireHandle: Int = ???

    @stub
    // A Stream Protocol Version.
    def PROTOCOL_VERSION_1: Int = ???

    @stub
    // A Stream Protocol Version.
    def PROTOCOL_VERSION_2: Int = ???

    @stub
    // Bit mask for ObjectStreamClass flag.
    def SC_BLOCK_DATA: Byte = ???

    @stub
    // Bit mask for ObjectStreamClass flag.
    def SC_ENUM: Byte = ???

    @stub
    // Bit mask for ObjectStreamClass flag.
    def SC_EXTERNALIZABLE: Byte = ???

    @stub
    // Bit mask for ObjectStreamClass flag.
    def SC_SERIALIZABLE: Byte = ???

    @stub
    // Bit mask for ObjectStreamClass flag.
    def SC_WRITE_METHOD: Byte = ???

    @stub
    // Magic number that is written to the stream header.
    def STREAM_MAGIC: Short = ???

    @stub
    // Version number that is written to the stream header.
    def STREAM_VERSION: Short = ???

    @stub
    // Enable overriding of readObject and writeObject.
    def SUBCLASS_IMPLEMENTATION_PERMISSION: SerializablePermission = ???

    @stub
    // Enable substitution of one object for another during
    // serialization/deserialization.
    def SUBSTITUTION_PERMISSION: SerializablePermission = ???

    @stub
    // new Array.
    def TC_ARRAY: Byte = ???

    @stub
    // First tag value.
    def TC_BASE: Byte = ???

    @stub
    // Block of optional data.
    def TC_BLOCKDATA: Byte = ???

    @stub
    // long Block data.
    def TC_BLOCKDATALONG: Byte = ???

    @stub
    // Reference to Class.
    def TC_CLASS: Byte = ???

    @stub
    // new Class Descriptor.
    def TC_CLASSDESC: Byte = ???

    @stub
    // End of optional block data blocks for an object.
    def TC_ENDBLOCKDATA: Byte = ???

    @stub
    // new Enum constant.
    def TC_ENUM: Byte = ???

    @stub
    // Exception during write.
    def TC_EXCEPTION: Byte = ???

    @stub
    // Long string.
    def TC_LONGSTRING: Byte = ???

    @stub
    // Last tag value.
    def TC_MAX: Byte = ???

    @stub
    // Null object reference.
    def TC_NULL: Byte = ???

    @stub
    // new Object.
    def TC_OBJECT: Byte = ???

    @stub
    // new Proxy Class Descriptor.
    def TC_PROXYCLASSDESC: Byte = ???

    @stub
    // Reference to an object already written into the stream.
    def TC_REFERENCE: Byte = ???

    @stub
    // Reset stream context.
    def TC_RESET: Byte = ???
}

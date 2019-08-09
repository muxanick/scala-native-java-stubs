package java.io

/** Constants written into the Object Serialization Stream. */
trait ObjectStreamConstants {
}

object ObjectStreamConstants {
    /** First wire handle to be assigned. */
    @stub
    val baseWireHandle: Int = ???

    /** A Stream Protocol Version. */
    @stub
    val PROTOCOL_VERSION_1: Int = ???

    /** A Stream Protocol Version. */
    @stub
    val PROTOCOL_VERSION_2: Int = ???

    /** Bit mask for ObjectStreamClass flag. */
    @stub
    val SC_BLOCK_DATA: Byte = ???

    /** Bit mask for ObjectStreamClass flag. */
    @stub
    val SC_ENUM: Byte = ???

    /** Bit mask for ObjectStreamClass flag. */
    @stub
    val SC_EXTERNALIZABLE: Byte = ???

    /** Bit mask for ObjectStreamClass flag. */
    @stub
    val SC_SERIALIZABLE: Byte = ???

    /** Bit mask for ObjectStreamClass flag. */
    @stub
    val SC_WRITE_METHOD: Byte = ???

    /** Magic number that is written to the stream header. */
    @stub
    val STREAM_MAGIC: Short = ???

    /** Version number that is written to the stream header. */
    @stub
    val STREAM_VERSION: Short = ???

    /** Enable overriding of readObject and writeObject. */
    @stub
    val SUBCLASS_IMPLEMENTATION_PERMISSION: SerializablePermission = ???

    /** Enable substitution of one object for another during
     *  serialization/deserialization.
     */
    @stub
    val SUBSTITUTION_PERMISSION: SerializablePermission = ???

    /** new Array. */
    @stub
    val TC_ARRAY: Byte = ???

    /** First tag value. */
    @stub
    val TC_BASE: Byte = ???

    /** Block of optional data. */
    @stub
    val TC_BLOCKDATA: Byte = ???

    /** long Block data. */
    @stub
    val TC_BLOCKDATALONG: Byte = ???

    /** Reference to Class. */
    @stub
    val TC_CLASS: Byte = ???

    /** new Class Descriptor. */
    @stub
    val TC_CLASSDESC: Byte = ???

    /** End of optional block data blocks for an object. */
    @stub
    val TC_ENDBLOCKDATA: Byte = ???

    /** new Enum constant. */
    @stub
    val TC_ENUM: Byte = ???

    /** Exception during write. */
    @stub
    val TC_EXCEPTION: Byte = ???

    /** Long string. */
    @stub
    val TC_LONGSTRING: Byte = ???

    /** Last tag value. */
    @stub
    val TC_MAX: Byte = ???

    /** Null object reference. */
    @stub
    val TC_NULL: Byte = ???

    /** new Object. */
    @stub
    val TC_OBJECT: Byte = ???

    /** new Proxy Class Descriptor. */
    @stub
    val TC_PROXYCLASSDESC: Byte = ???

    /** Reference to an object already written into the stream. */
    @stub
    val TC_REFERENCE: Byte = ???

    /** Reset stream context. */
    @stub
    val TC_RESET: Byte = ???
}

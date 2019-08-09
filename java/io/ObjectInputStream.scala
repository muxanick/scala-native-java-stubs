package java.io

import java.lang.{Class, Object, String}

// An ObjectInputStream deserializes primitive data and objects previously
// written using an ObjectOutputStream.
//
// ObjectOutputStream and ObjectInputStream can provide an application with
// persistent storage for graphs of objects when used with a FileOutputStream
// and FileInputStream respectively.  ObjectInputStream is used to recover
// those objects previously serialized. Other uses include passing objects
// between hosts using a socket stream or for marshaling and unmarshaling
// arguments and parameters in a remote communication system.
//
// ObjectInputStream ensures that the types of all objects in the graph
// created from the stream match the classes present in the Java Virtual
// Machine.  Classes are loaded as required using the standard mechanisms.
//
// Only objects that support the java.io.Serializable or
// java.io.Externalizable interface can be read from streams.
//
// The method readObject is used to read an object from the
// stream.  Java's safe casting should be used to get the desired type.  In
// Java, strings and arrays are objects and are treated as objects during
// serialization. When read they need to be cast to the expected type.
//
// Primitive data types can be read from the stream using the appropriate
// method on DataInput.
//
// The default deserialization mechanism for objects restores the contents
// of each field to the value and type it had when it was written.  Fields
// declared as transient or static are ignored by the deserialization process.
// References to other objects cause those objects to be read from the stream
// as necessary.  Graphs of objects are restored correctly using a reference
// sharing mechanism.  New objects are always allocated when deserializing,
// which prevents existing objects from being overwritten.
//
// Reading an object is analogous to running the constructors of a new
// object.  Memory is allocated for the object and initialized to zero (NULL).
// No-arg constructors are invoked for the non-serializable classes and then
// the fields of the serializable classes are restored from the stream starting
// with the serializable class closest to java.lang.object and finishing with
// the object's most specific class.
//
// For example to read from a stream as written by the example in
// ObjectOutputStream:
// 
// 
//      FileInputStream fis = new FileInputStream("t.tmp");
//      ObjectInputStream ois = new ObjectInputStream(fis);
//
//      int i = ois.readInt();
//      String today = (String) ois.readObject();
//      Date date = (Date) ois.readObject();
//
//      ois.close();
// 
//
// Classes control how they are serialized by implementing either the
// java.io.Serializable or java.io.Externalizable interfaces.
//
// Implementing the Serializable interface allows object serialization to
// save and restore the entire state of the object and it allows classes to
// evolve between the time the stream is written and the time it is read.  It
// automatically traverses references between objects, saving and restoring
// entire graphs.
//
// Serializable classes that require special handling during the
// serialization and deserialization process should implement the following
// methods:
//
// 
// private void writeObject(java.io.ObjectOutputStream stream)
//     throws IOException;
// private void readObject(java.io.ObjectInputStream stream)
//     throws IOException, ClassNotFoundException;
// private void readObjectNoData()
//     throws ObjectStreamException;
// 
//
// The readObject method is responsible for reading and restoring the state
// of the object for its particular class using data written to the stream by
// the corresponding writeObject method.  The method does not need to concern
// itself with the state belonging to its superclasses or subclasses.  State is
// restored by reading data from the ObjectInputStream for the individual
// fields and making assignments to the appropriate fields of the object.
// Reading primitive data types is supported by DataInput.
//
// Any attempt to read object data which exceeds the boundaries of the
// custom data written by the corresponding writeObject method will cause an
// OptionalDataException to be thrown with an eof field value of true.
// Non-object reads which exceed the end of the allotted data will reflect the
// end of data in the same way that they would indicate the end of the stream:
// bytewise reads will return -1 as the byte read or number of bytes read, and
// primitive reads will throw EOFExceptions.  If there is no corresponding
// writeObject method, then the end of default serialized data marks the end of
// the allotted data.
//
// Primitive and object read calls issued from within a readExternal method
// behave in the same manner--if the stream is already positioned at the end of
// data written by the corresponding writeExternal method, object reads will
// throw OptionalDataExceptions with eof set to true, bytewise reads will
// return -1, and primitive reads will throw EOFExceptions.  Note that this
// behavior does not hold for streams written with the old
// ObjectStreamConstants.PROTOCOL_VERSION_1 protocol, in which the
// end of data written by writeExternal methods is not demarcated, and hence
// cannot be detected.
//
// The readObjectNoData method is responsible for initializing the state of
// the object for its particular class in the event that the serialization
// stream does not list the given class as a superclass of the object being
// deserialized.  This may occur in cases where the receiving party uses a
// different version of the deserialized instance's class than the sending
// party, and the receiver's version extends classes that are not extended by
// the sender's version.  This may also occur if the serialization stream has
// been tampered; hence, readObjectNoData is useful for initializing
// deserialized objects properly despite a "hostile" or incomplete source
// stream.
//
// Serialization does not read or assign values to the fields of any object
// that does not implement the java.io.Serializable interface.  Subclasses of
// Objects that are not serializable can be serializable. In this case the
// non-serializable class must have a no-arg constructor to allow its fields to
// be initialized.  In this case it is the responsibility of the subclass to
// save and restore the state of the non-serializable class. It is frequently
// the case that the fields of that class are accessible (public, package, or
// protected) or that there are get and set methods that can be used to restore
// the state.
//
// Any exception that occurs while deserializing an object will be caught by
// the ObjectInputStream and abort the reading process.
//
// Implementing the Externalizable interface allows the object to assume
// complete control over the contents and format of the object's serialized
// form.  The methods of the Externalizable interface, writeExternal and
// readExternal, are called to save and restore the objects state.  When
// implemented by a class they can write and read their own state using all of
// the methods of ObjectOutput and ObjectInput.  It is the responsibility of
// the objects to handle any versioning that occurs.
//
// Enum constants are deserialized differently than ordinary serializable or
// externalizable objects.  The serialized form of an enum constant consists
// solely of its name; field values of the constant are not transmitted.  To
// deserialize an enum constant, ObjectInputStream reads the constant name from
// the stream; the deserialized constant is then obtained by calling the static
// method Enum.valueOf(Class, String) with the enum constant's
// base type and the received constant name as arguments.  Like other
// serializable or externalizable objects, enum constants can function as the
// targets of back references appearing subsequently in the serialization
// stream.  The process by which enum constants are deserialized cannot be
// customized: any class-specific readObject, readObjectNoData, and readResolve
// methods defined by enum types are ignored during deserialization.
// Similarly, any serialPersistentFields or serialVersionUID field declarations
// are also ignored--all enum types have a fixed serialVersionUID of 0L.
class ObjectInputStream extends InputStream with ObjectInput, with ObjectStreamConstants {

    @stub
    // Provide a way for subclasses that are completely reimplementing
    // ObjectInputStream to not have to allocate private data just used by this
    // implementation of ObjectInputStream.
    protected def this() = ???

    @stub
    // Returns the number of bytes that can be read without blocking.
    def available(): Int = ???

    @stub
    // Closes the input stream.
    def close(): Unit = ???

    @stub
    // Read the non-static and non-transient fields of the current class from
    // this stream.
    def defaultReadObject(): Unit = ???

    @stub
    // Enable the stream to allow objects read from the stream to be replaced.
    protected def enableResolveObject(enable: Boolean): Boolean = ???

    @stub
    // Reads a byte of data.
    def read(): Int = ???

    @stub
    // Reads into an array of bytes.
    def read(buf: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // Reads in a boolean.
    def readBoolean(): Boolean = ???

    @stub
    // Reads an 8 bit byte.
    def readByte(): Byte = ???

    @stub
    // Reads a 16 bit char.
    def readChar(): Char = ???

    @stub
    // Read a class descriptor from the serialization stream.
    protected def readClassDescriptor(): ObjectStreamClass = ???

    @stub
    // Reads a 64 bit double.
    def readDouble(): double = ???

    @stub
    // Reads the persistent fields from the stream and makes them available by
    // name.
    def readFields(): ObjectInputStream.GetField = ???

    @stub
    // Reads a 32 bit float.
    def readFloat(): float = ???

    @stub
    // Reads bytes, blocking until all bytes are read.
    def readFully(buf: Array[Byte]): Unit = ???

    @stub
    // Reads bytes, blocking until all bytes are read.
    def readFully(buf: Array[Byte], off: Int, len: Int): Unit = ???

    @stub
    // Reads a 32 bit int.
    def readInt(): Int = ???

    @stub
    // Deprecated. 
    //This method does not properly convert bytes to characters.
    //          see DataInputStream for the details and alternatives.
    //
    def readLine(): String = ???

    @stub
    // Reads a 64 bit long.
    def readLong(): Long = ???

    @stub
    // Read an object from the ObjectInputStream.
    def readObject(): Object = ???

    @stub
    // This method is called by trusted subclasses of ObjectOutputStream that
    // constructed ObjectOutputStream using the protected no-arg constructor.
    protected def readObjectOverride(): Object = ???

    @stub
    // Reads a 16 bit short.
    def readShort(): Short = ???

    @stub
    // The readStreamHeader method is provided to allow subclasses to read and
    // verify their own stream headers.
    protected def readStreamHeader(): Unit = ???

    @stub
    // Reads an "unshared" object from the ObjectInputStream.
    def readUnshared(): Object = ???

    @stub
    // Reads an unsigned 8 bit byte.
    def readUnsignedByte(): Int = ???

    @stub
    // Reads an unsigned 16 bit short.
    def readUnsignedShort(): Int = ???

    @stub
    // Reads a String in
    // modified UTF-8
    // format.
    def readUTF(): String = ???

    @stub
    // Register an object to be validated before the graph is returned.
    def registerValidation(obj: ObjectInputValidation, prio: Int): Unit = ???

    @stub
    // Load the local class equivalent of the specified stream class
    // description.
    protected def resolveClass(desc: ObjectStreamClass): Class[_] = ???

    @stub
    // This method will allow trusted subclasses of ObjectInputStream to
    // substitute one object for another during deserialization.
    protected def resolveObject(obj: Object): Object = ???

    @stub
    // Returns a proxy class that implements the interfaces named in a proxy
    // class descriptor; subclasses may implement this method to read custom
    // data from the stream along with the descriptors for dynamic proxy
    // classes, allowing them to use an alternate loading mechanism for the
    // interfaces and the proxy class.
    protected def resolveProxyClass(interfaces: Array[String]): Class[_] = ???
}

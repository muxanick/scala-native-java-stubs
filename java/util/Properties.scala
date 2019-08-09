package java.util

import java.io.{InputStream, OutputStream, PrintStream, PrintWriter, Reader, Writer}
import java.lang.{Object, String}

// The Properties class represents a persistent set of
// properties. The Properties can be saved to a stream
// or loaded from a stream. Each key and its corresponding value in
// the property list is a string.
// 
// A property list can contain another property list as its
// "defaults"; this second property list is searched if
// the property key is not found in the original property list.
// 
// Because Properties inherits from Hashtable, the
// put and putAll methods can be applied to a
// Properties object.  Their use is strongly discouraged as they
// allow the caller to insert entries whose keys or values are not
// Strings.  The setProperty method should be used
// instead.  If the store or save method is called
// on a "compromised" Properties object that contains a
// non-String key or value, the call will fail. Similarly,
// the call to the propertyNames or list method
// will fail if it is called on a "compromised" Properties
// object that contains a non-String key.
//
// 
// The load(Reader) /
// store(Writer, String)
// methods load and store properties from and to a character based stream
// in a simple line-oriented format specified below.
//
// The load(InputStream) /
// store(OutputStream, String)
// methods work the same way as the load(Reader)/store(Writer, String) pair, except
// the input/output stream is encoded in ISO 8859-1 character encoding.
// Characters that cannot be directly represented in this encoding can be written using
// Unicode escapes as defined in section 3.3 of
// The Java™ Language Specification;
// only a single 'u' character is allowed in an escape
// sequence. The native2ascii tool can be used to convert property files to and
// from other character encodings.
//
//  The loadFromXML(InputStream) and storeToXML(OutputStream, String, String) methods load and store properties
// in a simple XML format.  By default the UTF-8 character encoding is used,
// however a specific encoding may be specified if required. Implementations
// are required to support UTF-8 and UTF-16 and may support other encodings.
// An XML properties document has the following DOCTYPE declaration:
//
// 
// <!DOCTYPE properties SYSTEM "http://java.sun.com/dtd/properties.dtd">
// 
// Note that the system URI (http://java.sun.com/dtd/properties.dtd) is
// not accessed when exporting or importing properties; it merely
// serves as a string to uniquely identify the DTD, which is:
// 
//    <?xml version="1.0" encoding="UTF-8"?>
//
//    <!-- DTD for properties -->
//
//    <!ELEMENT properties ( comment?, entry* ) >
//
//    <!ATTLIST properties version CDATA #FIXED "1.0">
//
//    <!ELEMENT comment (#PCDATA) >
//
//    <!ELEMENT entry (#PCDATA) >
//
//    <!ATTLIST entry key CDATA #REQUIRED>
// 
//
// This class is thread-safe: multiple threads can share a single
// Properties object without the need for external synchronization.
class Properties extends Hashtable[Object, Object] {

    @stub
    // Creates an empty property list with no default values.
    def this() = ???

    @stub
    // Searches for the property with the specified key in this property list.
    def getProperty(key: String): String = ???

    @stub
    // Searches for the property with the specified key in this property list.
    def getProperty(key: String, defaultValue: String): String = ???

    @stub
    // Prints this property list out to the specified output stream.
    def list(out: PrintStream): Unit = ???

    @stub
    // Prints this property list out to the specified output stream.
    def list(out: PrintWriter): Unit = ???

    @stub
    // Reads a property list (key and element pairs) from the input
    // byte stream.
    def load(inStream: InputStream): Unit = ???

    @stub
    // Reads a property list (key and element pairs) from the input
    // character stream in a simple line-oriented format.
    def load(reader: Reader): Unit = ???

    @stub
    // Loads all of the properties represented by the XML document on the
    // specified input stream into this properties table.
    def loadFromXML(in: InputStream): Unit = ???

    @stub
    // Returns an enumeration of all the keys in this property list,
    // including distinct keys in the default property list if a key
    // of the same name has not already been found from the main
    // properties list.
    def propertyNames(): Enumeration[_] = ???

    @stub
    // Deprecated. 
    //This method does not throw an IOException if an I/O error
    // occurs while saving the property list.  The preferred way to save a
    // properties list is via the store(OutputStream out,
    // String comments) method or the
    // storeToXML(OutputStream os, String comment) method.
    //
    def save(out: OutputStream, comments: String): Unit = ???

    @stub
    // Calls the Hashtable method put.
    def setProperty(key: String, value: String): Object = ???

    @stub
    // Writes this property list (key and element pairs) in this
    // Properties table to the output stream in a format suitable
    // for loading into a Properties table using the
    // load(InputStream) method.
    def store(out: OutputStream, comments: String): Unit = ???

    @stub
    // Writes this property list (key and element pairs) in this
    // Properties table to the output character stream in a
    // format suitable for using the load(Reader)
    // method.
    def store(writer: Writer, comments: String): Unit = ???

    @stub
    // Emits an XML document representing all of the properties contained
    // in this table.
    def storeToXML(os: OutputStream, comment: String): Unit = ???

    @stub
    // Emits an XML document representing all of the properties contained
    // in this table, using the specified encoding.
    def storeToXML(os: OutputStream, comment: String, encoding: String): Unit = ???
}

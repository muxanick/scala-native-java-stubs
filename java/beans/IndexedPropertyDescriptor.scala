package java.beans

import java.lang.{Class, Object, String}
import java.lang.reflect.Method

/** An IndexedPropertyDescriptor describes a property that acts like an
 *  array and has an indexed read and/or indexed write method to access
 *  specific elements of the array.
 *  
 *  An indexed property may also provide simple non-indexed read and write
 *  methods.  If these are present, they read and write arrays of the type
 *  returned by the indexed read method.
 */
class IndexedPropertyDescriptor extends PropertyDescriptor {

    /** This constructor constructs an IndexedPropertyDescriptor for a property
     *  that follows the standard Java conventions by having getFoo and setFoo
     *  accessor methods, for both indexed access and array access.
     */
    @stub
    def this(propertyName: String, beanClass: Class[_]) = ???

    /** This constructor takes the name of a simple property, and method
     *  names for reading and writing the property, both indexed
     *  and non-indexed.
     */
    @stub
    def this(propertyName: String, beanClass: Class[_], readMethodName: String, writeMethodName: String, indexedReadMethodName: String, indexedWriteMethodName: String) = ???

    /** Compares this PropertyDescriptor against the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the Java type info for the indexed property. */
    @stub
    def getIndexedPropertyType(): Class[_] = ???

    /** Gets the method that should be used to read an indexed
     *  property value.
     */
    @stub
    def getIndexedReadMethod(): Method = ???

    /** Gets the method that should be used to write an indexed property value. */
    @stub
    def getIndexedWriteMethod(): Method = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???

    /** Sets the method that should be used to read an indexed property value. */
    @stub
    def setIndexedReadMethod(readMethod: Method): Unit = ???
}

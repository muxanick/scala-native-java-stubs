package java.beans

import java.lang.{Class, Object, String}
import java.lang.reflect.Method
import scala.scalanative.annotation.stub

/** A PropertyDescriptor describes one property that a Java Bean
 *  exports via a pair of accessor methods.
 */
class PropertyDescriptor extends FeatureDescriptor {

    /** Constructs a PropertyDescriptor for a property that follows
     *  the standard Java convention by having getFoo and setFoo
     *  accessor methods.
     */
    @stub
    def this(propertyName: String, beanClass: Class[_]) = ???

    /** This constructor takes the name of a simple property, and method
     *  names for reading and writing the property.
     */
    @stub
    def this(propertyName: String, beanClass: Class[_], readMethodName: String, writeMethodName: String) = ???

    /** This constructor takes the name of a simple property, and Method
     *  objects for reading and writing the property.
     */
    @stub
    def this(propertyName: String, readMethod: Method, writeMethod: Method) = ???

    /** Constructs an instance of a property editor using the current
     *  property editor class.
     */
    @stub
    def createPropertyEditor(bean: Object): PropertyEditor = ???

    /** Compares this PropertyDescriptor against the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Gets any explicit PropertyEditor Class that has been registered
     *  for this property.
     */
    @stub
    def getPropertyEditorClass(): Class[_] = ???

    /** Returns the Java type info for the property. */
    @stub
    def getPropertyType(): Class[_] = ???

    /** Gets the method that should be used to read the property value. */
    @stub
    def getReadMethod(): Method = ???

    /** Gets the method that should be used to write the property value. */
    @stub
    def getWriteMethod(): Method = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???

    /** Updates to "bound" properties will cause a "PropertyChange" event to
     *  get fired when the property is changed.
     */
    @stub
    def isBound(): Boolean = ???

    /** Attempted updates to "Constrained" properties will cause a "VetoableChange"
     *  event to get fired when the property is changed.
     */
    @stub
    def isConstrained(): Boolean = ???

    /** Updates to "bound" properties will cause a "PropertyChange" event to
     *  get fired when the property is changed.
     */
    @stub
    def setBound(bound: Boolean): Unit = ???

    /** Attempted updates to "Constrained" properties will cause a "VetoableChange"
     *  event to get fired when the property is changed.
     */
    @stub
    def setConstrained(constrained: Boolean): Unit = ???

    /** Normally PropertyEditors will be found using the PropertyEditorManager. */
    @stub
    def setPropertyEditorClass(propertyEditorClass: Class[_]): Unit = ???

    /** Sets the method that should be used to read the property value. */
    @stub
    def setReadMethod(readMethod: Method): Unit = ???

    /** Sets the method that should be used to write the property value. */
    @stub
    def setWriteMethod(writeMethod: Method): Unit = ???
}

package java.beans

import java.lang.{Class, Object, String}
import java.lang.reflect.Method

// A PropertyDescriptor describes one property that a Java Bean
// exports via a pair of accessor methods.
class PropertyDescriptor extends FeatureDescriptor {

    @stub
    // Constructs a PropertyDescriptor for a property that follows
    // the standard Java convention by having getFoo and setFoo
    // accessor methods.
    def this(propertyName: String, beanClass: Class[_]) = ???

    @stub
    // This constructor takes the name of a simple property, and method
    // names for reading and writing the property.
    def this(propertyName: String, beanClass: Class[_], readMethodName: String, writeMethodName: String) = ???

    @stub
    // Constructs an instance of a property editor using the current
    // property editor class.
    def createPropertyEditor(bean: Object): PropertyEditor = ???

    @stub
    // Compares this PropertyDescriptor against the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets any explicit PropertyEditor Class that has been registered
    // for this property.
    def getPropertyEditorClass(): Class[_] = ???

    @stub
    // Returns the Java type info for the property.
    def getPropertyType(): Class[_] = ???

    @stub
    // Gets the method that should be used to read the property value.
    def getReadMethod(): Method = ???

    @stub
    // Gets the method that should be used to write the property value.
    def getWriteMethod(): Method = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???

    @stub
    // Updates to "bound" properties will cause a "PropertyChange" event to
    // get fired when the property is changed.
    def isBound(): Boolean = ???

    @stub
    // Attempted updates to "Constrained" properties will cause a "VetoableChange"
    // event to get fired when the property is changed.
    def isConstrained(): Boolean = ???

    @stub
    // Updates to "bound" properties will cause a "PropertyChange" event to
    // get fired when the property is changed.
    def setBound(bound: Boolean): Unit = ???

    @stub
    // Attempted updates to "Constrained" properties will cause a "VetoableChange"
    // event to get fired when the property is changed.
    def setConstrained(constrained: Boolean): Unit = ???

    @stub
    // Normally PropertyEditors will be found using the PropertyEditorManager.
    def setPropertyEditorClass(propertyEditorClass: Class[_]): Unit = ???

    @stub
    // Sets the method that should be used to read the property value.
    def setReadMethod(readMethod: Method): Unit = ???
}

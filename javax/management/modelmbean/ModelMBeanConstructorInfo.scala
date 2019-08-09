package javax.management.modelmbean

import java.lang.{Object, String}
import java.lang.reflect.Constructor
import javax.management.{Descriptor, DescriptorAccess, MBeanConstructorInfo, MBeanFeatureInfo, MBeanParameterInfo}

// The ModelMBeanConstructorInfo object describes a constructor of the ModelMBean.
// It is a subclass of MBeanConstructorInfo with the addition of an associated Descriptor
// and an implementation of the DescriptorAccess interface.
//
// 
// The fields in the descriptor are defined, but not limited to, the following.
// Note that when the Type in this table is Number, a String that is the decimal
// representation of a Long can also be used.
//
// 
// NameTypeMeaning
// nameString
//     Constructor name.
// descriptorTypeString
//     Must be "operation".
// roleString
//     Must be "constructor".
// displayNameString
//     Human readable name of constructor.
// visibilityNumber
//     1-4 where 1: always visible 4: rarely visible.
// presentationStringString
//     XML formatted string to describe how to present operation
// 
//
// The persistPolicy and currencyTimeLimit fields
// are meaningless for constructors, but are not considered invalid.
//
// The default descriptor will have the name, descriptorType, displayName and role fields.
//
// The serialVersionUID of this class is 3862947819818064362L.
class ModelMBeanConstructorInfo extends MBeanConstructorInfo with DescriptorAccess {

    @stub
    // Constructs a ModelMBeanConstructorInfo object with a default
    // descriptor.
    def this(description: String, constructorMethod: Constructor[_]) = ???

    @stub
    // Constructs a ModelMBeanConstructorInfo object.
    def this(description: String, constructorMethod: Constructor[_], descriptor: Descriptor) = ???

    @stub
    // Constructs a ModelMBeanConstructorInfo object with a default descriptor.
    def this(name: String, description: String, signature: Array[MBeanParameterInfo]) = ???

    @stub
    // Creates and returns a new ModelMBeanConstructorInfo which is a duplicate of this ModelMBeanConstructorInfo.
    def clone(): Object = ???

    @stub
    // Returns a copy of the associated Descriptor.
    def getDescriptor(): Descriptor = ???

    @stub
    // Sets associated Descriptor (full replace) of
    // ModelMBeanConstructorInfo.
    def setDescriptor(inDescriptor: Descriptor): Unit = ???
}
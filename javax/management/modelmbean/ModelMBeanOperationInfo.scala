package javax.management.modelmbean

import java.lang.{Object, String}
import java.lang.reflect.Method
import javax.management.{Descriptor, DescriptorAccess, MBeanFeatureInfo, MBeanOperationInfo, MBeanParameterInfo}

// The ModelMBeanOperationInfo object describes a management operation of
// the ModelMBean.  It is a subclass of MBeanOperationInfo with the addition
// of an associated Descriptor and an implementation of the DescriptorAccess
// interface.
//
// 
// The fields in the descriptor are defined, but not limited to, the following.
// Note that when the Type in this table is Number, a String that is the decimal
// representation of a Long can also be used.
//
// 
// NameTypeMeaning
// nameString
//     Operation name.
// descriptorTypeString
//     Must be "operation".
// classString
//     Class where method is defined (fully qualified).
// roleString
//     Must be "operation", "getter", or "setter".
// targetObjectObject
//     Object on which to execute this method.
// targetTypeString
//     type of object reference for targetObject. Can be:
//         ObjectReference | Handle | EJBHandle | IOR | RMIReference.
// valueObject
//     Cached value for operation.
// displayNameString
//     Human readable display name of the operation.
// currencyTimeLimitNumber
//     How long cached value is valid.
// lastUpdatedTimeStampNumber
//     When cached value was set.
// visibilityNumber
//     1-4 where 1: always visible 4: rarely visible.
// presentationStringString
//     XML formatted string to describe how to present operation
// 
//
// The default descriptor will have name, descriptorType, displayName and
// role fields set.  The default value of the name and displayName fields is
// the operation name.
//
// Note: because of inconsistencies in previous versions of
// this specification, it is recommended not to use negative or zero
// values for currencyTimeLimit.  To indicate that a
// cached value is never valid, omit the
// currencyTimeLimit field.  To indicate that it is
// always valid, use a very large number for this field.
//
// The serialVersionUID of this class is 6532732096650090465L.
class ModelMBeanOperationInfo extends MBeanOperationInfo with DescriptorAccess {

    @stub
    // Constructs a new ModelMBeanOperationInfo object from this
    // ModelMBeanOperation Object.
    def this(inInfo: ModelMBeanOperationInfo) = ???

    @stub
    // Constructs a ModelMBeanOperationInfo object with a default
    // descriptor.
    def this(description: String, operationMethod: Method) = ???

    @stub
    // Constructs a ModelMBeanOperationInfo object.
    def this(description: String, operationMethod: Method, descriptor: Descriptor) = ???

    @stub
    // Constructs a ModelMBeanOperationInfo object with a default descriptor.
    def this(name: String, description: String, signature: Array[MBeanParameterInfo], type: String, impact: Int) = ???

    @stub
    // Creates and returns a new ModelMBeanOperationInfo which is a
    // duplicate of this ModelMBeanOperationInfo.
    def clone(): Object = ???

    @stub
    // Returns a copy of the associated Descriptor of the
    // ModelMBeanOperationInfo.
    def getDescriptor(): Descriptor = ???

    @stub
    // Sets associated Descriptor (full replace) for the
    // ModelMBeanOperationInfo If the new Descriptor is null, then
    // the associated Descriptor reverts to a default descriptor.
    def setDescriptor(inDescriptor: Descriptor): Unit = ???
}

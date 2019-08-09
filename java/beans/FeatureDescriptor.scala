package java.beans

import java.lang.{Object, String}
import java.util.Enumeration

// The FeatureDescriptor class is the common baseclass for PropertyDescriptor,
// EventSetDescriptor, and MethodDescriptor, etc.
// 
// It supports some common information that can be set and retrieved for
// any of the introspection descriptors.
// 
// In addition it provides an extension mechanism so that arbitrary
// attribute/value pairs can be associated with a design feature.
class FeatureDescriptor extends Object {

    @stub
    // Gets an enumeration of the locale-independent names of this
    // feature.
    def attributeNames(): Enumeration[String] = ???

    @stub
    // Gets the localized display name of this feature.
    def getDisplayName(): String = ???

    @stub
    // Gets the programmatic name of this feature.
    def getName(): String = ???

    @stub
    // Gets the short description of this feature.
    def getShortDescription(): String = ???

    @stub
    // Retrieve a named attribute with this feature.
    def getValue(attributeName: String): Object = ???

    @stub
    // The "expert" flag is used to distinguish between those features that are
    // intended for expert users from those that are intended for normal users.
    def isExpert(): Boolean = ???

    @stub
    // The "hidden" flag is used to identify features that are intended only
    // for tool use, and which should not be exposed to humans.
    def isHidden(): Boolean = ???

    @stub
    // The "preferred" flag is used to identify features that are particularly
    // important for presenting to humans.
    def isPreferred(): Boolean = ???

    @stub
    // Sets the localized display name of this feature.
    def setDisplayName(displayName: String): Unit = ???

    @stub
    // The "expert" flag is used to distinguish between features that are
    // intended for expert users from those that are intended for normal users.
    def setExpert(expert: Boolean): Unit = ???

    @stub
    // The "hidden" flag is used to identify features that are intended only
    // for tool use, and which should not be exposed to humans.
    def setHidden(hidden: Boolean): Unit = ???

    @stub
    // Sets the programmatic name of this feature.
    def setName(name: String): Unit = ???

    @stub
    // The "preferred" flag is used to identify features that are particularly
    // important for presenting to humans.
    def setPreferred(preferred: Boolean): Unit = ???

    @stub
    // You can associate a short descriptive string with a feature.
    def setShortDescription(text: String): Unit = ???

    @stub
    // Associate a named attribute with this feature.
    def setValue(attributeName: String, value: Object): Unit = ???
}

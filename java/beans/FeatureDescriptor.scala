package java.beans

import java.lang.{Object, String}
import java.util.Enumeration
import scala.scalanative.annotation.stub

/** The FeatureDescriptor class is the common baseclass for PropertyDescriptor,
 *  EventSetDescriptor, and MethodDescriptor, etc.
 *  
 *  It supports some common information that can be set and retrieved for
 *  any of the introspection descriptors.
 *  
 *  In addition it provides an extension mechanism so that arbitrary
 *  attribute/value pairs can be associated with a design feature.
 */
class FeatureDescriptor extends Object {

    /** Constructs a FeatureDescriptor. */
    @stub
    def this() = ???

    /** Gets an enumeration of the locale-independent names of this
     *  feature.
     */
    @stub
    def attributeNames(): Enumeration[String] = ???

    /** Gets the localized display name of this feature. */
    @stub
    def getDisplayName(): String = ???

    /** Gets the programmatic name of this feature. */
    @stub
    def getName(): String = ???

    /** Gets the short description of this feature. */
    @stub
    def getShortDescription(): String = ???

    /** Retrieve a named attribute with this feature. */
    @stub
    def getValue(attributeName: String): Object = ???

    /** The "expert" flag is used to distinguish between those features that are
     *  intended for expert users from those that are intended for normal users.
     */
    @stub
    def isExpert(): Boolean = ???

    /** The "hidden" flag is used to identify features that are intended only
     *  for tool use, and which should not be exposed to humans.
     */
    @stub
    def isHidden(): Boolean = ???

    /** The "preferred" flag is used to identify features that are particularly
     *  important for presenting to humans.
     */
    @stub
    def isPreferred(): Boolean = ???

    /** Sets the localized display name of this feature. */
    @stub
    def setDisplayName(displayName: String): Unit = ???

    /** The "expert" flag is used to distinguish between features that are
     *  intended for expert users from those that are intended for normal users.
     */
    @stub
    def setExpert(expert: Boolean): Unit = ???

    /** The "hidden" flag is used to identify features that are intended only
     *  for tool use, and which should not be exposed to humans.
     */
    @stub
    def setHidden(hidden: Boolean): Unit = ???

    /** Sets the programmatic name of this feature. */
    @stub
    def setName(name: String): Unit = ???

    /** The "preferred" flag is used to identify features that are particularly
     *  important for presenting to humans.
     */
    @stub
    def setPreferred(preferred: Boolean): Unit = ???

    /** You can associate a short descriptive string with a feature. */
    @stub
    def setShortDescription(text: String): Unit = ???

    /** Associate a named attribute with this feature. */
    @stub
    def setValue(attributeName: String, value: Object): Unit = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}

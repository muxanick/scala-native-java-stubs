package javax.management.openmbean

import java.io.Serializable
import java.lang.{Object, String}

/** The OpenType class is the parent abstract class of all classes which describe the actual open type
 *  of open data values.
 *  
 *  An open type is defined by:
 *  
 *   the fully qualified Java class name of the open data values this type describes;
 *       note that only a limited set of Java classes is allowed for open data values
 *       (see ALLOWED_CLASSNAMES_LIST),
 *   its name,
 *   its description.
 *  
 */
abstract class OpenType[T] extends Object with Serializable {

    /** Compares the specified obj parameter with this
     *  open type instance for equality.
     */
    def equals(obj: Object): Boolean

    /** Returns the fully qualified Java class name of the open data values
     *  this open type describes.
     */
    def getClassName(): String

    /** Returns the text description of this OpenType instance. */
    def getDescription(): String

    /** Returns the name of this OpenType instance. */
    def getTypeName(): String

    /** Returns a hash code value for the object. */
    def hashCode(): Int

    /** Returns true if the open data values this open
     *  type describes are arrays, false otherwise.
     */
    def isArray(): Boolean

    /** Tests whether obj is a value for this open type. */
    def isValue(obj: Object): Boolean
}

object OpenType {
    /** Deprecated. 
     * Use ALLOWED_CLASSNAMES_LIST instead.
     * 
     */
    @stub
    val ALLOWED_CLASSNAMES: Array[String] = ???
}

package javax.management.openmbean

import java.io.Serializable
import java.lang.{Object, String}
import java.util.List
import scala.scalanative.annotation.stub

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

    /** Constructs an OpenType instance (actually a subclass instance as OpenType is abstract),
     *  checking for the validity of the given parameters.
     */
    @stub
    protected def this(className: String, typeName: String, description: String) = ???

    /** Compares the specified obj parameter with this
     *  open type instance for equality.
     */
    def equals(obj: Any): Boolean

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
    def isValue(obj: Any): Boolean

    /** Returns a string representation of this open type instance. */
    def toString(): String
}

object OpenType {
    /** Deprecated. 
     * Use ALLOWED_CLASSNAMES_LIST instead.
     * 
     */
    @stub
    val ALLOWED_CLASSNAMES: Array[String] = ???

    /** List of the fully qualified names of the Java classes allowed for open
     *  data values.
     */
    @stub
    val ALLOWED_CLASSNAMES_LIST: List[String] = ???
}

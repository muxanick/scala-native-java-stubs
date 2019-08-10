package javax.management.openmbean

import java.lang.{Boolean, Byte, Character, Double, Float, Integer, Long, Object, Short, String, Void}
import java.math.{BigDecimal, BigInteger}
import java.util.Date
import javax.management.ObjectName
import scala.scalanative.annotation.stub

/** The SimpleType class is the open type class whose instances describe
 *  all open data values which are neither arrays,
 *  nor CompositeData values,
 *  nor TabularData values.
 *  It predefines all its possible instances as static fields, and has no public constructor.
 *  
 *  Given a SimpleType instance describing values whose Java class name is className,
 *  the internal fields corresponding to the name and description of this SimpleType instance
 *  are also set to className.
 *  In other words, its methods getClassName, getTypeName and getDescription
 *  all return the same string value className.
 */
final class SimpleType[T] extends OpenType[T] {

    /** Compares the specified obj parameter with this SimpleType instance for equality. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the hash code value for this SimpleType instance. */
    @stub
    def hashCode(): Int = ???

    /** Tests whether obj is a value for this
     *  SimpleType instance.
     */
    @stub
    def isValue(obj: Any): Boolean = ???

    /** Replace an object read from an ObjectInputStream with the unique instance for that
     *  value.
     */
    @stub
    def readResolve(): Any = ???

    /** Returns a string representation of this SimpleType instance. */
    @stub
    def toString(): String = ???
}

object SimpleType {
    /** The SimpleType instance describing values whose
     *  Java class name is java.math.BigDecimal.
     */
    @stub
    val BIGDECIMAL: SimpleType[BigDecimal] = ???

    /** The SimpleType instance describing values whose
     *  Java class name is java.math.BigInteger.
     */
    @stub
    val BIGINTEGER: SimpleType[BigInteger] = ???

    /** The SimpleType instance describing values whose
     *  Java class name is java.lang.Boolean.
     */
    @stub
    val BOOLEAN: SimpleType[Boolean] = ???

    /** The SimpleType instance describing values whose
     *  Java class name is java.lang.Byte.
     */
    @stub
    val BYTE: SimpleType[Byte] = ???

    /** The SimpleType instance describing values whose
     *  Java class name is java.lang.Character.
     */
    @stub
    val CHARACTER: SimpleType[Character] = ???

    /** The SimpleType instance describing values whose
     *  Java class name is java.util.Date.
     */
    @stub
    val DATE: SimpleType[Date] = ???

    /** The SimpleType instance describing values whose
     *  Java class name is java.lang.Double.
     */
    @stub
    val DOUBLE: SimpleType[Double] = ???

    /** The SimpleType instance describing values whose
     *  Java class name is java.lang.Float.
     */
    @stub
    val FLOAT: SimpleType[Float] = ???

    /** The SimpleType instance describing values whose
     *  Java class name is java.lang.Integer.
     */
    @stub
    val INTEGER: SimpleType[Integer] = ???

    /** The SimpleType instance describing values whose
     *  Java class name is java.lang.Long.
     */
    @stub
    val LONG: SimpleType[Long] = ???

    /** The SimpleType instance describing values whose
     *  Java class name is javax.management.ObjectName.
     */
    @stub
    val OBJECTNAME: SimpleType[ObjectName] = ???

    /** The SimpleType instance describing values whose
     *  Java class name is java.lang.Short.
     */
    @stub
    val SHORT: SimpleType[Short] = ???

    /** The SimpleType instance describing values whose
     *  Java class name is java.lang.String.
     */
    @stub
    val STRING: SimpleType[String] = ???

    /** The SimpleType instance describing values whose
     *  Java class name is java.lang.Void.
     */
    @stub
    val VOID: SimpleType[Void] = ???
}

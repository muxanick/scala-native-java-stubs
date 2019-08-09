package javax.management.openmbean

import java.lang.{Boolean, Byte, Character, Double, Float, Integer, Long, Object, Short, String}
import java.math.{BigDecimal, BigInteger}
import java.util.Date
import javax.management.ObjectName

// The SimpleType class is the open type class whose instances describe
// all open data values which are neither arrays,
// nor CompositeData values,
// nor TabularData values.
// It predefines all its possible instances as static fields, and has no public constructor.
// 
// Given a SimpleType instance describing values whose Java class name is className,
// the internal fields corresponding to the name and description of this SimpleType instance
// are also set to className.
// In other words, its methods getClassName, getTypeName and getDescription
// all return the same string value className.
final class SimpleType[T] extends OpenType[T] {

    @stub
    // Compares the specified obj parameter with this SimpleType instance for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the hash code value for this SimpleType instance.
    def hashCode(): Int = ???

    @stub
    // Tests whether obj is a value for this
    // SimpleType instance.
    def isValue(obj: Object): Boolean = ???

    @stub
    // Replace an object read from an ObjectInputStream with the unique instance for that
    // value.
    def readResolve(): Object = ???
}

object SimpleType {
    @stub
    // The SimpleType instance describing values whose
    // Java class name is java.math.BigDecimal.
    def BIGDECIMAL: SimpleType[BigDecimal] = ???

    @stub
    // The SimpleType instance describing values whose
    // Java class name is java.math.BigInteger.
    def BIGINTEGER: SimpleType[BigInteger] = ???

    @stub
    // The SimpleType instance describing values whose
    // Java class name is java.lang.Boolean.
    def BOOLEAN: SimpleType[Boolean] = ???

    @stub
    // The SimpleType instance describing values whose
    // Java class name is java.lang.Byte.
    def BYTE: SimpleType[Byte] = ???

    @stub
    // The SimpleType instance describing values whose
    // Java class name is java.lang.Character.
    def CHARACTER: SimpleType[Character] = ???

    @stub
    // The SimpleType instance describing values whose
    // Java class name is java.util.Date.
    def DATE: SimpleType[Date] = ???

    @stub
    // The SimpleType instance describing values whose
    // Java class name is java.lang.Double.
    def DOUBLE: SimpleType[Double] = ???

    @stub
    // The SimpleType instance describing values whose
    // Java class name is java.lang.Float.
    def FLOAT: SimpleType[Float] = ???

    @stub
    // The SimpleType instance describing values whose
    // Java class name is java.lang.Integer.
    def INTEGER: SimpleType[Integer] = ???

    @stub
    // The SimpleType instance describing values whose
    // Java class name is java.lang.Long.
    def LONG: SimpleType[Long] = ???

    @stub
    // The SimpleType instance describing values whose
    // Java class name is javax.management.ObjectName.
    def OBJECTNAME: SimpleType[ObjectName] = ???

    @stub
    // The SimpleType instance describing values whose
    // Java class name is java.lang.Short.
    def SHORT: SimpleType[Short] = ???

    @stub
    // The SimpleType instance describing values whose
    // Java class name is java.lang.String.
    def STRING: SimpleType[String] = ???
}

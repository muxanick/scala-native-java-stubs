package javax.xml.bind.annotation

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Used by XmlAccessorType to control serialization of fields or
 *  properties.
 */
class XmlAccessType private (name: String, ordinal: Int) extends Enum[XmlAccessType](name, ordinal) {
}

object XmlAccessType {
    /** Every non static, non transient field in a JAXB-bound class will be automatically
     *  bound to XML, unless annotated by XmlTransient.
     */
    final val FIELD: XmlAccessType = new XmlAccessType("FIELD", 0)

    /** None of the fields or properties is bound to XML unless they
     *  are specifically  annotated with some of the JAXB annotations.
     */
    final val NONE: XmlAccessType = new XmlAccessType("NONE", 1)

    /** Every getter/setter pair in a JAXB-bound class will be automatically
     *  bound to XML, unless annotated by XmlTransient.
     */
    final val PROPERTY: XmlAccessType = new XmlAccessType("PROPERTY", 2)

    /** Every public getter/setter pair and every public field will be
     *  automatically bound to XML, unless annotated by XmlTransient.
     */
    final val PUBLIC_MEMBER: XmlAccessType = new XmlAccessType("PUBLIC_MEMBER", 3)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): XmlAccessType = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[XmlAccessType] = ???
}

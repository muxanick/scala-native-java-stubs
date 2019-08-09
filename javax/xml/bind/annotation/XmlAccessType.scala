package javax.xml.bind.annotation

import java.lang.{Enum, Object, String}

// Used by XmlAccessorType to control serialization of fields or
// properties.
class XmlAccessType private (name: String, ordinal: Int) extends Enum[XmlAccessType](name, ordinal) {
}

object XmlAccessType {
    // Every non static, non transient field in a JAXB-bound class will be automatically
    // bound to XML, unless annotated by XmlTransient.
    final val FIELD = new XmlAccessType(FIELD, 0)

    // None of the fields or properties is bound to XML unless they
    // are specifically  annotated with some of the JAXB annotations.
    final val NONE = new XmlAccessType(NONE, 1)

    // Every getter/setter pair in a JAXB-bound class will be automatically
    // bound to XML, unless annotated by XmlTransient.
    final val PROPERTY = new XmlAccessType(PROPERTY, 2)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): XmlAccessType = ???
}

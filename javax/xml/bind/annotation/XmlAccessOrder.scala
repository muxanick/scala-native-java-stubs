package javax.xml.bind.annotation

import java.lang.{Enum, Object, String}

// Used by XmlAccessorOrder to control the ordering of properties and
// fields in a JAXB bound class.
class XmlAccessOrder private (name: String, ordinal: Int) extends Enum[XmlAccessOrder](name, ordinal) {
}

object XmlAccessOrder {
    // The ordering of fields and properties in a class is in
    // alphabetical order as determined by the
    // method java.lang.String.compareTo(String anotherString).
    final val ALPHABETICAL = new XmlAccessOrder(ALPHABETICAL, 0)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): XmlAccessOrder = ???
}

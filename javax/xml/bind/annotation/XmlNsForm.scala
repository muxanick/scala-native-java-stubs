package javax.xml.bind.annotation

import java.lang.{Enum, Object, String}

// Enumeration of XML Schema namespace qualifications.
//
// See "Package Specification" in javax.xml.bind.package javadoc for
// additional common information.
//
// Usage
// 
// The namespace qualification values are used in the annotations
// defined in this packge. The enumeration values are mapped as follows:
//
// 
// 
//   
//     
//       Enum Value
//       XML Schema Value
//     
//
//     
//       UNQUALIFIED
//       unqualified
//     
//     
//       QUALIFIED
//       qualified
//     
//     
//       UNSET
//       namespace qualification attribute is absent from the
//           XML Schema fragment
//     
//   
// 
class XmlNsForm private (name: String, ordinal: Int) extends Enum[XmlNsForm](name, ordinal) {
}

object XmlNsForm {
    // 
    final val QUALIFIED = new XmlNsForm(QUALIFIED, 0)

    // 
    final val UNQUALIFIED = new XmlNsForm(UNQUALIFIED, 1)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): XmlNsForm = ???
}

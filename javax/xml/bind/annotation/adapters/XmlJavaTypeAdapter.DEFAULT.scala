package javax.xml.bind.annotation.adapters

import java.lang.Object

// Used in XmlJavaTypeAdapter.type() to
// signal that the type be inferred from the signature
// of the field, property, parameter or the class.
object final XmlJavaTypeAdapter.DEFAULT extends Object {
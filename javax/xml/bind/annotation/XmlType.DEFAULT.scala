package javax.xml.bind.annotation

import java.lang.Object

// Used in XmlType.factoryClass() to
// signal that either factory mehod is not used or
// that it's in the class with this XmlType itself.
object final XmlType.DEFAULT extends Object {

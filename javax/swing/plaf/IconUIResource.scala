package javax.swing.plaf

import java.io.Serializable
import java.lang.Object
import javax.swing.Icon

// An Icon wrapper class which implements UIResource.  UI
// classes which set icon properties should use this class
// to wrap any icons specified as defaults.
//
// This class delegates all method invocations to the
// Icon "delegate" object specified at construction.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class IconUIResource extends Object with Icon, with UIResource, with Serializable {

    @stub
    // Returns the icon's height.
    def getIconHeight(): Int = ???

    @stub
    // Returns the icon's width.
    def getIconWidth(): Int = ???
}

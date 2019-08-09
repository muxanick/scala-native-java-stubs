package javax.swing.plaf

import java.awt.Font
import java.lang.Object

/** A subclass of java.awt.Font that implements UIResource.
 *  UI classes which set default font properties should use
 *  this class.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class FontUIResource extends Font with UIResource {

    /**  */
    @stub
    def this(font: Font) = ???
}

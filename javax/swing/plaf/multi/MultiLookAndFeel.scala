package javax.swing.plaf.multi

import java.lang.{Object, String}
import java.util.Vector
import javax.swing.{JComponent, LookAndFeel, UIDefaults}
import javax.swing.plaf.ComponentUI

// A multiplexing look and feel that allows more than one UI
// to be associated with a component at the same time.
// The primary look and feel is called
// the default look and feel,
// and the other look and feels are called auxiliary.
// 
//
// For further information, see
// Using the
// Multiplexing Look and Feel.
//
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class MultiLookAndFeel extends LookAndFeel {

    @stub
    // Creates, initializes, and returns
    // the look and feel specific defaults.
    def getDefaults(): UIDefaults = ???

    @stub
    // Returns a one-line description of this look and feel.
    def getDescription(): String = ???

    @stub
    // Returns a string, suitable for use by applications/services,
    // that identifies this look and feel.
    def getID(): String = ???

    @stub
    // Returns a string, suitable for use in menus,
    // that identifies this look and feel.
    def getName(): String = ???

    @stub
    // Returns false;
    // this look and feel is not native to any platform.
    def isNativeLookAndFeel(): Boolean = ???

    @stub
    // Returns true;
    // every platform permits this look and feel.
    def isSupportedLookAndFeel(): Boolean = ???
}

object MultiLookAndFeel {
    @stub
    // Creates the ComponentUI objects
    // required to present
    // the target component,
    // placing the objects in the uis vector and
    // returning the
    // ComponentUI object
    // that best represents the component's UI.
    def createUIs(mui: ComponentUI, uis: Vector, target: JComponent): ComponentUI = ???
}

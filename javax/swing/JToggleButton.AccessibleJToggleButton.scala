package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.awt.event.ItemListener
import java.lang.Object
import javax.accessibility.{AccessibleContext, AccessibleRole}

// This class implements accessibility support for the
// JToggleButton class.  It provides an implementation of the
// Java Accessibility API appropriate to toggle button user-interface
// elements.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
protected class JToggleButton.AccessibleJToggleButton extends AbstractButton.AccessibleAbstractButton with ItemListener {

    @stub
    // Get the role of this object.
    def getAccessibleRole(): AccessibleRole = ???
}

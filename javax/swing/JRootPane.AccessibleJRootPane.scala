package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext}

// This class implements accessibility support for the
// JRootPane class.  It provides an implementation of the
// Java Accessibility API appropriate to root pane user-interface elements.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
protected class JRootPane.AccessibleJRootPane extends JComponent.AccessibleJComponent {

    @stub
    // Returns the specified Accessible child of the object.
    def getAccessibleChild(i: Int): Accessible = ???

    @stub
    // Returns the number of accessible children of the object.
    def getAccessibleChildrenCount(): Int = ???
}

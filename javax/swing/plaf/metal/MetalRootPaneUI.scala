package javax.swing.plaf.metal

import java.beans.PropertyChangeEvent
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, RootPaneUI}
import javax.swing.plaf.basic.BasicRootPaneUI

// Provides the metal look and feel implementation of RootPaneUI.
// 
// MetalRootPaneUI provides support for the
// windowDecorationStyle property of JRootPane.
// MetalRootPaneUI does this by way of installing a custom
// LayoutManager, a private Component to render
// the appropriate widgets, and a private Border. The
// LayoutManager is always installed, regardless of the value of
// the windowDecorationStyle property, but the
// Border and Component are only installed/added if
// the windowDecorationStyle is other than
// JRootPane.NONE.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class MetalRootPaneUI extends BasicRootPaneUI {

    @stub
    // Invokes supers implementation of installUI to install
    // the necessary state onto the passed in JRootPane
    // to render the metal look and feel implementation of
    // RootPaneUI.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Invoked when a property changes.
    def propertyChange(e: PropertyChangeEvent): Unit = ???
}

object MetalRootPaneUI {
    @stub
    // Creates a UI for a JRootPane.
    def createUI(c: JComponent): ComponentUI = ???
}

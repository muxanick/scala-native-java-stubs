package javax.swing

import java.awt.{Component, Container}

// This interface is implemented by components that have a single
// JRootPane child: JDialog, JFrame, JWindow, JApplet, JInternalFrame.
// The methods in  this interface are just covers for the JRootPane
// properties, e.g. getContentPane() is generally implemented
// like this:
//     public Container getContentPane() {
//         return getRootPane().getContentPane();
//     }
// 
// This interface serves as a marker for Swing GUI builders
// that need to treat components like JFrame, that contain a
// single JRootPane, specially.  For example in a GUI builder,
// dropping a component on a RootPaneContainer would be interpreted
// as frame.getContentPane().add(child).
// 
// As a convenience, the standard classes that implement this interface
// (such as JFrame, JDialog, JWindow, JApplet,
// and JInternalFrame) have their add, remove,
// and setLayout methods overridden, so that they delegate calls
// to the corresponding methods of the ContentPane.
// For example, you can add a child component to a frame as follows:
// 
//       frame.add(child);
// 
// instead of:
// 
//       frame.getContentPane().add(child);
// 
// 
// The behavior of the add and
// setLayout methods for
// JFrame, JDialog, JWindow,
// JApplet and JInternalFrame is controlled by
// the rootPaneCheckingEnabled property. If this property is
// true (the default), then calls to these methods are
// forwarded to the contentPane; if false, these
// methods operate directly on the RootPaneContainer. This
// property is only intended for subclasses, and is therefore protected.
trait RootPaneContainer {

    @stub
    // Returns the contentPane.
    def getContentPane(): Container = ???

    @stub
    // Returns the glassPane.
    def getGlassPane(): Component = ???

    @stub
    // Returns the layeredPane.
    def getLayeredPane(): JLayeredPane = ???

    @stub
    // Return this component's single JRootPane child.
    def getRootPane(): JRootPane = ???

    @stub
    // The "contentPane" is the primary container for application
    // specific components.
    def setContentPane(contentPane: Container): Unit = ???

    @stub
    // The glassPane is always the first child of the rootPane
    // and the rootPanes layout manager ensures that it's always
    // as big as the rootPane.
    def setGlassPane(glassPane: Component): Unit = ???
}

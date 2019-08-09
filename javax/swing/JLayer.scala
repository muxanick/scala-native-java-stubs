package javax.swing

import java.awt.{Component, Container, Dimension, Graphics, LayoutManager, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.border.Border
import javax.swing.plaf.LayerUI

// JLayer is a universal decorator for Swing components
// which enables you to implement various advanced painting effects as well as
// receive notifications of all AWTEvents generated within its borders.
// 
// JLayer delegates the handling of painting and input events to a
// LayerUI object, which performs the actual decoration.
// 
// The custom painting implemented in the LayerUI and events notification
// work for the JLayer itself and all its subcomponents.
// This combination enables you to enrich existing components
// by adding new advanced functionality such as temporary locking of a hierarchy,
// data tips for compound components, enhanced mouse scrolling etc and so on.
// 
// JLayer is a good solution if you only need to do custom painting
// over compound component or catch input events from its subcomponents.
// 
// import javax.swing.*;
// import javax.swing.plaf.LayerUI;
// import java.awt.*;
//
// public class JLayerSample {
//
//     private static JLayer<JComponent> createLayer() {
//         // This custom layerUI will fill the layer with translucent green
//         // and print out all mouseMotion events generated within its borders
//         LayerUI<JComponent> layerUI = new LayerUI<JComponent>() {
//
//             public void paint(Graphics g, JComponent c) {
//                 // paint the layer as is
//                 super.paint(g, c);
//                 // fill it with the translucent green
//                 g.setColor(new Color(0, 128, 0, 128));
//                 g.fillRect(0, 0, c.getWidth(), c.getHeight());
//             }
//
//             public void installUI(JComponent c) {
//                 super.installUI(c);
//                 // enable mouse motion events for the layer's subcomponents
//                 ((JLayer) c).setLayerEventMask(AWTEvent.MOUSE_MOTION_EVENT_MASK);
//             }
//
//             public void uninstallUI(JComponent c) {
//                 super.uninstallUI(c);
//                 // reset the layer event mask
//                 ((JLayer) c).setLayerEventMask(0);
//             }
//
//             // overridden method which catches MouseMotion events
//             public void eventDispatched(AWTEvent e, JLayer<? extends JComponent> l) {
//                 System.out.println("AWTEvent detected: " + e);
//             }
//         };
//         // create a component to be decorated with the layer
//         JPanel panel = new JPanel();
//         panel.add(new JButton("JButton"));
//
//         // create the layer for the panel using our custom layerUI
//         return new JLayer<JComponent>(panel, layerUI);
//     }
//
//     private static void createAndShowGUI() {
//         final JFrame frame = new JFrame();
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//         // work with the layer as with any other Swing component
//         frame.add(createLayer());
//
//         frame.setSize(200, 200);
//         frame.setLocationRelativeTo(null);
//         frame.setVisible(true);
//     }
//
//     public static void main(String[] args) throws Exception {
//         SwingUtilities.invokeAndWait(new Runnable() {
//             public void run() {
//                 createAndShowGUI();
//             }
//         });
//     }
// }
// 
//
// Note: JLayer doesn't support the following methods:
// 
// Container.add(java.awt.Component)
// Container.add(String, java.awt.Component)
// Container.add(java.awt.Component, int)
// Container.add(java.awt.Component, Object)
// Container.add(java.awt.Component, Object, int)
// 
// using any of of them will cause UnsupportedOperationException to be thrown,
// to add a component to JLayer
// use setView(Component) or setGlassPane(JPanel).
final class JLayer[V <: Component] extends JComponent with Scrollable, with PropertyChangeListener, with Accessible {

    @stub
    // Creates a new JLayer object with a null view component
    // and default LayerUI.
    def this() = ???

    @stub
    // Creates a new JLayer object
    // with default LayerUI.
    def this(view: V) = ???

    @stub
    // This method is not supported by JLayer
    // and always throws UnsupportedOperationException
    protected def addImpl(comp: Component, constraints: Object, index: Int): Unit = ???

    @stub
    // Notifies this component that it now has a parent component.
    def addNotify(): Unit = ???

    @stub
    // Called by the constructor methods to create a default glassPane.
    def createGlassPane(): JPanel = ???

    @stub
    // Delegates its functionality to the LayerUI.doLayout(JLayer) method,
    // if LayerUI is set.
    def doLayout(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this JLayer.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the JLayer's glassPane component or null.
    def getGlassPane(): JPanel = ???

    @stub
    // Returns the bitmap of event mask to receive by this JLayer
    // and its LayerUI.
    def getLayerEventMask(): Long = ???

    @stub
    // Returns the preferred size of the viewport for a view component.
    def getPreferredScrollableViewportSize(): Dimension = ???

    @stub
    // Returns a scroll increment, which is required for components
    // that display logical rows or columns in order to completely expose
    // one block of rows or columns, depending on the value of orientation.
    def getScrollableBlockIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???

    @stub
    // Returns false to indicate that the height of the viewport does not
    // determine the height of the layer, unless the preferred height
    // of the layer is smaller than the height of the viewport.
    def getScrollableTracksViewportHeight(): Boolean = ???

    @stub
    // Returns false to indicate that the width of the viewport does not
    // determine the width of the layer, unless the preferred width
    // of the layer is smaller than the width of the viewport.
    def getScrollableTracksViewportWidth(): Boolean = ???

    @stub
    // Returns a scroll increment, which is required for components
    // that display logical rows or columns in order to completely expose
    // one new row or column, depending on the value of orientation.
    def getScrollableUnitIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???

    @stub
    // Returns the LayerUI for this JLayer.
    def getUI(): LayerUI[_ >: V] = ???

    @stub
    // Returns the JLayer's view component or null.
    def getView(): V = ???

    @stub
    // The JLayer overrides the default implementation of
    // this method (in JComponent) to return false.
    def isOptimizedDrawingEnabled(): Boolean = ???

    @stub
    // Always returns true to cause painting to originate from JLayer,
    // or one of its ancestors.
    protected def isPaintingOrigin(): Boolean = ???

    @stub
    // Delegates all painting to the LayerUI object.
    def paint(g: Graphics): Unit = ???

    @stub
    // This method is empty, because all painting is done by
    // paint(Graphics) and
    // ComponentUI.update(Graphics, JComponent) methods
    protected def paintComponent(g: Graphics): Unit = ???

    @stub
    // Delegates its functionality to the
    // LayerUI.paintImmediately(int, int, int, int, JLayer) method,
    // if LayerUI is set.
    def paintImmediately(x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // This method gets called when a bound property is changed.
    def propertyChange(evt: PropertyChangeEvent): Unit = ???

    @stub
    // Removes the specified component from this container.
    def remove(comp: Component): Unit = ???

    @stub
    // Removes all the components from this container.
    def removeAll(): Unit = ???

    @stub
    // Notifies this component that it no longer has a parent component.
    def removeNotify(): Unit = ???

    @stub
    // A non-null border, or non-zero insets, isn't supported, to prevent the geometry
    // of this component from becoming complex enough to inhibit
    // subclassing of LayerUI class.
    def setBorder(border: Border): Unit = ???

    @stub
    // Sets the JLayer's glassPane component, which can be null.
    def setGlassPane(glassPane: JPanel): Unit = ???

    @stub
    // Enables the events from JLayer and all its descendants
    // defined by the specified event mask parameter
    // to be delivered to the
    // LayerUI.eventDispatched(AWTEvent, JLayer) method.
    def setLayerEventMask(layerEventMask: Long): Unit = ???

    @stub
    // Sets the layout manager for this container.
    def setLayout(mgr: LayoutManager): Unit = ???

    @stub
    // Sets the LayerUI which will perform painting
    // and receive input events for this JLayer.
    def setUI(ui: LayerUI[_ >: V]): Unit = ???

    @stub
    // Sets the JLayer's view component, which can be null.
    def setView(view: V): Unit = ???
}

package javax.swing

import java.awt.{Component, Container, LayoutManager}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.PanelUI
import scala.scalanative.annotation.stub

/** JPanel is a generic lightweight container.
 *  For examples and task-oriented documentation for JPanel, see
 *  How to Use Panels,
 *  a section in The Java Tutorial.
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
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
class JPanel extends JComponent with Accessible {

    /** Creates a new JPanel with a double buffer
     *  and a flow layout.
     */
    @stub
    def this() = ???

    /** Creates a new JPanel with FlowLayout
     *  and the specified buffering strategy.
     */
    @stub
    def this(isDoubleBuffered: Boolean) = ???

    /** Create a new buffered JPanel with the specified layout manager */
    @stub
    def this(layout: LayoutManager) = ???

    /** Creates a new JPanel with the specified layout manager and buffering
     *  strategy.
     */
    @stub
    def this(layout: LayoutManager, isDoubleBuffered: Boolean) = ???

    /** This class implements accessibility support for the
     *  JPanel class.
     */
    @stub
    protected object AccessibleJPanel extends JPanel.AccessibleJPanel

    /** Gets the AccessibleContext associated with this JPanel. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the look and feel (L&amp;F) object that renders this component. */
    @stub
    def getUI(): PanelUI = ???

    /** Returns a string that specifies the name of the L&F class
     *  that renders this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Returns a string representation of this JPanel. */
    @stub
    protected def paramString(): String = ???

    /** Sets the look and feel (L&F) object that renders this component. */
    @stub
    def setUI(ui: PanelUI): Unit = ???

    /** Resets the UI property with a value from the current look and feel. */
    @stub
    def updateUI(): Unit = ???
}

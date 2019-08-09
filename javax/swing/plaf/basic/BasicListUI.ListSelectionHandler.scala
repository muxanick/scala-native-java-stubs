package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.ListSelectionListener

/** The ListSelectionListener that's added to the JLists selection
 *  model at installUI time, and whenever the JList.selectionModel property
 *  changes.  When the selection changes we repaint the affected rows.
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
class BasicListUI.ListSelectionHandler extends Object with ListSelectionListener {
}

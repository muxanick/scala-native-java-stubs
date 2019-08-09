package javax.swing.text

import java.lang.Object
import javax.swing.AbstractAction

/** Places content into the associated document.
 *  If there is a selection, it is removed before
 *  the new content is added.
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
object DefaultEditorKit.InsertContentAction extends TextAction {

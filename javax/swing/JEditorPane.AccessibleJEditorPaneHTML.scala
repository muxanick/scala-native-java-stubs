package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Point}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext, AccessibleText}
import javax.swing.text.JTextComponent.AccessibleJTextComponent
import scala.scalanative.annotation.stub

/** This class provides support for AccessibleHypertext,
 *  and is used in instances where the EditorKit
 *  installed in this JEditorPane is an instance of
 *  HTMLEditorKit.
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
protected class JEditorPane_AccessibleJEditorPaneHTML extends JEditorPane.AccessibleJEditorPane {

    /**  */
    @stub
    protected def AccessibleJEditorPaneHTML() = ???

    /** Returns the Accessible child, if one exists, contained at the local
     *  coordinate Point.
     */
    @stub
    def getAccessibleAt(p: Point): Accessible = ???

    /** Returns the specified Accessible child of the object. */
    @stub
    def getAccessibleChild(i: Int): Accessible = ???

    /** Returns the number of accessible children of the object. */
    @stub
    def getAccessibleChildrenCount(): Int = ???

    /** Get the AccessibleText associated with this object. */
    @stub
    def getAccessibleText(): AccessibleText = ???
}

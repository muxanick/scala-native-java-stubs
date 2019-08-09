package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Dialog.AccessibleAWTDialog, Window.AccessibleAWTWindow}
import java.lang.{Object, String}
import javax.accessibility.{AccessibleContext, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  JDialog class.  It provides an implementation of the
 *  Java Accessibility API appropriate to dialog user-interface
 *  elements.
 */
protected class JDialog.AccessibleJDialog extends Dialog.AccessibleAWTDialog {

    /**  */
    @stub
    protected def AccessibleJDialog() = ???

    /** Get the accessible name of this object. */
    @stub
    def getAccessibleName(): String = ???

    /** Get the state of this object. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???
}

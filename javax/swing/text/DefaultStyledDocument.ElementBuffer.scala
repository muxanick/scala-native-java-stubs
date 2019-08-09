package javax.swing.text

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** Class to manage changes to the element
 *  hierarchy.
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
class DefaultStyledDocument.ElementBuffer extends Object with Serializable {

    /** Creates a new ElementBuffer. */
    @stub
    def ElementBuffer(root: Element) = ???

    /** Changes content. */
    @stub
    def change(offset: Int, length: Int, de: AbstractDocument.DefaultDocumentEvent): Unit = ???

    /** Updates the element structure in response to a change in the
     *  document.
     */
    @stub
    protected def changeUpdate(): Unit = ???

    /** Creates a copy of this element, with a different
     *  parent.
     */
    @stub
    def clone(parent: Element, clonee: Element): Element = ???

    /** Gets the root element. */
    @stub
    def getRootElement(): Element = ???

    /** Inserts new content. */
    @stub
    def insert(offset: Int, length: Int, data: Array[DefaultStyledDocument.ElementSpec], de: AbstractDocument.DefaultDocumentEvent): Unit = ???

    /** Inserts an update into the document. */
    @stub
    protected def insertUpdate(data: Array[DefaultStyledDocument.ElementSpec]): Unit = ???

    /** Removes content. */
    @stub
    def remove(offset: Int, length: Int, de: AbstractDocument.DefaultDocumentEvent): Unit = ???

    /** Updates the element structure in response to a removal from the
     *  associated sequence in the document.
     */
    @stub
    protected def removeUpdate(): Unit = ???
}

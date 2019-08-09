package javax.swing.text

import java.io.Serializable
import java.lang.Object

// Class to manage changes to the element
// hierarchy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultStyledDocument.ElementBuffer extends Object with Serializable {

    @stub
    // Changes content.
    def change(offset: Int, length: Int, de: AbstractDocument.DefaultDocumentEvent): Unit = ???

    @stub
    // Updates the element structure in response to a change in the
    // document.
    protected def changeUpdate(): Unit = ???

    @stub
    // Creates a copy of this element, with a different
    // parent.
    def clone(parent: Element, clonee: Element): Element = ???

    @stub
    // Gets the root element.
    def getRootElement(): Element = ???

    @stub
    // Inserts new content.
    def insert(offset: Int, length: Int, data: Array[DefaultStyledDocument.ElementSpec], de: AbstractDocument.DefaultDocumentEvent): Unit = ???

    @stub
    // Inserts an update into the document.
    protected def insertUpdate(data: Array[DefaultStyledDocument.ElementSpec]): Unit = ???

    @stub
    // Removes content.
    def remove(offset: Int, length: Int, de: AbstractDocument.DefaultDocumentEvent): Unit = ???
}

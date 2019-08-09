package javax.swing.text

import java.io.{PrintStream, Serializable}
import java.lang.{Object, String}
import java.util.Enumeration
import javax.swing.tree.TreeNode

/** Implements the abstract part of an element.  By default elements
 *  support attributes by having a field that represents the immutable
 *  part of the current attribute set for the element.  The element itself
 *  implements MutableAttributeSet which can be used to modify the set
 *  by fetching a new immutable set.  The immutable sets are provided
 *  by the AttributeContext associated with the document.
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
abstract class AbstractDocument.AbstractElement extends Object with Element with MutableAttributeSet with Serializable with TreeNode {

    /** Adds an attribute to the element. */
    def addAttribute(name: Object, value: Object): Unit

    /** Adds a set of attributes to the element. */
    def addAttributes(attr: AttributeSet): Unit

    /** Returns the children of the receiver as an
     *  Enumeration.
     */
    def children(): Enumeration

    /** Checks whether a given attribute name/value is defined. */
    def containsAttribute(name: Object, value: Object): Boolean

    /** Checks whether the element contains all the attributes. */
    def containsAttributes(attrs: AttributeSet): Boolean

    /** Copies a set of attributes. */
    def copyAttributes(): AttributeSet

    /** Dumps a debugging representation of the element hierarchy. */
    def dump(psOut: PrintStream, indentAmount: Int): Unit

    /** Returns true if the receiver allows children. */
    def getAllowsChildren(): Boolean

    /** Gets the value of an attribute. */
    def getAttribute(attrName: Object): Object

    /** Gets the number of attributes that are defined. */
    def getAttributeCount(): Int

    /** Gets the names of all attributes. */
    def getAttributeNames(): Enumeration[_]

    /** Gets the attributes for the element. */
    def getAttributes(): AttributeSet

    /** Returns the child TreeNode at index
     *  childIndex.
     */
    def getChildAt(childIndex: Int): TreeNode

    /** Returns the number of children TreeNode's
     *  receiver contains.
     */
    def getChildCount(): Int

    /** Retrieves the underlying model. */
    def getDocument(): Document

    /** Gets a child element. */
    def getElement(index: Int): Element

    /** Gets the number of children for the element. */
    def getElementCount(): Int

    /** Gets the child element index closest to the given model offset. */
    def getElementIndex(offset: Int): Int

    /** Gets the ending offset in the model for the element. */
    def getEndOffset(): Int

    /** Returns the index of node in the receivers children. */
    def getIndex(node: TreeNode): Int

    /** Gets the name of the element. */
    def getName(): String

    /** Returns the parent TreeNode of the receiver. */
    def getParent(): TreeNode

    /** Gets the parent of the element. */
    def getParentElement(): Element

    /** Gets the resolving parent. */
    def getResolveParent(): AttributeSet

    /** Gets the starting offset in the model for the element. */
    def getStartOffset(): Int

    /** Checks whether a given attribute is defined. */
    def isDefined(attrName: Object): Boolean

    /** Checks whether two attribute sets are equal. */
    def isEqual(attr: AttributeSet): Boolean

    /** Checks whether the element is a leaf. */
    def isLeaf(): Boolean

    /** Removes an attribute from the set. */
    def removeAttribute(name: Object): Unit

    /** Removes a set of attributes for the element. */
    def removeAttributes(attrs: AttributeSet): Unit

    /** Removes a set of attributes for the element. */
    def removeAttributes(names: Enumeration[_]): Unit
}

package javax.xml.validation

import java.lang.Object
import scala.scalanative.annotation.stub

/** This class provides access to the type information determined
 *  by ValidatorHandler.
 * 
 *  
 *  Some schema languages, such as W3C XML Schema, encourages a validator
 *  to report the "type" it assigns to each attribute/element.
 *  Those applications who wish to access this type information can invoke
 *  methods defined on this "interface" to access such type information.
 * 
 *  
 *  Implementation of this "interface" can be obtained through the
 *  ValidatorHandler.getTypeInfoProvider() method.
 */
abstract class TypeInfoProvider extends Object {

    /** Constructor for the derived class. */
    @stub
    protected def this() = ???

    /** Returns the immutable TypeInfo object for the specified
     *  attribute of the current element.
     */
    def getAttributeTypeInfo(index: Int): TypeInfo

    /** Returns the immutable TypeInfo object for the current
     *  element.
     */
    def getElementTypeInfo(): TypeInfo

    /** Returns true if the specified attribute is determined
     *  to be ID.
     */
    def isIdAttribute(index: Int): Boolean

    /** Returns false if the attribute was added by the validator. */
    def isSpecified(index: Int): Boolean
}

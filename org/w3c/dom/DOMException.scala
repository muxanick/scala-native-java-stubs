package org.w3c.dom

import java.lang.{Exception, Object, RuntimeException, Throwable}

// DOM operations only raise exceptions in "exceptional" circumstances, i.e.,
// when an operation is impossible to perform (either for logical reasons,
// because data is lost, or because the implementation has become unstable).
// In general, DOM methods return specific error values in ordinary
// processing situations, such as out-of-bound errors when using
// NodeList.
// Implementations should raise other exceptions under other circumstances.
// For example, implementations should raise an implementation-dependent
// exception if a null argument is passed when null
//  was not expected.
// Some languages and object systems do not support the concept of
// exceptions. For such systems, error conditions may be indicated using
// native error reporting mechanisms. For some bindings, for example,
// methods may return error codes similar to those listed in the
// corresponding method descriptions.
// See also the Document Object Model (DOM) Level 3 Core Specification.
class DOMException extends RuntimeException {

    @stub
    // 
    def code: Short = ???
}

object DOMException {
    @stub
    // If the specified range of text does not fit into a
    // DOMString.
    def DOMSTRING_SIZE_ERR: Short = ???

    @stub
    // If any Node is inserted somewhere it doesn't belong.
    def HIERARCHY_REQUEST_ERR: Short = ???

    @stub
    // If index or size is negative, or greater than the allowed value.
    def INDEX_SIZE_ERR: Short = ???

    @stub
    // If an attempt is made to add an attribute that is already in use
    // elsewhere.
    def INUSE_ATTRIBUTE_ERR: Short = ???

    @stub
    // If a parameter or an operation is not supported by the underlying
    // object.
    def INVALID_ACCESS_ERR: Short = ???

    @stub
    // If an invalid or illegal character is specified, such as in an XML name.
    def INVALID_CHARACTER_ERR: Short = ???

    @stub
    // If an attempt is made to modify the type of the underlying object.
    def INVALID_MODIFICATION_ERR: Short = ???

    @stub
    // If an attempt is made to use an object that is not, or is no longer,
    // usable.
    def INVALID_STATE_ERR: Short = ???

    @stub
    // If an attempt is made to create or change an object in a way which is
    // incorrect with regard to namespaces.
    def NAMESPACE_ERR: Short = ???

    @stub
    // If data is specified for a Node which does not support
    // data.
    def NO_DATA_ALLOWED_ERR: Short = ???

    @stub
    // If an attempt is made to modify an object where modifications are not
    // allowed.
    def NO_MODIFICATION_ALLOWED_ERR: Short = ???

    @stub
    // If an attempt is made to reference a Node in a context
    // where it does not exist.
    def NOT_FOUND_ERR: Short = ???

    @stub
    // If the implementation does not support the requested type of object or
    // operation.
    def NOT_SUPPORTED_ERR: Short = ???

    @stub
    // If an invalid or illegal string is specified.
    def SYNTAX_ERR: Short = ???

    @stub
    // If the type of an object is incompatible with the expected type of the
    // parameter associated to the object.
    def TYPE_MISMATCH_ERR: Short = ???

    @stub
    // If a call to a method such as insertBefore or
    // removeChild would make the Node invalid
    // with respect to "partial validity", this exception would be raised
    // and the operation would not be done.
    def VALIDATION_ERR: Short = ???
}

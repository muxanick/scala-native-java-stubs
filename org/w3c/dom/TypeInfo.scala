package org.w3c.dom

import java.lang.String

// The TypeInfo interface represents a type referenced from
// Element or Attr nodes, specified in the schemas
// associated with the document. The type is a pair of a namespace URI and
// name properties, and depends on the document's schema.
//  If the document's schema is an XML DTD [XML 1.0], the values
// are computed as follows:
// 
//  If this type is referenced from an
// Attr node, typeNamespace is
// "http://www.w3.org/TR/REC-xml" and typeName
// represents the [attribute type] property in the [XML Information Set]
// . If there is no declaration for the attribute, typeNamespace
//  and typeName are null.
// 
//  If this type is
// referenced from an Element node, typeNamespace
// and typeName are null.
// 
// 
//  If the document's schema is an XML Schema [XML Schema Part 1]
// , the values are computed as follows using the post-schema-validation
// infoset contributions (also called PSVI contributions):
// 
//  If the [validity] property exists AND is "invalid" or "notKnown": the {target namespace} and {name} properties of the declared type if
// available, otherwise null.
// Note:  At the time of writing, the XML Schema specification does
// not require exposing the declared type. Thus, DOM implementations might
// choose not to provide type information if validity is not valid.
// 
//  If the [validity] property exists and is "valid":
// 
//  If [member type definition] exists:
// 
// If {name} is not absent, then expose {name} and {target
// namespace} properties of the [member type definition] property;
// 
// Otherwise, expose the namespace and local name of the
// corresponding anonymous type name.
// 
// 
// 
//  If the [type definition] property exists:
// 
// If {name} is not absent, then expose {name} and {target
// namespace} properties of the [type definition] property;
// 
// Otherwise, expose the namespace and local name of the
// corresponding anonymous type name.
// 
// 
// 
//  If the [member type definition anonymous] exists:
// 
// If it is false, then expose [member type definition name] and [member type definition namespace] properties;
// 
// Otherwise, expose the namespace and local name of the
// corresponding anonymous type name.
// 
// 
// 
//  If the [type definition anonymous] exists:
// 
// If it is false, then expose [type definition name] and [type definition namespace] properties;
// 
// Otherwise, expose the namespace and local name of the
// corresponding anonymous type name.
// 
// 
// 
// 
// 
// 
// Note:  Other schema languages are outside the scope of the W3C
// and therefore should define how to represent their type systems using
// TypeInfo.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait TypeInfo {

    @stub
    // The name of a type declared for the associated element or attribute,
    // or null if unknown.
    def getTypeName(): String = ???

    @stub
    // The namespace of the type declared for the associated element or
    // attribute or null if the element does not have
    // declaration or if no namespace information is available.
    def getTypeNamespace(): String = ???
}

object TypeInfo {
    @stub
    // If the document's schema is an XML Schema [XML Schema Part 1]
    // , this constant represents the derivation by 
    // extension.
    def DERIVATION_EXTENSION: Int = ???

    @stub
    // If the document's schema is an XML Schema [XML Schema Part 1]
    // , this constant represents the list.
    def DERIVATION_LIST: Int = ???

    @stub
    // If the document's schema is an XML Schema [XML Schema Part 1]
    // , this constant represents the derivation by 
    // restriction if complex types are involved, or a 
    // restriction if simple types are involved.
    def DERIVATION_RESTRICTION: Int = ???
}

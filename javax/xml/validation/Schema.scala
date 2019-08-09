package javax.xml.validation

import java.lang.Object

// Immutable in-memory representation of grammar.
//
// 
// This object represents a set of constraints that can be checked/
// enforced against an XML document.
//
// 
// A Schema object is thread safe and applications are
// encouraged to share it across many parsers in many threads.
//
// 
// A Schema object is immutable in the sense that it shouldn't
// change the set of constraints once it is created. In other words,
// if an application validates the same document twice against the same
// Schema, it must always produce the same result.
//
// 
// A Schema object is usually created from SchemaFactory.
//
// 
// Two kinds of validators can be created from a Schema object.
// One is Validator, which provides highly-level validation
// operations that cover typical use cases. The other is
// ValidatorHandler, which works on top of SAX for better
// modularity.
//
// 
// This specification does not refine
// the Object.equals(java.lang.Object) method.
// In other words, if you parse the same schema twice, you may
// still get !schemaA.equals(schemaB).
abstract class Schema extends Object {

    // Creates a new Validator for this Schema.
    def newValidator(): Validator
}

package javax.tools

import javax.lang.model.element.{Modifier, NestingKind}

// File abstraction for tools operating on Java™ programming language
// source and class files.
//
// All methods in this interface might throw a SecurityException if
// a security exception occurs.
//
// Unless explicitly allowed, all methods in this interface might
// throw a NullPointerException if given a null argument.
trait JavaFileObject extends FileObject {

    @stub
    // Provides a hint about the access level of the class represented
    // by this file object.
    def getAccessLevel(): Modifier = ???

    @stub
    // Gets the kind of this file object.
    def getKind(): JavaFileObject.Kind = ???

    @stub
    // Provides a hint about the nesting level of the class
    // represented by this file object.
    def getNestingKind(): NestingKind = ???
}

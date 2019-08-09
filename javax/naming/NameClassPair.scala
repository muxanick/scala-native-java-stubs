package javax.naming

import java.io.Serializable
import java.lang.{Object, String}

// This class represents the object name and class name pair of a binding
// found in a context.
//
// A context consists of name-to-object bindings.
// The NameClassPair class represents the name and the
// class of the bound object. It consists
// of a name and a string representing the
// package-qualified class name.
//
// Use subclassing for naming systems that generate contents of
// a name/class pair dynamically.
//
// A NameClassPair instance is not synchronized against concurrent
// access by multiple threads. Threads that need to access a NameClassPair
// concurrently should synchronize amongst themselves and provide
// the necessary locking.
class NameClassPair extends Object with Serializable {

    @stub
    // Constructs an instance of a NameClassPair given its
    // name and class name.
    def this(name: String, className: String) = ???

    @stub
    // Retrieves the class name of the object bound to the name of this binding.
    def getClassName(): String = ???

    @stub
    // Retrieves the name of this binding.
    def getName(): String = ???

    @stub
    // Retrieves the full name of this binding.
    def getNameInNamespace(): String = ???

    @stub
    // Determines whether the name of this binding is
    // relative to the target context (which is named by
    // the first parameter of the list() method).
    def isRelative(): Boolean = ???

    @stub
    // Sets the class name of this binding.
    def setClassName(name: String): Unit = ???

    @stub
    // Sets the name of this binding.
    def setName(name: String): Unit = ???

    @stub
    // Sets the full name of this binding.
    def setNameInNamespace(fullName: String): Unit = ???

    @stub
    // Sets whether the name of this binding is relative to the target
    // context (which is named by the first parameter of the list()
    // method).
    def setRelative(r: Boolean): Unit = ???
}

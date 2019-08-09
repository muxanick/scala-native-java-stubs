package javax.naming

import java.lang.{Object, String}

// This class represents a name-to-object binding found in a context.
//
// A context consists of name-to-object bindings.
// The Binding class represents such a binding.  It consists
// of a name and an object. The Context.listBindings()
// method returns an enumeration of Binding.
//
// Use subclassing for naming systems that generate contents of
// a binding dynamically.
//
// A Binding instance is not synchronized against concurrent access by multiple
// threads. Threads that need to access a Binding concurrently should
// synchronize amongst themselves and provide the necessary locking.
class Binding extends NameClassPair {

    @stub
    // Constructs an instance of a Binding given its name and object.
    def this(name: String, obj: Object) = ???

    @stub
    // Constructs an instance of a Binding given its name, object, and whether
    // the name is relative.
    def this(name: String, obj: Object, isRelative: Boolean) = ???

    @stub
    // Constructs an instance of a Binding given its name, class name, and object.
    def this(name: String, className: String, obj: Object) = ???

    @stub
    // Retrieves the class name of the object bound to the name of this binding.
    def getClassName(): String = ???

    @stub
    // Retrieves the object bound to the name of this binding.
    def getObject(): Object = ???

    @stub
    // Sets the object associated with this binding.
    def setObject(obj: Object): Unit = ???
}

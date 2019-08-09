package java.lang.reflect

// ParameterizedType represents a parameterized type such as
// Collection<String>.
//
// A parameterized type is created the first time it is needed by a
// reflective method, as specified in this package. When a
// parameterized type p is created, the generic type declaration that
// p instantiates is resolved, and all type arguments of p are created
// recursively. See TypeVariable for details on the creation process for type
// variables. Repeated creation of a parameterized type has no effect.
//
// Instances of classes that implement this interface must implement
// an equals() method that equates any two instances that share the
// same generic type declaration and have equal type parameters.
trait ParameterizedType extends Type {

    @stub
    // Returns an array of Type objects representing the actual type
    // arguments to this type.
    def getActualTypeArguments(): Array[Type] = ???

    @stub
    // Returns a Type object representing the type that this type
    // is a member of.
    def getOwnerType(): Type = ???
}

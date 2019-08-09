package java.lang.reflect

// WildcardType represents a wildcard type expression, such as
// ?, ? extends Number, or ? super Integer.
trait WildcardType extends Type {

    @stub
    // Returns an array of Type objects representing the
    // lower bound(s) of this type variable.
    def getLowerBounds(): Array[Type] = ???
}

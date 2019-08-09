package java.lang.reflect

// AnnotatedWildcardType represents the potentially annotated use of a
// wildcard type argument, whose upper or lower bounds may themselves represent
// annotated uses of types.
trait AnnotatedWildcardType extends AnnotatedType {

    @stub
    // Returns the potentially annotated lower bounds of this wildcard type.
    def getAnnotatedLowerBounds(): Array[AnnotatedType] = ???
}

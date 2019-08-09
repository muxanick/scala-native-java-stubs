package javax.lang.model.type

// Represents a wildcard type argument.
// Examples include:    
//   ?
//   ? extends Number
//   ? super T
// 
//
//  A wildcard may have its upper bound explicitly set by an
// extends clause, its lower bound explicitly set by a
// super clause, or neither (but not both).
trait WildcardType extends TypeMirror {

    @stub
    // Returns the upper bound of this wildcard.
    def getExtendsBound(): TypeMirror = ???
}

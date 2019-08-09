package javax.lang.model.util

import java.lang.{Iterable, Object}
import java.util.{List, Set}
import javax.lang.model.element.{Element, ExecutableElement, PackageElement, TypeElement, VariableElement}

// Filters for selecting just the elements of interest from a
// collection of elements.  The returned sets and lists are new
// collections and do use the argument as a backing store.  The
// methods in this class do not make any attempts to guard against
// concurrent modifications of the arguments.  The returned sets and
// lists are mutable but unsafe for concurrent access.  A returned set
// has the same iteration order as the argument set to a method.
//
// If iterables and sets containing null are passed as
// arguments to methods in this class, a NullPointerException
// will be thrown.
//
// Note that a static import statement can make the text of
// calls to the methods in this class more concise; for example:
//
// 
//     import static javax.lang.model.util.ElementFilter.*;
//     ...
//          List<VariableElement> fs = fieldsIn(someClass.getEnclosedElements());
// 
class ElementFilter extends Object {
}

object ElementFilter {
    @stub
    // Returns a list of constructors in elements.
    def constructorsIn(elements: Iterable[_ <: Element]): List[ExecutableElement] = ???

    @stub
    // Returns a set of constructors in elements.
    def constructorsIn(elements: Set[_ <: Element]): Set[ExecutableElement] = ???

    @stub
    // Returns a list of fields in elements.
    def fieldsIn(elements: Iterable[_ <: Element]): List[VariableElement] = ???

    @stub
    // Returns a set of fields in elements.
    def fieldsIn(elements: Set[_ <: Element]): Set[VariableElement] = ???

    @stub
    // Returns a list of methods in elements.
    def methodsIn(elements: Iterable[_ <: Element]): List[ExecutableElement] = ???

    @stub
    // Returns a set of methods in elements.
    def methodsIn(elements: Set[_ <: Element]): Set[ExecutableElement] = ???

    @stub
    // Returns a list of packages in elements.
    def packagesIn(elements: Iterable[_ <: Element]): List[PackageElement] = ???

    @stub
    // Returns a set of packages in elements.
    def packagesIn(elements: Set[_ <: Element]): Set[PackageElement] = ???

    @stub
    // Returns a list of types in elements.
    def typesIn(elements: Iterable[_ <: Element]): List[TypeElement] = ???
}

package javax.annotation.processing

import java.lang.Class
import java.lang.annotation.Annotation
import java.util.Set
import javax.lang.model.element.{Element, TypeElement}

// An annotation processing tool framework will provide an annotation processor with an object
// implementing this interface so that the processor can query for
// information about a round of annotation processing.
trait RoundEnvironment {

    @stub
    // Returns true if an error was raised in the prior round
    // of processing; returns false otherwise.
    def errorRaised(): Boolean = ???

    @stub
    // Returns the elements annotated with the given annotation type.
    def getElementsAnnotatedWith(a: Class[_ <: Annotation]): Set[_ <: Element] = ???

    @stub
    // Returns the elements annotated with the given annotation type.
    def getElementsAnnotatedWith(a: TypeElement): Set[_ <: Element] = ???

    @stub
    // Returns the root elements for annotation processing generated
    // by the prior round.
    def getRootElements(): Set[_ <: Element] = ???
}

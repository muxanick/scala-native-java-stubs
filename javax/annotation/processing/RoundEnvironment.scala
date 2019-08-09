package javax.annotation.processing

import java.lang.Class
import java.lang.annotation.Annotation
import java.util.Set
import javax.lang.model.element.{Element, TypeElement}

/** An annotation processing tool framework will provide an annotation processor with an object
 *  implementing this interface so that the processor can query for
 *  information about a round of annotation processing.
 */
trait RoundEnvironment {

    /** Returns true if an error was raised in the prior round
     *  of processing; returns false otherwise.
     */
    @stub
    def errorRaised(): Boolean = ???

    /** Returns the elements annotated with the given annotation type. */
    @stub
    def getElementsAnnotatedWith(a: Class[_ <: Annotation]): Set[_ <: Element] = ???

    /** Returns the elements annotated with the given annotation type. */
    @stub
    def getElementsAnnotatedWith(a: TypeElement): Set[_ <: Element] = ???

    /** Returns the root elements for annotation processing generated
     *  by the prior round.
     */
    @stub
    def getRootElements(): Set[_ <: Element] = ???
}

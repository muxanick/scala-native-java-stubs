package javax.annotation.processing

import java.lang.{Iterable, Object, String}
import java.util.Set
import javax.lang.model.SourceVersion
import javax.lang.model.element.{AnnotationMirror, Element, ExecutableElement}

// An abstract annotation processor designed to be a convenient
// superclass for most concrete annotation processors.  This class
// examines annotation values to compute the options, annotation types, and source version supported by its
// subtypes.
//
// The getter methods may issue
// warnings about noteworthy conditions using the facilities available
// after the processor has been initialized.
//
// Subclasses are free to override the implementation and
// specification of any of the methods in this class as long as the
// general Processor
// contract for that method is obeyed.
abstract class AbstractProcessor extends Object with Processor {

    // Returns an empty iterable of completions.
    def getCompletions(element: Element, annotation: AnnotationMirror, member: ExecutableElement, userText: String): Iterable[_ <: Completion]

    // If the processor class is annotated with SupportedAnnotationTypes, return an unmodifiable set with the
    // same set of strings as the annotation.
    def getSupportedAnnotationTypes(): Set[String]

    // If the processor class is annotated with SupportedOptions, return an unmodifiable set with the same set
    // of strings as the annotation.
    def getSupportedOptions(): Set[String]

    // If the processor class is annotated with SupportedSourceVersion, return the source version in the
    // annotation.
    def getSupportedSourceVersion(): SourceVersion

    // Initializes the processor with the processing environment by
    // setting the processingEnv field to the value of the
    // processingEnv argument.
    def init(processingEnv: ProcessingEnvironment): Unit

    // Returns true if this object has been initialized, false otherwise.
    protected def isInitialized(): Boolean
}

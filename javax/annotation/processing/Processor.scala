package javax.annotation.processing

import java.lang.{Iterable, String}
import java.util.Set
import javax.lang.model.SourceVersion
import javax.lang.model.element.{AnnotationMirror, Element, ExecutableElement}

/** The interface for an annotation processor.
 * 
 *  Annotation processing happens in a sequence of rounds.  On each
 *  round, a processor may be asked to process a
 *  subset of the annotations found on the source and class files
 *  produced by a prior round.  The inputs to the first round of
 *  processing are the initial inputs to a run of the tool; these
 *  initial inputs can be regarded as the output of a virtual zeroth
 *  round of processing.  If a processor was asked to process on a
 *  given round, it will be asked to process on subsequent rounds,
 *  including the last round, even if there are no annotations for it
 *  to process.  The tool infrastructure may also ask a processor to
 *  process files generated implicitly by the tool's operation.
 * 
 *   Each implementation of a Processor must provide a
 *  public no-argument constructor to be used by tools to instantiate
 *  the processor.  The tool infrastructure will interact with classes
 *  implementing this interface as follows:
 * 
 *  
 * 
 *  If an existing Processor object is not being used, to
 *  create an instance of a processor the tool calls the no-arg
 *  constructor of the processor class.
 * 
 *  Next, the tool calls the init method with
 *  an appropriate ProcessingEnvironment.
 * 
 *  Afterwards, the tool calls getSupportedAnnotationTypes, getSupportedOptions, and getSupportedSourceVersion.  These methods are only called once per
 *  run, not on each round.
 * 
 *  As appropriate, the tool calls the process
 *  method on the Processor object; a new Processor
 *  object is not created for each round.
 * 
 *  
 * 
 *  If a processor object is created and used without the above
 *  protocol being followed, then the processor's behavior is not
 *  defined by this interface specification.
 * 
 *   The tool uses a discovery process to find annotation
 *  processors and decide whether or not they should be run.  By
 *  configuring the tool, the set of potential processors can be
 *  controlled.  For example, for a JavaCompiler the list of candidate processors to run can be
 *  set directly or controlled by a search path
 *  used for a service-style
 *  lookup.  Other tool implementations may have different
 *  configuration mechanisms, such as command line options; for
 *  details, refer to the particular tool's documentation.  Which
 *  processors the tool asks to run is a function
 *  of the types of the annotations present
 *  on the root elements, what annotation types a processor
 *  supports, and whether or not a processor claims the annotation types it processes.  A processor will be asked to
 *  process a subset of the annotation types it supports, possibly an
 *  empty set.
 * 
 *  For a given round, the tool computes the set of annotation types
 *  that are present on the elements enclosed within the root elements.
 *  If there is at least one annotation type present, then as
 *  processors claim annotation types, they are removed from the set of
 *  unmatched annotation types.  When the set is empty or no more
 *  processors are available, the round has run to completion.  If
 *  there are no annotation types present, annotation processing still
 *  occurs but only universal processors which support
 *  processing all annotation types, "*", can claim the (empty)
 *  set of annotation types.
 * 
 *  An annotation type is considered present if there is at least
 *  one annotation of that type present on an element enclosed within
 *  the root elements of a round. For this purpose, a type parameter is
 *  considered to be enclosed by its generic
 *  element. Annotations on type uses, as opposed to
 *  annotations on elements, are ignored when computing whether or not
 *  an annotation type is present.
 * 
 *  An annotation is present if it meets the definition of being
 *  present given in AnnotatedConstruct. In brief, an
 *  annotation is considered present for the purposes of discovery if
 *  it is directly present or present via inheritance. An annotation is
 *  not considered present by virtue of being wrapped by a
 *  container annotation. Operationally, this is equivalent to an
 *  annotation being present on an element if and only if it would be
 *  included in the results of Elements.getAllAnnotationMirrors(Element) called on that element. Since
 *  annotations inside container annotations are not considered
 *  present, to properly process repeatable annotation types,
 *  processors are advised to include both the repeatable annotation
 *  type and its containing annotation type in the set of supported annotation types of a
 *  processor.
 * 
 *  Note that if a processor supports "*" and returns true, all annotations are claimed.  Therefore, a universal
 *  processor being used to, for example, implement additional validity
 *  checks should return false so as to not prevent other such
 *  checkers from being able to run.
 * 
 *  If a processor throws an uncaught exception, the tool may cease
 *  other active annotation processors.  If a processor raises an
 *  error, the current round will run to completion and the subsequent
 *  round will indicate an error was raised.  Since annotation processors are run in a
 *  cooperative environment, a processor should throw an uncaught
 *  exception only in situations where no error recovery or reporting
 *  is feasible.
 * 
 *  The tool environment is not required to support annotation
 *  processors that access environmental resources, either per round or cross-round, in a multi-threaded fashion.
 * 
 *  If the methods that return configuration information about the
 *  annotation processor return null, return other invalid
 *  input, or throw an exception, the tool infrastructure must treat
 *  this as an error condition.
 * 
 *  To be robust when running in different tool implementations, an
 *  annotation processor should have the following properties:
 * 
 *  
 * 
 *  The result of processing a given input is not a function of the presence or absence
 *  of other inputs (orthogonality).
 * 
 *  Processing the same input produces the same output (consistency).
 * 
 *  Processing input A followed by processing input B
 *  is equivalent to processing B then A
 *  (commutativity)
 * 
 *  Processing an input does not rely on the presence of the output
 *  of other annotation processors (independence)
 * 
 *  
 * 
 *  The Filer interface discusses restrictions on how
 *  processors can operate on files.
 * 
 *  Note that implementors of this interface may find it convenient
 *  to extend AbstractProcessor rather than implementing this
 *  interface directly.
 */
trait Processor {

    /** Returns to the tool infrastructure an iterable of suggested
     *  completions to an annotation.
     */
    @stub
    def getCompletions(element: Element, annotation: AnnotationMirror, member: ExecutableElement, userText: String): Iterable[_ <: Completion] = ???

    /** Returns the names of the annotation types supported by this
     *  processor.
     */
    @stub
    def getSupportedAnnotationTypes(): Set[String] = ???

    /** Returns the options recognized by this processor. */
    @stub
    def getSupportedOptions(): Set[String] = ???

    /** Returns the latest source version supported by this annotation
     *  processor.
     */
    @stub
    def getSupportedSourceVersion(): SourceVersion = ???

    /** Initializes the processor with the processing environment. */
    @stub
    def init(processingEnv: ProcessingEnvironment): Unit = ???
}

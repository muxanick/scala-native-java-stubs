package javax.annotation.processing

import java.lang.String
import java.util.{Locale, Map}
import javax.lang.model.SourceVersion
import javax.lang.model.util.Elements

/** An annotation processing tool framework will provide an annotation processor with an object
 *  implementing this interface so the processor can use facilities
 *  provided by the framework to write new files, report error
 *  messages, and find other utilities.
 * 
 *  Third parties may wish to provide value-add wrappers around the
 *  facility objects from this interface, for example a Filer
 *  extension that allows multiple processors to coordinate writing out
 *  a single source file.  To enable this, for processors running in a
 *  context where their side effects via the API could be visible to
 *  each other, the tool infrastructure must provide corresponding
 *  facility objects that are .equals, Filers that are
 *  .equals, and so on.  In addition, the tool invocation must
 *  be able to be configured such that from the perspective of the
 *  running annotation processors, at least the chosen subset of helper
 *  classes are viewed as being loaded by the same class loader.
 *  (Since the facility objects manage shared state, the implementation
 *  of a wrapper class must know whether or not the same base facility
 *  object has been wrapped before.)
 */
trait ProcessingEnvironment {

    /** Returns an implementation of some utility methods for
     *  operating on elements
     */
    @stub
    def getElementUtils(): Elements = ???

    /** Returns the filer used to create new source, class, or auxiliary
     *  files.
     */
    @stub
    def getFiler(): Filer = ???

    /** Returns the current locale or null if no locale is in
     *  effect.
     */
    @stub
    def getLocale(): Locale = ???

    /** Returns the messager used to report errors, warnings, and other
     *  notices.
     */
    @stub
    def getMessager(): Messager = ???

    /** Returns the processor-specific options passed to the annotation
     *  processing tool.
     */
    @stub
    def getOptions(): Map[String, String] = ???

    /** Returns the source version that any generated source and class files should conform to. */
    @stub
    def getSourceVersion(): SourceVersion = ???
}

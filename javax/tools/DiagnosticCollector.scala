package javax.tools

import java.lang.Object
import java.util.List
import scala.scalanative.annotation.stub

/** Provides an easy way to collect diagnostics in a list. */
final class DiagnosticCollector[S] extends Object with DiagnosticListener[S] {

    /**  */
    @stub
    def this() = ???

    /** Gets a list view of diagnostics collected by this object. */
    @stub
    def getDiagnostics(): List[Diagnostic[_ <: S]] = ???

    /** Invoked when a problem is found. */
    @stub
    def report(diagnostic: Diagnostic[_ <: S]): Unit = ???
}

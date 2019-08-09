package javax.tools

import java.lang.Object
import java.util.List

/** Provides an easy way to collect diagnostics in a list. */
final class DiagnosticCollector[S] extends Object with DiagnosticListener[S] {

    /** Gets a list view of diagnostics collected by this object. */
    @stub
    def getDiagnostics(): List[Diagnostic[_ <: S]] = ???
}

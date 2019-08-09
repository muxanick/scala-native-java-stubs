package javax.xml.transform.dom

import javax.xml.transform.SourceLocator

// Indicates the position of a node in a source DOM, intended
// primarily for error reporting.  To use a DOMLocator, the receiver of an
// error must downcast the SourceLocator
// object returned by an exception. A Transformer
// may use this object for purposes other than error reporting, for instance,
// to indicate the source node that originated a result node.
trait DOMLocator extends SourceLocator {
}

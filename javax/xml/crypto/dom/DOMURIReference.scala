package javax.xml.crypto.dom

import javax.xml.crypto.URIReference

/** A DOM-specific URIReference. The purpose of this class is to
 *  provide additional context necessary for resolving XPointer URIs or
 *  same-document references.
 */
trait DOMURIReference extends URIReference {
}

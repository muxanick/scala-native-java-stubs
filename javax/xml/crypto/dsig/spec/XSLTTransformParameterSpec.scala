package javax.xml.crypto.dsig.spec

import java.lang.Object

// Parameters for the 
// XSLT Transform Algorithm.
// The parameters include a namespace-qualified stylesheet element.
//
// An XSLTTransformParameterSpec is instantiated with a
// mechanism-dependent (ex: DOM) stylesheet element. For example:
// 
//   DOMStructure stylesheet = new DOMStructure(element)
//   XSLTTransformParameterSpec spec = new XSLTransformParameterSpec(stylesheet);
// 
// where element is an Element containing
// the namespace-qualified stylesheet element.
final class XSLTTransformParameterSpec extends Object with TransformParameterSpec {
}

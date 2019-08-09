package javax.xml.crypto.dsig.spec

import java.lang.Object

// Parameters for the 
// XML Signature HMAC Algorithm. The parameters include an optional output
// length which specifies the MAC truncation length in bits. The resulting
// HMAC will be truncated to the specified number of bits. If the parameter is
// not specified, then this implies that all the bits of the hash are to be
// output. The XML Schema Definition of the HMACOutputLength
// element is defined as:
// 
// <element name="HMACOutputLength" minOccurs="0" type="ds:HMACOutputLengthType"/>
// <simpleType name="HMACOutputLengthType">
//   <restriction base="integer"/>
// </simpleType>
// 
final class HMACParameterSpec extends Object with SignatureMethodParameterSpec {
}

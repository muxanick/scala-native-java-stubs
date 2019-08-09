package javax.xml.ws.soap

import java.lang.{Enum, Object, String}

// If addressing is enabled, this property determines if endpoint requires
// the use of only anonymous responses, or only non-anonymous responses, or all.
//
// 
// ALL supports all response types and this is the default
// value.
//
// 
// ANONYMOUS requires the use of only anonymous
// responses. It will result into wsam:AnonymousResponses nested assertion
// as specified in
// 
// 3.1.2 AnonymousResponses Assertion in the generated WSDL.
//
// 
// NON_ANONYMOUS requires the use of only non-anonymous
// responses. It will result into
// wsam:NonAnonymousResponses nested assertion as specified in
// 
// 3.1.3 NonAnonymousResponses Assertion in the generated WSDL.
class AddressingFeature.Responses private (name: String, ordinal: Int) extends Enum[AddressingFeature.Responses](name, ordinal) {
}

object AddressingFeature.Responses {
    // Supports all response types and this is the default
    final val ALL = new AddressingFeature.Responses(ALL, 0)

    // Specifies the use of only anonymous
    // responses.
    final val ANONYMOUS = new AddressingFeature.Responses(ANONYMOUS, 1)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): AddressingFeature.Responses = ???
}

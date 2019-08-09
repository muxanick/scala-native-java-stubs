package javax.print.attribute

import scala.scalanative.annotation.stub

/** Interface SupportedValuesAttribute is a tagging interface which a printing
 *  attribute class implements to indicate the attribute describes the supported
 *  values for another attribute. For example, if a Print Service instance
 *  supports the Copies
 *  attribute, the Print Service instance will have a CopiesSupported attribute,
 *  which is a SupportedValuesAttribute giving the legal values a client may
 *  specify for the Copies
 *  attribute.
 *  
 */
trait SupportedValuesAttribute extends Attribute {
}

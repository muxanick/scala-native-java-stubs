package javax.xml.bind.annotation

import java.lang.String
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** Associates the MIME type that controls the XML representation of the property.
 * 
 *  
 *  This annotation is used in conjunction with datatypes such as
 *  Image or Source that are bound to base64-encoded binary in XML.
 * 
 *  
 *  If a property that has this annotation has a sibling property bound to
 *  the xmime:contentType attribute, and if in the instance the property has a value,
 *  the value of the attribute takes precedence and that will control the marshalling.
 */
@Retention ( value = RUNTIME ) 
@Target ( value ={ FIELD , METHOD , PARAMETER } ) 
 final class XmlMimeType extends StaticAnnotation {

    /** The textual representation of the MIME type,
     *  such as "image/jpeg" "image/*", "text/xml; charset=iso-8859-1" and so on.
     */
    @stub
    val value: String = ???
}

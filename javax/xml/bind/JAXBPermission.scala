package javax.xml.bind

import java.lang.{Object, String}
import java.security.{BasicPermission, Permission}
import scala.scalanative.annotation.stub

/** This class is for JAXB permissions. A JAXBPermission
 *  contains a name (also referred to as a "target name") but
 *  no actions list; you either have the named permission
 *  or you don't.
 * 
 *  
 *  The target name is the name of the JAXB permission (see below).
 * 
 *  
 *  The following table lists all the possible JAXBPermission target names,
 *  and for each provides a description of what the permission allows
 *  and a discussion of the risks of granting code the permission.
 *  
 * 
 *  
 *  
 *  Permission Target Name
 *  What the Permission Allows
 *  Risks of Allowing this Permission
 *  
 * 
 *  
 *    setDatatypeConverter
 *    
 *      Allows the code to set VM-wide DatatypeConverterInterface
 *      via the setDatatypeConverter method
 *      that all the methods on DatatypeConverter uses.
 *    
 *    
 *      Malicious code can set DatatypeConverterInterface, which has
 *      VM-wide singleton semantics,  before a genuine JAXB implementation sets one.
 *      This allows malicious code to gain access to objects that it may otherwise
 *      not have access to, such as Frame.getFrames() that belongs to
 *      another application running in the same JVM.
 *    
 *  
 *  
 */
final class JAXBPermission extends BasicPermission {

    /** Creates a new JAXBPermission with the specified name. */
    @stub
    def this(name: String) = ???
}

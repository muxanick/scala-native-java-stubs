package java.io

import java.lang.{Object, String}
import java.security.{BasicPermission, Permission}
import scala.scalanative.annotation.stub

/** This class is for Serializable permissions. A SerializablePermission
 *  contains a name (also referred to as a "target name") but
 *  no actions list; you either have the named permission
 *  or you don't.
 * 
 *  
 *  The target name is the name of the Serializable permission (see below).
 * 
 *  
 *  The following table lists all the possible SerializablePermission target names,
 *  and for each provides a description of what the permission allows
 *  and a discussion of the risks of granting code the permission.
 * 
 *  
 *  
 *  Permission Target Name
 *  What the Permission Allows
 *  Risks of Allowing this Permission
 *  
 * 
 *  
 *    enableSubclassImplementation
 *    Subclass implementation of ObjectOutputStream or ObjectInputStream
 *  to override the default serialization or deserialization, respectively,
 *  of objects
 *    Code can use this to serialize or
 *  deserialize classes in a purposefully malfeasant manner. For example,
 *  during serialization, malicious code can use this to
 *  purposefully store confidential private field data in a way easily accessible
 *  to attackers. Or, during deserialization it could, for example, deserialize
 *  a class with all its private fields zeroed out.
 *  
 * 
 *  
 *    enableSubstitution
 *    Substitution of one object for another during
 *  serialization or deserialization
 *    This is dangerous because malicious code
 *  can replace the actual object with one which has incorrect or
 *  malignant data.
 *  
 * 
 *  
 */
final class SerializablePermission extends BasicPermission {

    /** Creates a new SerializablePermission with the specified name. */
    @stub
    def this(name: String) = ???

    /** Creates a new SerializablePermission object with the specified name. */
    @stub
    def this(name: String, actions: String) = ???
}

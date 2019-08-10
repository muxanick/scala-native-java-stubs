package javax.naming.spi

import java.lang.Object
import java.util.Hashtable
import javax.naming.{Context, Name}
import javax.naming.directory.Attributes
import scala.scalanative.annotation.stub

/** This interface represents a factory for creating an object given
 *  an object and attributes about the object.
 * 
 *  The JNDI framework allows for object implementations to
 *  be loaded in dynamically via object factories. See
 *  ObjectFactory for details.
 *  
 *  A DirObjectFactory extends ObjectFactory by allowing
 *  an Attributes instance
 *  to be supplied to the getObjectInstance() method.
 *  DirObjectFactory implementations are intended to be used by DirContext
 *  service providers. The service provider, in addition reading an
 *  object from the directory, might already have attributes that
 *  are useful for the object factory to check to see whether the
 *  factory is supposed to process the object. For instance, an LDAP-style
 *  service provider might have read the "objectclass" of the object.
 *  A CORBA object factory might be interested only in LDAP entries
 *  with "objectclass=corbaObject". By using the attributes supplied by
 *  the LDAP service provider, the CORBA object factory can quickly
 *  eliminate objects that it need not worry about, and non-CORBA object
 *  factories can quickly eliminate CORBA-related LDAP entries.
 */
trait DirObjectFactory extends ObjectFactory {

    /** Creates an object using the location or reference information, and attributes
     *  specified.
     */
    @stub
    def getObjectInstance(obj: Any, name: Name, nameCtx: Context, environment: Hashtable[_, _], attrs: Attributes): Any = ???
}

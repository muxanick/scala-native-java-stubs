package javax.naming.ldap

import java.lang.Object
import java.util.Hashtable
import javax.naming.Context
import scala.scalanative.annotation.stub

/** This abstract class represents a factory for creating LDAPv3 controls.
 *  LDAPv3 controls are defined in
 *  RFC 2251.
 * 
 *  When a service provider receives a response control, it uses control
 *  factories to return the specific/appropriate control class implementation.
 */
abstract class ControlFactory extends Object {

    /** Creates a new instance of a control factory. */
    @stub
    protected def this() = ???

    /** Creates a control using this control factory. */
    def getControlInstance(ctl: Control): Control
}

object ControlFactory {
    /** Creates a control using known control factories. */
    @stub
    def getControlInstance(ctl: Control, ctx: Context, env: Hashtable[_, _]): Control = ???
}

package javax.naming.ldap

import java.lang.Object
import java.util.Hashtable
import javax.naming.InitialContext
import javax.naming.directory.InitialDirContext
import scala.scalanative.annotation.stub

/** This class is the starting context for performing
 *  LDAPv3-style extended operations and controls.
 * 
 *  See javax.naming.InitialContext and
 *  javax.naming.InitialDirContext for details on synchronization,
 *  and the policy for how an initial context is created.
 * 
 *  Request Controls
 *  When you create an initial context (InitialLdapContext),
 *  you can specify a list of request controls.
 *  These controls will be used as the request controls for any
 *  implicit LDAP "bind" operation performed by the context or contexts
 *  derived from the context. These are called connection request controls.
 *  Use getConnectControls() to get a context's connection request
 *  controls.
 * 
 *  The request controls supplied to the initial context constructor
 *  are not used as the context request controls
 *  for subsequent context operations such as searches and lookups.
 *  Context request controls are set and updated by using
 *  setRequestControls().
 * 
 *  As shown, there can be two different sets of request controls
 *  associated with a context: connection request controls and context
 *  request controls.
 *  This is required for those applications needing to send critical
 *  controls that might not be applicable to both the context operation and
 *  any implicit LDAP "bind" operation.
 *  A typical user program would do the following:
 * 
 *  InitialLdapContext lctx = new InitialLdapContext(env, critConnCtls);
 *  lctx.setRequestControls(critModCtls);
 *  lctx.modifyAttributes(name, mods);
 *  Controls[] respCtls =  lctx.getResponseControls();
 * 
 *  It specifies first the critical controls for creating the initial context
 *  (critConnCtls), and then sets the context's request controls
 *  (critModCtls) for the context operation. If for some reason
 *  lctx needs to reconnect to the server, it will use
 *  critConnCtls. See the LdapContext interface for
 *  more discussion about request controls.
 * 
 *  Service provider implementors should read the "Service Provider" section
 *  in the LdapContext class description for implementation details.
 */
class InitialLdapContext extends InitialDirContext with LdapContext {

    /** Constructs an initial context using no environment properties or
     *  connection request controls.
     */
    @stub
    def this() = ???

    /** Constructs an initial context
     *  using environment properties and connection request controls.
     */
    @stub
    def this(environment: Hashtable[_, _], connCtls: Array[Control]) = ???

    /** Performs an extended operation. */
    @stub
    def extendedOperation(request: ExtendedRequest): ExtendedResponse = ???

    /** Retrieves the connection request controls in effect for this context. */
    @stub
    def getConnectControls(): Array[Control] = ???

    /** Retrieves the request controls in effect for this context. */
    @stub
    def getRequestControls(): Array[Control] = ???

    /** Retrieves the response controls produced as a result of the last
     *  method invoked on this context.
     */
    @stub
    def getResponseControls(): Array[Control] = ???

    /** Creates a new instance of this context initialized using request controls. */
    @stub
    def newInstance(reqCtls: Array[Control]): LdapContext = ???

    /** Reconnects to the LDAP server using the supplied controls and
     *  this context's environment.
     */
    @stub
    def reconnect(connCtls: Array[Control]): Unit = ???

    /** Sets the request controls for methods subsequently
     *  invoked on this context.
     */
    @stub
    def setRequestControls(requestControls: Array[Control]): Unit = ???
}

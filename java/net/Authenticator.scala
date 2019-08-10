package java.net

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The class Authenticator represents an object that knows how to obtain
 *  authentication for a network connection.  Usually, it will do this
 *  by prompting the user for information.
 *  
 *  Applications use this class by overriding getPasswordAuthentication() in a sub-class. This method will
 *  typically use the various getXXX() accessor methods to get information
 *  about the entity requesting authentication. It must then acquire a
 *  username and password either by interacting with the user or through
 *  some other non-interactive means. The credentials are then returned
 *  as a PasswordAuthentication return value.
 *  
 *  An instance of this concrete sub-class is then registered
 *  with the system by calling setDefault(Authenticator).
 *  When authentication is required, the system will invoke one of the
 *  requestPasswordAuthentication() methods which in turn will call the
 *  getPasswordAuthentication() method of the registered object.
 *  
 *  All methods that request authentication have a default implementation
 *  that fails.
 */
abstract class Authenticator extends Object {

    /**  */
    @stub
    def this() = ???

    /** Called when password authorization is needed. */
    protected def getPasswordAuthentication(): PasswordAuthentication

    /** Gets the hostname of the
     *  site or proxy requesting authentication, or null
     *  if not available.
     */
    protected def getRequestingHost(): String

    /** Gets the port number for the requested connection. */
    protected def getRequestingPort(): Int

    /** Gets the prompt string given by the requestor. */
    protected def getRequestingPrompt(): String

    /** Give the protocol that's requesting the connection. */
    protected def getRequestingProtocol(): String

    /** Gets the scheme of the requestor (the HTTP scheme
     *  for an HTTP firewall, for example).
     */
    protected def getRequestingScheme(): String

    /** Gets the InetAddress of the
     *  site requesting authorization, or null
     *  if not available.
     */
    protected def getRequestingSite(): InetAddress

    /** Returns the URL that resulted in this
     *  request for authentication.
     */
    protected def getRequestingURL(): URL

    /** Returns whether the requestor is a Proxy or a Server. */
    protected def getRequestorType(): Authenticator.RequestorType
}

object Authenticator {
    /** The type of the entity requesting authentication. */
    type RequestorType = Authenticator_RequestorType

    /** Ask the authenticator that has been registered with the system
     *  for a password.
     */
    @stub
    def requestPasswordAuthentication(addr: InetAddress, port: Int, protocol: String, prompt: String, scheme: String): PasswordAuthentication = ???

    /** Ask the authenticator that has been registered with the system
     *  for a password.
     */
    @stub
    def requestPasswordAuthentication(host: String, addr: InetAddress, port: Int, protocol: String, prompt: String, scheme: String): PasswordAuthentication = ???

    /** Ask the authenticator that has been registered with the system
     *  for a password.
     */
    @stub
    def requestPasswordAuthentication(host: String, addr: InetAddress, port: Int, protocol: String, prompt: String, scheme: String, url: URL, reqType: Authenticator.RequestorType): PasswordAuthentication = ???

    /** Sets the authenticator that will be used by the networking code
     *  when a proxy or an HTTP server asks for authentication.
     */
    @stub
    def setDefault(a: Authenticator): Unit = ???
}

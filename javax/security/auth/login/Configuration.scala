package javax.security.auth.login

import java.lang.{Object, String}
import java.security.Provider
import scala.scalanative.annotation.stub

/** A Configuration object is responsible for specifying which LoginModules
 *  should be used for a particular application, and in what order the
 *  LoginModules should be invoked.
 * 
 *   A login configuration contains the following information.
 *  Note that this example only represents the default syntax for the
 *  Configuration.  Subclass implementations of this class
 *  may implement alternative syntaxes and may retrieve the
 *  Configuration from any source such as files, databases,
 *  or servers.
 * 
 *  
 *       Name {
 *             ModuleClass  Flag    ModuleOptions;
 *             ModuleClass  Flag    ModuleOptions;
 *             ModuleClass  Flag    ModuleOptions;
 *       };
 *       Name {
 *             ModuleClass  Flag    ModuleOptions;
 *             ModuleClass  Flag    ModuleOptions;
 *       };
 *       other {
 *             ModuleClass  Flag    ModuleOptions;
 *             ModuleClass  Flag    ModuleOptions;
 *       };
 *  
 * 
 *   Each entry in the Configuration is indexed via an
 *  application name, Name, and contains a list of
 *  LoginModules configured for that application.  Each LoginModule
 *  is specified via its fully qualified class name.
 *  Authentication proceeds down the module list in the exact order specified.
 *  If an application does not have a specific entry,
 *  it defaults to the specific entry for "other".
 * 
 *   The Flag value controls the overall behavior as authentication
 *  proceeds down the stack.  The following represents a description of the
 *  valid values for Flag and their respective semantics:
 * 
 *  
 *       1) Required     - The  LoginModule is required to succeed.
 *                       If it succeeds or fails, authentication still continues
 *                       to proceed down the  LoginModule list.
 * 
 *       2) Requisite    - The  LoginModule is required to succeed.
 *                       If it succeeds, authentication continues down the
 *                        LoginModule list.  If it fails,
 *                       control immediately returns to the application
 *                       (authentication does not proceed down the
 *                        LoginModule list).
 * 
 *       3) Sufficient   - The  LoginModule is not required to
 *                       succeed.  If it does succeed, control immediately
 *                       returns to the application (authentication does not
 *                       proceed down the  LoginModule list).
 *                       If it fails, authentication continues down the
 *                        LoginModule list.
 * 
 *       4) Optional     - The  LoginModule is not required to
 *                       succeed.  If it succeeds or fails,
 *                       authentication still continues to proceed down the
 *                        LoginModule list.
 *  
 * 
 *   The overall authentication succeeds only if all Required and
 *  Requisite LoginModules succeed.  If a Sufficient
 *  LoginModule is configured and succeeds,
 *  then only the Required and Requisite LoginModules prior to
 *  that Sufficient LoginModule need to have succeeded for
 *  the overall authentication to succeed. If no Required or
 *  Requisite LoginModules are configured for an application,
 *  then at least one Sufficient or Optional
 *  LoginModule must succeed.
 * 
 *   ModuleOptions is a space separated list of
 *  LoginModule-specific values which are passed directly to
 *  the underlying LoginModules.  Options are defined by the
 *  LoginModule itself, and control the behavior within it.
 *  For example, a LoginModule may define options to support
 *  debugging/testing capabilities.  The correct way to specify options in the
 *  Configuration is by using the following key-value pairing:
 *  debug="true".  The key and value should be separated by an
 *  'equals' symbol, and the value should be surrounded by double quotes.
 *  If a String in the form, ${system.property}, occurs in the value,
 *  it will be expanded to the value of the system property.
 *  Note that there is no limit to the number of
 *  options a LoginModule may define.
 * 
 *   The following represents an example Configuration entry
 *  based on the syntax above:
 * 
 *  
 *  Login {
 *    com.sun.security.auth.module.UnixLoginModule required;
 *    com.sun.security.auth.module.Krb5LoginModule optional
 *                    useTicketCache="true"
 *                    ticketCache="${user.home}${/}tickets";
 *  };
 *  
 * 
 *   This Configuration specifies that an application named,
 *  "Login", requires users to first authenticate to the
 *  com.sun.security.auth.module.UnixLoginModule, which is
 *  required to succeed.  Even if the UnixLoginModule
 *  authentication fails, the
 *  com.sun.security.auth.module.Krb5LoginModule
 *  still gets invoked.  This helps hide the source of failure.
 *  Since the Krb5LoginModule is Optional, the overall
 *  authentication succeeds only if the UnixLoginModule
 *  (Required) succeeds.
 * 
 *   Also note that the LoginModule-specific options,
 *  useTicketCache="true" and
 *  ticketCache=${user.home}${/}tickets",
 *  are passed to the Krb5LoginModule.
 *  These options instruct the Krb5LoginModule to
 *  use the ticket cache at the specified location.
 *  The system properties, user.home and /
 *  (file.separator), are expanded to their respective values.
 * 
 *   There is only one Configuration object installed in the runtime at any
 *  given time.  A Configuration object can be installed by calling the
 *  setConfiguration method.  The installed Configuration object
 *  can be obtained by calling the getConfiguration method.
 * 
 *   If no Configuration object has been installed in the runtime, a call to
 *  getConfiguration installs an instance of the default
 *  Configuration implementation (a default subclass implementation of this
 *  abstract class).
 *  The default Configuration implementation can be changed by setting the value
 *  of the login.configuration.provider security property to the fully
 *  qualified name of the desired Configuration subclass implementation.
 * 
 *   Application code can directly subclass Configuration to provide a custom
 *  implementation.  In addition, an instance of a Configuration object can be
 *  constructed by invoking one of the getInstance factory methods
 *  with a standard type.  The default policy type is "JavaLoginConfig".
 *  See the Configuration section in the 
 *  Java Cryptography Architecture Standard Algorithm Name Documentation
 *  for a list of standard Configuration types.
 */
abstract class Configuration extends Object {

    /** Sole constructor. */
    @stub
    protected def this() = ???

    /** Retrieve the AppConfigurationEntries for the specified name
     *  from this Configuration.
     */
    def getAppConfigurationEntry(name: String): Array[AppConfigurationEntry]

    /** Return Configuration parameters. */
    def getParameters(): Configuration.Parameters

    /** Return the Provider of this Configuration. */
    def getProvider(): Provider

    /** Return the type of this Configuration. */
    def getType(): String

    /** Refresh and reload the Configuration. */
    def refresh(): Unit
}

object Configuration {
    /** This represents a marker interface for Configuration parameters. */
    trait Parameters {


    /** Get the installed login Configuration. */
    @stub
    def getConfiguration(): Configuration = ???

    /** Returns a Configuration object of the specified type. */
    @stub
    def getInstance(type: String, params: Configuration.Parameters): Configuration = ???

    /** Returns a Configuration object of the specified type. */
    @stub
    def getInstance(type: String, params: Configuration.Parameters, provider: Provider): Configuration = ???

    /** Returns a Configuration object of the specified type. */
    @stub
    def getInstance(type: String, params: Configuration.Parameters, provider: String): Configuration = ???

    /** Set the login Configuration. */
    @stub
    def setConfiguration(configuration: Configuration): Unit = ???
}

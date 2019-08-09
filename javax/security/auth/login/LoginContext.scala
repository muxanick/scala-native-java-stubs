package javax.security.auth.login

import java.lang.{Object, String}
import javax.security.auth.Subject
import javax.security.auth.callback.CallbackHandler

//  The LoginContext class describes the basic methods used
// to authenticate Subjects and provides a way to develop an
// application independent of the underlying authentication technology.
// A Configuration specifies the authentication technology, or
// LoginModule, to be used with a particular application.
// Different LoginModules can be plugged in under an application
// without requiring any modifications to the application itself.
//
//  In addition to supporting pluggable authentication, this class
// also supports the notion of stacked authentication.
// Applications may be configured to use more than one
// LoginModule.  For example, one could
// configure both a Kerberos LoginModule and a smart card
// LoginModule under an application.
//
//  A typical caller instantiates a LoginContext with
// a name and a CallbackHandler.
// LoginContext uses the name as the index into a
// Configuration to determine which LoginModules should be used,
// and which ones must succeed in order for the overall authentication to
// succeed.  The CallbackHandler is passed to the underlying
// LoginModules so they may communicate and interact with users
// (prompting for a username and password via a graphical user interface,
// for example).
//
//  Once the caller has instantiated a LoginContext,
// it invokes the login method to authenticate
// a Subject.  The login method invokes
// the configured modules to perform their respective types of authentication
// (username/password, smart card pin verification, etc.).
// Note that the LoginModules will not attempt authentication retries nor
// introduce delays if the authentication fails.
// Such tasks belong to the LoginContext caller.
//
//  If the login method returns without
// throwing an exception, then the overall authentication succeeded.
// The caller can then retrieve
// the newly authenticated Subject by invoking the
// getSubject method.  Principals and Credentials associated
// with the Subject may be retrieved by invoking the Subject's
// respective getPrincipals, getPublicCredentials,
// and getPrivateCredentials methods.
//
//  To logout the Subject, the caller calls
// the logout method.  As with the login
// method, this logout method invokes the logout
// method for the configured modules.
//
//  A LoginContext should not be used to authenticate
// more than one Subject.  A separate LoginContext
// should be used to authenticate each different Subject.
//
//  The following documentation applies to all LoginContext constructors:
// 
//
//  Subject
// 
//  If the constructor has a Subject
// input parameter, the LoginContext uses the caller-specified
// Subject object.
//
//  If the caller specifies a null Subject
// and a null value is permitted,
// the LoginContext instantiates a new Subject.
//
//  If the constructor does not have a Subject
// input parameter, the LoginContext instantiates a new Subject.
// 
// 
//
//  Configuration
// 
//  If the constructor has a Configuration
// input parameter and the caller specifies a non-null Configuration,
// the LoginContext uses the caller-specified Configuration.
// 
// If the constructor does not have a Configuration
// input parameter, or if the caller specifies a null
// Configuration object, the constructor uses the following call to
// get the installed Configuration:
// 
//      config = Configuration.getConfiguration();
// 
// For both cases,
// the name argument given to the constructor is passed to the
// Configuration.getAppConfigurationEntry method.
// If the Configuration has no entries for the specified name,
// then the LoginContext calls
// getAppConfigurationEntry with the name, "other"
// (the default entry name).  If there is no entry for "other",
// then a LoginException is thrown.
//
//  When LoginContext uses the installed Configuration, the caller
// requires the createLoginContext.name and possibly
// createLoginContext.other AuthPermissions. Furthermore, the
// LoginContext will invoke configured modules from within an
// AccessController.doPrivileged call so that modules that
// perform security-sensitive tasks (such as connecting to remote hosts,
// and updating the Subject) will require the respective permissions, but
// the callers of the LoginContext will not require those permissions.
//
//  When LoginContext uses a caller-specified Configuration, the caller
// does not require any createLoginContext AuthPermission.  The LoginContext
// saves the AccessControlContext for the caller,
// and invokes the configured modules from within an
// AccessController.doPrivileged call constrained by that context.
// This means the caller context (stored when the LoginContext was created)
// must have sufficient permissions to perform any security-sensitive tasks
// that the modules may perform.
// 
// 
//
//  CallbackHandler
// 
//  If the constructor has a CallbackHandler
// input parameter, the LoginContext uses the caller-specified
// CallbackHandler object.
//
//  If the constructor does not have a CallbackHandler
// input parameter, or if the caller specifies a null
// CallbackHandler object (and a null value is permitted),
// the LoginContext queries the
// auth.login.defaultCallbackHandler security property for the
// fully qualified class name of a default handler
// implementation. If the security property is not set,
// then the underlying modules will not have a
// CallbackHandler for use in communicating
// with users.  The caller thus assumes that the configured
// modules have alternative means for authenticating the user.
//
//
//  When the LoginContext uses the installed Configuration (instead of
// a caller-specified Configuration, see above),
// then this LoginContext must wrap any
// caller-specified or default CallbackHandler implementation
// in a new CallbackHandler implementation
// whose handle method implementation invokes the
// specified CallbackHandler's handle method in a
// java.security.AccessController.doPrivileged call
// constrained by the caller's current AccessControlContext.
// 
// 
class LoginContext extends Object {

    @stub
    // Instantiate a new LoginContext object with a name.
    def this(name: String) = ???

    @stub
    // Instantiate a new LoginContext object with a name
    // and a CallbackHandler object.
    def this(name: String, callbackHandler: CallbackHandler) = ???

    @stub
    // Instantiate a new LoginContext object with a name
    // and a Subject object.
    def this(name: String, subject: Subject) = ???

    @stub
    // Instantiate a new LoginContext object with a name,
    // a Subject to be authenticated, and a
    // CallbackHandler object.
    def this(name: String, subject: Subject, callbackHandler: CallbackHandler) = ???

    @stub
    // Return the authenticated Subject.
    def getSubject(): Subject = ???

    @stub
    // Perform the authentication.
    def login(): Unit = ???
}

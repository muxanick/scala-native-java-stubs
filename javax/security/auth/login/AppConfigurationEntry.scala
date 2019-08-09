package javax.security.auth.login

import java.lang.{Object, String}

// This class represents a single LoginModule entry
// configured for the application specified in the
// getAppConfigurationEntry(String appName)
// method in the Configuration class.  Each respective
// AppConfigurationEntry contains a LoginModule name,
// a control flag (specifying whether this LoginModule is
// REQUIRED, REQUISITE, SUFFICIENT, or OPTIONAL), and LoginModule-specific
// options.  Please refer to the Configuration class for
// more information on the different control flags and their semantics.
class AppConfigurationEntry extends Object {

    @stub
    // Return the controlFlag
    // (either REQUIRED, REQUISITE, SUFFICIENT, or OPTIONAL)
    // for this LoginModule.
    def getControlFlag(): AppConfigurationEntry.LoginModuleControlFlag = ???

    @stub
    // Get the class name of the configured LoginModule.
    def getLoginModuleName(): String = ???
}

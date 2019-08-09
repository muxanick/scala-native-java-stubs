package javax.security.auth.login

import java.lang.Object

// This class represents whether or not a LoginModule
// is REQUIRED, REQUISITE, SUFFICIENT or OPTIONAL.
object AppConfigurationEntry.LoginModuleControlFlag extends Object {

    @stub
    // Optional LoginModule.
    def OPTIONAL: AppConfigurationEntry.LoginModuleControlFlag = ???

    @stub
    // Required LoginModule.
    def REQUIRED: AppConfigurationEntry.LoginModuleControlFlag = ???

    @stub
    // Requisite LoginModule.
    def REQUISITE: AppConfigurationEntry.LoginModuleControlFlag = ???
}

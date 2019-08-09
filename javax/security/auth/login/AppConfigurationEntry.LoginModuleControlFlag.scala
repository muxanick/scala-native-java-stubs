package javax.security.auth.login

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class represents whether or not a LoginModule
 *  is REQUIRED, REQUISITE, SUFFICIENT or OPTIONAL.
 */
object AppConfigurationEntry.LoginModuleControlFlag extends Object {

    /** Optional LoginModule. */
    @stub
    val OPTIONAL: AppConfigurationEntry.LoginModuleControlFlag = ???

    /** Required LoginModule. */
    @stub
    val REQUIRED: AppConfigurationEntry.LoginModuleControlFlag = ???

    /** Requisite LoginModule. */
    @stub
    val REQUISITE: AppConfigurationEntry.LoginModuleControlFlag = ???

    /** Sufficient LoginModule. */
    @stub
    val SUFFICIENT: AppConfigurationEntry.LoginModuleControlFlag = ???

    /** Return a String representation of this controlFlag. */
    @stub
    def toString(): String = ???
}

package javax.sound.sampled

import java.lang.{Object, String}
import java.security.{BasicPermission, Permission}
import scala.scalanative.annotation.stub

/** The AudioPermission class represents access rights to the audio
 *  system resources.  An AudioPermission contains a target name
 *  but no actions list; you either have the named permission or you don't.
 *  
 *  The target name is the name of the audio permission (see the table below).
 *  The names follow the hierarchical property-naming convention. Also, an asterisk
 *  can be used to represent all the audio permissions.
 *  
 *  The following table lists the possible AudioPermission target names.
 *  For each name, the table provides a description of exactly what that permission
 *  allows, as well as a discussion of the risks of granting code the permission.
 *  
 * 
 *  
 *  
 *  Permission Target Name
 *  What the Permission Allows
 *  Risks of Allowing this Permission
 *  
 * 
 *  
 *  play
 *  Audio playback through the audio device or devices on the system.
 *  Allows the application to obtain and manipulate lines and mixers for
 *  audio playback (rendering).
 *  In some cases use of this permission may affect other
 *  applications because the audio from one line may be mixed with other audio
 *  being played on the system, or because manipulation of a mixer affects the
 *  audio for all lines using that mixer.
 * 
 * 
 *  
 *  record
 *  Audio recording through the audio device or devices on the system.
 *  Allows the application to obtain and manipulate lines and mixers for
 *  audio recording (capture).
 *  In some cases use of this permission may affect other
 *  applications because manipulation of a mixer affects the audio for all lines
 *  using that mixer.
 *  This permission can enable an applet or application to eavesdrop on a user.
 * 
 * 
 * 
 */
class AudioPermission extends BasicPermission {

    /** Creates a new AudioPermission object that has the specified
     *  symbolic name, such as "play" or "record".
     */
    @stub
    def this(name: String) = ???

    /** Creates a new AudioPermission object that has the specified
     *  symbolic name, such as "play" or "record".
     */
    @stub
    def this(name: String, actions: String) = ???
}

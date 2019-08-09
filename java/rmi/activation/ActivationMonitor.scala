package java.rmi.activation

import java.rmi.{MarshalledObject, Remote}

// An ActivationMonitor is specific to an
// ActivationGroup and is obtained when a group is
// reported active via a call to
// ActivationSystem.activeGroup (this is done
// internally). An activation group is responsible for informing its
// ActivationMonitor when either: its objects become active or
// inactive, or the group as a whole becomes inactive.
trait ActivationMonitor extends Remote {

    @stub
    // Informs that an object is now active.
    def activeObject(id: ActivationID, obj: MarshalledObject[_ <: Remote]): Unit = ???

    @stub
    // Informs that the group is now inactive.
    def inactiveGroup(id: ActivationGroupID, incarnation: Long): Unit = ???
}
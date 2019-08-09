package java.rmi.activation

import java.rmi.Remote

// The ActivationSystem provides a means for registering
// groups and "activatable" objects to be activated within those groups.
// The ActivationSystem works closely with the
// Activator, which activates objects registered via the
// ActivationSystem, and the ActivationMonitor,
// which obtains information about active and inactive objects,
// and inactive groups.
trait ActivationSystem extends Remote {

    @stub
    // Callback to inform activation system that group is now
    // active.
    def activeGroup(id: ActivationGroupID, group: ActivationInstantiator, incarnation: Long): ActivationMonitor = ???

    @stub
    // Returns the activation descriptor, for the object with the activation
    // identifier, id.
    def getActivationDesc(id: ActivationID): ActivationDesc = ???

    @stub
    // Returns the activation group descriptor, for the group
    // with the activation group identifier, id.
    def getActivationGroupDesc(id: ActivationGroupID): ActivationGroupDesc = ???

    @stub
    // Register the activation group.
    def registerGroup(desc: ActivationGroupDesc): ActivationGroupID = ???

    @stub
    // The registerObject method is used to register an
    // activation descriptor, desc, and obtain an
    // activation identifier for a activatable remote object.
    def registerObject(desc: ActivationDesc): ActivationID = ???

    @stub
    // Set the activation descriptor, desc for the object with
    // the activation identifier, id.
    def setActivationDesc(id: ActivationID, desc: ActivationDesc): ActivationDesc = ???

    @stub
    // Set the activation group descriptor, desc for the object
    // with the activation group identifier, id.
    def setActivationGroupDesc(id: ActivationGroupID, desc: ActivationGroupDesc): ActivationGroupDesc = ???

    @stub
    // Shutdown the activation system.
    def shutdown(): Unit = ???

    @stub
    // Remove the activation group.
    def unregisterGroup(id: ActivationGroupID): Unit = ???
}

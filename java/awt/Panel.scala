package java.awt

import java.lang.Object
import javax.accessibility.Accessible

// Panel is the simplest container class. A panel
// provides space in which an application can attach any other
// component, including other panels.
// 
// The default layout manager for a panel is the
// FlowLayout layout manager.
class Panel extends Container with Accessible {

    @stub
    // Creates a new panel using the default layout manager.
    def this() = ???

    @stub
    // Creates the Panel's peer.
    def addNotify(): Unit = ???
}
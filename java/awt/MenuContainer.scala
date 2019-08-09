package java.awt

// The super class of all menu related containers.
trait MenuContainer {

    @stub
    // 
    def getFont(): Font = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1
    // replaced by dispatchEvent(AWTEvent).
    //
    def postEvent(evt: Event): Boolean = ???
}

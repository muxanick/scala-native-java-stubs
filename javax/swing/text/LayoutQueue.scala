package javax.swing.text

import java.lang.{Object, Runnable}

/** A queue of text layout tasks. */
class LayoutQueue extends Object {

    /** Add a task that is not needed immediately because
     *  the results are not believed to be visible.
     */
    @stub
    def addTask(task: Runnable): Unit = ???
}

object LayoutQueue {
    /** Fetch the default layout queue. */
    @stub
    def getDefaultQueue(): LayoutQueue = ???

    /** Set the default layout queue. */
    @stub
    def setDefaultQueue(q: LayoutQueue): Unit = ???
}

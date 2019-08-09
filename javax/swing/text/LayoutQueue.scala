package javax.swing.text

import java.lang.{Object, Runnable}

// A queue of text layout tasks.
class LayoutQueue extends Object {

    @stub
    // Add a task that is not needed immediately because
    // the results are not believed to be visible.
    def addTask(task: Runnable): Unit = ???
}

object LayoutQueue {
    @stub
    // Fetch the default layout queue.
    def getDefaultQueue(): LayoutQueue = ???

    @stub
    // Set the default layout queue.
    def setDefaultQueue(q: LayoutQueue): Unit = ???
}

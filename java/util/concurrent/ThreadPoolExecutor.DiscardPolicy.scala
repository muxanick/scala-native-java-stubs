package java.util.concurrent

import java.lang.Object

/** A handler for rejected tasks that silently discards the
 *  rejected task.
 */
object ThreadPoolExecutor.DiscardPolicy extends Object with RejectedExecutionHandler {

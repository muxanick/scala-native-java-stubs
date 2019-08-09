package javax.sql.rowset

import java.lang.{ClassLoader, Object, String}
import scala.scalanative.annotation.stub

/** A factory API that enables applications to obtain a
 *  RowSetFactory implementation  that can be used to create different
 *  types of RowSet implementations.
 *  
 *  Example:
 *  
 *  
 *  RowSetFactory aFactory = RowSetProvider.newFactory();
 *  CachedRowSet crs = aFactory.createCachedRowSet();
 *  ...
 *  RowSetFactory rsf = RowSetProvider.newFactory("com.sun.rowset.RowSetFactoryImpl", null);
 *  WebRowSet wrs = rsf.createWebRowSet();
 *  
 * 
 *  Tracing of this class may be enabled by setting the System property
 *  javax.sql.rowset.RowSetFactory.debug to any value but false.
 *  
 */
class RowSetProvider extends Object {

    /** RowSetProvider constructor */
    @stub
    protected def this() = ???
}

object RowSetProvider {
    /** Creates a new instance of a RowSetFactory
     *  implementation.
     */
    @stub
    def newFactory(): RowSetFactory = ???

    /** Creates  a new instance of a RowSetFactory from the
     *  specified factory class name.
     */
    @stub
    def newFactory(factoryClassName: String, cl: ClassLoader): RowSetFactory = ???
}

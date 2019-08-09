package javax.sql.rowset

import java.lang.String
import scala.scalanative.annotation.stub

/** 1.0 Background
 *  The Joinable interface provides the methods for getting and
 *  setting a match column, which is the basis for forming the SQL JOIN
 *  formed by adding RowSet objects to a JoinRowSet
 *  object.
 *  
 *  Any standard RowSet implementation may implement
 *  the Joinable interface in order to be
 *  added to a JoinRowSet object. Implementing this interface gives
 *  a RowSet object the ability to use Joinable methods,
 *  which set, retrieve, and get information about match columns.  An
 *  application may add a
 *  RowSet object that has not implemented the Joinable
 *  interface to a JoinRowSet object, but to do so it must use one
 *  of the JoinRowSet.addRowSet methods that takes both a
 *  RowSet object and a match column or an array of RowSet
 *  objects and an array of match columns.
 *  
 *  To get access to the methods in the Joinable interface, a
 *  RowSet object implements at least one of the
 *  five standard RowSet interfaces and also implements the
 *  Joinable interface.  In addition, most RowSet
 *  objects extend the BaseRowSet class.  For example:
 *  
 *      class MyRowSetImpl extends BaseRowSet implements CachedRowSet, Joinable {
 *          :
 *          :
 *      }
 *  
 * 
 *  2.0 Usage Guidelines
 *  
 *  The methods in the Joinable interface allow a RowSet object
 *  to set a match column, retrieve a match column, or unset a match column, which is
 *  the column upon which an SQL JOIN can be based.
 *  An instance of a class that implements these methods can be added to a
 *  JoinRowSet object to allow an SQL JOIN relationship to
 *   be established.
 * 
 *  
 *      CachedRowSet crs = new MyRowSetImpl();
 *      crs.populate((ResultSet)rs);
 *      (Joinable)crs.setMatchColumnIndex(1);
 * 
 *      JoinRowSet jrs = new JoinRowSetImpl();
 *      jrs.addRowSet(crs);
 *  
 *  In the previous example, crs is a CachedRowSet object that
 *  has implemented the Joinable interface.  In the following example,
 *  crs2 has not, so it must supply the match column as an argument to the
 *  addRowSet method. This example assumes that column 1 is the match
 *  column.
 *  
 *      CachedRowSet crs2 = new MyRowSetImpl();
 *      crs2.populate((ResultSet)rs);
 * 
 *      JoinRowSet jrs2 = new JoinRowSetImpl();
 *      jrs2.addRowSet(crs2, 1);
 *  
 *  
 *  The JoinRowSet interface makes it possible to get data from one or
 *  more RowSet objects consolidated into one table without having to incur
 *  the expense of creating a connection to a database. It is therefore ideally suited
 *  for use by disconnected RowSet objects. Nevertheless, any
 *  RowSet object may implement this interface
 *  regardless of whether it is connected or disconnected. Note that a
 *  JdbcRowSet object, being always connected to its data source, can
 *  become part of an SQL JOIN directly without having to become part
 *  of a JoinRowSet object.
 * 
 *  3.0 Managing Multiple Match Columns
 *  The index array passed into the setMatchColumn methods indicates
 *  how many match columns are being set (the length of the array) in addition to
 *  which columns will be used for the match. For example:
 *  
 *      int[] i = {1, 2, 4, 7}; // indicates four match columns, with column
 *                              // indexes 1, 2, 4, 7 participating in the JOIN.
 *      Joinable.setMatchColumn(i);
 *  
 *  Subsequent match columns may be added as follows to a different Joinable
 *  object (a RowSet object that has implemented the Joinable
 *  interface).
 *  
 *      int[] w = {3, 2, 5, 3};
 *      Joinable2.setMatchColumn(w);
 *  
 *  When an application adds two or more RowSet objects to a
 *  JoinRowSet object, the order of the indexes in the array is
 *  particularly important. Each index of
 *  the array maps directly to the corresponding index of the previously added
 *  RowSet object. If overlap or underlap occurs, the match column
 *  data is maintained in the event an additional Joinable RowSet is
 *  added and needs to relate to the match column data. Therefore, applications
 *  can set multiple match columns in any order, but
 *  this order has a direct effect on the outcome of the SQL JOIN.
 *  
 *  This assertion applies in exactly the same manner when column names are used
 *  rather than column indexes to indicate match columns.
 */
trait Joinable {

    /** Retrieves the indexes of the match columns that were set for this
     *  RowSet object with the method
     *  setMatchColumn(int[] columnIdxes).
     */
    @stub
    def getMatchColumnIndexes(): Array[Int] = ???

    /** Retrieves the names of the match columns that were set for this
     *  RowSet object with the method
     *  setMatchColumn(String [] columnNames).
     */
    @stub
    def getMatchColumnNames(): Array[String] = ???

    /** Sets the designated column as the match column for this RowSet
     *  object.
     */
    @stub
    def setMatchColumn(columnIdx: Int): Unit = ???

    /** Sets the designated columns as the match column for this RowSet
     *  object.
     */
    @stub
    def setMatchColumn(columnIdxes: Array[Int]): Unit = ???

    /** Sets the designated column as the match column for this RowSet
     *  object.
     */
    @stub
    def setMatchColumn(columnName: String): Unit = ???

    /** Sets the designated columns as the match column for this RowSet
     *  object.
     */
    @stub
    def setMatchColumn(columnNames: Array[String]): Unit = ???

    /** Unsets the designated column as the match column for this RowSet
     *  object.
     */
    @stub
    def unsetMatchColumn(columnIdx: Int): Unit = ???

    /** Unsets the designated columns as the match column for this RowSet
     *  object.
     */
    @stub
    def unsetMatchColumn(columnIdxes: Array[Int]): Unit = ???

    /** Unsets the designated column as the match column for this RowSet
     *  object.
     */
    @stub
    def unsetMatchColumn(columnName: String): Unit = ???

    /** Unsets the designated columns as the match columns for this RowSet
     *  object.
     */
    @stub
    def unsetMatchColumn(columnName: Array[String]): Unit = ???
}

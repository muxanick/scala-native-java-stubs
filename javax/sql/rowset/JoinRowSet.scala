package javax.sql.rowset

import java.lang.String
import java.util.Collection
import javax.sql.RowSet
import scala.scalanative.annotation.stub

/** The JoinRowSet interface provides a mechanism for combining related
 *  data from different RowSet objects into one JoinRowSet
 *  object, which represents an SQL JOIN.
 *  In other words, a JoinRowSet object acts as a
 *  container for the data from RowSet objects that form an SQL
 *  JOIN relationship.
 *  
 *  The Joinable interface provides the methods for setting,
 *  retrieving, and unsetting a match column, the basis for
 *  establishing an SQL JOIN relationship. The match column may
 *  alternatively be set by supplying it to the appropriate version of the
 *  JointRowSet method addRowSet.
 * 
 *  1.0 Overview
 *  Disconnected RowSet objects (CachedRowSet objects
 *  and implementations extending the CachedRowSet interface)
 *  do not have a standard way to establish an SQL JOIN between
 *  RowSet objects without the expensive operation of
 *  reconnecting to the data source. The JoinRowSet
 *  interface is specifically designed to address this need.
 *  
 *  Any RowSet object
 *  can be added to a JoinRowSet object to become
 *  part of an SQL JOIN relationship. This means that both connected
 *  and disconnected RowSet objects can be part of a JOIN.
 *  RowSet objects operating in a connected environment
 *  (JdbcRowSet objects) are
 *  encouraged to use the database to which they are already
 *  connected to establish SQL JOIN relationships between
 *  tables directly. However, it is possible for a
 *  JdbcRowSet object to be added to a JoinRowSet object
 *  if necessary.
 *  
 *  Any number of RowSet objects can be added to an
 *  instance of JoinRowSet provided that they
 *  can be related in an SQL JOIN.
 *  By definition, the SQL JOIN statement is used to
 *  combine the data contained in two or more relational database tables based
 *  upon a common attribute. The Joinable interface provides the methods
 *  for establishing a common attribute, which is done by setting a
 *  match column. The match column commonly coincides with
 *  the primary key, but there is
 *  no requirement that the match column be the same as the primary key.
 *  By establishing and then enforcing column matches,
 *  a JoinRowSet object establishes JOIN relationships
 *  between RowSet objects without the assistance of an available
 *  relational database.
 *  
 *  The type of JOIN to be established is determined by setting
 *  one of the JoinRowSet constants using the method
 *  setJoinType. The following SQL JOIN types can be set:
 *  
 *   CROSS_JOIN
 *   FULL_JOIN
 *   INNER_JOIN - the default if no JOIN type has been set
 *   LEFT_OUTER_JOIN
 *   RIGHT_OUTER_JOIN
 *  
 *  Note that if no type is set, the JOIN will automatically be an
 *  inner join. The comments for the fields in the
 *  JoinRowSet interface explain these JOIN types, which are
 *  standard SQL JOIN types.
 * 
 *  2.0 Using a JoinRowSet Object for Creating a JOIN
 *  When a JoinRowSet object is created, it is empty.
 *  The first RowSet object to be added becomes the basis for the
 *  JOIN relationship.
 *  Applications must determine which column in each of the
 *  RowSet objects to be added to the JoinRowSet object
 *  should be the match column. All of the
 *  RowSet objects must contain a match column, and the values in
 *  each match column must be ones that can be compared to values in the other match
 *  columns. The columns do not have to have the same name, though they often do,
 *  and they do not have to store the exact same data type as long as the data types
 *  can be compared.
 *  
 *  A match column can be be set in two ways:
 *  
 *   By calling the Joinable method setMatchColumn
 *   This is the only method that can set the match column before a RowSet
 *   object is added to a JoinRowSet object. The RowSet object
 *   must have implemented the Joinable interface in order to use the method
 *   setMatchColumn. Once the match column value
 *   has been set, this method can be used to reset the match column at any time.
 *   By calling one of the versions of the JoinRowSet method
 *   addRowSet that takes a column name or number (or an array of
 *   column names or numbers)
 *   Four of the five addRowSet methods take a match column as a parameter.
 *   These four methods set or reset the match column at the time a RowSet
 *   object is being added to a JoinRowSet object.
 *  
 *  3.0 Sample Usage
 *  
 *  The following code fragment adds two CachedRowSet
 *  objects to a JoinRowSet object. Note that in this example,
 *  no SQL JOIN type is set, so the default JOIN type,
 *  which is INNER_JOIN, is established.
 *  
 *  In the following code fragment, the table EMPLOYEES, whose match
 *  column is set to the first column (EMP_ID), is added to the
 *  JoinRowSet object jrs. Then
 *  the table ESSP_BONUS_PLAN, whose match column is likewise
 *  the EMP_ID column, is added. When this second
 *  table is added to jrs, only the rows in
 *  ESSP_BONUS_PLAN whose EMP_ID value matches an
 *  EMP_ID value in the EMPLOYEES table are added.
 *  In this case, everyone in the bonus plan is an employee, so all of the rows
 *  in the table ESSP_BONUS_PLAN are added to the JoinRowSet
 *  object.  In this example, both CachedRowSet objects being added
 *  have implemented the Joinable interface and can therefore call
 *  the Joinable method setMatchColumn.
 *  
 *      JoinRowSet jrs = new JoinRowSetImpl();
 * 
 *      ResultSet rs1 = stmt.executeQuery("SELECT * FROM EMPLOYEES");
 *      CachedRowSet empl = new CachedRowSetImpl();
 *      empl.populate(rs1);
 *      empl.setMatchColumn(1);
 *      jrs.addRowSet(empl);
 * 
 *      ResultSet rs2 = stmt.executeQuery("SELECT * FROM ESSP_BONUS_PLAN");
 *      CachedRowSet bonus = new CachedRowSetImpl();
 *      bonus.populate(rs2);
 *      bonus.setMatchColumn(1); // EMP_ID is the first column
 *      jrs.addRowSet(bonus);
 *  
 *  
 *  At this point, jrs is an inside JOIN of the two RowSet objects
 *  based on their EMP_ID columns. The application can now browse the
 *  combined data as if it were browsing one single RowSet object.
 *  Because jrs is itself a RowSet object, an application can
 *  navigate or modify it using RowSet methods.
 *  
 *      jrs.first();
 *      int employeeID = jrs.getInt(1);
 *      String employeeName = jrs.getString(2);
 *  
 *  
 *  Note that because the SQL JOIN must be enforced when an application
 *  adds a second or subsequent RowSet object, there
 *  may be an initial degradation in performance while the JOIN is
 *  being performed.
 *  
 *  The following code fragment adds an additional CachedRowSet object.
 *  In this case, the match column (EMP_ID) is set when the
 *  CachedRowSet object is added to the JoinRowSet object.
 *  
 *      ResultSet rs3 = stmt.executeQuery("SELECT * FROM 401K_CONTRIB");
 *      CachedRowSet fourO1k = new CachedRowSetImpl();
 *      four01k.populate(rs3);
 *      jrs.addRowSet(four01k, 1);
 *  
 *  
 *  The JoinRowSet object jrs now contains values from all three
 *  tables. The data in each row in four01k in which the value for the
 *  EMP_ID column matches a value for the EMP_ID column
 *  in jrs has been added to jrs.
 * 
 *  4.0 JoinRowSet Methods
 *  The JoinRowSet interface supplies several methods for adding
 *  RowSet objects and for getting information about the
 *  JoinRowSet object.
 *  
 *    Methods for adding one or more RowSet objects
 *        These methods allow an application to add one RowSet object
 *        at a time or to add multiple RowSet objects at one time. In
 *        either case, the methods may specify the match column for each
 *        RowSet object being added.
 *    Methods for getting information
 *        One method retrieves the RowSet objects in the
 *        JoinRowSet object, and another method retrieves the
 *        RowSet names.  A third method retrieves either the SQL
 *        WHERE clause used behind the scenes to form the
 *        JOIN or a text description of what the WHERE
 *        clause does.
 *    Methods related to the type of JOIN
 *        One method sets the JOIN type, and five methods find out whether
 *        the JoinRowSet object supports a given type.
 *    A method to make a separate copy of the JoinRowSet object
 *        This method creates a copy that can be persisted to the data source.
 *  
 */
trait JoinRowSet extends WebRowSet {

    /** Adds the given RowSet object to this JoinRowSet
     *  object.
     */
    @stub
    def addRowSet(rowset: Joinable): Unit = ???

    /** Adds one or more RowSet objects contained in the given
     *  array of RowSet objects to this JoinRowSet
     *  object and sets the match column for
     *  each of the RowSet objects to the match columns
     *  in the given array of column indexes.
     */
    @stub
    def addRowSet(rowset: Array[RowSet], columnIdx: Array[Int]): Unit = ???

    /** Adds one or more RowSet objects contained in the given
     *  array of RowSet objects to this JoinRowSet
     *  object and sets the match column for
     *  each of the RowSet objects to the match columns
     *  in the given array of column names.
     */
    @stub
    def addRowSet(rowset: Array[RowSet], columnName: Array[String]): Unit = ???

    /** Adds the given RowSet object to this JoinRowSet
     *  object and sets the designated column as the match column for
     *  the RowSet object.
     */
    @stub
    def addRowSet(rowset: RowSet, columnIdx: Int): Unit = ???

    /** Adds rowset to this JoinRowSet object and
     *  sets the designated column as the match column.
     */
    @stub
    def addRowSet(rowset: RowSet, columnName: String): Unit = ???

    /** Returns a int describing the set SQL JOIN type
     *  governing this JoinRowSet instance.
     */
    @stub
    def getJoinType(): Int = ???

    /** Returns a String array containing the names of the
     *          RowSet objects added to this JoinRowSet
     *          object.
     */
    @stub
    def getRowSetNames(): Array[String] = ???

    /** Returns a Collection object containing the
     *  RowSet objects that have been added to this
     *  JoinRowSet object.
     */
    @stub
    def getRowSets(): Collection[_] = ???

    /** Return a SQL-like description of the WHERE clause being used
     *  in a JoinRowSet object.
     */
    @stub
    def getWhereClause(): String = ???

    /** Allow the application to adjust the type of JOIN imposed
     *  on tables contained within the JoinRowSet object instance.
     */
    @stub
    def setJoinType(joinType: Int): Unit = ???

    /** Indicates if CROSS_JOIN is supported by a JoinRowSet
     *  implementation
     */
    @stub
    def supportsCrossJoin(): Boolean = ???

    /** Indicates if FULL_JOIN is supported by a JoinRowSet
     *  implementation
     */
    @stub
    def supportsFullJoin(): Boolean = ???

    /** Indicates if INNER_JOIN is supported by a JoinRowSet
     *  implementation
     */
    @stub
    def supportsInnerJoin(): Boolean = ???

    /** Indicates if LEFT_OUTER_JOIN is supported by a JoinRowSet
     *  implementation
     */
    @stub
    def supportsLeftOuterJoin(): Boolean = ???

    /** Indicates if RIGHT_OUTER_JOIN is supported by a JoinRowSet
     *  implementation
     */
    @stub
    def supportsRightOuterJoin(): Boolean = ???

    /** Creates a new CachedRowSet object containing the
     *  data in this JoinRowSet object, which can be saved
     *  to a data source using the SyncProvider object for
     *  the CachedRowSet object.
     */
    @stub
    def toCachedRowSet(): CachedRowSet = ???
}

object JoinRowSet {
    /** An ANSI-style JOIN providing a cross product of two tables */
    @stub
    val CROSS_JOIN: Int = ???

    /** An ANSI-style JOIN providing a a full JOIN. */
    @stub
    val FULL_JOIN: Int = ???

    /** An ANSI-style JOIN providing a inner join between two tables. */
    @stub
    val INNER_JOIN: Int = ???

    /** An ANSI-style JOIN providing a left outer join between two
     *  tables.
     */
    @stub
    val LEFT_OUTER_JOIN: Int = ???

    /** An ANSI-style JOIN providing a right outer join between
     *  two tables.
     */
    @stub
    val RIGHT_OUTER_JOIN: Int = ???
}

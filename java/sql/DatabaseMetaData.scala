package java.sql

import java.lang.String
import scala.scalanative.annotation.stub

/** Comprehensive information about the database as a whole.
 *  
 *  This interface is implemented by driver vendors to let users know the capabilities
 *  of a Database Management System (DBMS) in combination with
 *  the driver based on JDBC™ technology
 *  ("JDBC driver") that is used with it.  Different relational DBMSs often support
 *  different features, implement features in different ways, and use different
 *  data types.  In addition, a driver may implement a feature on top of what the
 *  DBMS offers.  Information returned by methods in this interface applies
 *  to the capabilities of a particular driver and a particular DBMS working
 *  together. Note that as used in this documentation, the term "database" is
 *  used generically to refer to both the driver and DBMS.
 *  
 *  A user for this interface is commonly a tool that needs to discover how to
 *  deal with the underlying DBMS.  This is especially true for applications
 *  that are intended to be used with more than one DBMS. For example, a tool might use the method
 *  getTypeInfo to find out what data types can be used in a
 *  CREATE TABLE statement.  Or a user might call the method
 *  supportsCorrelatedSubqueries to see if it is possible to use
 *  a correlated subquery or supportsBatchUpdates to see if it is
 *  possible to use batch updates.
 *  
 *  Some DatabaseMetaData methods return lists of information
 *  in the form of ResultSet objects.
 *  Regular ResultSet methods, such as
 *  getString and getInt, can be used
 *  to retrieve the data from these ResultSet objects.  If
 *  a given form of metadata is not available, an empty ResultSet
 *  will be returned. Additional columns beyond the columns defined to be
 *  returned by the ResultSet object for a given method
 *  can be defined by the JDBC driver vendor and must be accessed
 *  by their column label.
 *  
 *  Some DatabaseMetaData methods take arguments that are
 *  String patterns.  These arguments all have names such as fooPattern.
 *  Within a pattern String, "%" means match any substring of 0 or more
 *  characters, and "_" means match any one character. Only metadata
 *  entries matching the search pattern are returned. If a search pattern
 *  argument is set to null, that argument's criterion will
 *  be dropped from the search.
 */
trait DatabaseMetaData extends Wrapper {

    /** Retrieves whether the current user can call all the procedures
     *  returned by the method getProcedures.
     */
    @stub
    def allProceduresAreCallable(): Boolean = ???

    /** Retrieves whether the current user can use all the tables returned
     *  by the method getTables in a SELECT
     *  statement.
     */
    @stub
    def allTablesAreSelectable(): Boolean = ???

    /** Retrieves whether a SQLException while autoCommit is true indicates
     *  that all open ResultSets are closed, even ones that are holdable.
     */
    @stub
    def autoCommitFailureClosesAllResultSets(): Boolean = ???

    /** Retrieves whether a data definition statement within a transaction forces
     *  the transaction to commit.
     */
    @stub
    def dataDefinitionCausesTransactionCommit(): Boolean = ???

    /** Retrieves whether this database ignores a data definition statement
     *  within a transaction.
     */
    @stub
    def dataDefinitionIgnoredInTransactions(): Boolean = ???

    /** Retrieves whether or not a visible row delete can be detected by
     *  calling the method ResultSet.rowDeleted.
     */
    @stub
    def deletesAreDetected(type: Int): Boolean = ???

    /** Retrieves whether the return value for the method
     *  getMaxRowSize includes the SQL data types
     *  LONGVARCHAR and LONGVARBINARY.
     */
    @stub
    def doesMaxRowSizeIncludeBlobs(): Boolean = ???

    /** Retrieves whether a generated key will always be returned if the column
     *  name(s) or index(es) specified for the auto generated key column(s)
     *  are valid and the statement succeeds.
     */
    @stub
    def generatedKeyAlwaysReturned(): Boolean = ???

    /** Retrieves a description of the given attribute of the given type
     *  for a user-defined type (UDT) that is available in the given schema
     *  and catalog.
     */
    @stub
    def getAttributes(catalog: String, schemaPattern: String, typeNamePattern: String, attributeNamePattern: String): ResultSet = ???

    /** Retrieves a description of a table's optimal set of columns that
     *  uniquely identifies a row.
     */
    @stub
    def getBestRowIdentifier(catalog: String, schema: String, table: String, scope: Int, nullable: Boolean): ResultSet = ???

    /** Retrieves the catalog names available in this database. */
    @stub
    def getCatalogs(): ResultSet = ???

    /** Retrieves the String that this database uses as the
     *  separator between a catalog and table name.
     */
    @stub
    def getCatalogSeparator(): String = ???

    /** Retrieves the database vendor's preferred term for "catalog". */
    @stub
    def getCatalogTerm(): String = ???

    /** Retrieves a list of the client info properties
     *  that the driver supports.
     */
    @stub
    def getClientInfoProperties(): ResultSet = ???

    /** Retrieves a description of the access rights for a table's columns. */
    @stub
    def getColumnPrivileges(catalog: String, schema: String, table: String, columnNamePattern: String): ResultSet = ???

    /** Retrieves a description of table columns available in
     *  the specified catalog.
     */
    @stub
    def getColumns(catalog: String, schemaPattern: String, tableNamePattern: String, columnNamePattern: String): ResultSet = ???

    /** Retrieves the connection that produced this metadata object. */
    @stub
    def getConnection(): Connection = ???

    /** Retrieves a description of the foreign key columns in the given foreign key
     *  table that reference the primary key or the columns representing a unique constraint of the  parent table (could be the same or a different table).
     */
    @stub
    def getCrossReference(parentCatalog: String, parentSchema: String, parentTable: String, foreignCatalog: String, foreignSchema: String, foreignTable: String): ResultSet = ???

    /** Retrieves the major version number of the underlying database. */
    @stub
    def getDatabaseMajorVersion(): Int = ???

    /** Retrieves the minor version number of the underlying database. */
    @stub
    def getDatabaseMinorVersion(): Int = ???

    /** Retrieves the name of this database product. */
    @stub
    def getDatabaseProductName(): String = ???

    /** Retrieves the version number of this database product. */
    @stub
    def getDatabaseProductVersion(): String = ???

    /** Retrieves this database's default transaction isolation level. */
    @stub
    def getDefaultTransactionIsolation(): Int = ???

    /** Retrieves this JDBC driver's major version number. */
    @stub
    def getDriverMajorVersion(): Int = ???

    /** Retrieves this JDBC driver's minor version number. */
    @stub
    def getDriverMinorVersion(): Int = ???

    /** Retrieves the name of this JDBC driver. */
    @stub
    def getDriverName(): String = ???

    /** Retrieves the version number of this JDBC driver as a String. */
    @stub
    def getDriverVersion(): String = ???

    /** Retrieves a description of the foreign key columns that reference the
     *  given table's primary key columns (the foreign keys exported by a
     *  table).
     */
    @stub
    def getExportedKeys(catalog: String, schema: String, table: String): ResultSet = ???

    /** Retrieves all the "extra" characters that can be used in unquoted
     *  identifier names (those beyond a-z, A-Z, 0-9 and _).
     */
    @stub
    def getExtraNameCharacters(): String = ???

    /** Retrieves a description of the given catalog's system or user
     *  function parameters and return type.
     */
    @stub
    def getFunctionColumns(catalog: String, schemaPattern: String, functionNamePattern: String, columnNamePattern: String): ResultSet = ???

    /** Retrieves a description of the  system and user functions available
     *  in the given catalog.
     */
    @stub
    def getFunctions(catalog: String, schemaPattern: String, functionNamePattern: String): ResultSet = ???

    /** Retrieves the string used to quote SQL identifiers. */
    @stub
    def getIdentifierQuoteString(): String = ???

    /** Retrieves a description of the primary key columns that are
     *  referenced by the given table's foreign key columns (the primary keys
     *  imported by a table).
     */
    @stub
    def getImportedKeys(catalog: String, schema: String, table: String): ResultSet = ???

    /** Retrieves a description of the given table's indices and statistics. */
    @stub
    def getIndexInfo(catalog: String, schema: String, table: String, unique: Boolean, approximate: Boolean): ResultSet = ???

    /** Retrieves the major JDBC version number for this
     *  driver.
     */
    @stub
    def getJDBCMajorVersion(): Int = ???

    /** Retrieves the minor JDBC version number for this
     *  driver.
     */
    @stub
    def getJDBCMinorVersion(): Int = ???

    /** Retrieves the maximum number of hex characters this database allows in an
     *  inline binary literal.
     */
    @stub
    def getMaxBinaryLiteralLength(): Int = ???

    /** Retrieves the maximum number of characters that this database allows in a
     *  catalog name.
     */
    @stub
    def getMaxCatalogNameLength(): Int = ???

    /** Retrieves the maximum number of characters this database allows
     *  for a character literal.
     */
    @stub
    def getMaxCharLiteralLength(): Int = ???

    /** Retrieves the maximum number of characters this database allows
     *  for a column name.
     */
    @stub
    def getMaxColumnNameLength(): Int = ???

    /** Retrieves the maximum number of columns this database allows in a
     *  GROUP BY clause.
     */
    @stub
    def getMaxColumnsInGroupBy(): Int = ???

    /** Retrieves the maximum number of columns this database allows in an index. */
    @stub
    def getMaxColumnsInIndex(): Int = ???

    /** Retrieves the maximum number of columns this database allows in an
     *  ORDER BY clause.
     */
    @stub
    def getMaxColumnsInOrderBy(): Int = ???

    /** Retrieves the maximum number of columns this database allows in a
     *  SELECT list.
     */
    @stub
    def getMaxColumnsInSelect(): Int = ???

    /** Retrieves the maximum number of columns this database allows in a table. */
    @stub
    def getMaxColumnsInTable(): Int = ???

    /** Retrieves the maximum number of concurrent connections to this
     *  database that are possible.
     */
    @stub
    def getMaxConnections(): Int = ???

    /** Retrieves the maximum number of characters that this database allows in a
     *  cursor name.
     */
    @stub
    def getMaxCursorNameLength(): Int = ???

    /** Retrieves the maximum number of bytes this database allows for an
     *  index, including all of the parts of the index.
     */
    @stub
    def getMaxIndexLength(): Int = ???

    /** Retrieves the maximum number of bytes this database allows for
     *  the logical size for a LOB.
     */
    @stub
    def getMaxLogicalLobSize(): Long = ???

    /** Retrieves the maximum number of characters that this database allows in a
     *  procedure name.
     */
    @stub
    def getMaxProcedureNameLength(): Int = ???

    /** Retrieves the maximum number of bytes this database allows in
     *  a single row.
     */
    @stub
    def getMaxRowSize(): Int = ???

    /** Retrieves the maximum number of characters that this database allows in a
     *  schema name.
     */
    @stub
    def getMaxSchemaNameLength(): Int = ???

    /** Retrieves the maximum number of characters this database allows in
     *  an SQL statement.
     */
    @stub
    def getMaxStatementLength(): Int = ???

    /** Retrieves the maximum number of active statements to this database
     *  that can be open at the same time.
     */
    @stub
    def getMaxStatements(): Int = ???

    /** Retrieves the maximum number of characters this database allows in
     *  a table name.
     */
    @stub
    def getMaxTableNameLength(): Int = ???

    /** Retrieves the maximum number of tables this database allows in a
     *  SELECT statement.
     */
    @stub
    def getMaxTablesInSelect(): Int = ???

    /** Retrieves the maximum number of characters this database allows in
     *  a user name.
     */
    @stub
    def getMaxUserNameLength(): Int = ???

    /** Retrieves a comma-separated list of math functions available with
     *  this database.
     */
    @stub
    def getNumericFunctions(): String = ???

    /** Retrieves a description of the given table's primary key columns. */
    @stub
    def getPrimaryKeys(catalog: String, schema: String, table: String): ResultSet = ???

    /** Retrieves a description of the given catalog's stored procedure parameter
     *  and result columns.
     */
    @stub
    def getProcedureColumns(catalog: String, schemaPattern: String, procedureNamePattern: String, columnNamePattern: String): ResultSet = ???

    /** Retrieves a description of the stored procedures available in the given
     *  catalog.
     */
    @stub
    def getProcedures(catalog: String, schemaPattern: String, procedureNamePattern: String): ResultSet = ???

    /** Retrieves the database vendor's preferred term for "procedure". */
    @stub
    def getProcedureTerm(): String = ???

    /** Retrieves a description of the pseudo or hidden columns available
     *  in a given table within the specified catalog and schema.
     */
    @stub
    def getPseudoColumns(catalog: String, schemaPattern: String, tableNamePattern: String, columnNamePattern: String): ResultSet = ???

    /** Retrieves this database's default holdability for ResultSet
     *  objects.
     */
    @stub
    def getResultSetHoldability(): Int = ???

    /** Indicates whether or not this data source supports the SQL ROWID type,
     *  and if so  the lifetime for which a RowId object remains valid.
     */
    @stub
    def getRowIdLifetime(): RowIdLifetime = ???

    /** Retrieves the schema names available in this database. */
    @stub
    def getSchemas(): ResultSet = ???

    /** Retrieves the schema names available in this database. */
    @stub
    def getSchemas(catalog: String, schemaPattern: String): ResultSet = ???

    /** Retrieves the database vendor's preferred term for "schema". */
    @stub
    def getSchemaTerm(): String = ???

    /** Retrieves the string that can be used to escape wildcard characters. */
    @stub
    def getSearchStringEscape(): String = ???

    /** Retrieves a comma-separated list of all of this database's SQL keywords
     *  that are NOT also SQL:2003 keywords.
     */
    @stub
    def getSQLKeywords(): String = ???

    /** Indicates whether the SQLSTATE returned by SQLException.getSQLState
     *  is X/Open (now known as Open Group) SQL CLI or SQL:2003.
     */
    @stub
    def getSQLStateType(): Int = ???

    /** Retrieves a comma-separated list of string functions available with
     *  this database.
     */
    @stub
    def getStringFunctions(): String = ???

    /** Retrieves a description of the table hierarchies defined in a particular
     *  schema in this database.
     */
    @stub
    def getSuperTables(catalog: String, schemaPattern: String, tableNamePattern: String): ResultSet = ???

    /** Retrieves a description of the user-defined type (UDT) hierarchies defined in a
     *  particular schema in this database.
     */
    @stub
    def getSuperTypes(catalog: String, schemaPattern: String, typeNamePattern: String): ResultSet = ???

    /** Retrieves a comma-separated list of system functions available with
     *  this database.
     */
    @stub
    def getSystemFunctions(): String = ???

    /** Retrieves a description of the access rights for each table available
     *  in a catalog.
     */
    @stub
    def getTablePrivileges(catalog: String, schemaPattern: String, tableNamePattern: String): ResultSet = ???

    /** Retrieves a description of the tables available in the given catalog. */
    @stub
    def getTables(catalog: String, schemaPattern: String, tableNamePattern: String, types: Array[String]): ResultSet = ???

    /** Retrieves the table types available in this database. */
    @stub
    def getTableTypes(): ResultSet = ???

    /** Retrieves a comma-separated list of the time and date functions available
     *  with this database.
     */
    @stub
    def getTimeDateFunctions(): String = ???

    /** Retrieves a description of all the data types supported by
     *  this database.
     */
    @stub
    def getTypeInfo(): ResultSet = ???

    /** Retrieves a description of the user-defined types (UDTs) defined
     *  in a particular schema.
     */
    @stub
    def getUDTs(catalog: String, schemaPattern: String, typeNamePattern: String, types: Array[Int]): ResultSet = ???

    /** Retrieves the URL for this DBMS. */
    @stub
    def getURL(): String = ???

    /** Retrieves the user name as known to this database. */
    @stub
    def getUserName(): String = ???

    /** Retrieves a description of a table's columns that are automatically
     *  updated when any value in a row is updated.
     */
    @stub
    def getVersionColumns(catalog: String, schema: String, table: String): ResultSet = ???

    /** Retrieves whether or not a visible row insert can be detected
     *  by calling the method ResultSet.rowInserted.
     */
    @stub
    def insertsAreDetected(type: Int): Boolean = ???

    /** Retrieves whether a catalog appears at the start of a fully qualified
     *  table name.
     */
    @stub
    def isCatalogAtStart(): Boolean = ???

    /** Retrieves whether this database is in read-only mode. */
    @stub
    def isReadOnly(): Boolean = ???

    /** Indicates whether updates made to a LOB are made on a copy or directly
     *  to the LOB.
     */
    @stub
    def locatorsUpdateCopy(): Boolean = ???

    /** Retrieves whether this database supports concatenations between
     *  NULL and non-NULL values being
     *  NULL.
     */
    @stub
    def nullPlusNonNullIsNull(): Boolean = ???

    /** Retrieves whether NULL values are sorted at the end regardless of
     *  sort order.
     */
    @stub
    def nullsAreSortedAtEnd(): Boolean = ???

    /** Retrieves whether NULL values are sorted at the start regardless
     *  of sort order.
     */
    @stub
    def nullsAreSortedAtStart(): Boolean = ???

    /** Retrieves whether NULL values are sorted high. */
    @stub
    def nullsAreSortedHigh(): Boolean = ???

    /** Retrieves whether NULL values are sorted low. */
    @stub
    def nullsAreSortedLow(): Boolean = ???

    /** Retrieves whether deletes made by others are visible. */
    @stub
    def othersDeletesAreVisible(type: Int): Boolean = ???

    /** Retrieves whether inserts made by others are visible. */
    @stub
    def othersInsertsAreVisible(type: Int): Boolean = ???

    /** Retrieves whether updates made by others are visible. */
    @stub
    def othersUpdatesAreVisible(type: Int): Boolean = ???

    /** Retrieves whether a result set's own deletes are visible. */
    @stub
    def ownDeletesAreVisible(type: Int): Boolean = ???

    /** Retrieves whether a result set's own inserts are visible. */
    @stub
    def ownInsertsAreVisible(type: Int): Boolean = ???

    /** Retrieves whether for the given type of ResultSet object,
     *  the result set's own updates are visible.
     */
    @stub
    def ownUpdatesAreVisible(type: Int): Boolean = ???

    /** Retrieves whether this database treats mixed case unquoted SQL identifiers as
     *  case insensitive and stores them in lower case.
     */
    @stub
    def storesLowerCaseIdentifiers(): Boolean = ???

    /** Retrieves whether this database treats mixed case quoted SQL identifiers as
     *  case insensitive and stores them in lower case.
     */
    @stub
    def storesLowerCaseQuotedIdentifiers(): Boolean = ???

    /** Retrieves whether this database treats mixed case unquoted SQL identifiers as
     *  case insensitive and stores them in mixed case.
     */
    @stub
    def storesMixedCaseIdentifiers(): Boolean = ???

    /** Retrieves whether this database treats mixed case quoted SQL identifiers as
     *  case insensitive and stores them in mixed case.
     */
    @stub
    def storesMixedCaseQuotedIdentifiers(): Boolean = ???

    /** Retrieves whether this database treats mixed case unquoted SQL identifiers as
     *  case insensitive and stores them in upper case.
     */
    @stub
    def storesUpperCaseIdentifiers(): Boolean = ???

    /** Retrieves whether this database treats mixed case quoted SQL identifiers as
     *  case insensitive and stores them in upper case.
     */
    @stub
    def storesUpperCaseQuotedIdentifiers(): Boolean = ???

    /** Retrieves whether this database supports ALTER TABLE
     *  with add column.
     */
    @stub
    def supportsAlterTableWithAddColumn(): Boolean = ???

    /** Retrieves whether this database supports ALTER TABLE
     *  with drop column.
     */
    @stub
    def supportsAlterTableWithDropColumn(): Boolean = ???

    /** Retrieves whether this database supports the ANSI92 entry level SQL
     *  grammar.
     */
    @stub
    def supportsANSI92EntryLevelSQL(): Boolean = ???

    /** Retrieves whether this database supports the ANSI92 full SQL grammar supported. */
    @stub
    def supportsANSI92FullSQL(): Boolean = ???

    /** Retrieves whether this database supports the ANSI92 intermediate SQL grammar supported. */
    @stub
    def supportsANSI92IntermediateSQL(): Boolean = ???

    /** Retrieves whether this database supports batch updates. */
    @stub
    def supportsBatchUpdates(): Boolean = ???

    /** Retrieves whether a catalog name can be used in a data manipulation statement. */
    @stub
    def supportsCatalogsInDataManipulation(): Boolean = ???

    /** Retrieves whether a catalog name can be used in an index definition statement. */
    @stub
    def supportsCatalogsInIndexDefinitions(): Boolean = ???

    /** Retrieves whether a catalog name can be used in a privilege definition statement. */
    @stub
    def supportsCatalogsInPrivilegeDefinitions(): Boolean = ???

    /** Retrieves whether a catalog name can be used in a procedure call statement. */
    @stub
    def supportsCatalogsInProcedureCalls(): Boolean = ???

    /** Retrieves whether a catalog name can be used in a table definition statement. */
    @stub
    def supportsCatalogsInTableDefinitions(): Boolean = ???

    /** Retrieves whether this database supports column aliasing. */
    @stub
    def supportsColumnAliasing(): Boolean = ???

    /** Retrieves whether this database supports the JDBC scalar function
     *  CONVERT for the conversion of one JDBC type to another.
     */
    @stub
    def supportsConvert(): Boolean = ???

    /** Retrieves whether this database supports the JDBC scalar function
     *  CONVERT for conversions between the JDBC types fromType
     *  and toType.
     */
    @stub
    def supportsConvert(fromType: Int, toType: Int): Boolean = ???

    /** Retrieves whether this database supports the ODBC Core SQL grammar. */
    @stub
    def supportsCoreSQLGrammar(): Boolean = ???

    /** Retrieves whether this database supports correlated subqueries. */
    @stub
    def supportsCorrelatedSubqueries(): Boolean = ???

    /** Retrieves whether this database supports both data definition and
     *  data manipulation statements within a transaction.
     */
    @stub
    def supportsDataDefinitionAndDataManipulationTransactions(): Boolean = ???

    /** Retrieves whether this database supports only data manipulation
     *  statements within a transaction.
     */
    @stub
    def supportsDataManipulationTransactionsOnly(): Boolean = ???

    /** Retrieves whether, when table correlation names are supported, they
     *  are restricted to being different from the names of the tables.
     */
    @stub
    def supportsDifferentTableCorrelationNames(): Boolean = ???

    /** Retrieves whether this database supports expressions in
     *  ORDER BY lists.
     */
    @stub
    def supportsExpressionsInOrderBy(): Boolean = ???

    /** Retrieves whether this database supports the ODBC Extended SQL grammar. */
    @stub
    def supportsExtendedSQLGrammar(): Boolean = ???

    /** Retrieves whether this database supports full nested outer joins. */
    @stub
    def supportsFullOuterJoins(): Boolean = ???

    /** Retrieves whether auto-generated keys can be retrieved after
     *  a statement has been executed
     */
    @stub
    def supportsGetGeneratedKeys(): Boolean = ???

    /** Retrieves whether this database supports some form of
     *  GROUP BY clause.
     */
    @stub
    def supportsGroupBy(): Boolean = ???

    /** Retrieves whether this database supports using columns not included in
     *  the SELECT statement in a GROUP BY clause
     *  provided that all of the columns in the SELECT statement
     *  are included in the GROUP BY clause.
     */
    @stub
    def supportsGroupByBeyondSelect(): Boolean = ???

    /** Retrieves whether this database supports using a column that is
     *  not in the SELECT statement in a
     *  GROUP BY clause.
     */
    @stub
    def supportsGroupByUnrelated(): Boolean = ???

    /** Retrieves whether this database supports the SQL Integrity
     *  Enhancement Facility.
     */
    @stub
    def supportsIntegrityEnhancementFacility(): Boolean = ???

    /** Retrieves whether this database supports specifying a
     *  LIKE escape clause.
     */
    @stub
    def supportsLikeEscapeClause(): Boolean = ???

    /** Retrieves whether this database provides limited support for outer
     *  joins.
     */
    @stub
    def supportsLimitedOuterJoins(): Boolean = ???

    /** Retrieves whether this database supports the ODBC Minimum SQL grammar. */
    @stub
    def supportsMinimumSQLGrammar(): Boolean = ???

    /** Retrieves whether this database treats mixed case unquoted SQL identifiers as
     *  case sensitive and as a result stores them in mixed case.
     */
    @stub
    def supportsMixedCaseIdentifiers(): Boolean = ???

    /** Retrieves whether this database treats mixed case quoted SQL identifiers as
     *  case sensitive and as a result stores them in mixed case.
     */
    @stub
    def supportsMixedCaseQuotedIdentifiers(): Boolean = ???

    /** Retrieves whether it is possible to have multiple ResultSet objects
     *  returned from a CallableStatement object
     *  simultaneously.
     */
    @stub
    def supportsMultipleOpenResults(): Boolean = ???

    /** Retrieves whether this database supports getting multiple
     *  ResultSet objects from a single call to the
     *  method execute.
     */
    @stub
    def supportsMultipleResultSets(): Boolean = ???

    /** Retrieves whether this database allows having multiple
     *  transactions open at once (on different connections).
     */
    @stub
    def supportsMultipleTransactions(): Boolean = ???

    /** Retrieves whether this database supports named parameters to callable
     *  statements.
     */
    @stub
    def supportsNamedParameters(): Boolean = ???

    /** Retrieves whether columns in this database may be defined as non-nullable. */
    @stub
    def supportsNonNullableColumns(): Boolean = ???

    /** Retrieves whether this database supports keeping cursors open
     *  across commits.
     */
    @stub
    def supportsOpenCursorsAcrossCommit(): Boolean = ???

    /** Retrieves whether this database supports keeping cursors open
     *  across rollbacks.
     */
    @stub
    def supportsOpenCursorsAcrossRollback(): Boolean = ???

    /** Retrieves whether this database supports keeping statements open
     *  across commits.
     */
    @stub
    def supportsOpenStatementsAcrossCommit(): Boolean = ???

    /** Retrieves whether this database supports keeping statements open
     *  across rollbacks.
     */
    @stub
    def supportsOpenStatementsAcrossRollback(): Boolean = ???

    /** Retrieves whether this database supports using a column that is
     *  not in the SELECT statement in an
     *  ORDER BY clause.
     */
    @stub
    def supportsOrderByUnrelated(): Boolean = ???

    /** Retrieves whether this database supports some form of outer join. */
    @stub
    def supportsOuterJoins(): Boolean = ???

    /** Retrieves whether this database supports positioned DELETE
     *  statements.
     */
    @stub
    def supportsPositionedDelete(): Boolean = ???

    /** Retrieves whether this database supports positioned UPDATE
     *  statements.
     */
    @stub
    def supportsPositionedUpdate(): Boolean = ???

    /** Retrieves whether this database supports REF CURSOR. */
    @stub
    def supportsRefCursors(): Boolean = ???

    /** Retrieves whether this database supports the given concurrency type
     *  in combination with the given result set type.
     */
    @stub
    def supportsResultSetConcurrency(type: Int, concurrency: Int): Boolean = ???

    /** Retrieves whether this database supports the given result set holdability. */
    @stub
    def supportsResultSetHoldability(holdability: Int): Boolean = ???

    /** Retrieves whether this database supports the given result set type. */
    @stub
    def supportsResultSetType(type: Int): Boolean = ???

    /** Retrieves whether this database supports savepoints. */
    @stub
    def supportsSavepoints(): Boolean = ???

    /** Retrieves whether a schema name can be used in a data manipulation statement. */
    @stub
    def supportsSchemasInDataManipulation(): Boolean = ???

    /** Retrieves whether a schema name can be used in an index definition statement. */
    @stub
    def supportsSchemasInIndexDefinitions(): Boolean = ???

    /** Retrieves whether a schema name can be used in a privilege definition statement. */
    @stub
    def supportsSchemasInPrivilegeDefinitions(): Boolean = ???

    /** Retrieves whether a schema name can be used in a procedure call statement. */
    @stub
    def supportsSchemasInProcedureCalls(): Boolean = ???

    /** Retrieves whether a schema name can be used in a table definition statement. */
    @stub
    def supportsSchemasInTableDefinitions(): Boolean = ???

    /** Retrieves whether this database supports SELECT FOR UPDATE
     *  statements.
     */
    @stub
    def supportsSelectForUpdate(): Boolean = ???

    /** Retrieves whether this database supports statement pooling. */
    @stub
    def supportsStatementPooling(): Boolean = ???

    /** Retrieves whether this database supports invoking user-defined or vendor functions
     *  using the stored procedure escape syntax.
     */
    @stub
    def supportsStoredFunctionsUsingCallSyntax(): Boolean = ???

    /** Retrieves whether this database supports stored procedure calls
     *  that use the stored procedure escape syntax.
     */
    @stub
    def supportsStoredProcedures(): Boolean = ???

    /** Retrieves whether this database supports subqueries in comparison
     *  expressions.
     */
    @stub
    def supportsSubqueriesInComparisons(): Boolean = ???

    /** Retrieves whether this database supports subqueries in
     *  EXISTS expressions.
     */
    @stub
    def supportsSubqueriesInExists(): Boolean = ???

    /** Retrieves whether this database supports subqueries in
     *  IN expressions.
     */
    @stub
    def supportsSubqueriesInIns(): Boolean = ???

    /** Retrieves whether this database supports subqueries in quantified
     *  expressions.
     */
    @stub
    def supportsSubqueriesInQuantifieds(): Boolean = ???

    /** Retrieves whether this database supports table correlation names. */
    @stub
    def supportsTableCorrelationNames(): Boolean = ???

    /** Retrieves whether this database supports the given transaction isolation level. */
    @stub
    def supportsTransactionIsolationLevel(level: Int): Boolean = ???

    /** Retrieves whether this database supports transactions. */
    @stub
    def supportsTransactions(): Boolean = ???

    /** Retrieves whether this database supports SQL UNION. */
    @stub
    def supportsUnion(): Boolean = ???

    /** Retrieves whether this database supports SQL UNION ALL. */
    @stub
    def supportsUnionAll(): Boolean = ???

    /** Retrieves whether or not a visible row update can be detected by
     *  calling the method ResultSet.rowUpdated.
     */
    @stub
    def updatesAreDetected(type: Int): Boolean = ???

    /** Retrieves whether this database uses a file for each table. */
    @stub
    def usesLocalFilePerTable(): Boolean = ???

    /** Retrieves whether this database stores tables in a local file. */
    @stub
    def usesLocalFiles(): Boolean = ???
}

object DatabaseMetaData {
    /** Indicates that NULL values might not be allowed. */
    @stub
    val attributeNoNulls: Short = ???

    /** Indicates that NULL values are definitely allowed. */
    @stub
    val attributeNullable: Short = ???

    /** Indicates that whether NULL values are allowed is not
     *  known.
     */
    @stub
    val attributeNullableUnknown: Short = ???

    /** Indicates that the best row identifier is NOT a pseudo column. */
    @stub
    val bestRowNotPseudo: Int = ???

    /** Indicates that the best row identifier is a pseudo column. */
    @stub
    val bestRowPseudo: Int = ???

    /** Indicates that the scope of the best row identifier is
     *  the remainder of the current session.
     */
    @stub
    val bestRowSession: Int = ???

    /** Indicates that the scope of the best row identifier is
     *  very temporary, lasting only while the
     *  row is being used.
     */
    @stub
    val bestRowTemporary: Int = ???

    /** Indicates that the scope of the best row identifier is
     *  the remainder of the current transaction.
     */
    @stub
    val bestRowTransaction: Int = ???

    /** Indicates that the best row identifier may or may not be a pseudo column. */
    @stub
    val bestRowUnknown: Int = ???

    /** Indicates that the column might not allow NULL values. */
    @stub
    val columnNoNulls: Int = ???

    /** Indicates that the column definitely allows NULL values. */
    @stub
    val columnNullable: Int = ???

    /** Indicates that the nullability of columns is unknown. */
    @stub
    val columnNullableUnknown: Int = ???

    /** Indicates that the parameter or column is an IN parameter. */
    @stub
    val functionColumnIn: Int = ???

    /** Indicates that the parameter or column is an INOUT parameter. */
    @stub
    val functionColumnInOut: Int = ???

    /** Indicates that the parameter or column is an OUT parameter. */
    @stub
    val functionColumnOut: Int = ???

    /** Indicates that the parameter or column is a column in a result set. */
    @stub
    val functionColumnResult: Int = ???

    /** Indicates that type of the parameter or column is unknown. */
    @stub
    val functionColumnUnknown: Int = ???

    /** Indicates that NULL values are not allowed. */
    @stub
    val functionNoNulls: Int = ???

    /** Indicates that the function  does not return a table. */
    @stub
    val functionNoTable: Int = ???

    /** Indicates that NULL values are allowed. */
    @stub
    val functionNullable: Int = ???

    /** Indicates that whether NULL values are allowed
     *  is unknown.
     */
    @stub
    val functionNullableUnknown: Int = ???

    /** Indicates that it is not known whether the function returns
     *  a result or a table.
     */
    @stub
    val functionResultUnknown: Int = ???

    /** Indicates that the parameter or column is a return value. */
    @stub
    val functionReturn: Int = ???

    /** Indicates that the function  returns a table. */
    @stub
    val functionReturnsTable: Int = ???

    /** For the column UPDATE_RULE,
     *  indicates that
     *  when the primary key is updated, the foreign key (imported key)
     *  is changed to agree with it.
     */
    @stub
    val importedKeyCascade: Int = ???

    /** Indicates deferrability. */
    @stub
    val importedKeyInitiallyDeferred: Int = ???

    /** Indicates deferrability. */
    @stub
    val importedKeyInitiallyImmediate: Int = ???

    /** For the columns UPDATE_RULE
     *  and DELETE_RULE, indicates that
     *  if the primary key has been imported, it cannot be updated or deleted.
     */
    @stub
    val importedKeyNoAction: Int = ???

    /** Indicates deferrability. */
    @stub
    val importedKeyNotDeferrable: Int = ???

    /** For the column UPDATE_RULE, indicates that
     *  a primary key may not be updated if it has been imported by
     *  another table as a foreign key.
     */
    @stub
    val importedKeyRestrict: Int = ???

    /** For the columns UPDATE_RULE
     *  and DELETE_RULE, indicates that
     *  if the primary key is updated or deleted, the foreign key (imported key)
     *  is set to the default value.
     */
    @stub
    val importedKeySetDefault: Int = ???

    /** For the columns UPDATE_RULE
     *  and DELETE_RULE, indicates that
     *  when the primary key is updated or deleted, the foreign key (imported key)
     *  is changed to NULL.
     */
    @stub
    val importedKeySetNull: Int = ???

    /** Indicates that the column stores IN parameters. */
    @stub
    val procedureColumnIn: Int = ???

    /** Indicates that the column stores INOUT parameters. */
    @stub
    val procedureColumnInOut: Int = ???

    /** Indicates that the column stores OUT parameters. */
    @stub
    val procedureColumnOut: Int = ???

    /** Indicates that the column stores results. */
    @stub
    val procedureColumnResult: Int = ???

    /** Indicates that the column stores return values. */
    @stub
    val procedureColumnReturn: Int = ???

    /** Indicates that type of the column is unknown. */
    @stub
    val procedureColumnUnknown: Int = ???

    /** Indicates that NULL values are not allowed. */
    @stub
    val procedureNoNulls: Int = ???

    /** Indicates that the procedure does not return a result. */
    @stub
    val procedureNoResult: Int = ???

    /** Indicates that NULL values are allowed. */
    @stub
    val procedureNullable: Int = ???

    /** Indicates that whether NULL values are allowed
     *  is unknown.
     */
    @stub
    val procedureNullableUnknown: Int = ???

    /** Indicates that it is not known whether the procedure returns
     *  a result.
     */
    @stub
    val procedureResultUnknown: Int = ???

    /** Indicates that the procedure returns a result. */
    @stub
    val procedureReturnsResult: Int = ???

    /** A possible return value for the method
     *  DatabaseMetaData.getSQLStateType which is used to indicate
     *  whether the value returned by the method
     *  SQLException.getSQLState is an SQLSTATE value.
     */
    @stub
    val sqlStateSQL: Int = ???

    /** A possible return value for the method
     *  DatabaseMetaData.getSQLStateType which is used to indicate
     *  whether the value returned by the method
     *  SQLException.getSQLState is an SQL99 SQLSTATE value.
     */
    @stub
    val sqlStateSQL99: Int = ???

    /** A possible return value for the method
     *  DatabaseMetaData.getSQLStateType which is used to indicate
     *  whether the value returned by the method
     *  SQLException.getSQLState is an
     *  X/Open (now know as Open Group) SQL CLI SQLSTATE value.
     */
    @stub
    val sqlStateXOpen: Int = ???

    /** Indicates that this table index is a clustered index. */
    @stub
    val tableIndexClustered: Short = ???

    /** Indicates that this table index is a hashed index. */
    @stub
    val tableIndexHashed: Short = ???

    /** Indicates that this table index is not a clustered
     *  index, a hashed index, or table statistics;
     *  it is something other than these.
     */
    @stub
    val tableIndexOther: Short = ???

    /** Indicates that this column contains table statistics that
     *  are returned in conjunction with a table's index descriptions.
     */
    @stub
    val tableIndexStatistic: Short = ???

    /** Indicates that a NULL value is NOT allowed for this
     *  data type.
     */
    @stub
    val typeNoNulls: Int = ???

    /** Indicates that a NULL value is allowed for this
     *  data type.
     */
    @stub
    val typeNullable: Int = ???

    /** Indicates that it is not known whether a NULL value
     *  is allowed for this data type.
     */
    @stub
    val typeNullableUnknown: Int = ???

    /** Indicates that the data type can be only be used in WHERE
     *  search clauses
     *  that do not use LIKE predicates.
     */
    @stub
    val typePredBasic: Int = ???

    /** Indicates that the data type
     *  can be only be used in WHERE search clauses
     *  that  use LIKE predicates.
     */
    @stub
    val typePredChar: Int = ???

    /** Indicates that WHERE search clauses are not supported
     *  for this type.
     */
    @stub
    val typePredNone: Int = ???

    /** Indicates that all WHERE search clauses can be
     *  based on this type.
     */
    @stub
    val typeSearchable: Int = ???

    /** Indicates that this version column is NOT a pseudo column. */
    @stub
    val versionColumnNotPseudo: Int = ???

    /** Indicates that this version column is a pseudo column. */
    @stub
    val versionColumnPseudo: Int = ???

    /** Indicates that this version column may or may not be a pseudo column. */
    @stub
    val versionColumnUnknown: Int = ???
}

package java.sql

import java.lang.String

// Comprehensive information about the database as a whole.
// 
// This interface is implemented by driver vendors to let users know the capabilities
// of a Database Management System (DBMS) in combination with
// the driver based on JDBC™ technology
// ("JDBC driver") that is used with it.  Different relational DBMSs often support
// different features, implement features in different ways, and use different
// data types.  In addition, a driver may implement a feature on top of what the
// DBMS offers.  Information returned by methods in this interface applies
// to the capabilities of a particular driver and a particular DBMS working
// together. Note that as used in this documentation, the term "database" is
// used generically to refer to both the driver and DBMS.
// 
// A user for this interface is commonly a tool that needs to discover how to
// deal with the underlying DBMS.  This is especially true for applications
// that are intended to be used with more than one DBMS. For example, a tool might use the method
// getTypeInfo to find out what data types can be used in a
// CREATE TABLE statement.  Or a user might call the method
// supportsCorrelatedSubqueries to see if it is possible to use
// a correlated subquery or supportsBatchUpdates to see if it is
// possible to use batch updates.
// 
// Some DatabaseMetaData methods return lists of information
// in the form of ResultSet objects.
// Regular ResultSet methods, such as
// getString and getInt, can be used
// to retrieve the data from these ResultSet objects.  If
// a given form of metadata is not available, an empty ResultSet
// will be returned. Additional columns beyond the columns defined to be
// returned by the ResultSet object for a given method
// can be defined by the JDBC driver vendor and must be accessed
// by their column label.
// 
// Some DatabaseMetaData methods take arguments that are
// String patterns.  These arguments all have names such as fooPattern.
// Within a pattern String, "%" means match any substring of 0 or more
// characters, and "_" means match any one character. Only metadata
// entries matching the search pattern are returned. If a search pattern
// argument is set to null, that argument's criterion will
// be dropped from the search.
trait DatabaseMetaData extends Wrapper {

    @stub
    // Retrieves whether the current user can call all the procedures
    // returned by the method getProcedures.
    def allProceduresAreCallable(): Boolean = ???

    @stub
    // Retrieves whether the current user can use all the tables returned
    // by the method getTables in a SELECT
    // statement.
    def allTablesAreSelectable(): Boolean = ???

    @stub
    // Retrieves whether a SQLException while autoCommit is true indicates
    // that all open ResultSets are closed, even ones that are holdable.
    def autoCommitFailureClosesAllResultSets(): Boolean = ???

    @stub
    // Retrieves whether a data definition statement within a transaction forces
    // the transaction to commit.
    def dataDefinitionCausesTransactionCommit(): Boolean = ???

    @stub
    // Retrieves whether this database ignores a data definition statement
    // within a transaction.
    def dataDefinitionIgnoredInTransactions(): Boolean = ???

    @stub
    // Retrieves whether or not a visible row delete can be detected by
    // calling the method ResultSet.rowDeleted.
    def deletesAreDetected(type: Int): Boolean = ???

    @stub
    // Retrieves whether the return value for the method
    // getMaxRowSize includes the SQL data types
    // LONGVARCHAR and LONGVARBINARY.
    def doesMaxRowSizeIncludeBlobs(): Boolean = ???

    @stub
    // Retrieves whether a generated key will always be returned if the column
    // name(s) or index(es) specified for the auto generated key column(s)
    // are valid and the statement succeeds.
    def generatedKeyAlwaysReturned(): Boolean = ???

    @stub
    // Retrieves a description of the given attribute of the given type
    // for a user-defined type (UDT) that is available in the given schema
    // and catalog.
    def getAttributes(catalog: String, schemaPattern: String, typeNamePattern: String, attributeNamePattern: String): ResultSet = ???

    @stub
    // Retrieves a description of a table's optimal set of columns that
    // uniquely identifies a row.
    def getBestRowIdentifier(catalog: String, schema: String, table: String, scope: Int, nullable: Boolean): ResultSet = ???

    @stub
    // Retrieves the catalog names available in this database.
    def getCatalogs(): ResultSet = ???

    @stub
    // Retrieves the String that this database uses as the
    // separator between a catalog and table name.
    def getCatalogSeparator(): String = ???

    @stub
    // Retrieves the database vendor's preferred term for "catalog".
    def getCatalogTerm(): String = ???

    @stub
    // Retrieves a list of the client info properties
    // that the driver supports.
    def getClientInfoProperties(): ResultSet = ???

    @stub
    // Retrieves a description of the access rights for a table's columns.
    def getColumnPrivileges(catalog: String, schema: String, table: String, columnNamePattern: String): ResultSet = ???

    @stub
    // Retrieves a description of table columns available in
    // the specified catalog.
    def getColumns(catalog: String, schemaPattern: String, tableNamePattern: String, columnNamePattern: String): ResultSet = ???

    @stub
    // Retrieves the connection that produced this metadata object.
    def getConnection(): Connection = ???

    @stub
    // Retrieves a description of the foreign key columns in the given foreign key
    // table that reference the primary key or the columns representing a unique constraint of the  parent table (could be the same or a different table).
    def getCrossReference(parentCatalog: String, parentSchema: String, parentTable: String, foreignCatalog: String, foreignSchema: String, foreignTable: String): ResultSet = ???

    @stub
    // Retrieves the major version number of the underlying database.
    def getDatabaseMajorVersion(): Int = ???

    @stub
    // Retrieves the minor version number of the underlying database.
    def getDatabaseMinorVersion(): Int = ???

    @stub
    // Retrieves the name of this database product.
    def getDatabaseProductName(): String = ???

    @stub
    // Retrieves the version number of this database product.
    def getDatabaseProductVersion(): String = ???

    @stub
    // Retrieves this database's default transaction isolation level.
    def getDefaultTransactionIsolation(): Int = ???

    @stub
    // Retrieves this JDBC driver's major version number.
    def getDriverMajorVersion(): Int = ???

    @stub
    // Retrieves this JDBC driver's minor version number.
    def getDriverMinorVersion(): Int = ???

    @stub
    // Retrieves the name of this JDBC driver.
    def getDriverName(): String = ???

    @stub
    // Retrieves the version number of this JDBC driver as a String.
    def getDriverVersion(): String = ???

    @stub
    // Retrieves a description of the foreign key columns that reference the
    // given table's primary key columns (the foreign keys exported by a
    // table).
    def getExportedKeys(catalog: String, schema: String, table: String): ResultSet = ???

    @stub
    // Retrieves all the "extra" characters that can be used in unquoted
    // identifier names (those beyond a-z, A-Z, 0-9 and _).
    def getExtraNameCharacters(): String = ???

    @stub
    // Retrieves a description of the given catalog's system or user
    // function parameters and return type.
    def getFunctionColumns(catalog: String, schemaPattern: String, functionNamePattern: String, columnNamePattern: String): ResultSet = ???

    @stub
    // Retrieves a description of the  system and user functions available
    // in the given catalog.
    def getFunctions(catalog: String, schemaPattern: String, functionNamePattern: String): ResultSet = ???

    @stub
    // Retrieves the string used to quote SQL identifiers.
    def getIdentifierQuoteString(): String = ???

    @stub
    // Retrieves a description of the primary key columns that are
    // referenced by the given table's foreign key columns (the primary keys
    // imported by a table).
    def getImportedKeys(catalog: String, schema: String, table: String): ResultSet = ???

    @stub
    // Retrieves a description of the given table's indices and statistics.
    def getIndexInfo(catalog: String, schema: String, table: String, unique: Boolean, approximate: Boolean): ResultSet = ???

    @stub
    // Retrieves the major JDBC version number for this
    // driver.
    def getJDBCMajorVersion(): Int = ???

    @stub
    // Retrieves the minor JDBC version number for this
    // driver.
    def getJDBCMinorVersion(): Int = ???

    @stub
    // Retrieves the maximum number of hex characters this database allows in an
    // inline binary literal.
    def getMaxBinaryLiteralLength(): Int = ???

    @stub
    // Retrieves the maximum number of characters that this database allows in a
    // catalog name.
    def getMaxCatalogNameLength(): Int = ???

    @stub
    // Retrieves the maximum number of characters this database allows
    // for a character literal.
    def getMaxCharLiteralLength(): Int = ???

    @stub
    // Retrieves the maximum number of characters this database allows
    // for a column name.
    def getMaxColumnNameLength(): Int = ???

    @stub
    // Retrieves the maximum number of columns this database allows in a
    // GROUP BY clause.
    def getMaxColumnsInGroupBy(): Int = ???

    @stub
    // Retrieves the maximum number of columns this database allows in an index.
    def getMaxColumnsInIndex(): Int = ???

    @stub
    // Retrieves the maximum number of columns this database allows in an
    // ORDER BY clause.
    def getMaxColumnsInOrderBy(): Int = ???

    @stub
    // Retrieves the maximum number of columns this database allows in a
    // SELECT list.
    def getMaxColumnsInSelect(): Int = ???

    @stub
    // Retrieves the maximum number of columns this database allows in a table.
    def getMaxColumnsInTable(): Int = ???

    @stub
    // Retrieves the maximum number of concurrent connections to this
    // database that are possible.
    def getMaxConnections(): Int = ???

    @stub
    // Retrieves the maximum number of characters that this database allows in a
    // cursor name.
    def getMaxCursorNameLength(): Int = ???

    @stub
    // Retrieves the maximum number of bytes this database allows for an
    // index, including all of the parts of the index.
    def getMaxIndexLength(): Int = ???

    @stub
    // Retrieves the maximum number of bytes this database allows for
    // the logical size for a LOB.
    def Long: default = ???

    @stub
    // Retrieves the maximum number of characters that this database allows in a
    // procedure name.
    def getMaxProcedureNameLength(): Int = ???

    @stub
    // Retrieves the maximum number of bytes this database allows in
    // a single row.
    def getMaxRowSize(): Int = ???

    @stub
    // Retrieves the maximum number of characters that this database allows in a
    // schema name.
    def getMaxSchemaNameLength(): Int = ???

    @stub
    // Retrieves the maximum number of characters this database allows in
    // an SQL statement.
    def getMaxStatementLength(): Int = ???

    @stub
    // Retrieves the maximum number of active statements to this database
    // that can be open at the same time.
    def getMaxStatements(): Int = ???

    @stub
    // Retrieves the maximum number of characters this database allows in
    // a table name.
    def getMaxTableNameLength(): Int = ???

    @stub
    // Retrieves the maximum number of tables this database allows in a
    // SELECT statement.
    def getMaxTablesInSelect(): Int = ???

    @stub
    // Retrieves the maximum number of characters this database allows in
    // a user name.
    def getMaxUserNameLength(): Int = ???

    @stub
    // Retrieves a comma-separated list of math functions available with
    // this database.
    def getNumericFunctions(): String = ???

    @stub
    // Retrieves a description of the given table's primary key columns.
    def getPrimaryKeys(catalog: String, schema: String, table: String): ResultSet = ???

    @stub
    // Retrieves a description of the given catalog's stored procedure parameter
    // and result columns.
    def getProcedureColumns(catalog: String, schemaPattern: String, procedureNamePattern: String, columnNamePattern: String): ResultSet = ???

    @stub
    // Retrieves a description of the stored procedures available in the given
    // catalog.
    def getProcedures(catalog: String, schemaPattern: String, procedureNamePattern: String): ResultSet = ???

    @stub
    // Retrieves the database vendor's preferred term for "procedure".
    def getProcedureTerm(): String = ???

    @stub
    // Retrieves a description of the pseudo or hidden columns available
    // in a given table within the specified catalog and schema.
    def getPseudoColumns(catalog: String, schemaPattern: String, tableNamePattern: String, columnNamePattern: String): ResultSet = ???

    @stub
    // Retrieves this database's default holdability for ResultSet
    // objects.
    def getResultSetHoldability(): Int = ???

    @stub
    // Indicates whether or not this data source supports the SQL ROWID type,
    // and if so  the lifetime for which a RowId object remains valid.
    def getRowIdLifetime(): RowIdLifetime = ???

    @stub
    // Retrieves the schema names available in this database.
    def getSchemas(): ResultSet = ???

    @stub
    // Retrieves the schema names available in this database.
    def getSchemas(catalog: String, schemaPattern: String): ResultSet = ???

    @stub
    // Retrieves the database vendor's preferred term for "schema".
    def getSchemaTerm(): String = ???

    @stub
    // Retrieves the string that can be used to escape wildcard characters.
    def getSearchStringEscape(): String = ???

    @stub
    // Retrieves a comma-separated list of all of this database's SQL keywords
    // that are NOT also SQL:2003 keywords.
    def getSQLKeywords(): String = ???

    @stub
    // Indicates whether the SQLSTATE returned by SQLException.getSQLState
    // is X/Open (now known as Open Group) SQL CLI or SQL:2003.
    def getSQLStateType(): Int = ???

    @stub
    // Retrieves a comma-separated list of string functions available with
    // this database.
    def getStringFunctions(): String = ???

    @stub
    // Retrieves a description of the table hierarchies defined in a particular
    // schema in this database.
    def getSuperTables(catalog: String, schemaPattern: String, tableNamePattern: String): ResultSet = ???

    @stub
    // Retrieves a description of the user-defined type (UDT) hierarchies defined in a
    // particular schema in this database.
    def getSuperTypes(catalog: String, schemaPattern: String, typeNamePattern: String): ResultSet = ???

    @stub
    // Retrieves a comma-separated list of system functions available with
    // this database.
    def getSystemFunctions(): String = ???

    @stub
    // Retrieves a description of the access rights for each table available
    // in a catalog.
    def getTablePrivileges(catalog: String, schemaPattern: String, tableNamePattern: String): ResultSet = ???

    @stub
    // Retrieves a description of the tables available in the given catalog.
    def getTables(catalog: String, schemaPattern: String, tableNamePattern: String, types: Array[String]): ResultSet = ???

    @stub
    // Retrieves the table types available in this database.
    def getTableTypes(): ResultSet = ???

    @stub
    // Retrieves a comma-separated list of the time and date functions available
    // with this database.
    def getTimeDateFunctions(): String = ???

    @stub
    // Retrieves a description of all the data types supported by
    // this database.
    def getTypeInfo(): ResultSet = ???

    @stub
    // Retrieves a description of the user-defined types (UDTs) defined
    // in a particular schema.
    def getUDTs(catalog: String, schemaPattern: String, typeNamePattern: String, types: Array[Int]): ResultSet = ???

    @stub
    // Retrieves the URL for this DBMS.
    def getURL(): String = ???

    @stub
    // Retrieves the user name as known to this database.
    def getUserName(): String = ???

    @stub
    // Retrieves a description of a table's columns that are automatically
    // updated when any value in a row is updated.
    def getVersionColumns(catalog: String, schema: String, table: String): ResultSet = ???

    @stub
    // Retrieves whether or not a visible row insert can be detected
    // by calling the method ResultSet.rowInserted.
    def insertsAreDetected(type: Int): Boolean = ???

    @stub
    // Retrieves whether a catalog appears at the start of a fully qualified
    // table name.
    def isCatalogAtStart(): Boolean = ???

    @stub
    // Retrieves whether this database is in read-only mode.
    def isReadOnly(): Boolean = ???

    @stub
    // Indicates whether updates made to a LOB are made on a copy or directly
    // to the LOB.
    def locatorsUpdateCopy(): Boolean = ???

    @stub
    // Retrieves whether this database supports concatenations between
    // NULL and non-NULL values being
    // NULL.
    def nullPlusNonNullIsNull(): Boolean = ???

    @stub
    // Retrieves whether NULL values are sorted at the end regardless of
    // sort order.
    def nullsAreSortedAtEnd(): Boolean = ???

    @stub
    // Retrieves whether NULL values are sorted at the start regardless
    // of sort order.
    def nullsAreSortedAtStart(): Boolean = ???

    @stub
    // Retrieves whether NULL values are sorted high.
    def nullsAreSortedHigh(): Boolean = ???

    @stub
    // Retrieves whether NULL values are sorted low.
    def nullsAreSortedLow(): Boolean = ???

    @stub
    // Retrieves whether deletes made by others are visible.
    def othersDeletesAreVisible(type: Int): Boolean = ???

    @stub
    // Retrieves whether inserts made by others are visible.
    def othersInsertsAreVisible(type: Int): Boolean = ???

    @stub
    // Retrieves whether updates made by others are visible.
    def othersUpdatesAreVisible(type: Int): Boolean = ???

    @stub
    // Retrieves whether a result set's own deletes are visible.
    def ownDeletesAreVisible(type: Int): Boolean = ???

    @stub
    // Retrieves whether a result set's own inserts are visible.
    def ownInsertsAreVisible(type: Int): Boolean = ???

    @stub
    // Retrieves whether for the given type of ResultSet object,
    // the result set's own updates are visible.
    def ownUpdatesAreVisible(type: Int): Boolean = ???

    @stub
    // Retrieves whether this database treats mixed case unquoted SQL identifiers as
    // case insensitive and stores them in lower case.
    def storesLowerCaseIdentifiers(): Boolean = ???

    @stub
    // Retrieves whether this database treats mixed case quoted SQL identifiers as
    // case insensitive and stores them in lower case.
    def storesLowerCaseQuotedIdentifiers(): Boolean = ???

    @stub
    // Retrieves whether this database treats mixed case unquoted SQL identifiers as
    // case insensitive and stores them in mixed case.
    def storesMixedCaseIdentifiers(): Boolean = ???

    @stub
    // Retrieves whether this database treats mixed case quoted SQL identifiers as
    // case insensitive and stores them in mixed case.
    def storesMixedCaseQuotedIdentifiers(): Boolean = ???

    @stub
    // Retrieves whether this database treats mixed case unquoted SQL identifiers as
    // case insensitive and stores them in upper case.
    def storesUpperCaseIdentifiers(): Boolean = ???

    @stub
    // Retrieves whether this database treats mixed case quoted SQL identifiers as
    // case insensitive and stores them in upper case.
    def storesUpperCaseQuotedIdentifiers(): Boolean = ???

    @stub
    // Retrieves whether this database supports ALTER TABLE
    // with add column.
    def supportsAlterTableWithAddColumn(): Boolean = ???

    @stub
    // Retrieves whether this database supports ALTER TABLE
    // with drop column.
    def supportsAlterTableWithDropColumn(): Boolean = ???

    @stub
    // Retrieves whether this database supports the ANSI92 entry level SQL
    // grammar.
    def supportsANSI92EntryLevelSQL(): Boolean = ???

    @stub
    // Retrieves whether this database supports the ANSI92 full SQL grammar supported.
    def supportsANSI92FullSQL(): Boolean = ???

    @stub
    // Retrieves whether this database supports the ANSI92 intermediate SQL grammar supported.
    def supportsANSI92IntermediateSQL(): Boolean = ???

    @stub
    // Retrieves whether this database supports batch updates.
    def supportsBatchUpdates(): Boolean = ???

    @stub
    // Retrieves whether a catalog name can be used in a data manipulation statement.
    def supportsCatalogsInDataManipulation(): Boolean = ???

    @stub
    // Retrieves whether a catalog name can be used in an index definition statement.
    def supportsCatalogsInIndexDefinitions(): Boolean = ???

    @stub
    // Retrieves whether a catalog name can be used in a privilege definition statement.
    def supportsCatalogsInPrivilegeDefinitions(): Boolean = ???

    @stub
    // Retrieves whether a catalog name can be used in a procedure call statement.
    def supportsCatalogsInProcedureCalls(): Boolean = ???

    @stub
    // Retrieves whether a catalog name can be used in a table definition statement.
    def supportsCatalogsInTableDefinitions(): Boolean = ???

    @stub
    // Retrieves whether this database supports column aliasing.
    def supportsColumnAliasing(): Boolean = ???

    @stub
    // Retrieves whether this database supports the JDBC scalar function
    // CONVERT for the conversion of one JDBC type to another.
    def supportsConvert(): Boolean = ???

    @stub
    // Retrieves whether this database supports the JDBC scalar function
    // CONVERT for conversions between the JDBC types fromType
    // and toType.
    def supportsConvert(fromType: Int, toType: Int): Boolean = ???

    @stub
    // Retrieves whether this database supports the ODBC Core SQL grammar.
    def supportsCoreSQLGrammar(): Boolean = ???

    @stub
    // Retrieves whether this database supports correlated subqueries.
    def supportsCorrelatedSubqueries(): Boolean = ???

    @stub
    // Retrieves whether this database supports both data definition and
    // data manipulation statements within a transaction.
    def supportsDataDefinitionAndDataManipulationTransactions(): Boolean = ???

    @stub
    // Retrieves whether this database supports only data manipulation
    // statements within a transaction.
    def supportsDataManipulationTransactionsOnly(): Boolean = ???

    @stub
    // Retrieves whether, when table correlation names are supported, they
    // are restricted to being different from the names of the tables.
    def supportsDifferentTableCorrelationNames(): Boolean = ???

    @stub
    // Retrieves whether this database supports expressions in
    // ORDER BY lists.
    def supportsExpressionsInOrderBy(): Boolean = ???

    @stub
    // Retrieves whether this database supports the ODBC Extended SQL grammar.
    def supportsExtendedSQLGrammar(): Boolean = ???

    @stub
    // Retrieves whether this database supports full nested outer joins.
    def supportsFullOuterJoins(): Boolean = ???

    @stub
    // Retrieves whether auto-generated keys can be retrieved after
    // a statement has been executed
    def supportsGetGeneratedKeys(): Boolean = ???

    @stub
    // Retrieves whether this database supports some form of
    // GROUP BY clause.
    def supportsGroupBy(): Boolean = ???

    @stub
    // Retrieves whether this database supports using columns not included in
    // the SELECT statement in a GROUP BY clause
    // provided that all of the columns in the SELECT statement
    // are included in the GROUP BY clause.
    def supportsGroupByBeyondSelect(): Boolean = ???

    @stub
    // Retrieves whether this database supports using a column that is
    // not in the SELECT statement in a
    // GROUP BY clause.
    def supportsGroupByUnrelated(): Boolean = ???

    @stub
    // Retrieves whether this database supports the SQL Integrity
    // Enhancement Facility.
    def supportsIntegrityEnhancementFacility(): Boolean = ???

    @stub
    // Retrieves whether this database supports specifying a
    // LIKE escape clause.
    def supportsLikeEscapeClause(): Boolean = ???

    @stub
    // Retrieves whether this database provides limited support for outer
    // joins.
    def supportsLimitedOuterJoins(): Boolean = ???

    @stub
    // Retrieves whether this database supports the ODBC Minimum SQL grammar.
    def supportsMinimumSQLGrammar(): Boolean = ???

    @stub
    // Retrieves whether this database treats mixed case unquoted SQL identifiers as
    // case sensitive and as a result stores them in mixed case.
    def supportsMixedCaseIdentifiers(): Boolean = ???

    @stub
    // Retrieves whether this database treats mixed case quoted SQL identifiers as
    // case sensitive and as a result stores them in mixed case.
    def supportsMixedCaseQuotedIdentifiers(): Boolean = ???

    @stub
    // Retrieves whether it is possible to have multiple ResultSet objects
    // returned from a CallableStatement object
    // simultaneously.
    def supportsMultipleOpenResults(): Boolean = ???

    @stub
    // Retrieves whether this database supports getting multiple
    // ResultSet objects from a single call to the
    // method execute.
    def supportsMultipleResultSets(): Boolean = ???

    @stub
    // Retrieves whether this database allows having multiple
    // transactions open at once (on different connections).
    def supportsMultipleTransactions(): Boolean = ???

    @stub
    // Retrieves whether this database supports named parameters to callable
    // statements.
    def supportsNamedParameters(): Boolean = ???

    @stub
    // Retrieves whether columns in this database may be defined as non-nullable.
    def supportsNonNullableColumns(): Boolean = ???

    @stub
    // Retrieves whether this database supports keeping cursors open
    // across commits.
    def supportsOpenCursorsAcrossCommit(): Boolean = ???

    @stub
    // Retrieves whether this database supports keeping cursors open
    // across rollbacks.
    def supportsOpenCursorsAcrossRollback(): Boolean = ???

    @stub
    // Retrieves whether this database supports keeping statements open
    // across commits.
    def supportsOpenStatementsAcrossCommit(): Boolean = ???

    @stub
    // Retrieves whether this database supports keeping statements open
    // across rollbacks.
    def supportsOpenStatementsAcrossRollback(): Boolean = ???

    @stub
    // Retrieves whether this database supports using a column that is
    // not in the SELECT statement in an
    // ORDER BY clause.
    def supportsOrderByUnrelated(): Boolean = ???

    @stub
    // Retrieves whether this database supports some form of outer join.
    def supportsOuterJoins(): Boolean = ???

    @stub
    // Retrieves whether this database supports positioned DELETE
    // statements.
    def supportsPositionedDelete(): Boolean = ???

    @stub
    // Retrieves whether this database supports positioned UPDATE
    // statements.
    def supportsPositionedUpdate(): Boolean = ???

    @stub
    // Retrieves whether this database supports REF CURSOR.
    def Boolean: default = ???

    @stub
    // Retrieves whether this database supports the given concurrency type
    // in combination with the given result set type.
    def supportsResultSetConcurrency(type: Int, concurrency: Int): Boolean = ???

    @stub
    // Retrieves whether this database supports the given result set holdability.
    def supportsResultSetHoldability(holdability: Int): Boolean = ???

    @stub
    // Retrieves whether this database supports the given result set type.
    def supportsResultSetType(type: Int): Boolean = ???

    @stub
    // Retrieves whether this database supports savepoints.
    def supportsSavepoints(): Boolean = ???

    @stub
    // Retrieves whether a schema name can be used in a data manipulation statement.
    def supportsSchemasInDataManipulation(): Boolean = ???

    @stub
    // Retrieves whether a schema name can be used in an index definition statement.
    def supportsSchemasInIndexDefinitions(): Boolean = ???

    @stub
    // Retrieves whether a schema name can be used in a privilege definition statement.
    def supportsSchemasInPrivilegeDefinitions(): Boolean = ???

    @stub
    // Retrieves whether a schema name can be used in a procedure call statement.
    def supportsSchemasInProcedureCalls(): Boolean = ???

    @stub
    // Retrieves whether a schema name can be used in a table definition statement.
    def supportsSchemasInTableDefinitions(): Boolean = ???

    @stub
    // Retrieves whether this database supports SELECT FOR UPDATE
    // statements.
    def supportsSelectForUpdate(): Boolean = ???

    @stub
    // Retrieves whether this database supports statement pooling.
    def supportsStatementPooling(): Boolean = ???

    @stub
    // Retrieves whether this database supports invoking user-defined or vendor functions
    // using the stored procedure escape syntax.
    def supportsStoredFunctionsUsingCallSyntax(): Boolean = ???

    @stub
    // Retrieves whether this database supports stored procedure calls
    // that use the stored procedure escape syntax.
    def supportsStoredProcedures(): Boolean = ???

    @stub
    // Retrieves whether this database supports subqueries in comparison
    // expressions.
    def supportsSubqueriesInComparisons(): Boolean = ???

    @stub
    // Retrieves whether this database supports subqueries in
    // EXISTS expressions.
    def supportsSubqueriesInExists(): Boolean = ???

    @stub
    // Retrieves whether this database supports subqueries in
    // IN expressions.
    def supportsSubqueriesInIns(): Boolean = ???

    @stub
    // Retrieves whether this database supports subqueries in quantified
    // expressions.
    def supportsSubqueriesInQuantifieds(): Boolean = ???

    @stub
    // Retrieves whether this database supports table correlation names.
    def supportsTableCorrelationNames(): Boolean = ???

    @stub
    // Retrieves whether this database supports the given transaction isolation level.
    def supportsTransactionIsolationLevel(level: Int): Boolean = ???

    @stub
    // Retrieves whether this database supports transactions.
    def supportsTransactions(): Boolean = ???

    @stub
    // Retrieves whether this database supports SQL UNION.
    def supportsUnion(): Boolean = ???

    @stub
    // Retrieves whether this database supports SQL UNION ALL.
    def supportsUnionAll(): Boolean = ???

    @stub
    // Retrieves whether or not a visible row update can be detected by
    // calling the method ResultSet.rowUpdated.
    def updatesAreDetected(type: Int): Boolean = ???

    @stub
    // Retrieves whether this database uses a file for each table.
    def usesLocalFilePerTable(): Boolean = ???
}

object DatabaseMetaData {
    @stub
    // Indicates that NULL values might not be allowed.
    def attributeNoNulls: Short = ???

    @stub
    // Indicates that NULL values are definitely allowed.
    def attributeNullable: Short = ???

    @stub
    // Indicates that whether NULL values are allowed is not
    // known.
    def attributeNullableUnknown: Short = ???

    @stub
    // Indicates that the best row identifier is NOT a pseudo column.
    def bestRowNotPseudo: Int = ???

    @stub
    // Indicates that the best row identifier is a pseudo column.
    def bestRowPseudo: Int = ???

    @stub
    // Indicates that the scope of the best row identifier is
    // the remainder of the current session.
    def bestRowSession: Int = ???

    @stub
    // Indicates that the scope of the best row identifier is
    // very temporary, lasting only while the
    // row is being used.
    def bestRowTemporary: Int = ???

    @stub
    // Indicates that the scope of the best row identifier is
    // the remainder of the current transaction.
    def bestRowTransaction: Int = ???

    @stub
    // Indicates that the best row identifier may or may not be a pseudo column.
    def bestRowUnknown: Int = ???

    @stub
    // Indicates that the column might not allow NULL values.
    def columnNoNulls: Int = ???

    @stub
    // Indicates that the column definitely allows NULL values.
    def columnNullable: Int = ???

    @stub
    // Indicates that the nullability of columns is unknown.
    def columnNullableUnknown: Int = ???

    @stub
    // Indicates that the parameter or column is an IN parameter.
    def functionColumnIn: Int = ???

    @stub
    // Indicates that the parameter or column is an INOUT parameter.
    def functionColumnInOut: Int = ???

    @stub
    // Indicates that the parameter or column is an OUT parameter.
    def functionColumnOut: Int = ???

    @stub
    // Indicates that the parameter or column is a column in a result set.
    def functionColumnResult: Int = ???

    @stub
    // Indicates that type of the parameter or column is unknown.
    def functionColumnUnknown: Int = ???

    @stub
    // Indicates that NULL values are not allowed.
    def functionNoNulls: Int = ???

    @stub
    // Indicates that the function  does not return a table.
    def functionNoTable: Int = ???

    @stub
    // Indicates that NULL values are allowed.
    def functionNullable: Int = ???

    @stub
    // Indicates that whether NULL values are allowed
    // is unknown.
    def functionNullableUnknown: Int = ???

    @stub
    // Indicates that it is not known whether the function returns
    // a result or a table.
    def functionResultUnknown: Int = ???

    @stub
    // Indicates that the parameter or column is a return value.
    def functionReturn: Int = ???

    @stub
    // Indicates that the function  returns a table.
    def functionReturnsTable: Int = ???

    @stub
    // For the column UPDATE_RULE,
    // indicates that
    // when the primary key is updated, the foreign key (imported key)
    // is changed to agree with it.
    def importedKeyCascade: Int = ???

    @stub
    // Indicates deferrability.
    def importedKeyInitiallyDeferred: Int = ???

    @stub
    // Indicates deferrability.
    def importedKeyInitiallyImmediate: Int = ???

    @stub
    // For the columns UPDATE_RULE
    // and DELETE_RULE, indicates that
    // if the primary key has been imported, it cannot be updated or deleted.
    def importedKeyNoAction: Int = ???

    @stub
    // Indicates deferrability.
    def importedKeyNotDeferrable: Int = ???

    @stub
    // For the column UPDATE_RULE, indicates that
    // a primary key may not be updated if it has been imported by
    // another table as a foreign key.
    def importedKeyRestrict: Int = ???

    @stub
    // For the columns UPDATE_RULE
    // and DELETE_RULE, indicates that
    // if the primary key is updated or deleted, the foreign key (imported key)
    // is set to the default value.
    def importedKeySetDefault: Int = ???

    @stub
    // For the columns UPDATE_RULE
    // and DELETE_RULE, indicates that
    // when the primary key is updated or deleted, the foreign key (imported key)
    // is changed to NULL.
    def importedKeySetNull: Int = ???

    @stub
    // Indicates that the column stores IN parameters.
    def procedureColumnIn: Int = ???

    @stub
    // Indicates that the column stores INOUT parameters.
    def procedureColumnInOut: Int = ???

    @stub
    // Indicates that the column stores OUT parameters.
    def procedureColumnOut: Int = ???

    @stub
    // Indicates that the column stores results.
    def procedureColumnResult: Int = ???

    @stub
    // Indicates that the column stores return values.
    def procedureColumnReturn: Int = ???

    @stub
    // Indicates that type of the column is unknown.
    def procedureColumnUnknown: Int = ???

    @stub
    // Indicates that NULL values are not allowed.
    def procedureNoNulls: Int = ???

    @stub
    // Indicates that the procedure does not return a result.
    def procedureNoResult: Int = ???

    @stub
    // Indicates that NULL values are allowed.
    def procedureNullable: Int = ???

    @stub
    // Indicates that whether NULL values are allowed
    // is unknown.
    def procedureNullableUnknown: Int = ???

    @stub
    // Indicates that it is not known whether the procedure returns
    // a result.
    def procedureResultUnknown: Int = ???

    @stub
    // Indicates that the procedure returns a result.
    def procedureReturnsResult: Int = ???

    @stub
    // A possible return value for the method
    // DatabaseMetaData.getSQLStateType which is used to indicate
    // whether the value returned by the method
    // SQLException.getSQLState is an SQLSTATE value.
    def sqlStateSQL: Int = ???

    @stub
    // A possible return value for the method
    // DatabaseMetaData.getSQLStateType which is used to indicate
    // whether the value returned by the method
    // SQLException.getSQLState is an SQL99 SQLSTATE value.
    def sqlStateSQL99: Int = ???

    @stub
    // A possible return value for the method
    // DatabaseMetaData.getSQLStateType which is used to indicate
    // whether the value returned by the method
    // SQLException.getSQLState is an
    // X/Open (now know as Open Group) SQL CLI SQLSTATE value.
    def sqlStateXOpen: Int = ???

    @stub
    // Indicates that this table index is a clustered index.
    def tableIndexClustered: Short = ???

    @stub
    // Indicates that this table index is a hashed index.
    def tableIndexHashed: Short = ???

    @stub
    // Indicates that this table index is not a clustered
    // index, a hashed index, or table statistics;
    // it is something other than these.
    def tableIndexOther: Short = ???

    @stub
    // Indicates that this column contains table statistics that
    // are returned in conjunction with a table's index descriptions.
    def tableIndexStatistic: Short = ???

    @stub
    // Indicates that a NULL value is NOT allowed for this
    // data type.
    def typeNoNulls: Int = ???

    @stub
    // Indicates that a NULL value is allowed for this
    // data type.
    def typeNullable: Int = ???

    @stub
    // Indicates that it is not known whether a NULL value
    // is allowed for this data type.
    def typeNullableUnknown: Int = ???

    @stub
    // Indicates that the data type can be only be used in WHERE
    // search clauses
    // that do not use LIKE predicates.
    def typePredBasic: Int = ???

    @stub
    // Indicates that the data type
    // can be only be used in WHERE search clauses
    // that  use LIKE predicates.
    def typePredChar: Int = ???

    @stub
    // Indicates that WHERE search clauses are not supported
    // for this type.
    def typePredNone: Int = ???

    @stub
    // Indicates that all WHERE search clauses can be
    // based on this type.
    def typeSearchable: Int = ???

    @stub
    // Indicates that this version column is NOT a pseudo column.
    def versionColumnNotPseudo: Int = ???

    @stub
    // Indicates that this version column is a pseudo column.
    def versionColumnPseudo: Int = ???
}

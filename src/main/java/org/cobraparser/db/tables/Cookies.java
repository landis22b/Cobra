/**
 * This class is generated by jOOQ
 */
package org.cobraparser.db.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.5.0"
    },
    comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Cookies extends org.jooq.impl.TableImpl<org.cobraparser.db.tables.records.CookiesRecord> {

  private static final long serialVersionUID = 1280147249;

  /**
   * The reference instance of <code>PUBLIC.COOKIES</code>
   */
  public static final Cookies COOKIES = new Cookies();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<org.cobraparser.db.tables.records.CookiesRecord> getRecordType() {
    return org.cobraparser.db.tables.records.CookiesRecord.class;
  }

  /**
   * The column <code>PUBLIC.COOKIES.HOSTNAME</code>.
   */
  public final org.jooq.TableField<org.cobraparser.db.tables.records.CookiesRecord, String> HOSTNAME = createField("HOSTNAME",
      org.jooq.impl.SQLDataType.VARCHAR.length(2147483647).nullable(false), this, "");

  /**
   * The column <code>PUBLIC.COOKIES.NAME</code>.
   */
  public final org.jooq.TableField<org.cobraparser.db.tables.records.CookiesRecord, String> NAME = createField("NAME",
      org.jooq.impl.SQLDataType.VARCHAR.length(2147483647).nullable(false), this, "");

  /**
   * The column <code>PUBLIC.COOKIES.VALUE</code>.
   */
  public final org.jooq.TableField<org.cobraparser.db.tables.records.CookiesRecord, String> VALUE = createField("VALUE",
      org.jooq.impl.SQLDataType.VARCHAR.length(2147483647).nullable(false), this, "");

  /**
   * The column <code>PUBLIC.COOKIES.PATH</code>.
   */
  public final org.jooq.TableField<org.cobraparser.db.tables.records.CookiesRecord, String> PATH = createField("PATH",
      org.jooq.impl.SQLDataType.VARCHAR.length(2147483647).nullable(false), this, "");

  /**
   * The column <code>PUBLIC.COOKIES.SECURE</code>.
   */
  public final org.jooq.TableField<org.cobraparser.db.tables.records.CookiesRecord, Boolean> SECURE = createField("SECURE",
      org.jooq.impl.SQLDataType.BOOLEAN, this, "");

  /**
   * The column <code>PUBLIC.COOKIES.HTTPONLY</code>.
   */
  public final org.jooq.TableField<org.cobraparser.db.tables.records.CookiesRecord, Boolean> HTTPONLY = createField("HTTPONLY",
      org.jooq.impl.SQLDataType.BOOLEAN, this, "");

  /**
   * The column <code>PUBLIC.COOKIES.CREATIONTIME</code>.
   */
  public final org.jooq.TableField<org.cobraparser.db.tables.records.CookiesRecord, Long> CREATIONTIME = createField("CREATIONTIME",
      org.jooq.impl.SQLDataType.BIGINT, this, "");

  /**
   * The column <code>PUBLIC.COOKIES.EXPIRATIONTIME</code>.
   */
  public final org.jooq.TableField<org.cobraparser.db.tables.records.CookiesRecord, Long> EXPIRATIONTIME = createField(
      "EXPIRATIONTIME", org.jooq.impl.SQLDataType.BIGINT, this, "");

  /**
   * Create a <code>PUBLIC.COOKIES</code> table reference
   */
  public Cookies() {
    this("COOKIES", null);
  }

  /**
   * Create an aliased <code>PUBLIC.COOKIES</code> table reference
   */
  public Cookies(final String alias) {
    this(alias, Cookies.COOKIES);
  }

  private Cookies(final String alias, final org.jooq.Table<org.cobraparser.db.tables.records.CookiesRecord> aliased) {
    this(alias, aliased, null);
  }

  private Cookies(final String alias, final org.jooq.Table<org.cobraparser.db.tables.records.CookiesRecord> aliased,
      final org.jooq.Field<?>[] parameters) {
    super(alias, org.cobraparser.db.Public.PUBLIC, aliased, parameters, "");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.UniqueKey<org.cobraparser.db.tables.records.CookiesRecord> getPrimaryKey() {
    return org.cobraparser.db.Keys.CONSTRAINT_6;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public java.util.List<org.jooq.UniqueKey<org.cobraparser.db.tables.records.CookiesRecord>> getKeys() {
    return java.util.Arrays.<org.jooq.UniqueKey<org.cobraparser.db.tables.records.CookiesRecord>> asList(org.cobraparser.db.Keys.CONSTRAINT_6);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Cookies as(final String alias) {
    return new Cookies(alias, this);
  }

  /**
   * Rename this table
   */
  public Cookies rename(final String name) {
    return new Cookies(name, null);
  }
}

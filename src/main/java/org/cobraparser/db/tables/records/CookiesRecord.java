/**
 * This class is generated by jOOQ
 */
package org.cobraparser.db.tables.records;

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
public class CookiesRecord extends org.jooq.impl.UpdatableRecordImpl<CookiesRecord>
    implements
    org.jooq.Record8<String, String, String, String, Boolean, Boolean, Long, Long> {

  private static final long serialVersionUID = -1249579634;

  /**
   * Setter for <code>PUBLIC.COOKIES.HOSTNAME</code>.
   */
  public void setHostname(final String value) {
    setValue(0, value);
  }

  /**
   * Getter for <code>PUBLIC.COOKIES.HOSTNAME</code>.
   */
  public String getHostname() {
    return (String) getValue(0);
  }

  /**
   * Setter for <code>PUBLIC.COOKIES.NAME</code>.
   */
  public void setName(final String value) {
    setValue(1, value);
  }

  /**
   * Getter for <code>PUBLIC.COOKIES.NAME</code>.
   */
  public String getName() {
    return (String) getValue(1);
  }

  /**
   * Setter for <code>PUBLIC.COOKIES.VALUE</code>.
   */
  public void setValue(final String value) {
    setValue(2, value);
  }

  /**
   * Getter for <code>PUBLIC.COOKIES.VALUE</code>.
   */
  public String getValue() {
    return (String) getValue(2);
  }

  /**
   * Setter for <code>PUBLIC.COOKIES.PATH</code>.
   */
  public void setPath(final String value) {
    setValue(3, value);
  }

  /**
   * Getter for <code>PUBLIC.COOKIES.PATH</code>.
   */
  public String getPath() {
    return (String) getValue(3);
  }

  /**
   * Setter for <code>PUBLIC.COOKIES.SECURE</code>.
   */
  public void setSecure(final Boolean value) {
    setValue(4, value);
  }

  /**
   * Getter for <code>PUBLIC.COOKIES.SECURE</code>.
   */
  public Boolean getSecure() {
    return (Boolean) getValue(4);
  }

  /**
   * Setter for <code>PUBLIC.COOKIES.HTTPONLY</code>.
   */
  public void setHttponly(final Boolean value) {
    setValue(5, value);
  }

  /**
   * Getter for <code>PUBLIC.COOKIES.HTTPONLY</code>.
   */
  public Boolean getHttponly() {
    return (Boolean) getValue(5);
  }

  /**
   * Setter for <code>PUBLIC.COOKIES.CREATIONTIME</code>.
   */
  public void setCreationtime(final Long value) {
    setValue(6, value);
  }

  /**
   * Getter for <code>PUBLIC.COOKIES.CREATIONTIME</code>.
   */
  public Long getCreationtime() {
    return (Long) getValue(6);
  }

  /**
   * Setter for <code>PUBLIC.COOKIES.EXPIRATIONTIME</code>.
   */
  public void setExpirationtime(final Long value) {
    setValue(7, value);
  }

  /**
   * Getter for <code>PUBLIC.COOKIES.EXPIRATIONTIME</code>.
   */
  public Long getExpirationtime() {
    return (Long) getValue(7);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Record2<String, String> key() {
    return (org.jooq.Record2) super.key();
  }

  // -------------------------------------------------------------------------
  // Record8 type implementation
  // -------------------------------------------------------------------------

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Row8<String, String, String, String, Boolean, Boolean, Long, Long> fieldsRow() {
    return (org.jooq.Row8) super.fieldsRow();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Row8<String, String, String, String, Boolean, Boolean, Long, Long> valuesRow() {
    return (org.jooq.Row8) super.valuesRow();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<String> field1() {
    return org.cobraparser.db.tables.Cookies.COOKIES.HOSTNAME;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<String> field2() {
    return org.cobraparser.db.tables.Cookies.COOKIES.NAME;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<String> field3() {
    return org.cobraparser.db.tables.Cookies.COOKIES.VALUE;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<String> field4() {
    return org.cobraparser.db.tables.Cookies.COOKIES.PATH;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<Boolean> field5() {
    return org.cobraparser.db.tables.Cookies.COOKIES.SECURE;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<Boolean> field6() {
    return org.cobraparser.db.tables.Cookies.COOKIES.HTTPONLY;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<Long> field7() {
    return org.cobraparser.db.tables.Cookies.COOKIES.CREATIONTIME;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<Long> field8() {
    return org.cobraparser.db.tables.Cookies.COOKIES.EXPIRATIONTIME;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String value1() {
    return getHostname();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String value2() {
    return getName();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String value3() {
    return getValue();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String value4() {
    return getPath();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Boolean value5() {
    return getSecure();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Boolean value6() {
    return getHttponly();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Long value7() {
    return getCreationtime();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Long value8() {
    return getExpirationtime();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CookiesRecord value1(final String value) {
    setHostname(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CookiesRecord value2(final String value) {
    setName(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CookiesRecord value3(final String value) {
    setValue(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CookiesRecord value4(final String value) {
    setPath(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CookiesRecord value5(final Boolean value) {
    setSecure(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CookiesRecord value6(final Boolean value) {
    setHttponly(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CookiesRecord value7(final Long value) {
    setCreationtime(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CookiesRecord value8(final Long value) {
    setExpirationtime(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CookiesRecord values(final String value1, final String value2, final String value3,
      final String value4, final Boolean value5, final Boolean value6, final Long value7,
      final Long value8) {
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * Create a detached CookiesRecord
   */
  public CookiesRecord() {
    super(org.cobraparser.db.tables.Cookies.COOKIES);
  }

  /**
   * Create a detached, initialised CookiesRecord
   */
  public CookiesRecord(final String hostname, final String name, final String value,
      final String path, final Boolean secure, final Boolean httponly, final Long creationtime,
      final Long expirationtime) {
    super(org.cobraparser.db.tables.Cookies.COOKIES);

    setValue(0, hostname);
    setValue(1, name);
    setValue(2, value);
    setValue(3, path);
    setValue(4, secure);
    setValue(5, httponly);
    setValue(6, creationtime);
    setValue(7, expirationtime);
  }
}

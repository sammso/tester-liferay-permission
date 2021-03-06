package com.sohlman.liferay.foobar.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Foo}.
 * </p>
 *
 * @author Sampsa Sohlman
 * @see Foo
 * @generated
 */
public class FooWrapper implements Foo, ModelWrapper<Foo> {
    private Foo _foo;

    public FooWrapper(Foo foo) {
        _foo = foo;
    }

    @Override
    public Class<?> getModelClass() {
        return Foo.class;
    }

    @Override
    public String getModelClassName() {
        return Foo.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("fooId", getFooId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("resourceBlockId", getResourceBlockId());
        attributes.put("value", getValue());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long fooId = (Long) attributes.get("fooId");

        if (fooId != null) {
            setFooId(fooId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Long resourceBlockId = (Long) attributes.get("resourceBlockId");

        if (resourceBlockId != null) {
            setResourceBlockId(resourceBlockId);
        }

        String value = (String) attributes.get("value");

        if (value != null) {
            setValue(value);
        }
    }

    /**
    * Returns the primary key of this foo.
    *
    * @return the primary key of this foo
    */
    @Override
    public long getPrimaryKey() {
        return _foo.getPrimaryKey();
    }

    /**
    * Sets the primary key of this foo.
    *
    * @param primaryKey the primary key of this foo
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _foo.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the foo ID of this foo.
    *
    * @return the foo ID of this foo
    */
    @Override
    public long getFooId() {
        return _foo.getFooId();
    }

    /**
    * Sets the foo ID of this foo.
    *
    * @param fooId the foo ID of this foo
    */
    @Override
    public void setFooId(long fooId) {
        _foo.setFooId(fooId);
    }

    /**
    * Returns the group ID of this foo.
    *
    * @return the group ID of this foo
    */
    @Override
    public long getGroupId() {
        return _foo.getGroupId();
    }

    /**
    * Sets the group ID of this foo.
    *
    * @param groupId the group ID of this foo
    */
    @Override
    public void setGroupId(long groupId) {
        _foo.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this foo.
    *
    * @return the company ID of this foo
    */
    @Override
    public long getCompanyId() {
        return _foo.getCompanyId();
    }

    /**
    * Sets the company ID of this foo.
    *
    * @param companyId the company ID of this foo
    */
    @Override
    public void setCompanyId(long companyId) {
        _foo.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this foo.
    *
    * @return the user ID of this foo
    */
    @Override
    public long getUserId() {
        return _foo.getUserId();
    }

    /**
    * Sets the user ID of this foo.
    *
    * @param userId the user ID of this foo
    */
    @Override
    public void setUserId(long userId) {
        _foo.setUserId(userId);
    }

    /**
    * Returns the user uuid of this foo.
    *
    * @return the user uuid of this foo
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _foo.getUserUuid();
    }

    /**
    * Sets the user uuid of this foo.
    *
    * @param userUuid the user uuid of this foo
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _foo.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this foo.
    *
    * @return the user name of this foo
    */
    @Override
    public java.lang.String getUserName() {
        return _foo.getUserName();
    }

    /**
    * Sets the user name of this foo.
    *
    * @param userName the user name of this foo
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _foo.setUserName(userName);
    }

    /**
    * Returns the create date of this foo.
    *
    * @return the create date of this foo
    */
    @Override
    public java.util.Date getCreateDate() {
        return _foo.getCreateDate();
    }

    /**
    * Sets the create date of this foo.
    *
    * @param createDate the create date of this foo
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _foo.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this foo.
    *
    * @return the modified date of this foo
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _foo.getModifiedDate();
    }

    /**
    * Sets the modified date of this foo.
    *
    * @param modifiedDate the modified date of this foo
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _foo.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the resource block ID of this foo.
    *
    * @return the resource block ID of this foo
    */
    @Override
    public long getResourceBlockId() {
        return _foo.getResourceBlockId();
    }

    /**
    * Sets the resource block ID of this foo.
    *
    * @param resourceBlockId the resource block ID of this foo
    */
    @Override
    public void setResourceBlockId(long resourceBlockId) {
        _foo.setResourceBlockId(resourceBlockId);
    }

    /**
    * Returns the value of this foo.
    *
    * @return the value of this foo
    */
    @Override
    public java.lang.String getValue() {
        return _foo.getValue();
    }

    /**
    * Sets the value of this foo.
    *
    * @param value the value of this foo
    */
    @Override
    public void setValue(java.lang.String value) {
        _foo.setValue(value);
    }

    @Override
    public boolean isNew() {
        return _foo.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _foo.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _foo.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _foo.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _foo.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _foo.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _foo.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _foo.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _foo.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _foo.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _foo.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new FooWrapper((Foo) _foo.clone());
    }

    @Override
    public int compareTo(com.sohlman.liferay.foobar.model.Foo foo) {
        return _foo.compareTo(foo);
    }

    @Override
    public int hashCode() {
        return _foo.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.sohlman.liferay.foobar.model.Foo> toCacheModel() {
        return _foo.toCacheModel();
    }

    @Override
    public com.sohlman.liferay.foobar.model.Foo toEscapedModel() {
        return new FooWrapper(_foo.toEscapedModel());
    }

    @Override
    public com.sohlman.liferay.foobar.model.Foo toUnescapedModel() {
        return new FooWrapper(_foo.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _foo.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _foo.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _foo.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FooWrapper)) {
            return false;
        }

        FooWrapper fooWrapper = (FooWrapper) obj;

        if (Validator.equals(_foo, fooWrapper._foo)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Foo getWrappedFoo() {
        return _foo;
    }

    @Override
    public Foo getWrappedModel() {
        return _foo;
    }

    @Override
    public void resetOriginalValues() {
        _foo.resetOriginalValues();
    }
}

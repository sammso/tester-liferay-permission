package com.sohlman.liferay.foobar.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Bar}.
 * </p>
 *
 * @author Sampsa Sohlman
 * @see Bar
 * @generated
 */
public class BarWrapper implements Bar, ModelWrapper<Bar> {
    private Bar _bar;

    public BarWrapper(Bar bar) {
        _bar = bar;
    }

    @Override
    public Class<?> getModelClass() {
        return Bar.class;
    }

    @Override
    public String getModelClassName() {
        return Bar.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("barId", getBarId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("value", getValue());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long barId = (Long) attributes.get("barId");

        if (barId != null) {
            setBarId(barId);
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

        String value = (String) attributes.get("value");

        if (value != null) {
            setValue(value);
        }
    }

    /**
    * Returns the primary key of this bar.
    *
    * @return the primary key of this bar
    */
    @Override
    public long getPrimaryKey() {
        return _bar.getPrimaryKey();
    }

    /**
    * Sets the primary key of this bar.
    *
    * @param primaryKey the primary key of this bar
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _bar.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the bar ID of this bar.
    *
    * @return the bar ID of this bar
    */
    @Override
    public long getBarId() {
        return _bar.getBarId();
    }

    /**
    * Sets the bar ID of this bar.
    *
    * @param barId the bar ID of this bar
    */
    @Override
    public void setBarId(long barId) {
        _bar.setBarId(barId);
    }

    /**
    * Returns the group ID of this bar.
    *
    * @return the group ID of this bar
    */
    @Override
    public long getGroupId() {
        return _bar.getGroupId();
    }

    /**
    * Sets the group ID of this bar.
    *
    * @param groupId the group ID of this bar
    */
    @Override
    public void setGroupId(long groupId) {
        _bar.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this bar.
    *
    * @return the company ID of this bar
    */
    @Override
    public long getCompanyId() {
        return _bar.getCompanyId();
    }

    /**
    * Sets the company ID of this bar.
    *
    * @param companyId the company ID of this bar
    */
    @Override
    public void setCompanyId(long companyId) {
        _bar.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this bar.
    *
    * @return the user ID of this bar
    */
    @Override
    public long getUserId() {
        return _bar.getUserId();
    }

    /**
    * Sets the user ID of this bar.
    *
    * @param userId the user ID of this bar
    */
    @Override
    public void setUserId(long userId) {
        _bar.setUserId(userId);
    }

    /**
    * Returns the user uuid of this bar.
    *
    * @return the user uuid of this bar
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bar.getUserUuid();
    }

    /**
    * Sets the user uuid of this bar.
    *
    * @param userUuid the user uuid of this bar
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _bar.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this bar.
    *
    * @return the user name of this bar
    */
    @Override
    public java.lang.String getUserName() {
        return _bar.getUserName();
    }

    /**
    * Sets the user name of this bar.
    *
    * @param userName the user name of this bar
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _bar.setUserName(userName);
    }

    /**
    * Returns the create date of this bar.
    *
    * @return the create date of this bar
    */
    @Override
    public java.util.Date getCreateDate() {
        return _bar.getCreateDate();
    }

    /**
    * Sets the create date of this bar.
    *
    * @param createDate the create date of this bar
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _bar.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this bar.
    *
    * @return the modified date of this bar
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _bar.getModifiedDate();
    }

    /**
    * Sets the modified date of this bar.
    *
    * @param modifiedDate the modified date of this bar
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _bar.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the value of this bar.
    *
    * @return the value of this bar
    */
    @Override
    public java.lang.String getValue() {
        return _bar.getValue();
    }

    /**
    * Sets the value of this bar.
    *
    * @param value the value of this bar
    */
    @Override
    public void setValue(java.lang.String value) {
        _bar.setValue(value);
    }

    @Override
    public boolean isNew() {
        return _bar.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _bar.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _bar.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _bar.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _bar.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _bar.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _bar.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _bar.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _bar.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _bar.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _bar.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BarWrapper((Bar) _bar.clone());
    }

    @Override
    public int compareTo(com.sohlman.liferay.foobar.model.Bar bar) {
        return _bar.compareTo(bar);
    }

    @Override
    public int hashCode() {
        return _bar.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.sohlman.liferay.foobar.model.Bar> toCacheModel() {
        return _bar.toCacheModel();
    }

    @Override
    public com.sohlman.liferay.foobar.model.Bar toEscapedModel() {
        return new BarWrapper(_bar.toEscapedModel());
    }

    @Override
    public com.sohlman.liferay.foobar.model.Bar toUnescapedModel() {
        return new BarWrapper(_bar.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _bar.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _bar.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _bar.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BarWrapper)) {
            return false;
        }

        BarWrapper barWrapper = (BarWrapper) obj;

        if (Validator.equals(_bar, barWrapper._bar)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Bar getWrappedBar() {
        return _bar;
    }

    @Override
    public Bar getWrappedModel() {
        return _bar;
    }

    @Override
    public void resetOriginalValues() {
        _bar.resetOriginalValues();
    }
}

package com.sohlman.liferay.foobar.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.sohlman.liferay.foobar.service.http.BarServiceSoap}.
 *
 * @author Sampsa Sohlman
 * @see com.sohlman.liferay.foobar.service.http.BarServiceSoap
 * @generated
 */
public class BarSoap implements Serializable {
    private long _barId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _value;

    public BarSoap() {
    }

    public static BarSoap toSoapModel(Bar model) {
        BarSoap soapModel = new BarSoap();

        soapModel.setBarId(model.getBarId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setValue(model.getValue());

        return soapModel;
    }

    public static BarSoap[] toSoapModels(Bar[] models) {
        BarSoap[] soapModels = new BarSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BarSoap[][] toSoapModels(Bar[][] models) {
        BarSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BarSoap[models.length][models[0].length];
        } else {
            soapModels = new BarSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BarSoap[] toSoapModels(List<Bar> models) {
        List<BarSoap> soapModels = new ArrayList<BarSoap>(models.size());

        for (Bar model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BarSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _barId;
    }

    public void setPrimaryKey(long pk) {
        setBarId(pk);
    }

    public long getBarId() {
        return _barId;
    }

    public void setBarId(long barId) {
        _barId = barId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getValue() {
        return _value;
    }

    public void setValue(String value) {
        _value = value;
    }
}

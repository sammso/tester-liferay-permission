package com.sohlman.liferay.foobar.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.sohlman.liferay.foobar.model.Bar;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Bar in entity cache.
 *
 * @author Sampsa Sohlman
 * @see Bar
 * @generated
 */
public class BarCacheModel implements CacheModel<Bar>, Externalizable {
    public long barId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String value;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{barId=");
        sb.append(barId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", value=");
        sb.append(value);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Bar toEntityModel() {
        BarImpl barImpl = new BarImpl();

        barImpl.setBarId(barId);
        barImpl.setGroupId(groupId);
        barImpl.setCompanyId(companyId);
        barImpl.setUserId(userId);

        if (userName == null) {
            barImpl.setUserName(StringPool.BLANK);
        } else {
            barImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            barImpl.setCreateDate(null);
        } else {
            barImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            barImpl.setModifiedDate(null);
        } else {
            barImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (value == null) {
            barImpl.setValue(StringPool.BLANK);
        } else {
            barImpl.setValue(value);
        }

        barImpl.resetOriginalValues();

        return barImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        barId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        value = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(barId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (value == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(value);
        }
    }
}

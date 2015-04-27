package com.sohlman.liferay.foobar.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.sohlman.liferay.foobar.model.Foo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Foo in entity cache.
 *
 * @author Sampsa Sohlman
 * @see Foo
 * @generated
 */
public class FooCacheModel implements CacheModel<Foo>, Externalizable {
    public long fooId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long resourceBlockId;
    public String value;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{fooId=");
        sb.append(fooId);
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
        sb.append(", resourceBlockId=");
        sb.append(resourceBlockId);
        sb.append(", value=");
        sb.append(value);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Foo toEntityModel() {
        FooImpl fooImpl = new FooImpl();

        fooImpl.setFooId(fooId);
        fooImpl.setGroupId(groupId);
        fooImpl.setCompanyId(companyId);
        fooImpl.setUserId(userId);

        if (userName == null) {
            fooImpl.setUserName(StringPool.BLANK);
        } else {
            fooImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            fooImpl.setCreateDate(null);
        } else {
            fooImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            fooImpl.setModifiedDate(null);
        } else {
            fooImpl.setModifiedDate(new Date(modifiedDate));
        }

        fooImpl.setResourceBlockId(resourceBlockId);

        if (value == null) {
            fooImpl.setValue(StringPool.BLANK);
        } else {
            fooImpl.setValue(value);
        }

        fooImpl.resetOriginalValues();

        return fooImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        fooId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        resourceBlockId = objectInput.readLong();
        value = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(fooId);
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
        objectOutput.writeLong(resourceBlockId);

        if (value == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(value);
        }
    }
}

package com.sohlman.liferay.foobar.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.sohlman.liferay.foobar.model.Bar;
import com.sohlman.liferay.foobar.service.BarLocalServiceUtil;

/**
 * @author Sampsa Sohlman
 * @generated
 */
public abstract class BarActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BarActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BarLocalServiceUtil.getService());
        setClass(Bar.class);

        setClassLoader(com.sohlman.liferay.foobar.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("barId");
    }
}

package com.sohlman.liferay.foobar.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.sohlman.liferay.foobar.model.Bar;
import com.sohlman.liferay.foobar.service.BarLocalServiceUtil;

/**
 * The extended model base implementation for the Bar service. Represents a row in the &quot;perpoc_Bar&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BarImpl}.
 * </p>
 *
 * @author Sampsa Sohlman
 * @see BarImpl
 * @see com.sohlman.liferay.foobar.model.Bar
 * @generated
 */
public abstract class BarBaseImpl extends BarModelImpl implements Bar {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a bar model instance should use the {@link Bar} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BarLocalServiceUtil.addBar(this);
        } else {
            BarLocalServiceUtil.updateBar(this);
        }
    }
}

package com.sohlman.liferay.foobar.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.sohlman.liferay.foobar.model.Bar;
import com.sohlman.liferay.foobar.service.base.BarLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the bar local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.sohlman.liferay.foobar.service.BarLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Sampsa Sohlman
 * @see com.sohlman.liferay.foobar.service.base.BarLocalServiceBaseImpl
 * @see com.sohlman.liferay.foobar.service.BarLocalServiceUtil
 */
public class BarLocalServiceImpl extends BarLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.sohlman.liferay.foobar.service.BarLocalServiceUtil} to access the bar local service.
     */

	public Bar create() {
		return barPersistence.create(-1L);
	}
	
	public Bar addBar(Bar bar, ServiceContext serviceContext) throws SystemException, PortalException {
		if (bar.getBarId() > 0L) {
			throw new IllegalArgumentException(bar + " is not new");
		}
		

		Group group = serviceContext.getScopeGroup();
		User user = userLocalService.getUser(serviceContext.getUserId());
		
		bar.setBarId(counterLocalService.increment(Bar.class.getName()));
		bar.setUserId(serviceContext.getUserId());
		bar.setGroupId(group.getGroupId());
		bar.setCompanyId(group.getCompanyId());
		bar.setUserId(user.getUserId());
		bar.setUserName(user.getFullName());
		bar.setCreateDate(new Date());
		bar.setModifiedDate(new Date());
		
		bar = barPersistence.update(bar);
		
		resourceLocalService.addResources(bar.getCompanyId(),
				bar.getGroupId(), user.getUserId(),
				Bar.class.getName(), bar.getBarId(), false,
				true, true);
		
		return bar;
	}

	@Override
	public Bar addBar(Bar bar) throws SystemException {
		throw new UnsupportedOperationException("addBar(Bar) is not supported instead use  add(Bar, ServiceContext)");
	}
	
	public Bar updateBar(Bar bar) throws SystemException {
		bar.setModifiedDate(new Date());
		
		bar = barPersistence.update(bar);		
		return bar;
	}
	
	@Override
	public Bar deleteBar(Bar bar) throws SystemException, PortalException {
		
		resourceLocalService.deleteResource(bar.getCompanyId(),
				Bar.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL,
				bar.getPrimaryKey());
		
		return super.deleteBar(bar);
	}	
	
	public List<Bar> findByGroup(long groupId, int start, int end) throws SystemException {
		return barPersistence.findByGroup(groupId, start, end);
	}
	
	public int countByGroup(long groupId) throws SystemException {
		return barPersistence.countByGroup(groupId);
	}
}

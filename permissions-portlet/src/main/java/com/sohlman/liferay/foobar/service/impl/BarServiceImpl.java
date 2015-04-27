package com.sohlman.liferay.foobar.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.ServiceContext;
import com.sohlman.liferay.foobar.model.Bar;
import com.sohlman.liferay.foobar.service.base.BarServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the bar remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.sohlman.liferay.foobar.service.BarService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Sampsa Sohlman
 * @see com.sohlman.liferay.foobar.service.base.BarServiceBaseImpl
 * @see com.sohlman.liferay.foobar.service.BarServiceUtil
 */
public class BarServiceImpl extends BarServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.sohlman.liferay.foobar.service.BarServiceUtil} to access the bar remote service.
     */
	public List<Bar> findByGroup(long groupId, int start, int end) throws SystemException {
		return barPersistence.filterFindByGroup(groupId, start, end);
	}
	
	public int countByGroup(long groupId) throws SystemException {
		return barPersistence.filterCountByGroup(groupId);
	}
	
	public Bar addBar(Bar bar, ServiceContext serviceContext) throws SystemException, PortalException {
		
		if (!getPermissionChecker().hasPermission(
				serviceContext.getScopeGroupId(), 
				"com.sohlman.liferay.foobar.model", 
				serviceContext.getScopeGroupId(), "ADD_BAR")) {
			throw new PrincipalException("");
		}
		
		return barLocalService.addBar(bar, serviceContext);
	}
	
	public Bar updateBar(Bar bar) throws SystemException, PortalException {
		boolean updatePermission = false;
		
		PermissionChecker permissionChecker = getPermissionChecker();
		
		updatePermission = updatePermission || getPermissionChecker().hasOwnerPermission(
				bar.getCompanyId(), Bar.class.getName(), bar.getBarId(),
				bar.getUserId(), ActionKeys.UPDATE);
		updatePermission = updatePermission || getPermissionChecker().hasPermission(bar.getGroupId(),
			Bar.class.getName(), bar.getBarId(),
			ActionKeys.UPDATE);
		
		if (!updatePermission) {
			throw new PrincipalException("");
		}
		
		return barLocalService.updateBar(bar);
	}
	
	public void deleteBar(long barId) throws SystemException, PortalException {
		
		boolean deletePermission = false;
		
		PermissionChecker permissionChecker = getPermissionChecker();
		
		Bar bar = barLocalService.getBar(barId);
		
		deletePermission = deletePermission || getPermissionChecker().hasOwnerPermission(
				bar.getCompanyId(), Bar.class.getName(), bar.getBarId(),
				bar.getUserId(), ActionKeys.DELETE);
		deletePermission = deletePermission || getPermissionChecker().hasPermission(bar.getGroupId(),
			Bar.class.getName(), bar.getBarId(),
			ActionKeys.DELETE);

		if (!deletePermission) {
			throw new PrincipalException("");
		}
		
		barLocalService.deleteBar(bar);	
	}
}

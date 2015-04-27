package com.sohlman.liferay.foobar.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.ServiceContext;
import com.sohlman.liferay.foobar.model.Foo;
import com.sohlman.liferay.foobar.service.base.FooServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the foo remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.sohlman.liferay.foobar.service.FooService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Sampsa Sohlman
 * @see com.sohlman.liferay.foobar.service.base.FooServiceBaseImpl
 * @see com.sohlman.liferay.foobar.service.FooServiceUtil
 */
public class FooServiceImpl extends FooServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.sohlman.liferay.foobar.service.FooServiceUtil} to access the foo
	 * remote service.
	 */

	public List<Foo> findByGroup(long groupId, int start, int end)
			throws SystemException {
		return fooPersistence.filterFindByGroup(groupId, start, end);
	}

	public int countByGroup(long groupId) throws SystemException {
		return fooPersistence.filterCountByGroup(groupId);
	}

	public Foo addFoo(Foo foo, ServiceContext serviceContext)
			throws SystemException, PortalException {

		if (!getPermissionChecker().hasPermission(
				serviceContext.getScopeGroupId(),
				"com.sohlman.liferay.foobar.model",
				serviceContext.getScopeGroupId(), "ADD_FOO")) {
			throw new PrincipalException("");
		}

		return fooLocalService.addFoo(foo, serviceContext);
	}

	public Foo updateFoo(Foo foo) throws SystemException, PortalException {
		boolean updatePermission = false;

		PermissionChecker permissionChecker = getPermissionChecker();

		updatePermission = updatePermission
				|| getPermissionChecker().hasOwnerPermission(
						foo.getCompanyId(), Foo.class.getName(),
						foo.getPrimaryKey(), foo.getUserId(),
						ActionKeys.UPDATE);
		updatePermission = updatePermission
				|| getPermissionChecker().hasPermission(foo.getGroupId(),
						Foo.class.getName(), foo.getPrimaryKey(),
						ActionKeys.UPDATE);
		if (!updatePermission) {
			throw new PrincipalException("");
		}

		return fooLocalService.updateFoo(foo);
	}

	public Foo deleteFoo(Foo foo) throws SystemException, PortalException {
		boolean deletePermission = false;

		PermissionChecker permissionChecker = getPermissionChecker();

		deletePermission = deletePermission
				|| getPermissionChecker().hasOwnerPermission(
						foo.getCompanyId(), Foo.class.getName(),
						foo.getPrimaryKey(), foo.getUserId(),
						ActionKeys.DELETE);
		deletePermission = deletePermission
				|| getPermissionChecker().hasPermission(foo.getGroupId(),
						Foo.class.getName(), foo.getPrimaryKey(),
						ActionKeys.DELETE);
		if (!deletePermission) {
			throw new PrincipalException("");
		}

		return fooLocalService.deleteFoo(foo);
	}
}

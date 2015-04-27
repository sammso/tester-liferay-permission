package com.sohlman.liferay.foobar.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.sohlman.liferay.foobar.model.Foo;
import com.sohlman.liferay.foobar.service.base.FooLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the foo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.sohlman.liferay.foofoo.service.FooLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Sampsa Sohlman
 * @see com.sohlman.liferay.foofoo.service.base.FooLocalServiceBaseImpl
 * @see com.sohlman.liferay.foofoo.service.FooLocalServiceUtil
 */
public class FooLocalServiceImpl extends FooLocalServiceBaseImpl {
    /**
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.sohlman.liferay.foofoo.service.FooLocalServiceUtil} to access the foo local service.
     */
	public Foo create() {
		return fooPersistence.create(-1L);
	}
	
	public Foo addFoo(Foo foo, ServiceContext serviceContext) throws SystemException, PortalException {
		if (foo.getFooId() > 0L) {
			throw new IllegalArgumentException(foo + " is not new");
		}
		
		Group group = serviceContext.getScopeGroup();
		User user = userLocalService.getUser(serviceContext.getUserId());
		
		foo.setFooId(counterLocalService.increment(Foo.class.getName()));
		foo.setUserId(serviceContext.getUserId());		
		foo.setGroupId(group.getGroupId());
		foo.setCompanyId(group.getCompanyId());
		foo.setUserId(user.getUserId());
		foo.setUserName(user.getFullName());
		foo.setCreateDate(new Date());
		foo.setModifiedDate(new Date());
		
		foo = fooPersistence.update(foo);
		
		serviceContext.setAddGuestPermissions(true);
		serviceContext.setAddGroupPermissions(true);
		
		resourceLocalService.addModelResources(foo, serviceContext);
		
		return foo;
	}

	
	@Override
	public Foo updateFoo(Foo foo) throws SystemException {
		foo.setModifiedDate(new Date());
		foo = fooPersistence.update(foo);		
		return foo;
	}

	@Override
	public Foo deleteFoo(Foo foo) throws SystemException, PortalException {
		resourceLocalService.deleteResource(foo, ResourceConstants.SCOPE_INDIVIDUAL);
		
		return super.deleteFoo(foo);
	}
	
	public List<Foo> findByGroup(long groupId, int start, int end) throws SystemException {
		return fooPersistence.findByGroup(groupId, start, end);
	}
	
	public int countByGroup(long groupId) throws SystemException {
		return fooPersistence.countByGroup(groupId);
	}
}

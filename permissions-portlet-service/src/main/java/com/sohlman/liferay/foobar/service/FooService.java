package com.sohlman.liferay.foobar.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for Foo. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Sampsa Sohlman
 * @see FooServiceUtil
 * @see com.sohlman.liferay.foobar.service.base.FooServiceBaseImpl
 * @see com.sohlman.liferay.foobar.service.impl.FooServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface FooService extends BaseService, InvokableService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link FooServiceUtil} to access the foo remote service. Add custom service methods to {@link com.sohlman.liferay.foobar.service.impl.FooServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    public java.util.List<com.sohlman.liferay.foobar.model.Foo> findByGroup(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByGroup(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.sohlman.liferay.foobar.model.Foo addFoo(
        com.sohlman.liferay.foobar.model.Foo foo,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.sohlman.liferay.foobar.model.Foo updateFoo(
        com.sohlman.liferay.foobar.model.Foo foo)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.sohlman.liferay.foobar.model.Foo deleteFoo(
        com.sohlman.liferay.foobar.model.Foo foo)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}

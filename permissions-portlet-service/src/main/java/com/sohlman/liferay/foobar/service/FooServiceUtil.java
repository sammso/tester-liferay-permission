package com.sohlman.liferay.foobar.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Foo. This utility wraps
 * {@link com.sohlman.liferay.foobar.service.impl.FooServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Sampsa Sohlman
 * @see FooService
 * @see com.sohlman.liferay.foobar.service.base.FooServiceBaseImpl
 * @see com.sohlman.liferay.foobar.service.impl.FooServiceImpl
 * @generated
 */
public class FooServiceUtil {
    private static FooService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.sohlman.liferay.foobar.service.impl.FooServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.List<com.sohlman.liferay.foobar.model.Foo> findByGroup(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByGroup(groupId, start, end);
    }

    public static int countByGroup(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().countByGroup(groupId);
    }

    public static com.sohlman.liferay.foobar.model.Foo addFoo(
        com.sohlman.liferay.foobar.model.Foo foo,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addFoo(foo, serviceContext);
    }

    public static com.sohlman.liferay.foobar.model.Foo updateFoo(
        com.sohlman.liferay.foobar.model.Foo foo)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().updateFoo(foo);
    }

    public static com.sohlman.liferay.foobar.model.Foo deleteFoo(
        com.sohlman.liferay.foobar.model.Foo foo)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteFoo(foo);
    }

    public static void clearService() {
        _service = null;
    }

    public static FooService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    FooService.class.getName());

            if (invokableService instanceof FooService) {
                _service = (FooService) invokableService;
            } else {
                _service = new FooServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(FooServiceUtil.class, "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(FooService service) {
    }
}

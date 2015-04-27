package com.sohlman.liferay.foobar.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FooService}.
 *
 * @author Sampsa Sohlman
 * @see FooService
 * @generated
 */
public class FooServiceWrapper implements FooService,
    ServiceWrapper<FooService> {
    private FooService _fooService;

    public FooServiceWrapper(FooService fooService) {
        _fooService = fooService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _fooService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _fooService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _fooService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<com.sohlman.liferay.foobar.model.Foo> findByGroup(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _fooService.findByGroup(groupId, start, end);
    }

    @Override
    public int countByGroup(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _fooService.countByGroup(groupId);
    }

    @Override
    public com.sohlman.liferay.foobar.model.Foo addFoo(
        com.sohlman.liferay.foobar.model.Foo foo,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _fooService.addFoo(foo, serviceContext);
    }

    @Override
    public com.sohlman.liferay.foobar.model.Foo updateFoo(
        com.sohlman.liferay.foobar.model.Foo foo)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _fooService.updateFoo(foo);
    }

    @Override
    public com.sohlman.liferay.foobar.model.Foo deleteFoo(
        com.sohlman.liferay.foobar.model.Foo foo)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _fooService.deleteFoo(foo);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public FooService getWrappedFooService() {
        return _fooService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedFooService(FooService fooService) {
        _fooService = fooService;
    }

    @Override
    public FooService getWrappedService() {
        return _fooService;
    }

    @Override
    public void setWrappedService(FooService fooService) {
        _fooService = fooService;
    }
}

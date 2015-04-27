package com.sohlman.liferay.foobar.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BarService}.
 *
 * @author Sampsa Sohlman
 * @see BarService
 * @generated
 */
public class BarServiceWrapper implements BarService,
    ServiceWrapper<BarService> {
    private BarService _barService;

    public BarServiceWrapper(BarService barService) {
        _barService = barService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _barService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _barService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _barService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<com.sohlman.liferay.foobar.model.Bar> findByGroup(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _barService.findByGroup(groupId, start, end);
    }

    @Override
    public int countByGroup(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _barService.countByGroup(groupId);
    }

    @Override
    public com.sohlman.liferay.foobar.model.Bar addBar(
        com.sohlman.liferay.foobar.model.Bar bar,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _barService.addBar(bar, serviceContext);
    }

    @Override
    public com.sohlman.liferay.foobar.model.Bar updateBar(
        com.sohlman.liferay.foobar.model.Bar bar)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _barService.updateBar(bar);
    }

    @Override
    public void deleteBar(long barId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _barService.deleteBar(barId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BarService getWrappedBarService() {
        return _barService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBarService(BarService barService) {
        _barService = barService;
    }

    @Override
    public BarService getWrappedService() {
        return _barService;
    }

    @Override
    public void setWrappedService(BarService barService) {
        _barService = barService;
    }
}

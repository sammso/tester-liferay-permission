package com.sohlman.liferay.foobar.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Bar. This utility wraps
 * {@link com.sohlman.liferay.foobar.service.impl.BarLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Sampsa Sohlman
 * @see BarLocalService
 * @see com.sohlman.liferay.foobar.service.base.BarLocalServiceBaseImpl
 * @see com.sohlman.liferay.foobar.service.impl.BarLocalServiceImpl
 * @generated
 */
public class BarLocalServiceUtil {
    private static BarLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.sohlman.liferay.foobar.service.impl.BarLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the bar to the database. Also notifies the appropriate model listeners.
    *
    * @param bar the bar
    * @return the bar that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.sohlman.liferay.foobar.model.Bar addBar(
        com.sohlman.liferay.foobar.model.Bar bar)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addBar(bar);
    }

    /**
    * Creates a new bar with the primary key. Does not add the bar to the database.
    *
    * @param barId the primary key for the new bar
    * @return the new bar
    */
    public static com.sohlman.liferay.foobar.model.Bar createBar(long barId) {
        return getService().createBar(barId);
    }

    /**
    * Deletes the bar with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param barId the primary key of the bar
    * @return the bar that was removed
    * @throws PortalException if a bar with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sohlman.liferay.foobar.model.Bar deleteBar(long barId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBar(barId);
    }

    /**
    * Deletes the bar from the database. Also notifies the appropriate model listeners.
    *
    * @param bar the bar
    * @return the bar that was removed
    * @throws PortalException
    * @throws SystemException if a system exception occurred
    */
    public static com.sohlman.liferay.foobar.model.Bar deleteBar(
        com.sohlman.liferay.foobar.model.Bar bar)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBar(bar);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.foobar.model.impl.BarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.foobar.model.impl.BarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.sohlman.liferay.foobar.model.Bar fetchBar(long barId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchBar(barId);
    }

    /**
    * Returns the bar with the primary key.
    *
    * @param barId the primary key of the bar
    * @return the bar
    * @throws PortalException if a bar with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sohlman.liferay.foobar.model.Bar getBar(long barId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getBar(barId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the bars.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.foobar.model.impl.BarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of bars
    * @param end the upper bound of the range of bars (not inclusive)
    * @return the range of bars
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sohlman.liferay.foobar.model.Bar> getBars(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBars(start, end);
    }

    /**
    * Returns the number of bars.
    *
    * @return the number of bars
    * @throws SystemException if a system exception occurred
    */
    public static int getBarsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBarsCount();
    }

    /**
    * Updates the bar in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param bar the bar
    * @return the bar that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.sohlman.liferay.foobar.model.Bar updateBar(
        com.sohlman.liferay.foobar.model.Bar bar)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateBar(bar);
    }

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

    public static com.sohlman.liferay.foobar.model.Bar create() {
        return getService().create();
    }

    public static com.sohlman.liferay.foobar.model.Bar addBar(
        com.sohlman.liferay.foobar.model.Bar bar,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addBar(bar, serviceContext);
    }

    public static java.util.List<com.sohlman.liferay.foobar.model.Bar> findByGroup(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByGroup(groupId, start, end);
    }

    public static int countByGroup(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().countByGroup(groupId);
    }

    public static void clearService() {
        _service = null;
    }

    public static BarLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    BarLocalService.class.getName());

            if (invokableLocalService instanceof BarLocalService) {
                _service = (BarLocalService) invokableLocalService;
            } else {
                _service = new BarLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(BarLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(BarLocalService service) {
    }
}

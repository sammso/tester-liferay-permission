package com.sohlman.liferay.foobar.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.sohlman.liferay.foobar.model.Bar;

import java.util.List;

/**
 * The persistence utility for the bar service. This utility wraps {@link BarPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sampsa Sohlman
 * @see BarPersistence
 * @see BarPersistenceImpl
 * @generated
 */
public class BarUtil {
    private static BarPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Bar bar) {
        getPersistence().clearCache(bar);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Bar> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Bar> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Bar> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Bar update(Bar bar) throws SystemException {
        return getPersistence().update(bar);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Bar update(Bar bar, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(bar, serviceContext);
    }

    /**
    * Returns all the bars where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching bars
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sohlman.liferay.foobar.model.Bar> findByGroup(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroup(groupId);
    }

    /**
    * Returns a range of all the bars where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.foobar.model.impl.BarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of bars
    * @param end the upper bound of the range of bars (not inclusive)
    * @return the range of matching bars
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sohlman.liferay.foobar.model.Bar> findByGroup(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroup(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the bars where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.foobar.model.impl.BarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of bars
    * @param end the upper bound of the range of bars (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching bars
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sohlman.liferay.foobar.model.Bar> findByGroup(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroup(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first bar in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bar
    * @throws com.sohlman.liferay.foobar.NoSuchBarException if a matching bar could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sohlman.liferay.foobar.model.Bar findByGroup_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchBarException {
        return getPersistence().findByGroup_First(groupId, orderByComparator);
    }

    /**
    * Returns the first bar in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bar, or <code>null</code> if a matching bar could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sohlman.liferay.foobar.model.Bar fetchByGroup_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroup_First(groupId, orderByComparator);
    }

    /**
    * Returns the last bar in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bar
    * @throws com.sohlman.liferay.foobar.NoSuchBarException if a matching bar could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sohlman.liferay.foobar.model.Bar findByGroup_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchBarException {
        return getPersistence().findByGroup_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last bar in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bar, or <code>null</code> if a matching bar could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sohlman.liferay.foobar.model.Bar fetchByGroup_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroup_Last(groupId, orderByComparator);
    }

    /**
    * Returns the bars before and after the current bar in the ordered set where groupId = &#63;.
    *
    * @param barId the primary key of the current bar
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bar
    * @throws com.sohlman.liferay.foobar.NoSuchBarException if a bar with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sohlman.liferay.foobar.model.Bar[] findByGroup_PrevAndNext(
        long barId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchBarException {
        return getPersistence()
                   .findByGroup_PrevAndNext(barId, groupId, orderByComparator);
    }

    /**
    * Returns all the bars that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching bars that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sohlman.liferay.foobar.model.Bar> filterFindByGroup(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterFindByGroup(groupId);
    }

    /**
    * Returns a range of all the bars that the user has permission to view where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.foobar.model.impl.BarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of bars
    * @param end the upper bound of the range of bars (not inclusive)
    * @return the range of matching bars that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sohlman.liferay.foobar.model.Bar> filterFindByGroup(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterFindByGroup(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the bars that the user has permissions to view where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.foobar.model.impl.BarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of bars
    * @param end the upper bound of the range of bars (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching bars that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sohlman.liferay.foobar.model.Bar> filterFindByGroup(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterFindByGroup(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the bars before and after the current bar in the ordered set of bars that the user has permission to view where groupId = &#63;.
    *
    * @param barId the primary key of the current bar
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bar
    * @throws com.sohlman.liferay.foobar.NoSuchBarException if a bar with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sohlman.liferay.foobar.model.Bar[] filterFindByGroup_PrevAndNext(
        long barId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchBarException {
        return getPersistence()
                   .filterFindByGroup_PrevAndNext(barId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the bars where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroup(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroup(groupId);
    }

    /**
    * Returns the number of bars where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching bars
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroup(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroup(groupId);
    }

    /**
    * Returns the number of bars that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching bars that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static int filterCountByGroup(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterCountByGroup(groupId);
    }

    /**
    * Caches the bar in the entity cache if it is enabled.
    *
    * @param bar the bar
    */
    public static void cacheResult(com.sohlman.liferay.foobar.model.Bar bar) {
        getPersistence().cacheResult(bar);
    }

    /**
    * Caches the bars in the entity cache if it is enabled.
    *
    * @param bars the bars
    */
    public static void cacheResult(
        java.util.List<com.sohlman.liferay.foobar.model.Bar> bars) {
        getPersistence().cacheResult(bars);
    }

    /**
    * Creates a new bar with the primary key. Does not add the bar to the database.
    *
    * @param barId the primary key for the new bar
    * @return the new bar
    */
    public static com.sohlman.liferay.foobar.model.Bar create(long barId) {
        return getPersistence().create(barId);
    }

    /**
    * Removes the bar with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param barId the primary key of the bar
    * @return the bar that was removed
    * @throws com.sohlman.liferay.foobar.NoSuchBarException if a bar with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sohlman.liferay.foobar.model.Bar remove(long barId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchBarException {
        return getPersistence().remove(barId);
    }

    public static com.sohlman.liferay.foobar.model.Bar updateImpl(
        com.sohlman.liferay.foobar.model.Bar bar)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(bar);
    }

    /**
    * Returns the bar with the primary key or throws a {@link com.sohlman.liferay.foobar.NoSuchBarException} if it could not be found.
    *
    * @param barId the primary key of the bar
    * @return the bar
    * @throws com.sohlman.liferay.foobar.NoSuchBarException if a bar with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sohlman.liferay.foobar.model.Bar findByPrimaryKey(
        long barId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchBarException {
        return getPersistence().findByPrimaryKey(barId);
    }

    /**
    * Returns the bar with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param barId the primary key of the bar
    * @return the bar, or <code>null</code> if a bar with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sohlman.liferay.foobar.model.Bar fetchByPrimaryKey(
        long barId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(barId);
    }

    /**
    * Returns all the bars.
    *
    * @return the bars
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sohlman.liferay.foobar.model.Bar> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.sohlman.liferay.foobar.model.Bar> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the bars.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.foobar.model.impl.BarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of bars
    * @param end the upper bound of the range of bars (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of bars
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sohlman.liferay.foobar.model.Bar> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the bars from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of bars.
    *
    * @return the number of bars
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static BarPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BarPersistence) PortletBeanLocatorUtil.locate(com.sohlman.liferay.foobar.service.ClpSerializer.getServletContextName(),
                    BarPersistence.class.getName());

            ReferenceRegistry.registerReference(BarUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BarPersistence persistence) {
    }
}

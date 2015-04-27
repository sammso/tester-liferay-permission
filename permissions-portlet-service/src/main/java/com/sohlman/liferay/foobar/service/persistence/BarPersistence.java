package com.sohlman.liferay.foobar.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.sohlman.liferay.foobar.model.Bar;

/**
 * The persistence interface for the bar service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sampsa Sohlman
 * @see BarPersistenceImpl
 * @see BarUtil
 * @generated
 */
public interface BarPersistence extends BasePersistence<Bar> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BarUtil} to access the bar persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the bars where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching bars
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.foobar.model.Bar> findByGroup(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sohlman.liferay.foobar.model.Bar> findByGroup(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sohlman.liferay.foobar.model.Bar> findByGroup(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first bar in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bar
    * @throws com.sohlman.liferay.foobar.NoSuchBarException if a matching bar could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Bar findByGroup_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchBarException;

    /**
    * Returns the first bar in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bar, or <code>null</code> if a matching bar could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Bar fetchByGroup_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last bar in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bar
    * @throws com.sohlman.liferay.foobar.NoSuchBarException if a matching bar could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Bar findByGroup_Last(long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchBarException;

    /**
    * Returns the last bar in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bar, or <code>null</code> if a matching bar could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Bar fetchByGroup_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.sohlman.liferay.foobar.model.Bar[] findByGroup_PrevAndNext(
        long barId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchBarException;

    /**
    * Returns all the bars that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching bars that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.foobar.model.Bar> filterFindByGroup(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sohlman.liferay.foobar.model.Bar> filterFindByGroup(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sohlman.liferay.foobar.model.Bar> filterFindByGroup(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.sohlman.liferay.foobar.model.Bar[] filterFindByGroup_PrevAndNext(
        long barId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchBarException;

    /**
    * Removes all the bars where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroup(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of bars where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching bars
    * @throws SystemException if a system exception occurred
    */
    public int countByGroup(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of bars that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching bars that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public int filterCountByGroup(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the bar in the entity cache if it is enabled.
    *
    * @param bar the bar
    */
    public void cacheResult(com.sohlman.liferay.foobar.model.Bar bar);

    /**
    * Caches the bars in the entity cache if it is enabled.
    *
    * @param bars the bars
    */
    public void cacheResult(
        java.util.List<com.sohlman.liferay.foobar.model.Bar> bars);

    /**
    * Creates a new bar with the primary key. Does not add the bar to the database.
    *
    * @param barId the primary key for the new bar
    * @return the new bar
    */
    public com.sohlman.liferay.foobar.model.Bar create(long barId);

    /**
    * Removes the bar with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param barId the primary key of the bar
    * @return the bar that was removed
    * @throws com.sohlman.liferay.foobar.NoSuchBarException if a bar with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Bar remove(long barId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchBarException;

    public com.sohlman.liferay.foobar.model.Bar updateImpl(
        com.sohlman.liferay.foobar.model.Bar bar)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the bar with the primary key or throws a {@link com.sohlman.liferay.foobar.NoSuchBarException} if it could not be found.
    *
    * @param barId the primary key of the bar
    * @return the bar
    * @throws com.sohlman.liferay.foobar.NoSuchBarException if a bar with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Bar findByPrimaryKey(long barId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchBarException;

    /**
    * Returns the bar with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param barId the primary key of the bar
    * @return the bar, or <code>null</code> if a bar with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Bar fetchByPrimaryKey(long barId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the bars.
    *
    * @return the bars
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.foobar.model.Bar> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sohlman.liferay.foobar.model.Bar> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sohlman.liferay.foobar.model.Bar> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the bars from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of bars.
    *
    * @return the number of bars
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}

package com.sohlman.liferay.foobar.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.sohlman.liferay.foobar.model.Foo;

/**
 * The persistence interface for the foo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sampsa Sohlman
 * @see FooPersistenceImpl
 * @see FooUtil
 * @generated
 */
public interface FooPersistence extends BasePersistence<Foo> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link FooUtil} to access the foo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the foos where resourceBlockId = &#63;.
    *
    * @param resourceBlockId the resource block ID
    * @return the matching foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.foobar.model.Foo> findByResourceBlockId(
        long resourceBlockId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the foos where resourceBlockId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.foobar.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param resourceBlockId the resource block ID
    * @param start the lower bound of the range of foos
    * @param end the upper bound of the range of foos (not inclusive)
    * @return the range of matching foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.foobar.model.Foo> findByResourceBlockId(
        long resourceBlockId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the foos where resourceBlockId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.foobar.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param resourceBlockId the resource block ID
    * @param start the lower bound of the range of foos
    * @param end the upper bound of the range of foos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.foobar.model.Foo> findByResourceBlockId(
        long resourceBlockId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first foo in the ordered set where resourceBlockId = &#63;.
    *
    * @param resourceBlockId the resource block ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching foo
    * @throws com.sohlman.liferay.foobar.NoSuchFooException if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Foo findByResourceBlockId_First(
        long resourceBlockId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchFooException;

    /**
    * Returns the first foo in the ordered set where resourceBlockId = &#63;.
    *
    * @param resourceBlockId the resource block ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching foo, or <code>null</code> if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Foo fetchByResourceBlockId_First(
        long resourceBlockId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last foo in the ordered set where resourceBlockId = &#63;.
    *
    * @param resourceBlockId the resource block ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching foo
    * @throws com.sohlman.liferay.foobar.NoSuchFooException if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Foo findByResourceBlockId_Last(
        long resourceBlockId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchFooException;

    /**
    * Returns the last foo in the ordered set where resourceBlockId = &#63;.
    *
    * @param resourceBlockId the resource block ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching foo, or <code>null</code> if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Foo fetchByResourceBlockId_Last(
        long resourceBlockId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the foos before and after the current foo in the ordered set where resourceBlockId = &#63;.
    *
    * @param fooId the primary key of the current foo
    * @param resourceBlockId the resource block ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next foo
    * @throws com.sohlman.liferay.foobar.NoSuchFooException if a foo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Foo[] findByResourceBlockId_PrevAndNext(
        long fooId, long resourceBlockId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchFooException;

    /**
    * Removes all the foos where resourceBlockId = &#63; from the database.
    *
    * @param resourceBlockId the resource block ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByResourceBlockId(long resourceBlockId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of foos where resourceBlockId = &#63;.
    *
    * @param resourceBlockId the resource block ID
    * @return the number of matching foos
    * @throws SystemException if a system exception occurred
    */
    public int countByResourceBlockId(long resourceBlockId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the foos where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.foobar.model.Foo> findByGroup(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the foos where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.foobar.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of foos
    * @param end the upper bound of the range of foos (not inclusive)
    * @return the range of matching foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.foobar.model.Foo> findByGroup(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the foos where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.foobar.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of foos
    * @param end the upper bound of the range of foos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.foobar.model.Foo> findByGroup(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first foo in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching foo
    * @throws com.sohlman.liferay.foobar.NoSuchFooException if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Foo findByGroup_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchFooException;

    /**
    * Returns the first foo in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching foo, or <code>null</code> if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Foo fetchByGroup_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last foo in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching foo
    * @throws com.sohlman.liferay.foobar.NoSuchFooException if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Foo findByGroup_Last(long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchFooException;

    /**
    * Returns the last foo in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching foo, or <code>null</code> if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Foo fetchByGroup_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the foos before and after the current foo in the ordered set where groupId = &#63;.
    *
    * @param fooId the primary key of the current foo
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next foo
    * @throws com.sohlman.liferay.foobar.NoSuchFooException if a foo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Foo[] findByGroup_PrevAndNext(
        long fooId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchFooException;

    /**
    * Returns all the foos that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching foos that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.foobar.model.Foo> filterFindByGroup(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the foos that the user has permission to view where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.foobar.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of foos
    * @param end the upper bound of the range of foos (not inclusive)
    * @return the range of matching foos that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.foobar.model.Foo> filterFindByGroup(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the foos that the user has permissions to view where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.foobar.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of foos
    * @param end the upper bound of the range of foos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching foos that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.foobar.model.Foo> filterFindByGroup(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the foos before and after the current foo in the ordered set of foos that the user has permission to view where groupId = &#63;.
    *
    * @param fooId the primary key of the current foo
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next foo
    * @throws com.sohlman.liferay.foobar.NoSuchFooException if a foo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Foo[] filterFindByGroup_PrevAndNext(
        long fooId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchFooException;

    /**
    * Removes all the foos where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroup(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of foos where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching foos
    * @throws SystemException if a system exception occurred
    */
    public int countByGroup(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of foos that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching foos that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public int filterCountByGroup(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the foo in the entity cache if it is enabled.
    *
    * @param foo the foo
    */
    public void cacheResult(com.sohlman.liferay.foobar.model.Foo foo);

    /**
    * Caches the foos in the entity cache if it is enabled.
    *
    * @param foos the foos
    */
    public void cacheResult(
        java.util.List<com.sohlman.liferay.foobar.model.Foo> foos);

    /**
    * Creates a new foo with the primary key. Does not add the foo to the database.
    *
    * @param fooId the primary key for the new foo
    * @return the new foo
    */
    public com.sohlman.liferay.foobar.model.Foo create(long fooId);

    /**
    * Removes the foo with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param fooId the primary key of the foo
    * @return the foo that was removed
    * @throws com.sohlman.liferay.foobar.NoSuchFooException if a foo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Foo remove(long fooId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchFooException;

    public com.sohlman.liferay.foobar.model.Foo updateImpl(
        com.sohlman.liferay.foobar.model.Foo foo)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the foo with the primary key or throws a {@link com.sohlman.liferay.foobar.NoSuchFooException} if it could not be found.
    *
    * @param fooId the primary key of the foo
    * @return the foo
    * @throws com.sohlman.liferay.foobar.NoSuchFooException if a foo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Foo findByPrimaryKey(long fooId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.foobar.NoSuchFooException;

    /**
    * Returns the foo with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param fooId the primary key of the foo
    * @return the foo, or <code>null</code> if a foo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.foobar.model.Foo fetchByPrimaryKey(long fooId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the foos.
    *
    * @return the foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.foobar.model.Foo> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the foos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.foobar.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of foos
    * @param end the upper bound of the range of foos (not inclusive)
    * @return the range of foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.foobar.model.Foo> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the foos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.foobar.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of foos
    * @param end the upper bound of the range of foos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.foobar.model.Foo> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the foos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of foos.
    *
    * @return the number of foos
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}

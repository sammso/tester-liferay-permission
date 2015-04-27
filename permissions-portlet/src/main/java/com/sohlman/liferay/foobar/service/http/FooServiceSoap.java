package com.sohlman.liferay.foobar.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.sohlman.liferay.foobar.service.FooServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.sohlman.liferay.foobar.service.FooServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.sohlman.liferay.foobar.model.FooSoap}.
 * If the method in the service utility returns a
 * {@link com.sohlman.liferay.foobar.model.Foo}, that is translated to a
 * {@link com.sohlman.liferay.foobar.model.FooSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Sampsa Sohlman
 * @see FooServiceHttp
 * @see com.sohlman.liferay.foobar.model.FooSoap
 * @see com.sohlman.liferay.foobar.service.FooServiceUtil
 * @generated
 */
public class FooServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(FooServiceSoap.class);

    public static com.sohlman.liferay.foobar.model.FooSoap[] findByGroup(
        long groupId, int start, int end) throws RemoteException {
        try {
            java.util.List<com.sohlman.liferay.foobar.model.Foo> returnValue = FooServiceUtil.findByGroup(groupId,
                    start, end);

            return com.sohlman.liferay.foobar.model.FooSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static int countByGroup(long groupId) throws RemoteException {
        try {
            int returnValue = FooServiceUtil.countByGroup(groupId);

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.sohlman.liferay.foobar.model.FooSoap addFoo(
        com.sohlman.liferay.foobar.model.FooSoap foo,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws RemoteException {
        try {
            com.sohlman.liferay.foobar.model.Foo returnValue = FooServiceUtil.addFoo(com.sohlman.liferay.foobar.model.impl.FooModelImpl.toModel(
                        foo), serviceContext);

            return com.sohlman.liferay.foobar.model.FooSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.sohlman.liferay.foobar.model.FooSoap updateFoo(
        com.sohlman.liferay.foobar.model.FooSoap foo) throws RemoteException {
        try {
            com.sohlman.liferay.foobar.model.Foo returnValue = FooServiceUtil.updateFoo(com.sohlman.liferay.foobar.model.impl.FooModelImpl.toModel(
                        foo));

            return com.sohlman.liferay.foobar.model.FooSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.sohlman.liferay.foobar.model.FooSoap deleteFoo(
        com.sohlman.liferay.foobar.model.FooSoap foo) throws RemoteException {
        try {
            com.sohlman.liferay.foobar.model.Foo returnValue = FooServiceUtil.deleteFoo(com.sohlman.liferay.foobar.model.impl.FooModelImpl.toModel(
                        foo));

            return com.sohlman.liferay.foobar.model.FooSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}

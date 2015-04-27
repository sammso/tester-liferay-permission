package com.sohlman.liferay.foobar.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.sohlman.liferay.foobar.service.BarServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.sohlman.liferay.foobar.service.BarServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.sohlman.liferay.foobar.model.BarSoap}.
 * If the method in the service utility returns a
 * {@link com.sohlman.liferay.foobar.model.Bar}, that is translated to a
 * {@link com.sohlman.liferay.foobar.model.BarSoap}. Methods that SOAP cannot
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
 * @see BarServiceHttp
 * @see com.sohlman.liferay.foobar.model.BarSoap
 * @see com.sohlman.liferay.foobar.service.BarServiceUtil
 * @generated
 */
public class BarServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(BarServiceSoap.class);

    public static com.sohlman.liferay.foobar.model.BarSoap[] findByGroup(
        long groupId, int start, int end) throws RemoteException {
        try {
            java.util.List<com.sohlman.liferay.foobar.model.Bar> returnValue = BarServiceUtil.findByGroup(groupId,
                    start, end);

            return com.sohlman.liferay.foobar.model.BarSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static int countByGroup(long groupId) throws RemoteException {
        try {
            int returnValue = BarServiceUtil.countByGroup(groupId);

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.sohlman.liferay.foobar.model.BarSoap addBar(
        com.sohlman.liferay.foobar.model.BarSoap bar,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws RemoteException {
        try {
            com.sohlman.liferay.foobar.model.Bar returnValue = BarServiceUtil.addBar(com.sohlman.liferay.foobar.model.impl.BarModelImpl.toModel(
                        bar), serviceContext);

            return com.sohlman.liferay.foobar.model.BarSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.sohlman.liferay.foobar.model.BarSoap updateBar(
        com.sohlman.liferay.foobar.model.BarSoap bar) throws RemoteException {
        try {
            com.sohlman.liferay.foobar.model.Bar returnValue = BarServiceUtil.updateBar(com.sohlman.liferay.foobar.model.impl.BarModelImpl.toModel(
                        bar));

            return com.sohlman.liferay.foobar.model.BarSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void deleteBar(long barId) throws RemoteException {
        try {
            BarServiceUtil.deleteBar(barId);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}

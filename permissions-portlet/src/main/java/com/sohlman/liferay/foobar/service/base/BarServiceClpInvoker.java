package com.sohlman.liferay.foobar.service.base;

import com.sohlman.liferay.foobar.service.BarServiceUtil;

import java.util.Arrays;

/**
 * @author Sampsa Sohlman
 * @generated
 */
public class BarServiceClpInvoker {
    private String _methodName30;
    private String[] _methodParameterTypes30;
    private String _methodName31;
    private String[] _methodParameterTypes31;
    private String _methodName36;
    private String[] _methodParameterTypes36;
    private String _methodName37;
    private String[] _methodParameterTypes37;
    private String _methodName38;
    private String[] _methodParameterTypes38;
    private String _methodName39;
    private String[] _methodParameterTypes39;
    private String _methodName40;
    private String[] _methodParameterTypes40;

    public BarServiceClpInvoker() {
        _methodName30 = "getBeanIdentifier";

        _methodParameterTypes30 = new String[] {  };

        _methodName31 = "setBeanIdentifier";

        _methodParameterTypes31 = new String[] { "java.lang.String" };

        _methodName36 = "findByGroup";

        _methodParameterTypes36 = new String[] { "long", "int", "int" };

        _methodName37 = "countByGroup";

        _methodParameterTypes37 = new String[] { "long" };

        _methodName38 = "addBar";

        _methodParameterTypes38 = new String[] {
                "com.sohlman.liferay.foobar.model.Bar",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName39 = "updateBar";

        _methodParameterTypes39 = new String[] {
                "com.sohlman.liferay.foobar.model.Bar"
            };

        _methodName40 = "deleteBar";

        _methodParameterTypes40 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName30.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
            return BarServiceUtil.getBeanIdentifier();
        }

        if (_methodName31.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
            BarServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName36.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
            return BarServiceUtil.findByGroup(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName37.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
            return BarServiceUtil.countByGroup(((Long) arguments[0]).longValue());
        }

        if (_methodName38.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes38, parameterTypes)) {
            return BarServiceUtil.addBar((com.sohlman.liferay.foobar.model.Bar) arguments[0],
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName39.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes39, parameterTypes)) {
            return BarServiceUtil.updateBar((com.sohlman.liferay.foobar.model.Bar) arguments[0]);
        }

        if (_methodName40.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
            BarServiceUtil.deleteBar(((Long) arguments[0]).longValue());

            return null;
        }

        throw new UnsupportedOperationException();
    }
}

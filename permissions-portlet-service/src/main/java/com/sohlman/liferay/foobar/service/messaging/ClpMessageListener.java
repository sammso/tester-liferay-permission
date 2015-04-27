package com.sohlman.liferay.foobar.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.sohlman.liferay.foobar.service.BarLocalServiceUtil;
import com.sohlman.liferay.foobar.service.BarServiceUtil;
import com.sohlman.liferay.foobar.service.ClpSerializer;
import com.sohlman.liferay.foobar.service.FooLocalServiceUtil;
import com.sohlman.liferay.foobar.service.FooServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            BarLocalServiceUtil.clearService();

            BarServiceUtil.clearService();
            FooLocalServiceUtil.clearService();

            FooServiceUtil.clearService();
        }
    }
}

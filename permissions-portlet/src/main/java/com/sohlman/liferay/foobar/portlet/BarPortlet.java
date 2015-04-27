package com.sohlman.liferay.foobar.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.sohlman.liferay.foobar.model.Bar;
import com.sohlman.liferay.foobar.service.BarLocalServiceUtil;
import com.sohlman.liferay.foobar.service.BarServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * Portlet implementation class BarPortlet
 */
public class BarPortlet extends MVCPortlet {
	public void add(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		Bar bar = BarLocalServiceUtil.create();
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		bar.setValue(themeDisplay.getUser().getScreenName() + " : " + 
			String.valueOf(System.currentTimeMillis()) );
		ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
		
		BarServiceUtil.addBar(bar, serviceContext);
	}
	
	public void update(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		Bar bar = BarLocalServiceUtil.getBar(ParamUtil.get(actionRequest, "id", -1L));
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		if (bar!=null) {
			BarServiceUtil.updateBar(bar);
		}
	}
	
	public void delete(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		Bar bar = BarLocalServiceUtil.getBar(ParamUtil.get(actionRequest, "id", -1L));
		
		if (bar!=null) {
			BarServiceUtil.deleteBar(bar.getBarId());
		}
	}
}

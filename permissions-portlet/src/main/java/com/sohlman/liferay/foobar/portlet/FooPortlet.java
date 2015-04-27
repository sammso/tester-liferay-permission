package com.sohlman.liferay.foobar.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.Team;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.service.GroupServiceUtil;
import com.liferay.portal.service.ResourceBlockLocalServiceUtil;
import com.liferay.portal.service.ResourceBlockServiceUtil;
import com.liferay.portal.service.ResourcePermissionServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.TeamServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.sohlman.liferay.foobar.model.Foo;
import com.sohlman.liferay.foobar.service.FooLocalServiceUtil;
import com.sohlman.liferay.foobar.service.FooServiceUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * Portlet implementation class FooPortlet
 */
public class FooPortlet extends MVCPortlet {
	public void add(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		Foo foo = FooLocalServiceUtil.create();
		
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		foo.setValue(themeDisplay.getUser().getScreenName() + " : " + 
			String.valueOf(System.currentTimeMillis()) );
		ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
		
		FooServiceUtil.addFoo(foo, serviceContext);
	}
	
	public void update(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		
		
		Foo foo = FooLocalServiceUtil.getFoo(ParamUtil.get(actionRequest, "id", -1L));
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		if (foo!=null) {
			FooServiceUtil.updateFoo(foo);
		}
	}
	
	public void delete(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		Foo foo = FooLocalServiceUtil.getFoo(ParamUtil.get(actionRequest, "id", -1L));
		
		if (foo!=null) {
			FooServiceUtil.deleteFoo(foo);
		}
	}
}

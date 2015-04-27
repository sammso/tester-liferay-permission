package com.sohlman.liferay.foobar.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.Team;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.service.GroupServiceUtil;
import com.liferay.portal.service.ResourceBlockServiceUtil;
import com.liferay.portal.service.ResourcePermissionServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.TeamServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.sohlman.liferay.foobar.model.Bar;
import com.sohlman.liferay.foobar.model.Foo;
import com.sohlman.liferay.foobar.service.BarLocalServiceUtil;
import com.sohlman.liferay.foobar.service.BarServiceUtil;
import com.sohlman.liferay.foobar.service.FooLocalServiceUtil;
import com.sohlman.liferay.foobar.service.FooServiceUtil;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * Portlet implementation class GeneratePortlet
 */
public class GeneratePortlet extends MVCPortlet {
 
	public void generateTeams(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		
		List<Group> groups = GroupServiceUtil.getGroups(companyId, 0L, true);
		
		String[] teamNames = new String[] {"A team", "B team", "C team", "D team"};
		
		for (Group group : groups) {
			
			if (group.isUser() || group.isUserGroup() || group.isUserPersonalSite()) {
				continue;
			}
			
			if (!group.isRegularSite()) {
				continue;
			}
			
			for (String teamName :  teamNames) {
				Team team = TeamServiceUtil.addTeam(group.getGroupId(), teamName, teamName + " descrcription");
			}
			

		}
	}
	
	public void generateFoos(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();

		List<Group> groups = GroupServiceUtil.getGroups(companyId, 0L, true);
		
		
		
		for (Group group : groups) {
			long fooNo = 0;
			
			
			if (group.isUser() || group.isUserGroup() || group.isUserPersonalSite() ) {
				continue;
			}
			
			if (!group.isRegularSite()) {
				continue;
			}
			
			
			for (int i = 0 ; i < 1000 ; i++ ) {
				
				Foo foo = FooLocalServiceUtil.create();
				
				foo.setValue("Foo : " + group.getGroupId() + " : " + fooNo );
				fooNo++;
				
				ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			
				serviceContext.setCompanyId(group.getCompanyId());
				serviceContext.setScopeGroupId(group.getGroupId());
				
				foo = FooServiceUtil.addFoo(foo, serviceContext);
				
				List<Role> teamRoles = RoleLocalServiceUtil.getTeamRoles(group.getGroupId());
				Map<Long, String[]> roleIdsToActionIds = new HashMap<>();
				
				Stack<String[]> stack = new Stack<>();
				
				stack.push(new String[]{ ActionKeys.UPDATE, ActionKeys.VIEW });
				stack.push(new String[]{ ActionKeys.DELETE, ActionKeys.UPDATE, ActionKeys.VIEW });
				stack.push(new String[]{ ActionKeys.DELETE, ActionKeys.PERMISSIONS, ActionKeys.UPDATE, ActionKeys.VIEW });
				
				for ( Role role : teamRoles ) {
					try {
						roleIdsToActionIds.put(role.getRoleId(), stack.pop());
					}
					catch(EmptyStackException ese) {
						roleIdsToActionIds.put(role.getRoleId(), new String[]{ ActionKeys.VIEW });
					}
				}
				
				ResourceBlockServiceUtil.setIndividualScopePermissions(
						companyId, group.getGroupId(), foo.getModelClassName(),
						foo.getPrimaryKey(), roleIdsToActionIds);
			}
		}
	}
	

	public void generateBars(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();

		List<Group> groups = GroupServiceUtil.getGroups(companyId, 0L, true);
		
		
		
		for (Group group : groups) {
			long barNo = 0;
			
			
			if (group.isUser() || group.isUserGroup() || group.isUserPersonalSite() ) {
				continue;
			}
			
			if (!group.isRegularSite()) {
				continue;
			}
			
			
			for (int i = 0 ; i < 1000 ; i++ ) {
				
				Bar bar = BarLocalServiceUtil.create();
				
				bar.setValue("Bar : " + group.getGroupId() + " : " + barNo );
				barNo++;
				
				ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			
				serviceContext.setCompanyId(group.getCompanyId());
				serviceContext.setScopeGroupId(group.getGroupId());
				
				bar = BarServiceUtil.addBar(bar, serviceContext);
			
				long modelResourceRoleId = 0L;
				
				List<Role> teamRoles = RoleLocalServiceUtil.getTeamRoles(group.getGroupId(), new long[] {modelResourceRoleId});
				Map<Long, String[]> roleIdsToActionIds = new HashMap<>();
				
				Stack<String[]> stack = new Stack<>();
				
				stack.push(new String[]{ ActionKeys.UPDATE, ActionKeys.VIEW });
				stack.push(new String[]{ ActionKeys.DELETE, ActionKeys.UPDATE, ActionKeys.VIEW });
				stack.push(new String[]{ ActionKeys.DELETE, ActionKeys.PERMISSIONS, ActionKeys.UPDATE, ActionKeys.VIEW });

				
				for ( Role role : teamRoles ) {
					try {
						roleIdsToActionIds.put(role.getRoleId(), stack.pop());
					}
					catch(EmptyStackException ese) {
						roleIdsToActionIds.put(role.getRoleId(), new String[]{ ActionKeys.VIEW });
					}
				}
				
				ResourcePermissionServiceUtil.setIndividualResourcePermissions(
						group.getGroupId(), group.getCompanyId(), bar.getModelClassName(),
						String.valueOf(bar.getPrimaryKey()), roleIdsToActionIds);
			}
		}
	}
	
}

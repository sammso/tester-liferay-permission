<%@include file="/html/init.jsp"%>
<%	
	boolean hasAddPermission = permissionChecker.hasPermission(
			scopeGroupId,
			"com.sohlman.liferay.foobar.model",
			scopeGroupId, "ADD_BAR");
	
	boolean hasConfigurePermission = permissionChecker.hasPermission(
			scopeGroupId,
			"com.sohlman.liferay.foobar.model",
			scopeGroupId, ActionKeys.PERMISSIONS);

%>
<h1>Foo management</h1>
<aui:button-row>
	<c:if test='<%= hasAddPermission %>'>
		<portlet:actionURL name="add" var="addURL"/> 
		<aui:button name="add" value="add"
			onClick="<%=addURL %>" />
	</c:if>
	<c:if test='<%= hasConfigurePermission %>'>
		<liferay-security:permissionsURL
			modelResource="com.sohlman.liferay.foobar.model"
			modelResourceDescription="foo-and-bar-permissions"
			resourcePrimKey="<%= String.valueOf(scopeGroupId) %>"
			var="permissionsURL" />

		<aui:button value="permissions" onClick="<%= permissionsURL %>" />
	</c:if>	
</aui:button-row>

<liferay-ui:search-container emptyResultsMessage="no-foos">
	<liferay-ui:search-container-results
		results="<%=FooServiceUtil.findByGroup(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd()) %>" total="<%=FooServiceUtil.countByGroup(scopeGroupId) %>" />
		
	<liferay-ui:search-container-row
		className="com.sohlman.liferay.foobar.model.Foo"
		keyProperty="fooId"
		modelVar="foo" escapedModel="<%= false %>"
	>
		<liferay-ui:search-container-column-date
			name="Create Date"
			property="createDate"
		/>
		<liferay-ui:search-container-column-date
			name="Modified Date"
			property="modifiedDate"
		/>		
		<liferay-ui:search-container-column-text
			name="Value"
			property="value"
		/>
		<liferay-ui:search-container-column-jsp align="right"
			path="/html/foo/actions.jsp" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
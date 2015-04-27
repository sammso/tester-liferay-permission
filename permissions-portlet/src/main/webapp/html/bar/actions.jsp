<%@include file="/html/init.jsp"%>

<%
	ResultRow row = (ResultRow) request
			.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Bar bar = (Bar) row.getObject();
	
	long companyId = bar.getCompanyId();
	long groupId = bar.getGroupId();
	long primaryKey = bar.getPrimaryKey();

	String redirect = PortalUtil.getCurrentURL(renderRequest);
	
	boolean deletePermission = false;	
	deletePermission = deletePermission || permissionChecker.hasOwnerPermission(
		companyId, Bar.class.getName(), primaryKey,
		bar.getUserId(), ActionKeys.DELETE);
	deletePermission = deletePermission || permissionChecker.hasPermission(groupId,
		Bar.class.getName(), primaryKey,
		ActionKeys.DELETE);

	boolean updatePermission = false;
	updatePermission = updatePermission || permissionChecker.hasOwnerPermission(
			companyId, Bar.class.getName(), primaryKey,
			bar.getUserId(), ActionKeys.UPDATE);
	updatePermission = updatePermission || permissionChecker.hasPermission(groupId,
		Bar.class.getName(), primaryKey,
		ActionKeys.UPDATE);	
	
	boolean permissionPermission = false;
	permissionPermission = permissionPermission || permissionChecker.hasOwnerPermission(
			companyId, Bar.class.getName(), primaryKey,
			bar.getUserId(), ActionKeys.PERMISSIONS);
	permissionPermission = permissionPermission || permissionChecker.hasPermission(groupId,
		Bar.class.getName(), primaryKey,
		ActionKeys.PERMISSIONS);	

%>

<liferay-ui:icon-menu>
	<c:if
		test="<%= updatePermission %>">
		<portlet:actionURL name="update" var="updateURL">
			<portlet:param name="id" value="<%= String.valueOf(primaryKey) %>" />
		</portlet:actionURL>

		<liferay-ui:icon image="edit" url="<%=updateURL.toString() %>" />
	</c:if>

	<c:if
		test="<%= deletePermission %>">
		<portlet:actionURL name="delete" var="deleteURL">
			<portlet:param name="id" value="<%= String.valueOf(primaryKey) %>" />
			<portlet:param name="redirect"
				value="<%= PortalUtil.getCurrentURL(renderRequest) %>" />
		</portlet:actionURL>

		<liferay-ui:icon-delete url="<%=deleteURL.toString() %>" />
	</c:if>

	<c:if test="<%= permissionPermission %>">
		<liferay-security:permissionsURL
			modelResource="<%= Bar.class.getName() %>"
			modelResourceDescription="<%= bar.getValue() %>"
			resourcePrimKey="<%= String.valueOf(primaryKey) %>"
			var="permissionsURL"
		/>

		<liferay-ui:icon image="permissions" url="<%= permissionsURL %>" />
	</c:if>
</liferay-ui:icon-menu>
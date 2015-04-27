<%@include file="/html/init.jsp"%>
<h1>Foo management</h1>
<aui:button-row>
	<portlet:actionURL name="generateTeams" var="generateTeamsURL"/> 
	<aui:button name="generate-teams" value="generate-teams"
		onClick="<%=generateTeamsURL %>" />
	<portlet:actionURL name="generateFoos" var="generateFoosURL"/> 
	<aui:button name="generate-foos" value="generate-foos"
		onClick="<%=generateFoosURL %>" />
	<portlet:actionURL name="generateBars" var="generateBarsURL"/> 
	<aui:button name="generate-bars" value="generate-bars"
		onClick="<%=generateBarsURL %>" />
</aui:button-row>
# tester-liferay-permission

This is example app for testing Liferay permissioning system and also for performance.

There are three porlets Foo which is using ResourceBlock Permissions and Bar which is using normal ResourcePermissions.

To compile:

mvn package

Deploy:

Copy resulted war to Liferay deploy directory.

Run:
- generate porlet generates 4 teams for all sites
- generate foo generates 1000 Foo entities for every Site.
- generate foo generates 1000 Bar entities for every Site.

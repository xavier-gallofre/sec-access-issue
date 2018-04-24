### Preamble
Spring Security is not resolving sec.access taglib on a .war deployed on tomcat

### Versions and Configs
* Tomcat: 8.5.30
* Grails: 3.3.5
* Spring-Security: 3.2.1

### Problem
When I deploy a .war (generated with `./gradlew dev war`) none of sec.access taglibs are working, denying access in all cases.
The sames taglibs are working perfectly when I run the application with bootRun.

Spring Security is working correctly when I try to access some page securized, so the only problem is to check if I have acces from a .gsp to some controller or action.

Example:

Home controller is securized with `ROLE_POLICE` and hello action is securized with `ROLE_DETECTIVE`.
If you're logged with `sherlock` user it's possible to access by url to `/home/hello` but `<sec:access controller='home' action='hello'> ... </sec:access>` is resolving that you're not allowed to see it.

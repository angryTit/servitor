Elastic Beanstalk Monitoring Application
===

This application acts as watchdog for HAProxy balancer and be able to update HAProxy configuration and restart it.

### How it works

It's Spring Boot application.

* Every minute the application makes request to AWS Beanstalk and read environment name for current production url
* Load list of servers for working env
* Update HAProxy configuration accordingly

## Used projects/libs

* [Java Service Wrapper](http://wrapper.tanukisoftware.com/doc/english/download.jsp)
* [Yet Another Process Library for Java](http://zeroturnaround.com/rebellabs/why-we-created-yaplj-yet-another-process-library-for-java/)

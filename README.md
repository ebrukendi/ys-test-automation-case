# YS QA Automation Case Study
This respository contains Gauge+Selenium Test Automation Project

This is an automation project for doing web automation testing with [Gauge](http://getgauge.io). This project tests some of the functionalities of the [ys](https://www.yemeksepeti.com) web application.

**Tools Used**
* Maven
* Selenium
* Gauge

## Running this automation project
The tests are run on Chrome by default.

### Prerequisites
This case requires the following softwares to run.
* [Java 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or above
    * Note that Gauge works with Java 1.6 and above. But this particular example uses Java 1.7
* [Gauge](https://docs.gauge.org/getting_started/installing-gauge.html)
* Gauge Java plugin
    * can be installed using `gauge install java`
* Chrome

### Setting up Maven

* [Maven installation instructions](http://maven.apache.org/install.html)

## Run specs

If you already have Maven installed, you can execute specs as `mvn test`
This runs Gauge specs with [Maven](http://maven.apache.org/index.html).

This uses Chrome as default browser for specs execution. Make sure Chrome is installed in your machine and [chromedriver](https://sites.google.com/a/chromium.org/chromedriver/) is in PATH.

If you want to use Firefox/IE as browser, pass the corresponding argument to set browser environment as follows:

```
mvn gauge:execute -DspecsDir=specs -Denv="firefox"
or
mvn gauge:execute -DspecsDir=specs -Denv="ie"
```

Note:
* Gauge can also be used with other [build tools](https://docs.gauge.org/latest/configuration.html#build-tools).
* You can use Gauge even without a build script!

If you want to run with parallel, pass the parallel arguments 
```
mvn gauge:execute -Dtags="AllTest"  -DinParallel=true -Dnodes=2
```

If you want to run with tags, pass tag name in execute command
```
mvn gauge:execute -DspecsDir=specs -Dtags="AllLogin"
```



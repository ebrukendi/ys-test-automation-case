
Run with tag name => mvn gauge:execute -DspecsDir=specs -Dtags="AllLogin"

Run with firefox  => mvn gauge:execute -DspecsDir=specs -Denv="firefox" 

Run parallel => mvn gauge:execute -Dtags="AllTest"  -DinParallel=true -Dnodes=2



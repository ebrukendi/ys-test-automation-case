
Run with tag name => mvn gauge:execute -DspecsDir=specs -Dtags="AllLogin"

Run with firefox  => mvn gauge:execute -DspecsDir=specs -Denv="firefox" 

Run parallel => mvn gauge:execute -DspecsDir=specs -DinParallel=true -Dnodes=2

mvn gauge:execute -Dtags="SucCase" -Denv="edge" -DinParallel=true -Dnodes=2

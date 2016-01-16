#!/bin/bash

cd ui
echo '------------ NPM Install ------------'
pwd

#npm cache clean
HOME=../../../users/cdnicoll npm install

echo '------------ bower install ------------'
bower install

echo '------------ Grunt Force ------------'
grunt --force

echo '------------ SBT Setup ------------'
#sudo -u ubuntu rm -rf /home/ubuntu/.sbt/0.13/staging/
sbt clean compile
sbt stage


# copy the jar

#chown the jar to www-data:www-data

#chmod 0644 the jar.  (-rw-r--r--)

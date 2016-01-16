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

# copy the jar

#chown the jar to www-data:www-data

#chmod 0644 the jar.  (-rw-r--r--)

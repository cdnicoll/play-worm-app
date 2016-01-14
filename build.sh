#!/bin/bash

cd ui
echo '------------ NPM Install ------------'
npm install

echo '------------ bower install ------------'
bower install

echo '------------ Grunt Force ------------'
grunt --force

echo '------------ Grunt ------------'
grunt

echo '------------ Setting up Symlinks ------------'
cd ..
ln -s ../../ui/dist/js/ public/javascripts/
ln -s ../../ui/dist/styles/ public/stylesheets/

# copy the jar

#chown the jar to www-data:www-data

#chmod 0644 the jar.  (-rw-r--r--)

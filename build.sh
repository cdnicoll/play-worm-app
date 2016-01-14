#!/bin/bash
npm install
bower install
grunt --force
grunt

# copy the jar

#chown the jar to www-data:www-data

#chmod 0644 the jar.  (-rw-r--r--)
#!/bin/bash

set CLASSPATH ".:lib/antlr-4.5.3-complete.jar"
java -Xmx500M -cp $CLASSPATH org.antlr.v4.Tool SRL.g -o src/main/java/com/github/simpleregex/parser -package com.github.simpleregex.parser -visitor -no-listener

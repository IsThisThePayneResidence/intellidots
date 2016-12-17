#!/usr/bin/env bash

DIRECTORY=$1
FILE=$2
INPUT=$3

cd $DIRECTORY
javac $FILE.java
java $FILE
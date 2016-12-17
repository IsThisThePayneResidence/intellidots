#!/usr/bin/env bash

DIRECTORY=$1
FILE=$2

cd $DIRECTORY
g++ $FILE.cpp -o $FILE
./$FILE
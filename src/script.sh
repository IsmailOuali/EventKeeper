#!/bin/bash
gi 
find . -name "*.class" -type f -delete

javac Main.java
java Main.java

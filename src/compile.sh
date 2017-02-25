#!/usr/bin/env bash

java -jar /usr/local/lib/antlr-4.6-complete.jar Kharazmi.g4
javac Kharazmi*.java
java org.antlr.v4.gui.TestRig Kharazmi prog -gui source.kh
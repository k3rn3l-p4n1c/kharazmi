rm *.j
javac Test.java
for i in *.class; do
    java -jar classfileanalyzer.jar "${i}" > "${i}.j"
done
rm *.class
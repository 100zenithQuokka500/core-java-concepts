## How to create jar file ?
First complie the class of which you want to make jar file of then
go where your test class is then create a classes folder and create folder org inside it and folder example inside org .
Follow how your test class is in package.hen open he command line by clicking on the address bar
and writing cm enter to open the command prompt then write.
```
jar cvf jarFile name .
```
```
jar cvf Test.jar .
```
jar is now created and now to execute the jar we write
```
java -cp jarFileName classNameAlongWithPackage
```

```
java -cp Test.jar org.example.Test
```
we will get the output.
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

## Interface 
interface has methods which are abstract and classes implement it. it provides 100% abstraction.it is used in design patterns 
to help define a clear contract and how different components should interact with each other.they define a common set of methods that multiple classes must implement.
it also allows multiple inheritance.

## Abstraction
it separates interface from its implementation. it focuses on important characteristics of object hiding the underlyng details that are not relevan to the user.t simplifies  the complexity and promotes reusablity of code.


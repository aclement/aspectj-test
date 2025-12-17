# Simple maven project to test AspectJ

### `mvn clean package`
This should build the project and you should see one weaving message indicating advice was applied:

```
...
[INFO] --- aspectj:1.15.0:compile (default) @ aspectj-test ---
[INFO] Showing AJC message detail for messages of types: [error, warning, fail]
[INFO] Join point 'method-execution(void org.aclement.Run.main(java.lang.String[]))' in Type 'org.aclement.Run' (Run.java:5) advised by afterReturning advice from 'org.aclement.Azpect' (Azpect.java:5)
[INFO] 
...
```


### `mvn exec:java`
This should show the `hello` message from the main class and `world` being
supplied by the advice:

```
...
[INFO] --- exec:1.4.0:java (default-cli) @ aspectj-test ---
hello
world
...
```

To try a different version of Aspectj, adjust `aspectj.version` property in the `pom.xml`


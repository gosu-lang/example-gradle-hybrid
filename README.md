# example-gradle-hybrid
Example usage of the Gosu plugin for Gradle - Gosu classes may depend on Java classes

## Build configuration
There are some noticeable differences between usage of the plugin compared to a typical Java project:
  1. The Gosu plugin must be explicitly applied, but it will automatically apply the Java plugin
  2. A compile dependency on `org.gosu-lang.gosu:gosu-core-api` must be specified
  3. `compileGosu` and `compileTestGosu` tasks are automatically added to the build

**Important note:** This example compiles Java sources (if present) followed by Gosu sources. This configuration closure adds the output of the Java compilation task to the classpath of the Gosu compilation task; in other words, Gosu classes in the same module can reference Java classes, implement an interface, etc.
```
compileGosu {
    classpath = tasks.getByName('compileJava').outputs.files + classpath
}
```

## Usage/Outcome
Executing `$ ./gradlew clean test` should produce the following output:
```
:clean
:compileJava
:compileGosu
:processResources UP-TO-DATE
:classes
:compileTestJava
:compileTestGosu
:processTestResources UP-TO-DATE
:testClasses
:test

BUILD SUCCESSFUL

```

A HTML record of the test results will be available at `build/reports/tests/index.html`

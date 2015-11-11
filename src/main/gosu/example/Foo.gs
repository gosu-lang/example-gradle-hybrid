package example

uses example.Bar

public class Foo implements Bar {

  override function doSomething(arg : String) : String {
    return "Hello, got the argument '${arg}'"
  }

}
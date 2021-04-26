object MyTestObject extends App{
  MyTestClass.sayHello();

  object Operator{
    def fun[T](n1: T, n2: T)(f: (T,T) => T): T = f(n1,n2)
  }
}


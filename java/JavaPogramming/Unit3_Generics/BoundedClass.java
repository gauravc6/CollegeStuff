class Bound<T extends Test&Take>
{
  T obj;
  Bound(T obj){
    this.obj = obj;
  }
  public void runTest(){
    this.obj.dispClass();
  }
}

interface Take{
  public void dispClass();
}

class Test implements Take{
  public void dispClass(){
    System.out.println("Inside Test class!");
  }
}

class BoundedClass{
  public static void main(String[] args) {
    Bound<Test> t = new Bound<Test>(new Test());
    t.runTest();
  }
}

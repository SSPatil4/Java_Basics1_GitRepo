package pack1;

//public class A
//{
//   private int x = 50;         //this is public access modifier
//    protected int y = 100;   // this is protected access modifier
//    int z = 200;   // this is default access modifier
//    protected void add(){
//        System.out.println("protected add meth of class A");
//    }
//    void sub(){
//        System.out.println("protected sub meth of class A");
//    }
//
//}

//class X
//{
//    protected int i = 1201;
//
//    void methodOfX()
//    {
//        System.out.println(i);
//    }
//}
public class A {
        private void add(){
            System.out.println("private void");
        }
        protected void addition(){
            System.out.println("protected addition");
        }
        public void sub(){
            System.out.println("public sub");
        }
        void subtraction(){
            System.out.println("default subtraction");
        }
    }



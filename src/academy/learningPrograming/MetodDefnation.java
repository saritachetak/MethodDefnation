package academy.learningPrograming;

 class MethodDefnation{
    public static void main(String[] args) {
        int result;
        MethodDefinition myMethodDefinition = new MethodDefinition();


        result = myMethodDefinition.mySum(1,2);
//        myMethodDefinition.mySum();

        System.out.println(result);

        String myString = "Bala Jakka";
        String myAnotherString = new String("Bala Jakka");
        myString.toUpperCase();
        System.out.println(myString);
        myString = myString.toUpperCase();
        System.out.println(myString);
        System.out.println(myString.equals(myAnotherString));
        System.out.println(myString.equalsIgnoreCase(myAnotherString));
        System.out.println(myString==myAnotherString);

    }

    public int mySum(int a, int b){

        int c = a+b;
        return c;
    }

    public String abcd(){
        System.out.println("sdlfkjsdflk");
        return "aslfkjsdl";
    }

    public void abc(){
        System.out.println("I am void method");
    };


    public int mySum(int a, int b,int c){

        return a+b+c;
    }

    public int mySum(int a, int b, int c, int d){

        return a+b+c+d;
    }
    }


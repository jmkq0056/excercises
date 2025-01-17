package session5.C_generics;


public class DemoStackWithoutGenerics {

    public static void main(String[] args) {

        StackWithoutGenerics giraffeStack = new StackWithoutGenerics();

        Giraffe giraffe1 = new Giraffe();

        giraffeStack.push(giraffe1);

        Giraffe giraffe2 = (Giraffe) giraffeStack.pop();

        Book book = new Book();

        giraffeStack.push(book);

        //Giraffe giraffe3 = (Giraffe) giraffeStack.pop();


        Book book2 = (Book) giraffeStack.pop();
    }

}

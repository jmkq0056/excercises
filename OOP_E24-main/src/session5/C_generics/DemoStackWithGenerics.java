package session5.C_generics;


public class DemoStackWithGenerics {

    public static void main(String[] args) {

        StackWithGenerics<Giraffe> giraffeStack = new StackWithGenerics<>();

        Giraffe giraffe1 = new Giraffe();

        giraffeStack.push(giraffe1);

        Giraffe giraffe2 = giraffeStack.pop();

        Book book = new Book();

        //giraffeStack.push(book);

        //Book book2 = stack.pop();

        StackWithGenerics<Book> bookStack = new StackWithGenerics<>();


    }

}

import java.util.Arrays;

/**
 * Created on 11/12/15.
 */
public class Main {
    public static void main(String[] args) {



        CreationInfo ci = MyAnotatedClass.class.getAnnotation(CreationInfo.class);

        if (ci != null) {
            printCreationInfo(ci);
        }

    }


    private static void printCreationInfo(CreationInfo creationInfo){
        System.out.println("author: "+creationInfo.author());
        System.out.println("description: "+creationInfo.description());
        System.out.println("tags: "+ Arrays.toString(creationInfo.tags()));
        System.out.println("Baseclass: "+ creationInfo.baseclass());
        System.out.println("Interfaces : "+ Arrays.toString(creationInfo.interfaces()));
    }
}

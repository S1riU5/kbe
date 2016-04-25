import java.io.Serializable;

/**
 * Created on 11/12/15.
 */
@CreationInfo(description = "Im a cool Anotation",
        tags = {
                "this is the first tag",
                "this is the second tag",
                "And finally the third tag"
        },
        baseclass = MySuperAnnotatedClass.class,
        interfaces = {
                Serializable.class,
                MyAnotationTestInterface.class
        })
public class MyAnotatedClass extends MySuperAnnotatedClass implements Serializable, MyAnotationTestInterface {

    public void foo() {
        System.out.println("fooooooooo");
    }
}

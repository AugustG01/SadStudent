public class Test {


    SadStudent student = new SadStudent();

    void go() {

        student.setName("August");
        System.out.println(student.getName());
        student.shoutLikeCrazy();

    }

    public static void main(String[] args) {
        new Test().go();
    }
}

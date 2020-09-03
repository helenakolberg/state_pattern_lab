public class Runner {
    public static void main(String[] args) {
        Kid kid1 = new Kid(1);
        System.out.println(kid1.eat());
        System.out.println(kid1.play());

        kid1.setAge(2);
        System.out.println(kid1.eat());
        System.out.println(kid1.play());

        kid1.setAge(3);
        System.out.println(kid1.eat());
        System.out.println(kid1.play());

    }

}

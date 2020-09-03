public class Kid {

    private int age;
    private KidState kidState;

    public Kid(int age) {
        this.setAge(age);
    }

    public void setAge(int age) {
        if (age == 1) {
            kidState = new FirstYearKid();
        } else if (age == 2) {
            kidState = new SecondYearKid();
        } else if (age == 3) {
            kidState = new ThirdYearKid();
        } else {
            kidState = new FirstYearKid();
        }
    }

    public String eat() {
        return kidState.eat();
    }

    public String play() {
        return kidState.play();
    }

}

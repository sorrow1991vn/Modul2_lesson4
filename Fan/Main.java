package Lesson4.Fan;

public class Main {
    public static void main(String[] args) {
        Fan speedFan = new Fan();
        Fan fan1 = new Fan(speedFan.FAST, 10,"yellow",true);
        Fan fan2 = new Fan(speedFan.MEDIUM, 5,"blue",false);
        System.out.printf("%s", fan1);
        System.out.printf("\n%s", fan2);
    }
}

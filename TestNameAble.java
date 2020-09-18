package Name;

public class TestNameAble {
    public static void main(String[] args) {
        NameAble ferrari = new Car("Ferrari Super GT", 2025);
        System.out.println(ferrari.getName());
        ferrari = new Building("Ferrari World in Abu Dhabi", "GZ Corparation");
        System.out.println(ferrari.getName());
    }
}

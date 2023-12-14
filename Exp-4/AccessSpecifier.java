// WAP to understand private members are not accessible in sub class,
// but protected members are available in sub class.

class Engineering {
    private String syllabus = "Overflow!";
    protected int attendance = 100;
}

class Me extends Engineering {
    void display() {
        // System.out.println("Syllabus is: " + syllabus);
        System.out.println("Attendance is: " + attendance);
        
    }
}

public class AccessSpecifier {
    public static void main(String[] args) {
        Me m = new Me();
        m.display();
    }
}

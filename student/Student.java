package student;

public class Student {
    int a, b, c, d, e;

    public Student(int a1, int b1, int c1, int d1, int e1) {
        this.a = a1;
        this.b = b1;
        this.c = c1;
        this.d = d1;
        this.e = e1;
    }

    public int totalMarks() {
        return a + b + c + d + e;
    }

    public double percentage() {
        return totalMarks() / 5.0;
    }

    public char grade() {
        double p = percentage();

        if (p >= 90)
            return 'A';
        else if (p >= 75)
            return 'B';
        else if (p >= 60)
            return 'C';
        else if (p >= 50)
            return 'D';
        else
            return 'F';
    }
}
package Quiz3.M2;

public class M2_1_Students {
    private String stName;
    private int stGrade;

    public M2_1_Students(String name) {
        this.stName = name;
        this.stGrade = -1;
    }

    public void setStGrade(int stGrade) {
        this.stGrade = stGrade;
    }

    public int getStGrade() {
        return stGrade;
    }

    public void displayInfo() {
        System.out.println("==========M_1================");
        System.out.println("Student Name: " + stName);
        if (stGrade >= 0 && stGrade <= 100) {
            System.out.println("Student Grade: " + getStGrade());
        } else {
            System.out.println("Yanlış qiymət!");

        }
        System.out.println("==========M_1================");

    }


}



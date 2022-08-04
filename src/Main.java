import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        DBLogic db = new DBLogic();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number Insert=1; Delete=2; Update=3; Select=4");
        int Darbiba  = scan.nextInt();

        switch (Darbiba) {
            case 1:
                db.getInsert();
                break;
            case 2:
                db.getDelete();
                break;
            case 3:
                db.getUpdate();
                break;
            case 4:
                db.getSelect();
                break;

        }

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("mời bạn nhập tên : ");

        String name = sc.nextLine();

        System.out.println("Mời bạn nhập tuổi : ");

        int old = sc.nextInt();

        sc.nextLine();
        System.out.println("Mời bạn nhập quê quán : ");

        String add = sc.nextLine();

        System.out.printf("chào bạn %s, Tuổi %d, Quê quán %s ", name,old,add);

    }
}

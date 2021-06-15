import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Validate validate1=new Validate();
        Input input=new Input();
        Scanner scanner=new Scanner(System.in);
        Manage manage=new Manage();
        while (true){
            System.out.println("Menu");
            System.out.println("1. Thêm ");
            System.out.println("2. Sửa");
            System.out.println("3. Xóa");
            System.out.println("4. Hiển thị");
            System.out.println("5. Tìm kiếm theo số điện thoại");
            System.out.println("6. Tìm kiếm theo tên");
            System.out.println("0. Thoát");
            int number=scanner.nextInt();
            switch (number){
                case 1:
                    manage.add(input.inputNew());

                    break;
                case 2:
                    try {
                        System.out.println("Nhập số điệt thoại tìm kiếm");
                        int phone=scanner.nextInt();
                        manage.edit(phone, input.inputNew());

                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Nhập số điệt thoại");
                        int phoneRemove=scanner.nextInt();
                        manage.remove(phoneRemove);

                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    manage.show();
                    break;
                case 5:
                    try {
                        System.out.println("Nhập số điệt thoại");
                        int phoneReach=scanner.nextInt();
                        manage.searchNumberPhone(phoneReach);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        System.out.println("Nhập tên");
                        String name=scanner.nextLine();
                        manage.searchName(name);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                   break;
                case 0:
                    System.exit(0);

            }
        }
    }
}

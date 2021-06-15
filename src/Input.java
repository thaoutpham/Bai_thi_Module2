import java.util.Scanner;

public class Input {
    public QLDB inputNew() {
        Scanner scanner = new Scanner(System.in);
        Validate validate = new Validate();
        boolean check = true;
        String numberPhone="";
        while (check) {
            try {
                System.out.println("Nhập số điện thoại");
                 numberPhone = scanner.nextLine();
                if (validate.validatePhone(numberPhone)) {
                    check = false;
                } else {
                    System.out.println("Nhập lỗi");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println("Nhập nhóm danh bạ");
        String contactGroup=scanner.nextLine();
        System.out.println("Nhập tên");
        String name=scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender=scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address=scanner.nextLine();
        check=true;
        String date="";
        while (check) {
            try {
                System.out.println("Nhập ngày sinh");
                 date=scanner.nextLine();
                if(validate.validateDate(date)){
                    check=false;
                }else {
                    System.out.println("Nhập lỗi");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        check=true;
        String email="";
        while (check) {
            try {
                System.out.println("Nhập email");
                email = scanner.nextLine();
                if(validate.validateEmail(email)){
                    check=false;
                }else {
                    System.out.println("Nhập Lỗi");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
        return new QLDB(Integer.parseInt(numberPhone),contactGroup,name,gender,address,date,email);
    }
}

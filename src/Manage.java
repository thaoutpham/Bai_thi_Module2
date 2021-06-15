import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manage {
    private List<QLDB> qldbList;

    public Manage() {
        this.qldbList = new ArrayList<>();
    }

    public void show() {
        this.qldbList.forEach(qldb -> System.out.println(qldb.toString()));
    }

    public int findNumber(int numberPhone) {
        for (int i = 0; i < qldbList.size(); i++) {
            if (qldbList.get(i).getNumberPhone() == numberPhone) {
                return i;
            }
        }
        return -1;
    }
    public int findName(String name) {
        for (int i = 0; i < qldbList.size(); i++) {
            if (qldbList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public void searchNumberPhone(int numberPhone){
        if(findNumber(numberPhone)==-1){
            System.out.println("Số điện thoại không tồn tại");
        }else {
            System.out.println(qldbList.get(findNumber(numberPhone)));
        }
    }
    public void searchName(String name){
        if(findName(name)==-1){
            System.out.println("Tên không tồn tại");
        }else {
            System.out.println(qldbList.get(findName(name)));
        }
    }
    public void add(QLDB qldb){
        this.qldbList.add(qldb);
        System.out.println("Thêm thành công");
    }
    public void remove(int numberPhone){
        if(findNumber(numberPhone)==-1){
            System.out.println("Số điện thoại không tồn tại");
        }else {
            System.out.println("Bạn có đồng ý xóa số điện thoại: "+numberPhone);
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Đồng ý thì nhấn Y còn không thì nhấn bất kì khác Y để thoát");
                String checkNumber = sc.nextLine();
                if (checkNumber.equals("y")) {
                    remove(findNumber(numberPhone));
                    System.out.println("Xóa thành công");
                } else {
                    System.out.println("Thoát");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public void edit(int numberPhone,QLDB qldb){
        if(findNumber(numberPhone)==-1){
            System.out.println("Số điện thoại không tồn tại");
        }else {
            qldbList.set(findNumber(numberPhone),qldb);
            System.out.println("Sửa thành công");
        }
    }
}

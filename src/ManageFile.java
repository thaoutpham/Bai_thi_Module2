import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManageFile {
    public void writeFile(List<QLDB> qldbList) throws IOException {
        FileWriter fileWriter = new FileWriter("DataQLDB.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "";
        for (int i = 0; i < qldbList.size(); i++) {
            str += qldbList.get(i).getNumberPhone() + "," + qldbList.get(i).getContactGroup() + "," + qldbList.get(i).getName() + "," + qldbList.get(i).getGender() + "," + qldbList.get(i).getAddress() + "," + qldbList.get(i).getDate() + "," + qldbList.get(i).getEmail() + "\n";
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
    }

    public void readFile() throws IOException {
        List<QLDB> list = new ArrayList<>();
        FileReader fileReader = new FileReader("DataQLDB.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String value[] = line.split(",");
            list.add(new QLDB(Integer.parseInt(value[0]),value[1],value[2],value[3],value[4],value[5],value[6]));
        }
list.forEach(qldb -> System.out.println(qldb.toString()));
    }
}

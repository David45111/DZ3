import java.io.IOException;
import java.util.HashMap;
public class Program {
    public static void main(String[] args) {
        ParsD parsData = new ParsD(); 
        String newFileName = null; 
        File writeFile = new File(); 

        HashMap<String, Object> data = parsData.parsInputData();
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = parsData.parsInputData();
            }
        } 

        newFileName = data.get("lastName") + ".txt"; 
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath); 

    }
}


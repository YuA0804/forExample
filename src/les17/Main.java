package les17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        String read = "";
        try {
            in = new FileInputStream("file_1.txt");
            out = new FileOutputStream("file_2.txt");
            int tmp;
            while ((tmp = in.read()) != -1) {
                read += (char) tmp;
                System.out.println(read);
                if (tmp != 38) {
                    out.write(tmp);
                }
                if (tmp == 58 || tmp == 29) {
                    in.skip(tmp);
                } else {
                    out.write(tmp);
                }
            }


        } catch (
                IOException e) {
            e.printStackTrace();
        }

/*
        public class PracticFile {
            String[] splitedLines = file.split("\\r?\\n");
                    for(
            int i = 0;
            i<splitedLines.length;i++)

            {
                String[] splitedNumbers = splitedLines[i].split("\\s+");
                int multpResult = 1;
                for (int l = 1; l < splitedNumbers.length; l++) {
                    multpResult = multpResult * Integer.parseInt(splitedNumbers[l]);
                }
                if (multpResult % 3 == 0) {
                    byte[] lineIndex = (splitedNumbers[0] + " ").getBytes();
                    byte[] b = Integer.toString(multpResult).getBytes();
                    out.write(lineIndex);
                    out.write(b);
                    out.write(10);
                    System.out.println(multpResult);
                }
            }

        } catch(IOException e){
            e.printStackTrace();
        } finally{
            in.close();
            out.close();
        }
    }
}*/
    }
            }

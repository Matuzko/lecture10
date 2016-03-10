package lecture10;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try{
            bufferedReader = new BufferedReader(new FileReader("src/lecture10/input.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("src/lecture10/output.txt"));

            String s = bufferedReader.readLine();
            bufferedWriter.write(Caesar.fromNormalToCaesar(s));

        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        } finally {
            if (bufferedWriter != null){
                bufferedWriter.close();
            }
            if (bufferedReader != null){
                bufferedReader.close();
            }
        }
    }
}

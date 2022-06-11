import java.io.*;
class A {
    
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        FileOutputStream fos = new FileOutputStream("t2.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        System.out.print("Enter your name: ");
        String s=br.readLine();

        byte b[] = s.getBytes();
        bos.write(b);

        bos.close();
        fos.close();
        br.close();
        isr.close();    
    }
}

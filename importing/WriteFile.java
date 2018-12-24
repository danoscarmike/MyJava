import java.io.*;

class WriteFile {
    public static void main(String[] args) {  
        try {
            FileWriter file = new FileWriter("island.txt");
            BufferedWriter buffer = new BufferedWriter(file);
            buffer.write("They say the skys of Lebanon are burning");
            buffer.newLine();
            buffer.write("Those mighty cedars bleeding in the heat");
            buffer.newLine();
            buffer.write("They're showing pictures on the television");
            buffer.newLine();
            buffer.write("Of women and children dying in the street");
            buffer.close();
        }
        catch(IOException e) {System.out.println("Write error.");}
    }
}
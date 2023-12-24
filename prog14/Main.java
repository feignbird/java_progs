
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class Main {
    public static void println(String s){
        System.out.println(s);
    }
    public static void print(String s){
        System.out.print(s);
    }

    public static void writeToFile(String filePath, byte[] b) throws IOException {
        try {
            Files.write(Path.of(filePath), b);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static int getRandomInt(int min, int max){
        return (int)(Math.random()*(double)(max-min)+(double)min);
    }

    public static void appendToFile(String filePath, byte[] b) throws IOException {
        try {
            Files.write(Path.of(filePath), b, StandardOpenOption.APPEND);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void createBMPImage(String filePath, int width, int height) throws IOException{
        try{
            int rowSize = (width * 3 + 3) & ~3; // Each row is a multiple of 4 bytes

            // BMP File Header (size: 14 bytes)
            ByteBuffer fileHeader = ByteBuffer.allocate(14).order(ByteOrder.LITTLE_ENDIAN);

            // File Type (type: BM)
            fileHeader.put((byte) 'B').put((byte) 'M');
            
            /*
            File Size (14 File Header (Giving file metadata) + 
                40 Image Header (Giving Image metadata) + 
                Image Matrix (width*height pixels) *
                each Pixel with 3 bytes (Red (0-255), Green (0-255), Blue (0-255)))
            */
            fileHeader.putInt(14 + 40 + width*height*3);

            // Reserved
            fileHeader.putShort((short) 0); // Reserved1
            fileHeader.putShort((short) 0); // Reserved2

            // DataOffset (How much futher away is image matrix)
            fileHeader.putInt(14+40);

            // BMP Image Header (size: 40 bytes)
            ByteBuffer imageHeader = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
            imageHeader.putInt(40); // Header size
            imageHeader.putInt(width); // Image width
            imageHeader.putInt(height); // Image height
            imageHeader.putShort((short) 1); // Planes (must be 1)
            imageHeader.putShort((short) 24); // Bits per pixel (24 bits for RGB)
            imageHeader.putInt(0); // Compression method (0 for uncompressed)
            imageHeader.putInt(width * height * 3); // Image size (width * height * 3 for RGB)
            imageHeader.putInt(2835); // X pixels per meter
            imageHeader.putInt(2835); // Y pixels per meter
            imageHeader.putInt(0); // Colors used (0 for maximum)
            imageHeader.putInt(0); // Important colors (usually 0)

            // Combine file header, image header, and pixel data
            ByteBuffer bmpData = ByteBuffer.allocate(14 + 40 + width * height * 3).order(ByteOrder.LITTLE_ENDIAN);
            bmpData.put(fileHeader.array());
            bmpData.put(imageHeader.array());

            // Pixel data (for simplicity, setting all pixels to red)
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    bmpData.put((byte) getRandomInt(0, x%255)); // Blue
                    bmpData.put((byte) getRandomInt(0, x%255)); // Green
                    bmpData.put((byte) getRandomInt(0, x%255)); // Red
                }

                // Padding to make each row a multiple of 4 bytes
                for (int p = 0; p < (rowSize - width * 3); p++) {
                    bmpData.put((byte) 0);
                }
            }

            // Writing the bytes to the file
            Files.write(Path.of(filePath), bmpData.array(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            println("Please Check you image at " + filePath);

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        println("Yes, I'm in;");
        // Path myPath = Path.of(".", "sample.txt");
        // println("Path : "+ myPath.toString());
        try {
            writeToFile("./sample.txt", "Hello world, I have written in a file, 1st time\n".getBytes());
            appendToFile("./sample.txt", "Next sequence of chars !!! ".getBytes());
            println("Written to the file, Yohoo!!");
        } catch(IOException e){
            e.printStackTrace();
        }

        try {
            createBMPImage("./sample.bmp", 1920, 1080);
            // writeToFile("./sample.txt", "00000000".getBytes());
            // appendToFile("./sample.txt", "Next sequence of chars !!! ".getBytes());
            // println("Written to the file, Yohoo!!");
            // Files.delete(Path.of("./sample.bmp"));
        } catch(IOException e){
            e.printStackTrace();
        }

        // println(""+);

    }
}

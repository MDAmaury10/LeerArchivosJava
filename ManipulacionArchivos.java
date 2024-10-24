package ManipulaciondeArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManipulacionArchivos {

    public static void leerArchivo(String fileName) {
        File file;
        FileReader reader;
        BufferedReader buffer;
        String line;   

        try {
            //crear un apuntador con un archivo fisico
            file = new File("c:\\archivos\\" + fileName + ".txt");
            //abrir el archivo para la lectura
            reader = new FileReader(file);
            //confugurar el buffer para leer del archivo
            buffer = new BufferedReader(reader);
            while ((line = buffer.readLine()) !=null ) {
                System.out.println("Linea leida: " + line);                
            }
            reader.close();
        }catch (Exception e){
            System.out.println("Error al leer el archivo: " + e.toString());
        }
    }


    public static void main (String[] args ) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        System.out.println("Lectura de archivos de texto");
        System.out.println("Escribe el nombre del archivo: ");
        fileName = bufer.readLine();
        leerArchivo(fileName);
        
    }

}

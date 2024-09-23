package filebolemberek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import modell.Ember;


public class FilebolEmberek {

    
    public static void main(String[] args) throws IOException {
        //List<String> emberek = Files.readAllLines(Path.of("res\\emberek.csv"));
        
        InputStream filebolStream = FilebolEmberek.class.getClassLoader().getResourceAsStream("res\\emberek.csv");
        BufferedReader bufferOlvaso = new BufferedReader(new InputStreamReader(filebolStream));
        
        ArrayList<Ember> emberek = new ArrayList<>();
        
        String sor;
        bufferOlvaso.readLine();
        while((sor = bufferOlvaso.readLine()) != null){
            String[] s = sor.split(";");
            String nev = s[0];
            String cim = s[1];
            Ember ember = new Ember(s);
            emberek.add(ember);
        }
        
        for (Ember ember : emberek){
            System.out.println(ember);
        }
        
        System.out.println("Ki lakik Budapesten?");
        int i = 0;
        while (!emberek.get(i).getCim().equals("Budapest")){
            i++;
        }
        System.out.println(emberek.get(i).getNev());
    }
    
}

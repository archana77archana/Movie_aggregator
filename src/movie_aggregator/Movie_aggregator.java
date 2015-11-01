/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie_aggregator;


import java.util.*;
import java.io.*;

import java.io.FileOutputStream;
import java.io.IOException;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Casey
 */
public class Movie_aggregator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name, lang, genre, actor;
        int time, format;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Movie name: ");
        name = in.nextLine();
        
        System.out.println("Enter language: ");
        lang = in.nextLine();
        
        System.out.println("Enter actor: ");
        actor = in.nextLine();
        
        System.out.println("Enter genre: ");
        genre = in.nextLine();
        
        System.out.println("Enter runtime: ");
        time = in.nextInt();
        
        System.out.println("1. PDF Format 2. TXT format ");
        format = in.nextInt();
        
        switch(format)
        {
            case 1: Document doc = new Document();
            {
                try {
                    PdfWriter.getInstance(doc, new FileOutputStream("Movie Aggregator"));
                    
                    doc.open();
                    
                    doc.add(new Paragraph("Movie name: " +name));
                    doc.add(new Paragraph("Language: "+lang));
                    doc.add(new Paragraph("Genre: "+genre));
                    doc.add(new Paragraph("Actor: "+actor));
                    doc.add(new Paragraph("Run time: "+time));
                    
                    doc.close();
                    
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (DocumentException ex) {
                    ex.printStackTrace();
                }
            }
                
                break;
                
                case 2: try {
                    FileWriter writer = new FileWriter("Movie Aggregator.txt", true);
                   
                    writer.write("Movie name: " +name);
                    writer.write("Language: "+lang);
                    writer.write("Genre: "+genre);
                    writer.write("Actor: "+actor);
                    writer.write("Run time: "+time);
                
                    writer.close();
                }
                
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                
                break;
        }
    }
}
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_ex2p2_carlosbonilla;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lospe
 */
public class Archivos {
    File archivo;
    FileInputStream input;
    FileOutputStream output;
    ObjectOutputStream ob;
    ObjectInputStream obj;

    public void setarchivo(ArrayList<Carros> carros) throws IOException {
        try {
            archivo = new File("./carros.car");
            output = new FileOutputStream(archivo);
            ob = new ObjectOutputStream(output);
            ob.writeObject(carros);
            ob.flush();
            output.close();
            ob.close();
            
             
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public ArrayList<Carros> getarchivo() throws IOException{

        ArrayList<Carros> carros = new ArrayList();
        try {
            archivo = new File("./carros.car");
            input = new FileInputStream(archivo);
            obj = new ObjectInputStream(input);
            carros = (ArrayList<Carros>) obj.readObject();
            input.close();
            obj.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return carros;
    }
}

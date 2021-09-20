
package Taller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class File {
    private String url="usuarios.txt";  
    private DataOutputStream write;
    private DataInputStream read;
    Object[][] datos=new Object [100][10];
    public File(){
    read = null;
    write=null;
    }
    public Usuarios FileSearch(Usuarios cts) throws IOException{
    try {
    read = new DataInputStream( new FileInputStream(url));
    int id=0,tel=0;
    String nombre="",ap="",am="",direccion="",user="",password="",perfil="",estado="";
        while (true){
        id=read.readInt();
        nombre=read.readUTF();
        ap=read.readUTF();
        am=read.readUTF();
        perfil=read.readUTF();
        tel=read.readInt();
        direccion=read.readUTF();
        user=read.readUTF();
        password=read.readUTF();
        estado=read.readUTF();
            if (id==cts.getId()){
            cts.setId(id);
            cts.setNombre(nombre);
            cts.setAp(ap);
            cts.setAm(am);
            cts.setPerfil(perfil);
            cts.setTelefono(tel);
            cts.setDireccion(direccion);
            cts.setUsername(user);
            cts.setPassword(password);
            cts.setEstado(estado);
            return cts;
            }
        }
    } catch (FileNotFoundException ex) {
        }
    return cts;
}
    
    public boolean FileSearchAcceso(Usuarios cts)throws IOException{ 
    try {  
    read = new DataInputStream( new FileInputStream(url));
    int id=0,tel=0;
    String nombre="",ap="",am="",direccion="",user="",password="",perfil="",estado="";
        while (true){
        id=read.readInt();
        nombre=read.readUTF();
        ap=read.readUTF();
        am=read.readUTF();
        perfil=read.readUTF();
        tel=read.readInt();
        direccion=read.readUTF();
        user=read.readUTF();
        password=read.readUTF();
        estado=read.readUTF();
            if (cts.getUsername().equals(user) & cts.getPassword().equals(password)){ 
                return true;  
            }
        }
    } catch (FileNotFoundException ex) {
        }
    return false;
    }
    
    public void FileWrite(Usuarios cts) throws IOException {
        try {
        write = new DataOutputStream(new FileOutputStream(url,true));
        write.writeInt(cts.getId());
        write.writeUTF(cts.getNombre());
        write.writeUTF(cts.getAp());
        write.writeUTF(cts.getAm());
        write.writeUTF(cts.getPerfil());
        write.writeInt(cts.getTelefono());
        write.writeUTF(cts.getDireccion());
        write.writeUTF(cts.getUsername());
        write.writeUTF(cts.getPassword());
        write.writeUTF(cts.getEstado());
        write.close();
        } catch (FileNotFoundException ex) {
            }
    }
    
    public int FileMaxID() throws FileNotFoundException{
        int id=0,x=0;
        try{
            int tel=0;
            String nombre="",ap="",am="",direccion="",user="",password="",perfil="",estado="";
            read=new DataInputStream(new FileInputStream(url));
            while(true && read.available()!=0){
                id=read.readInt();
                nombre=read.readUTF();
                ap=read.readUTF();
                am=read.readUTF();
                perfil=read.readUTF();
                tel=read.readInt();
                direccion=read.readUTF();
                user=read.readUTF();
                password=read.readUTF();
                estado=read.readUTF();
                x++;
            }
        }catch(IOException ex){
            
        }
        return x+1;
    }
    
 
    public void FileEdit(Usuarios cts) throws IOException{
       int x=0,cont=0;
        try {
           read=new DataInputStream(new FileInputStream(url));
       } catch (FileNotFoundException ex) {} 
        
      try{
          while(true){
              datos[cont][0]=read.readInt();
              datos[cont][1]=read.readUTF();
              datos[cont][2]=read.readUTF();
              datos[cont][3]=read.readUTF();
              datos[cont][4]=read.readUTF();
              datos[cont][5]=read.readInt();
              datos[cont][6]=read.readUTF();
              datos[cont][7]=read.readUTF();
              datos[cont][8]=read.readUTF();
              datos[cont][9]=read.readUTF();
              cont++;
          }
      }  catch(IOException ex){
            System.out.println(ex.getMessage());
        }
      while(x<cont){
          if(Integer.parseInt(datos[x][0].toString())==cts.getId()){
              datos[x][1]=cts.getNombre();
              datos[x][2]=cts.getAp();
              datos[x][3]=cts.getAm();
              datos[x][4]=cts.getPerfil();
              datos[x][5]=cts.getTelefono();
              datos[x][6]=cts.getDireccion();
              datos[x][7]=cts.getUsername();
              datos[x][8]=cts.getPassword();
              datos[x][9]=cts.getEstado();
          }
          x++;
      }
      try{
          x=0;
           write = new DataOutputStream(new FileOutputStream(url));
           while(x<cont){
               try{
                   write.writeInt(Integer.parseInt(datos[x][0].toString()));
                   write.writeUTF(datos[x][1].toString());
                   write.writeUTF(datos[x][2].toString());
                   write.writeUTF(datos[x][3].toString());
                   write.writeUTF(datos[x][4].toString());
                   write.writeInt(Integer.parseInt(datos[x][5].toString()));
                   write.writeUTF(datos[x][6].toString());
                   write.writeUTF(datos[x][7].toString());
                   write.writeUTF(datos[x][8].toString());
                   write.writeUTF(datos[x][9].toString());
                   x++;
               }catch(IOException ex){}
           }
   
      }catch(IOException ex){}
      
    }
    
    
    public void FileDeleteDato(Usuarios cts){
          int x=0,cont=0;
        try {
           read=new DataInputStream(new FileInputStream(url));
       } catch (FileNotFoundException ex) {} 
        
      try{
          int id=0,ID=1;
          int tel=0;
          String nombre="",ap="",am="",direccion="",user="",password="",perfil="",estado="";
          while(true){              
        id=read.readInt();
        nombre=read.readUTF();
        ap=read.readUTF();
        am=read.readUTF();
        perfil=read.readUTF();
        tel=read.readInt();
        direccion=read.readUTF();
        user=read.readUTF();
        password=read.readUTF();
        estado=read.readUTF();
              
              if(id!=cts.getId()){
                    datos[cont][0]=ID;
                    datos[cont][1]=nombre;
                    datos[cont][2]=ap;
                    datos[cont][3]=am;
                    datos[cont][4]=perfil;
                    datos[cont][5]=tel;
                    datos[cont][6]=direccion;
                    datos[cont][7]=user;
                    datos[cont][8]=password;
                    datos[cont][9]=estado;
                    cont++; 
                    ID++;                    
              }
              if(id==cts.getId()){
                    datos[cont][0]=ID;
                    datos[cont][1]=nombre;
                    datos[cont][2]=ap;
                    datos[cont][3]=am;
                    datos[cont][4]=perfil;
                    datos[cont][5]=tel;
                    datos[cont][6]=direccion;
                    datos[cont][7]=user;
                    datos[cont][8]=password;
                    datos[cont][9]="Baja";
                    cont++; 
                    ID++;                    
              }
          }
      }  catch(IOException ex){
            System.out.println(ex.getMessage());
        }
      try{
           write = new DataOutputStream(new FileOutputStream(url));
           while(x<cont){
               try{
                   write.writeInt(Integer.parseInt(datos[x][0].toString()));
                   write.writeUTF(datos[x][1].toString());
                   write.writeUTF(datos[x][2].toString());
                   write.writeUTF(datos[x][3].toString());
                   write.writeUTF(datos[x][4].toString());
                   write.writeInt(Integer.parseInt(datos[x][5].toString()));
                   write.writeUTF(datos[x][6].toString());
                   write.writeUTF(datos[x][7].toString());
                   write.writeUTF(datos[x][8].toString());
                   write.writeUTF(datos[x][9].toString());
                   x++;
               }catch(IOException ex){}
           }
          
      }catch(IOException ex){}
    }
}

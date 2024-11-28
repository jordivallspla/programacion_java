package tema4_v13;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import tema4_v13.modules.users.classes.Admin;
import tema4_v13.modules.users.classes.Client;
import tema4_v13.modules.users.classes.Singleton;
import tema4_v13.modules.users.utils.CRUD.func_create;
import tema4_v13.modules.users.utils.CRUD.func_delete;
import tema4_v13.modules.users.utils.CRUD.func_read;

public class test {

    public static void main(String[] args) {

    	Singleton.array_admin = new ArrayList <Admin> ();
    	Singleton.array_client = new ArrayList <Client> ();
    	
    	func_create.crear_admin();
    	func_create.crear_client();
    	
    	func_read.read_admin();
    	func_read.read_client();
    	
    	func_delete.delete_admin();
    	func_delete.delete_client();
    	
      	func_read.read_admin();
    	func_read.read_client();

    }
}



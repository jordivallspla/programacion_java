package tema4_v13.utils;

import javax.swing.JOptionPane;

import tema4_v13.modules.cursos.classes.Desarrollo_web;
import tema4_v13.modules.cursos.classes.Singleton;
import tema4_v13.modules.cursos.classes.*;
import tema4_v13.modules.cursos.dummies.dummies;
import tema4_v13.modules.cursos.utils.CRUD.func_create;
import tema4_v13.modules.cursos.utils.CRUD.func_delete;
import tema4_v13.modules.cursos.utils.CRUD.func_read;
import tema4_v13.modules.cursos.utils.CRUD.func_readone;
import tema4_v13.modules.cursos.utils.CRUD.func_update;
import tema4_v13.modules.users.classes.Admin;
import tema4_v13.modules.users.classes.Client;
import tema4_v13.modules.users.classes.Singleton_users;
import tema4_v13.modules.users.utils.func_find;
import tema4_v13.modules.users.utils.func_users;
import tema4_v13.modules.users.utils.CRUD.func_create_users;
import tema4_v13.modules.users.utils.CRUD.func_delete_users;
import tema4_v13.modules.users.utils.CRUD.func_read_users;
import tema4_v13.modules.users.utils.CRUD.func_readone_users;
import tema4_v13.modules.users.utils.CRUD.func_updates_users;


public class func_main {
	public static String mostrarID() {
		Object ID_array = null;
		String[] recorrer_array = new String[Singleton.array_desarrollo.size()];
		 for (int i = 0; i < Singleton.array_desarrollo.size(); i++) {
	            Desarrollo_web obj = Singleton.array_desarrollo.get(i);
	            recorrer_array[i] = String.valueOf(obj.get_ID_course()); // Obtener solo el ID como String
	        }
		 ID_array = menus.combos("Selecciona la opción", "Manual o Automático",recorrer_array , recorrer_array[0]);
		 return ID_array.toString();
	}
	
	public static String mostrar_username_client() {
		Object username_array = null;
		String[] recorrer_array = new String[Singleton_users.array_client.size()];
		 for (int i = 0; i < Singleton_users.array_client.size(); i++) {
	            Client obj = Singleton_users.array_client.get(i);
	            recorrer_array[i] = String.valueOf(obj.get_username());
	      }
		 username_array =  menus.combos("Selecciona la opción", "Manual o Automático",recorrer_array , recorrer_array[0]);
		return username_array.toString();
	}
	
	public static String mostrar_username_admin() {
		Object username_array = null;
		String[] recorrer_array = new String[Singleton_users.array_admin.size()];
		 for (int i = 0; i < Singleton_users.array_admin.size(); i++) {
	            Admin obj = Singleton_users.array_admin.get(i);
	            recorrer_array[i] = String.valueOf(obj.get_username());
	      }
		 username_array =  menus.combos("Selecciona la opción", "Manual o Automático",recorrer_array , recorrer_array[0]);
		return username_array.toString();
	}
	
	public static void dummies() {
		Object manual_auto_menu = null;
		Object manual_auto[] = {"auto", "manual"};
		int n = 0;
		
		manual_auto_menu = menus.combos("Selecciona la opción", "Manual o Automático",manual_auto , manual_auto[0]);
		
		if (manual_auto_menu.toString() == "auto") {
			n = validadors.validar_int("Cuántos objetos quieres automáticos", "Repeticiones");
			for (int i = 0; i < n; i++) {
				dummies.crear_cursos();
			} // end for
		} // end if
	}
	
	public static void log_in() {
		Object primer_menu = null;
		Object opciones_pm[] = {"Client", "Admin", "Salir al menú anterior", "Salir"};
		int salir = 0;
		
		do {
			primer_menu = menus.combos("Selecciona la opción", "Log in", opciones_pm, opciones_pm[0]);
			switch (primer_menu.toString()) {
				case "Client":
					func_users. log_in_client();
					break;
				case "Admin":
					func_users. log_in_admin();
					break;
				case "Salir al menú anterior":
					salir = 3;
					break;
				case "Salir":
					System.exit(0);
					break;
			} // END SWITCH
		}while( salir != 3);
	}
	
	public static void sign_up() {
		Object primer_menu = null;
		Object opciones_pm[] = {"Client", "Admin", "Salir al menú anterior", "Salir"};
		int salir = 0;
		
		do {
			primer_menu = menus.combos("Selecciona la opción", "Sign up", opciones_pm, opciones_pm[0]);
			switch (primer_menu.toString()) {
				case "Client":
					func_create_users.crear_client();
					break;
				case "Admin":
					func_create_users.crear_admin();
					break;
				case "Salir al menú anterior":
					salir = 3;
					break;
				case "Salir":
					System.exit(0);
					break;
			} // END SWITCH
		}while( salir != 3);
	}
	
	public static void menu_cliente(Client username) {
		Object primer_menu = null;
		Object opciones_pm[] = {"Log out", "Leer Todos", "Leer Uno", "Perfil", "Salir"};
		int localizacion = -1;
		int salir = 0;
		do {
			primer_menu = menus.combos("Selecciona la opción", "App", opciones_pm, opciones_pm[0]);
			switch (primer_menu.toString()) {
				case "Log out":
					username.set_log(false);
					salir = 3;
					break;
				case "Leer Todos":
					func_main.leer_todos();
					break;
				case "Leer Uno":
					func_main.leer_uno();
					break;
				case "Perfil":
					func_main.perfil(username);
					localizacion =  func_find.find(username);
					if (localizacion == -1) {
						salir = 3;
					}				
					break;
				case "Salir":
					System.exit(0);
					break;
			} // END SWITCH
		}while( salir != 3);
	}
	
	public static void menu_admin(Admin username) {
		Object primer_menu = null;
		Object opciones_pm[] = {"Log out", "CURD cursos", "CRUD users", "Salir"};
		int salir = 0;
		
		do {
			primer_menu = menus.combos("Seleccions la opción", "App", opciones_pm, opciones_pm[0]);
			switch(primer_menu.toString()) {
			case "Log out":
				salir = 1;
				break;
			case "CURD cursos":
				func_main.CURD_cursos();
				break;
			case "CRUD users":
				func_main.CURD_users();
				break;
			case "Salir":
				System.exit(0);
				break;
			}
		}while(salir != 1);
	}
	
	public static void leer_todos() {
		Object primer_menu = null;
		Object opciones_pm[] = {"Desarrollo", "Diseno", "Desplegamiento", "Salir al menu anterior", "Salir"};
		int salir = 0;
		
		do {
			primer_menu = menus.combos("Selecciona la opción", "Leer Todos", opciones_pm, opciones_pm[0]);
			switch (primer_menu.toString()) {
				case "Desarrollo":
					func_read.read_desarrollo();
					break;
				case "Diseno":
					func_read.read_diseno();
					break;
				case "Desplegamiento":
					func_read.read_desplegamiento();
					break;
				case "Salir al menu anterior":
					salir = 1;
					break;
				case "Salir":
					System.exit(0);
					break;
			}// END SWITCH
		}while(salir !=1);
	}
	
	public static void leer_uno() {
		Object primer_menu = null;
		Object opciones_pm[] = {"Desarrollo", "Diseno", "Desplegamiento", "Salir al menu anterior", "Salir"};
		int salir = 0;
		
		do {
			primer_menu = menus.combos("Selecciona la opción", "Sign up", opciones_pm, opciones_pm[0]);
			switch (primer_menu.toString()) {
				case "Desarrollo":
					func_readone.read_one_desarrollo();
					break;
				case "Diseno":
					func_readone.read_one_diseno();
					break;
				case "Desplegamineto":
					func_readone.read_one_desplegamiento();
					break;
				case "Salir al menu anterior":
					salir = 1;
					break;
				case "Salir":
					System.exit(0);
					break;
			}// END SWITCH
		}while(salir !=1);
	}
	
	public static void perfil(Client username) {
		Object primer_menu = null;
		Object opciones_pm[] = {"Editar", "Ver Perfil", "Eliiminar Perfil", "Salir al menu anterior", "Salir"};
		int salir = 0;
		
		do {
			primer_menu = menus.combos("Selecciona la opción", "Perfil", opciones_pm, opciones_pm[0]);
			switch (primer_menu.toString()) {
				case "Editar":
					func_updates_users.update_client(username);
					break;
				case "Ver Perfil":
					func_read_users.read_cliente_perfil(username);
					break;
				case "Eliiminar Perfil":
					func_delete_users.delete_client_profile(username);
					salir = 1;
					break;
				case "Salir al menu anterior":
					salir = 1;
					break;
				case "Salir":
					System.exit(0);
					break;
			}// END SWITCH
		}while(salir !=1);
	}
	
	public static void CURD_cursos() {
		Object primer_menu = null;
		Object segundo_menu = null;
		Object tercer_menu = null;

		Object objetos[] =  {"Desarrollo web", "Diseño web", "Desplegament web", "Salir al menu anterior", "Salir"};
		Object op_CRUD[] = {"Create", "ReadAll", "ReadOne","Update","Delete", "Salir al menú princial" , "Salir"};
		Object op[] = {"Seguir", "Salir al menú principal", "Salir al menu anterior", "Salir"};
		
		int salir = 0;
		
		do {
			primer_menu = menus.combos("Selecciona el objeto", "Objeto", objetos, objetos[3]);
			
			switch(primer_menu.toString()) {
			case "Desarrollo web":
				do {
					segundo_menu = menus.combos("Selecciona la opción", "Selector de opciones", op_CRUD, op_CRUD[6]);
					switch(segundo_menu.toString()) {
					case "Create":
						do {
							func_create.crear_desarrollo();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "ReadAll":
						do {
							func_read.read_desarrollo();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "ReadOne":
						do {
							func_readone.read_one_desarrollo();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "Update":
						do {
							func_update.update_desarrollo(func_main.mostrarID());
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "Delete":
						do {
							func_delete.delete_desarrollo();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "Salir al menu principal":
						break;
					case "Salir":
						System.exit(0);
						break;
					} // end switch
					if (segundo_menu == op_CRUD[5]) {
						break;
					} // end if 
				}while(segundo_menu != op_CRUD[6]);
				break;
			case "Diseño web":
				do {
					segundo_menu = menus.combos("Selecciona la opción", "Selector de opciones", op_CRUD, op_CRUD[6]);
					switch(segundo_menu.toString()) {
					case "Create":
						do {
							func_create.crear_diseno();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "ReadAll":
						do {
							func_read.read_diseno();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "ReadOne":
						do {
							func_readone.read_one_diseno();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "Update":
						do {
							func_update.update_diseno();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "Delete":
						do {
							func_delete.delete_diseno();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "Salir al menu principal":
						break;
					case "Salir":
						System.exit(0);
						break;
					} // end switch
					if (segundo_menu == op_CRUD[5]) {
						break;
					} // end if 
				}while(segundo_menu != op_CRUD[6]);
				break;
			case "Desplegament web":
				do {
					segundo_menu = menus.combos("Selecciona la opción", "Selector de opciones", op_CRUD, op_CRUD[6]);
					switch(segundo_menu.toString()) {
					case "Create":
						do {
							func_create.crear_desplegamiento();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "ReadAll":
						do {
							func_read.read_desplegamiento();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "ReadOne":
						do {
							func_readone.read_one_desplegamiento();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "Update":
						do {
							func_update.update_desplegamiento();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "Delete":
						do {
							func_delete.delete_desplegamiento();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "Salir al menu principal":
						break;
					case "Salir":
						break;
					} // end switch
					if (segundo_menu == op_CRUD[5]) {
						break;
					} // end if 
				}while(segundo_menu != op_CRUD[6]);
				break;
			case "Salir al menu anterior":
				salir = 3;
				break;
			case "Salir":
				System.exit(0);
				break;
			} // end switch
		}while (salir != 3);
	}
	
	public static void CURD_users() {
		Object primer_menu = null;
		Object segundo_menu = null;
		Object tercer_menu = null;

		Object objetos[] =  {"Client", "Admin", "Salir al menu anterior","Salir"};
		Object op_CRUD[] = {"Create", "ReadAll", "ReadOne","Update","Delete", "Salir al menú princial" , "Salir"};
		Object op[] = {"Seguir", "Salir al menú principal", "Salir al menu anterior", "Salir"};
		
		int salir = 0;
		
		do {
			primer_menu = menus.combos("Selecciona el objeto", "Objeto", objetos, objetos[3]);
			switch(primer_menu.toString()) {
				case "Client":
					do {
						segundo_menu = menus.combos("Selecciona la opción", "Selector de opciones", op_CRUD, op_CRUD[6]);
						switch(segundo_menu.toString()) {
						case "Create":
							do {
								func_create_users.crear_client_CURD();
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "ReadAll":
							do {
								func_read_users.read_client();
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "ReadOne":
							do {
								func_readone_users.read_one_client();
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "Update":
							do {
								func_updates_users.update_client_CURD(func_main.mostrar_username_client());
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "Delete":
							do {
								//func_delete.delete_desarrollo();
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "Salir al menú princial":
							break;
						case "Salir":
							System.exit(0);
							break;
						} // end switch
						if (segundo_menu == op_CRUD[5]) {
							break;
						} // end if 
					}while(segundo_menu != op_CRUD[6]);
					break;
				case "Admin":
					do {
						segundo_menu = menus.combos("Selecciona la opción", "Selector de opciones", op_CRUD, op_CRUD[6]);
						switch(segundo_menu.toString()) {
						case "Create":
							do {
								//func_create.crear_desarrollo();
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "ReadAll":
							do {
								//func_read_users.read_client();
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "ReadOne":
							do {
								//func_readone.read_one_desarrollo();
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "Update":
							do {
								//func_update.update_desarrollo(func_main.mostrarID());
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "Delete":
							do {
								//func_delete.delete_desarrollo();
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "Salir al menú princial":
							salir = 1;
							break;
						case "Salir":
							System.exit(0);
							break;
						} // end switch
						if (segundo_menu == op_CRUD[5]) {
							break;
						} // end if 
					}while(segundo_menu != op_CRUD[6]);
					break;
			}
		}while(salir != 1);
	}
}
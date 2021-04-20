package Clases;

import java.io.Serializable;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;

public class ListaEmpleado implements Serializable {

	private LinkedList<Empleados>listEmpleado=new LinkedList<>();

	public ListaEmpleado() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodo para mostrar lista
	 * @author ACalix
	 * @since 24/Jul/2019
	 */
	public void imprimir() {
		System.out.println(listEmpleado);
	}
	/**
	 * Metodo para eliminar
	 * @author ACalix
	 * @since 24/Jul/2019
	 * @param posicion
	 * @return
	 */
	public boolean eliminarEmpleado(int posicion) {
		listEmpleado.remove(posicion);
		return true;
	}
	/**
	 * 
	 * @author 
	 * @since 
	 * @param idEmpleado
	 * @return posicion en la que se encuentra el empleado
	 */
	public int buscarporid(int posicion) {
		int indice=-1;
		int tam=this.listEmpleado.size();
        for(int i=0;i<tam;i++){
            if(listEmpleado.get(i).getId()==posicion){
                indice=i;
                break;
            }
        }
		return posicion;
	}
	/**
	 * Metodo para modificar empleados
	 * @author 
	 * @since 
	 * @param posicion
	 * @param Modificado
	 * @return
	 */
	public boolean modificarEmpleado(Empleados Modificado, int posicion) {
		listEmpleado.set(posicion, Modificado);
		return true;
	}
	/**
	 * Metodo para agregar empleados
	 * @author 
	 * @since 
	 * @param objeEmpleado
	 * @return
	 */
	public boolean agregarEmpleado(Empleados objeEmpleado) {
		listEmpleado.add(objeEmpleado);
		return true;
	}

	public Empleados get(int posicion) {
		return listEmpleado.get(posicion);
	}
        /**
         * Metodo para almacenar la informacion en la tabla
         * @since 
         * @author 
         * @return array
         */
         public Object[][] getArrayGestion(){
                int i, tamanioLista;
                tamanioLista=this.listEmpleado.size();
		Object [][] array=new Object[tamanioLista][6];
		for(i=0;i<tamanioLista;i++) { 
			array[i][0]=this.listEmpleado.get(i).getId();
                        array[i][1]=this.listEmpleado.get(i).getNombre();
                        array[i][2]=this.listEmpleado.get(i).getApellidos();
                        array[i][3]=this.listEmpleado.get(i).getEdad();
                        array[i][4]=this.listEmpleado.get(i).getDireccion();
                        array[i][5]=this.listEmpleado.get(i).getTelefono();
		}
                return array;
        }

	public String getInformacionGestion(){
                int i, tamanioLista;
                tamanioLista=this.listEmpleado.size();
		String retorno="";
		for(i=0;i<tamanioLista;i++) { 
			retorno+=this.listEmpleado.get(i).getId()+
                                " "+this.listEmpleado.get(i).getNombre()+
                                " "+this.listEmpleado.get(i).getApellidos()+
                                " "+this.listEmpleado.get(i).getDireccion()+
                                " "+this.listEmpleado.get(i).getEdad()+"\n";  
		}
                return retorno;
        }   
	 public DefaultComboBoxModel getComboboxModel(){
            int i, tamanioLista;
                tamanioLista=this.listEmpleado.size();
		DefaultComboBoxModel modelo=new DefaultComboBoxModel();
		for(i=0;i<tamanioLista;i++) { 
			modelo.addElement(this.listEmpleado.get(i).getNombre()+" "+this.listEmpleado.get(i).getApellidos());
		}
                return modelo;
        }

}


package Modelo;

public class AlumnoArreglo {
    private Alumno[] arreglo;
    private int indice;

    public AlumnoArreglo(int tamano) {
        this.arreglo = new Alumno[tamano];
        this.indice=0;
    }

    public AlumnoArreglo(){
        this(5);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < this.indice; i++ ){
            sb.append(this.arreglo[i]);
        }
        return sb.toString();
    }
    
    public boolean agregar(Alumno alumno){
        boolean result = false;
        if(this.indice<this.arreglo.length &&
                !existeCodigo(alumno.getCodigo())){
            this.arreglo[indice]= alumno;
            indice++;
            result= true;
        }
        return result;
    }
    
    private boolean existeCodigo(String codigo){
        boolean result = false;
        for(Alumno a:this.arreglo){
            if( a != null && a.getCodigo().equalsIgnoreCase(codigo) ){
                result = true;
                break;
            }
        }
        return result;
    }
    
    
    public boolean elimar(String codigo){
        boolean result = false;
        
        return result;
    }
    
    public Alumno Buscar(String codigo){
        Alumno result = null;
        
        return result;
    }
    
    public void  ordenarBurbuja(String codigo){ 
        
        int cod = Integer.valueOf(codigo);
        int arregloC[], aux;
        arregloC = new int[cod];
        
        for (int i = 1; i < (cod-1); i++ ){
            for (int j = 0; j < (cod-1); j++){
                if(arregloC[j] > arregloC[j+1]){
                    aux = arregloC[j];
                    arregloC[j] = arregloC[j+1];
                    arregloC[j+1] =  aux;
                }
            }
        }
    }
    
    public void  ordenarInserccion(String codigo){ 
        
        int cod = Integer.valueOf(codigo);
        int arregloC[], aux, pos;
        arregloC = new int[cod];
        
        for (int i = 1; i < (cod-1); i++ ){
            pos = i;
            aux = arregloC[i];
            
            while((pos > 0) && (arregloC[pos-1] > aux)){
                arregloC[pos] = arregloC[pos-1];
                pos--;
            }
            arregloC[pos] = aux;
        }
        
    }
    
    public void  ordenarSeleccion(){ 

    }
    
    public void crecer(){ // se encarga de crear un arreglo del doble tama??o, 
        // se debe pasar las referencias de los objetos del arreglo peque??o al nuevo
        // el atributo this.arreglo debe apuntar hacia el arreglo nuevo
    }
    
    
    
    
    
}

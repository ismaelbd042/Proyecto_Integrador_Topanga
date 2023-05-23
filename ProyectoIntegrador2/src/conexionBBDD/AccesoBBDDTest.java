package conexionBBDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vista.VentanaEditar;

class AccesoBBDDTest {
	
	// Variables para poder realizar los Test
	private VentanaEditar ventanaEditar;
	private static final String proyectoExistente = "topanga";
    private static final String proyectoNoExistente = "Cualquiera";
    private static final String nombreAlumno = "Lucca";
    private static final String apellidoAlumno = "Manfredotti";
    private static final String expedienteAlumno = "5643612";
    private static final String nombreNoAlumno = "";
    private static final String apellidoNoAlumno = "";
    private static final String expedienteNoAlumno = "";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//Comienzan las pruebas
		System.out.println("Comenzando Pruebas");
		System.out.println("*********************");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		//Terminan las pruebas
		System.out.println("Finalizando Pruebas");
		System.out.println("*********************");
	}

	@BeforeEach
	void setUp() throws Exception {
		//Creamos la ventana en esta clase
		ventanaEditar = new VentanaEditar();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testConseguirAreas() {
		//Creamos el arraylist y le metemos los datos que tendrian que estar en la base de datos
		ArrayList<String> areasEsperadas = new ArrayList<>();
        areasEsperadas.add("DAW");
        areasEsperadas.add("DAM");
        areasEsperadas.add("ASIR");
        areasEsperadas.add("A3D");
        areasEsperadas.add("VDJ");

        //Conseguimos lo que hay en la base de datos
        ArrayList<String> areasObtenidas = AccesoBBDD.conseguirAreas();

        //Comparamos lo anterior
        Assertions.assertEquals(areasEsperadas, areasObtenidas);
	}

	@Test
	void testCrearAlumno1() {
		//Te saldra una ventana de que el alumno ya esta creado(se crearia el alumno)
		AccesoBBDD.crearAlumno(nombreAlumno, apellidoAlumno, expedienteAlumno);
	}
	
	@Test
	void testCrearAlumno2() {
		//Te saldra una ventan de que no se pudo crear el alumno al no rellenar los campos(no se crea el alumno)
		AccesoBBDD.crearAlumno(nombreNoAlumno, apellidoNoAlumno, expedienteNoAlumno);
	}

	@Test
	void testRellenarDatosModificar1() {
		//Rellenamos los datos modificar con la variable creada arriba y lo cambiamos
		AccesoBBDD.rellenarDatosModificar(ventanaEditar, proyectoExistente);
	    Assertions.assertEquals(proyectoExistente, ventanaEditar.getNombre().getText());
	}
	
	@Test
	void testRellenarDatosModificar2() {
		//Dejamos en blanco los datos modificar con la variable creada arriba y no se cambia
		AccesoBBDD.rellenarDatosModificar(ventanaEditar, proyectoNoExistente);
		Assertions.assertEquals("", ventanaEditar.getNombre().getText());
	}
	

	@Test
    public void testConseguirNombresProyectos() {
		//Creamos el arraylist y le metemos los datos que tendrian que estar en la base de datos
		ArrayList<String> nombresProyectosEsperados = new ArrayList<>();
	    nombresProyectosEsperados.add("topanga");
	    nombresProyectosEsperados.add("PMG");
	     
	    //Conseguimos lo que hay en la base de datos
	    ArrayList<String> nombresProyectosObtenidos = AccesoBBDD.conseguirNombresProyectos();
	     
	    //Comparamos lo anterior
	    Assertions.assertEquals(nombresProyectosEsperados, nombresProyectosObtenidos);
    }

}

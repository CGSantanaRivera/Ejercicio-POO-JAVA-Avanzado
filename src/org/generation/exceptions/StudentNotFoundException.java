package org.generation.exceptions;

public class StudentNotFoundException extends Exception {

	public StudentNotFoundException(String message ) {
	    super( "Curso no encontrado! [" + message + "]" );
	}
}//class StudentNotFoundException
package org.generation.exceptions;

public class CourseNotFoundException extends Exception {

    public CourseNotFoundException(String message) {
        super( "Curso no encontrado! [" + message + "]" );
    }
}//class CourseNotFoundException
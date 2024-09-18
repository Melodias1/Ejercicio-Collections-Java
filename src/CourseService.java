
import java.util.HashMap;
import java.util.List;

public class CourseService
{
    HashMap<String, Student> students = new HashMap<>();

    HashMap<String, Course> courses = new HashMap<>();


    public CourseService()
    {
        students.put( "120120", new Student( "Santiago", "120120" ) );
        students.put( "884545", new Student( "Kate", "884545" ) );
        students.put( "458787", new Student( "Alejandra", "458787" ) );
        students.put( "135464", new Student( "Maria", "135464" ) );
        students.put( "778979", new Student( "Peter", "778979" ) );

        courses.put( "math_01", new Course( "Mathematics 1", "math_01", 8 ) );
        courses.put( "biol_01", new Course( "Biology 1", "biol_01", 8 ) );
        courses.put( "phys_01", new Course( "Physics 1", "phys_01", 8 ) );
        courses.put( "art_01", new Course( "Arts 1", "art_01", 8 ) );
        courses.put( "chem_01", new Course( "Chemistry 1", "chem_01", 8 ) );
        courses.put( "sport_01", new Course( "Sports 1", "sport_01", 8 ) );
    }

    public void enrollStudent(String studentId, String courseId){
        Student student = students.get(studentId);
        Course course = courses.get(courseId);
        
        if(student!=null && course!=null) {
        	student.enroll(course);
        	System.out.println("Alumno Inscrito al curso");
        }else {
        	System.out.println("Alumno o curso incorrecto");
        }
        
    
    	
    }

    public void unEnrollStudent(String studentId, String courseId){
    	Student student = students.get(studentId);
    	Course course = courses.get(courseId);
    	
    	 if(student!=null && course!=null) {
    		 student.unEnroll(course);
         	System.out.println("Alumno desuscrito del curso");
         }else {
         	System.out.println("Alumno o curso incorrecto");
         }
        
    }

    public void displayCourseInformation(String courseId){
        if(courses.get(courseId)!= null) {
        	System.out.println(courses.get(courseId));
        }else {
        	System.out.println("curso no encontrado");
        }
    	
    	
    	
    }

    public void displayStudentInformation(String studentId){
        //TODO implement so it shows the student name, id and list of enrolled courses
    	
    	   if(students.get(studentId)!= null) {
           	System.out.println(students.get(studentId));
           }else {
           	System.out.println("estudiante no encontrado");
           }
    }
    
    public void displayTotalCredits(String studentId) {
    	// calculate the total credits
    	Student student = students.get(studentId);
    	int totalCreditos=0;
    	String cursos ="";
    	if(student!=null) {
    		for(Course course:student.getEnrolledCourses()) {
        		
        		totalCreditos+= course.getCredits();
        		 cursos += course.getName()+" , ";
        		 System.out.println("el total de creditos es: "+totalCreditos);
        	    	System.out.println(cursos);
        	}
    	}else {
    		System.out.println("el estudiante no existe");
    	}
    	
    	
    }


}
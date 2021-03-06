package dk.projectsbygroup7.testproject.dataaccess.resultreaders;

import dk.projectsbygroup7.testproject.pojos.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class StudentResultReader implements IResultReader<Student> {

    @Override
    public Student readResult(ResultSet result) throws SQLException {
        int id = result.getInt("id");
        String name = result.getString("name");
        String email = result.getString("email");
        LocalDate birthday = result.getDate("birthday").toLocalDate();
        return new Student(id, name, birthday, email);
    }
}

package rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionGlobal {
    @ExceptionHandler
    public ResponseEntity<EmployeeWrong> handleException(NoEmployeeException exception) {
        EmployeeWrong employeeWrong = new EmployeeWrong();
        employeeWrong.setInfo(exception.getMessage());
        return new ResponseEntity<>(employeeWrong, HttpStatus.FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeWrong> handleException(Exception exception) {
        EmployeeWrong employeeWrong = new EmployeeWrong();
        employeeWrong.setInfo(exception.getMessage());
        return new ResponseEntity<>(employeeWrong, HttpStatus.BAD_REQUEST);
    }
}

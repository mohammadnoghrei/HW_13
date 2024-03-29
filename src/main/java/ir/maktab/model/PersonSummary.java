package ir.maktab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@AllArgsConstructor
@Setter
@Getter
@ToString
public class PersonSummary {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Date birthDate;

}

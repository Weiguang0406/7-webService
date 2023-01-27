package model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Employee {
private long id;
private String employeeName;
private int age;
}

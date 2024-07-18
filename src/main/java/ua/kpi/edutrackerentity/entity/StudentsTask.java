package ua.kpi.edutrackerentity.entity;

import jakarta.persistence.*;
import lombok.Data;
import ua.kpi.edutrackerentity.entity.enums.StatusStudentsTask;

@Data
@Entity
public class StudentsTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double mark;
    @Column(length = 100)
    private String myWork;
    private StatusStudentsTask status;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Task task;
}
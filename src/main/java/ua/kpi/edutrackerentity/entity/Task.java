package ua.kpi.edutrackerentity.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import ua.kpi.edutrackerentity.entity.enums.StatusTask;

@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String file;
    private StatusTask status;
    @ManyToOne
    @JoinColumn(name="course_id", nullable=false)
    @JsonBackReference
    private Course course;
}
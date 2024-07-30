package ua.kpi.edutrackerentity.entity;

import jakarta.persistence.*;
import lombok.Data;
import ua.kpi.edutrackerentity.entity.enums.StatusLesson;

import java.time.LocalDateTime;

@Data
@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime date;
    private StatusLesson status;
    @ManyToOne
    private Course course;
}
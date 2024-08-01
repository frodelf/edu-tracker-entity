package ua.kpi.edutrackerentity.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import ua.kpi.edutrackerentity.entity.enums.StatusTask;

import java.time.LocalDateTime;

@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String name;
    @Column(length = 100, nullable = false)
    private String file;
    private StatusTask status;
    @JsonFormat(pattern = "yyyy.MM.dd HH:mm")
    private LocalDateTime deadline;
    @ManyToOne
    @JoinColumn(name="course_id", nullable=false)
    @JsonBackReference
    private Course course;
}
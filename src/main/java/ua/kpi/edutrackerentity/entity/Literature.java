package ua.kpi.edutrackerentity.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Literature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String name;
    @Column(length = 100, nullable = false)
    private String link;
    @ManyToOne
    @JoinColumn(name="course_id", nullable=false)
    @JsonBackReference
    private Course course;
}
package ua.kpi.edutrackerentity.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ua.kpi.edutrackerentity.entity.enums.Role;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Manager extends User{
    private Role role;
}
package com.example.springtemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity //indicate that the class is a persistent java class
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="user")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserEntity {
    @Id //primary key
    private UUID id;
}

package com.wellnessaxis.api.entity;

import com.wellnessaxis.api.entity.baseclass.BaseDimensionEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "activities", schema = "dimension")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Activity extends BaseDimensionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
}

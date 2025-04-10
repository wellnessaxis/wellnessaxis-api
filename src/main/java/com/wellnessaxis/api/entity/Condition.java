package com.wellnessaxis.api.entity;

import com.wellnessaxis.api.entity.baseclass.BaseDimensionEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "conditions", schema = "dimension")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Condition extends BaseDimensionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
}

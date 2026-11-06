package ie.atu.sample.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table (name= " booking")
@NoArgsConstructor
    public class Booking {
        @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
        @Getter @Setter
        private Long id;
        private String name;
        private Long count;
        private String status;
    }

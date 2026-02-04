package tur.oxus.bookhub.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

@Builder
@Entity
@Table(name = "loan")  // not mandatory because automatically converted via ImplicitNamingStrategy
public class Loan {
}
